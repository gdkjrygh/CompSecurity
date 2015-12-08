// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;

import com.android.slyce.a.a.f;
import com.android.slyce.a.am;
import com.android.slyce.a.az;
import com.android.slyce.a.bj;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.zip.CRC32;

// Referenced classes of package com.android.slyce.a.c.c:
//            l, m, h, j

class i
    implements bj
{

    int a;
    boolean b;
    final am c;
    final az d;
    final h e;

    i(h h1, am am1, az az1)
    {
        e = h1;
        c = am1;
        d = az1;
        super();
    }

    private void a()
    {
        az az1 = new az(c);
        l l1 = new l(this);
        if ((a & 8) != 0)
        {
            az1.a((byte)0, l1);
            return;
        }
        if ((a & 0x10) != 0)
        {
            az1.a((byte)0, l1);
            return;
        } else
        {
            b();
            return;
        }
    }

    static void a(i k)
    {
        k.a();
    }

    private void b()
    {
        if (b)
        {
            d.a(2, new m(this));
            return;
        } else
        {
            e.d = false;
            e.a(c);
            return;
        }
    }

    static void b(i k)
    {
        k.b();
    }

    public volatile void a(Object obj)
    {
        a((byte[])obj);
    }

    public void a(byte abyte0[])
    {
        boolean flag = true;
        short word0 = h.a(abyte0, 0, ByteOrder.LITTLE_ENDIAN);
        if (word0 != -29921)
        {
            e.a(new IOException(String.format("unknown format (magic number %x)", new Object[] {
                Short.valueOf(word0)
            })));
            c.a(new f());
            return;
        }
        a = abyte0[3];
        if ((a & 2) == 0)
        {
            flag = false;
        }
        b = flag;
        if (b)
        {
            e.e.update(abyte0, 0, abyte0.length);
        }
        if ((a & 4) != 0)
        {
            d.a(2, new j(this));
            return;
        } else
        {
            a();
            return;
        }
    }
}
