// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bcc
{

    public long a;
    public long b;
    long c;

    public bcc(long l, long l1, long l2)
    {
        a = l;
        b = l1;
        c = l2;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (bcc)obj;
            if (a != ((bcc) (obj)).a)
            {
                return false;
            }
            if (c != ((bcc) (obj)).c)
            {
                return false;
            }
            if (b != ((bcc) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((int)(a ^ a >>> 32) * 31 + (int)(b ^ b >>> 32)) * 31 + (int)(c ^ c >>> 32);
    }

    public final String toString()
    {
        String s = String.valueOf("Entry{firstChunk=");
        long l = a;
        long l1 = b;
        long l2 = c;
        return (new StringBuilder(String.valueOf(s).length() + 104)).append(s).append(l).append(", samplesPerChunk=").append(l1).append(", sampleDescriptionIndex=").append(l2).append("}").toString();
    }
}
