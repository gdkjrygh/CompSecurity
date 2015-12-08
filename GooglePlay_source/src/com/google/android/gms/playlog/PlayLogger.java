// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.playlog.internal.LoggerConnectionCallbacks;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import com.google.android.gms.playlog.internal.PlayLoggerImpl;

public final class PlayLogger
{
    public static interface LoggerCallbacks
    {

        public abstract void onLoggerConnected();

        public abstract void onLoggerFailedConnection();

        public abstract void onLoggerFailedConnectionWithResolution(PendingIntent pendingintent);
    }


    public PlayLoggerContext mLoggerContext;
    public final PlayLoggerImpl mLoggerImpl;

    public PlayLogger(Context context, int i, String s, String s1, LoggerCallbacks loggercallbacks, boolean flag, String s2)
    {
        int j;
        s1 = context.getPackageName();
        j = 0;
        int k = context.getPackageManager().getPackageInfo(s1, 0).versionCode;
        j = k;
_L2:
        mLoggerContext = new PlayLoggerContext(s1, j, i, s, null, true);
        mLoggerImpl = new PlayLoggerImpl(context, context.getMainLooper(), new LoggerConnectionCallbacks(loggercallbacks), new ClientSettings(null, null, null, 49, null, s1, s2, null));
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.wtf("PlayLogger", "This can't happen.", namenotfoundexception);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
