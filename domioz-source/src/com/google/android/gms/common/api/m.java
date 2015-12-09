// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.internal.lg;
import com.google.android.gms.internal.ll;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            c, Scope, au, av, 
//            aa, o, i, e, 
//            n, l

public final class m
{

    private Account a;
    private final Set b = new HashSet();
    private int c;
    private View d;
    private String e;
    private String f;
    private final Context g;
    private final Map h = new HashMap();
    private final Map i = new HashMap();
    private FragmentActivity j;
    private int k;
    private o l;
    private Looper m;
    private i n;
    private final Set o = new HashSet();
    private final Set p = new HashSet();
    private ll q;

    public m(Context context)
    {
        k = -1;
        q = new ll();
        g = context;
        m = context.getMainLooper();
        e = context.getPackageName();
        f = context.getClass().getName();
        n = lg.b;
    }

    public final m a()
    {
        a = null;
        return this;
    }

    public final m a(c c1)
    {
        h.put(c1, null);
        c1 = c1.b();
        int j1 = c1.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            b.add(((Scope)c1.get(i1)).a());
        }

        return this;
    }

    public final m a(c c1, e e1)
    {
        ap.a(e1, "Null options are not permitted for this Api");
        h.put(c1, e1);
        c1 = c1.b();
        int j1 = c1.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            b.add(((Scope)c1.get(i1)).a());
        }

        return this;
    }

    public final m a(n n1)
    {
        o.add(n1);
        return this;
    }

    public final m a(o o1)
    {
        p.add(o1);
        return this;
    }

    public final h b()
    {
        return new h(a, b, c, d, e, f, q.a());
    }

    public final l c()
    {
        Object obj;
        Object obj1;
        au au1;
        int i1;
        boolean flag;
        if (!h.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.b(flag, "must call addApi() to add at least one API");
        if (k < 0) goto _L2; else goto _L1
_L1:
        au1 = au.a(j);
        i1 = k;
        if (au1.getActivity() == null) goto _L4; else goto _L3
_L3:
        obj = au1.b(i1);
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj = ((av) (obj)).i;
_L6:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new aa(g.getApplicationContext(), m, b(), n, h, i, o, p, k);
        }
        au1.a(k, ((l) (obj1)), l);
        return ((l) (obj1));
_L4:
        obj = null;
        if (true) goto _L6; else goto _L2
_L2:
        return new aa(g, m, b(), n, h, i, o, p, -1);
    }
}
