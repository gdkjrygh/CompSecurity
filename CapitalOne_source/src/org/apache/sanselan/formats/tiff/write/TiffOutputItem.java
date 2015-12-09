// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.formats.tiff.constants.AllTagConstants;

abstract class TiffOutputItem
    implements AllTagConstants
{

    private int a;

    TiffOutputItem()
    {
        a = -1;
    }

    protected final void a(int i)
    {
        a = i;
    }

    public abstract void a(BinaryOutputStream binaryoutputstream);

    public abstract int c();

    protected final int d()
    {
        return a;
    }
}
