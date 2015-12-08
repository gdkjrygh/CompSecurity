// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import com.tremorvideo.sdk.android.richmedia.a;
import com.tremorvideo.sdk.android.richmedia.f;
import com.tremorvideo.sdk.android.richmedia.m;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            az, ea, gd, ct, 
//            cx, cg, fz

public class bi extends az
{
    public class a
    {

        String a;
        String b;
        int c;
        String d;
        long e;
        String f;
        int g;
        int h;
        final bi i;

        public String a()
        {
            return az.b(a);
        }

        public int b()
        {
            return g;
        }

        public int c()
        {
            return h;
        }

        public String d()
        {
            return a;
        }

        public String e()
        {
            return f;
        }

        public String f()
        {
            return b;
        }

        public int g()
        {
            return c;
        }

        public long h()
        {
            return e;
        }

        public a(JSONObject jsonobject)
            throws Exception
        {
            i = bi.this;
            super();
            d = "";
            e = 0L;
            f = "";
            g = 0;
            h = 0;
            a = jsonobject.getString("video-url");
            b = jsonobject.getString("format");
            c = jsonobject.getInt("ad-size");
            f = jsonobject.getString("tag");
            if (!jsonobject.has("video-crc-32")) goto _L2; else goto _L1
_L1:
            e = jsonobject.getLong("video-crc-32");
_L4:
            bi1 = b.split("-")[1].split("x");
            g = Integer.parseInt(bi.this[0]);
            h = Integer.parseInt(bi.this[1]);
            return;
_L2:
            if (jsonobject.has("video-crc32"))
            {
                e = jsonobject.getLong("video-crc32");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }
    }


    private String k;
    private long l;
    private List m;
    private int n;
    private String o;
    private com.tremorvideo.sdk.android.richmedia.a p;

    public bi(fz fz, JSONObject jsonobject, boolean flag)
        throws Exception
    {
        int i = 0;
        super(fz, jsonobject, flag);
        l = 0L;
        m = new ArrayList();
        k = jsonobject.getString("asset-url");
        if (jsonobject.has("skip-delay"))
        {
            n = jsonobject.getInt("skip-delay");
        } else
        {
            n = 0;
        }
        if (!jsonobject.has("asset-crc-32")) goto _L2; else goto _L1
_L1:
        l = jsonobject.getLong("asset-crc-32");
_L4:
        for (fz = jsonobject.getJSONArray("video"); i < fz.length(); i++)
        {
            m.add(new a(fz.getJSONObject(i)));
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (jsonobject.has("asset-crc32"))
        {
            l = jsonobject.getLong("asset-crc32");
        }
        if (true) goto _L4; else goto _L3
_L3:
        a(jsonobject);
        return;
    }

    private ea[] d(String s)
    {
        boolean flag = false;
        Iterator iterator = a.iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (s.equals(((ea)iterator.next()).d()))
            {
                i++;
            }
        } while (true);
        ea aea[] = new ea[i];
        Iterator iterator1 = a.iterator();
        i = ((flag) ? 1 : 0);
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            ea ea1 = (ea)iterator1.next();
            if (s.equals(ea1.d()))
            {
                aea[i] = ea1;
                i++;
            }
        } while (true);
        return aea;
    }

    public com.tremorvideo.sdk.android.richmedia.a A()
    {
        return p;
    }

    public ea B()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ea ea1 = (ea)iterator.next();
            if (ea1.a() == ea.b.y)
            {
                return ea1;
            }
        }

        return null;
    }

    public ea C()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ea ea1 = (ea)iterator.next();
            if (ea1.a() == ea.b.z)
            {
                return ea1;
            }
        }

        return null;
    }

    public m[] D()
    {
        m am[] = new m[m.size()];
        for (int i = 0; i < m.size(); i++)
        {
            a a1 = (a)m.get(i);
            ea aea[] = d(a1.e());
            am[i] = new m(a1.e(), a1.a(), a1.b(), a1.c(), aea);
        }

        return am;
    }

    public String a(int i)
    {
        return ((a)m.get(i)).d();
    }

    public void a(Context context)
    {
        super.a(context);
        try
        {
            ZipFile zipfile = new ZipFile(new File(o));
            p = new com.tremorvideo.sdk.android.richmedia.a();
            p.a(zipfile, new f(context));
            c = new gd();
            c.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            p = null;
        }
        com.tremorvideo.sdk.android.videoad.ct.a(context);
    }

    public void a(String s, Object obj)
        throws Exception
    {
        if (s.compareTo("asset") == 0)
        {
            o = (String)obj;
            return;
        } else
        {
            super.a(s, obj);
            return;
        }
    }

    public int b(int i)
    {
        return ((a)m.get(i)).g();
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        HashMap hashmap3;
        for (Iterator iterator = m.iterator(); iterator.hasNext(); arraylist.add(new az.a(this, fp.d.b, "video", hashmap3)))
        {
            a a1 = (a)iterator.next();
            hashmap3 = new HashMap(2);
            hashmap3.put("ad", this);
            hashmap3.put("url", a1.d());
            hashmap3.put("crc", Long.valueOf(a1.h()));
            hashmap3.put("index", Integer.valueOf(m.indexOf(a1)));
        }

        HashMap hashmap = new HashMap(2);
        hashmap.put("url", k);
        hashmap.put("crc", Long.valueOf(l));
        arraylist.add(new az.a(this, com.tremorvideo.sdk.android.videoad.fp.d.a, "asset", hashmap));
        if (b != null)
        {
            HashMap hashmap1 = new HashMap(2);
            hashmap1.put("url", b.c());
            hashmap1.put("crc", Long.valueOf(b.d()));
            arraylist.add(new az.a(this, com.tremorvideo.sdk.android.videoad.fp.d.a, "coupon", hashmap1));
        }
        if (d != null)
        {
            arraylist.add(new az.a(this, fp.d.c, "survey"));
        }
        if (f != null)
        {
            HashMap hashmap2 = new HashMap(2);
            hashmap2.put("url", f.b());
            hashmap2.put("checkCache", Boolean.valueOf(false));
            arraylist.add(new az.a(this, com.tremorvideo.sdk.android.videoad.fp.d.a, "buyItNowDealsXml", hashmap2));
            hashmap2 = new HashMap(3);
            hashmap2.put("url", f.c());
            hashmap2.put("crc", f.d());
            hashmap2.put("checkCache", Boolean.valueOf(true));
            arraylist.add(new az.a(this, com.tremorvideo.sdk.android.videoad.fp.d.a, "buyItNowTemplate", hashmap2));
            arraylist.add(new az.a(this, com.tremorvideo.sdk.android.videoad.fp.d.f, "processBIN"));
        }
        return arraylist;
    }

    public String c(int i)
    {
        return ((a)m.get(i)).f();
    }

    public int d(int i)
    {
        if (i < m.size())
        {
            return ((a)m.get(i)).g();
        } else
        {
            return 0;
        }
    }

    public void d()
    {
        super.d();
        p.d();
    }

    public long f(int i)
    {
        return ((a)m.get(i)).h();
    }

    public String j()
    {
        return b(k);
    }

    public int k()
    {
        return m.size() + 1;
    }

    public String[] l()
    {
        String as[] = new String[m.size() + 1];
        for (int i = 0; i < m.size(); i++)
        {
            as[i] = ((a)m.get(i)).a();
        }

        as[m.size()] = j();
        return as;
    }

    protected boolean p()
    {
        return true;
    }

    public int z()
    {
        return n;
    }
}
