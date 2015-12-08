// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

final class dmp
    implements dme
{

    final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Uri b;
    private final gro c;
    private final grr d = new grr();

    dmp(String s)
    {
        c = ((dms)dmz.a(dms)).a;
        b = Uri.parse(s);
    }

    private dmk a(dmg dmg, gqs gqs1)
    {
        return new dmk(gqs1, dmg) {

            private gqs a;
            private dmg b;
            private dmp c;

            public final void a(int i, JSONArray jsonarray)
            {
                c.a.remove(a);
                b.a(i, jsonarray);
            }

            public final void a(Throwable throwable, String s)
            {
                c.a.remove(a);
                b.a(throwable, s);
            }

            public final void b(grq grq1, IOException ioexception)
            {
                c.a.remove(a);
                b.a(ioexception, grq1.toString());
            }

            
            {
                c = dmp.this;
                a = gqs1;
                b = dmg1;
                super();
            }
        };
    }

    private dml a(dmh dmh, gqs gqs1)
    {
        return new dml(gqs1, dmh) {

            private gqs a;
            private dmh b;
            private dmp c;

            public final void a(int i, JSONObject jsonobject)
            {
                c.a.remove(a);
                b.a(i, jsonobject);
            }

            public final void a(Throwable throwable, String s)
            {
                c.a.remove(a);
                b.a(throwable, s);
            }

            public final void b(grq grq1, IOException ioexception)
            {
                c.a.remove(a);
                b.a(ioexception, grq1.toString());
            }

            
            {
                c = dmp.this;
                a = gqs1;
                b = dmh1;
                super();
            }
        };
    }

    private dmn a(dmi dmi, gqs gqs1)
    {
        return new dmn(gqs1, dmi) {

            private gqs a;
            private dmi b;
            private dmp c;

            public final void a(int i, String s)
            {
                c.a.remove(a);
                b.a(i, s);
            }

            public final void b(grq grq1, IOException ioexception)
            {
                c.a.remove(a);
                b.a(ioexception, grq1.toString());
            }

            
            {
                c = dmp.this;
                a = gqs1;
                b = dmi1;
                super();
            }
        };
    }

    private gqs a(String s, Map map)
    {
        android.net.Uri.Builder builder = b.buildUpon();
        if (!TextUtils.isEmpty(s))
        {
            builder.path(s);
        }
        if (map != null)
        {
            for (s = map.entrySet().iterator(); s.hasNext(); builder.appendQueryParameter((String)map.getKey(), (String)map.getValue()))
            {
                map = (java.util.Map.Entry)s.next();
            }

        }
        s = builder.build().toString();
        d.a(s);
        s = c.a(d.b());
        a.add(s);
        return s;
    }

    private gqs b(String s, Map map)
    {
        grf grf1 = new grf();
        if (map != null)
        {
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); grf1.a((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        if (!TextUtils.isEmpty(s))
        {
            s = b.buildUpon().path(s).build().toString();
        } else
        {
            s = b.toString();
        }
        s = d.a(s).a(grf1.a()).b();
        s = c.a(s);
        a.add(s);
        return s;
    }

    public final void a()
    {
        (new dmq(a)).start();
    }

    public final void a(String s)
    {
        d.a("User-Agent", s);
    }

    public final void a(String s, dmg dmg)
    {
        s = a(s, ((Map) (null)));
        s.a(a(dmg, ((gqs) (s))));
    }

    public final void a(String s, String s1)
    {
        d.a(s, s1);
    }

    public final void a(String s, Map map, dmg dmg)
    {
        s = b(s, map);
        s.a(a(dmg, ((gqs) (s))));
    }

    public final void a(String s, Map map, dmh dmh)
    {
        s = a(s, map);
        s.a(a(dmh, ((gqs) (s))));
    }

    public final void a(String s, Map map, dmi dmi)
    {
        s = a(s, map);
        s.a(a(dmi, ((gqs) (s))));
    }

    public final boolean a(int i)
    {
        return i >= 200 && i < 300;
    }

    public final void b(String s, Map map, dmh dmh)
    {
        s = b(s, map);
        s.a(a(dmh, s));
    }

    public final void b(String s, Map map, dmi dmi)
    {
        s = b(s, map);
        s.a(a(dmi, s));
    }
}
