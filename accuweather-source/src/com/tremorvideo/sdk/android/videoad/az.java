// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, cx, ey, fi, 
//            cg, bk, bi, bg, 
//            bj, bh, ea, ba, 
//            ch, gd, fz

public class az
{
    public class a
    {

        public fp.d a;
        public String b;
        public Map c;
        final az d;

        public a(fp.d d1, String s1)
        {
            d = az.this;
            super();
            a = d1;
            b = s1;
            c = new HashMap();
        }

        public a(fp.d d1, String s1, Map map)
        {
            d = az.this;
            super();
            a = d1;
            b = s1;
            c = map;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        private static final b h[];
        private String g;

        public static b a(String s1)
        {
            b ab[] = values();
            int j1 = ab.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                b b1 = ab[i1];
                if (b1.toString().equals(s1))
                {
                    return b1;
                }
            }

            return a;
        }

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/videoad/az$b, s1);
        }

        public static b[] values()
        {
            return (b[])h.clone();
        }

        public String toString()
        {
            return g;
        }

        static 
        {
            a = new b("Unknown", 0, "unknown");
            b = new b("Video", 1, "video");
            c = new b("RichMedia", 2, "richmedia");
            d = new b("HTML5", 3, "html5");
            e = new b("VAST", 4, "vast");
            f = new b("Mraid", 5, "mraid");
            h = (new b[] {
                a, b, c, d, e, f
            });
        }

        private b(String s1, int i1, String s2)
        {
            super(s1, i1);
            g = s2;
        }
    }


    protected List a;
    protected cx b;
    protected gd c;
    protected ey d;
    protected fi e;
    protected cg f;
    protected long g;
    protected boolean h;
    protected Map i;
    protected long j;
    private fz k;
    private String l;
    private b m;
    private String n;
    private boolean o;
    private String p;

    public az(fz fz, JSONObject jsonobject, boolean flag)
        throws Exception
    {
        g = 0L;
        h = false;
        i = new HashMap();
        m = b.a(jsonobject.getString("adtype"));
        k = fz;
        o = false;
        p = jsonobject.toString();
        l = jsonobject.getString("id");
        j = ct.B();
        if (jsonobject.has("ad-lifetime"))
        {
            g = jsonobject.getLong("ad-lifetime");
        }
        if (jsonobject.has("coupon"))
        {
            b = new cx(jsonobject.getJSONObject("coupon"));
        }
        n = jsonobject.getString("cache-expiry-date");
        if (jsonobject.has("ad-survey-external"))
        {
            d = new ey(jsonobject.getJSONObject("ad-survey-external"));
        } else
        {
            d = null;
        }
        if (jsonobject.has("ad-survey-internal"))
        {
            e = new fi(jsonobject.getJSONObject("ad-survey-internal"));
        } else
        {
            e = null;
        }
        if (jsonobject.has("buy-now"))
        {
            f = new cg(jsonobject.getJSONObject("buy-now"));
            return;
        } else
        {
            f = null;
            return;
        }
    }

    public static az a(fz fz, JSONObject jsonobject, boolean flag)
        throws Exception
    {
        b b1 = b.a(jsonobject.getString("adtype"));
        if (b1 == b.b)
        {
            return new bk(fz, jsonobject, flag);
        }
        if (b1 == b.c)
        {
            return new bi(fz, jsonobject, flag);
        }
        if (b1 == b.d)
        {
            return new bg(fz, jsonobject, flag);
        }
        if (b1 == b.e)
        {
            return new bj(fz, jsonobject, flag);
        }
        if (b1 == b.f)
        {
            return new bh(fz, jsonobject, flag);
        } else
        {
            return null;
        }
    }

    public static GregorianCalendar a(String s1)
    {
        try
        {
            String as[] = s1.split(" ");
            s1 = as[0].split("-");
            if (as.length == 1)
            {
                return new GregorianCalendar(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]) - 1, Integer.parseInt(s1[2]));
            }
            as = as[1].split(":");
            s1 = new GregorianCalendar(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]) - 1, Integer.parseInt(s1[2]), Integer.parseInt(as[0]), Integer.parseInt(as[1]), Integer.parseInt(as[2]));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            ct.a(s1);
            return new GregorianCalendar();
        }
        return s1;
    }

    protected static void a(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ea ea1 = (ea)list.next();
            if (ea1.a() == ea.b.t)
            {
                ea1.a(ea.b.r);
            } else
            if (ea1.a() == ea.b.s)
            {
                ea1.a(ea.b.r);
            } else
            if (ea1.a() == ea.b.L)
            {
                ea1.a(ea.b.K);
            } else
            if (ea1.a() == ea.b.M)
            {
                ea1.a(ea.b.K);
            }
        } while (true);
    }

    protected static String b(String s1)
    {
        return s1.substring(s1.lastIndexOf(File.separatorChar) + 1);
    }

    protected static void b(List list)
    {
        ea ea1;
        ArrayList arraylist;
        Iterator iterator;
        int j1;
        j1 = 0;
        arraylist = new ArrayList();
        iterator = list.iterator();
        ea1 = null;
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ea ea2 = (ea)iterator.next();
        int i1 = -1;
        if (ea2.a() == ea.b.t)
        {
            i1 = 1;
        } else
        if (ea2.a() == ea.b.s)
        {
            i1 = 2;
        } else
        if (ea2.a() == ea.b.r)
        {
            i1 = 3;
        } else
        {
            ea2 = null;
        }
        if (ea2 == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        arraylist.add(ea2);
        if (i1 <= j1)
        {
            break MISSING_BLOCK_LABEL_155;
        }
_L3:
        ea1 = ea2;
        j1 = i1;
        if (true) goto _L2; else goto _L1
_L1:
        if (ea1 != null)
        {
            ea1.a(ea.b.r);
            arraylist.remove(ea1);
        }
        if (arraylist.size() > 0)
        {
            list.removeAll(arraylist);
        }
        return;
        i1 = j1;
        ea2 = ea1;
          goto _L3
    }

    protected static void c(List list)
    {
        ea ea1;
        ArrayList arraylist;
        Iterator iterator;
        int j1;
        j1 = 0;
        arraylist = new ArrayList();
        iterator = list.iterator();
        ea1 = null;
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ea ea2 = (ea)iterator.next();
        int i1 = -1;
        if (ea2.a() == ea.b.L)
        {
            i1 = 1;
        } else
        if (ea2.a() == ea.b.M)
        {
            i1 = 2;
        } else
        if (ea2.a() == ea.b.K)
        {
            i1 = 3;
        } else
        {
            ea2 = null;
        }
        if (ea2 == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        arraylist.add(ea2);
        if (i1 <= j1)
        {
            break MISSING_BLOCK_LABEL_155;
        }
_L3:
        ea1 = ea2;
        j1 = i1;
        if (true) goto _L2; else goto _L1
_L1:
        if (ea1 != null)
        {
            ea1.a(ea.b.K);
            arraylist.remove(ea1);
        }
        if (arraylist.size() > 0)
        {
            list.removeAll(arraylist);
        }
        return;
        i1 = j1;
        ea2 = ea1;
          goto _L3
    }

    protected static void d(List list)
    {
        Collections.sort(list, new ba());
    }

    public ea a(ea.b b1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ea ea1 = (ea)iterator.next();
            if (b1 == ea1.a())
            {
                return ea1;
            }
        }

        return null;
    }

    public String a(int i1)
    {
        return "";
    }

    public String a(Context context, int i1)
    {
        return ch.a(context.getFilesDir(), e(i1)).getAbsolutePath();
    }

    public void a(Context context)
    {
        h = true;
    }

    public void a(String s1, Object obj)
        throws Exception
    {
        if (s1.compareTo("coupon") == 0)
        {
            b.a(new File((String)obj));
            return;
        }
        if (s1.compareTo("buyItNowDealsXml") == 0)
        {
            f.a(new File((String)obj));
            return;
        }
        if (s1.compareTo("buyItNowTemplate") == 0)
        {
            f.b(new File((String)obj));
            return;
        } else
        {
            i.put(s1, obj);
            return;
        }
    }

    protected void a(JSONObject jsonobject)
        throws Exception
    {
        jsonobject = jsonobject.getJSONArray("event");
        a = new ArrayList(jsonobject.length());
        for (int i1 = 0; i1 < jsonobject.length(); i1++)
        {
            a.add(new ea(jsonobject.getJSONObject(i1)));
        }

        if (p())
        {
            a(a);
        } else
        {
            b(a);
        }
        d(a);
    }

    public boolean a()
    {
        return o;
    }

    public int b(int i1)
    {
        return 0;
    }

    public List b()
    {
        return new ArrayList();
    }

    public ea c(String s1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ea ea1 = (ea)iterator.next();
            if (s1.equalsIgnoreCase(ea1.d()))
            {
                return ea1;
            }
        }

        return null;
    }

    public String c(int i1)
    {
        return "";
    }

    public boolean c()
    {
        return h;
    }

    public int d(int i1)
    {
        return 0;
    }

    public void d()
    {
        if (b != null)
        {
            b.e();
            b = null;
        }
        if (c != null)
        {
            c.b();
            c = null;
        }
        if (f != null)
        {
            f.g();
            f = null;
        }
    }

    public String e(int i1)
    {
        String s1 = a(i1);
        return s1.substring(s1.lastIndexOf(File.separatorChar) + 1);
    }

    public GregorianCalendar e()
    {
        return a(n);
    }

    public long f(int i1)
    {
        return 0L;
    }

    public fz f()
    {
        return k;
    }

    public String g()
    {
        return l;
    }

    public boolean g(int i1)
    {
        return false;
    }

    public b h()
    {
        return m;
    }

    public String i()
    {
        return n;
    }

    public String j()
    {
        return "";
    }

    public int k()
    {
        return 0;
    }

    public String[] l()
    {
        return new String[0];
    }

    public List m()
    {
        return a;
    }

    public boolean n()
    {
        return true;
    }

    public ea o()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ea ea1 = (ea)iterator.next();
            if (ea1.a() == ea.b.v)
            {
                return ea1;
            }
        }

        return null;
    }

    protected boolean p()
    {
        return false;
    }

    public cx q()
    {
        return b;
    }

    public gd r()
    {
        return c;
    }

    public ey s()
    {
        return d;
    }

    public fi t()
    {
        return e;
    }

    public boolean u()
    {
        return b != null && a(ea.b.B) == null;
    }

    public long v()
    {
        return g;
    }

    public long w()
    {
        return j;
    }

    public boolean x()
    {
        return true;
    }

    public cg y()
    {
        return f;
    }
}
