// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.util.Arrays;
import org.spongycastle.crypto.Digest;

public class NTRUEncryptionParameters
    implements Cloneable
{

    public Digest A;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    int l;
    public int m;
    public int n;
    public int o;
    int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public byte w[];
    public boolean x;
    public boolean y;
    public int z;

    private NTRUEncryptionParameters(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, int i3, int j3, boolean flag, byte abyte0[], boolean flag1, boolean flag2, 
            Digest digest)
    {
        a = i1;
        b = j1;
        d = k1;
        e = l1;
        f = i2;
        n = k2;
        q = j2;
        s = l2;
        t = i3;
        u = j3;
        v = flag;
        w = abyte0;
        x = flag1;
        y = flag2;
        z = 1;
        A = digest;
        a();
    }

    private NTRUEncryptionParameters(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, boolean flag, byte abyte0[], boolean flag1, boolean flag2, Digest digest)
    {
        a = i1;
        b = j1;
        c = k1;
        n = i2;
        q = l1;
        s = j2;
        t = k2;
        u = l2;
        v = flag;
        w = abyte0;
        x = flag1;
        y = flag2;
        z = 0;
        A = digest;
        a();
    }

    private void a()
    {
        g = c;
        h = d;
        i = e;
        j = f;
        k = a / 3;
        l = 1;
        m = (a * 3) / 2 / 8 - l - n / 8 - 1;
        o = (((a * 3) / 2 + 7) / 8) * 8 + 1;
        p = a - 1;
        r = n;
    }

    public Object clone()
    {
        if (z == 0)
        {
            return new NTRUEncryptionParameters(a, b, c, q, n, s, t, u, v, w, x, y, A);
        } else
        {
            return new NTRUEncryptionParameters(a, b, d, e, f, q, n, s, t, u, v, w, x, y, A);
        }
    }

    public boolean equals(Object obj)
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
            obj = (NTRUEncryptionParameters)obj;
            if (a != ((NTRUEncryptionParameters) (obj)).a)
            {
                return false;
            }
            if (o != ((NTRUEncryptionParameters) (obj)).o)
            {
                return false;
            }
            if (p != ((NTRUEncryptionParameters) (obj)).p)
            {
                return false;
            }
            if (s != ((NTRUEncryptionParameters) (obj)).s)
            {
                return false;
            }
            if (n != ((NTRUEncryptionParameters) (obj)).n)
            {
                return false;
            }
            if (c != ((NTRUEncryptionParameters) (obj)).c)
            {
                return false;
            }
            if (d != ((NTRUEncryptionParameters) (obj)).d)
            {
                return false;
            }
            if (e != ((NTRUEncryptionParameters) (obj)).e)
            {
                return false;
            }
            if (f != ((NTRUEncryptionParameters) (obj)).f)
            {
                return false;
            }
            if (k != ((NTRUEncryptionParameters) (obj)).k)
            {
                return false;
            }
            if (q != ((NTRUEncryptionParameters) (obj)).q)
            {
                return false;
            }
            if (g != ((NTRUEncryptionParameters) (obj)).g)
            {
                return false;
            }
            if (h != ((NTRUEncryptionParameters) (obj)).h)
            {
                return false;
            }
            if (i != ((NTRUEncryptionParameters) (obj)).i)
            {
                return false;
            }
            if (j != ((NTRUEncryptionParameters) (obj)).j)
            {
                return false;
            }
            if (y != ((NTRUEncryptionParameters) (obj)).y)
            {
                return false;
            }
            if (A == null)
            {
                if (((NTRUEncryptionParameters) (obj)).A != null)
                {
                    return false;
                }
            } else
            if (!A.a().equals(((NTRUEncryptionParameters) (obj)).A.a()))
            {
                return false;
            }
            if (v != ((NTRUEncryptionParameters) (obj)).v)
            {
                return false;
            }
            if (l != ((NTRUEncryptionParameters) (obj)).l)
            {
                return false;
            }
            if (m != ((NTRUEncryptionParameters) (obj)).m)
            {
                return false;
            }
            if (u != ((NTRUEncryptionParameters) (obj)).u)
            {
                return false;
            }
            if (t != ((NTRUEncryptionParameters) (obj)).t)
            {
                return false;
            }
            if (!Arrays.equals(w, ((NTRUEncryptionParameters) (obj)).w))
            {
                return false;
            }
            if (r != ((NTRUEncryptionParameters) (obj)).r)
            {
                return false;
            }
            if (z != ((NTRUEncryptionParameters) (obj)).z)
            {
                return false;
            }
            if (b != ((NTRUEncryptionParameters) (obj)).b)
            {
                return false;
            }
            if (x != ((NTRUEncryptionParameters) (obj)).x)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        char c3 = '\u04CF';
        int j1 = a;
        int k1 = o;
        int l1 = p;
        int i2 = s;
        int j2 = n;
        int k2 = c;
        int l2 = d;
        int i3 = e;
        int j3 = f;
        int k3 = k;
        int l3 = q;
        int i4 = g;
        int j4 = h;
        int k4 = i;
        int l4 = j;
        char c1;
        int i1;
        char c2;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        if (y)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (A == null)
        {
            i1 = 0;
        } else
        {
            i1 = A.a().hashCode();
        }
        if (v)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        i5 = l;
        j5 = m;
        k5 = u;
        l5 = t;
        i6 = Arrays.hashCode(w);
        j6 = r;
        k6 = z;
        l6 = b;
        if (!x)
        {
            c3 = '\u04D5';
        }
        return (((((((((c2 + (i1 + (c1 + (((((((((((((((j1 + 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31) * 31) * 31) * 31 + i5) * 31 + j5) * 31 + k5) * 31 + l5) * 31 + i6) * 31 + j6) * 31 + k6) * 31 + l6) * 31 + c3;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder("EncryptionParameters(N=")).append(a).append(" q=").append(b).toString());
        if (z == 0)
        {
            stringbuilder.append((new StringBuilder(" polyType=SIMPLE df=")).append(c).toString());
        } else
        {
            stringbuilder.append((new StringBuilder(" polyType=PRODUCT df1=")).append(d).append(" df2=").append(e).append(" df3=").append(f).toString());
        }
        stringbuilder.append((new StringBuilder(" dm0=")).append(q).append(" db=").append(n).append(" c=").append(s).append(" minCallsR=").append(t).append(" minCallsMask=").append(u).append(" hashSeed=").append(v).append(" hashAlg=").append(A).append(" oid=").append(Arrays.toString(w)).append(" sparse=").append(x).append(")").toString());
        return stringbuilder.toString();
    }
}
