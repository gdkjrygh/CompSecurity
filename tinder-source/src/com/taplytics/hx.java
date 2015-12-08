// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.taplytics:
//            ax, hy, a, ih, 
//            c, id

public final class hx
{

    final hy a = new hy();
    final a b;
    private final String c;

    public hx(String s, a a1)
    {
        ax.a(s, "Name");
        ax.a(a1, "Body");
        c = s;
        b = a1;
        s = new StringBuilder();
        s.append("form-data; name=\"");
        s.append(c);
        s.append("\"");
        if (a1.a() != null)
        {
            s.append("; filename=\"");
            s.append(a1.a());
            s.append("\"");
        }
        a("Content-Disposition", s.toString());
        if (a1 instanceof ih)
        {
            s = ((ih)a1).a;
        } else
        {
            s = null;
        }
        if (s != null)
        {
            a("Content-Type", s.toString());
        } else
        {
            s = new StringBuilder();
            s.append(a1.b());
            if (a1.c() != null)
            {
                s.append("; charset=");
                s.append(a1.c());
            }
            a("Content-Type", s.toString());
        }
        a("Content-Transfer-Encoding", a1.d());
    }

    private void a(String s, String s1)
    {
        ax.a(s, "Field name");
        hy hy1 = a;
        id id1 = new id(s, s1);
        String s2 = id1.a.toLowerCase(Locale.ROOT);
        s1 = (List)hy1.b.get(s2);
        s = s1;
        if (s1 == null)
        {
            s = new LinkedList();
            hy1.b.put(s2, s);
        }
        s.add(id1);
        hy1.a.add(id1);
    }
}
