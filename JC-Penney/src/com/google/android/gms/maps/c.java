// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.maps.a.d;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.f;

// Referenced classes of package com.google.android.gms.maps:
//            a, e, d, n, 
//            f, g

public final class c
{

    private final d a;
    private n b;

    protected c(d d1)
    {
        a = (d)u.a(d1);
    }

    d a()
    {
        return a;
    }

    public final e a(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = a.a(markeroptions);
        }
        // Misplaced declaration of an exception variable
        catch (MarkerOptions markeroptions)
        {
            throw new f(markeroptions);
        }
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        markeroptions = new e(markeroptions);
        return markeroptions;
        return null;
    }

    public final void a(a a1)
    {
        try
        {
            a.b(a1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new f(a1);
        }
    }

    public final void a(com.google.android.gms.maps.f f1)
    {
        if (f1 == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.maps.f f1)
            {
                throw new f(f1);
            }
        }
        a.a(new com.google.android.gms.maps.e(this, f1));
        return;
    }

    public final void a(g g)
    {
        if (g == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (g g)
            {
                throw new f(g);
            }
        }
        a.a(new com.google.android.gms.maps.d(this, g));
        return;
    }

    public final void b()
    {
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
    }

    public final n c()
    {
        n n1;
        try
        {
            if (b == null)
            {
                b = new n(a.k());
            }
            n1 = b;
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
        return n1;
    }
}
