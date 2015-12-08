// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.WorkPerksAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.LowerCaseTextWatcher;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.utils.Keyboard;
import rx.functions.Action1;

public class WorkPerksEditEmailView extends LinearLayout
{

    public static final String EMAIL_FIELD = "email";
    public static final String REASON_DUPLICATE_ACCOUNT = "duplicateAccount";
    public static final String REASON_GENERAL = "general";
    public static final String REASON_INVALID_EMAIL = "emailInvalid";
    public static final String REASON_INVALID_FORMAT = "invalidFormat";
    public static final String REASON_UNKNOWN = "unknown";
    AppFlow appFlow;
    Binder binder;
    AdvancedEditText emailEditText;
    TextView inlineErrorTxt;
    ILyftApi lyftApi;
    private Action1 onToolbarItemClicked;
    private final EnterpriseScreens.WorkPerksEditEmailScreen params;
    IProgressController progressController;
    private TextWatcher textChangedListener;
    Toolbar toolbar;
    IViewErrorHandler viewErrorHandler;
    private String workPerksEmail;

    public WorkPerksEditEmailView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onToolbarItemClicked = new Action1() {

            final WorkPerksEditEmailView this$0;

            public void call(Integer integer)
            {
                if (integer.intValue() == 0x7f0d0017)
                {
                    verifyEmail();
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = WorkPerksEditEmailView.this;
                super();
            }
        };
        textChangedListener = new TextWatcher() {

            final WorkPerksEditEmailView this$0;

            public void afterTextChanged(Editable editable)
            {
                setToolbarItem();
                if (emailEditText.getEditableText().toString().equals(workPerksEmail))
                {
                    enableToolbarItem(Boolean.valueOf(false));
                    handleEmailError(getResources().getString(0x7f07039c));
                }
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                setToolbarItem();
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                inlineErrorTxt.setVisibility(8);
                emailEditText.setTextAppearance(getContext(), 0x7f09008b);
                emailEditText.setCompoundDrawablesWithIntrinsicBounds(0x7f020150, 0, 0, 0);
                emailEditText.setBackgroundResource(0x7f0201d8);
                setToolbarItem();
            }

            
            {
                this$0 = WorkPerksEditEmailView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        params = (EnterpriseScreens.WorkPerksEditEmailScreen)context.a();
    }

    private void enableToolbarItem(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            toolbar.clearItems().addItem(0x7f0d0017, getResources().getString(0x7f070321), 0x7f020102).enableItem(0x7f0d0017);
            ((TextView)ButterKnife.a(toolbar.getToolbarItemView(0x7f0d0017), 0x7f0d0061)).setTypeface(null, 1);
            return;
        } else
        {
            toolbar.clearItems().addItem(0x7f0d0017, getResources().getString(0x7f070321), 0x7f020103).disableItem(0x7f0d0017);
            return;
        }
    }

    private void setToolbarItem()
    {
        if (Strings.isNullOrEmpty(emailEditText.getEditableText().toString()))
        {
            enableToolbarItem(Boolean.valueOf(false));
            return;
        } else
        {
            enableToolbarItem(Boolean.valueOf(true));
            return;
        }
    }

    private void verifyEmail()
    {
        boolean flag1 = emailEditText.getEditableText().toString().contains("@");
        final AsyncActionAnalytics analytics;
        boolean flag;
        if (emailEditText.getEditableText().toString().split("@").length > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        analytics = WorkPerksAnalytics.trackEditEmailAttempt();
        if (!Boolean.valueOf(flag1).booleanValue() || !Boolean.valueOf(flag).booleanValue() || !emailEditText.getEditableText().toString().split("@")[1].contains("."))
        {
            analytics.trackResponseFailure("Client detected Invalid email format");
            handleEmailError(getResources().getString(0x7f07039b));
            return;
        } else
        {
            progressController.disableUI();
            progressController.showProgress();
            binder.bind(lyftApi.createUserOrganization(emailEditText.getEditableText().toString()), new AsyncCall() {

                final WorkPerksEditEmailView this$0;
                final AsyncActionAnalytics val$analytics;

                public void onFail(Throwable throwable)
                {
                    if (throwable instanceof LyftApiException)
                    {
                        Object obj = (LyftApiException)throwable;
                        if (((LyftApiException) (obj)).getStatusCode() == 422)
                        {
                            if (((LyftApiException) (obj)).getValidationErrors().size() > 0)
                            {
                                Object obj1 = (me.lyft.android.infrastructure.lyft.LyftError.ValidationError)((LyftApiException) (obj)).getValidationErrors().get(0);
                                obj = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getField();
                                obj1 = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getReason();
                                if (((String) (obj)).equalsIgnoreCase("email"))
                                {
                                    if (((String) (obj1)).equalsIgnoreCase("duplicateAccount"))
                                    {
                                        analytics.trackResponseFailure("duplicateAccount");
                                        handleEmailError(getResources().getString(0x7f070398));
                                        return;
                                    }
                                    if (((String) (obj1)).equalsIgnoreCase("invalidFormat"))
                                    {
                                        analytics.trackResponseFailure("invalidFormat");
                                        handleEmailError(getResources().getString(0x7f07039b));
                                        return;
                                    }
                                    if (((String) (obj1)).equalsIgnoreCase("emailInvalid"))
                                    {
                                        analytics.trackResponseFailure("emailInvalid");
                                        handleEmailError(getResources().getString(0x7f07039a));
                                        return;
                                    } else
                                    {
                                        analytics.trackResponseFailure("general");
                                        handleEmailError(getResources().getString(0x7f070399));
                                        return;
                                    }
                                } else
                                {
                                    analytics.trackResponseFailure("unknown");
                                    viewErrorHandler.handle(throwable);
                                    return;
                                }
                            } else
                            {
                                analytics.trackResponseFailure(throwable);
                                viewErrorHandler.handle(throwable);
                                return;
                            }
                        }
                    }
                    analytics.trackResponseFailure(throwable);
                    viewErrorHandler.handle(throwable);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((UserOrganizationDTO)obj);
                }

                public void onSuccess(UserOrganizationDTO userorganizationdto)
                {
                    AsyncActionAnalytics asyncactionanalytics = analytics;
                    String s;
                    if (userorganizationdto.getOrganization() != null)
                    {
                        s = userorganizationdto.getOrganization().getName();
                    } else
                    {
                        s = "";
                    }
                    asyncactionanalytics.trackResponseSuccess(s);
                    appFlow.replaceWith(new EnterpriseScreens.WorkPerksVerifyEmailScreen(emailEditText.getEditableText().toString(), userorganizationdto));
                }

                public void onUnsubscribe()
                {
                    progressController.enableUI();
                    progressController.hideProgress();
                }

            
            {
                this$0 = WorkPerksEditEmailView.this;
                analytics = asyncactionanalytics;
                super();
            }
            });
            return;
        }
    }

    protected void handleEmailError(String s)
    {
        inlineErrorTxt.setText(s);
        inlineErrorTxt.setVisibility(0);
        s = inlineErrorTxt.getLayoutParams();
        s.height = -2;
        inlineErrorTxt.setLayoutParams(s);
        emailEditText.setCompoundDrawablesWithIntrinsicBounds(0x7f020151, 0, 0, 0);
        emailEditText.setBackgroundResource(0x7f020016);
        emailEditText.setTypeface(emailEditText.getTypeface(), 1);
        emailEditText.setTextColor(getResources().getColor(0x7f0c008f));
        emailEditText.addTextChangedListener(textChangedListener);
        enableToolbarItem(Boolean.valueOf(false));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        if (workPerksEmail != null && Strings.isNullOrEmpty(emailEditText.getEditableText().toString()))
        {
            emailEditText.setText(workPerksEmail.toString());
            emailEditText.setSelection(emailEditText.getText().length());
        }
        emailEditText.addTextChangedListener(textChangedListener);
        binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
        Keyboard.showKeyboard(emailEditText);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        emailEditText.removeTextChangedListener(textChangedListener);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        emailEditText.addTextChangedListener(new LowerCaseTextWatcher());
        emailEditText.setValidationMessageView(inlineErrorTxt);
        workPerksEmail = params.getEmail();
        toolbar.setTitle(getContext().getString(0x7f070396)).clearItems().addItem(0x7f0d0017, getResources().getString(0x7f070321), 0x7f020103).disableItem(0x7f0d0017);
    }




}
