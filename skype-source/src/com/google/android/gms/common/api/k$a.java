// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.y;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api:
//            i, k, c, Status, 
//            g

public static abstract class .y.a extends i
    implements .y.a, .y.a
{

    private final us b;
    private AtomicReference c;

    private void a(RemoteException remoteexception)
    {
        c(new Status(remoteexception.getLocalizedMessage()));
    }

    protected abstract void a(dMessage dmessage)
        throws RemoteException;

    public final void a(dMessage dmessage)
    {
        c.set(dmessage);
    }

    public final void a(Object obj)
    {
        super.a((g)obj);
    }

    protected final void b()
    {
        rence.set set = (rence.set)c.getAndSet(null);
        if (set != null)
        {
            set.a(this);
        }
    }

    public final void b(a a1)
        throws DeadObjectException
    {
        try
        {
            a(a1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            a(a1);
            throw a1;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            a(a1);
        }
    }

    public final a c()
    {
        return b;
    }

    public final void c(Status status)
    {
        boolean flag;
        if (!status.d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.b(flag, "Failed result must not be success");
        a(a(status));
    }

    protected us(us us, c c1)
    {
        super(((c)y.a(c1, "GoogleApiClient must not be null")).a());
        c = new AtomicReference();
        b = (b)y.a(us);
    }
}
