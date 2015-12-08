// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.os.Build;

public interface PlaybackConstants
{

    public static final boolean FORCE_MEDIA_PLAYER = flag;
    public static final String MARSHALL_BRAND = "Marshall";
    public static final String MARSHALL_MODEL = "London";
    public static final long PROGRESS_DELAY_MS = 500L;

    
    {
        boolean flag;
        if ("London".equalsIgnoreCase(Build.MODEL) && "Marshall".equals(Build.BRAND))
        {
            flag = true;
        } else
        {
            flag = false;
        }
    }
}
