// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;


public final class i
{

    protected String a;
    protected String b;

    public i(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof i))
        {
            obj = (i)obj;
            return a.equals(((i) (obj)).a);
        } else
        {
            return false;
        }
    }
}
