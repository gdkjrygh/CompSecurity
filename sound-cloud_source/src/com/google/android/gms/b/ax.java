// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import com.google.android.gms.playlog.internal.d;
import com.google.android.gms.playlog.internal.f;

public final class ax
{
    public static interface a
    {

        public abstract void a(PendingIntent pendingintent);

        public abstract void b();
    }


    public final f a;
    public PlayLoggerContext b;

    public ax(Context context, a a1, String s)
    {
        String s1;
        int i;
        i = 0;
        super();
        s1 = context.getPackageName();
        int j = context.getPackageManager().getPackageInfo(s1, 0).versionCode;
        i = j;
_L2:
        b = new PlayLoggerContext(s1, i, 10);
        a = new f(context, context.getMainLooper(), new d(a1), new zzf(null, null, null, 49, null, s1, s, null));
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.wtf("PlayLogger", "This can't happen.");
        if (true) goto _L2; else goto _L1
_L1:
    }
}
