// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.jg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            h, g, p, Scope, 
//            a

public static final class m
{

    private String a;
    private final Set b;
    private int c;
    private View d;
    private String e;
    private final Context f;
    private final Map g;
    private FragmentActivity h;
    private int i;
    private y j;
    private Looper k;
    private final Set l;
    private final Set m;

    private h d()
    {
        g g1 = com.google.android.gms.common.api.g.a(h);
        h h1 = g1.a(i);
        Object obj = h1;
        if (h1 == null)
        {
            obj = new p(f.getApplicationContext(), k, b(), g, l, m, i);
        }
        g1.a(i, ((h) (obj)), j);
        return ((h) (obj));
    }

    public j a()
    {
        return a("<<default account>>");
    }

    public a a(int i1)
    {
        c = i1;
        return this;
    }

    public c a(Handler handler)
    {
        am.a(handler, "Handler must not be null");
        k = handler.getLooper();
        return this;
    }

    public y a(FragmentActivity fragmentactivity, int i1, y y)
    {
        boolean flag;
        if (i1 >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "clientId must be non-negative");
        i = i1;
        h = (FragmentActivity)am.a(fragmentactivity, "Null activity is not permitted.");
        j = y;
        return this;
    }

    public j a(View view)
    {
        d = view;
        return this;
    }

    public e a(Scope scope)
    {
        b.add(scope.a());
        return this;
    }

    public e.a a(a a1)
    {
        g.put(a1, null);
        a1 = a1.b();
        int j1 = a1.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            b.add(((Scope)a1.get(i1)).a());
        }

        return this;
    }

    public a a(a a1, a a2)
    {
        am.a(a2, "Null options are not permitted for this Api");
        g.put(a1, a2);
        a1 = a1.b();
        int j1 = a1.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            b.add(((Scope)a1.get(i1)).a());
        }

        return this;
    }

    public e.a a(e.a a1)
    {
        l.add(a1);
        return this;
    }

    public l a(l l1)
    {
        m.add(l1);
        return this;
    }

    public m a(String s)
    {
        a = s;
        return this;
    }

    public jg b()
    {
        return new jg(a, b, c, d, e);
    }

    public h c()
    {
        boolean flag;
        if (!g.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "must call addApi() to add at least one API");
        if (i >= 0)
        {
            return d();
        } else
        {
            return new p(f, k, b(), g, l, m, -1);
        }
    }

    public a(Context context)
    {
        b = new HashSet();
        g = new HashMap();
        i = -1;
        l = new HashSet();
        m = new HashSet();
        f = context;
        k = context.getMainLooper();
        e = context.getPackageName();
    }

    public (Context context,  ,  1)
    {
        this(context);
        am.a(, "Must provide a connected listener");
        l.add();
        am.a(1, "Must provide a connection failed listener");
        m.add(1);
    }
}
