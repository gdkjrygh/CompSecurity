// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;


// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            MdxCastApplication

public static interface 
{

    public abstract void onApplicationStopped();

    public abstract void onFailToConnect();

    public abstract void onFailToLaunch();

    public abstract void onFailToSendMessage();

    public abstract void onLaunched();

    public abstract void onMessageReceived(String s);

    public abstract void onMessageSent();
}
