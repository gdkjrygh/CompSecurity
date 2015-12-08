// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.kik.l.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import kik.a.e.v;
import kik.a.f.e;
import kik.a.f.r;
import kik.a.f.s;
import kik.android.util.DeviceUtils;
import kik.android.util.ar;

// Referenced classes of package kik.android.d:
//            c, e, b, a, 
//            f, g, h, i

public final class d
    implements c
{

    private static final Hashtable a;
    private static d b;
    private v c;
    private ab d;
    private ar e;
    private Context f;
    private Hashtable g;

    private d(Context context)
    {
        f = context;
        g = new Hashtable();
    }

    public static c a(Context context)
    {
        if (b == null)
        {
            b = new d(context);
        }
        return b;
    }

    static ar a(d d1)
    {
        return d1.e;
    }

    static Context b(d d1)
    {
        return d1.f;
    }

    public final String a(ar ar1)
    {
        if (DeviceUtils.c())
        {
            ar1 = ar1.c().getString("kik.server.profile", null);
            if (ar1 != null && a.containsKey(ar1))
            {
                return ar1;
            }
        }
        return "prod";
    }

    public final Collection a()
    {
        return Collections.list(g.elements());
    }

    public final b a(String s1)
    {
        return (b)g.get(s1);
    }

    public final void a(v v, ab ab, ar ar1)
    {
        c = v;
        d = ab;
        e = ar1;
        v = new ArrayList();
        v.add(new a(f, "show-lock-icon", (new Boolean(false)).booleanValue(), null, e));
        if (DeviceUtils.d(f))
        {
            ab = f;
            ar1 = new Boolean(false);
            Boolean boolean1 = new Boolean(false);
            Boolean boolean2 = new Boolean(true);
            ar ar2 = e;
            v.add(new f(this, ab, "eula-has-been-accepted", ar1, new Boolean[] {
                boolean1, boolean2
            }, ar2));
            ab = f;
            ar1 = new Boolean(false);
            boolean1 = new Boolean(false);
            boolean2 = new Boolean(true);
            ar2 = e;
            v.add(new g(this, ab, "eula-has-been-accepted", ar1, new Boolean[] {
                boolean1, boolean2
            }, ar2));
            ab = f;
            ar1 = new Boolean(false);
            boolean1 = new Boolean(false);
            boolean2 = new Boolean(true);
            ar2 = e;
            v.add(new h(this, ab, "metrics-use-alt", ar1, new Boolean[] {
                boolean1, boolean2
            }, ar2));
            ab = f;
            ar1 = new Boolean(false);
            boolean1 = new Boolean(false);
            boolean2 = new Boolean(true);
            ar2 = e;
            v.add(new i(this, ab, "force-crash", ar1, new Boolean[] {
                boolean1, boolean2
            }, ar2));
        }
        for (v = v.iterator(); v.hasNext(); g.put(ab.d(), ab))
        {
            ab = (b)v.next();
        }

    }

    public final boolean a(b b1)
    {
        if (!g.containsKey(b1.d()))
        {
            g.put(b1.d(), b1);
            return true;
        } else
        {
            return false;
        }
    }

    public final Hashtable b()
    {
        return (Hashtable)a.clone();
    }

    public final boolean b(String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (DeviceUtils.c())
        {
            flag = flag1;
            if (a.containsKey(s1))
            {
                e.c().edit().putString("kik.server.profile", s1).commit();
                System.exit(0);
                flag = true;
            }
        }
        return flag;
    }

    static 
    {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        hashtable.put("prod", new s());
        a.put("beta", new e());
        a.put("piranha", new r());
        a.put("scancode-changes", new r("scancode-stanza-changes"));
        a.put("bad-ssl", new kik.android.d.e());
    }
}
