// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.cheat.popup.manager;

import android.content.Context;
import android.hardware.display.DisplayManager;
import com.google.android.gms.common.util.PlatformVersion;

public final class CodeListenerContextManager
{

    public static Context getContext(Context context, int i)
    {
        if (!PlatformVersion.checkVersion(17) || i == -1)
        {
            return context;
        } else
        {
            return context.createDisplayContext(((DisplayManager)context.getSystemService("display")).getDisplay(i));
        }
    }
}
