// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.text.DecimalFormat;
import org.spongycastle.crypto.Digest;

public class NTRUSigningParameters
    implements Cloneable
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    double h;
    public double i;
    double j;
    public double k;
    public int l;
    int m;
    public Digest n;

    private NTRUSigningParameters(int i1, int j1, int k1, int l1, double d1, double d2, Digest digest)
    {
        l = 100;
        m = 6;
        a = i1;
        b = j1;
        c = k1;
        g = l1;
        h = d1;
        j = d2;
        n = digest;
        i = h * h;
        k = j * j;
    }

    public Object clone()
    {
        return new NTRUSigningParameters(a, b, c, g, h, j, n);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof NTRUSigningParameters))
            {
                return false;
            }
            obj = (NTRUSigningParameters)obj;
            if (g != ((NTRUSigningParameters) (obj)).g)
            {
                return false;
            }
            if (a != ((NTRUSigningParameters) (obj)).a)
            {
                return false;
            }
            if (Double.doubleToLongBits(h) != Double.doubleToLongBits(((NTRUSigningParameters) (obj)).h))
            {
                return false;
            }
            if (Double.doubleToLongBits(i) != Double.doubleToLongBits(((NTRUSigningParameters) (obj)).i))
            {
                return false;
            }
            if (m != ((NTRUSigningParameters) (obj)).m)
            {
                return false;
            }
            if (c != ((NTRUSigningParameters) (obj)).c)
            {
                return false;
            }
            if (d != ((NTRUSigningParameters) (obj)).d)
            {
                return false;
            }
            if (e != ((NTRUSigningParameters) (obj)).e)
            {
                return false;
            }
            if (f != ((NTRUSigningParameters) (obj)).f)
            {
                return false;
            }
            if (n == null)
            {
                if (((NTRUSigningParameters) (obj)).n != null)
                {
                    return false;
                }
            } else
            if (!n.a().equals(((NTRUSigningParameters) (obj)).n.a()))
            {
                return false;
            }
            if (Double.doubleToLongBits(j) != Double.doubleToLongBits(((NTRUSigningParameters) (obj)).j))
            {
                return false;
            }
            if (Double.doubleToLongBits(k) != Double.doubleToLongBits(((NTRUSigningParameters) (obj)).k))
            {
                return false;
            }
            if (b != ((NTRUSigningParameters) (obj)).b)
            {
                return false;
            }
            if (l != ((NTRUSigningParameters) (obj)).l)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j1 = g;
        int k1 = a;
        long l3 = Double.doubleToLongBits(h);
        int l1 = (int)(l3 ^ l3 >>> 32);
        l3 = Double.doubleToLongBits(i);
        int i2 = (int)(l3 ^ l3 >>> 32);
        int j2 = m;
        int k2 = c;
        int l2 = d;
        int i3 = e;
        int j3 = f;
        int i1;
        int k3;
        if (n == null)
        {
            i1 = 0;
        } else
        {
            i1 = n.a().hashCode();
        }
        l3 = Double.doubleToLongBits(j);
        k3 = (int)(l3 ^ l3 >>> 32);
        l3 = Double.doubleToLongBits(k);
        return ((((i1 + (((((((((j1 + 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31) * 31 + k3) * 31 + (int)(l3 ^ l3 >>> 32)) * 31 + b) * 31 + l;
    }

    public String toString()
    {
        DecimalFormat decimalformat = new DecimalFormat("0.00");
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder("SignatureParameters(N=")).append(a).append(" q=").append(b).toString());
        stringbuilder.append((new StringBuilder(" B=")).append(g).append(" beta=").append(decimalformat.format(h)).append(" normBound=").append(decimalformat.format(j)).append(" hashAlg=").append(n).append(")").toString());
        return stringbuilder.toString();
    }
}
