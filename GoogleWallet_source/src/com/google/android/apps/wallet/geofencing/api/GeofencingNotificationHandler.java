// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.api;


public interface GeofencingNotificationHandler
{

    public abstract void cancelNotification();

    public abstract boolean isEnabled(com.google.wallet.proto.api.NanoWalletSettings.Settings settings);

    public abstract void onOpen(com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage);

    public abstract boolean process(com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage);
}
