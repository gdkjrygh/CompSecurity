// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.widget.ImageButton;
import android.widget.TextView;
import com.skype.android.widget.SkypeAvatarView;

// Referenced classes of package com.skype.android.app.main:
//            HubActivity

public class  extends ..Proxy
{

    public void clearViews()
    {
        super.clearViews();
        ((HubActivity)getTarget()).addContactsButton = null;
        ((HubActivity)getTarget()).moodText = null;
        ((HubActivity)getTarget()).avatarImage = null;
        ((HubActivity)getTarget()).callButton = null;
        ((HubActivity)getTarget()).overflowButton = null;
        ((HubActivity)getTarget()).chatButton = null;
    }

    public void injectViews()
    {
        super.injectViews();
        ((HubActivity)getTarget()).addContactsButton = (ImageButton)findViewById(0x7f10037e);
        ((HubActivity)getTarget()).moodText = (TextView)findViewById(0x7f100381);
        ((HubActivity)getTarget()).avatarImage = (SkypeAvatarView)findViewById(0x7f100382);
        ((HubActivity)getTarget()).callButton = (ImageButton)findViewById(0x7f1002c0);
        ((HubActivity)getTarget()).overflowButton = (ImageButton)findViewById(0x7f100380);
        ((HubActivity)getTarget()).chatButton = (ImageButton)findViewById(0x7f10037d);
    }

    public (HubActivity hubactivity)
    {
        super(hubactivity);
    }
}
