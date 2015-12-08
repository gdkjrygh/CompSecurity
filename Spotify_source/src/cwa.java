// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.net.InetSocketAddress;

public interface cwa
{

    public abstract String a(WebSocket websocket);

    public abstract void a(int i, String s);

    public abstract void a(WebSocket websocket, Framedata framedata);

    public abstract void a(Exception exception);

    public abstract void a(String s);

    public abstract cws b();

    public abstract void c();

    public abstract InetSocketAddress d();
}
