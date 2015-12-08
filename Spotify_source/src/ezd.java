// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import java.util.HashMap;
import java.util.Map;

public final class ezd
    implements ezg
{

    static Map a;
    public static final String b[] = {
        "_id", "is_seen", "message", "time_added", "added_by_name", "added_by_uri", "added_by_icon_uri", "type", "data", "is_user_browsable"
    };
    int c;
    int d;
    String e;
    boolean f;
    String g;
    String h;
    String i;
    boolean j;
    int k;
    String l;
    String m;
    String n;
    String o;
    String p;
    String q;
    String r;
    String s;
    String t;
    boolean u;
    boolean v;
    boolean w;

    public ezd()
    {
    }

    public final String a(Resources resources)
    {
        if (k == 3)
        {
            if (v)
            {
                return resources.getString(0x7f0803ff);
            }
            if (w)
            {
                return resources.getString(0x7f080400);
            }
        }
        return l;
    }

    final void a()
    {
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        l = null;
        m = null;
        n = null;
        u = false;
    }

    public final int b()
    {
        return c;
    }

    public final String b(Resources resources)
    {
        if (k == 3)
        {
            return resources.getString(0x7f080321, new Object[] {
                m
            });
        }
        if (k == 2)
        {
            return "";
        } else
        {
            return resources.getString(0x7f08031b, new Object[] {
                m
            });
        }
    }

    public final int c()
    {
        return d;
    }

    public final String d()
    {
        return e;
    }

    public final boolean e()
    {
        return f;
    }

    public final String f()
    {
        return g;
    }

    public final String g()
    {
        return h;
    }

    public final String h()
    {
        return i;
    }

    public final boolean i()
    {
        return j;
    }

    public final int j()
    {
        return k;
    }

    public final String k()
    {
        return n;
    }

    public final String l()
    {
        return o;
    }

    public final String m()
    {
        return p;
    }

    public final String n()
    {
        return q;
    }

    public final String o()
    {
        return r;
    }

    public final String p()
    {
        return s;
    }

    public final String q()
    {
        return t;
    }

    public final boolean r()
    {
        return u;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put("unknown", Integer.valueOf(-1));
        a.put("track", Integer.valueOf(0));
        a.put("album", Integer.valueOf(1));
        a.put("artist", Integer.valueOf(2));
        a.put("playlist", Integer.valueOf(3));
    }
}
