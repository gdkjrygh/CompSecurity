// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.security.SecureRandom;
import java.util.Arrays;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;

public class NTRUEncryptionKeyGenerationParameters extends KeyGenerationParameters
    implements Cloneable
{

    public static final NTRUEncryptionKeyGenerationParameters a;
    public static final NTRUEncryptionKeyGenerationParameters b;
    public static final NTRUEncryptionKeyGenerationParameters c;
    public static final NTRUEncryptionKeyGenerationParameters d;
    public static final NTRUEncryptionKeyGenerationParameters e;
    public static final NTRUEncryptionKeyGenerationParameters f;
    public static final NTRUEncryptionKeyGenerationParameters g;
    public int A;
    public int B;
    public boolean C;
    public byte D[];
    public boolean E;
    public boolean F;
    public int G;
    public Digest H;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    int s;
    public int t;
    public int u;
    public int v;
    int w;
    public int x;
    public int y;
    public int z;

    private NTRUEncryptionKeyGenerationParameters(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, int i3, int j3, boolean flag, byte abyte0[], boolean flag1, boolean flag2, 
            Digest digest)
    {
        super(new SecureRandom(), k2);
        h = i1;
        i = j1;
        k = k1;
        l = l1;
        m = i2;
        u = k2;
        x = j2;
        z = l2;
        A = i3;
        B = j3;
        C = flag;
        D = abyte0;
        E = flag1;
        F = flag2;
        G = 1;
        H = digest;
        c();
    }

    private NTRUEncryptionKeyGenerationParameters(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, boolean flag, byte abyte0[], boolean flag1, boolean flag2, Digest digest)
    {
        super(new SecureRandom(), i2);
        h = i1;
        i = j1;
        j = k1;
        u = i2;
        x = l1;
        z = j2;
        A = k2;
        B = l2;
        C = flag;
        D = abyte0;
        E = flag1;
        F = flag2;
        G = 0;
        H = digest;
        c();
    }

    private void c()
    {
        n = j;
        o = k;
        p = l;
        q = m;
        r = h / 3;
        s = 1;
        t = (h * 3) / 2 / 8 - s - u / 8 - 1;
        v = (((h * 3) / 2 + 7) / 8) * 8 + 1;
        w = h - 1;
        y = u;
    }

    public Object clone()
    {
        if (G == 0)
        {
            return new NTRUEncryptionKeyGenerationParameters(h, i, j, x, u, z, A, B, C, D, E, F, H);
        } else
        {
            return new NTRUEncryptionKeyGenerationParameters(h, i, k, l, m, x, u, z, A, B, C, D, E, F, H);
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
            obj = (NTRUEncryptionKeyGenerationParameters)obj;
            if (h != ((NTRUEncryptionKeyGenerationParameters) (obj)).h)
            {
                return false;
            }
            if (v != ((NTRUEncryptionKeyGenerationParameters) (obj)).v)
            {
                return false;
            }
            if (w != ((NTRUEncryptionKeyGenerationParameters) (obj)).w)
            {
                return false;
            }
            if (z != ((NTRUEncryptionKeyGenerationParameters) (obj)).z)
            {
                return false;
            }
            if (u != ((NTRUEncryptionKeyGenerationParameters) (obj)).u)
            {
                return false;
            }
            if (j != ((NTRUEncryptionKeyGenerationParameters) (obj)).j)
            {
                return false;
            }
            if (k != ((NTRUEncryptionKeyGenerationParameters) (obj)).k)
            {
                return false;
            }
            if (l != ((NTRUEncryptionKeyGenerationParameters) (obj)).l)
            {
                return false;
            }
            if (m != ((NTRUEncryptionKeyGenerationParameters) (obj)).m)
            {
                return false;
            }
            if (r != ((NTRUEncryptionKeyGenerationParameters) (obj)).r)
            {
                return false;
            }
            if (x != ((NTRUEncryptionKeyGenerationParameters) (obj)).x)
            {
                return false;
            }
            if (n != ((NTRUEncryptionKeyGenerationParameters) (obj)).n)
            {
                return false;
            }
            if (o != ((NTRUEncryptionKeyGenerationParameters) (obj)).o)
            {
                return false;
            }
            if (p != ((NTRUEncryptionKeyGenerationParameters) (obj)).p)
            {
                return false;
            }
            if (q != ((NTRUEncryptionKeyGenerationParameters) (obj)).q)
            {
                return false;
            }
            if (F != ((NTRUEncryptionKeyGenerationParameters) (obj)).F)
            {
                return false;
            }
            if (H == null)
            {
                if (((NTRUEncryptionKeyGenerationParameters) (obj)).H != null)
                {
                    return false;
                }
            } else
            if (!H.a().equals(((NTRUEncryptionKeyGenerationParameters) (obj)).H.a()))
            {
                return false;
            }
            if (C != ((NTRUEncryptionKeyGenerationParameters) (obj)).C)
            {
                return false;
            }
            if (s != ((NTRUEncryptionKeyGenerationParameters) (obj)).s)
            {
                return false;
            }
            if (t != ((NTRUEncryptionKeyGenerationParameters) (obj)).t)
            {
                return false;
            }
            if (B != ((NTRUEncryptionKeyGenerationParameters) (obj)).B)
            {
                return false;
            }
            if (A != ((NTRUEncryptionKeyGenerationParameters) (obj)).A)
            {
                return false;
            }
            if (!Arrays.equals(D, ((NTRUEncryptionKeyGenerationParameters) (obj)).D))
            {
                return false;
            }
            if (y != ((NTRUEncryptionKeyGenerationParameters) (obj)).y)
            {
                return false;
            }
            if (G != ((NTRUEncryptionKeyGenerationParameters) (obj)).G)
            {
                return false;
            }
            if (i != ((NTRUEncryptionKeyGenerationParameters) (obj)).i)
            {
                return false;
            }
            if (E != ((NTRUEncryptionKeyGenerationParameters) (obj)).E)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        char c3 = '\u04CF';
        int j1 = h;
        int k1 = v;
        int l1 = w;
        int i2 = z;
        int j2 = u;
        int k2 = j;
        int l2 = k;
        int i3 = l;
        int j3 = m;
        int k3 = r;
        int l3 = x;
        int i4 = n;
        int j4 = o;
        int k4 = p;
        int l4 = q;
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
        if (F)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (H == null)
        {
            i1 = 0;
        } else
        {
            i1 = H.a().hashCode();
        }
        if (C)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        i5 = s;
        j5 = t;
        k5 = B;
        l5 = A;
        i6 = Arrays.hashCode(D);
        j6 = y;
        k6 = G;
        l6 = i;
        if (!E)
        {
            c3 = '\u04D5';
        }
        return (((((((((c2 + (i1 + (c1 + (((((((((((((((j1 + 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31) * 31) * 31) * 31 + i5) * 31 + j5) * 31 + k5) * 31 + l5) * 31 + i6) * 31 + j6) * 31 + k6) * 31 + l6) * 31 + c3;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder("EncryptionParameters(N=")).append(h).append(" q=").append(i).toString());
        if (G == 0)
        {
            stringbuilder.append((new StringBuilder(" polyType=SIMPLE df=")).append(j).toString());
        } else
        {
            stringbuilder.append((new StringBuilder(" polyType=PRODUCT df1=")).append(k).append(" df2=").append(l).append(" df3=").append(m).toString());
        }
        stringbuilder.append((new StringBuilder(" dm0=")).append(x).append(" db=").append(u).append(" c=").append(z).append(" minCallsR=").append(A).append(" minCallsMask=").append(B).append(" hashSeed=").append(C).append(" hashAlg=").append(H).append(" oid=").append(Arrays.toString(D)).append(" sparse=").append(E).append(")").toString());
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new SHA512Digest();
        a = new NTRUEncryptionKeyGenerationParameters(1087, 2048, 120, 120, 256, 13, 25, 14, true, new byte[] {
            0, 6, 3
        }, true, false, ((Digest) (obj)));
        obj = new SHA512Digest();
        b = new NTRUEncryptionKeyGenerationParameters(1171, 2048, 106, 106, 256, 13, 20, 15, true, new byte[] {
            0, 6, 4
        }, true, false, ((Digest) (obj)));
        obj = new SHA512Digest();
        c = new NTRUEncryptionKeyGenerationParameters(1499, 2048, 79, 79, 256, 13, 17, 19, true, new byte[] {
            0, 6, 5
        }, true, false, ((Digest) (obj)));
        obj = new SHA256Digest();
        d = new NTRUEncryptionKeyGenerationParameters(439, 2048, 146, 130, 128, 9, 32, 9, true, new byte[] {
            0, 7, 101
        }, true, false, ((Digest) (obj)));
        obj = new SHA256Digest();
        e = new NTRUEncryptionKeyGenerationParameters(439, 2048, 9, 8, 5, 130, 128, 9, 32, 9, true, new byte[] {
            0, 7, 101
        }, true, true, ((Digest) (obj)));
        obj = new SHA512Digest();
        f = new NTRUEncryptionKeyGenerationParameters(743, 2048, 248, 220, 256, 10, 27, 14, true, new byte[] {
            0, 7, 105
        }, false, false, ((Digest) (obj)));
        obj = new SHA512Digest();
        g = new NTRUEncryptionKeyGenerationParameters(743, 2048, 11, 11, 15, 220, 256, 10, 27, 14, true, new byte[] {
            0, 7, 105
        }, false, true, ((Digest) (obj)));
    }
}
