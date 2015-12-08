// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.app.Navigation;
import com.skype.android.app.ProgressSpinnerDialogFragment;
import com.skype.android.app.shortcircuit.ProfileServiceTokenRequest;
import com.skype.android.app.token.TokenRequestCallback;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvBaseFragment, MnvManager, MnvStateData, MnvCases

public abstract class MnvRequestFragment extends MnvBaseFragment
    implements TokenRequestCallback
{

    private static final Logger log = Logger.getLogger("MnvRequestFragment");
    private Runnable currentTimeoutRunnable;
    private Handler handler;
    InputMethodManager ime;
    MnvCases mnvCases;
    MnvManager mnvManager;
    private Runnable nextRequestStep;
    ProfileServiceTokenRequest profileServiceTokenRequest;

    public MnvRequestFragment()
    {
    }

    private void executeNextStep()
    {
        nextRequestStep.run();
        nextRequestStep = null;
    }

    private ProgressSpinnerDialogFragment getExistingSpinner(l l1)
    {
        return (ProgressSpinnerDialogFragment)l1.a("skypeDialog");
    }

    private boolean hasPendingFlowSteps()
    {
        return nextRequestStep != null;
    }

    private void processStates(MnvManager.a a)
    {
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$android$app$mnv$MnvManager$OnMnvStateDataChange$Type[];
            static final int $SwitchMap$com$skype$android$app$mnv$MnvManager$States[];

            static 
            {
                $SwitchMap$com$skype$android$app$mnv$MnvManager$OnMnvStateDataChange$Type = new int[MnvManager.a.a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$OnMnvStateDataChange$Type[MnvManager.a.a.SUCCESS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$OnMnvStateDataChange$Type[MnvManager.a.a.FAILURE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$OnMnvStateDataChange$Type[MnvManager.a.a.ASYNC.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                $SwitchMap$com$skype$android$app$mnv$MnvManager$States = new int[MnvManager.States.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.QOS_ALERT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.SKIPPED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.COMPLETED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.VERIFIED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ERRORS_RETRY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[MnvManager.States.ERRORS_UNABLE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.skype.android.app.mnv.MnvManager.OnMnvStateDataChange.Type[a.getType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            processSuccess(a.getStateData());
            return;

        case 2: // '\002'
            processFailure(a.getStateData());
            return;

        case 3: // '\003'
            processAsyncError(a.getStateData());
            break;
        }
    }

    private void setNextRequestStep(Runnable runnable)
    {
        nextRequestStep = runnable;
    }

    private void startTimer(long l1, Runnable runnable)
    {
        if (currentTimeoutRunnable != null)
        {
            handler.removeCallbacks(currentTimeoutRunnable);
        }
        handler.postDelayed(runnable, l1);
        currentTimeoutRunnable = runnable;
    }

    private void stopTimer()
    {
        handler.removeCallbacks(currentTimeoutRunnable);
        currentTimeoutRunnable = null;
    }

    protected void dismissProgressSpinner()
    {
        android.support.v4.app.Fragment fragment = getFragmentManager().a("skypeDialog");
        if (fragment != null)
        {
            ((ProgressSpinnerDialogFragment)fragment).stopAnimation();
            stopTimer();
            SkypeDialogFragment.dismiss(getFragmentManager());
        }
    }

    protected void displayError()
    {
        stopTimer();
        navigation.toMnvError(getReferrer());
        getActivity().finish();
    }

    protected void handleVerifiedNumber()
    {
        stopTimer();
        mnvManager.onComplete();
        navigation.toMnvVerified(getReferrer());
        getActivity().finish();
    }

    protected void hideSoftKeyboard(EditText edittext)
    {
        ime.hideSoftInputFromWindow(edittext.getWindowToken(), 0);
    }

    protected void navigateToHome()
    {
        stopTimer();
        super.navigateToHome();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        log.info("Requesting ProfileService Token");
        profileServiceTokenRequest.requestToken(this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setRetainInstance(true);
        handler = new Handler();
    }

    public void onEvent(final MnvManager.a stateDataChange)
    {
        setNextRequestStep(new Runnable() {

            final MnvRequestFragment this$0;
            final MnvManager.a val$stateDataChange;

            public final void run()
            {
                processStates(stateDataChange);
            }

            
            {
                this$0 = MnvRequestFragment.this;
                stateDataChange = a;
                super();
            }
        });
        if (isResumed())
        {
            executeNextStep();
        }
    }

    protected void onRequestTimeOut()
    {
        mnvManager.onTimeout();
    }

    public void onResume()
    {
        super.onResume();
        if (hasPendingFlowSteps())
        {
            executeNextStep();
        }
    }

    public void onTokenRetrieved(com.skype.android.app.token.AbstractTokenRequest.TokenAccount tokenaccount, String s)
    {
        log.info("Receiving ProfileService Token");
        mnvManager.setToken(ProfileServiceTokenRequest.getProfileServiceToken(tokenaccount, s));
    }

    protected void processAsyncError(MnvStateData mnvstatedata)
    {
        displayError();
    }

    protected void processFailure(MnvStateData mnvstatedata)
    {
        MnvManager.States states = mnvstatedata.getNextState();
        log.info((new StringBuilder("MNV processFailure current state: ")).append(mnvstatedata.getCurrentState().name()).toString());
        log.info((new StringBuilder("MNV processFailure next state: ")).append(states).toString());
        switch (_cls2..SwitchMap.com.skype.android.app.mnv.MnvManager.States[states.ordinal()])
        {
        default:
            return;

        case 3: // '\003'
            throw new RuntimeException("Reported failure on successfully completed flow");

        case 4: // '\004'
            handleVerifiedNumber();
            return;

        case 5: // '\005'
        case 6: // '\006'
            displayError();
            break;
        }
    }

    protected void processSuccess(MnvStateData mnvstatedata)
    {
        MnvManager.States states = mnvstatedata.getNextState();
        log.info((new StringBuilder("MNV processSuccess current state: ")).append(mnvstatedata.getCurrentState().name()).toString());
        log.info((new StringBuilder("MNV processSuccess next state: ")).append(states).toString());
        switch (_cls2..SwitchMap.com.skype.android.app.mnv.MnvManager.States[states.ordinal()])
        {
        default:
            log.severe((new StringBuilder("MNV default success state: ")).append(states.name()).toString());
            navigateToHome();
            return;

        case 1: // '\001'
            displayError();
            return;

        case 2: // '\002'
        case 3: // '\003'
            navigateToHome();
            return;

        case 4: // '\004'
            handleVerifiedNumber();
            break;
        }
    }

    protected void showProgressSpinner(long l1, String s, Runnable runnable)
    {
        l l2 = getFragmentManager();
        ProgressSpinnerDialogFragment progressspinnerdialogfragment = getExistingSpinner(l2);
        if (progressspinnerdialogfragment == null)
        {
            s = ProgressSpinnerDialogFragment.create(0x7f0300eb, mnvCases.deviceCanShowSpinner(), new String[] {
                s
            });
            s.setCancelable(false);
            s.show(l2);
        } else
        {
            progressspinnerdialogfragment.updateMessage(s);
        }
        startTimer(l1, runnable);
    }


}
