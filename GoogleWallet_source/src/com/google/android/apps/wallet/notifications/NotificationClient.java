// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.common.base.Preconditions;

public class NotificationClient
{

    private static final String TAG = com/google/android/apps/wallet/notifications/NotificationClient.getSimpleName();
    private final RpcCaller rpcCaller;

    NotificationClient(RpcCaller rpccaller)
    {
        rpcCaller = (RpcCaller)Preconditions.checkNotNull(rpccaller);
    }

    public final com.google.wallet.proto.api.NanoWalletNotification.ClientNotification[] fetchNotification(String s, String as[])
        throws RpcException
    {
        WLog.dfmt(TAG, "fetch notification for id: %s", new Object[] {
            s
        });
        com.google.wallet.proto.api.NanoWalletNotification.FetchClientNotificationsRequest fetchclientnotificationsrequest = new com.google.wallet.proto.api.NanoWalletNotification.FetchClientNotificationsRequest();
        fetchclientnotificationsrequest.notificationId = s;
        fetchclientnotificationsrequest.displayedNotificationId = as;
        return ((com.google.wallet.proto.api.NanoWalletNotification.FetchClientNotificationsResponse)rpcCaller.call("b/notification/fetchClientNotification", fetchclientnotificationsrequest, new com.google.wallet.proto.api.NanoWalletNotification.FetchClientNotificationsResponse())).notification;
    }

}
