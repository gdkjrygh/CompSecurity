// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.machinetags;


// Referenced classes of package com.googlecode.flickrjandroid.machinetags:
//            ITag

public class Predicate
    implements ITag
{

    public static final long serialVersionUID = 12L;
    private int namespaces;
    private int usage;
    private String value;

    public Predicate()
    {
    }

    public int getNamespaces()
    {
        return namespaces;
    }

    public int getUsage()
    {
        return usage;
    }

    public String getValue()
    {
        return value;
    }

    public void setNamespaces(int i)
    {
        namespaces = i;
    }

    public void setNamespaces(String s)
    {
        try
        {
            setNamespaces(Integer.parseInt(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
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
