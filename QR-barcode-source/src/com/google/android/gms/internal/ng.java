// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            nm, no, nl, ni

public class ng
{
    public static interface a
    {

        public abstract void b(PendingIntent pendingintent);

        public abstract void mU();

        public abstract void mV();
    }


    private final no akF;
    private nm akG;

    public ng(Context context, int i, String s, String s1, a a1, boolean flag)
    {
        String s2;
        int j;
        j = 0;
        super();
        s2 = context.getPackageName();
        int k = context.getPackageManager().getPackageInfo(s2, 0).versionCode;
        j = k;
_L2:
        akG = new nm(s2, j, i, s, s1, flag);
        akF = new no(context, new nl(a1));
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.wtf("PlayLogger", "This can't happen.");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public transient void a(long l, String s, byte abyte0[], String as[])
    {
        akF.b(akG, new ni(l, s, abyte0, as));
    }

    public transient void b(String s, byte abyte0[], String as[])
    {
        a(System.currentTimeMillis(), s, abyte0, as);
    }

    public void start()
    {
        akF.start();
    }

    public void stop()
    {
        akF.stop();
    }
}
