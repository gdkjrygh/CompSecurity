// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.DriverDocumentsAnalytics;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.driverdocuments.Inspection;
import me.lyft.android.domain.driverdocuments.Insurance;
import me.lyft.android.domain.driverdocuments.Registration;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.camera.CaptureResultView;
import me.lyft.android.ui.dialogs.Toast;

public class CapturedCarDocumentPreView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    ICaptureImageSession captureImageSession;
    CaptureResultView captureResultView;
    DialogFlow dialogFlow;
    IDriverDocumentsProvider driverDocumentsProvider;
    IDriverDocumentsService driverDocumentsService;
    private SettingsScreens.CapturedCarDocumentScreen params;
    IProgressController progressController;
    IViewErrorHandler viewErrorHandler;

    public CapturedCarDocumentPreView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (SettingsScreens.CapturedCarDocumentScreen)context.a();
    }

    private void uploadInspectionPhoto()
    {
        final AsyncActionAnalytics analytics = DriverDocumentsAnalytics.createInspectionSubmitEvent();
        analytics.trackRequest();
        progressController.showProgress();
        Inspection inspection = new Inspection(null, driverDocumentsProvider.getInspection().getPhotoUploadUrl());
        binder.bind(driverDocumentsService.updateInspection(inspection, captureImageSession.getImage()), new AsyncCall() {

            final CapturedCarDocumentPreView this$0;
            final AsyncActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analytics.trackResponseFailure(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                analytics.trackResponseSuccess();
                appFlow.resetTo(new SettingsScreens.VehicleInspectionScreen());
                dialogFlow.show(new Toast(getResources().getString(0x7f07029c)));
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = CapturedCarDocumentPreView.this;
                analytics = asyncactionanalytics;
                super();
            }
        });
    }

    private void uploadRegistrationPhoto()
    {
        final AsyncActionAnalytics analytics = DriverDocumentsAnalytics.createRegistrationSubmitEvent();
        analytics.trackRequest();
        progressController.showProgress();
        Registration registration = new Registration(null, driverDocumentsProvider.getInsurance().getPhotoUploadUrl());
        binder.bind(driverDocumentsService.updateRegistration(registration, captureImageSession.getImage()), new AsyncCall() {

            final CapturedCarDocumentPreView this$0;
            final AsyncActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analytics.trackResponseFailure(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                analytics.trackResponseSuccess();
                appFlow.resetTo(new SettingsScreens.VehicleRegistrationScreen());
                dialogFlow.show(new Toast(getResources().getString(0x7f07029c)));
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = CapturedCarDocumentPreView.this;
                analytics = asyncactionanalytics;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        binder = Binder.attach(this);
        captureResultView.setOnSaveListener(new me.lyft.android.ui.camera.CaptureResultView.OnSaveListener() {

            final CapturedCarDocumentPreView this$0;

            public void onSave()
            {
                class _cls4
                {

                    static final int $SwitchMap$me$lyft$android$ui$settings$SettingsScreens$CapturedCarDocumentScreen$DocumentType[];

                    static 
                    {
                        $SwitchMap$me$lyft$android$ui$settings$SettingsScreens$CapturedCarDocumentScreen$DocumentType = new int[SettingsScreens.CapturedCarDocumentScreen.DocumentType.values().length];
                        try
                        {
                            $SwitchMap$me$lyft$android$ui$settings$SettingsScreens$CapturedCarDocumentScreen$DocumentType[SettingsScreens.CapturedCarDocumentScreen.DocumentType.VEHICLE_INSPECTION.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$me$lyft$android$ui$settings$SettingsScreens$CapturedCarDocumentScreen$DocumentType[SettingsScreens.CapturedCarDocumentScreen.DocumentType.VEHICLE_REGISTRATION.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls4..SwitchMap.me.lyft.android.ui.settings.SettingsScreens.CapturedCarDocumentScreen.DocumentType[params.getDocumentType().ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    uploadInspectionPhoto();
                    return;

                case 2: // '\002'
                    uploadRegistrationPhoto();
                    break;
                }
            }

            
            {
                this$0 = CapturedCarDocumentPreView.this;
                super();
            }
        });
    }



}
