// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff;


// Referenced classes of package org.apache.sanselan.formats.tiff:
//            TiffElement

public class TiffHeader extends TiffElement
{

    public final int a;
    public final int b;
    public final int c;

    public TiffHeader(int i, int j, int k)
    {
        super(0, 8);
        a = i;
        b = j;
        c = k;
    }
}
