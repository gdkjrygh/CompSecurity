// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.d;

import com.ford.syncV4.d.a.b;
import com.ford.syncV4.d.a.f;
import com.ford.syncV4.util.a;

public final class d
{

    private byte a;
    private boolean b;
    private b c;
    private f d;
    private byte e;
    private byte f;
    private int g;
    private int h;

    public d()
    {
        a = 1;
        b = false;
        c = b.b;
        d = f.c;
        e = 0;
    }

    public static d a(byte abyte0[])
    {
        d d1 = new d();
        byte byte0 = (byte)(abyte0[0] >>> 4);
        d1.a = byte0;
        boolean flag;
        if (1 == (abyte0[0] & 8) >>> 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d1.b = flag;
        d1.c = com.ford.syncV4.d.a.b.a((byte)(abyte0[0] & 7));
        d1.d = com.ford.syncV4.d.a.f.a(abyte0[1]);
        d1.e = abyte0[2];
        d1.f = abyte0[3];
        d1.g = com.ford.syncV4.util.a.a(abyte0, 4);
        if (byte0 > 1)
        {
            d1.h = com.ford.syncV4.util.a.a(abyte0, 8);
            return d1;
        } else
        {
            d1.h = 0;
            return d1;
        }
    }

    public final void a(byte byte0)
    {
        a = byte0;
    }

    public final void a(int j)
    {
        g = j;
    }

    public final void a(b b1)
    {
        c = b1;
    }

    public final void a(f f1)
    {
        d = f1;
    }

    protected final byte[] a()
    {
        byte byte0 = a;
        int j;
        byte byte1;
        byte byte2;
        byte byte3;
        if (b)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        byte1 = c.c();
        byte2 = d.c();
        byte3 = e;
        j = f & 0xff | ((((j | (byte0 & 0xf | 0) << 1) << 3 | byte1 & 7) << 8 | byte2 & 0xff) << 8 | byte3 & 0xff) << 8;
        if (a == 1)
        {
            byte abyte0[] = new byte[8];
            System.arraycopy(com.ford.syncV4.util.a.a(j), 0, abyte0, 0, 4);
            System.arraycopy(com.ford.syncV4.util.a.a(g), 0, abyte0, 4, 4);
            return abyte0;
        }
        if (a > 1)
        {
            byte abyte1[] = new byte[12];
            System.arraycopy(com.ford.syncV4.util.a.a(j), 0, abyte1, 0, 4);
            System.arraycopy(com.ford.syncV4.util.a.a(g), 0, abyte1, 4, 4);
            System.arraycopy(com.ford.syncV4.util.a.a(h), 0, abyte1, 8, 4);
            return abyte1;
        } else
        {
            return null;
        }
    }

    public final byte b()
    {
        return a;
    }

    public final void b(byte byte0)
    {
        e = byte0;
    }

    public final void b(int j)
    {
        h = j;
    }

    public final void c(byte byte0)
    {
        f = byte0;
    }

    public final boolean c()
    {
        return b;
    }

    public final byte d()
    {
        return e;
    }

    public final byte e()
    {
        return f;
    }

    public final int f()
    {
        return g;
    }

    public final int g()
    {
        return h;
    }

    public final b h()
    {
        return c;
    }

    public final f i()
    {
        return d;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("").append("version ").append(a).append(", ");
        String s;
        if (b)
        {
            s = "compressed";
        } else
        {
            s = "uncompressed";
        }
        s = stringbuilder.append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("frameType ").append(c).append(", serviceType ").append(d).toString();
        s = (new StringBuilder()).append(s).append("\nframeData ").append(e).toString();
        s = (new StringBuilder()).append(s).append(", sessionID ").append(f).toString();
        s = (new StringBuilder()).append(s).append(", dataSize ").append(g).toString();
        return (new StringBuilder()).append(s).append(", messageID ").append(h).toString();
    }
}
