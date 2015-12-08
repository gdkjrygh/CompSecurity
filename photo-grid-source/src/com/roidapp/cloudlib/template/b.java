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

public final class b
{

    private LinkedList a;

    protected b()
    {
        a = new LinkedList();
    }

    private boolean c()
    {
        if (a == null)
        {
            return true;
        } else
        {
            return a.isEmpty();
        }
    }

    private void d()
    {
        ArrayList arraylist = new ArrayList(a.size());
        HashMap hashmap;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(hashmap))
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

        j.a(arraylist, "local");
    }

    public final int a()
    {
        if (c())
        {
            return 0;
        } else
        {
            return a.size();
        }
    }

    public final TemplateInfo a(int i)
    {
        if (c() || i < 0 || i >= a.size())
        {
            return null;
        } else
        {
            return (TemplateInfo)a.get(i);
        }
    }

    public final void a(TemplateInfo templateinfo)
    {
        if ((templateinfo instanceof TemplateInfo) && a != null && !c(templateinfo))
        {
            a.addFirst(templateinfo);
            d();
        }
    }

    public final void a(List list)
    {
        if (a != null && a.isEmpty() && list != null)
        {
            a.addAll(list);
        }
    }

    public final void b()
    {
        if (a != null)
        {
            a.clear();
        }
    }

    public final void b(TemplateInfo templateinfo)
    {
        if ((templateinfo instanceof TemplateInfo) && a != null)
        {
            a.remove(templateinfo);
            d();
        }
    }

    public final boolean c(TemplateInfo templateinfo)
    {
        if (c())
        {
            return false;
        } else
        {
            return a.contains(templateinfo);
        }
    }
}
