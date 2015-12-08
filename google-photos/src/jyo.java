// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class jyo
{

    public Account a;
    private final Set b;
    private String c;
    private String d;
    private final Map e;
    private final Context f;
    private final Map g;
    private int h;
    private int i;
    private Looper j;
    private jxz k;
    private jyi l;
    private final ArrayList m;
    private final ArrayList n;
    private loj o;

    public jyo(Context context)
    {
        b = new HashSet();
        e = new lad();
        g = new lad();
        h = -1;
        i = -1;
        k = jxz.a();
        l = lpb.a;
        m = new ArrayList();
        n = new ArrayList();
        o = new loj();
        f = context;
        j = context.getMainLooper();
        c = context.getPackageName();
        d = context.getClass().getName();
    }

    public jyo(Context context, jyq jyq, jys jys)
    {
        this(context);
        b.f(jyq, "Must provide a connected listener");
        m.add(jyq);
        b.f(jys, "Must provide a connection failed listener");
        n.add(jys);
    }

    private kax b()
    {
        return new kax(a, b, e, 0, null, c, d, o.a());
    }

    public final jyn a()
    {
        Object obj1;
        boolean flag2;
        flag2 = true;
        boolean flag;
        if (!g.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag, "must call addApi() to add at least one API");
        if (h < 0) goto _L2; else goto _L1
_L1:
        obj1 = new jzu(f.getApplicationContext(), j, b(), k, l, g, m, n, h, -1);
        kak kak1 = kak.a(null);
        if (kak1 == null)
        {
            (new Handler(f.getMainLooper())).post(new jyp(this, ((jyn) (obj1))));
        } else
        {
            a(kak1, ((jyn) (obj1)));
        }
_L6:
        return ((jyn) (obj1));
_L2:
        kan kan1;
        int i1;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        kan1 = kan.a(null);
        i1 = i;
        if (kan1.O_() == null) goto _L4; else goto _L3
_L3:
        kao kao1 = kan1.b(i1);
        if (kao1 == null) goto _L4; else goto _L5
_L5:
        obj1 = kao1.a;
_L7:
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = new jzu(f.getApplicationContext(), j, b(), k, l, g, m, n, -1, i);
        }
        int j1 = i;
        b.f(obj, "GoogleApiClient instance cannot be null");
        boolean flag1;
        if (kan1.a.indexOfKey(j1) < 0)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        b.a(flag1, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(j1).toString());
        obj1 = new kap(((jyn) (obj)), null);
        kan1.a.put(j1, obj1);
        obj1 = obj;
        if (kan1.O_() != null)
        {
            cb.a = false;
            kan1.k().a(j1, null, kan1);
            return ((jyn) (obj));
        }
        if (true) goto _L6; else goto _L4
_L4:
        obj1 = null;
          goto _L7
        return new jzu(f, j, b(), k, l, g, m, n, -1, -1);
    }

    public final jyo a(jyh jyh1)
    {
        g.put(jyh1, null);
        b.addAll(jyh1.a().a(null));
        return this;
    }

    public final jyo a(jyh jyh1, jyk jyk)
    {
        b.f(jyk, "Null options are not permitted for this Api");
        g.put(jyh1, jyk);
        b.addAll(jyh1.a().a(jyk));
        return this;
    }

    public final jyo a(jyq jyq)
    {
        m.add(jyq);
        return this;
    }

    public final jyo a(jys jys)
    {
        n.add(jys);
        return this;
    }

    void a(kak kak1, jyn jyn1)
    {
        int i1 = h;
        b.f(jyn1, "GoogleApiClient instance cannot be null");
        kal kal1;
        boolean flag;
        if (kak1.c.indexOfKey(i1) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i1).toString());
        kal1 = new kal(kak1, i1, jyn1, null);
        kak1.c.put(i1, kal1);
        if (kak1.a && !kak1.b)
        {
            jyn1.b();
        }
    }
}
