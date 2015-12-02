// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json.jsonmirror.a;

import com.facebook.common.json.jsonmirror.JMAutogen;
import com.facebook.common.json.jsonmirror.b;
import com.facebook.common.json.jsonmirror.d;
import com.facebook.common.w.s;
import com.facebook.debug.b.a;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.common.json.jsonmirror.a:
//            c, h, a

public class e extends c
{

    private Class g;
    private com.facebook.common.json.jsonmirror.a.a h;

    public e(Class class1, boolean flag)
    {
        g = class1;
        h = JMAutogen.b(class1);
        if (flag)
        {
            g = java/util/List;
            class1 = new HashSet();
            class1.add(h);
            h = new h(class1);
        }
    }

    public b a()
    {
        return new d(g);
    }

    public s a(String s1)
    {
        return new s(s1, h);
    }

    public void a(b b1, String s1, double d1)
    {
        com.facebook.debug.b.a.b(b1 instanceof d);
        ((d)b1).a(s1, Double.valueOf(d1));
    }

    public void a(b b1, String s1, long l)
    {
        if (g.isInstance(Long.valueOf(l)))
        {
            com.facebook.debug.b.a.b(b1 instanceof d);
            ((d)b1).a(s1, Long.valueOf(l));
        }
    }

    public void a(b b1, String s1, b b2)
    {
        com.facebook.debug.b.a.b(b1 instanceof d);
        ((d)b1).a(s1, b2);
    }

    public void a(b b1, String s1, String s2)
    {
        com.facebook.debug.b.a.b(b1 instanceof d);
        ((d)b1).a(s1, s2);
    }

    public void a(b b1, String s1, List list)
    {
        com.facebook.debug.b.a.b(b1 instanceof d);
        ((d)b1).a(s1, list);
    }

    public void a(b b1, String s1, Map map)
    {
        com.facebook.debug.b.a.b(b1 instanceof d);
        ((d)b1).a(s1, map);
    }

    public void a(b b1, String s1, boolean flag)
    {
        com.facebook.debug.b.a.b(b1 instanceof d);
        ((d)b1).a(s1, Boolean.valueOf(flag));
    }

    public boolean b()
    {
        return false;
    }
}
