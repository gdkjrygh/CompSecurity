// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;


// Referenced classes of package org.bouncycastle.crypto.engines:
//            VMPCEngine

public class VMPCKSA3Engine extends VMPCEngine
{

    public VMPCKSA3Engine()
    {
    }

    public String getAlgorithmName()
    {
        return "VMPC-KSA3";
    }

    protected void initKey(byte abyte0[], byte abyte1[])
    {
        s = 0;
        P = new byte[256];
        for (int i = 0; i < 256; i++)
        {
            P[i] = (byte)i;
        }

        for (int j = 0; j < 768; j++)
        {
            s = P[s + P[j & 0xff] + abyte0[j % abyte0.length] & 0xff];
            byte byte0 = P[j & 0xff];
            P[j & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte0;
        }

        for (int k = 0; k < 768; k++)
        {
            s = P[s + P[k & 0xff] + abyte1[k % abyte1.length] & 0xff];
            byte byte1 = P[k & 0xff];
            P[k & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte1;
        }

        for (int l = 0; l < 768; l++)
        {
            s = P[s + P[l & 0xff] + abyte0[l % abyte0.length] & 0xff];
            byte byte2 = P[l & 0xff];
            P[l & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte2;
        }

        n = 0;
    }
}
