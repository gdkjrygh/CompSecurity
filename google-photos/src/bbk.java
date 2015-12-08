// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bbk
{

    bbj a;
    public long b;
    public long c;
    public double d;

    public bbk(bbj bbj1, long l, long l1, double d1)
    {
        b = l;
        c = l1;
        d = d1;
        a = bbj1;
    }

    public bbk(bbj bbj1, ByteBuffer bytebuffer)
    {
        if (bbj1.l() == 1)
        {
            b = b.e(bytebuffer);
            c = bytebuffer.getLong();
            d = b.f(bytebuffer);
        } else
        {
            b = b.a(bytebuffer);
            c = bytebuffer.getInt();
            d = b.f(bytebuffer);
        }
        a = bbj1;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (bbk)obj;
            if (c != ((bbk) (obj)).c)
            {
                return false;
            }
            if (b != ((bbk) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (int)(b ^ b >>> 32) * 31 + (int)(c ^ c >>> 32);
    }

    public final String toString()
    {
        String s = String.valueOf("Entry{segmentDuration=");
        long l = b;
        long l1 = c;
        double d1 = d;
        return (new StringBuilder(String.valueOf(s).length() + 89)).append(s).append(l).append(", mediaTime=").append(l1).append(", mediaRate=").append(d1).append("}").toString();
    }
}
