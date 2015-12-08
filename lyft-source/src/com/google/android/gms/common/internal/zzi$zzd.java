// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzu, zzi

public final class b extends b
{

    private zzi a;
    private final int b;

    private void a()
    {
        a = null;
    }

    public void a(int i, Bundle bundle)
    {
        zzu.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
        a.a(i, bundle, b);
        a();
    }

    public void a(int i, IBinder ibinder, Bundle bundle)
    {
        zzu.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
        a.a(i, ibinder, bundle, b);
        a();
    }

    public (zzi zzi1, int i)
    {
        a = zzi1;
        b = i;
    }
}
