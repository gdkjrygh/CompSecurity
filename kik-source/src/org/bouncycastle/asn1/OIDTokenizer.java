// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


public class OIDTokenizer
{

    private String a;
    private int b;

    public OIDTokenizer(String s)
    {
        a = s;
        b = 0;
    }

    public final boolean a()
    {
        return b != -1;
    }

    public final String b()
    {
        if (b == -1)
        {
            return null;
        }
        int i = a.indexOf('.', b);
        if (i == -1)
        {
            String s = a.substring(b);
            b = -1;
            return s;
        } else
        {
            String s1 = a.substring(b, i);
            b = i + 1;
            return s1;
        }
    }
}
