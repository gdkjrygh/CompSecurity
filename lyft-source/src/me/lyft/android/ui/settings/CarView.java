// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.IVehicleProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.driver.Vehicle;
import me.lyft.android.domain.driverdocuments.Inspection;
import me.lyft.android.domain.driverdocuments.Insurance;
import me.lyft.android.domain.driverdocuments.Registration;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.utils.WebBrowser;

public class CarView extends ScrollView
{

    AppFlow appFlow;
    private Binder binder;
    IConstantsProvider constantsProvider;
    IDriverDocumentsProvider driverDocumentsProvider;
    IDriverDocumentsService driverDocumentsService;
    ImageLoader imageLoader;
    TextView licensePlateText;
    View personalInsuranceLayout;
    TextView personalInsuranceStatusText;
    ImageView photoImageView;
    IProgressController progressController;
    Toolbar toolbar;
    Button vehicleInspectionButton;
    IVehicleProvider vehicleProvider;
    Button vehicleRegistrationButton;
    TextView vehicleText;

    public CarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void forceInsuranceRefresh()
    {
        progressController.showProgress();
        binder.bind(driverDocumentsService.forceRefresh(), new AsyncCall() {

            final CarView this$0;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                initInsuranceStatus();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = CarView.this;
                super();
            }
        });
    }

    private String getLicensePlateStr(Vehicle vehicle)
    {
        String s1 = vehicle.getLicensePlate();
        String s = s1;
        if (!Strings.isNullOrEmpty(vehicle.getState()))
        {
            s = (new StringBuilder()).append(s1).append(" (").append(vehicle.getState()).append(")").toString();
        }
        return s;
    }

    private String getVehicleStr(Vehicle vehicle)
    {
        return Strings.joinWithDelimiter(" ", new String[] {
            vehicle.getColor(), vehicle.getYearFormatted(), vehicle.getMake(), vehicle.getModel()
        });
    }

    private void initData()
    {
        boolean flag1 = true;
        boolean flag = false;
        Object obj = vehicleProvider.getVehicle();
        imageLoader.load(((Vehicle) (obj)).getPhoto()).centerCrop().fit().placeholder(0x7f020206).into(photoImageView);
        String s = getVehicleStr(((Vehicle) (obj)));
        vehicleText.setText(s);
        obj = getLicensePlateStr(((Vehicle) (obj)));
        licensePlateText.setText(((CharSequence) (obj)));
        vehicleInspectionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CarView this$0;

            public void onClick(View view)
            {
                appFlow.goTo(new SettingsScreens.VehicleInspectionScreen());
            }

            
            {
                this$0 = CarView.this;
                super();
            }
        });
        vehicleRegistrationButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CarView this$0;

            public void onClick(View view)
            {
                appFlow.goTo(new SettingsScreens.VehicleRegistrationScreen());
            }

            
            {
                this$0 = CarView.this;
                super();
            }
        });
        if (!driverDocumentsService.isDriverDocumentsEnabled())
        {
            personalInsuranceLayout.setVisibility(8);
            vehicleRegistrationButton.setVisibility(8);
            vehicleInspectionButton.setVisibility(8);
        } else
        {
            Button button;
            int i;
            if (!driverDocumentsProvider.getRegistration().isNull())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            button = vehicleRegistrationButton;
            if (i != 0)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            button.setVisibility(i);
            if (!driverDocumentsProvider.getInspection().isNull())
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 0;
            }
            button = vehicleInspectionButton;
            if (i != 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            button.setVisibility(i);
        }
        initInsuranceStatus();
    }

    private void initInsuranceStatus()
    {
        Insurance insurance = driverDocumentsProvider.getInsurance();
        personalInsuranceStatusText.setVisibility(0);
        if (insurance.isNull() || insurance.isApproved())
        {
            personalInsuranceStatusText.setVisibility(8);
        } else
        {
            if (insurance.isExpired())
            {
                personalInsuranceStatusText.setText(getResources().getString(0x7f0702a2));
                return;
            }
            if (insurance.isRejected())
            {
                personalInsuranceStatusText.setText(getResources().getString(0x7f0702a4));
                return;
            }
            if (insurance.isPending())
            {
                personalInsuranceStatusText.setText(getResources().getString(0x7f0702a3));
                return;
            }
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            initData();
            forceInsuranceRefresh();
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            toolbar.setTitle(getContext().getString(0x7f07008c));
            return;
        }
    }

    public void onLyftInsuranceClicked()
    {
        WebBrowser.open(getContext(), constantsProvider.getConstants().getInsuranceHelpCenterUrl());
    }

    public void onPersonalInsuranceClicked()
    {
        appFlow.goTo(new SettingsScreens.PersonalInsuranceScreen());
    }

}
