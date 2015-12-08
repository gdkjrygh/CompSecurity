// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.mopub.mobileads:
//            e, f

public class AdRequestStatusMapping
{

    private final Map a = new TreeMap();

    public AdRequestStatusMapping()
    {
    }

    final void a(String s)
    {
        a.remove(s);
    }

    final void a(String s, String s1, String s2, String s3)
    {
        a.put(s, new e(f.LOADED, s1, s2, s3));
    }

    final void b(String s)
    {
        a.put(s, new e(f.LOADING));
    }

    final void c(String s)
    {
        if (a.containsKey(s))
        {
            com.mopub.mobileads.e.a((e)a.get(s), f.PLAYED);
            return;
        } else
        {
            a.put(s, new e(f.PLAYED));
            return;
        }
    }

    final boolean d(String s)
    {
        s = (e)a.get(s);
        return s != null && f.LOADED.equals(com.mopub.mobileads.e.a(s));
    }

    final boolean e(String s)
    {
        if (!a.containsKey(s))
        {
            return false;
        }
        return com.mopub.mobileads.e.a((e)a.get(s)) == f.LOADING;
    }

    final String f(String s)
    {
        if (!a.containsKey(s))
        {
            return null;
        } else
        {
            return com.mopub.mobileads.e.b((e)a.get(s));
        }
    }

    final String g(String s)
    {
        if (!a.containsKey(s))
        {
            return null;
        } else
        {
            return com.mopub.mobileads.e.c((e)a.get(s));
        }
    }

    final String h(String s)
    {
        if (!a.containsKey(s))
        {
            return null;
        } else
        {
            return com.mopub.mobileads.e.d((e)a.get(s));
        }
    }

    final void i(String s)
    {
        if (a.containsKey(s))
        {
            com.mopub.mobileads.e.e((e)a.get(s));
        }
    }

    final void j(String s)
    {
        if (a.containsKey(s))
        {
            com.mopub.mobileads.e.f((e)a.get(s));
        }
    }
}
