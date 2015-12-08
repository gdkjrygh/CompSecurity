// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.widget.CircleImageView;
import com.skype.android.widget.YesNoButtons;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingSkypeNamesFoundActivity

public class  extends 
{

    public void clearViews()
    {
        super.ews();
        ((LinkingSkypeNamesFoundActivity)getTarget()).linkingTheseAccountsText = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).thirdAvatarImg = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).microsoftAccountText = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).skypeNamesText = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).linkDiffSkypeContainer = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).firstAvatarImg = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).secondAvatarImg = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).moreSkypeNamesText = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).fullnametext = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).yesNoButtons = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).msaBottomContainer = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).skypeAvatars = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).linkDiffSkype = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).matchesSkypeAccountsText = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).skypeContainer = null;
        ((LinkingSkypeNamesFoundActivity)getTarget()).microsoftFullnameText = null;
    }

    public void injectViews()
    {
        super.iews();
        ((LinkingSkypeNamesFoundActivity)getTarget()).linkingTheseAccountsText = (TextView)findViewById(0x7f1003ef);
        ((LinkingSkypeNamesFoundActivity)getTarget()).thirdAvatarImg = (CircleImageView)findViewById(0x7f1003eb);
        ((LinkingSkypeNamesFoundActivity)getTarget()).microsoftAccountText = (TextView)findViewById(0x7f1003e4);
        ((LinkingSkypeNamesFoundActivity)getTarget()).skypeNamesText = (TextView)findViewById(0x7f1003ed);
        ((LinkingSkypeNamesFoundActivity)getTarget()).linkDiffSkypeContainer = (ViewGroup)findViewById(0x7f1003f1);
        ((LinkingSkypeNamesFoundActivity)getTarget()).firstAvatarImg = (CircleImageView)findViewById(0x7f1003e9);
        ((LinkingSkypeNamesFoundActivity)getTarget()).secondAvatarImg = (CircleImageView)findViewById(0x7f1003ea);
        ((LinkingSkypeNamesFoundActivity)getTarget()).moreSkypeNamesText = (TextView)findViewById(0x7f1003ee);
        ((LinkingSkypeNamesFoundActivity)getTarget()).fullnametext = (TextView)findViewById(0x7f1003be);
        ((LinkingSkypeNamesFoundActivity)getTarget()).yesNoButtons = (YesNoButtons)findViewById(0x7f1003f0);
        ((LinkingSkypeNamesFoundActivity)getTarget()).msaBottomContainer = (ViewGroup)findViewById(0x7f1003e7);
        ((LinkingSkypeNamesFoundActivity)getTarget()).skypeAvatars = (RelativeLayout)findViewById(0x7f1003e8);
        ((LinkingSkypeNamesFoundActivity)getTarget()).linkDiffSkype = (Button)findViewById(0x7f1003dc);
        ((LinkingSkypeNamesFoundActivity)getTarget()).matchesSkypeAccountsText = (TextView)findViewById(0x7f1003e6);
        ((LinkingSkypeNamesFoundActivity)getTarget()).skypeContainer = (LinearLayout)findViewById(0x7f1003ec);
        ((LinkingSkypeNamesFoundActivity)getTarget()).microsoftFullnameText = (TextView)findViewById(0x7f1003e5);
    }

    public (LinkingSkypeNamesFoundActivity linkingskypenamesfoundactivity)
    {
        super(linkingskypenamesfoundactivity);
    }
}
