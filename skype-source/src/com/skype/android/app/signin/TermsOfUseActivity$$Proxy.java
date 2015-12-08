// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.signin:
//            TermsOfUseActivity

public class  extends com.skype.android.ity..Proxy
{

    public void clearViews()
    {
        super.Views();
        ((TermsOfUseActivity)getTarget()).agreeButton = null;
        ((TermsOfUseActivity)getTarget()).termsTOU = null;
        ((TermsOfUseActivity)getTarget()).marketingOption = null;
    }

    public void injectViews()
    {
        super.tViews();
        ((TermsOfUseActivity)getTarget()).agreeButton = (Button)findViewById(0x7f100548);
        ((TermsOfUseActivity)getTarget()).termsTOU = (TextView)findViewById(0x7f100549);
        ((TermsOfUseActivity)getTarget()).marketingOption = (CheckBox)findViewById(0x7f10054b);
    }

    public (TermsOfUseActivity termsofuseactivity)
    {
        super(termsofuseactivity);
    }
}
