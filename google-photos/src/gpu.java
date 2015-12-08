// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class gpu
    implements nug, omb, opl, opn, opv
{

    final Map a = new HashMap();
    public final Set b = new HashSet();
    public final Set c = new HashSet();
    public gpx d;
    private final Set e = new HashSet();
    private final Set f = new HashSet();
    private final Runnable g = new gpv(this);

    public gpu(opd opd1)
    {
        opd1.a(this);
    }

    static Set a(gpu gpu1)
    {
        return gpu1.e;
    }

    private void a()
    {
        b.a(g, true);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (gpx)olm1.b(gpx);
    }

    public final void a(Bundle bundle)
    {
        if (d != null)
        {
            d.a().a(this, false);
        }
    }

    public final void a(ds ds)
    {
        b.add(ds);
    }

    public final void a(ds ds, boolean flag)
    {
        boolean flag2 = f.remove(ds);
        boolean flag1;
        if (flag)
        {
            flag1 = flag2 | c.add(ds);
        } else
        {
            flag1 = flag2 | c.remove(ds);
        }
        if (flag1)
        {
            a();
        }
    }

    public final void a(gpz gpz)
    {
        e.add(gpz);
    }

    public final void b(ds ds)
    {
        if (!c(ds))
        {
            return;
        } else
        {
            b.a(new gpw(this, (Set)a.get(ds), ds));
            return;
        }
    }

    public final void b(gpz gpz)
    {
        e.remove(gpz);
    }

    public final void b_(Object obj)
    {
        a();
    }

    public final void c()
    {
        if (d != null)
        {
            d.a().a(this);
        }
    }

    boolean c(ds ds)
    {
        ds = (Set)a.get(ds);
        return ds != null && !ds.isEmpty();
    }
}
