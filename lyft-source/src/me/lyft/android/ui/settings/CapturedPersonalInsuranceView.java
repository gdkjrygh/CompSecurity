// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.DriverDocumentsAnalytics;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.application.driverdocuments.StatesProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DateUtils;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedTextView;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.driverdocuments.Insurance;
import me.lyft.android.domain.driverdocuments.State;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.utils.WebBrowser;
import rx.functions.Action1;

public class CapturedPersonalInsuranceView extends LinearLayout
{

    public static final DateFormat DATE_UI_FORMAT = DateUtils.createDateFormat("MM/dd/yyyy");
    public static final String INSURANCE_STATE_PICKER_DIALOG = "insurance_state_picker_dialog";
    public static final String UNSAVED_CHANGES_DIALOG = "unsaved_changes_dialog";
    AppFlow appFlow;
    private Binder binder;
    MessageBus bus;
    ICaptureImageSession captureImageSession;
    private final android.widget.CompoundButton.OnCheckedChangeListener checkedChangeListener = new android.widget.CompoundButton.OnCheckedChangeListener() {

        final CapturedPersonalInsuranceView this$0;

        public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            if (flag)
            {
                compoundbutton.setTextColor(getContext().getResources().getColor(0x7f0c0001));
                compoundbutton.setButtonDrawable(0x7f020080);
            }
        }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                super();
            }
    };
    ScrollView containerScrollView;
    DialogFlow dialogFlow;
    IDriverDocumentsProvider driverDocumentsProvider;
    IDriverDocumentsService driverDocumentsService;
    ImageLoader imageLoader;
    AdvancedTextView insuranceExpirationTextView;
    ImageView insurancePhoto;
    View insurancePhotoUploadProgress;
    AdvancedTextView insuranceStateTextView;
    ILyftPreferences lyftPreferences;
    CheckBox matchCarCheckbox;
    CheckBox matchNameCheckbox;
    private Action1 onDateSelectedEvent;
    private Action1 onHomeClicked;
    private Action1 onStateSelected;
    private Action1 onUnsavedChangesResult;
    IProgressController progressController;
    private Date selectedInsuranceExpiration;
    private String selectedInsuranceStateCode;
    StatesProvider statesProvider;
    View submitButton;
    Toolbar toolbar;
    TextView validationErrorTextView;
    IViewErrorHandler viewErrorHandler;

    public CapturedPersonalInsuranceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onStateSelected = new Action1() {

            final CapturedPersonalInsuranceView this$0;

            public volatile void call(Object obj)
            {
                call((DialogResult)obj);
            }

            public void call(DialogResult dialogresult)
            {
                if (dialogresult.getSelectedIndex() >= 0)
                {
                    List list = statesProvider.getStates();
                    String s = ((State)list.get(dialogresult.getSelectedIndex())).getCode();
                    if (!s.equals(selectedInsuranceStateCode))
                    {
                        selectedInsuranceStateCode = s;
                        dialogresult = ((State)list.get(dialogresult.getSelectedIndex())).getLabel();
                        insuranceStateTextView.setText(getResources().getString(0x7f0700a5, new Object[] {
                            dialogresult
                        }));
                    }
                }
                enableUI();
            }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                super();
            }
        };
        onDateSelectedEvent = new Action1() {

            final CapturedPersonalInsuranceView this$0;

            public volatile void call(Object obj)
            {
                call((me.lyft.android.ui.dialogs.DatePickerDialogView.DateSelectedEventArgs)obj);
            }

            public void call(me.lyft.android.ui.dialogs.DatePickerDialogView.DateSelectedEventArgs dateselectedeventargs)
            {
                selectedInsuranceExpiration = DateUtils.createDate(dateselectedeventargs.getYear(), dateselectedeventargs.getMonth(), dateselectedeventargs.getDay());
                dateselectedeventargs = CapturedPersonalInsuranceView.DATE_UI_FORMAT.format(selectedInsuranceExpiration);
                if (!insuranceExpirationTextView.getText().toString().equals(dateselectedeventargs))
                {
                    insuranceExpirationTextView.setText(dateselectedeventargs);
                }
                enableUI();
            }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                super();
            }
        };
        onHomeClicked = new Action1() {

            final CapturedPersonalInsuranceView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                unit = new me.lyft.android.ui.Dialogs.AlertDialog("unsaved_changes_dialog");
                unit.setTitle(getResources().getString(0x7f0702a7)).setMessage(getResources().getString(0x7f0702a6)).setButtonsOrientation(Integer.valueOf(1)).addPositiveButton(getResources().getString(0x7f0703a3), 0x7f030058).addNegativeButton(getResources().getString(0x7f07020f)).setDialogEventClass(me/lyft/android/ui/settings/CapturedPersonalInsuranceView$UnsavedChangesDialogResultEvent);
                dialogFlow.show(unit);
            }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                super();
            }
        };
        onUnsavedChangesResult = new Action1() {

            final CapturedPersonalInsuranceView this$0;

            public volatile void call(Object obj)
            {
                call((DialogResult)obj);
            }

            public void call(DialogResult dialogresult)
            {
                if (dialogresult.getButtonId() == 0x7f0d000b)
                {
                    appFlow.goUp();
                }
            }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private boolean checkValidInput(AsyncActionAnalytics asyncactionanalytics)
    {
        String s;
        String s1;
        boolean flag;
        flag = true;
        s = insuranceExpirationTextView.getText().toString();
        s1 = insuranceStateTextView.getText().toString();
        if ((matchCarCheckbox.isChecked() || matchNameCheckbox.isChecked()) && matchCarCheckbox.isChecked()) goto _L2; else goto _L1
_L1:
        showClickableValidationError();
        matchCarCheckbox.setTextColor(getContext().getResources().getColor(0x7f0c008f));
        CheckBox checkbox = matchNameCheckbox;
        Resources resources = getContext().getResources();
        int i;
        if (matchNameCheckbox.isChecked())
        {
            i = 0x7f0c0001;
        } else
        {
            i = 0x7f0c008f;
        }
        checkbox.setTextColor(resources.getColor(i));
        asyncactionanalytics.trackResponseFailure("Insurance matching car is not selected");
        flag = false;
_L4:
        if (Strings.isNullOrEmpty(s) || Strings.isNullOrEmpty(s1))
        {
            validationErrorTextView.setText(getContext().getString(0x7f070293));
            if (Strings.isNullOrEmpty(s))
            {
                insuranceExpirationTextView.setValidationErrorId(Integer.valueOf(0x7f0702a8));
                insuranceExpirationTextView.setHintTextColor(getContext().getResources().getColor(0x7f0c008f));
            }
            if (Strings.isNullOrEmpty(s1))
            {
                insuranceStateTextView.setValidationErrorId(Integer.valueOf(0x7f0702a8));
                insuranceStateTextView.setHintTextColor(getContext().getResources().getColor(0x7f0c008f));
            }
            validationErrorTextView.setOnClickListener(null);
            validationErrorTextView.setVisibility(0);
            scrollViewDown();
            asyncactionanalytics.trackResponseFailure("Insurance form is incomplete");
            flag = false;
        }
        return flag;
_L2:
        if (!matchNameCheckbox.isChecked())
        {
            matchNameCheckbox.setTextColor(getContext().getResources().getColor(0x7f0c008f));
            showClickableValidationError();
            asyncactionanalytics.trackResponseFailure("Insurance holder name matching is not selected");
            validationErrorTextView.setText(Html.fromHtml(getResources().getString(0x7f070297)));
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void displayPhoto()
    {
        imageLoader.load(captureImageSession.getImage()).skipMemoryCache().centerInside().fit().into(insurancePhoto);
    }

    private void enableUI()
    {
        insurancePhotoUploadProgress.setVisibility(8);
    }

    private void onSubmitClicked()
    {
        final AsyncActionAnalytics trackEvent = DriverDocumentsAnalytics.createInsuranceSubmitEvent();
        trackEvent.trackRequest();
        if (!checkValidInput(trackEvent))
        {
            return;
        } else
        {
            progressController.showProgress();
            Insurance insurance = new Insurance();
            insurance.setExpirationDate(selectedInsuranceExpiration);
            insurance.setState(selectedInsuranceStateCode);
            insurance.setPhotoUploadUrl(driverDocumentsProvider.getInsurance().getPhotoUploadUrl());
            binder.bind(driverDocumentsService.updateInsurance(insurance, captureImageSession.getImage()), new AsyncCall() {

                final CapturedPersonalInsuranceView this$0;
                final AsyncActionAnalytics val$trackEvent;

                public void onFail(Throwable throwable)
                {
                    super.onFail(throwable);
                    trackEvent.trackResponseFailure(throwable);
                    viewErrorHandler.handle(throwable);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((Unit)obj);
                }

                public void onSuccess(Unit unit)
                {
                    super.onSuccess(unit);
                    trackEvent.trackResponseSuccess();
                    appFlow.goUp();
                    dialogFlow.show(new Toast(getResources().getString(0x7f07029c)));
                }

                public void onUnsubscribe()
                {
                    super.onUnsubscribe();
                    progressController.hideProgress();
                }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                trackEvent = asyncactionanalytics;
                super();
            }
            });
            return;
        }
    }

    private void scrollViewDown()
    {
        containerScrollView.post(new Runnable() {

            final CapturedPersonalInsuranceView this$0;

            public void run()
            {
                containerScrollView.fullScroll(130);
            }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                super();
            }
        });
    }

    private void showClickableValidationError()
    {
        validationErrorTextView.setVisibility(0);
        validationErrorTextView.setText(Html.fromHtml(getResources().getString(0x7f070294)));
        validationErrorTextView.setOnClickListener(new android.view.View.OnClickListener() {

            final CapturedPersonalInsuranceView this$0;

            public void onClick(View view)
            {
                WebBrowser.open(getContext(), (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/help/contact/driver/3/0?m=1").toString());
            }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                super();
            }
        });
        scrollViewDown();
    }

    private void showInsuranceExpirationPicker()
    {
        Date date = selectedInsuranceExpiration;
        Object obj = date;
        if (date == null)
        {
            obj = new Date();
        }
        obj = DateUtils.fromDate(((Date) (obj)));
        obj = new me.lyft.android.ui.Dialogs.DatePickerDialog(((Calendar) (obj)).get(1), ((Calendar) (obj)).get(2), ((Calendar) (obj)).get(5));
        ((me.lyft.android.ui.Dialogs.DatePickerDialog) (obj)).setDisablePastDate(true);
        dialogFlow.show(((com.lyft.scoop.Screen) (obj)));
    }

    private void showInsuranceStatePicker()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = new me.lyft.android.ui.Dialogs.AlertDialog("insurance_state_picker_dialog");
        alertdialog.setItems(statesProvider.getStateLabels()).setTitle(getResources().getString(0x7f0700a4)).setDialogEventClass(me/lyft/android/ui/settings/CapturedPersonalInsuranceView$StateSelectedDialogResultEvent);
        dialogFlow.show(alertdialog);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            toolbar.setTitle(getResources().getString(0x7f0702a5));
            insuranceExpirationTextView.setOnClickListener(new android.view.View.OnClickListener() {

                final CapturedPersonalInsuranceView this$0;

                public void onClick(View view)
                {
                    showInsuranceExpirationPicker();
                }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                super();
            }
            });
            insuranceStateTextView.setOnClickListener(new android.view.View.OnClickListener() {

                final CapturedPersonalInsuranceView this$0;

                public void onClick(View view)
                {
                    showInsuranceStatePicker();
                }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                super();
            }
            });
            matchCarCheckbox.setOnCheckedChangeListener(checkedChangeListener);
            matchNameCheckbox.setOnCheckedChangeListener(checkedChangeListener);
            submitButton.setOnClickListener(new android.view.View.OnClickListener() {

                final CapturedPersonalInsuranceView this$0;

                public void onClick(View view)
                {
                    onSubmitClicked();
                }

            
            {
                this$0 = CapturedPersonalInsuranceView.this;
                super();
            }
            });
            binder = Binder.attach(this);
            binder.bind(bus.observe(me/lyft/android/ui/settings/CapturedPersonalInsuranceView$StateSelectedDialogResultEvent), onStateSelected);
            binder.bind(bus.observe(me/lyft/android/ui/dialogs/DatePickerDialogView$DateSelectedEvent), onDateSelectedEvent);
            binder.bind(bus.observe(me/lyft/android/ui/settings/CapturedPersonalInsuranceView$UnsavedChangesDialogResultEvent), onUnsavedChangesResult);
            binder.bind(toolbar.observeHomeClick(), onHomeClicked);
            displayPhoto();
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
            return;
        }
    }







/*
    static String access$302(CapturedPersonalInsuranceView capturedpersonalinsuranceview, String s)
    {
        capturedpersonalinsuranceview.selectedInsuranceStateCode = s;
        return s;
    }

*/




/*
    static Date access$502(CapturedPersonalInsuranceView capturedpersonalinsuranceview, Date date)
    {
        capturedpersonalinsuranceview.selectedInsuranceExpiration = date;
        return date;
    }

*/
}
