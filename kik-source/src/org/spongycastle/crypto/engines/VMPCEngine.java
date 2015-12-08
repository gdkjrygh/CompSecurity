// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

public class VMPCEngine
    implements StreamCipher
{

    protected byte a;
    protected byte b[];
    protected byte c;
    protected byte d[];
    protected byte e[];

    public VMPCEngine()
    {
        a = 0;
        b = null;
        c = 0;
    }

    public final byte a(byte byte0)
    {
        c = b[c + b[a & 0xff] & 0xff];
        byte byte2 = b[b[b[c & 0xff] & 0xff] + 1 & 0xff];
        byte byte1 = b[a & 0xff];
        b[a & 0xff] = b[c & 0xff];
        b[c & 0xff] = byte1;
        a = (byte)(a + 1 & 0xff);
        return (byte)(byte2 ^ byte0);
    }

    public String a()
    {
        return "VMPC";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        cipherparameters = (ParametersWithIV)cipherparameters;
        KeyParameter keyparameter = (KeyParameter)cipherparameters.b();
        if (!(cipherparameters.b() instanceof KeyParameter))
        {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        d = cipherparameters.a();
        if (d == null || d.length <= 0 || d.length > 768)
        {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        } else
        {
            e = keyparameter.a();
            a(e, d);
            return;
        }
    }

    public final void a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (i + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (k + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        for (int l = 0; l < j; l++)
        {
            c = b[c + b[a & 0xff] & 0xff];
            byte byte1 = b[b[b[c & 0xff] & 0xff] + 1 & 0xff];
            byte byte0 = b[a & 0xff];
            b[a & 0xff] = b[c & 0xff];
            b[c & 0xff] = byte0;
            a = (byte)(a + 1 & 0xff);
            abyte1[l + k] = (byte)(byte1 ^ abyte0[l + i]);
        }

    }

    protected void a(byte abyte0[], byte abyte1[])
    {
        c = 0;
        b = new byte[256];
        for (int i = 0; i < 256; i++)
        {
            b[i] = (byte)i;
        }

        for (int j = 0; j < 768; j++)
        {
            c = b[c + b[j & 0xff] + abyte0[j % abyte0.length] & 0xff];
            byte byte0 = b[j & 0xff];
            b[j & 0xff] = b[c & 0xff];
            b[c & 0xff] = byte0;
        }

        for (int k = 0; k < 768; k++)
        {
            c = b[c + b[k & 0xff] + abyte1[k % abyte1.length] & 0xff];
            byte byte1 = b[k & 0xff];
            b[k & 0xff] = b[c & 0xff];
            b[c & 0xff] = byte1;
        }

        a = 0;
    }

    public final void b()
    {
        a(e, d);
    }
}
