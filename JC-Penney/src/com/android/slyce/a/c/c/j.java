// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;

import com.android.slyce.a.az;
import com.android.slyce.a.bj;
import java.nio.ByteOrder;
import java.util.zip.CRC32;

// Referenced classes of package com.android.slyce.a.c.c:
//            i, h, k

class j
    implements bj
{

    final i a;

    j(i l)
    {
        a = l;
        super();
    }

    public volatile void a(Object obj)
    {
        a((byte[])obj);
    }

    public void a(byte abyte0[])
    {
        if (a.b)
        {
            a.e.e.update(abyte0, 0, 2);
        }
        short word0 = h.a(abyte0, 0, ByteOrder.LITTLE_ENDIAN);
        a.d.a(word0 & 0xffff, new k(this));
    }
}
