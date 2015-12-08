// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;

import com.android.slyce.a.bj;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.zip.CRC32;

// Referenced classes of package com.android.slyce.a.c.c:
//            h, i

class m
    implements bj
{

    final i a;

    m(i j)
    {
        a = j;
        super();
    }

    public volatile void a(Object obj)
    {
        a((byte[])obj);
    }

    public void a(byte abyte0[])
    {
        short word0 = h.a(abyte0, 0, ByteOrder.LITTLE_ENDIAN);
        if ((short)(int)a.e.e.getValue() != word0)
        {
            a.e.a(new IOException("CRC mismatch"));
            return;
        } else
        {
            a.e.e.reset();
            a.e.d = false;
            a.e.a(a.c);
            return;
        }
    }
}
