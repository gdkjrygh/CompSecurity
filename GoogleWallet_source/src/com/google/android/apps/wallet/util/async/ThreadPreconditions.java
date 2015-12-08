// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import android.os.Looper;
import com.google.common.base.Preconditions;

public final class ThreadPreconditions
{

    private static void checkNotOnThread(Looper looper, String s)
    {
        boolean flag;
        if (Looper.myLooper() != looper)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, s);
    }

    public static void checkOnBackgroundThread()
    {
        checkNotOnThread(Looper.getMainLooper(), "Should not be called on the UI thread.");
    }

    public static void checkOnThread(Looper looper, String s)
    {
        boolean flag;
        if (Looper.myLooper() != null && Looper.myLooper() == looper)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, s);
    }

    public static void checkOnUiThread()
    {
        checkOnThread(Looper.getMainLooper(), "Must be called on the UI thread.");
    }
}
