// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.net.Uri;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.facebook.orca.prefs:
//            ba, n

public class az
{

    private final d a;
    private final WeakHashMap b = new WeakHashMap();

    public az(d d1)
    {
        a = d1;
    }

    private void d(String s, String s1)
    {
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); ((ba)iterator.next()).a(s, s1)) { }
    }

    private ae e(String s, String s1)
    {
        ae ae1 = (ae)n.L.c(Uri.encode(s));
        s = ae1;
        if (s1 != null)
        {
            s = (ae)ae1.c((new StringBuilder()).append("/").append(Uri.encode(s1)).toString());
        }
        return (ae)s.c("/count");
    }

    private ae f(String s, String s1)
    {
        ae ae1 = (ae)n.L.c(Uri.encode(s));
        s = ae1;
        if (s1 != null)
        {
            s = (ae)ae1.c((new StringBuilder()).append("/").append(Uri.encode(s1)).toString());
        }
        return (ae)s.c("/timestamp");
    }

    public int a(String s)
    {
        return a(s, ((String) (null)));
    }

    public int a(String s, String s1)
    {
        s = e(s, s1);
        return a.a(s, 0);
    }

    public void a(ba ba1)
    {
        b.put(ba1, Integer.valueOf(1));
    }

    public void a(String s, int i)
    {
        a(s, null, i);
    }

    public void a(String s, String s1, int i)
    {
        e e1 = a.b();
        e1.a(e(s, s1), i);
        e1.a(f(s, s1), System.currentTimeMillis());
        e1.a();
        d(s, s1);
    }

    public long b(String s)
    {
        return b(s, null);
    }

    public long b(String s, String s1)
    {
        s = f(s, s1);
        return a.a(s, 0L);
    }

    public void c(String s)
    {
        c(s, null);
    }

    public void c(String s, String s1)
    {
        int i = a(s, s1);
        e e1 = a.b();
        e1.a(e(s, s1), i + 1);
        e1.a(f(s, s1), System.currentTimeMillis());
        e1.a();
        d(s, s1);
    }
}
