// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common.mylzw;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.sanselan.common.BinaryConstants;

public class MyBitOutputStream extends OutputStream
    implements BinaryConstants
{

    private final OutputStream a;
    private final int b;
    private int c;
    private int d;
    private int e;

    private void a(int i)
    {
        a.write(i);
        e = e + 1;
    }

    public void write(int i)
    {
        i &= 0xff;
        if (b == 77)
        {
            d = i | d << 8;
        } else
        if (b == 73)
        {
            int j = d;
            d = i << c | j;
        } else
        {
            throw new IOException((new StringBuilder("Unknown byte order: ")).append(b).toString());
        }
        c = c + 8;
_L2:
        if (c < 8)
        {
            return;
        }
        if (b != 77)
        {
            break; /* Loop/switch isn't completed */
        }
        a(d >> c - 8 & 0xff);
        c = c - 8;
_L4:
        d = (1 << c) - 1 & d;
        if (true) goto _L2; else goto _L1
_L1:
        if (b != 73) goto _L4; else goto _L3
_L3:
        a(d & 0xff);
        d = d >> 8;
        c = c - 8;
          goto _L4
    }
}
