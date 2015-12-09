// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.kyc.api.KycClient;
import com.google.android.apps.wallet.kyc.api.KycStatusPublisher;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Strings;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycFragmentInterface, KycUiModel, KycUserEvent, KycNavListener, 
//            KycOowDisplay

public class KycOowFragment extends WalletFragment
    implements KycFragmentInterface
{

    boolean answerSubmitted;
    KycOowDisplay display;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private final Handler handler = new Handler();
    KycClient kycClient;
    KycStatusPublisher kycStatusPublisher;
    private KycUiModel model;
    private KycNavListener navListener;
    NetworkAccessChecker networkAccessChecker;
    boolean sessionTimedOut;
    UserEventLogger userEventLogger;

    public KycOowFragment()
    {
        setArguments(new Bundle());
        answerSubmitted = false;
        sessionTimedOut = false;
    }

    private Callable createSubmitAnswersAction()
    {
        return new Callable() {

            final KycOowFragment this$0;

            private com.google.wallet.proto.api.NanoWalletKyc.SubmitAnswersResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletKyc.SubmitAnswersRequest submitanswersrequest = new com.google.wallet.proto.api.NanoWalletKyc.SubmitAnswersRequest();
                submitanswersrequest.referralAnswer = (com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer[])model.getReferralAnswers().toArray(submitanswersrequest.referralAnswer);
                return kycClient.submitAnswers(submitanswersrequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = KycOowFragment.this;
                super();
            }
        };
    }

    private void handleSubmitAnswersSuccess(com.google.wallet.proto.api.NanoWalletKyc.SubmitAnswersResponse submitanswersresponse)
    {
        fullScreenProgressSpinnerManager.hide();
        if (submitanswersresponse.callError != null)
        {
            CallErrorDialogs.createBuilderWithGenericTitle(submitanswersresponse.callError, com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again).build().show(getActivity().getSupportFragmentManager());
            return;
        }
        int i = KycClient.getKycStatus(submitanswersresponse.kycStatus);
        kycStatusPublisher.setKycStatus(i);
        analyticsUtil.endTiming(null, "user_kyc_oow");
        switch (i)
        {
        default:
            AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again)).build().show(getActivity().getSupportFragmentManager());
            return;

        case 1: // '\001'
            submitanswersresponse = model.getKycUserEvent();
            analyticsUtil.sendKycState("KycOowSuccess", new AnalyticsCustomDimension[0]);
            userEventLogger.log(submitanswersresponse.getUserEventContextType(), submitanswersresponse.getSuccessOowUserEventType());
            navListener.onRequestNav(KycNavListener.NavState.PASSED);
            return;

        case 2: // '\002'
            navListener.onRequestNav(KycNavListener.NavState.REFERRED);
            return;

        case 3: // '\003'
            navListener.onRequestNav(KycNavListener.NavState.FAILED);
            break;
        }
    }

    private void postSelectAnswerMessage(final int selectedIndex)
    {
        handler.post(new Runnable() {

            final KycOowFragment this$0;
            final int val$selectedIndex;

            public final void run()
            {
                display.setSelectedAnswerIndex(selectedIndex);
            }

            
            {
                this$0 = KycOowFragment.this;
                selectedIndex = i;
                super();
            }
        });
    }

    private void render()
    {
        renderTimeRemaining();
        renderQuestion();
    }

    private void renderQuestion()
    {
        Object obj;
        display.setQuestionProgress(getString(com.google.android.apps.walletnfcrel.R.string.kyc_oow_question_progress, new Object[] {
            Integer.valueOf(model.getCurrentQuestionIndex() + 1), Integer.valueOf(model.getReferralQuestions().size())
        }));
        display.setQuestion(model.getCurrentQuestion());
        obj = model.getCurrentAnswer();
        if (obj == null || Strings.isNullOrEmpty(((com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer) (obj)).answer)) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        obj = ((com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer) (obj)).answer;
        as = model.getCurrentQuestion().possibleAnswer;
        i = 0;
_L7:
        if (i >= as.length) goto _L2; else goto _L3
_L3:
        if (!((String) (obj)).equals(as[i])) goto _L5; else goto _L4
_L4:
        postSelectAnswerMessage(i);
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (super.onActionFailure(s, callable, exception))
        {
            return true;
        } else
        {
            fullScreenProgressSpinnerManager.hide();
            AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again)).build().show(getActivity().getSupportFragmentManager());
            return true;
        }
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        handleSubmitAnswersSuccess((com.google.wallet.proto.api.NanoWalletKyc.SubmitAnswersResponse)obj);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        display.createView(layoutinflater, viewgroup);
        display.setOnAnswerSelectedListener(new OnActionListener() {

            final KycOowFragment this$0;

            private void onAction(Integer integer)
            {
                com.google.wallet.proto.features.NanoWalletKyc.ReferralQuestion referralquestion = model.getCurrentQuestion();
                com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer referralanswer = new com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer();
                referralanswer.questionId = referralquestion.questionId;
                referralanswer.answer = referralquestion.possibleAnswer[integer.intValue()];
                model.setReferralAnswer(model.getCurrentQuestionIndex(), referralanswer);
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Integer)obj);
            }

            
            {
                this$0 = KycOowFragment.this;
                super();
            }
        });
        display.setNextButtonOnActionListener(new OnActionListener() {

            final KycOowFragment this$0;

            private void onAction(Void void1)
            {
                if (!sessionTimedOut)
                {
                    if (display.getSelectedIndex() < 0)
                    {
                        AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_please_select_an_answer)).build().show(getActivity().getSupportFragmentManager());
                        return;
                    }
                    if (model.getCurrentQuestionIndex() < model.getReferralQuestions().size() - 1)
                    {
                        model.setCurrentQuestionIndex(model.getCurrentQuestionIndex() + 1);
                        renderQuestion();
                        return;
                    }
                    if (networkAccessChecker.check())
                    {
                        analyticsUtil.startTiming(null, "user_kyc_oow");
                        answerSubmitted = true;
                        fullScreenProgressSpinnerManager.showImmediately();
                        executeAction("submit_oow_answer", createSubmitAnswersAction());
                        return;
                    }
                }
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = KycOowFragment.this;
                super();
            }
        });
        render();
        return display.getView();
    }

    public final void onResume()
    {
        super.onResume();
        if (isActionRunning("submit_oow_answer"))
        {
            fullScreenProgressSpinnerManager.showImmediately();
        }
    }

    final void renderTimeRemaining()
    {
        if (isAdded())
        {
            long l = model.getOowQuizDurationAllowedMillis() - (SystemClock.elapsedRealtime() - model.getOowQuizStartTimeMillis());
            long l1 = l / TimeUnit.SECONDS.toMillis(1L);
            display.setTimeRemaining(getString(com.google.android.apps.walletnfcrel.R.string.kyc_oow_time_remaining, new Object[] {
                Long.valueOf(l1 / 60L), String.format("%02d", new Object[] {
                    Long.valueOf(l1 % 60L)
                })
            }));
            if (!answerSubmitted)
            {
                if (l <= 0L)
                {
                    sessionTimedOut = true;
                    navListener.onRequestNav(KycNavListener.NavState.REFERRED);
                    return;
                } else
                {
                    handler.postDelayed(new Runnable() {

                        final KycOowFragment this$0;

                        public final void run()
                        {
                            renderTimeRemaining();
                        }

            
            {
                this$0 = KycOowFragment.this;
                super();
            }
                    }, TimeUnit.SECONDS.toMillis(1L));
                    return;
                }
            }
        }
    }

    public final void setKycNavListener(KycNavListener kycnavlistener)
    {
        navListener = kycnavlistener;
    }

    public final void setKycUiModel(KycUiModel kycuimodel)
    {
        model = kycuimodel;
    }



}
