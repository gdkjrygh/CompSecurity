// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;


// Referenced classes of package org.spongycastle.crypto.engines:
//            VMPCEngine

public class VMPCKSA3Engine extends VMPCEngine
{

    public VMPCKSA3Engine()
    {
    }

    public final String a()
    {
        return "VMPC-KSA3";
    }

    protected final void a(byte abyte0[], byte abyte1[])
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

        for (int l = 0; l < 768; l++)
        {
            c = b[c + b[l & 0xff] + abyte0[l % abyte0.length] & 0xff];
            byte byte2 = b[l & 0xff];
            b[l & 0xff] = b[c & 0xff];
            b[c & 0xff] = byte2;
        }

        a = 0;
    }
}
