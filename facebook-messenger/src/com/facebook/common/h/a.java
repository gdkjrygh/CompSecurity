// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.h;

import android.os.StrictMode;
import java.util.UUID;

public final class a
{

    public a()
    {
    }

    public static UUID a()
    {
        android.os.StrictMode.ThreadPolicy threadpolicy;
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        threadpolicy = StrictMode.allowThreadDiskReads();
        UUID uuid = UUID.randomUUID();
        StrictMode.setThreadPolicy(threadpolicy);
        return uuid;
        Exception exception;
        exception;
        StrictMode.setThreadPolicy(threadpolicy);
        throw exception;
        return UUID.randomUUID();
    }
}
