// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.webrtc;


public interface IWebrtcConfigInterface
{

    public abstract String getConnectivityStatus();

    public abstract int getMinVersion();

    public abstract boolean isVoipAllowedOnCell();

    public abstract String newPeerConnectionConfig();

    public abstract boolean shouldSendIceAfterAnswer();
}
