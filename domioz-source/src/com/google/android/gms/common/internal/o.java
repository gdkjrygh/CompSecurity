// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            af, ap, k, s

public final class o extends af
{

    private k a;

    public o(k k1)
    {
        a = k1;
    }

    public final void a(int i, Bundle bundle)
    {
        ap.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
        k k1 = a;
        k1.a.sendMessage(k1.a.obtainMessage(5, new s(k1, i, bundle)));
        a = null;
    }

    public final void a(int i, IBinder ibinder, Bundle bundle)
    {
        ap.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
        a.a(i, ibinder, bundle);
        a = null;
    }
}
