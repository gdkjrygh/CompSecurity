// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.segments;

import java.io.InputStream;

// Referenced classes of package org.apache.sanselan.formats.jpeg.segments:
//            GenericSegment

public class APPNSegment extends GenericSegment
{

    public APPNSegment(int i, int j, InputStream inputstream)
    {
        super(i, j, inputstream);
    }

    public final String d()
    {
        return (new StringBuilder("APPN (APP")).append(t_ - 65504).append(") (").append(e()).append(")").toString();
    }
}
