// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.skype.android.widget.CircleImageView;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingTermsOfUseActivity

public class  extends com.skype.android.ity..Proxy
{

    public void clearViews()
    {
        super.Proxy();
        ((LinkingTermsOfUseActivity)getTarget()).firstnameText = null;
        ((LinkingTermsOfUseActivity)getTarget()).termsPrivacy = null;
        ((LinkingTermsOfUseActivity)getTarget()).marketingOption = null;
        ((LinkingTermsOfUseActivity)getTarget()).fullnameText = null;
        ((LinkingTermsOfUseActivity)getTarget()).accountText = null;
        ((LinkingTermsOfUseActivity)getTarget()).continueBtn = null;
        ((LinkingTermsOfUseActivity)getTarget()).avatarImg = null;
        ((LinkingTermsOfUseActivity)getTarget()).noEmergencyCalls = null;
    }

    public void injectViews()
    {
        super.Proxy();
        ((LinkingTermsOfUseActivity)getTarget()).firstnameText = (TextView)findViewById(0x7f1003f4);
        ((LinkingTermsOfUseActivity)getTarget()).termsPrivacy = (TextView)findViewById(0x7f1003f6);
        ((LinkingTermsOfUseActivity)getTarget()).marketingOption = (CheckBox)findViewById(0x7f1003f8);
        ((LinkingTermsOfUseActivity)getTarget()).fullnameText = (TextView)findViewById(0x7f1003be);
        ((LinkingTermsOfUseActivity)getTarget()).accountText = (TextView)findViewById(0x7f1003bf);
        ((LinkingTermsOfUseActivity)getTarget()).continueBtn = (Button)findViewById(0x7f1003f5);
        ((LinkingTermsOfUseActivity)getTarget()).avatarImg = (CircleImageView)findViewById(0x7f1003bd);
        ((LinkingTermsOfUseActivity)getTarget()).noEmergencyCalls = (TextView)findViewById(0x7f1003f7);
    }

    public (LinkingTermsOfUseActivity linkingtermsofuseactivity)
    {
        super(linkingtermsofuseactivity);
    }
}
