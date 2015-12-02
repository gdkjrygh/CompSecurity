// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.webrtc;


public interface IWebrtcUiInterface
{

    public abstract void handleError(int i);

    public abstract void hideCallUI(int i, long l, boolean flag);

    public abstract void showConnectionDetails(boolean flag, String s);

    public abstract void showOutdatedProtocolAlert(boolean flag, long l);

    public abstract void switchToIncomingCallUI(long l);

    public abstract void switchToRingingUI();

    public abstract void switchToStreamingUI();

    public abstract void updateMuteState(boolean flag);
}
