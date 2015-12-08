// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff;

import java.util.ArrayList;

// Referenced classes of package org.apache.sanselan.formats.tiff:
//            TiffContents, TiffHeader, TiffDirectory, TiffField

class d
    implements d
{

    private TiffHeader a;
    private ArrayList b;
    private ArrayList c;
    private final boolean d;

    public boolean a()
    {
        return d;
    }

    public boolean a(TiffDirectory tiffdirectory)
    {
        b.add(tiffdirectory);
        return true;
    }

    public final boolean a(TiffField tifffield)
    {
        c.add(tifffield);
        return true;
    }

    public final boolean a(TiffHeader tiffheader)
    {
        a = tiffheader;
        return true;
    }

    public final boolean b()
    {
        return true;
    }

    public final TiffContents c()
    {
        return new TiffContents(a, b);
    }

    public ()
    {
        this((byte)0);
    }

    public <init>(byte byte0)
    {
        a = null;
        b = new ArrayList();
        c = new ArrayList();
        d = true;
    }
}
