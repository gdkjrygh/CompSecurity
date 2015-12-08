// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.n;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            o, n, Status, a

public class l
    implements o
{

    private final com.google.android.gms.common.api.n a;

    public l(com.google.android.gms.common.api.n n1)
    {
        a = n1;
    }

    private void a(n.e e)
        throws DeadObjectException
    {
        a.a(e);
        a.c c1 = a.a(e.e());
        if (!c1.isConnected() && a.e.containsKey(e.e()))
        {
            e.d(new Status(17));
            return;
        } else
        {
            e.b(c1);
            return;
        }
    }

    public k.a a(k.a a1)
    {
        return b(a1);
    }

    public void a()
    {
        while (!a.b.isEmpty()) 
        {
            try
            {
                a((n.e)a.b.remove());
            }
            catch (DeadObjectException deadobjectexception)
            {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", deadobjectexception);
            }
        }
    }

    public void a(int i)
    {
        if (i == 1)
        {
            a.k();
        }
        for (Iterator iterator = a.j.iterator(); iterator.hasNext(); ((n.e)iterator.next()).c(new Status(8, "The connection to Google Play services was lost"))) { }
        a.a(null);
        a.a.a(i);
        a.a.a();
        if (i == 2)
        {
            a.b();
        }
    }

    public void a(Bundle bundle)
    {
    }

    public void a(ConnectionResult connectionresult, a a1, int i)
    {
    }

    public k.a b(k.a a1)
    {
        try
        {
            a(a1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a.a(new n.b(this) {

                final l a;

                public void a()
                {
                    a.a(1);
                }

            
            {
                a = l.this;
                super(o1);
            }
            });
            return a1;
        }
        return a1;
    }

    public void b()
    {
        a.e.clear();
        a.f();
        a.a(null);
        a.a.a();
    }

    public void c()
    {
    }

    public String d()
    {
        return "CONNECTED";
    }
}
