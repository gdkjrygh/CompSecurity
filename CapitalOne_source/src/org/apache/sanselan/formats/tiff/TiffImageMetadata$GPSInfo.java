// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff;

import org.apache.sanselan.common.RationalNumber;

public class 
{

    public final String a;
    public final String b;
    public final RationalNumber c;
    public final RationalNumber d;
    public final RationalNumber e;
    public final RationalNumber f;
    public final RationalNumber g;
    public final RationalNumber h;

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("[GPS. ");
        stringbuffer.append((new StringBuilder("Latitude: ")).append(c.b()).append(" degrees, ").append(d.b()).append(" minutes, ").append(e.b()).append(" seconds ").append(a).toString());
        stringbuffer.append((new StringBuilder(", Longitude: ")).append(f.b()).append(" degrees, ").append(g.b()).append(" minutes, ").append(h.b()).append(" seconds ").append(b).toString());
        stringbuffer.append("]");
        return stringbuffer.toString();
    }
}
