// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.widget.ImageButton;
import com.skype.android.widget.AccessibleEditText;

// Referenced classes of package com.skype.android.app.signin:
//            SignUpActivity

public class  extends ..Proxy
{

    public void clearViews()
    {
        super.clearViews();
        ((SignUpActivity)getTarget()).continueButton = null;
        ((SignUpActivity)getTarget()).skypenameEdit = null;
        ((SignUpActivity)getTarget()).passwordConfirmEdit = null;
        ((SignUpActivity)getTarget()).fullnameEdit = null;
        ((SignUpActivity)getTarget()).emailEdit = null;
        ((SignUpActivity)getTarget()).passwordEdit = null;
    }

    public void injectViews()
    {
        super.injectViews();
        ((SignUpActivity)getTarget()).continueButton = (ImageButton)findViewById(0x7f10051f);
        ((SignUpActivity)getTarget()).skypenameEdit = (AccessibleEditText)findViewById(0x7f10051b);
        ((SignUpActivity)getTarget()).passwordConfirmEdit = (AccessibleEditText)findViewById(0x7f10051d);
        ((SignUpActivity)getTarget()).fullnameEdit = (AccessibleEditText)findViewById(0x7f10051a);
        ((SignUpActivity)getTarget()).emailEdit = (AccessibleEditText)findViewById(0x7f10051e);
        ((SignUpActivity)getTarget()).passwordEdit = (AccessibleEditText)findViewById(0x7f10051c);
    }

    public (SignUpActivity signupactivity)
    {
        super(signupactivity);
    }
}
