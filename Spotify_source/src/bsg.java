// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

public final class bsg extends bsy
{

    private bsc a;
    private final int b;

    public bsg(bsc bsc1, int i)
    {
        a = bsc1;
        b = i;
    }

    public final void a(int i, Bundle bundle)
    {
        btl.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
        bsc bsc1 = a;
        int j = b;
        bsc1.h.sendMessage(bsc1.h.obtainMessage(5, j, -1, new bsl(bsc1, i, bundle)));
        a = null;
    }

    public final void a(int i, IBinder ibinder, Bundle bundle)
    {
        btl.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
        a.a(i, ibinder, bundle, b);
        a = null;
    }
}
