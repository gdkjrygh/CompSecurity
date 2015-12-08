// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.widget.TextView;
import com.skype.android.widget.CircleImageView;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingPreSignInActivity

public class roxy extends roxy
{

    public void clearViews()
    {
        super.clearViews();
        ((LinkingPreSignInActivity)getTarget()).accountText = null;
        ((LinkingPreSignInActivity)getTarget()).fullnameText = null;
        ((LinkingPreSignInActivity)getTarget()).avatarImg = null;
    }

    public void injectViews()
    {
        super.injectViews();
        ((LinkingPreSignInActivity)getTarget()).accountText = (TextView)findViewById(0x7f1003bf);
        ((LinkingPreSignInActivity)getTarget()).fullnameText = (TextView)findViewById(0x7f1003be);
        ((LinkingPreSignInActivity)getTarget()).avatarImg = (CircleImageView)findViewById(0x7f1003bd);
    }

    public roxy(LinkingPreSignInActivity linkingpresigninactivity)
    {
        super(linkingpresigninactivity);
    }
}
