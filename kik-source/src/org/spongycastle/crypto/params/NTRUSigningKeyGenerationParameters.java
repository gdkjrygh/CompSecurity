// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;

public class NTRUSigningKeyGenerationParameters extends KeyGenerationParameters
    implements Cloneable
{

    public static final NTRUSigningKeyGenerationParameters a = new NTRUSigningKeyGenerationParameters(439, 2048, 146, 1, 1, 0.16500000000000001D, 400D, 280D, false, true, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters b = new NTRUSigningKeyGenerationParameters(439, 2048, 9, 8, 5, 1, 1, 0.16500000000000001D, 400D, 280D, false, true, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters c = new NTRUSigningKeyGenerationParameters(743, 2048, 248, 1, 1, 0.127D, 405D, 360D, true, false, 0, new SHA512Digest());
    public static final NTRUSigningKeyGenerationParameters d = new NTRUSigningKeyGenerationParameters(743, 2048, 11, 11, 15, 1, 1, 0.127D, 405D, 360D, true, false, 0, new SHA512Digest());
    public static final NTRUSigningKeyGenerationParameters e = new NTRUSigningKeyGenerationParameters(157, 256, 29, 1, 1, 0.38D, 200D, 80D, false, false, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters f = new NTRUSigningKeyGenerationParameters(157, 256, 5, 5, 8, 1, 1, 0.38D, 200D, 80D, false, false, 0, new SHA256Digest());
    public int A;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    double n;
    public double o;
    double p;
    public double q;
    public int r;
    double s;
    public double t;
    public boolean u;
    public int v;
    int w;
    public boolean x;
    public int y;
    public Digest z;

    private NTRUSigningKeyGenerationParameters(int i1, int j1, int k1, int l1, int i2, double d1, 
            double d2, double d3, boolean flag, boolean flag1, int j2, 
            Digest digest)
    {
        super(new SecureRandom(), i1);
        r = 100;
        w = 6;
        g = i1;
        h = j1;
        i = k1;
        m = l1;
        v = i2;
        n = d1;
        p = d2;
        s = d3;
        u = flag;
        x = flag1;
        y = j2;
        z = digest;
        A = 0;
        c();
    }

    private NTRUSigningKeyGenerationParameters(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            double d1, double d2, double d3, boolean flag, 
            boolean flag1, int l2, Digest digest)
    {
        super(new SecureRandom(), i1);
        r = 100;
        w = 6;
        g = i1;
        h = j1;
        j = k1;
        k = l1;
        l = i2;
        m = j2;
        v = k2;
        n = d1;
        p = d2;
        s = d3;
        u = flag;
        x = flag1;
        y = l2;
        z = digest;
        A = 1;
        c();
    }

    private void c()
    {
        o = n * n;
        q = p * p;
        t = s * s;
    }

    public Object clone()
    {
        if (A == 0)
        {
            return new NTRUSigningKeyGenerationParameters(g, h, i, m, v, n, p, s, u, x, y, z);
        } else
        {
            return new NTRUSigningKeyGenerationParameters(g, h, j, k, l, m, v, n, p, s, u, x, y, z);
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
            if (!(obj instanceof NTRUSigningKeyGenerationParameters))
            {
                return false;
            }
            obj = (NTRUSigningKeyGenerationParameters)obj;
            if (m != ((NTRUSigningKeyGenerationParameters) (obj)).m)
            {
                return false;
            }
            if (g != ((NTRUSigningKeyGenerationParameters) (obj)).g)
            {
                return false;
            }
            if (v != ((NTRUSigningKeyGenerationParameters) (obj)).v)
            {
                return false;
            }
            if (Double.doubleToLongBits(n) != Double.doubleToLongBits(((NTRUSigningKeyGenerationParameters) (obj)).n))
            {
                return false;
            }
            if (Double.doubleToLongBits(o) != Double.doubleToLongBits(((NTRUSigningKeyGenerationParameters) (obj)).o))
            {
                return false;
            }
            if (w != ((NTRUSigningKeyGenerationParameters) (obj)).w)
            {
                return false;
            }
            if (i != ((NTRUSigningKeyGenerationParameters) (obj)).i)
            {
                return false;
            }
            if (j != ((NTRUSigningKeyGenerationParameters) (obj)).j)
            {
                return false;
            }
            if (k != ((NTRUSigningKeyGenerationParameters) (obj)).k)
            {
                return false;
            }
            if (l != ((NTRUSigningKeyGenerationParameters) (obj)).l)
            {
                return false;
            }
            if (z == null)
            {
                if (((NTRUSigningKeyGenerationParameters) (obj)).z != null)
                {
                    return false;
                }
            } else
            if (!z.a().equals(((NTRUSigningKeyGenerationParameters) (obj)).z.a()))
            {
                return false;
            }
            if (y != ((NTRUSigningKeyGenerationParameters) (obj)).y)
            {
                return false;
            }
            if (Double.doubleToLongBits(s) != Double.doubleToLongBits(((NTRUSigningKeyGenerationParameters) (obj)).s))
            {
                return false;
            }
            if (Double.doubleToLongBits(t) != Double.doubleToLongBits(((NTRUSigningKeyGenerationParameters) (obj)).t))
            {
                return false;
            }
            if (Double.doubleToLongBits(p) != Double.doubleToLongBits(((NTRUSigningKeyGenerationParameters) (obj)).p))
            {
                return false;
            }
            if (Double.doubleToLongBits(q) != Double.doubleToLongBits(((NTRUSigningKeyGenerationParameters) (obj)).q))
            {
                return false;
            }
            if (A != ((NTRUSigningKeyGenerationParameters) (obj)).A)
            {
                return false;
            }
            if (u != ((NTRUSigningKeyGenerationParameters) (obj)).u)
            {
                return false;
            }
            if (h != ((NTRUSigningKeyGenerationParameters) (obj)).h)
            {
                return false;
            }
            if (r != ((NTRUSigningKeyGenerationParameters) (obj)).r)
            {
                return false;
            }
            if (x != ((NTRUSigningKeyGenerationParameters) (obj)).x)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        char c2 = '\u04CF';
        int j1 = m;
        int k1 = g;
        int l1 = v;
        long l5 = Double.doubleToLongBits(n);
        int i2 = (int)(l5 ^ l5 >>> 32);
        l5 = Double.doubleToLongBits(o);
        int j2 = (int)(l5 ^ l5 >>> 32);
        int k2 = w;
        int l2 = i;
        int i3 = j;
        int j3 = k;
        int k3 = l;
        int i1;
        char c1;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        if (z == null)
        {
            i1 = 0;
        } else
        {
            i1 = z.a().hashCode();
        }
        l3 = y;
        l5 = Double.doubleToLongBits(s);
        i4 = (int)(l5 ^ l5 >>> 32);
        l5 = Double.doubleToLongBits(t);
        j4 = (int)(l5 ^ l5 >>> 32);
        l5 = Double.doubleToLongBits(p);
        k4 = (int)(l5 ^ l5 >>> 32);
        l5 = Double.doubleToLongBits(q);
        l4 = (int)(l5 ^ l5 >>> 32);
        i5 = A;
        if (u)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        j5 = h;
        k5 = r;
        if (!x)
        {
            c2 = '\u04D5';
        }
        return (((c1 + (((((((i1 + ((((((((((j1 + 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + i5) * 31) * 31 + j5) * 31 + k5) * 31 + c2;
    }

    public String toString()
    {
        DecimalFormat decimalformat = new DecimalFormat("0.00");
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder("SignatureParameters(N=")).append(g).append(" q=").append(h).toString());
        if (A == 0)
        {
            stringbuilder.append((new StringBuilder(" polyType=SIMPLE d=")).append(i).toString());
        } else
        {
            stringbuilder.append((new StringBuilder(" polyType=PRODUCT d1=")).append(j).append(" d2=").append(k).append(" d3=").append(l).toString());
        }
        stringbuilder.append((new StringBuilder(" B=")).append(m).append(" basisType=").append(v).append(" beta=").append(decimalformat.format(n)).append(" normBound=").append(decimalformat.format(p)).append(" keyNormBound=").append(decimalformat.format(s)).append(" prime=").append(u).append(" sparse=").append(x).append(" keyGenAlg=").append(y).append(" hashAlg=").append(z).append(")").toString());
        return stringbuilder.toString();
    }

}
