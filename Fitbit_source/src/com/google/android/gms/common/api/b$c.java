// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.internal.am;

// Referenced classes of package com.google.android.gms.common.api:
//            b, h, Status

public static abstract class c extends c
    implements c
{

    private final b b;
    private final h c;
    private b d;

    private void a(RemoteException remoteexception)
    {
        b(new Status(8, remoteexception.getLocalizedMessage(), null));
    }

    public final void a(dMessage dmessage)
        throws DeadObjectException
    {
        try
        {
            b(dmessage);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (dMessage dmessage)
        {
            a(((RemoteException) (dmessage)));
            throw dmessage;
        }
        // Misplaced declaration of an exception variable
        catch (dMessage dmessage)
        {
            a(((RemoteException) (dmessage)));
        }
    }

    public void a(a a1)
    {
        d = a1;
    }

    public final void b(Status status)
    {
        boolean flag;
        if (!status.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "Failed result must not be success");
        a(a(status));
    }

    protected abstract void b(us us)
        throws RemoteException;

    protected void e()
    {
        super.e();
        if (d != null)
        {
            d.a(this);
            d = null;
        }
    }

    public final d f()
    {
        am.a(c, "GoogleApiClient was not set.");
        c.b(this);
        return this;
    }

    public final c g()
    {
        return b;
    }

    public int h()
    {
        return 0;
    }

    protected us(us us, h h1)
    {
        super(h1.a());
        b = (b)am.a(us);
        c = h1;
    }
}
