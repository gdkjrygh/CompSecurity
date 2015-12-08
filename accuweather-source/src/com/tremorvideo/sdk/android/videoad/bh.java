// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import com.tremorvideo.sdk.android.d.a;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            az, ea, ct, fz

public class bh extends az
{

    public String k;
    public String l;
    public int m;
    public int n;
    private String o;
    private long p;
    private long q;
    private String r;
    private String s;
    private a t;

    public bh(fz fz, JSONObject jsonobject, boolean flag)
        throws Exception
    {
        super(fz, jsonobject, flag);
        p = 0L;
        q = 0L;
        m = -1;
        n = 0;
        k = jsonobject.getString("url");
        if (k.endsWith(".zip"))
        {
            if (jsonobject.has("mraid-ad-crc32"))
            {
                p = jsonobject.getLong("mraid-ad-crc32");
            }
            if (jsonobject.has("ad-size"))
            {
                n = jsonobject.getInt("ad-size");
            } else
            {
                fz = (new URL(k)).openConnection();
                fz.connect();
                n = fz.getContentLength();
            }
        }
        o = jsonobject.getString("asset-url");
        if (jsonobject.has("asset-crc32"))
        {
            q = jsonobject.getLong("asset-crc32");
        }
        if (jsonobject.has("preferred-orientation"))
        {
            m = jsonobject.getInt("preferred-orientation");
        } else
        {
            m = -1;
        }
        a(jsonobject);
    }

    public String A()
    {
        return t.a;
    }

    public a B()
    {
        return t;
    }

    public ea C()
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

    public ea D()
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

    public boolean E()
    {
        return t.b();
    }

    public void a(Context context)
    {
        super.a(context);
        t = new a(context);
        if (!k.endsWith(".zip"))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        l = t.a(r);
_L1:
        t.c(s);
        return;
        try
        {
            l = t.b(k);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.tremorvideo.sdk.android.videoad.ct.a(context);
            return;
        }
          goto _L1
    }

    public void a(String s1, Object obj)
        throws Exception
    {
        if (s1.compareTo("adZipAsset") == 0)
        {
            r = (String)obj;
            return;
        }
        if (s1.compareTo("JSZipAsset") == 0)
        {
            s = (String)obj;
            return;
        } else
        {
            super.a(s1, obj);
            return;
        }
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap(2);
        hashmap.put("url", k);
        if (p > 0L)
        {
            hashmap.put("crc", Long.valueOf(p));
        }
        hashmap.put("mraid", Boolean.valueOf(true));
        arraylist.add(new az.a(this, com.tremorvideo.sdk.android.videoad.fp.d.a, "adZipAsset", hashmap));
        hashmap = new HashMap(1);
        hashmap.put("url", o);
        if (q > 0L)
        {
            hashmap.put("crc", Long.valueOf(q));
        }
        arraylist.add(new az.a(this, com.tremorvideo.sdk.android.videoad.fp.d.a, "JSZipAsset", hashmap));
        return arraylist;
    }

    public int d(int i)
    {
        if (n > 0)
        {
            return n;
        } else
        {
            return 0;
        }
    }

    public void d()
    {
        super.d();
        t.c();
    }

    public String j()
    {
        return b(k);
    }

    public int k()
    {
        return !k.endsWith(".zip") ? 0 : 1;
    }

    public String[] l()
    {
        if (k.endsWith(".zip"))
        {
            return (new String[] {
                j()
            });
        } else
        {
            return super.l();
        }
    }

    protected boolean p()
    {
        return true;
    }

    public void z()
    {
        t.a();
    }
}
