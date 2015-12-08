// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

public class VMPCMac
    implements Mac
{

    private byte a;
    private byte b;
    private byte c[];
    private byte d;
    private byte e[];
    private byte f[];
    private byte g[];
    private byte h;
    private byte i;
    private byte j;
    private byte k;

    public VMPCMac()
    {
        b = 0;
        c = null;
        d = 0;
    }

    public final int a()
    {
        return 20;
    }

    public final int a(byte abyte0[], int l)
    {
        for (int i1 = 1; i1 < 25; i1++)
        {
            d = c[d + c[b & 0xff] & 0xff];
            k = c[k + j + i1 & 0xff];
            j = c[j + i + i1 & 0xff];
            i = c[i + h + i1 & 0xff];
            h = c[h + d + i1 & 0xff];
            e[a & 0x1f] = (byte)(e[a & 0x1f] ^ h);
            e[a + 1 & 0x1f] = (byte)(e[a + 1 & 0x1f] ^ i);
            e[a + 2 & 0x1f] = (byte)(e[a + 2 & 0x1f] ^ j);
            e[a + 3 & 0x1f] = (byte)(e[a + 3 & 0x1f] ^ k);
            a = (byte)(a + 4 & 0x1f);
            byte byte0 = c[b & 0xff];
            c[b & 0xff] = c[d & 0xff];
            c[d & 0xff] = byte0;
            b = (byte)(b + 1 & 0xff);
        }

        for (int j1 = 0; j1 < 768; j1++)
        {
            d = c[d + c[j1 & 0xff] + e[j1 & 0x1f] & 0xff];
            byte byte1 = c[j1 & 0xff];
            c[j1 & 0xff] = c[d & 0xff];
            c[d & 0xff] = byte1;
        }

        byte abyte1[] = new byte[20];
        for (int k1 = 0; k1 < 20; k1++)
        {
            d = c[d + c[k1 & 0xff] & 0xff];
            abyte1[k1] = c[c[c[d & 0xff] & 0xff] + 1 & 0xff];
            byte byte2 = c[k1 & 0xff];
            c[k1 & 0xff] = c[d & 0xff];
            c[d & 0xff] = byte2;
        }

        System.arraycopy(abyte1, 0, abyte0, l, 20);
        b();
        return 20;
    }

    public final void a(byte byte0)
    {
        d = c[d + c[b & 0xff] & 0xff];
        byte0 = (byte)(c[c[c[d & 0xff] & 0xff] + 1 & 0xff] ^ byte0);
        k = c[k + j & 0xff];
        j = c[j + i & 0xff];
        i = c[i + h & 0xff];
        h = c[byte0 + (h + d) & 0xff];
        e[a & 0x1f] = (byte)(e[a & 0x1f] ^ h);
        e[a + 1 & 0x1f] = (byte)(e[a + 1 & 0x1f] ^ i);
        e[a + 2 & 0x1f] = (byte)(e[a + 2 & 0x1f] ^ j);
        e[a + 3 & 0x1f] = (byte)(e[a + 3 & 0x1f] ^ k);
        a = (byte)(a + 4 & 0x1f);
        byte byte1 = c[b & 0xff];
        c[b & 0xff] = c[d & 0xff];
        c[d & 0xff] = byte1;
        b = (byte)(b + 1 & 0xff);
    }

    public final void a(CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        cipherparameters = (ParametersWithIV)cipherparameters;
        KeyParameter keyparameter = (KeyParameter)cipherparameters.b();
        if (!(cipherparameters.b() instanceof KeyParameter))
        {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        f = cipherparameters.a();
        if (f == null || f.length <= 0 || f.length > 768)
        {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        } else
        {
            g = keyparameter.a();
            b();
            return;
        }
    }

    public final void a(byte abyte0[], int l, int i1)
    {
        if (l + i1 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        for (l = 0; l < i1; l++)
        {
            a(abyte0[l]);
        }

    }

    public final void b()
    {
        byte abyte0[] = g;
        byte abyte1[] = f;
        d = 0;
        c = new byte[256];
        for (int l = 0; l < 256; l++)
        {
            c[l] = (byte)l;
        }

        for (int i1 = 0; i1 < 768; i1++)
        {
            d = c[d + c[i1 & 0xff] + abyte0[i1 % abyte0.length] & 0xff];
            byte byte0 = c[i1 & 0xff];
            c[i1 & 0xff] = c[d & 0xff];
            c[d & 0xff] = byte0;
        }

        for (int j1 = 0; j1 < 768; j1++)
        {
            d = c[d + c[j1 & 0xff] + abyte1[j1 % abyte1.length] & 0xff];
            byte byte1 = c[j1 & 0xff];
            c[j1 & 0xff] = c[d & 0xff];
            c[d & 0xff] = byte1;
        }

        b = 0;
        b = 0;
        k = 0;
        j = 0;
        i = 0;
        h = 0;
        a = 0;
        e = new byte[32];
        for (int k1 = 0; k1 < 32; k1++)
        {
            e[k1] = 0;
        }

    }
}
