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
//            ov, ox, ou, or

public class op
{
    public static interface a
    {

        public abstract void d(PendingIntent pendingintent);

        public abstract void on();

        public abstract void oo();
    }


    private final ox amU;
    private ov amV;

    public op(Context context, int i, String s, String s1, a a1, boolean flag)
    {
        String s2;
        int j;
        j = 0;
        super();
        s2 = context.getPackageName();
        int k = context.getPackageManager().getPackageInfo(s2, 0).versionCode;
        j = k;
_L2:
        amV = new ov(s2, j, i, s, s1, flag);
        amU = new ox(context, new ou(a1));
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.wtf("PlayLogger", "This can't happen.");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public transient void a(long l, String s, byte abyte0[], String as[])
    {
        amU.b(amV, new or(l, s, abyte0, as));
    }

    public transient void b(String s, byte abyte0[], String as[])
    {
        a(System.currentTimeMillis(), s, abyte0, as);
    }

    public void start()
    {
        amU.start();
    }

    public void stop()
    {
        amU.stop();
    }
}
