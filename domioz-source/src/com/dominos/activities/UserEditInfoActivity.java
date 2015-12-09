// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import org.json.JSONException;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

public class UserEditInfoActivity extends BaseActivity
{

    private UserObject currentUser;
    TextView email;
    EditText firstName;
    private boolean isEditOrderInfoOnly;
    EditText lastName;
    EditText phoneExtension;
    EditText phoneNumber;
    Button saveAccount;

    public UserEditInfoActivity()
    {
        isEditOrderInfoOnly = false;
    }

    private String getEditTextString(EditText edittext)
    {
        return edittext.getText().toString().trim();
    }

    private void updateOrderWithNewUserInfo()
    {
        LabsOrder labsorder = mOrderManager.getOrder();
        if (labsorder != null)
        {
            labsorder.setFirstName(getEditTextString(firstName));
            labsorder.setLastName(getEditTextString(lastName));
            labsorder.setPhone(getEditTextString(phoneNumber));
            labsorder.setPhoneExtension(getEditTextString(phoneExtension));
        }
    }

    private String validateFields()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = getEditTextString(firstName);
        if (s == null || s.trim().length() <= 0)
        {
            stringbuffer.append(getString(0x7f08012b));
        } else
        {
            firstName.setText(s.trim());
        }
        s = getEditTextString(lastName);
        if (s == null || s.trim().length() <= 0)
        {
            stringbuffer.append(getString(0x7f080188));
        } else
        {
            lastName.setText(s.trim());
        }
        s = getEditTextString(phoneNumber);
        if (s == null || s.trim().length() <= 0)
        {
            stringbuffer.append(getString(0x7f080229));
        } else
        if (s.trim().length() < 10)
        {
            stringbuffer.append(getString(0x7f08022a));
        } else
        {
            phoneNumber.setText(s.trim());
        }
        return stringbuffer.toString();
    }

    public void onAfterViews()
    {
        setTitle(getString(0x7f08033c));
        isEditOrderInfoOnly = getIntent().getBooleanExtra("editOrderInfoOnly", false);
        if (!isEditOrderInfoOnly) goto _L2; else goto _L1
_L1:
        LabsOrder labsorder = mOrderManager.getOrder();
        firstName.setText(labsorder.getFirstName());
        lastName.setText(labsorder.getLastName());
        email.setText(labsorder.getEmail());
        phoneNumber.setText(labsorder.getPhone());
        phoneExtension.setText(labsorder.getPhoneExtension());
_L4:
        phoneExtension.setOnEditorActionListener(new _cls1());
        saveAccount.setText(0x7f08006e);
        saveAccount.setVisibility(0);
        return;
_L2:
        if (mProfileManager.getCurrentUser() != null)
        {
            try
            {
                currentUser = mProfileManager.getCurrentUser().copy();
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
            firstName.setText(currentUser.getFirstName());
            lastName.setText(currentUser.getLastName());
            email.setText(currentUser.getEmail());
            phoneNumber.setText(currentUser.getPhone());
            phoneExtension.setText(currentUser.getPhoneExtension());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onSaveButtonClick()
    {
        saveAccount();
    }

    public void saveAccount()
    {
        String s = validateFields();
        if (s.length() > 0)
        {
            s = s.substring(0, s.length() - 2);
            mActivityHelper.showAlert(AlertType.MISSING_FIELDS_USER_INFO, s, null);
            return;
        }
        if (isEditOrderInfoOnly)
        {
            updateOrderWithNewUserInfo();
            showShortToast(getString(0x7f080294));
            setResult(-1);
            finish();
            return;
        }
        updateOrderWithNewUserInfo();
        if (currentUser != null)
        {
            currentUser.setFirstName(getEditTextString(firstName));
            currentUser.setLastName(getEditTextString(lastName));
            currentUser.setPhone(getEditTextString(phoneNumber));
            currentUser.setPhoneExtension(getEditTextString(phoneExtension));
        }
        mPowerService.saveCustomer(currentUser, new _cls2());
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final UserEditInfoActivity this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 6 || i == 5)
            {
                saveAccount();
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = UserEditInfoActivity.this;
            super();
        }
    }


    private class _cls2 extends PowerRestCallback
    {

        final UserEditInfoActivity this$0;

        public void onBegin()
        {
            showLoading();
        }

        public void onError(Exception exception, String s)
        {
            hideLoading();
            showShortToast(getString(0x7f08011a));
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            hideLoading();
            if (currentUser != null)
            {
                mProfileManager.saveNewCurrentUser(currentUser);
            }
            showShortToast(getString(0x7f080294));
            setResult(-1);
            finish();
        }

        _cls2()
        {
            this$0 = UserEditInfoActivity.this;
            super();
        }
    }

}
