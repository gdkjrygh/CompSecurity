// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.machinetags;


// Referenced classes of package com.googlecode.flickrjandroid.machinetags:
//            ITag

public class Pair
    implements ITag
{

    public static final long serialVersionUID = 12L;
    private String namespace;
    private String predicate;
    private int usage;

    public Pair()
    {
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
        return (new StringBuilder(String.valueOf(namespace))).append(":").append(predicate).toString();
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
}
