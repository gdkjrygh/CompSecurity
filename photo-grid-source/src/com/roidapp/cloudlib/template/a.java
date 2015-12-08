// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.template:
//            TemplateInfo, j

public final class a
{

    private static TemplateInfo a;
    private LinkedList b;

    public a()
    {
        b = new LinkedList();
    }

    public static void a()
    {
        if (a != null)
        {
            a = null;
        }
    }

    public static void a(TemplateInfo templateinfo)
    {
        a = templateinfo;
    }

    public static TemplateInfo d()
    {
        return a;
    }

    private void h()
    {
        ArrayList arraylist = new ArrayList(b.size());
        HashMap hashmap;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.add(hashmap))
        {
            TemplateInfo templateinfo = (TemplateInfo)iterator.next();
            hashmap = new HashMap();
            hashmap.put("id", Long.valueOf(templateinfo.e()));
            hashmap.put("version", Float.valueOf(templateinfo.f()));
            hashmap.put("url", templateinfo.h());
            hashmap.put("downloadUrl", templateinfo.g());
            hashmap.put("height", Integer.valueOf(templateinfo.l()));
            hashmap.put("width", Integer.valueOf(templateinfo.k()));
            hashmap.put("templateName", templateinfo.i());
            hashmap.put("supportLayout", Boolean.valueOf(templateinfo.m()));
            hashmap.put("needFilter", Boolean.valueOf(templateinfo.n()));
            hashmap.put("needWeather", Boolean.valueOf(templateinfo.p()));
            hashmap.put("count", Integer.valueOf(templateinfo.j()));
            hashmap.put("toCameraPreview", Boolean.valueOf(templateinfo.o()));
            hashmap.put("needLock", Boolean.valueOf(templateinfo.q()));
        }

        j.a(arraylist, "favourite");
    }

    public final TemplateInfo a(int i)
    {
        if (f() || i < 0 || i >= b.size())
        {
            return null;
        } else
        {
            return (TemplateInfo)b.get(i);
        }
    }

    public final void a(List list)
    {
        if (b != null && b.isEmpty() && list != null)
        {
            b.addAll(list);
        }
    }

    public final void b()
    {
        if ((a instanceof TemplateInfo) && !d(a))
        {
            b.addFirst(a);
            h();
        }
    }

    public final void b(TemplateInfo templateinfo)
    {
        if ((templateinfo instanceof TemplateInfo) && !d(templateinfo))
        {
            b.addFirst(templateinfo);
            h();
        }
    }

    public final void c()
    {
        b.remove(a);
        h();
    }

    public final void c(TemplateInfo templateinfo)
    {
        if (b != null)
        {
            b.remove(templateinfo);
            h();
        }
    }

    public final boolean d(TemplateInfo templateinfo)
    {
        if (f())
        {
            return false;
        } else
        {
            return b.contains(templateinfo);
        }
    }

    public final int e()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.size();
        }
    }

    public final boolean f()
    {
        if (b == null)
        {
            return true;
        } else
        {
            return b.isEmpty();
        }
    }

    public final void g()
    {
        if (b != null)
        {
            b.clear();
        }
    }
}
