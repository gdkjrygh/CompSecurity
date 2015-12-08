// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;
import com.skype.android.widget.SkypeAvatarView;

// Referenced classes of package com.skype.android.app.contacts:
//            OffNetworkInviteActivity

public class  extends com.skype.android.ivity..Proxy
{

    public void clearViews()
    {
        super.Proxy();
        ((OffNetworkInviteActivity)getTarget()).nameView = null;
        ((OffNetworkInviteActivity)getTarget()).contactInfoView = null;
        ((OffNetworkInviteActivity)getTarget()).toolbar = null;
        ((OffNetworkInviteActivity)getTarget()).inviteButton = null;
        ((OffNetworkInviteActivity)getTarget()).moodView = null;
        ((OffNetworkInviteActivity)getTarget()).avatarView = null;
    }

    public void injectViews()
    {
        super.();
        ((OffNetworkInviteActivity)getTarget()).nameView = (TextView)findViewById(0x7f100469);
        ((OffNetworkInviteActivity)getTarget()).contactInfoView = (TextView)findViewById(0x7f10046a);
        ((OffNetworkInviteActivity)getTarget()).toolbar = (Toolbar)findViewById(0x7f1002cf);
        ((OffNetworkInviteActivity)getTarget()).inviteButton = (Button)findViewById(0x7f100485);
        ((OffNetworkInviteActivity)getTarget()).moodView = (TextView)findViewById(0x7f10022f);
        ((OffNetworkInviteActivity)getTarget()).avatarView = (SkypeAvatarView)findViewById(0x7f10022d);
    }

    public (OffNetworkInviteActivity offnetworkinviteactivity)
    {
        super(offnetworkinviteactivity);
    }
}
