// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RadioGroup;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.ui.text.PEditText;
import java.util.Calendar;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            SignupConfirmDialog, GenderSignupDialogView

public class GenderSignupDialog extends BaseDialog
{

    private static final String EMAIL = "_email";
    public static final String FEMALE = "female";
    private static final String FIRSTNAME = "_firstname";
    public static final String KEY = "email";
    private static final String LASTNAME = "_lastname";
    public static final String MALE = "male";
    private static final String PASSWORD = "_password";
    public static final String UNSPECIFIED = "unspecified";
    protected PEditText _ageEt;
    private String _email;
    private String _firstname;
    private RadioGroup _genderGp;
    private String _lastname;
    private String _password;

    public GenderSignupDialog()
    {
        _key = "email";
    }

    public GenderSignupDialog(String s, String s1, String s2, String s3)
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            _firstname = bundle.getString("_firstname");
            _lastname = bundle.getString("_lastname");
            _email = bundle.getString("_email");
            _password = bundle.getString("_password");
            return;
        } else
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("_firstname", s);
            bundle1.putString("_lastname", s1);
            bundle1.putString("_email", s2);
            bundle1.putString("_password", s3);
            _email = s2;
            _firstname = s;
            _lastname = s1;
            _password = s3;
            return;
        }
    }

    private void trySignup()
    {
        com.pinterest.api.remote.AccountApi.SignupParams signupparams;
        signupparams = new com.pinterest.api.remote.AccountApi.SignupParams();
        signupparams.q = _firstname;
        signupparams.r = _lastname;
        signupparams.b = "";
        signupparams.c = _email;
        signupparams.e = _password;
        if (_genderGp == null) goto _L2; else goto _L1
_L1:
        _genderGp.getCheckedRadioButtonId();
        JVM INSTR tableswitch 2131689830 2131689831: default 84
    //                   2131689830 190
    //                   2131689831 181;
           goto _L3 _L4 _L5
_L3:
        signupparams.s = "unspecified";
_L9:
        String s;
        int i;
        _ageEt = (PEditText)findViewById(0x7f0f01a4);
        s = _ageEt.getText().toString();
        i = 0;
        int j = Integer.parseInt(s);
        i = j;
        break MISSING_BLOCK_LABEL_127;
_L5:
        signupparams.s = "female";
        continue; /* Loop/switch isn't completed */
_L4:
        signupparams.s = "male";
        continue; /* Loop/switch isn't completed */
_L2:
        signupparams.s = "unspecified";
        continue; /* Loop/switch isn't completed */
_L7:
        if (i <= 0 || !StringUtils.isNumeric(s) || s.length() != 2)
        {
            _ageEt.setBackgroundResource(0x7f020219);
            _ageEt.requestFocus();
            _ageEt.setSelection(s.length());
            Application.showToast(0x7f07052a);
            return;
        }
        if (i >= 13)
        {
            SignupConfirmDialog signupconfirmdialog = new SignupConfirmDialog();
            signupparams.w = getUnixBirthdate(i);
            signupconfirmdialog.setSignupParams(signupparams);
            Events.post(new DialogEvent(signupconfirmdialog));
            return;
        } else
        {
            Device.hideSoftKeyboard(getView());
            dismiss();
            Preferences.persisted().set("BLOCK_SIGNUP", true);
            Events.post(new com.pinterest.base.Social.DenySignupEvent());
            return;
        }
        Exception exception;
        exception;
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L9; else goto _L8
_L8:
    }

    public int getUnixBirthdate(int i)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendar.get(1) - i);
        return (int)(calendar.getTimeInMillis() / 1000L);
    }

    public void make(LayoutInflater layoutinflater)
    {
        GenderSignupDialogView gendersignupdialogview = new GenderSignupDialogView(getContext());
        gendersignupdialogview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        setContent(gendersignupdialogview, 0);
        super.make(layoutinflater);
        layoutinflater = (Button)gendersignupdialogview.findViewById(0x7f0f01a5);
        _genderGp = (RadioGroup)gendersignupdialogview.findViewById(0x7f0f01a1);
        layoutinflater.setOnClickListener(new _cls1());
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        _ageEt = null;
    }

    public void onPause()
    {
        Pinalytics.d();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        Pinalytics.a(this);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final GenderSignupDialog this$0;

        public void onClick(View view)
        {
            AnalyticsApi.a("email_signup_step_2_complete");
            trySignup();
        }

        _cls1()
        {
            this$0 = GenderSignupDialog.this;
            super();
        }
    }

}
