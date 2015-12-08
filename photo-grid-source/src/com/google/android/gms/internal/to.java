// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.bl;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal:
//            tq, tp, ut, us

public abstract class to extends tq
    implements tp, ut
{

    private final d b;
    private AtomicReference c;

    protected to(d d1, h h1)
    {
        super(((h)bl.a(h1, "GoogleApiClient must not be null")).a());
        c = new AtomicReference();
        b = (d)bl.a(d1);
    }

    private void a(RemoteException remoteexception)
    {
        b(new Status(remoteexception.getLocalizedMessage()));
    }

    protected abstract void a(c c1);

    public final void a(us us1)
    {
        c.set(us1);
    }

    public final void a(Object obj)
    {
        super.a((r)obj);
    }

    public final d b()
    {
        return b;
    }

    public final void b(Status status)
    {
        boolean flag;
        if (!status.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.b(flag, "Failed result must not be success");
        a(a(status));
    }

    public final void b(c c1)
    {
        try
        {
            a(c1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            a(c1);
            throw c1;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            a(c1);
        }
    }

    public final void c()
    {
        a(((com.google.android.gms.common.api.s) (null)));
    }

    protected final void d()
    {
        us us1 = (us)c.getAndSet(null);
        if (us1 != null)
        {
            us1.a(this);
        }
    }
}
