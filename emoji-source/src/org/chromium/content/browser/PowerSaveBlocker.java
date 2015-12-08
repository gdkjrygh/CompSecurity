// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import org.chromium.ui.base.ViewAndroid;

class PowerSaveBlocker
{

    PowerSaveBlocker()
    {
    }

    private static void applyBlock(ViewAndroid viewandroid)
    {
        viewandroid.incrementKeepScreenOnCount();
    }

    private static void removeBlock(ViewAndroid viewandroid)
    {
        viewandroid.decrementKeepScreenOnCount();
    }
}
