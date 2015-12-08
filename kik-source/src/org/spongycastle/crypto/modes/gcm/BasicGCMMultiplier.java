// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.crypto.modes.gcm:
//            GCMMultiplier

public class BasicGCMMultiplier
    implements GCMMultiplier
{

    private byte a[];

    public BasicGCMMultiplier()
    {
    }

    public final void a(byte abyte0[])
    {
        a = Arrays.b(abyte0);
    }

    public final void b(byte abyte0[])
    {
        byte abyte1[] = a;
        byte abyte2[] = Arrays.b(abyte0);
        byte abyte3[] = new byte[16];
        for (int i = 0; i < 16; i++)
        {
            byte byte0 = abyte1[i];
            for (int j = 7; j >= 0; j--)
            {
                if ((1 << j & byte0) != 0)
                {
                    for (int k = 15; k >= 0; k--)
                    {
                        abyte3[k] = (byte)(abyte3[k] ^ abyte2[k]);
                    }

                }
                boolean flag;
                int l;
                int i1;
                if ((abyte2[15] & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i1 = 0;
                l = 0;
                do
                {
                    int j1 = abyte2[i1] & 0xff;
                    abyte2[i1] = (byte)(l | j1 >>> 1);
                    i1++;
                    if (i1 == 16)
                    {
                        break;
                    }
                    l = (j1 & 1) << 7;
                } while (true);
                if (flag)
                {
                    abyte2[0] = (byte)(abyte2[0] ^ 0xffffffe1);
                }
            }

        }

        System.arraycopy(abyte3, 0, abyte0, 0, 16);
    }
}
