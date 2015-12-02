// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.net.channel;


// Referenced classes of package org.android.agoo.net.channel:
//            DNSManager, ChannelError, ChannelType

public static interface 
{

    public abstract void onFailure(ChannelError channelerror, String s);

    public abstract void onHost(ChannelType channeltype, String s, int i);
}
