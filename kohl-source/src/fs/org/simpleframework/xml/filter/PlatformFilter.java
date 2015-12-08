// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.filter;

import java.util.Map;

// Referenced classes of package fs.org.simpleframework.xml.filter:
//            StackFilter, EnvironmentFilter, SystemFilter, MapFilter

public class PlatformFilter extends StackFilter
{

    public PlatformFilter()
    {
        this(null);
    }

    public PlatformFilter(Map map)
    {
        push(new EnvironmentFilter());
        push(new SystemFilter());
        push(new MapFilter(map));
    }
}
