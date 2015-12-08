// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.macs;

import java.util.Hashtable;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;

public class HMac
    implements Mac
{

    private static Hashtable f;
    private Digest a;
    private int b;
    private int c;
    private byte d[];
    private byte e[];

    public HMac(Digest digest)
    {
        int i;
        if (digest instanceof ExtendedDigest)
        {
            i = ((ExtendedDigest)digest).d();
        } else
        {
            Integer integer = (Integer)f.get(digest.a());
            if (integer == null)
            {
                throw new IllegalArgumentException((new StringBuilder("unknown digest passed: ")).append(digest.a()).toString());
            }
            i = integer.intValue();
        }
        this(digest, i);
    }

    private HMac(Digest digest, int i)
    {
        a = digest;
        b = digest.b();
        c = i;
        d = new byte[c];
        e = new byte[c];
    }

    public final int a()
    {
        return b;
    }

    public final int a(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[b];
        a.a(abyte1, 0);
        a.a(e, 0, e.length);
        a.a(abyte1, 0, abyte1.length);
        i = a.a(abyte0, i);
        b();
        return i;
    }

    public final void a(byte byte0)
    {
        a.a(byte0);
    }

    public final void a(CipherParameters cipherparameters)
    {
        a.c();
        cipherparameters = ((KeyParameter)cipherparameters).a();
        if (cipherparameters.length > c)
        {
            a.a(cipherparameters, 0, cipherparameters.length);
            a.a(d, 0);
            for (int i = b; i < d.length; i++)
            {
                d[i] = 0;
            }

        } else
        {
            System.arraycopy(cipherparameters, 0, d, 0, cipherparameters.length);
            for (int j = cipherparameters.length; j < d.length; j++)
            {
                d[j] = 0;
            }

        }
        e = new byte[d.length];
        System.arraycopy(d, 0, e, 0, d.length);
        for (int k = 0; k < d.length; k++)
        {
            cipherparameters = d;
            cipherparameters[k] = (byte)(cipherparameters[k] ^ 0x36);
        }

        for (int l = 0; l < e.length; l++)
        {
            cipherparameters = e;
            cipherparameters[l] = (byte)(cipherparameters[l] ^ 0x5c);
        }

        a.a(d, 0, d.length);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }

    public final void b()
    {
        a.c();
        a.a(d, 0, d.length);
    }

    static 
    {
        Hashtable hashtable = new Hashtable();
        f = hashtable;
        hashtable.put("GOST3411", new Integer(32));
        f.put("MD2", new Integer(16));
        f.put("MD4", new Integer(64));
        f.put("MD5", new Integer(64));
        f.put("RIPEMD128", new Integer(64));
        f.put("RIPEMD160", new Integer(64));
        f.put("SHA-1", new Integer(64));
        f.put("SHA-224", new Integer(64));
        f.put("SHA-256", new Integer(64));
        f.put("SHA-384", new Integer(128));
        f.put("SHA-512", new Integer(128));
        f.put("Tiger", new Integer(64));
        f.put("Whirlpool", new Integer(64));
    }
}
