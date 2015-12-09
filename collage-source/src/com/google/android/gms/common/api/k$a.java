// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.z;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api:
//            i, k, c, Status, 
//            g

public static abstract class .z.a extends i
    implements .z.a, .z.a
{

    private final b b;
    private AtomicReference c;

    private void a(RemoteException remoteexception)
    {
        d(new Status(8, remoteexception.getLocalizedMessage(), null));
    }

    protected abstract void a(dMessage dmessage)
        throws RemoteException;

    public void a(dMessage dmessage)
    {
        c.set(dmessage);
    }

    public void a(Object obj)
    {
        super.a((g)obj);
    }

    public final void b(rence.set set)
        throws DeadObjectException
    {
        try
        {
            a(set);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (rence.set set)
        {
            a(set);
            throw set;
        }
        // Misplaced declaration of an exception variable
        catch (rence.set set)
        {
            a(set);
        }
    }

    protected void d()
    {
        a a1 = (a)c.getAndSet(null);
        if (a1 != null)
        {
            a1.a(this);
        }
    }

    public final void d(Status status)
    {
        boolean flag;
        if (!status.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.b(flag, "Failed result must not be success");
        a(b(status));
    }

    public final us e()
    {
        return b;
    }

    public int f()
    {
        return 0;
    }

    protected us(us us, c c1)
    {
        super(((c)z.a(c1, "GoogleApiClient must not be null")).a());
        c = new AtomicReference();
        b = (b)z.a(us);
    }
}
