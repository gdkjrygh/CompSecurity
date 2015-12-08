// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;

import ds;
import ep;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import uA;

// Referenced classes of package com.snapchat.android.discover.model:
//            MediaState, DSnapPanel

public final class DSnapPage
{
    public static final class Form extends Enum
    {

        private static final Form $VALUES[];
        public static final Form LONGFORM;
        public static final Form TOP_SNAP;

        public static Form valueOf(String s1)
        {
            return (Form)Enum.valueOf(com/snapchat/android/discover/model/DSnapPage$Form, s1);
        }

        public static Form valueOfIgnoreCase(String s1)
        {
            return valueOf(s1.toUpperCase(Locale.ENGLISH));
        }

        public static Form[] values()
        {
            return (Form[])$VALUES.clone();
        }

        public final int getIndex()
        {
            return ordinal();
        }

        public final String getKey()
        {
            return name();
        }

        static 
        {
            TOP_SNAP = new Form("TOP_SNAP", 0);
            LONGFORM = new Form("LONGFORM", 1);
            $VALUES = (new Form[] {
                TOP_SNAP, LONGFORM
            });
        }

        private Form(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class a
    {

        public String a;
        public String b;
        public Integer c;
        public int d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public Integer n;
        public MediaState o;
        public MediaState p;
        public String q;
        public Map r;
        public boolean s;
        Map t;

        public final a a(String s1, DSnapPanel dsnappanel)
        {
            t.put(s1, dsnappanel);
            return this;
        }

        public final DSnapPage a()
        {
            if (a == null)
            {
                throw new uA("Cannot build dsnap page with null id.", "dsnap_id");
            }
            if (e == null)
            {
                throw new uA("Cannot build dsnap page with null edition id.", "edition_id");
            }
            if (f == null)
            {
                throw new uA("Cannot build dsnap page with null publisher name.", "publisher_name");
            }
            if (l == null || l.length() == 0)
            {
                throw new uA("Cannot build dsnap page with null color.", "color");
            }
            String s2 = l;
            String s1 = s2;
            if (s2.charAt(0) != '#')
            {
                s1 = (new StringBuilder("#")).append(s2).toString();
            }
            l = s1;
            if (n == null)
            {
                throw new uA("Cannot build dsnap page with null ad type.", "ad_type");
            }
            if (t == null)
            {
                throw new uA("Cannot build dsnap page with invalid dsnap items.", "dsnap_item");
            } else
            {
                return new DSnapPage(this, (byte)0);
            }
        }

        public a()
        {
            a = null;
            c = null;
            d = -1;
            e = null;
            n = null;
            o = MediaState.NOT_STARTED;
            p = MediaState.NOT_STARTED;
            r = ep.a();
            t = new HashMap();
        }
    }


    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final Integer h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Integer m;
    public final MediaState n;
    public final MediaState o;
    public final String p;
    public Map q;
    public final boolean r;
    public String s;
    private final String t;
    private final Map u;

    private DSnapPage(a a1)
    {
        Object obj = null;
        super();
        a = a1.a;
        b = a1.b;
        h = a1.c;
        i = a1.e;
        j = a1.f;
        k = a1.g;
        t = a1.h;
        l = a1.l;
        c = a1.m;
        m = a1.n;
        g = a1.d;
        n = a1.o;
        o = a1.p;
        u = a1.t;
        String s1;
        if (g())
        {
            s1 = a1.i;
        } else
        {
            s1 = null;
        }
        d = s1;
        if (g())
        {
            s1 = a1.j;
        } else
        {
            s1 = null;
        }
        e = s1;
        s1 = obj;
        if (g())
        {
            s1 = a1.k;
        }
        f = s1;
        r = a1.s;
        p = a1.q;
        q = (Map)ds.a(a1.r, ep.a());
    }

    DSnapPage(a a1, byte byte0)
    {
        this(a1);
    }

    public final Integer a()
    {
        return Integer.valueOf(h.intValue() - 1);
    }

    public final String b()
    {
        if (g())
        {
            return k;
        } else
        {
            return t;
        }
    }

    public final MediaState c()
    {
        if (o == MediaState.SUCCESS)
        {
            return n;
        } else
        {
            return o;
        }
    }

    public final DSnapPanel d()
    {
        return (DSnapPanel)u.get(Form.TOP_SNAP.getKey());
    }

    public final DSnapPanel e()
    {
        return (DSnapPanel)u.get(Form.LONGFORM.getKey());
    }

    public final int f()
    {
        return u.size();
    }

    public final boolean g()
    {
        return m.intValue() != 0;
    }

    public final String h()
    {
        if (s == null)
        {
            s = UUID.randomUUID().toString();
        }
        return s;
    }

    public final String toString()
    {
        return ds.a(this).a("position", h).a("dSnapId", a).a("hash", b()).a("editionId", i).a("publisherName", j).a("adKey", d).a("adPosition", g).toString();
    }
}
