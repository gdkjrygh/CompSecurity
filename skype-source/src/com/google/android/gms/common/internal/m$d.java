// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            m, y

public static final class b extends b
{

    private m a;
    private final int b;

    public final void a(int i, Bundle bundle)
    {
        y.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
        m m1 = a;
        int j = b;
        m1.b.sendMessage(m1.b.obtainMessage(5, j, -1, new <init>(m1, i, bundle)));
        a = null;
    }

    public final void a(int i, IBinder ibinder, Bundle bundle)
    {
        y.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
        a.a(i, ibinder, bundle, b);
        a = null;
    }

    public (m m1, int i)
    {
        a = m1;
        b = i;
    }
}
