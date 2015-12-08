// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.segments;


// Referenced classes of package org.apache.sanselan.formats.jpeg.segments:
//            Segment

public class SOSSegment extends Segment
{

    public final String d()
    {
        return (new StringBuilder("SOS (")).append(e()).append(")").toString();
    }
}
