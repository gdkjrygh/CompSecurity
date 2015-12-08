// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;


// Referenced classes of package org.spongycastle.crypto:
//            CipherParameters

public abstract class PBEParametersGenerator
{

    protected byte a[];
    protected byte b[];
    protected int c;

    protected PBEParametersGenerator()
    {
    }

    public static byte[] a(char ac[])
    {
        byte abyte0[] = new byte[ac.length];
        for (int i = 0; i != abyte0.length; i++)
        {
            abyte0[i] = (byte)ac[i];
        }

        return abyte0;
    }

    public static byte[] b(char ac[])
    {
        int i = 0;
        if (ac.length > 0)
        {
            byte abyte0[] = new byte[(ac.length + 1) * 2];
            for (; i != ac.length; i++)
            {
                abyte0[i * 2] = (byte)(ac[i] >>> 8);
                abyte0[i * 2 + 1] = (byte)ac[i];
            }

            return abyte0;
        } else
        {
            return new byte[0];
        }
    }

    public abstract CipherParameters a(int i);

    public abstract CipherParameters a(int i, int j);

    public final void a(byte abyte0[], byte abyte1[], int i)
    {
        a = abyte0;
        b = abyte1;
        c = i;
    }

    public abstract CipherParameters b(int i);
}
