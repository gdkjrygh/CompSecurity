// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.b;


public final class o
{

    public final long a;
    public final long b = 0L;

    public o(long l)
    {
        a = l;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (o)obj;
            if (b != ((o) (obj)).b)
            {
                return false;
            }
            if (a != ((o) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((int)(b ^ b >>> 32) + 31) * 31 + (int)(a ^ a >>> 32);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("LatencyLoggingData[");
        if (a != 0L)
        {
            stringbuilder.append("mRequestId=");
            stringbuilder.append(a);
            stringbuilder.append(", ");
        }
        if (b != 0L)
        {
            stringbuilder.append("mLatencyId=");
            stringbuilder.append(b);
            stringbuilder.append(", ");
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
