// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.net.channel;


// Referenced classes of package org.android.agoo.net.channel:
//            ChannelManager, ChannelType

static class 
{

    static final int $SwitchMap$org$android$agoo$net$channel$ChannelType[];

    static 
    {
        $SwitchMap$org$android$agoo$net$channel$ChannelType = new int[ChannelType.values().length];
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelType[ChannelType.SPDY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelType[ChannelType.CHUNKED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
