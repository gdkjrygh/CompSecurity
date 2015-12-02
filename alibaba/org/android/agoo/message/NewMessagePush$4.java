// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.message;

import org.android.agoo.net.channel.ChannelState;
import org.android.agoo.net.channel.ChannelType;

// Referenced classes of package org.android.agoo.message:
//            NewMessagePush

static class Level
{

    static final int $SwitchMap$org$android$agoo$net$channel$ChannelError$Level[];
    static final int $SwitchMap$org$android$agoo$net$channel$ChannelState[];
    static final int $SwitchMap$org$android$agoo$net$channel$ChannelType[];

    static 
    {
        $SwitchMap$org$android$agoo$net$channel$ChannelState = new int[ChannelState.values().length];
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelState[ChannelState.DISCONNECTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        $SwitchMap$org$android$agoo$net$channel$ChannelError$Level = new int[org.android.agoo.net.channel.l.values().length];
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelError$Level[org.android.agoo.net.channel.l.DISABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelError$Level[org.android.agoo.net.channel.l.PAUSE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelError$Level[org.android.agoo.net.channel.l.FORCE_CHUNKED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelError$Level[org.android.agoo.net.channel.l.SPDY_RELOAD.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelError$Level[org.android.agoo.net.channel.l.RECONNECT_CLEAR_X_TOKEN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelError$Level[org.android.agoo.net.channel.l.RECONNECT_REFRESH_HOST.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelError$Level[org.android.agoo.net.channel.l.RECONNECT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$org$android$agoo$net$channel$ChannelError$Level[org.android.agoo.net.channel.l.UNNECESSARY.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
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
