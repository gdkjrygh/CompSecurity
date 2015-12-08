// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.eventclient;


// Referenced classes of package org.xbmc.kore.eventclient:
//            Packet

public class PacketHELO extends Packet
{

    public PacketHELO(String s)
    {
        super((short)1);
        appendPayload(s);
        appendPayload((byte)0);
        appendPayload((short)0);
        appendPayload(0);
        appendPayload(0);
    }
}
