// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;

import ep;
import java.util.HashMap;
import java.util.Map;
import uA;

// Referenced classes of package com.snapchat.android.discover.model:
//            DSnapPage, MediaState, DSnapPanel

public static final class t
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

    public final t a(String s1, DSnapPanel dsnappanel)
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

    public ()
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
