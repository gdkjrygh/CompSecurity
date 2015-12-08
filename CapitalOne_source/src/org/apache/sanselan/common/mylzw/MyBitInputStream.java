// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common.mylzw;

import java.io.IOException;
import java.io.InputStream;
import org.apache.sanselan.common.BinaryConstants;

public class MyBitInputStream extends InputStream
    implements BinaryConstants
{

    private final InputStream a;
    private final int b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    public final int a()
    {
_L8:
        if (e < 8) goto _L2; else goto _L1
_L1:
        if (b != 77) goto _L4; else goto _L3
_L3:
        int i = f >> e - 8 & 0xff;
_L6:
        e = e - 8;
        f = (1 << e) - 1 & f;
        return i;
_L2:
        i = a.read();
        if (i < 0)
        {
            return !c ? -1 : 257;
        }
        i &= 0xff;
        if (b == 77)
        {
            f = i | f << 8;
        } else
        if (b == 73)
        {
            f = i << e | f;
        } else
        {
            throw new IOException((new StringBuilder("Unknown byte order: ")).append(b).toString());
        }
        d = d + 1L;
        e = e + 8;
        continue; /* Loop/switch isn't completed */
_L4:
        if (b != 73)
        {
            break; /* Loop/switch isn't completed */
        }
        i = f & 0xff;
        f = f >> 8;
        if (true) goto _L6; else goto _L5
_L5:
        throw new IOException((new StringBuilder("Unknown byte order: ")).append(b).toString());
        if (true) goto _L8; else goto _L7
_L7:
    }

    public int read()
    {
        return a();
    }
}
