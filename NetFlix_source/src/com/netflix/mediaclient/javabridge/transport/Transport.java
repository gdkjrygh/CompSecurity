// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.transport;

import com.netflix.mediaclient.javabridge.invoke.Invoke;

public interface Transport
{

    public abstract void close();

    public abstract void connect();

    public abstract void disconnect();

    public abstract void invokeMethod(Invoke invoke);

    public abstract void invokeMethod(String s, String s1, String s2);

    public abstract void setProperty(String s, String s1, String s2);

    public abstract void uiLoaded();

    public abstract void uiUnloaded();
}
