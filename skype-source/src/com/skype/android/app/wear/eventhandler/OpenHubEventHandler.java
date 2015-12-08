// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import android.content.Context;
import com.google.android.gms.common.api.c;
import com.skype.android.app.BackgroundNavigation;

public class OpenHubEventHandler extends com.skype.android.app.wear.EventHandler.EventHandlerAdapter
{

    private final BackgroundNavigation navigation;

    public OpenHubEventHandler(BackgroundNavigation backgroundnavigation)
    {
        navigation = backgroundnavigation;
    }

    public void handle(Context context, c c, String s)
    {
        navigation.upToHome();
    }
}
