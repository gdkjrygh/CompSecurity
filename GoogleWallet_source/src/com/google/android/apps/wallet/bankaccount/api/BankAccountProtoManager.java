// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import com.google.android.apps.wallet.base.entitymanager.AbstractProtoEntityManager;
import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.base.entitymanager.EntityUtil;
import com.google.android.apps.wallet.datastore.Table;
import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class BankAccountProtoManager extends AbstractProtoEntityManager
{

    private static final EntityUtil bankAccountUtil = new EntityUtil() {

        private static EntityId getId(com.google.wallet.proto.NanoWalletEntities.BankAccount bankaccount)
        {
            return new EntityId(bankaccount.id.subId, "WALLET");
        }

        private static com.google.wallet.proto.NanoWalletEntities.BankAccount parseFrom(byte abyte0[])
            throws InvalidProtocolBufferNanoException
        {
            return (com.google.wallet.proto.NanoWalletEntities.BankAccount)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.BankAccount(), abyte0);
        }

        public final volatile EntityId getId(MessageNano messagenano)
        {
            return getId((com.google.wallet.proto.NanoWalletEntities.BankAccount)messagenano);
        }

        public final volatile MessageNano parseFrom(byte abyte0[])
            throws InvalidProtocolBufferNanoException
        {
            return parseFrom(abyte0);
        }

    };

    BankAccountProtoManager(WalletDatabaseHelper walletdatabasehelper)
    {
        super(bankAccountUtil, Table.BANK_ACCOUNT, walletdatabasehelper);
    }

}
