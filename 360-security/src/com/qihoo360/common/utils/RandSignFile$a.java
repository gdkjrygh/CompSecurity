// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.io.IOException;
import java.io.RandomAccessFile;

// Referenced classes of package com.qihoo360.common.utils:
//            RandSignFile

private class <init>
{

    public int a;
    public int b;
    public int c;
    public short d;
    public short e;
    public short f;
    public byte g[];
    public byte h[];
    public int i;
    public int j;
    public byte k[];
    final RandSignFile l;

    public int a()
    {
label0:
        {
            int i1;
            try
            {
                a = RandSignFile.L2B_int(l.b.readInt());
                if (a != RandSignFile.a())
                {
                    return RandSignFile.RFERR_FILETYPE;
                }
                b = RandSignFile.L2B_int(l.b.readInt());
                c = RandSignFile.L2B_int(l.b.readInt());
                d = RandSignFile.L2B_short(l.b.readShort());
                if (d != RandSignFile.b())
                {
                    return RandSignFile.RFERR_NOT_SUPPORT;
                }
                e = RandSignFile.L2B_short(l.b.readShort());
                if (e != 0)
                {
                    return RandSignFile.RFERR_NOT_SUPPORT;
                }
                f = RandSignFile.L2B_short(l.b.readShort());
                if (f != 65535)
                {
                    return RandSignFile.RFERR_NOT_SUPPORT;
                }
                if (l.b.read(g) != 32)
                {
                    return RandSignFile.RFERR_FILETYPE;
                }
                if (l.b.read(h) != 32)
                {
                    return RandSignFile.RFERR_FILETYPE;
                }
                i = RandSignFile.L2B_int(l.b.readInt());
                j = RandSignFile.L2B_int(l.b.readInt());
                if (l.b.read(k) == 128)
                {
                    break label0;
                }
                i1 = RandSignFile.RFERR_FILETYPE;
            }
            catch (IOException ioexception)
            {
                return RandSignFile.RFERR_FILEOP;
            }
            return i1;
        }
        return RandSignFile.RFERR_OK;
    }

    private (RandSignFile randsignfile)
    {
        l = randsignfile;
        super();
        g = new byte[32];
        h = new byte[32];
        k = new byte[128];
    }

    k(RandSignFile randsignfile, k k1)
    {
        this(randsignfile);
    }
}
