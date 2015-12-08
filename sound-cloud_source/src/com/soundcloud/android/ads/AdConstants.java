// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import java.util.concurrent.TimeUnit;

public final class AdConstants
{

    public static final int IAB_UNIVERSAL_MED_HEIGHT = 250;
    public static final int IAB_UNIVERSAL_MED_MAX_SCALE = 2;
    public static final int IAB_UNIVERSAL_MED_WIDTH = 300;
    public static final long UNSKIPPABLE_TIME_MS;
    public static final int UNSKIPPABLE_TIME_SECS = 15;

    public AdConstants()
    {
    }

    static 
    {
        UNSKIPPABLE_TIME_MS = TimeUnit.SECONDS.toMillis(15L);
    }
}
