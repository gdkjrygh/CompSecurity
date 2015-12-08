// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.DriverSignOutConfirmationAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.DriverSignOutFrictionDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class DriverSignOutConfirmationDialogView extends DialogContainerView
{

    ApiFacade apiFacade;
    DialogFlow dialogFlow;
    Button keepDrivingButton;
    TextView messageTextView;
    IProgressController progressController;
    Button signOutButton;
    private long startTimeMillis;
    TextView titleTextView;
    IUserSession userSession;
    IViewErrorHandler viewErrorHandler;

    public DriverSignOutConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private DriverSignOutFrictionDTO getDriverSignOutFriction()
    {
        return (DriverSignOutFrictionDTO)Objects.firstNonNull(userSession.getUser().getDriverSignOutFriction(), DriverSignOutFrictionDTO.empty());
    }

    private void setServerConfiguredStrings()
    {
        Object obj = getDriverSignOutFriction();
        String s = (String)Objects.firstNonNull(((DriverSignOutFrictionDTO) (obj)).getTitleText(), "");
        String s1 = (String)Objects.firstNonNull(((DriverSignOutFrictionDTO) (obj)).getMessageText(), "");
        String s2 = (String)Objects.firstNonNull(((DriverSignOutFrictionDTO) (obj)).getSignOutButtonText(), "");
        obj = (String)Objects.firstNonNull(((DriverSignOutFrictionDTO) (obj)).getKeepDrivingButtonText(), "");
        if (!Strings.isNullOrEmpty(s))
        {
            titleTextView.setText(Html.fromHtml(s));
        }
        if (!Strings.isNullOrEmpty(s1))
        {
            messageTextView.setText(Html.fromHtml(s1));
        }
        if (!Strings.isNullOrEmpty(s2))
        {
            signOutButton.setText(s2);
        }
        if (!Strings.isNullOrEmpty(((String) (obj))))
        {
            keepDrivingButton.setText(((CharSequence) (obj)));
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        DriverSignOutConfirmationAnalytics.shown();
        startTimeMillis = System.currentTimeMillis();
        final Binder binder = Binder.attach(this);
        setServerConfiguredStrings();
        signOutButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverSignOutConfirmationDialogView this$0;
            final Binder val$binder;

            public void onClick(View view)
            {
                DriverSignOutConfirmationAnalytics.signOut(System.currentTimeMillis() - startTimeMillis, getDriverSignOutFriction());
                progressController.disableUI();
                view = DriverSignOutConfirmationAnalytics.createSignOutAnalytics();
                view.trackRequest();
                binder.bind(apiFacade.switchMode(false), view. new AsyncCall() {

                    final _cls1 this$1;
                    final AsyncActionAnalytics val$asyncActionAnalytics;

                    public void onFail(Throwable throwable)
                    {
                        asyncActionAnalytics.trackResponseFailure(throwable);
                        viewErrorHandler.handle(throwable);
                    }

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((AppStateDTO)obj);
                    }

                    public void onSuccess(AppStateDTO appstatedto)
                    {
                        asyncActionAnalytics.trackResponseSuccess();
                        dialogFlow.dismiss();
                    }

                    public void onUnsubscribe()
                    {
                        progressController.enableUI();
                    }

            
            {
                this$1 = final__pcls1;
                asyncActionAnalytics = AsyncActionAnalytics.this;
                super();
            }
                });
            }

            
            {
                this$0 = DriverSignOutConfirmationDialogView.this;
                binder = binder1;
                super();
            }
        });
        keepDrivingButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverSignOutConfirmationDialogView this$0;

            public void onClick(View view)
            {
                DriverSignOutConfirmationAnalytics.keepDriving(System.currentTimeMillis() - startTimeMillis, getDriverSignOutFriction());
                dialogFlow.dismiss();
            }

            
            {
                this$0 = DriverSignOutConfirmationDialogView.this;
                super();
            }
        });
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        DriverSignOutConfirmationAnalytics.dismissed();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }


}
