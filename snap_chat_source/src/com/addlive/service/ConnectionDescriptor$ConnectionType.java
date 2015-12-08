// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


// Referenced classes of package com.addlive.service:
//            ConnectionDescriptor

public static final class  extends Enum
{

    private static final BROADCAST_PRODUCER $VALUES[];
    public static final BROADCAST_PRODUCER BROADCAST_CONSUMER;
    public static final BROADCAST_PRODUCER BROADCAST_PRODUCER;
    public static final BROADCAST_PRODUCER CONFERENCE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/addlive/service/ConnectionDescriptor$ConnectionType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CONFERENCE = new <init>("CONFERENCE", 0);
        BROADCAST_CONSUMER = new <init>("BROADCAST_CONSUMER", 1);
        BROADCAST_PRODUCER = new <init>("BROADCAST_PRODUCER", 2);
        $VALUES = (new .VALUES[] {
            CONFERENCE, BROADCAST_CONSUMER, BROADCAST_PRODUCER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
