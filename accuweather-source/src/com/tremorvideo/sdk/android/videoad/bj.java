// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import com.tremorvideo.sdk.android.videoad.a.a;
import com.tremorvideo.sdk.android.videoad.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bk, ea, gd, ct, 
//            fz

public class bj extends bk
{

    List k;
    List l;
    String m;
    boolean n;

    public bj(fz fz, JSONObject jsonobject, boolean flag)
        throws Exception
    {
        super(fz, jsonobject);
        l = new ArrayList();
        n = true;
        o = 0;
        p = true;
        q = 3;
        w = com.tremorvideo.sdk.android.videoad.bk.a.a;
        d = null;
        x = null;
        F = false;
        k = new ArrayList();
        fz = new HashMap(2);
        fz.put("url", jsonobject.get("url"));
        k.add(new az.a(this, fp.d.e, "vast", fz));
    }

    private void O()
    {
        a = new ArrayList();
        if (m.length() > 0)
        {
            a.add(new ea(ea.b.b, m, d("click")));
        }
        a.add(new ea(ea.b.v, "", d("close")));
    }

    private void P()
    {
        if (n)
        {
            n = false;
            a(ea.b.j, 0, "impression");
            a(ea.b.j, 0, "creativeView");
            a(ea.b.j, 0, "start");
            a(ea.b.j, v / 4, "firstQuartile");
            a(ea.b.j, v / 2, "midPoint");
            a(ea.b.j, (v / 4) * 3, "thirdQuartile");
            a(ea.b.j, v, "complete");
        }
    }

    private void a(ea.b b1, int i, String s)
    {
        s = d(s);
        if (s.length > 0)
        {
            a.add(new ea(b1, i, s));
        }
    }

    public void a(Context context)
    {
        h = true;
        c = new gd();
        c.a();
    }

    public void a(String s, Object obj)
        throws Exception
    {
        if (s.equalsIgnoreCase("vast"))
        {
            s = (a)obj;
            l.addAll(s.a());
            if (s.b())
            {
                obj = new HashMap(2);
                ((Map) (obj)).put("url", s.d());
                k.add(new az.a(this, fp.d.e, "vast", ((Map) (obj))));
                if (k.size() > 100)
                {
                    throw new Exception("Too many VAST hops.");
                }
            } else
            {
                r = s.c();
                t = (new StringBuilder()).append("H264-").append(s.e()).append("x").append(s.f()).append("-4x3").toString();
                m = s.g();
                v = s.h();
                O();
                s = new HashMap(4);
                s.put("ad", this);
                s.put("url", r.replace("|", "%7C"));
                s.put("index", Integer.valueOf(0));
                k.add(new az.a(this, fp.d.b, "video", s));
            }
        }
    }

    public List b()
    {
        return k;
    }

    String[] d(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = l.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (c1.a.equalsIgnoreCase(s))
            {
                arraylist.add(c1.b);
            }
        } while (true);
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public boolean g(int i)
    {
        if (n && i > 0)
        {
            ct.d((new StringBuilder()).append("Building timer events with a duration of: ").append(i).append("ms").toString());
            v = i;
            P();
            return true;
        } else
        {
            return false;
        }
    }

    public String j()
    {
        return b(r);
    }

    public String[] l()
    {
        return (new String[] {
            b(r)
        });
    }

    public boolean n()
    {
        return r != null;
    }

    public boolean x()
    {
        return false;
    }
}
