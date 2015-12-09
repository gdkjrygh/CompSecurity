// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import android.content.ContentValues;
import com.google.android.apps.wallet.base.entitymanager.AbstractProtoEntityManager;
import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.base.entitymanager.EntityUtil;
import com.google.android.apps.wallet.datastore.Table;
import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class WobUiLabelsProtoEntityManager extends AbstractProtoEntityManager
{

    WobUiLabelsProtoEntityManager(WalletDatabaseHelper walletdatabasehelper)
    {
        super(new EntityUtil() {

            private static EntityId getId(com.google.wallet.proto.NanoWalletObjects.UiLabel uilabel)
            {
                return WobUiLabelsProtoEntityManager.createEntityId(uilabel.labelOrdinal.longValue());
            }

            private static com.google.wallet.proto.NanoWalletObjects.UiLabel parseFrom(byte abyte0[])
                throws InvalidProtocolBufferNanoException
            {
                return (com.google.wallet.proto.NanoWalletObjects.UiLabel)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletObjects.UiLabel(), abyte0);
            }

            public final volatile EntityId getId(MessageNano messagenano)
            {
                return getId((com.google.wallet.proto.NanoWalletObjects.UiLabel)messagenano);
            }

            public final volatile MessageNano parseFrom(byte abyte0[])
                throws InvalidProtocolBufferNanoException
            {
                return parseFrom(abyte0);
            }

        }, Table.WOB_UI_LABEL, walletdatabasehelper);
    }

    private static EntityId createEntityId(long l)
    {
        return new EntityId(Long.toString(l), "WALLET");
    }

    private static ContentValues newExtraContentValues(com.google.wallet.proto.NanoWalletObjects.UiLabel uilabel)
    {
        throw new UnsupportedOperationException();
    }

    public final volatile ContentValues newExtraContentValues(MessageNano messagenano)
    {
        return newExtraContentValues((com.google.wallet.proto.NanoWalletObjects.UiLabel)messagenano);
    }

}
