// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAddFriendsFragment

public class  extends 
{

    public void clearViews()
    {
        super.iews();
        ((MnvAddFriendsFragment)getTarget()).addFriendsDesc = null;
        ((MnvAddFriendsFragment)getTarget()).notNowButton = null;
        ((MnvAddFriendsFragment)getTarget()).addFriendsButton = null;
        ((MnvAddFriendsFragment)getTarget()).notNowButtonX = null;
        ((MnvAddFriendsFragment)getTarget()).nextButton = null;
    }

    public void injectViews()
    {
        super.Views();
        ((MnvAddFriendsFragment)getTarget()).addFriendsDesc = (TextView)findViewById(0x7f10042e);
        ((MnvAddFriendsFragment)getTarget()).notNowButton = (Button)findViewById(0x7f10045b);
        ((MnvAddFriendsFragment)getTarget()).addFriendsButton = (Button)findViewById(0x7f100433);
        ((MnvAddFriendsFragment)getTarget()).notNowButtonX = (ImageButton)findViewById(0x7f10045a);
        ((MnvAddFriendsFragment)getTarget()).nextButton = (ImageButton)findViewById(0x7f100434);
    }

    public (MnvAddFriendsFragment mnvaddfriendsfragment)
    {
        super(mnvaddfriendsfragment);
    }
}
