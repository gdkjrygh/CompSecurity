// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.y;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            p, o, Status, a

public final class l
    implements p
{

    private final o a;

    public l(o o1)
    {
        a = o1;
    }

    private void a(o.e e)
        throws DeadObjectException
    {
        a.a(e);
        Object obj = a;
        a.c c1 = e.c();
        obj = (a.b)((o) (obj)).d.get(c1);
        y.a(obj, "Appropriate Api was not requested.");
        if (!((a.b) (obj)).e() && a.e.containsKey(e.c()))
        {
            e.c(new Status(17));
            return;
        } else
        {
            e.b(((a.b) (obj)));
            return;
        }
    }

    public final k.a a(k.a a1)
    {
        return b(a1);
    }

    public final void a()
    {
        while (!a.b.isEmpty()) 
        {
            try
            {
                a((o.e)a.b.remove());
            }
            catch (DeadObjectException deadobjectexception)
            {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", deadobjectexception);
            }
        }
    }

    public final void a(int i)
    {
        if (i == 1)
        {
            a.j();
        }
        for (Iterator iterator = a.j.iterator(); iterator.hasNext(); ((o.e)iterator.next()).b(new Status(8, "The connection to Google Play services was lost"))) { }
        a.a(null);
        a.a.a(i);
        a.a.a();
        if (i == 2)
        {
            a.b();
        }
    }

    public final void a(Bundle bundle)
    {
    }

    public final void a(ConnectionResult connectionresult, a a1, int i)
    {
    }

    public final k.a b(k.a a1)
    {
        try
        {
            a(a1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a.a(new o.b(this) {

                final l a;

                public final void a()
                {
                    a.a(1);
                }

            
            {
                a = l.this;
                super(p1);
            }
            });
            return a1;
        }
        return a1;
    }

    public final void b()
    {
        a.e.clear();
        a.f();
        a.a(null);
        a.a.a();
    }

    public final void c()
    {
    }

    public final String d()
    {
        return "CONNECTED";
    }
}
