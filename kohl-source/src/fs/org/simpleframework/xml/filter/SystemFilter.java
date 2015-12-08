// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.filter;


// Referenced classes of package fs.org.simpleframework.xml.filter:
//            Filter

public class SystemFilter
    implements Filter
{

    private Filter filter;

    public SystemFilter()
    {
        this(null);
    }

    public SystemFilter(Filter filter1)
    {
        filter = filter1;
    }

    public String replace(String s)
    {
        String s1 = System.getProperty(s);
        if (s1 != null)
        {
            return s1;
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
