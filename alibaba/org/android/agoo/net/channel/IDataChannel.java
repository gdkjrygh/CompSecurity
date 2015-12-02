// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.net.channel;

import android.content.Context;
import java.util.Map;

// Referenced classes of package org.android.agoo.net.channel:
//            IPushHandler, ChannelState, IPullHandler

public interface IDataChannel
{

    public abstract void asyncDisconnect();

    public abstract void close();

    public abstract void connect(Context context, String s, Map map, long l, IPushHandler ipushhandler);

    public abstract long ping();

    public abstract ChannelState readyChannelState();

    public abstract void send(String s, byte abyte0[], IPullHandler ipullhandler);

    public abstract void shutdown();

    public abstract void syncDisconnect();
}
