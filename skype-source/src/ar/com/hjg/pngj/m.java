// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;


// Referenced classes of package ar.com.hjg.pngj:
//            v

public final class m
{

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    private long n;
    private long o;

    public m(int i1, int j1, int k1, boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag3 = true;
        super();
        n = -1L;
        o = -1L;
        a = i1;
        b = j1;
        e = flag;
        g = flag2;
        f = flag1;
        if (f && flag2)
        {
            throw new v("palette and greyscale are mutually exclusive");
        }
        int l1;
        if (flag1 || flag2)
        {
            if (flag)
            {
                l1 = 2;
            } else
            {
                l1 = 1;
            }
        } else
        if (flag)
        {
            l1 = 4;
        } else
        {
            l1 = 3;
        }
        d = l1;
        c = k1;
        if (k1 < 8)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        h = flag;
        i = d * c;
        j = (i + 7) / 8;
        k = (i * i1 + 7) / 8;
        l = d * a;
        if (h)
        {
            k1 = k;
        } else
        {
            k1 = l;
        }
        m = k1;
        switch (c)
        {
        default:
            throw new v((new StringBuilder("invalid bitdepth=")).append(c).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
            if (!g && !f)
            {
                throw new v((new StringBuilder("only indexed or grayscale can have bitdepth=")).append(c).toString());
            }
            break;

        case 16: // '\020'
            if (g)
            {
                throw new v((new StringBuilder("indexed can't have bitdepth=")).append(c).toString());
            }
            break;

        case 8: // '\b'
            break;
        }
        if (i1 <= 0 || i1 > 0x1000000)
        {
            throw new v((new StringBuilder("invalid cols=")).append(i1).append(" ???").toString());
        }
        if (j1 <= 0 || j1 > 0x1000000)
        {
            throw new v((new StringBuilder("invalid rows=")).append(j1).append(" ???").toString());
        }
        if (l <= 0)
        {
            throw new v("invalid image parameters (overflow?)");
        } else
        {
            return;
        }
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
            obj = (m)obj;
            if (e != ((m) (obj)).e)
            {
                return false;
            }
            if (c != ((m) (obj)).c)
            {
                return false;
            }
            if (d != ((m) (obj)).d)
            {
                return false;
            }
            if (a != ((m) (obj)).a)
            {
                return false;
            }
            if (f != ((m) (obj)).f)
            {
                return false;
            }
            if (g != ((m) (obj)).g)
            {
                return false;
            }
            if (b != ((m) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        char c3 = '\u04CF';
        char c1;
        char c2;
        int i1;
        int j1;
        int k1;
        if (e)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        i1 = c;
        j1 = d;
        k1 = a;
        if (f)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (!g)
        {
            c3 = '\u04D5';
        }
        return ((((((c1 + 31) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + c2) * 31 + c3) * 31 + b;
    }

    public final String toString()
    {
        return (new StringBuilder("ImageInfo [cols=")).append(a).append(", rows=").append(b).append(", bitDepth=").append(c).append(", channels=").append(d).append(", alpha=").append(e).append(", greyscale=").append(f).append(", indexed=").append(g).append("]").toString();
    }
}
