// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common;


public class geMetadataItem
    implements geMetadataItem
{

    private final String a;
    private final String b;

    public final String a(String s)
    {
        String s2 = (new StringBuilder(String.valueOf(a))).append(": ").append(b).toString();
        String s1 = s2;
        if (s != null)
        {
            s1 = (new StringBuilder(String.valueOf(s))).append(s2).toString();
        }
        return s1;
    }

    public String toString()
    {
        return a(null);
    }
}
