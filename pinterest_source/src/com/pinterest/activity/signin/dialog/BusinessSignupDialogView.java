// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.BusinessApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PEditText;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            SignupDialogView, BusinessAccountTypeDialog, SignupConfirmDialog

public class BusinessSignupDialogView extends SignupDialogView
    implements android.view.View.OnClickListener
{

    private static List _types;
    public static String lastBusinessName = "";
    public static String lastSelectedType = "";
    public static String lastSelectedTypeKey = "";
    public static String lastWebsite = "";
    PEditText _businessName;
    Button _businessType;
    Button _createBt;
    PEditText _email;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    PEditText _password;
    View _term;
    PEditText _website;

    public BusinessSignupDialogView(Context context)
    {
        this(context, null);
    }

    public BusinessSignupDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _eventsSubscriber = new _cls1();
    }

    private void initTextView(PEditText pedittext)
    {
        SignupDialogView.EditTextListener edittextlistener = new SignupDialogView.EditTextListener(this, pedittext);
        pedittext.setOnFocusChangeListener(edittextlistener);
        pedittext.addTextChangedListener(edittextlistener);
        pedittext.setClearEnabled(true);
    }

    private void loadBusinessTypes()
    {
        BusinessApi.a(new _cls2());
    }

    private void markInvalidField(EditText edittext)
    {
        edittext.setBackgroundResource(0x7f020219);
        edittext.requestFocus();
        edittext.setSelection(edittext.getText().toString().length());
    }

    public static void onSignupSuccess()
    {
        lastSelectedTypeKey = "";
        lastSelectedType = "";
        lastWebsite = "";
        lastBusinessName = "";
    }

    private void updateFocus()
    {
        PEditText pedittext = null;
        if (!StringUtils.isEmpty(lastEmailInput)) goto _L2; else goto _L1
_L1:
        _email.requestFocus();
        pedittext = _email;
_L4:
        if (pedittext != null)
        {
            Device.showSoftKeyboard(pedittext);
        }
        return;
_L2:
        if (StringUtils.isEmpty(lastPasswordInput))
        {
            _password.requestFocus();
            pedittext = _password;
        } else
        if (StringUtils.isEmpty(lastBusinessName))
        {
            _businessName.requestFocus();
            pedittext = _businessName;
        } else
        if (StringUtils.isEmpty(lastWebsite))
        {
            _website.requestFocus();
            pedittext = _website;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void updateInput()
    {
        if (ViewHelper.isEmpty(_email))
        {
            _email.setText(lastEmailInput);
        }
        if (ViewHelper.isEmpty(_password))
        {
            _password.setText(lastPasswordInput);
        }
        if (ViewHelper.isEmpty(_businessName))
        {
            _businessName.setText(lastBusinessName);
        }
        if (StringUtils.isEmpty(lastSelectedTypeKey))
        {
            _businessType.setText(0x7f070507);
        } else
        {
            _businessType.setText(lastSelectedType);
        }
        if (ViewHelper.isEmpty(_website))
        {
            _website.setText(lastWebsite);
        }
    }

    private boolean validateAndSaveInput()
    {
        String s = _email.getText().toString();
        String s1 = _password.getText().toString();
        String s2 = _businessName.getText().toString();
        if (!SignupFormUtils.isEmailValid(s))
        {
            markInvalidField(_email);
            int i;
            if (StringUtils.isEmpty(s))
            {
                i = 0x7f070279;
            } else
            {
                i = 0x7f070531;
            }
            Application.showToast(i);
            return false;
        }
        if (!SignupFormUtils.isPasswordValid(s1))
        {
            markInvalidField(_password);
            Application.showToast(0x7f070541);
            return false;
        }
        if (!SignupFormUtils.isBusinessNameValid(s2))
        {
            markInvalidField(_businessName);
            Application.showToast(0x7f07052b);
            return false;
        }
        if (!SignupFormUtils.isBusinessTypeValid(lastSelectedTypeKey))
        {
            Application.showToast(0x7f07052c);
            return false;
        } else
        {
            lastEmailInput = s;
            lastPasswordInput = s1;
            lastBusinessName = s2;
            lastWebsite = _website.getText().toString();
            return true;
        }
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f03008d, this, true);
        ButterKnife.a(this);
        setupBusinessSignupFields();
        loadBusinessTypes();
    }

    void onAccountTypeClicked()
    {
        if (_types == null)
        {
            Application.showToast(0x7f070286);
            return;
        } else
        {
            BusinessAccountTypeDialog businessaccounttypedialog = BusinessAccountTypeDialog.newInstance();
            businessaccounttypedialog.setTypes(_types);
            businessaccounttypedialog.setLastSelectedKey(lastSelectedTypeKey);
            businessaccounttypedialog.setHidePrevious(false);
            Events.post(new DialogEvent(businessaccounttypedialog));
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/activity/signin/dialog/BusinessAccountTypeDialog$BusinessTypeSelected, new Class[0]);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Events.unregister(_eventsSubscriber);
    }

    void onSignupClicked()
    {
        Pinalytics.a(ElementType.SIGNUP_BUTTON);
        if (!validateAndSaveInput())
        {
            return;
        } else
        {
            com.pinterest.api.remote.BusinessApi.PartnerParams partnerparams = new com.pinterest.api.remote.BusinessApi.PartnerParams();
            partnerparams.c = lastEmailInput;
            partnerparams.e = lastPasswordInput;
            partnerparams.A = lastBusinessName;
            partnerparams.B = lastSelectedTypeKey;
            partnerparams.C = lastWebsite;
            partnerparams.u = _inviteCode;
            SignupConfirmDialog signupconfirmdialog = new SignupConfirmDialog();
            signupconfirmdialog.setSignupParams(partnerparams);
            signupconfirmdialog.setPartnerSignup(true);
            Events.post(new DialogEvent(signupconfirmdialog));
            return;
        }
    }

    void onTosClicked()
    {
        Pinalytics.a(ElementType.TOS_BUTTON);
        ActivityHelper.goIntentView(getContext(), Resources.string(0x7f070750));
    }

    public void setEmailAddress(String s)
    {
        _emailAddress = s;
        if (_emailAddress != null)
        {
            _email.setText(_emailAddress);
        }
    }

    protected void setupBusinessSignupFields()
    {
        initTextView(_email);
        initTextView(_password);
        initTextView(_businessName);
        initTextView(_website);
        updateFocus();
        updateInput();
    }



/*
    static List access$002(List list)
    {
        _types = list;
        return list;
    }

*/

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final BusinessSignupDialogView this$0;

        public void onEventMainThread(BusinessAccountTypeDialog.BusinessTypeSelected businesstypeselected)
        {
            BusinessSignupDialogView.lastSelectedType = businesstypeselected.name;
            BusinessSignupDialogView.lastSelectedTypeKey = businesstypeselected.key;
            ViewHelper.safeSetText(_businessType, BusinessSignupDialogView.lastSelectedType);
        }

        _cls1()
        {
            this$0 = BusinessSignupDialogView.this;
            super();
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final BusinessSignupDialogView this$0;

        public void onSuccess(final ApiResponse response)
        {
            super.onSuccess(response);
            class _cls1 extends BackgroundTask
            {

                final _cls2 this$1;
                final ApiResponse val$response;

                public void run()
                {
                    BusinessSignupDialogView._types = BusinessType.makeAll((PinterestJsonArray)response.getData());
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    response = apiresponse;
                    super();
                }
            }

            (new _cls1()).execute();
        }

        _cls2()
        {
            this$0 = BusinessSignupDialogView.this;
            super();
        }
    }

}
