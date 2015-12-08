// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.nearby.bootstrap.Bootstrap;
import com.google.android.gms.nearby.bootstrap.internal.BootstrapImpl;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.internal.connection.ConnectionsImpl;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesInternal;
import com.google.android.gms.nearby.messages.internal.MessagesImpl;
import com.google.android.gms.nearby.messages.internal.MessagesInternalImpl;
import com.google.android.gms.nearby.sharing.Sharing;
import com.google.android.gms.nearby.sharing.SharingInternal;
import com.google.android.gms.nearby.sharing.internal.SharingImpl;
import com.google.android.gms.nearby.sharing.internal.SharingInternalImpl;

public final class Nearby
{

    public static final Api BOOTSTRAP_API;
    public static final Bootstrap Bootstrap = new BootstrapImpl();
    public static final Api CONNECTIONS_API;
    public static final Connections Connections = new ConnectionsImpl();
    public static final Api MESSAGES_API;
    public static final Messages Messages = new MessagesImpl();
    public static final MessagesInternal MessagesInternal = new MessagesInternalImpl();
    public static final Api SHARING_API;
    public static final Sharing Sharing = new SharingImpl();
    public static final SharingInternal SharingInternal = new SharingInternalImpl();

    static 
    {
        CONNECTIONS_API = new Api("Nearby.CONNECTIONS_API", ConnectionsImpl.CLIENT_BUILDER, ConnectionsImpl.CLIENT_KEY);
        MESSAGES_API = new Api("Nearby.MESSAGES_API", MessagesImpl.CLIENT_BUILDER, MessagesImpl.CLIENT_KEY);
        SHARING_API = new Api("Nearby.SHARING_API", SharingImpl.CLIENT_BUILDER, SharingImpl.CLIENT_KEY);
        BOOTSTRAP_API = new Api("Nearby.BOOTSTRAP_API", BootstrapImpl.CLIENT_BUILDER, BootstrapImpl.CLIENT_KEY);
    }
}
