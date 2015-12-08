// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.ak;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            uu, uj, ut, tt, 
//            to

public final class ts
    implements uu
{

    private final uj a;

    public ts(uj uj1)
    {
        a = uj1;
    }

    private void a(ut ut1)
    {
        a.a(ut1);
        c c1 = a.a(ut1.b());
        if (!c1.isConnected() && a.e.containsKey(ut1.b()))
        {
            ut1.b(new Status(17));
            return;
        } else
        {
            ut1.b(c1);
            return;
        }
    }

    private to b(to to)
    {
        try
        {
            a(to);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a.a(new tt(this, this));
            return to;
        }
        return to;
    }

    public final to a(to to)
    {
        return b(to);
    }

    public final void a()
    {
        while (!a.b.isEmpty()) 
        {
            try
            {
                a((ut)a.b.remove());
            }
            catch (DeadObjectException deadobjectexception)
            {
                Log.w("GACConnected", "Service died while flushing queue", deadobjectexception);
            }
        }
    }

    public final void a(int i)
    {
        if (i == 1)
        {
            a.i();
        }
        for (Iterator iterator = a.j.iterator(); iterator.hasNext(); ((ut)iterator.next()).c(new Status(8, "The connection to Google Play services was lost"))) { }
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

    public final void b()
    {
        a.e.clear();
        a.d();
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
