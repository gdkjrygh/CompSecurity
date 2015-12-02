// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.process;


public class PrivateProcessName
{

    public static final PrivateProcessName a = new PrivateProcessName("");
    private final String b;

    private PrivateProcessName(String s)
    {
        if (s == null || s.contains(":"))
        {
            throw new IllegalArgumentException("Invalid name");
        } else
        {
            b = s;
            return;
        }
    }

    public static PrivateProcessName a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Invalid name");
        }
        if ("".equals(s))
        {
            return a;
        } else
        {
            return new PrivateProcessName(s);
        }
    }

    public final String a()
    {
        return b;
    }

    public final boolean b()
    {
        return a.equals(this);
    }

    public final String c()
    {
        if ("".equals(b))
        {
            return "___DEFAULT___";
        } else
        {
            return b;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PrivateProcessName)obj;
            if (!b.equals(((PrivateProcessName) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return b.hashCode();
    }

}
