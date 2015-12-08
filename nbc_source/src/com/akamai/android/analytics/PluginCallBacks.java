// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


public interface PluginCallBacks
{

    public abstract long bytesLoaded();

    public abstract int droppedFrames();

    public abstract float getFps();

    public abstract boolean isLive();

    public abstract boolean isPlaying();

    public abstract float playBackRate();

    public abstract String serverIP();

    public abstract float streamHeadPosition();

    public abstract float streamLength();

    public abstract String streamURL();

    public abstract String videoSize();

    public abstract String viewSize();
}
