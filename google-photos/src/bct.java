// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bct
{

    public boolean a;
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;
    private byte g;
    private int h;

    public bct()
    {
    }

    public bct(ByteBuffer bytebuffer)
    {
        long l = b.a(bytebuffer);
        b = (byte)(int)((0xfffffffff0000000L & l) >> 28);
        c = (byte)(int)((0xc000000L & l) >> 26);
        d = (byte)(int)((0x3000000L & l) >> 24);
        e = (byte)(int)((0xc00000L & l) >> 22);
        f = (byte)(int)((0x300000L & l) >> 20);
        g = (byte)(int)((0xe0000L & l) >> 17);
        boolean flag;
        if ((0x10000L & l) >> 16 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        h = (int)(65535L & l);
    }

    public final void a(ByteBuffer bytebuffer)
    {
        long l = b << 28;
        long l1 = c << 26;
        long l2 = d << 24;
        long l3 = e << 22;
        long l4 = f << 20;
        long l5 = g << 17;
        int i;
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        bax.b(bytebuffer, (long)(i << 16) | (l5 | (0L | l | l1 | l2 | l3 | l4)) | (long)h);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (bct)obj;
            if (c != ((bct) (obj)).c)
            {
                return false;
            }
            if (b != ((bct) (obj)).b)
            {
                return false;
            }
            if (h != ((bct) (obj)).h)
            {
                return false;
            }
            if (d != ((bct) (obj)).d)
            {
                return false;
            }
            if (f != ((bct) (obj)).f)
            {
                return false;
            }
            if (e != ((bct) (obj)).e)
            {
                return false;
            }
            if (a != ((bct) (obj)).a)
            {
                return false;
            }
            if (g != ((bct) (obj)).g)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        byte byte0 = b;
        byte byte1 = c;
        byte byte2 = d;
        byte byte3 = e;
        byte byte4 = f;
        byte byte5 = g;
        int i;
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return (i + (((((byte0 * 31 + byte1) * 31 + byte2) * 31 + byte3) * 31 + byte4) * 31 + byte5) * 31) * 31 + h;
    }

    public final String toString()
    {
        String s = String.valueOf("SampleFlags{reserved=");
        byte byte0 = b;
        byte byte1 = c;
        byte byte2 = d;
        byte byte3 = e;
        byte byte4 = f;
        byte byte5 = g;
        boolean flag = a;
        int i = h;
        return (new StringBuilder(String.valueOf(s).length() + 126)).append(s).append(byte0).append(", isLeading=").append(byte1).append(", depOn=").append(byte2).append(", isDepOn=").append(byte3).append(", hasRedundancy=").append(byte4).append(", padValue=").append(byte5).append(", isDiffSample=").append(flag).append(", degradPrio=").append(i).append("}").toString();
    }
}
