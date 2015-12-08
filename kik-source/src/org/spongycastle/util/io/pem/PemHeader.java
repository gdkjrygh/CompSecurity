// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.io.pem;


public class PemHeader
{

    private String a;
    private String b;

    private static int a(String s)
    {
        if (s == null)
        {
            return 1;
        } else
        {
            return s.hashCode();
        }
    }

    private static boolean a(String s, String s1)
    {
        if (s == s1)
        {
            return true;
        }
        if (s == null || s1 == null)
        {
            return false;
        } else
        {
            return s.equals(s1);
        }
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PemHeader)
        {
            if ((obj = (PemHeader)obj) == this || a(a, ((PemHeader) (obj)).a) && a(b, ((PemHeader) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a(a) + a(b) * 31;
    }
}
