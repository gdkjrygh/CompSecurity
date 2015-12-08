// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.filter.Filter;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Context

class TemplateFilter
    implements Filter
{

    private Context context;
    private Filter filter;

    public TemplateFilter(Context context1, Filter filter1)
    {
        context = context1;
        filter = filter1;
    }

    public String replace(String s)
    {
        Object obj = context.getAttribute(s);
        if (obj != null)
        {
            return obj.toString();
        } else
        {
            return filter.replace(s);
        }
    }
}
