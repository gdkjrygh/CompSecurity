// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.c;
import com.google.android.m4b.maps.model.j;
import com.tinder.a.f;
import com.tinder.a.g;
import com.tinder.b.i;
import com.tinder.e.p;
import com.tinder.e.w;
import com.tinder.f.ak;
import com.tinder.model.TinderLocation;
import com.tinder.parse.h;
import com.tinder.utils.o;
import com.tinder.utils.t;
import com.tinder.utils.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ManagerApp, d

public final class y
{

    public static final Pattern a = Pattern.compile(" ", 16);
    private static List e;
    public TinderLocation b;
    public WeakReference c;
    public f d;
    private List f;
    private i g;

    public y(f f1)
    {
        f = new ArrayList(0);
        e = new ArrayList(0);
        g = new i();
        d = f1;
    }

    public static List a()
    {
        return new ArrayList(e);
    }

    public static List a(int j)
    {
        Object obj;
        if (j <= 0)
        {
            obj = new ArrayList(0);
        } else
        {
            List list = i.e();
            obj = list;
            if (list.size() >= j)
            {
                return list.subList(0, j);
            }
        }
        return ((List) (obj));
    }

    static List a(y y1)
    {
        return y1.f;
    }

    static List a(List list)
    {
        e = list;
        return list;
    }

    public final void a(double d1, double d2, com.tinder.e.o o1, j j)
    {
        String s = String.format(Locale.ENGLISH, d.v, new Object[] {
            t.a(), Double.valueOf(d1), Double.valueOf(d2)
        });
        (new StringBuilder("url ")).append(s).append(" with lat ").append(d1).append(" , ").append(d2);
        com.android.volley.Request.Priority priority = com.android.volley.Request.Priority.d;
        com.android.volley.i.b b1 = new com.android.volley.i.b(o1, j) {

            final com.tinder.e.o a;
            final j b;
            final y c;

            public final void a(Object obj)
            {
                obj = (JSONObject)obj;
                ((JSONObject) (obj)).toString();
                try
                {
                    obj = ((JSONObject) (obj)).optJSONArray("results");
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.b(((Exception) (obj)).toString());
                    a.d(b);
                    return;
                }
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_28;
                }
                if (((JSONArray) (obj)).length() != 0)
                {
                    break MISSING_BLOCK_LABEL_51;
                }
                obj = new TinderLocation();
_L2:
                a.a(((TinderLocation) (obj)), b);
                return;
                obj = h.b(((JSONArray) (obj)).getJSONObject(0));
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                c = y.this;
                a = o1;
                b = j;
                super();
            }
        };
        o1 = new com.android.volley.i.a(o1, j) {

            final com.tinder.e.o a;
            final j b;
            final y c;

            public final void a(VolleyError volleyerror)
            {
                a.d(b);
            }

            
            {
                c = y.this;
                a = o1;
                b = j;
                super();
            }
        };
        com.tinder.managers.ManagerApp.h().g();
        o1 = new g(priority, 0, s, null, b1, o1, com.tinder.managers.d.b());
        o1.l = j;
        o1.j = new c();
        ManagerApp.b().a(o1);
    }

    public final void a(TinderLocation tinderlocation)
    {
        boolean flag1 = true;
        StringBuilder stringbuilder = new StringBuilder("set active ");
        boolean flag;
        if (tinderlocation != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder.append(flag);
        stringbuilder = new StringBuilder("passport icon should show ? ");
        if (tinderlocation != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        stringbuilder.append(flag);
        b = tinderlocation;
        b(b);
        if (b != null && o.a(c))
        {
            ((w)c.get()).C();
        }
    }

    public final void b(TinderLocation tinderlocation)
    {
        if (tinderlocation != null)
        {
            long l = System.currentTimeMillis();
            tinderlocation.setLastSeenDate(l);
            if (!g.a(tinderlocation))
            {
                g.a(tinderlocation, l);
            }
        }
    }

    public final boolean b()
    {
        return b != null;
    }


    // Unreferenced inner class com/tinder/managers/y$1

/* anonymous class */
    final class _cls1
        implements com.android.volley.i.b
    {

        final y a;

        public final void a(Object obj)
        {
            obj = (JSONObject)obj;
            try
            {
                y.a(h.a(((JSONObject) (obj))));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                v.b(((JSONException) (obj)).toString());
            }
        }

            
            {
                a = y.this;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/y$2

/* anonymous class */
    public final class _cls2
        implements com.android.volley.i.b
    {

        final p a;
        final y b;

        public final void a(Object obj)
        {
            obj = (JSONObject)obj;
            try
            {
                ((JSONObject) (obj)).toString();
                a.a(h.a(((JSONObject) (obj))));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                v.b(((Exception) (obj)).toString());
            }
            a.e();
        }

            public 
            {
                b = y.this;
                a = p1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/y$3

/* anonymous class */
    public final class _cls3
        implements com.android.volley.i.a
    {

        final y a;

        public final void a(VolleyError volleyerror)
        {
        }

            public 
            {
                a = y.this;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/y$6

/* anonymous class */
    public final class _cls6
        implements com.android.volley.i.b
    {

        final com.tinder.e.v a;
        final TinderLocation b;
        final y c;

        public final void a(Object obj)
        {
            a.y();
            c.a(b);
            if (!y.a(c).contains(b))
            {
                y.a(c).add(b);
            }
        }

            public 
            {
                c = y.this;
                a = v1;
                b = tinderlocation;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/y$7

/* anonymous class */
    public final class _cls7
        implements com.android.volley.i.a
    {

        final com.tinder.e.v a;
        final y b;

        public final void a(VolleyError volleyerror)
        {
            a.z();
        }

            public 
            {
                b = y.this;
                a = v1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/y$8

/* anonymous class */
    public final class _cls8
        implements com.android.volley.i.b
    {

        final com.tinder.e.v a;
        final y b;

        public final void a(Object obj)
        {
            b.a(null);
            a.A();
        }

            public 
            {
                b = y.this;
                a = v1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/y$9

/* anonymous class */
    public final class _cls9
        implements com.android.volley.i.a
    {

        final com.tinder.e.v a;
        final y b;

        public final void a(VolleyError volleyerror)
        {
            a.B();
        }

            public 
            {
                b = y.this;
                a = v1;
                super();
            }
    }

}
