// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.util;

import android.content.res.Configuration;
import android.view.Display;

public final class ScreenManager
{

    private final Display display;
    private final Configuration sysConfig;

    public ScreenManager(Configuration configuration, Display display1)
    {
        sysConfig = configuration;
        display = display1;
    }

    public final int getDisplayRotation()
    {
        return display.getRotation();
    }

    public final int getScreenOrientation()
    {
        int i = sysConfig.orientation;
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            return i;

        case 0: // '\0'
        case 3: // '\003'
            break;
        }
        return display.getWidth() >= display.getHeight() ? 2 : 1;
    }

    public final boolean isInPortraitMode()
    {
        return getScreenOrientation() == 1;
    }
}
