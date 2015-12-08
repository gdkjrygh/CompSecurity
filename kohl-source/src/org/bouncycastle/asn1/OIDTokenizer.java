// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


public class OIDTokenizer
{

    private int index;
    private String oid;

    public OIDTokenizer(String s)
    {
        oid = s;
        index = 0;
    }

    public boolean hasMoreTokens()
    {
        return index != -1;
    }

    public String nextToken()
    {
        if (index == -1)
        {
            return null;
        }
        int i = oid.indexOf('.', index);
        if (i == -1)
        {
            String s = oid.substring(index);
            index = -1;
            return s;
        } else
        {
            String s1 = oid.substring(index, i);
            index = i + 1;
            return s1;
        }
    }
}
