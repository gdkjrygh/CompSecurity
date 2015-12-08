// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;

import com.google.android.apps.gsa.shared.b.a;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.base.p;
import com.google.common.base.q;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            l, i

public final class m
{

    String a;
    URL b;
    List c;
    boolean d;
    boolean e;
    int f;
    boolean g;
    int h;
    public int i;
    int j;
    int k;
    int l;
    q m;

    m()
    {
        b = null;
        c = new ArrayList();
        d = true;
        e = true;
        g = true;
        h = -1;
        i = -1;
        j = -1;
        k = -1;
        l = 3;
        m = l.c;
    }

    public m(l l1)
    {
        b = null;
        c = new ArrayList();
        d = true;
        e = true;
        g = true;
        h = -1;
        i = -1;
        j = -1;
        k = -1;
        l = 3;
        m = l.c;
        b = l1.f;
        a = l1.g;
        c = new ArrayList(l1.h);
        d = l1.k;
        e = l1.l;
        f = l1.n;
        g = l1.j;
        h = l1.i;
        i = l1.m;
        j = l1.o;
        k = l1.p;
        l = l1.q;
        m = l1.s;
    }

    public final l a()
    {
        return new l(this);
    }

    public final m a(String s)
    {
        try
        {
            b = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.apps.gsa.shared.b.a.a(0x111a2ad);
            throw s;
        }
        return this;
    }

    public final m a(String s, String s1)
    {
        p.a(s);
        p.a(s1);
        String s2 = s.toLowerCase(Locale.US);
        if (l.b.contains(s2))
        {
            Iterator iterator = c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((i)iterator.next()).b.equalsIgnoreCase(s))
                {
                    L.a(5, "HttpRequestData", "Header %s alredy set!", new Object[] {
                        s
                    });
                }
            } while (true);
        }
        c.add(new i(s, s1));
        return this;
    }

    public final m b(String s, String s1)
    {
        p.a(s);
        p.a(s1);
        for (int i1 = c.size() - 1; i1 >= 0; i1--)
        {
            if (((i)c.get(i1)).b.equalsIgnoreCase(s))
            {
                c.remove(i1);
            }
        }

        c.add(new i(s, s1));
        return this;
    }
}
