// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.segments;


// Referenced classes of package org.apache.sanselan.formats.jpeg.segments:
//            GenericSegment

public class UnknownSegment extends GenericSegment
{

    public UnknownSegment(int i, byte abyte0[])
    {
        super(i, abyte0);
    }

    public final String d()
    {
        return (new StringBuilder("Unknown (")).append(e()).append(")").toString();
    }
}
