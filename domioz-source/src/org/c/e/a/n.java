// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.a;

import java.util.List;
import org.c.c.b.a.a;
import org.c.c.b.b;
import org.c.c.b.c.e;
import org.c.c.b.i;
import org.c.c.b.j;
import org.c.d.c;

// Referenced classes of package org.c.e.a:
//            l

final class n
{

    private static final boolean a = org.c.d.c.isPresent("javax.xml.transform.Source", org/c/e/a/l.getClassLoader());
    private static final boolean b = org.c.d.c.isPresent("org.simpleframework.xml.Serializer", org/c/e/a/l.getClassLoader());
    private static final boolean c;
    private static final boolean d;
    private static final boolean e = org.c.d.c.isPresent("com.google.code.rome.android.repackaged.com.sun.syndication.feed.synd.SyndFeed", org/c/e/a/l.getClassLoader());

    public static void a(List list)
    {
        list.add(new b());
        list.add(new j());
        list.add(new i());
        if (a)
        {
            list.add(new org.c.c.b.c.c());
            list.add(new e());
        } else
        {
            list.add(new org.c.c.b.c());
        }
        if (b)
        {
            list.add(new org.c.c.b.c.b());
        }
        if (!d) goto _L2; else goto _L1
_L1:
        list.add(new org.c.c.b.b.b());
_L4:
        if (e)
        {
            list.add(new a());
        }
        return;
_L2:
        if (c)
        {
            list.add(new org.c.c.b.b.c());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (org.c.d.c.isPresent("org.codehaus.jackson.map.ObjectMapper", org/c/e/a/l.getClassLoader()) && org.c.d.c.isPresent("org.codehaus.jackson.JsonGenerator", org/c/e/a/l.getClassLoader()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (org.c.d.c.isPresent("com.fasterxml.jackson.databind.ObjectMapper", org/c/e/a/l.getClassLoader()) && org.c.d.c.isPresent("com.fasterxml.jackson.core.JsonGenerator", org/c/e/a/l.getClassLoader()))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
