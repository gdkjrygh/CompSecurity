// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            j, u

public static final class b extends b
{

    private j a;
    private final int b;

    public final void a(int i, Bundle bundle)
    {
        u.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
        j j1 = a;
        int k = b;
        j1.b.sendMessage(j1.b.obtainMessage(5, k, -1, new <init>(j1, i, bundle)));
        a = null;
    }

    public final void a(int i, IBinder ibinder, Bundle bundle)
    {
        u.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
        a.a(i, ibinder, bundle, b);
        a = null;
    }

    public (j j1, int i)
    {
        a = j1;
        b = i;
    }
}
