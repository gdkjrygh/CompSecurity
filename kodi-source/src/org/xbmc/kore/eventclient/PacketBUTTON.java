// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.eventclient;


// Referenced classes of package org.xbmc.kore.eventclient:
//            Packet

public class PacketBUTTON extends Packet
{

    public PacketBUTTON(String s, String s1, boolean flag, boolean flag1, boolean flag2, short word0, byte byte0)
    {
        super((short)3);
        appendPayload((short)0, s, s1, flag, flag1, flag2, word0, byte0, (short)1);
    }

    private void appendPayload(short word0, String s, String s1, boolean flag, boolean flag1, boolean flag2, short word1, 
            byte byte0, short word2)
    {
        short word3;
        short word4;
        if (word1 > 0)
        {
            word2 |= 8;
            word4 = word1;
        } else
        {
            word4 = 0;
        }
        if (flag1)
        {
            word3 = (short)(word2 | 2);
        } else
        {
            word3 = (short)(word2 | 4);
        }
        word1 = word3;
        if (!flag)
        {
            word1 = (short)(word3 | 0x20);
        }
        word3 = word1;
        if (flag2)
        {
            word3 = (short)(word1 | 0x10);
        }
        if (byte0 != 1) goto _L2; else goto _L1
_L1:
        word1 = (short)(word3 | 0);
_L4:
        appendPayload(word0);
        appendPayload(word1);
        appendPayload(word4);
        appendPayload(s);
        appendPayload(s1);
        return;
_L2:
        word1 = word3;
        if (byte0 == 2)
        {
            word1 = (short)(word3 | 0xffffff80);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
