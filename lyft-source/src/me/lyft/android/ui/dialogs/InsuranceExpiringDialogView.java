// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.text.DateFormat;
import me.lyft.android.analytics.studies.DriverDocumentsAnalytics;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DateUtils;
import me.lyft.android.domain.driverdocuments.Insurance;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            DialogContainerView

public class InsuranceExpiringDialogView extends DialogContainerView
{

    ApiFacade apiFacade;
    AppFlow appFlow;
    private Binder binder;
    IDriverDocumentsProvider driverDocumentsProvider;
    TextView messageTextView;
    Button notNowButton;
    private final me.lyft.android.ui.Dialogs.InsuranceExpiringDialog params;
    IProgressController progressController;
    TextView titleTextView;
    Button updateInsuranceButton;
    IViewErrorHandler viewErrorHandler;

    public InsuranceExpiringDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (me.lyft.android.ui.Dialogs.InsuranceExpiringDialog)context.a();
    }

    private void initTitleAndMessage()
    {
        Insurance insurance = driverDocumentsProvider.getInsurance();
        if (insurance.getExpirationDate() == null)
        {
            throw new IllegalArgumentException("Date should be provided for expiration dialog");
        }
        if (!insurance.isApprovedButExpiringSoon())
        {
            DateFormat dateformat = DateUtils.createDateFormat("MM/dd/yy");
            titleTextView.setText(getResources().getString(0x7f07028f));
            messageTextView.setText(getResources().getString(0x7f07028e, new Object[] {
                dateformat.format(insurance.getExpirationDate())
            }));
        }
    }

    private void switchToDriverModeIfPossible()
    {
        Insurance insurance;
        if (params.getAttemptEnterDriverMode())
        {
            if ((insurance = driverDocumentsProvider.getInsurance()).getExpirationDate() != null && insurance.isApprovedButExpiringSoon())
            {
                binder.bind(apiFacade.switchMode(true), new AsyncCall() {

                    final InsuranceExpiringDialogView this$0;

                    public void onFail(Throwable throwable)
                    {
                        super.onFail(throwable);
                        viewErrorHandler.handle(throwable);
                    }

                    public void onUnsubscribe()
                    {
                        super.onUnsubscribe();
                        progressController.enableUI();
                    }

            
            {
                this$0 = InsuranceExpiringDialogView.this;
                super();
            }
                });
                return;
            }
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        updateInsuranceButton.setOnClickListener(new android.view.View.OnClickListener() {

            final InsuranceExpiringDialogView this$0;

            public void onClick(View view)
            {
                DriverDocumentsAnalytics.driverInsuranceDialogUpdate();
                appFlow.goTo(new me.lyft.android.ui.settings.SettingsScreens.PersonalInsuranceScreen());
            }

            
            {
                this$0 = InsuranceExpiringDialogView.this;
                super();
            }
        });
        notNowButton.setOnClickListener(new android.view.View.OnClickListener() {

            final InsuranceExpiringDialogView this$0;

            public void onClick(View view)
            {
                DriverDocumentsAnalytics.driverInsuranceDialogNotNow();
                switchToDriverModeIfPossible();
            }

            
            {
                this$0 = InsuranceExpiringDialogView.this;
                super();
            }
        });
        initTitleAndMessage();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

}
