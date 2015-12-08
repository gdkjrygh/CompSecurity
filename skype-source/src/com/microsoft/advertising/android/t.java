// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.microsoft.advertising.android:
//            af, p, bu, s, 
//            u, m, bq, bv, 
//            av

final class t
{
    public static final class a
    {

        private String a;
        private String b;

        static String a(a a1)
        {
            return a1.a;
        }

        static String b(a a1)
        {
            return a1.b;
        }

        public final void a(String s1)
        {
            b = s1;
        }

        public final void a(boolean flag)
        {
            String s1;
            if (flag)
            {
                s1 = "1";
            } else
            {
                s1 = "0";
            }
            a = s1;
        }

        public a()
        {
            a = null;
            b = null;
        }
    }


    public int a;
    public int b;
    public a c;
    private final String d;
    private final String e;
    private boolean f;
    private String g;
    private String h;
    private final p i;
    private final m j;

    public t(String s1, String s2, m m1, int k, int l, String s3, p p1)
    {
        boolean flag1 = false;
        super();
        f = false;
        g = null;
        a = -1;
        b = -1;
        h = null;
        c = new a();
        if (m1 == null || s2 == null || p1 == null)
        {
            throw new IllegalArgumentException();
        }
        boolean flag = flag1;
        if (k > 0)
        {
            flag = flag1;
            if (l > 0)
            {
                flag = true;
            }
        }
        af.a(flag);
        d = s1;
        e = s2;
        j = m1;
        int i1 = p.a().m().a(k, true);
        int j1 = p.a().m().a(l, true);
        h = (new StringBuilder(String.valueOf(String.valueOf(i1)))).append("x").append(String.valueOf(j1)).toString();
        a = p.a().m().a(k);
        b = p.a().m().a(l);
        g = s3;
        i = p1;
    }

    private void a(StringBuilder stringbuilder)
    {
        Object obj1;
        s.a(stringbuilder, e);
        s.a(stringbuilder, u.q, d);
        s.a(stringbuilder, u.u, g);
        Object obj = u.C;
        String s1;
        String s2;
        Map map;
        if (f)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        s.a(stringbuilder, ((u) (obj)), s1);
        obj1 = String.valueOf(a);
        s2 = String.valueOf(b);
        s1 = s2;
        obj = obj1;
        if (!j.a().c()) goto _L2; else goto _L1
_L1:
        map = j.a().a();
        s1 = s2;
        obj = obj1;
        if (map.containsKey(u.D.a()))
        {
            s1 = s2;
            obj = obj1;
            if (map.containsKey(u.E.a()))
            {
                obj = (String)map.get(u.D.a());
                s1 = (String)map.get(u.E.a());
            }
        }
        obj1 = map.entrySet().iterator();
_L5:
        if (((Iterator) (obj1)).hasNext()) goto _L3; else goto _L2
_L2:
        s.a(stringbuilder, u.A, ((String) (obj)));
        s.a(stringbuilder, u.B, s1);
        if (a.a(c) != null)
        {
            s.a(stringbuilder, u.t, a.a(c));
        }
        if (a.b(c) != null)
        {
            s.a(stringbuilder, u.s, a.b(c));
        }
        j.a(stringbuilder);
        s1 = p.k().b();
        if (s1 != null)
        {
            stringbuilder.append(s1);
        }
        return;
_L3:
        Object obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
        String s3 = (String)((java.util.Map.Entry) (obj2)).getKey();
        obj2 = (String)((java.util.Map.Entry) (obj2)).getValue();
        if (TextUtils.isEmpty(s3) || TextUtils.isEmpty(((CharSequence) (obj2))) || u.a(s3))
        {
            av.c("AdServerRequest", (new StringBuilder("Skipping AdTag ")).append(s3).toString());
        } else
        {
            s.a(stringbuilder, s3, ((String) (obj2)));
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final String a()
    {
        return e;
    }

    public final HttpGet b()
    {
        af.a(new Object[] {
            c
        });
        Object obj = new StringBuilder();
        ((StringBuilder) (obj)).append(s.a(e));
        ((StringBuilder) (obj)).append("?");
        a(((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        av.a("ArcRequestResponse", (new StringBuilder("url=")).append(((String) (obj))).toString());
        obj = new HttpGet(((String) (obj)));
        ((HttpGet) (obj)).addHeader(u.H.a(), u.H.e());
        ((HttpGet) (obj)).addHeader(u.I.a(), h);
        ((HttpGet) (obj)).addHeader(u.J.a(), g);
        ((HttpGet) (obj)).addHeader(u.K.a(), u.K.e());
        j.a(((HttpGet) (obj)));
        return ((HttpGet) (obj));
    }
}
