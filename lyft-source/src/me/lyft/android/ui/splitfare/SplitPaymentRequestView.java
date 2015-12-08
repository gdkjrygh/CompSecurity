// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.analytics.studies.SplitFareAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.splitfare.SplitFareRequest;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import me.lyft.android.infrastructure.splitfare.ISplitFareService;
import me.lyft.android.infrastructure.splitfare.SplitFareServiceException;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;
import rx.functions.Action0;

public class SplitPaymentRequestView extends LinearLayout
    implements IHandleBack
{

    AppFlow appFlow;
    Binder binder;
    IChargeAccountsProvider chargeAccountsProvider;
    IConstantsProvider constantsProvider;
    DialogFlow dialogFlow;
    ImageLoader imageLoader;
    IProgressController progressController;
    final SplitFareRequest splitFareRequest;
    ISplitFareRequestRepository splitFareRequestRepository;
    ISplitFareService splitFareService;
    TextView splitPaymentFee;
    TextView splitPaymentLabel;
    ImageView userImage;
    IViewErrorHandler viewErrorHandler;

    public SplitPaymentRequestView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
        splitFareRequest = splitFareRequestRepository.getPendingSplitFareRequest();
    }

    private void respondSplitFareRequest(String s, boolean flag, final Action0 successAction)
    {
        progressController.disableUI();
        binder.bind(splitFareService.acceptDeclineRequest(s, flag), new AsyncCall() {

            final SplitPaymentRequestView this$0;
            final Action0 val$successAction;

            public void onFail(Throwable throwable)
            {
                viewErrorHandler.handle(throwable);
                if ((throwable instanceof SplitFareServiceException) && "splitfare_request_lapsed".equals(((SplitFareServiceException)throwable).getReason()))
                {
                    appFlow.goBack();
                    showInactiveSplitDialog();
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                successAction.call();
            }

            public void onUnsubscribe()
            {
                progressController.enableUI();
            }

            
            {
                this$0 = SplitPaymentRequestView.this;
                successAction = action0;
                super();
            }
        });
    }

    void onAcceptClicked()
    {
        if (!chargeAccountsProvider.hasValidChargeAccount())
        {
            SplitFareAnalytics.trackSplitResponseNoValidChargeAccount();
            appFlow.goTo(new SplitScreens.SplitPaymentAddChargeAccountScreen());
            return;
        } else
        {
            respondSplitFareRequest(splitFareRequest.getId(), true, new Action0() {

                final SplitPaymentRequestView this$0;

                public void call()
                {
                    dialogFlow.show(new SplitFareDialogs.AcceptedDialogAnimationDialog());
                }

            
            {
                this$0 = SplitPaymentRequestView.this;
                super();
            }
            });
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        if (dialogFlow.hasActiveDialog())
        {
            dialogFlow.dismiss();
        }
    }

    public boolean onBack()
    {
        return true;
    }

    void onDeclineClicked()
    {
        respondSplitFareRequest(splitFareRequest.getId(), false, new Action0() {

            final SplitPaymentRequestView this$0;

            public void call()
            {
                dialogFlow.show(new Toast(getResources().getString(0x7f07034c)));
                appFlow.goBack();
            }

            
            {
                this$0 = SplitPaymentRequestView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        splitPaymentLabel.setText(getResources().getString(0x7f07034d, new Object[] {
            splitFareRequest.getInitiatorName()
        }));
        splitPaymentFee.setText((CharSequence)Objects.firstNonNull(constantsProvider.getConstants().getSplitPaymentsFeeText(), getResources().getString(0x7f070108)));
        imageLoader.load(splitFareRequest.getInitiatorPhoto()).fit().centerCrop().placeholder(0x7f0201fc).error(0x7f0201fc).into(userImage);
    }

    public void showInactiveSplitDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("cannot_split_after_ride_dialog")).addPositiveButton(getResources().getString(0x7f070212)).setMessage(getResources().getString(0x7f0701a0)).setTitle(getResources().getString(0x7f0701a1)).setTitleColorResource(0x7f0c0025);
        dialogFlow.show(alertdialog);
    }
}
