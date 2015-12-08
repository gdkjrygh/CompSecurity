// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.filter;

import java.util.Map;

// Referenced classes of package fs.org.simpleframework.xml.filter:
//            Filter

public class MapFilter
    implements Filter
{

    private Filter filter;
    private Map map;

    public MapFilter(Map map1)
    {
        this(map1, null);
    }

    public MapFilter(Map map1, Filter filter1)
    {
        filter = filter1;
        map = map1;
    }

    public String replace(String s)
    {
        Object obj = null;
        if (map != null)
        {
            obj = map.get(s);
        }
        if (obj != null)
        {
            return obj.toString();
        }
        if (filter != null)
        {
            return filter.replace(s);
        } else
        {
            return null;
        }
    }
}
