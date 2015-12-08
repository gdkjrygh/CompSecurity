// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.eac;

import org.spongycastle.util.Arrays;

public class PackedDate
{

    private byte a[];

    public boolean equals(Object obj)
    {
        if (!(obj instanceof PackedDate))
        {
            return false;
        } else
        {
            obj = (PackedDate)obj;
            return Arrays.a(a, ((PackedDate) (obj)).a);
        }
    }

    public int hashCode()
    {
        return Arrays.a(a);
    }

    public String toString()
    {
        char ac[] = new char[a.length];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)((a[i] & 0xff) + 48);
        }

        return new String(ac);
    }
}
