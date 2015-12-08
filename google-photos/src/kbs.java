// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

public final class kbs extends kck
{

    private kbo a;
    private final int b;

    public kbs(kbo kbo1, int i)
    {
        a = kbo1;
        b = i;
    }

    public final void a(int i, Bundle bundle)
    {
        b.f(a, "onAccountValidationComplete can be called only once per call to validateAccount");
        kbo kbo1 = a;
        int j = b;
        kbo1.h.sendMessage(kbo1.h.obtainMessage(5, j, -1, new kbx(kbo1, i, bundle)));
        a = null;
    }

    public final void a(int i, IBinder ibinder, Bundle bundle)
    {
        b.f(a, "onPostInitComplete can be called only once per call to getRemoteService");
        a.a(i, ibinder, bundle, b);
        a = null;
    }
}
