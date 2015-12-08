// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;

import com.mixpanel.android.java_websocket.framing.Framedata;
import java.net.InetSocketAddress;

public interface WebSocket
{

    public abstract InetSocketAddress a();

    public abstract void a(Framedata framedata);
}
