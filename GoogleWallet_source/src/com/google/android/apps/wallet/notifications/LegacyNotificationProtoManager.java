// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.content.ContentValues;
import com.google.android.apps.wallet.base.entitymanager.AbstractProtoEntityManager;
import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.base.entitymanager.EntityUtil;
import com.google.android.apps.wallet.datastore.Column;
import com.google.android.apps.wallet.datastore.Table;
import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class LegacyNotificationProtoManager extends AbstractProtoEntityManager
{

    private static final EntityUtil mNotificationUtil = new EntityUtil() {

        private static EntityId getId(com.google.wallet.proto.api.NanoWalletNotification.LegacyClientNotification legacyclientnotification)
        {
            return new EntityId(legacyclientnotification.notificationId, "WALLET");
        }

        private static com.google.wallet.proto.api.NanoWalletNotification.LegacyClientNotification parseFrom(byte abyte0[])
            throws InvalidProtocolBufferNanoException
        {
            return (com.google.wallet.proto.api.NanoWalletNotification.LegacyClientNotification)MessageNano.mergeFrom(new com.google.wallet.proto.api.NanoWalletNotification.LegacyClientNotification(), abyte0);
        }

        public final volatile EntityId getId(MessageNano messagenano)
        {
            return getId((com.google.wallet.proto.api.NanoWalletNotification.LegacyClientNotification)messagenano);
        }

        public final volatile MessageNano parseFrom(byte abyte0[])
            throws InvalidProtocolBufferNanoException
        {
            return parseFrom(abyte0);
        }

    };

    LegacyNotificationProtoManager(WalletDatabaseHelper walletdatabasehelper)
    {
        super(mNotificationUtil, Table.NOTIFICATION, walletdatabasehelper);
    }

    private static ContentValues newExtraContentValues(com.google.wallet.proto.api.NanoWalletNotification.LegacyClientNotification legacyclientnotification)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(Column.NOTIFICATION_TYPE.getColumnName(), legacyclientnotification.notificationType);
        contentvalues.put(Column.NOTIFICATION_TIME.getColumnName(), legacyclientnotification.notificationTimeMillis);
        return contentvalues;
    }

    public final void deleteAllNotifications()
    {
        deleteAllEntities();
    }

    public final volatile ContentValues newExtraContentValues(MessageNano messagenano)
    {
        return newExtraContentValues((com.google.wallet.proto.api.NanoWalletNotification.LegacyClientNotification)messagenano);
    }

}
