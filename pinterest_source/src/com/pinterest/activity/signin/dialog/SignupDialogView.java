// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.pinterest.activity.DialogHelper;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.unauth.UnauthHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.kit.utils.LocaleUtils;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.PEditText;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            SignupConfirmDialog

public class SignupDialogView extends RelativeLayout
    implements android.view.View.OnClickListener
{

    public static final String FEMALE = "female";
    public static final String MALE = "male";
    public static final String UNSPECIFIED = "unspecified";
    public static String lastEmailInput = "";
    public static String lastFirstnameInput = "";
    public static int lastGenderIput = -1;
    public static String lastLastnameInput = "";
    public static String lastPasswordInput = "";
    public static Intent lastTwitterData;
    protected View _businessBt;
    protected String _emailAddress;
    protected PEditText _emailEt;
    protected View _facebookBt;
    protected RadioButton _femaleBt;
    protected PEditText _firstnameEt;
    protected RadioGroup _genderGp;
    protected Boolean _genderSelected;
    protected View _gplusBt;
    protected String _inviteCode;
    protected PEditText _lastnameEt;
    protected RadioButton _maleBt;
    protected PEditText _passwordEt;
    protected View _signupBt;
    protected View _twitterBt;
    private android.view.View.OnClickListener onGenderClick;
    private android.view.View.OnKeyListener onKeyListener;

    public SignupDialogView(Context context)
    {
        super(context);
        _genderSelected = null;
        onKeyListener = new _cls1();
        onGenderClick = new _cls2();
        init();
    }

    public SignupDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _genderSelected = null;
        onKeyListener = new _cls1();
        onGenderClick = new _cls2();
        init();
    }

    private void getUserProfile()
    {
        (new GetProfileTask(getContext())).execute();
    }

    public static void onSignupSuccess()
    {
        lastPasswordInput = "";
        lastEmailInput = "";
        lastLastnameInput = "";
        lastFirstnameInput = "";
        lastTwitterData = null;
        lastGenderIput = -1;
    }

    public static void onTwitterConnected(Intent intent)
    {
label0:
        {
            lastTwitterData = intent;
            intent = intent.getStringExtra("com.pinterest.EXTRA_NAME");
            if (StringUtils.isNotEmpty(intent))
            {
                int i = intent.indexOf(" ");
                if (i < 0)
                {
                    break label0;
                }
                lastFirstnameInput = intent.substring(0, i);
                lastLastnameInput = intent.substring(i, intent.length());
            }
            return;
        }
        lastFirstnameInput = intent;
    }

    private void setupSignupMethodFields()
    {
        _facebookBt = findViewById(0x7f0f007b);
        _facebookBt.setOnClickListener(this);
        _gplusBt = findViewById(0x7f0f011d);
        if (_gplusBt != null)
        {
            if (!GooglePlayServices.isAvailable())
            {
                _gplusBt.setVisibility(8);
            } else
            {
                _gplusBt.setVisibility(0);
                _gplusBt.setOnClickListener(this);
            }
        }
        _twitterBt = findViewById(0x7f0f007c);
        if (_twitterBt != null)
        {
            _twitterBt.setOnClickListener(this);
        }
    }

    private void trySignup()
    {
        com.pinterest.api.remote.AccountApi.SignupParams signupparams;
        if (_firstnameEt == null || _emailEt == null || _passwordEt == null)
        {
            return;
        }
        String s = _firstnameEt.getText().toString();
        Object obj = null;
        String s1 = _emailEt.getText().toString();
        String s2 = _passwordEt.getText().toString();
        if (_lastnameEt != null)
        {
            obj = _lastnameEt.getText().toString();
        }
        if (!SignupFormUtils.isFirstNameValid(s))
        {
            _firstnameEt.setBackgroundResource(0x7f020219);
            _firstnameEt.requestFocus();
            _firstnameEt.setSelection(s.length());
            Application.showToast(0x7f070538);
            return;
        }
        if (!SignupFormUtils.isEmailValid(s1))
        {
            _emailEt.setBackgroundResource(0x7f020219);
            _emailEt.requestFocus();
            _emailEt.setSelection(s1.length());
            int i;
            if (StringUtils.isEmpty(s1))
            {
                i = 0x7f070279;
            } else
            {
                i = 0x7f070531;
            }
            Application.showToast(i);
            return;
        }
        if (!SignupFormUtils.isPasswordValid(s2))
        {
            _passwordEt.setBackgroundResource(0x7f020219);
            _passwordEt.requestFocus();
            _passwordEt.setSelection(s2.length());
            Application.showToast(0x7f070541);
            return;
        }
        lastFirstnameInput = s;
        lastLastnameInput = ((String) (obj));
        lastEmailInput = s1;
        lastPasswordInput = s2;
        int j;
        if (_genderGp == null)
        {
            j = -1;
        } else
        {
            j = _genderGp.getCheckedRadioButtonId();
        }
        lastGenderIput = j;
        signupparams = new com.pinterest.api.remote.AccountApi.SignupParams();
        signupparams.q = s;
        signupparams.r = ((String) (obj));
        signupparams.b = "";
        signupparams.c = s1;
        signupparams.e = s2;
        if (_genderGp == null) goto _L2; else goto _L1
_L1:
        _genderGp.getCheckedRadioButtonId();
        JVM INSTR tableswitch 2131689830 2131689831: default 328
    //                   2131689830 453
    //                   2131689831 443;
           goto _L3 _L4 _L5
_L3:
        signupparams.s = "unspecified";
_L7:
        if (lastTwitterData != null)
        {
            signupparams.i = lastTwitterData.getStringExtra("com.pinterest.EXTRA_ID");
            signupparams.f = lastTwitterData.getStringExtra("com.pinterest.EXTRA_TOKEN");
            signupparams.g = lastTwitterData.getStringExtra("com.pinterest.EXTRA_SECRET");
            signupparams.y = lastTwitterData.getStringExtra("com.pinterest.EXTRA_USER_NAME");
        }
        signupparams.u = _inviteCode;
        obj = new SignupConfirmDialog();
        ((SignupConfirmDialog) (obj)).setSignupParams(signupparams);
        Events.post(new DialogEvent(((com.pinterest.activity.task.dialog.BaseDialog) (obj))));
        return;
_L5:
        signupparams.s = "female";
        continue; /* Loop/switch isn't completed */
_L4:
        signupparams.s = "male";
        continue; /* Loop/switch isn't completed */
_L2:
        signupparams.s = "unspecified";
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void updateFocus()
    {
        Object obj = null;
        if (_firstnameEt == null || !StringUtils.isEmpty(lastFirstnameInput)) goto _L2; else goto _L1
_L1:
        PEditText pedittext;
        _firstnameEt.requestFocus();
        pedittext = _firstnameEt;
_L4:
        if (pedittext != null)
        {
            Device.showSoftKeyboard(pedittext);
        }
        return;
_L2:
        if (_emailEt != null && StringUtils.isEmpty(lastEmailInput))
        {
            _emailEt.requestFocus();
            pedittext = _emailEt;
        } else
        {
            pedittext = obj;
            if (_passwordEt != null)
            {
                pedittext = obj;
                if (StringUtils.isEmpty(lastPasswordInput))
                {
                    _passwordEt.requestFocus();
                    pedittext = _passwordEt;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void updateInput()
    {
        if (_firstnameEt != null && StringUtils.isEmpty(_firstnameEt.getText().toString()))
        {
            if (LocaleUtils.isLanguageJa())
            {
                if (StringUtils.isNotBlank(lastLastnameInput))
                {
                    _firstnameEt.setText((new StringBuilder()).append(lastLastnameInput).append(" ").append(lastFirstnameInput).toString());
                } else
                {
                    _firstnameEt.setText(lastFirstnameInput);
                }
            } else
            {
                _firstnameEt.setText(lastFirstnameInput);
            }
        }
        if (_lastnameEt != null && StringUtils.isEmpty(_lastnameEt.getText().toString()))
        {
            _lastnameEt.setText(lastLastnameInput);
        }
        if (_emailEt != null && StringUtils.isEmpty(_emailEt.getText().toString()))
        {
            if (StringUtils.isEmpty(lastEmailInput))
            {
                try
                {
                    String s = Device.getDefaultEmailAddress();
                    if (StringUtils.isNotEmpty(s))
                    {
                        lastEmailInput = s;
                    }
                }
                catch (Exception exception) { }
            }
            _emailEt.setText(lastEmailInput);
        }
        if (_passwordEt != null && StringUtils.isEmpty(_passwordEt.getText().toString()))
        {
            _passwordEt.setText(lastPasswordInput);
        }
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f03008c, this, true);
        setupSignupMethodFields();
        setupEmailSignupFields();
    }

    public void onClick(View view)
    {
        if (view == _signupBt)
        {
            Pinalytics.a(ElementType.SIGNUP_BUTTON);
            trySignup();
            return;
        }
        if (view == _businessBt)
        {
            DialogHelper.goBusinessSignup(_emailAddress, _inviteCode);
            return;
        } else
        {
            UnauthHelper.onClick(view, getContext());
            return;
        }
    }

    public void setEmailAddress(String s)
    {
        _emailAddress = s;
        if (_emailAddress != null)
        {
            _emailEt.setText(_emailAddress);
        }
    }

    public void setInviteCode(String s)
    {
        _inviteCode = s;
    }

    protected void setupEmailSignupFields()
    {
        _firstnameEt = (PEditText)findViewById(0x7f0f01a6);
        EditTextListener edittextlistener = new EditTextListener(_firstnameEt);
        _firstnameEt.setOnFocusChangeListener(edittextlistener);
        _firstnameEt.addTextChangedListener(edittextlistener);
        _firstnameEt.setTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId.LIGHT);
        _lastnameEt = (PEditText)findViewById(0x7f0f01a7);
        if (_lastnameEt != null)
        {
            _lastnameEt.setTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId.LIGHT);
        }
        getUserProfile();
        _emailEt = (PEditText)findViewById(0x7f0f0174);
        edittextlistener = new EditTextListener(_emailEt);
        _emailEt.setOnFocusChangeListener(edittextlistener);
        _emailEt.addTextChangedListener(edittextlistener);
        _emailEt.setTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId.LIGHT);
        _emailEt.setClearEnabled(true);
        _passwordEt = (PEditText)findViewById(0x7f0f0175);
        edittextlistener = new EditTextListener(_passwordEt);
        _passwordEt.setOnFocusChangeListener(edittextlistener);
        _passwordEt.addTextChangedListener(edittextlistener);
        _passwordEt.setOnKeyListener(onKeyListener);
        _passwordEt.setTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId.LIGHT);
        _genderGp = (RadioGroup)findViewById(0x7f0f01a1);
        _genderGp.setOnClickListener(onGenderClick);
        _femaleBt = (RadioButton)findViewById(0x7f0f0167);
        _femaleBt.setOnClickListener(onGenderClick);
        _maleBt = (RadioButton)findViewById(0x7f0f0166);
        _maleBt.setOnClickListener(onGenderClick);
        lastGenderIput;
        JVM INSTR tableswitch 2131689830 2131689831: default 312
    //                   2131689830 392
    //                   2131689831 381;
           goto _L1 _L2 _L3
_L1:
        _genderGp.clearCheck();
_L5:
        _signupBt = findViewById(0x7f0f014b);
        _signupBt.setOnClickListener(this);
        _businessBt = findViewById(0x7f0f01a3);
        if (_businessBt != null)
        {
            _businessBt.setOnClickListener(this);
            _businessBt.setVisibility(0);
        }
        updateInput();
        updateFocus();
        return;
_L3:
        _femaleBt.performClick();
        continue; /* Loop/switch isn't completed */
_L2:
        _maleBt.performClick();
        if (true) goto _L5; else goto _L4
_L4:
    }


    private class _cls1
        implements android.view.View.OnKeyListener
    {

        final SignupDialogView this$0;

        public boolean onKey(View view, int i, KeyEvent keyevent)
        {
            if (keyevent.getAction() == 0 && i == 66)
            {
                _signupBt.performClick();
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = SignupDialogView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        public int _lastGenderBt;
        final SignupDialogView this$0;

        public void onClick(View view)
        {
            if (_lastGenderBt == view.getId() && view.getId() == _genderGp.getCheckedRadioButtonId())
            {
                _genderGp.clearCheck();
                _lastGenderBt = -1;
                return;
            } else
            {
                _lastGenderBt = _genderGp.getCheckedRadioButtonId();
                return;
            }
        }

        _cls2()
        {
            this$0 = SignupDialogView.this;
            super();
            _lastGenderBt = -1;
        }
    }


    private class GetProfileTask extends BackgroundTask
    {

        private Context _context;
        private String names[];
        final SignupDialogView this$0;

        public void onFinish()
        {
            if (names != null && _firstnameEt != null && _lastnameEt != null && StringUtils.isEmpty(_firstnameEt.getText().toString()))
            {
                _firstnameEt.setText(names[0]);
                if (names.length > 1)
                {
                    _lastnameEt.setText(names[1]);
                    return;
                }
            }
        }

        public void run()
        {
            if (_context != null)
            {
                Cursor cursor;
                try
                {
                    cursor = _context.getContentResolver().query(android.provider.ContactsContract.Profile.CONTENT_URI, null, null, null, null);
                }
                catch (SecurityException securityexception)
                {
                    CrashReporting.a(securityexception);
                    securityexception = null;
                }
                if (cursor != null)
                {
                    if (cursor.getCount() > 0 && cursor.moveToFirst())
                    {
                        Pair pair = new Pair("display_name", cursor.getString(cursor.getColumnIndex("display_name")));
                        if ("display_name".equals(pair.first) && pair.second != null && (pair.second instanceof String))
                        {
                            names = ((String)pair.second).split(" ");
                        }
                    }
                    cursor.close();
                    return;
                }
            }
        }

        public GetProfileTask(Context context)
        {
            this$0 = SignupDialogView.this;
            super();
            _context = context;
        }
    }


    private class EditTextListener
        implements TextWatcher, android.view.View.OnFocusChangeListener
    {

        private EditText _et;
        final SignupDialogView this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onFocusChange(View view, boolean flag)
        {
            int i = 1;
            if (flag) goto _L2; else goto _L1
_L1:
            int j;
            j = _et.getId();
            view = _et.getText().toString();
            j;
            JVM INSTR lookupswitch 4: default 72
        //                       2131689844: 104
        //                       2131689845: 116
        //                       2131689884: 128
        //                       2131689894: 92;
               goto _L2 _L3 _L4 _L5 _L6
_L5:
            break MISSING_BLOCK_LABEL_128;
_L2:
            i = 0;
_L7:
            view = _et;
            if (i != 0)
            {
                i = 0x7f020219;
            } else
            {
                i = 0x7f020136;
            }
            view.setBackgroundResource(i);
            return;
_L6:
            if (SignupFormUtils.isFirstNameValid(view))
            {
                i = 0;
            }
              goto _L7
_L3:
            if (SignupFormUtils.isEmailValid(view))
            {
                i = 0;
            }
              goto _L7
_L4:
            if (SignupFormUtils.isPasswordValid(view))
            {
                i = 0;
            }
              goto _L7
            if (SignupFormUtils.isBusinessNameValid(view))
            {
                i = 0;
            }
              goto _L7
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        protected EditTextListener(EditText edittext)
        {
            this$0 = SignupDialogView.this;
            super();
            _et = edittext;
        }
    }

}
