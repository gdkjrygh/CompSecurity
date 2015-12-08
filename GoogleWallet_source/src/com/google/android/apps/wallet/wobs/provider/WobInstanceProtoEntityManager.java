// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import com.google.android.apps.wallet.base.entitymanager.AbstractProtoEntityManager;
import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.base.entitymanager.EntityUtil;
import com.google.android.apps.wallet.datastore.Table;
import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class WobInstanceProtoEntityManager extends AbstractProtoEntityManager
{

    WobInstanceProtoEntityManager(WalletDatabaseHelper walletdatabasehelper)
    {
        super(new EntityUtil() {

            private static EntityId getId(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
            {
                return new EntityId(wobinstance.id, "WALLET");
            }

            private static com.google.wallet.proto.NanoWalletObjects.WobInstance parseFrom(byte abyte0[])
                throws InvalidProtocolBufferNanoException
            {
                return (com.google.wallet.proto.NanoWalletObjects.WobInstance)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletObjects.WobInstance(), abyte0);
            }

            public final volatile EntityId getId(MessageNano messagenano)
            {
                return getId((com.google.wallet.proto.NanoWalletObjects.WobInstance)messagenano);
            }

            public final volatile MessageNano parseFrom(byte abyte0[])
                throws InvalidProtocolBufferNanoException
            {
                return parseFrom(abyte0);
            }

        }, Table.WOB_INSTANCE, walletdatabasehelper);
    }
}
