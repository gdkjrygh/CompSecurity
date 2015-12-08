// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app;


public interface Protocol
{

    public abstract int getNumberFailedPingPackets();

    public abstract int getNumberPingPackets();

    public abstract long getPingInterval();

    public abstract byte[] getPingPacket();
}
