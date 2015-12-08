// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.widget.TextView;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.chat:
//            AppNotInstalledActivity

public class  extends com.skype.android.y..Proxy
{

    public void clearViews()
    {
        super.();
        ((AppNotInstalledActivity)getTarget()).goToStoreText = null;
        ((AppNotInstalledActivity)getTarget()).titleText = null;
        ((AppNotInstalledActivity)getTarget()).goToStoreLink = null;
        ((AppNotInstalledActivity)getTarget()).titleSymbol = null;
        ((AppNotInstalledActivity)getTarget()).description = null;
        ((AppNotInstalledActivity)getTarget()).cancelLink = null;
    }

    public void injectViews()
    {
        super.s();
        ((AppNotInstalledActivity)getTarget()).goToStoreText = (TextView)findViewById(0x7f100223);
        ((AppNotInstalledActivity)getTarget()).titleText = (TextView)findViewById(0x7f100221);
        ((AppNotInstalledActivity)getTarget()).goToStoreLink = (TextView)findViewById(0x7f100223);
        ((AppNotInstalledActivity)getTarget()).titleSymbol = (SymbolView)findViewById(0x7f100220);
        ((AppNotInstalledActivity)getTarget()).description = (TextView)findViewById(0x7f100222);
        ((AppNotInstalledActivity)getTarget()).cancelLink = (TextView)findViewById(0x7f100224);
    }

    public (AppNotInstalledActivity appnotinstalledactivity)
    {
        super(appnotinstalledactivity);
    }
}
