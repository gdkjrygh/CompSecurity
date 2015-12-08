// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d;

import a.a.az;
import a.a.bu;
import a.a.dl;
import a.a.dm;
import a.a.j;
import android.graphics.Bitmap;
import android.net.Uri;
import com.appboy.b.a.a;
import com.appboy.b.a.b;
import com.appboy.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d:
//            a, c

public abstract class d
    implements com.appboy.d.a, c
{

    protected static final String a;
    protected String b;
    protected String c;
    protected az d;
    private String e;
    private Map f;
    private boolean g;
    private boolean h;
    private a i;
    private Uri j;
    private b k;
    private int l;
    private JSONObject m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private String t;
    private String u;
    private Bitmap v;

    protected d()
    {
        g = true;
        h = true;
        i = a.c;
        k = b.a;
        l = 5000;
        n = false;
        o = false;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
    }

    private d(String s1, Map map, a a1, String s2, int i1, int j1, int k1, 
            int l1, String s3, String s4, b b1, int i2, String s5, String s6, 
            JSONObject jsonobject, az az1)
    {
        g = true;
        h = true;
        i = a.c;
        k = b.a;
        l = 5000;
        n = false;
        o = false;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        e = s1;
        f = map;
        g = true;
        h = true;
        i = a1;
        if (i == a.b && !dm.c(s2))
        {
            j = Uri.parse(s2);
        }
        if (b1 == b.b)
        {
            k = b.c;
        } else
        {
            k = b1;
        }
        if (i2 < 999)
        {
            l = 5000;
            com.appboy.f.a.c(a, (new StringBuilder("Requested in-app message duration ")).append(i2).append(" is lower than the minimum of 999. Defaulting to ").append(l).append(" milliseconds.").toString());
        } else
        {
            l = i2;
            com.appboy.f.a.b(a, (new StringBuilder("Set in-app message duration to ")).append(l).append(" milliseconds.").toString());
        }
        p = i1;
        r = j1;
        s = k1;
        q = l1;
        t = s3;
        u = s4;
        b = s5;
        c = s6;
        m = jsonobject;
        n = false;
        o = false;
        d = az1;
    }

    public d(JSONObject jsonobject, az az1)
    {
        this(jsonobject.optString("message"), dl.a(jsonobject.optJSONObject("extras"), new HashMap()), (a)dl.a(jsonobject, "click_action", com/appboy/b/a/a, a.c), jsonobject.optString("uri"), jsonobject.optInt("bg_color"), jsonobject.optInt("icon_color"), jsonobject.optInt("icon_bg_color"), jsonobject.optInt("text_color"), jsonobject.optString("icon"), jsonobject.optString("image_url"), (b)dl.a(jsonobject, "message_close", com/appboy/b/a/b, b.a), jsonobject.optInt("duration"), jsonobject.optString("campaign_id"), jsonobject.optString("card_id"), jsonobject, az1);
    }

    public final volatile Object a()
    {
        return m;
    }

    public final void a(Bitmap bitmap)
    {
        v = bitmap;
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final String b()
    {
        return e;
    }

    public final Map c()
    {
        return f;
    }

    public final int d()
    {
        return l;
    }

    public final int e()
    {
        return p;
    }

    public final int f()
    {
        return r;
    }

    public final int g()
    {
        return s;
    }

    public final int h()
    {
        return q;
    }

    public final String i()
    {
        return t;
    }

    public final String j()
    {
        return u;
    }

    public final boolean k()
    {
        return g;
    }

    public final boolean l()
    {
        return h;
    }

    public final a m()
    {
        return i;
    }

    public final Uri n()
    {
        return j;
    }

    public final Bitmap o()
    {
        return v;
    }

    public final b p()
    {
        return k;
    }

    public final void q()
    {
        g = false;
    }

    public final boolean r()
    {
        while (dm.b(b) && dm.b(c) || n) 
        {
            return false;
        }
        if (d == null)
        {
            com.appboy.f.a.d(a, "Cannot log an in-app message impression because the AppboyManager is null.");
            return false;
        }
        try
        {
            String s1 = b;
            Object obj = c;
            JSONObject jsonobject = new JSONObject();
            if (!dm.b(s1))
            {
                JSONArray jsonarray1 = new JSONArray();
                jsonarray1.put(s1);
                jsonobject.put("campaign_ids", jsonarray1);
            }
            if (!dm.b(((String) (obj))))
            {
                JSONArray jsonarray = new JSONArray();
                jsonarray.put(obj);
                jsonobject.put("card_ids", jsonarray);
            }
            obj = new bu(j.o, jsonobject);
            d.a(((a.a.bj) (obj)));
            n = true;
        }
        catch (JSONException jsonexception)
        {
            d.a(jsonexception);
            return false;
        }
        return true;
    }

    public final boolean s()
    {
        if (dm.b(b) && dm.b(c))
        {
            return false;
        }
        if (o)
        {
            com.appboy.f.a.b(a, "Click already logged for this in-app message. Ignoring.");
            return false;
        }
        if (d == null)
        {
            com.appboy.f.a.d(a, "Cannot log a in-app message click because the AppboyManager is null.");
            return false;
        }
        try
        {
            String s1 = b;
            Object obj = c;
            JSONObject jsonobject = new JSONObject();
            if (!dm.b(s1))
            {
                JSONArray jsonarray1 = new JSONArray();
                jsonarray1.put(s1);
                jsonobject.put("campaign_ids", jsonarray1);
            }
            if (!dm.b(((String) (obj))))
            {
                JSONArray jsonarray = new JSONArray();
                jsonarray.put(obj);
                jsonobject.put("card_ids", jsonarray);
            }
            obj = new bu(j.p, jsonobject);
            d.a(((a.a.bj) (obj)));
            o = true;
        }
        catch (JSONException jsonexception)
        {
            d.a(jsonexception);
            return false;
        }
        return true;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/d/d.getName()
        });
    }
}
