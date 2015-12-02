// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.net.channel;

import java.util.Map;

// Referenced classes of package org.android.agoo.net.channel:
//            ChannelError

public interface IPushHandler
{

    public abstract void onCommand(long l, String s, byte abyte0[]);

    public abstract void onConnected(long l, long l1, Map map);

    public abstract void onData(long l, String s, byte abyte0[]);

    public abstract void onDisconnected(long l, long l1);

    public abstract void onError(long l, long l1, ChannelError channelerror, Map map, Throwable throwable);

    public abstract void onPing(long l);
}
