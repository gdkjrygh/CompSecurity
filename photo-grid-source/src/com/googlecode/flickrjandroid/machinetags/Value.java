// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.machinetags;

import java.util.Date;

// Referenced classes of package com.googlecode.flickrjandroid.machinetags:
//            ITag

public class Value
    implements ITag
{

    public static final long serialVersionUID = 12L;
    private Date firstAdded;
    private Date lastAdded;
    private String namespace;
    private String predicate;
    private int usage;
    private String value;

    public Value()
    {
    }

    public Date getFirstAdded()
    {
        return firstAdded;
    }

    public Date getLastAdded()
    {
        return lastAdded;
    }

    public String getNamespace()
    {
        return namespace;
    }

    public String getPredicate()
    {
        return predicate;
    }

    public int getUsage()
    {
        return usage;
    }

    public String getValue()
    {
        return value;
    }

    public void setFirstAdded(long l)
    {
        setFirstAdded(new Date(l));
    }

    public void setFirstAdded(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        } else
        {
            setFirstAdded(Long.parseLong(s) * 1000L);
            return;
        }
    }

    public void setFirstAdded(Date date)
    {
        firstAdded = date;
    }

    public void setLastAdded(long l)
    {
        setLastAdded(new Date(l));
    }

    public void setLastAdded(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        } else
        {
            setLastAdded(Long.parseLong(s) * 1000L);
            return;
        }
    }

    public void setLastAdded(Date date)
    {
        lastAdded = date;
    }

    public void setNamespace(String s)
    {
        namespace = s;
    }

    public void setPredicate(String s)
    {
        predicate = s;
    }

    public void setUsage(int i)
    {
        usage = i;
    }

    public void setUsage(String s)
    {
        try
        {
            setUsage(Integer.parseInt(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void setValue(String s)
    {
        value = s;
    }
}
