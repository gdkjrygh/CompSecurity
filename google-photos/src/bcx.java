// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bcx extends qst
{

    public int a;
    public bct b;
    public List c;

    public bcx()
    {
        super("trun");
        c = new ArrayList();
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        long l = b.a(bytebuffer);
        int k;
        if ((m() & 1) == 1)
        {
            a = b.f(b.a(bytebuffer));
        } else
        {
            a = -1;
        }
        if ((m() & 4) == 4)
        {
            b = new bct(bytebuffer);
        }
        k = 0;
        while ((long)k < l) 
        {
            bcy bcy1 = new bcy();
            if ((m() & 0x100) == 256)
            {
                bcy1.a = b.a(bytebuffer);
            }
            if ((m() & 0x200) == 512)
            {
                bcy1.b = b.a(bytebuffer);
            }
            if ((m() & 0x400) == 1024)
            {
                bcy1.c = new bct(bytebuffer);
            }
            if ((m() & 0x800) == 2048)
            {
                if (l() == 0)
                {
                    bcy1.d = b.a(bytebuffer);
                } else
                {
                    bcy1.d = bytebuffer.getInt();
                }
            }
            c.add(bcy1);
            k++;
        }
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, c.size());
        int k = m();
        if ((k & 1) == 1)
        {
            bax.b(bytebuffer, a);
        }
        if ((k & 4) == 4)
        {
            b.a(bytebuffer);
        }
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bcy bcy1 = (bcy)iterator.next();
            if ((k & 0x100) == 256)
            {
                bax.b(bytebuffer, bcy1.a);
            }
            if ((k & 0x200) == 512)
            {
                bax.b(bytebuffer, bcy1.b);
            }
            if ((k & 0x400) == 1024)
            {
                bcy1.c.a(bytebuffer);
            }
            if ((k & 0x800) == 2048)
            {
                if (l() == 0)
                {
                    bax.b(bytebuffer, bcy1.d);
                } else
                {
                    bytebuffer.putInt((int)bcy1.d);
                }
            }
        } while (true);
    }

    public final long d()
    {
        return (long)c.size();
    }

    protected final long e()
    {
        long l = 8L;
        int k = m();
        if ((k & 1) == 1)
        {
            l = 12L;
        }
        long l1;
        long l2;
        if ((k & 4) == 4)
        {
            l2 = l + 4L;
        } else
        {
            l2 = l;
        }
        l1 = 0L;
        if ((k & 0x100) == 256)
        {
            l1 = 4L;
        }
        l = l1;
        if ((k & 0x200) == 512)
        {
            l = l1 + 4L;
        }
        l1 = l;
        if ((k & 0x400) == 1024)
        {
            l1 = l + 4L;
        }
        l = l1;
        if ((k & 0x800) == 2048)
        {
            l = l1 + 4L;
        }
        return l * (long)c.size() + l2;
    }

    public final boolean f()
    {
        return (m() & 1) == 1;
    }

    public final boolean g()
    {
        return (m() & 0x200) == 512;
    }

    public final boolean h()
    {
        return (m() & 0x100) == 256;
    }

    public final boolean i()
    {
        return (m() & 0x400) == 1024;
    }

    public final boolean j()
    {
        return (m() & 0x800) == 2048;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("TrackRunBox");
        stringbuilder.append("{sampleCount=").append(c.size());
        stringbuilder.append(", dataOffset=").append(a);
        stringbuilder.append(", dataOffsetPresent=").append(f());
        stringbuilder.append(", sampleSizePresent=").append(g());
        stringbuilder.append(", sampleDurationPresent=").append(h());
        stringbuilder.append(", sampleFlagsPresentPresent=").append(i());
        stringbuilder.append(", sampleCompositionTimeOffsetPresent=").append(j());
        stringbuilder.append(", firstSampleFlags=").append(b);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
