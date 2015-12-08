// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            az, gd, gg, bl, 
//            ct, ea, cx, cg, 
//            fz

public class bk extends az
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a e[];
        private String d;

        public static a a(String s1)
        {
            a aa[] = values();
            int i1 = aa.length;
            for (int i = 0; i < i1; i++)
            {
                a a1 = aa[i];
                if (a1.toString().equals(s1))
                {
                    return a1;
                }
            }

            return a;
        }

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/bk$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        public String toString()
        {
            return d;
        }

        static 
        {
            a = new a("Default", 0, "default");
            b = new a("AppStart", 1, "appstart");
            c = new a("PreRoll", 2, "preroll");
            e = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int i, String s2)
        {
            super(s1, i);
            d = s2;
        }
    }

    public static class b
    {

        private String a;
        private int b;
        private int c;
        private int d;
        private int e;
        private c f;
        private int g;
        private boolean h;

        public int a()
        {
            if (f.b())
            {
                return d;
            } else
            {
                return 0;
            }
        }

        public String b()
        {
            return a;
        }

        public int c()
        {
            return b;
        }

        public int d()
        {
            return c;
        }

        public int e()
        {
            return d;
        }

        public int f()
        {
            return e;
        }

        public c g()
        {
            return f;
        }

        public b(JSONObject jsonobject)
            throws Exception
        {
            a = jsonobject.getString("url");
            d = jsonobject.getInt("layout-width");
            e = jsonobject.getInt("layout-height");
            f = c.values()[jsonobject.getInt("layout")];
            g = Long.decode(jsonobject.getString("background-color")).intValue();
            h = jsonobject.getBoolean("opaque");
            if (jsonobject.has("layout-x"))
            {
                b = jsonobject.getInt("layout-x");
            }
            if (jsonobject.has("layout-y"))
            {
                c = jsonobject.getInt("layout-y");
            }
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        private static final c g[];
        private String f;

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/tremorvideo/sdk/android/videoad/bk$c, s1);
        }

        public static c[] values()
        {
            return (c[])g.clone();
        }

        public boolean a()
        {
            return ordinal() == a.ordinal() || ordinal() == b.ordinal();
        }

        public boolean b()
        {
            return ordinal() == c.ordinal() || ordinal() == d.ordinal();
        }

        public String toString()
        {
            return f;
        }

        static 
        {
            a = new c("Top", 0, "top");
            b = new c("Bottom", 1, "bottom");
            c = new c("Left", 2, "left");
            d = new c("Right", 3, "right");
            e = new c("Absolute", 4, "absolute");
            g = (new c[] {
                a, b, c, d, e
            });
        }

        private c(String s1, int i, String s2)
        {
            super(s1, i);
            f = s2;
        }
    }


    protected String A;
    protected String B;
    protected String C;
    protected gg D;
    protected boolean E;
    protected boolean F;
    protected b G;
    protected int o;
    protected boolean p;
    protected int q;
    protected String r;
    protected long s;
    protected String t;
    protected int u;
    protected int v;
    protected a w;
    protected String x;
    protected long y;
    protected String z;

    protected bk(fz fz, JSONObject jsonobject)
        throws Exception
    {
        super(fz, jsonobject, false);
        G = null;
    }

    public bk(fz fz, JSONObject jsonobject, boolean flag)
        throws Exception
    {
        super(fz, jsonobject, flag);
        G = null;
        c = new gd();
        o = jsonobject.getInt("priority");
        p = jsonobject.getBoolean("skip");
        q = jsonobject.getInt("skip-delay");
        v = jsonobject.getInt("duration");
        r = jsonobject.getString("url");
        t = jsonobject.getString("format");
        u = jsonobject.getInt("ad-size");
        w = a.a(jsonobject.getString("placement"));
        if (jsonobject.has("video-crc-32"))
        {
            s = jsonobject.getLong("video-crc-32");
        } else
        if (jsonobject.has("video-crc32"))
        {
            s = jsonobject.getLong("video-crc32");
        }
        if (jsonobject.has("theme-crc-32"))
        {
            y = jsonobject.getLong("theme-crc-32");
        } else
        if (jsonobject.has("theme-crc32"))
        {
            y = jsonobject.getLong("theme-crc32");
        }
        if (jsonobject.has("watermark"))
        {
            F = jsonobject.getBoolean("watermark");
        } else
        {
            F = true;
        }
        if (jsonobject.has("twitter-feed") && flag)
        {
            d(jsonobject.getString("twitter-feed"));
        }
        if (jsonobject.has("theme-url"))
        {
            x = jsonobject.getString("theme-url");
        } else
        {
            x = null;
        }
        if (jsonobject.has("html5"))
        {
            G = new b(jsonobject.getJSONObject("html5"));
        }
        a(jsonobject);
    }

    private void d(String s1)
    {
        D = new gg(this);
        D.a(s1, new bl(this));
    }

    private void e(String s1)
    {
        File file;
        file = new File(s1);
        if (!file.exists())
        {
            ct.a(ct.a.b, (new StringBuilder()).append("Can't find theme: ").append(s1).append(", using default...").toString());
            return;
        }
        try
        {
            s1 = new ZipFile(file);
            c.a(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            ct.a(s1);
        }
        c.a();
        return;
    }

    public gg A()
    {
        return D;
    }

    public boolean B()
    {
        return z != null;
    }

    public int C()
    {
        return v;
    }

    public String D()
    {
        return z;
    }

    public String E()
    {
        return A;
    }

    public String F()
    {
        return B;
    }

    public boolean G()
    {
        return F;
    }

    public boolean H()
    {
        if (G != null)
        {
            return false;
        } else
        {
            return p;
        }
    }

    public boolean I()
    {
        return p;
    }

    public int J()
    {
        return q * 1000;
    }

    public boolean K()
    {
        return M() != null;
    }

    public List L()
    {
        ArrayList arraylist = new ArrayList();
        if (G == null)
        {
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ea ea1 = (ea)iterator.next();
                if (ea1.m())
                {
                    arraylist.add(ea1);
                }
            } while (true);
        }
        return arraylist;
    }

    public ea M()
    {
label0:
        {
            if (!p)
            {
                break label0;
            }
            Iterator iterator = a.iterator();
            ea ea1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                ea1 = (ea)iterator.next();
            } while (ea1.a() != ea.b.w);
            return ea1;
        }
        return null;
    }

    public b N()
    {
        return G;
    }

    public String a(int i)
    {
        return r;
    }

    public void a(Context context)
    {
        super.a(context);
        if (C == null)
        {
            c.a();
            return;
        } else
        {
            e(C);
            return;
        }
    }

    public void a(String s1, Object obj)
        throws Exception
    {
        if (s1.equals("theme"))
        {
            C = (String)obj;
        }
        super.a(s1, obj);
    }

    public int b(int i)
    {
        return u;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap(4);
        hashmap.put("ad", this);
        hashmap.put("url", r);
        hashmap.put("crc", Long.valueOf(s));
        hashmap.put("index", Integer.valueOf(0));
        arraylist.add(new az.a(this, fp.d.b, "video", hashmap));
        if (b != null)
        {
            HashMap hashmap1 = new HashMap(2);
            hashmap1.put("url", b.c());
            hashmap1.put("crc", Long.valueOf(b.d()));
            hashmap1.put("checkCache", Boolean.valueOf(false));
            arraylist.add(new az.a(this, fp.d.a, "coupon", hashmap1));
        }
        if (x != null)
        {
            HashMap hashmap2 = new HashMap(2);
            hashmap2.put("url", x);
            hashmap2.put("crc", Long.valueOf(y));
            arraylist.add(new az.a(this, fp.d.a, "theme", hashmap2));
        }
        if (d != null)
        {
            arraylist.add(new az.a(this, fp.d.c, "survey"));
        }
        if (f != null)
        {
            HashMap hashmap3 = new HashMap(2);
            hashmap3.put("url", f.b());
            hashmap3.put("checkCache", Boolean.valueOf(false));
            arraylist.add(new az.a(this, fp.d.a, "buyItNowDealsXml", hashmap3));
            hashmap3 = new HashMap(3);
            hashmap3.put("url", f.c());
            hashmap3.put("crc", f.d());
            hashmap3.put("checkCache", Boolean.valueOf(true));
            arraylist.add(new az.a(this, fp.d.a, "buyItNowTemplate", hashmap3));
            arraylist.add(new az.a(this, fp.d.f, "processBIN"));
        }
        return arraylist;
    }

    public String c(int i)
    {
        return t;
    }

    public int d(int i)
    {
        return u;
    }

    public long f(int i)
    {
        return s;
    }

    public String j()
    {
        return b(r);
    }

    public int k()
    {
        return 1;
    }

    public String[] l()
    {
        if (x == null)
        {
            return (new String[] {
                b(r)
            });
        } else
        {
            return (new String[] {
                b(r), (new StringBuilder()).append(b(r)).append(".theme").toString()
            });
        }
    }

    public gd r()
    {
        return c;
    }

    public boolean z()
    {
        return E;
    }
}
