// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            m, z

public static final class b extends b
{

    private m a;
    private final int b;

    private void a()
    {
        a = null;
    }

    public void a(int i, Bundle bundle)
    {
        z.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
        a.zza(i, bundle, b);
        a();
    }

    public void a(int i, IBinder ibinder, Bundle bundle)
    {
        z.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
        a.zza(i, ibinder, bundle, b);
        a();
    }

    public (m m1, int i)
    {
        a = m1;
        b = i;
    }
}
