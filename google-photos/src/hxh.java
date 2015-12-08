// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class hxh
    implements nuc, opl, ops, opv
{

    public final nud a = new ntz(this);
    final Map b = new HashMap();
    final Map c = new HashMap();
    hxi d;
    boolean e;

    public hxh(opd opd1)
    {
        d = hxi.c;
        opd1.a(this);
    }

    private void f()
    {
        a.b();
    }

    public final nud a()
    {
        return a;
    }

    public final void a(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        }
        d = hxi.valueOf(bundle.getString("com.google.android.apps.photos.search.suggestions.ExtraPeopleHidingMode"));
        for (Iterator iterator = bundle.getParcelableArrayList("com.google.android.apps.photos.search.suggestions.ExtraPeopleHidingClustersToHide").iterator(); iterator.hasNext(); a((hsi)iterator.next())) { }
        for (bundle = bundle.getParcelableArrayList("com.google.android.apps.photos.search.suggestions.ExtraPeopleHidingClustersToShow").iterator(); bundle.hasNext(); b((hsi)bundle.next())) { }
        f();
    }

    public final void a(hsi hsi1)
    {
        if (c.containsKey(Integer.valueOf(hsi1.b())))
        {
            c.remove(Integer.valueOf(hsi1.b()));
        } else
        {
            b.put(Integer.valueOf(hsi1.b()), hsi1);
        }
        hsi1.h_(false);
    }

    public final void a(hxi hxi1)
    {
        e = true;
        d = hxi1;
        f();
    }

    public final void b()
    {
        d = hxi.c;
        f();
    }

    public final void b(hsi hsi1)
    {
        if (b.containsKey(Integer.valueOf(hsi1.b())))
        {
            b.remove(Integer.valueOf(hsi1.b()));
        } else
        {
            c.put(Integer.valueOf(hsi1.b()), hsi1);
        }
        hsi1.h_(true);
        if (d == hxi.a && b.isEmpty())
        {
            c();
        }
    }

    public final void c()
    {
        boolean flag;
        if (d != hxi.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        for (Iterator iterator = b.values().iterator(); iterator.hasNext(); ((hsi)iterator.next()).h_(true)) { }
        for (Iterator iterator1 = c.values().iterator(); iterator1.hasNext(); ((hsi)iterator1.next()).h_(false)) { }
        d();
        b();
    }

    public final void d()
    {
        b.clear();
        c.clear();
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelableArrayList("com.google.android.apps.photos.search.suggestions.ExtraPeopleHidingClustersToHide", new ArrayList(b.values()));
        bundle.putParcelableArrayList("com.google.android.apps.photos.search.suggestions.ExtraPeopleHidingClustersToShow", new ArrayList(c.values()));
        bundle.putString("com.google.android.apps.photos.search.suggestions.ExtraPeopleHidingMode", d.toString());
    }

    public final boolean e()
    {
        return d != hxi.c;
    }
}
