// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.u;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            us, ut

final class uq
    implements android.os.IBinder.DeathRecipient, us
{

    private final WeakReference a;
    private final WeakReference b;
    private final WeakReference c;

    private uq(ut ut1, u u1, IBinder ibinder)
    {
        b = new WeakReference(u1);
        a = new WeakReference(ut1);
        c = new WeakReference(ibinder);
    }

    uq(ut ut1, u u1, IBinder ibinder, byte byte0)
    {
        this(ut1, u1, ibinder);
    }

    private void a()
    {
        Object obj = (ut)a.get();
        u u1 = (u)b.get();
        if (u1 != null && obj != null)
        {
            ((ut) (obj)).a().intValue();
            u1.a();
        }
        obj = (IBinder)c.get();
        if (c != null)
        {
            ((IBinder) (obj)).unlinkToDeath(this, 0);
        }
    }

    public final void a(ut ut1)
    {
        a();
    }

    public final void binderDied()
    {
        a();
    }
}
