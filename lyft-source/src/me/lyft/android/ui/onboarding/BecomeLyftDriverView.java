// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.AdvancedTextView;
import me.lyft.android.controls.SimpleTextWatcher;
import me.lyft.android.infrastructure.ats.ATSApi;
import me.lyft.android.infrastructure.ats.ATSError;
import me.lyft.android.infrastructure.ats.ATSException;
import me.lyft.android.infrastructure.ats.DriverApplicationDTO;
import me.lyft.android.infrastructure.ats.DriverApplicationDataDTO;
import me.lyft.android.infrastructure.lyft.profile.PhoneDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.NextOrErrorAction0;
import me.lyft.android.rx.SecureObserver;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.DialogResult;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            BecomeDriverHelpToolbarView

public class BecomeLyftDriverView extends LinearLayout
{

    private static final String REASON_INVALID_CODE = "invalidCode";
    ATSApi atsApi;
    View becomeDriverContainer;
    private Binder binder;
    MessageBus bus;
    private boolean dataChanged;
    DialogFlow dialogFlow;
    AdvancedEditText driverReferralCodeTxt;
    TextView errorDetailsTxt;
    Button goToApplicationButton;
    ILyftPreferences lyftPreferences;
    private final Action1 onRegionSelectedDialogResult = new Action1() {

        final BecomeLyftDriverView this$0;

        public volatile void call(Object obj)
        {
            call((DialogResult)obj);
        }

        public void call(DialogResult dialogresult)
        {
            if (dialogresult.getSelectedIndex() >= 0)
            {
                DriverApplicationDataDTO driverapplicationdatadto = userSession.getDriverApplicationData();
                ArrayList arraylist = driverapplicationdatadto.getRegionCodes();
                selectedRegion = (String)arraylist.get(dialogresult.getSelectedIndex());
                regionTxt.setText(driverapplicationdatadto.findRegionLabelByCode(selectedRegion));
                goToApplicationButton.setEnabled(true);
                dataChanged = true;
            }
        }

            
            {
                this$0 = BecomeLyftDriverView.this;
                super();
            }
    };
    IProgressController progressController;
    private SimpleTextWatcher referralCodeTextWatcher;
    AdvancedTextView regionTxt;
    View retryView;
    private String selectedRegion;
    ISignUrlService signUrlService;
    BecomeDriverHelpToolbarView toolbar;
    IUserSession userSession;
    IViewErrorHandler viewErrorHandler;

    public BecomeLyftDriverView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        dataChanged = false;
        Scoop.a(this).b(this);
    }

    private void initData()
    {
        DriverApplicationDTO driverapplicationdto = userSession.getDriverApplication();
        selectedRegion = driverapplicationdto.getRegion();
        if (Strings.isNullOrEmpty(selectedRegion))
        {
            goToApplicationButton.setEnabled(false);
        } else
        {
            regionTxt.setText(userSession.getDriverApplicationData().findRegionLabelByCode(selectedRegion));
            goToApplicationButton.setEnabled(true);
        }
        if (!Strings.isNullOrEmpty(driverapplicationdto.getReferralCode()))
        {
            driverReferralCodeTxt.setText(driverapplicationdto.getReferralCode());
            driverReferralCodeTxt.setEnabled(false);
        } else
        {
            driverReferralCodeTxt.setEnabled(true);
        }
        dataChanged = false;
        becomeDriverContainer.setVisibility(0);
        retryView.setVisibility(8);
    }

    private void loadRegions()
    {
        progressController.showProgress();
        binder.bind(atsApi.getDriverApplicationData(), new AsyncCall() {

            final BecomeLyftDriverView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                becomeDriverContainer.setVisibility(8);
                retryView.setVisibility(0);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((DriverApplicationDataDTO)obj);
            }

            public void onSuccess(DriverApplicationDataDTO driverapplicationdatadto)
            {
                super.onSuccess(driverapplicationdatadto);
                userSession.setDriverApplicationData(driverapplicationdatadto);
                initData();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = BecomeLyftDriverView.this;
                super();
            }
        });
    }

    private void openWebOnboarding()
    {
        progressController.disableUI();
        progressController.showProgress();
        String s = (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/drivers?from_app=1").toString();
        binder.bind(signUrlService.getSignedUrl(s), new AsyncCall() {

            final BecomeLyftDriverView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                handleError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s1)
            {
                super.onSuccess(s1);
                s1 = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                s1.addFlags(0x10000000);
                getContext().startActivity(s1);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
                progressController.enableUI();
            }

            
            {
                this$0 = BecomeLyftDriverView.this;
                super();
            }
        });
    }

    private void showRegionPicker()
    {
        Object obj = userSession.getDriverApplicationData().getRegionLabels();
        obj = (new me.lyft.android.ui.Dialogs.AlertDialog("driver_region_picker_dialog")).setItems(((java.util.List) (obj))).setTitle(getResources().getString(0x7f0702f4)).setDialogEventClass(me/lyft/android/ui/onboarding/BecomeLyftDriverView$RegionSelectedDialogResultEvent);
        dialogFlow.show(((com.lyft.scoop.Screen) (obj)));
    }

    private void submitDriverApplication()
    {
        if (!Strings.isNullOrEmpty(userSession.getDriverApplication().getRegion()) && !dataChanged)
        {
            openWebOnboarding();
            return;
        }
        DriverApplicationDTO driverapplicationdto = new DriverApplicationDTO(userSession.getDriverApplication().getSelf());
        driverapplicationdto.setRegion(selectedRegion);
        PhoneDTO phonedto = (PhoneDTO)Objects.firstNonNull(userSession.getUser().getPhone(), new PhoneDTO(null, null, null));
        if (!Strings.isNullOrEmpty(phonedto.getNumber()) && !((Boolean)Objects.firstNonNull(phonedto.getVerificationNeeded(), Boolean.valueOf(true))).booleanValue())
        {
            driverapplicationdto.setPhone(phonedto.getNumber());
        }
        if (!Strings.isNullOrEmpty(driverReferralCodeTxt.getText().toString()))
        {
            driverapplicationdto.setReferralCode(driverReferralCodeTxt.getText().toString());
        }
        progressController.disableUI();
        progressController.showProgress();
        atsApi.updateDriverApplication(driverapplicationdto).observeOn(AndroidSchedulers.mainThread()).doOnEach(new NextOrErrorAction0() {

            final BecomeLyftDriverView this$0;

            public void call()
            {
                progressController.enableUI();
                progressController.hideProgress();
            }

            
            {
                this$0 = BecomeLyftDriverView.this;
                super();
            }
        }).subscribe(new SecureObserver() {

            final BecomeLyftDriverView this$0;

            public void onSafeError(Throwable throwable)
            {
                super.onSafeError(throwable);
                handleError(throwable);
            }

            public volatile void onSafeNext(Object obj)
            {
                onSafeNext((DriverApplicationDTO)obj);
            }

            public void onSafeNext(DriverApplicationDTO driverapplicationdto1)
            {
                userSession.setDriverApplication(driverapplicationdto1);
                openWebOnboarding();
            }

            
            {
                this$0 = BecomeLyftDriverView.this;
                super();
            }
        });
    }

    public void handleError(Throwable throwable)
    {
        if (throwable instanceof ATSException)
        {
            Object obj = (ATSException)throwable;
            if (((ATSException) (obj)).getStatusCode() == 422 && ((ATSException) (obj)).getATSError().getErrors().size() > 0)
            {
                Object obj1 = (me.lyft.android.infrastructure.ats.ATSError.ValidationError)((ATSException) (obj)).getATSError().getErrors().get(0);
                obj = ((me.lyft.android.infrastructure.ats.ATSError.ValidationError) (obj1)).getField();
                obj1 = ((me.lyft.android.infrastructure.ats.ATSError.ValidationError) (obj1)).getReason();
                if (((String) (obj)).equalsIgnoreCase("referralCode") || ((String) (obj1)).equalsIgnoreCase("invalidCode"))
                {
                    driverReferralCodeTxt.setValidationErrorId(Integer.valueOf(0x7f0701af));
                    return;
                }
            }
        }
        viewErrorHandler.handle(throwable);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        toolbar.showHelpButton(true);
        goToApplicationButton.setEnabled(false);
        regionTxt.setOnClickListener(new android.view.View.OnClickListener() {

            final BecomeLyftDriverView this$0;

            public void onClick(View view)
            {
                showRegionPicker();
            }

            
            {
                this$0 = BecomeLyftDriverView.this;
                super();
            }
        });
        goToApplicationButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BecomeLyftDriverView this$0;

            public void onClick(View view)
            {
                submitDriverApplication();
            }

            
            {
                this$0 = BecomeLyftDriverView.this;
                super();
            }
        });
        driverReferralCodeTxt.setValidationMessageView(errorDetailsTxt);
        toolbar.setTitle(getResources().getString(0x7f07007a, new Object[] {
            Integer.valueOf(1)
        }));
        referralCodeTextWatcher = new SimpleTextWatcher() {

            final BecomeLyftDriverView this$0;

            public void afterTextChanged(Editable editable)
            {
                dataChanged = true;
            }

            
            {
                this$0 = BecomeLyftDriverView.this;
                super();
            }
        };
        driverReferralCodeTxt.addTextChangedListener(referralCodeTextWatcher);
        binder = Binder.attach(this);
        binder.bind(bus.observe(me/lyft/android/ui/onboarding/BecomeLyftDriverView$RegionSelectedDialogResultEvent), onRegionSelectedDialogResult);
        if (userSession.getDriverApplicationData() == null)
        {
            loadRegions();
            return;
        } else
        {
            initData();
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        driverReferralCodeTxt.removeTextChangedListener(referralCodeTextWatcher);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    void retry()
    {
        loadRegions();
    }




/*
    static boolean access$202(BecomeLyftDriverView becomelyftdriverview, boolean flag)
    {
        becomelyftdriverview.dataChanged = flag;
        return flag;
    }

*/





/*
    static String access$502(BecomeLyftDriverView becomelyftdriverview, String s)
    {
        becomelyftdriverview.selectedRegion = s;
        return s;
    }

*/
}
