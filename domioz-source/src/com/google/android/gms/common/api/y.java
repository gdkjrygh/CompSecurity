// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ap;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api:
//            a, ar, z, l, 
//            j, Status, u, ap, 
//            h

public abstract class y extends a
    implements ar, z
{

    private final j b;
    private AtomicReference c;

    protected y(j j1, l l1)
    {
        super(((l)ap.a(l1, "GoogleApiClient must not be null")).b());
        c = new AtomicReference();
        b = (j)ap.a(j1);
    }

    private void a(RemoteException remoteexception)
    {
        b(new Status(remoteexception.getLocalizedMessage()));
    }

    public final void a(com.google.android.gms.common.api.ap ap1)
    {
        c.set(ap1);
    }

    public final void a(h h)
    {
        try
        {
            b(h);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (h h)
        {
            a(((RemoteException) (h)));
            throw h;
        }
        // Misplaced declaration of an exception variable
        catch (h h)
        {
            a(((RemoteException) (h)));
        }
    }

    public final void a(Object obj)
    {
        super.a((u)obj);
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
        ap.b(flag, "Failed result must not be success");
        a(a(status));
    }

    protected abstract void b(h h);

    protected final void c()
    {
        com.google.android.gms.common.api.ap ap1 = (com.google.android.gms.common.api.ap)c.getAndSet(null);
        if (ap1 != null)
        {
            ap1.a(this);
        }
    }

    public final j e()
    {
        return b;
    }
}
