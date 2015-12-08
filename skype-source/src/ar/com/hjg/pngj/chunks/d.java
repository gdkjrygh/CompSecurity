// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.r;
import ar.com.hjg.pngj.u;
import ar.com.hjg.pngj.v;
import java.util.zip.CRC32;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            a

public final class d
{

    public final int a;
    public final byte b[];
    public final String c;
    public byte d[];
    public byte e[];
    private long f;
    private CRC32 g;

    public d(int i, String s, boolean flag)
    {
        d = null;
        f = 0L;
        e = new byte[4];
        a = i;
        c = s;
        b = ar.com.hjg.pngj.chunks.a.a(s);
        for (i = 0; i < 4; i++)
        {
            if (b[i] < 65 || b[i] > 122 || b[i] > 90 && b[i] < 97)
            {
                throw new v((new StringBuilder("Bad id chunk: must be ascii letters ")).append(s).toString());
            }
        }

        if (flag && (d == null || d.length < a))
        {
            d = new byte[a];
        }
    }

    public final void a()
    {
        int i = (int)g.getValue();
        int j = r.c(e, 0);
        if (i != j)
        {
            throw new u((new StringBuilder("chunk: ")).append(toString()).append(" expected=").append(j).append(" read=").append(i).toString());
        } else
        {
            return;
        }
    }

    public final void a(long l)
    {
        f = l;
    }

    public final void a(byte abyte0[], int i, int j)
    {
        if (g == null)
        {
            g = new CRC32();
        }
        g.update(abyte0, i, j);
    }

    public final long b()
    {
        return f;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (d)obj;
            if (c == null)
            {
                if (((d) (obj)).c != null)
                {
                    return false;
                }
            } else
            if (!c.equals(((d) (obj)).c))
            {
                return false;
            }
            if (f != ((d) (obj)).f)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i;
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.hashCode();
        }
        return (i + 31) * 31 + (int)(f ^ f >>> 32);
    }

    public final String toString()
    {
        return (new StringBuilder("chunkid=")).append(ar.com.hjg.pngj.chunks.a.a(b)).append(" len=").append(a).toString();
    }
}
