// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.base.entitymanager.AbstractProtoEntityManager;
import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.base.entitymanager.EntityUtil;
import com.google.android.apps.wallet.datastore.Table;
import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;

public class SettingProtoManager extends AbstractProtoEntityManager
{

    private static final ImmutableMap SETTING_NAMES = ImmutableMap.builder().put(Integer.valueOf(1), "PIN").put(Integer.valueOf(2), "PIN_TIMEOUT").put(Integer.valueOf(3), "AGREED_TO_TOS").put(Integer.valueOf(5), "CONTROLLER_APPLET_UPGRADED").put(Integer.valueOf(6), "DEPRECATED_LATEST_TOS_URL").put(Integer.valueOf(7), "CONTROLLER_APPLET_UPGRADE_IN_FLIGHT").put(Integer.valueOf(8), "DEPRECATED_LATEST_PRIVACY_URL").build();
    private static final EntityUtil mSettingUtil = new EntityUtil() {

        private static EntityId getId(com.google.wallet.proto.NanoWalletEntities.Setting setting)
        {
            return new EntityId(setting.id);
        }

        private static com.google.wallet.proto.NanoWalletEntities.Setting parseFrom(byte abyte0[])
            throws InvalidProtocolBufferNanoException
        {
            return (com.google.wallet.proto.NanoWalletEntities.Setting)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.Setting(), abyte0);
        }

        public final volatile EntityId getId(MessageNano messagenano)
        {
            return getId((com.google.wallet.proto.NanoWalletEntities.Setting)messagenano);
        }

        public final volatile MessageNano parseFrom(byte abyte0[])
            throws InvalidProtocolBufferNanoException
        {
            return parseFrom(abyte0);
        }

    };

    SettingProtoManager(WalletDatabaseHelper walletdatabasehelper)
    {
        super(mSettingUtil, Table.WALLET_SETTING, walletdatabasehelper);
    }

    private static Map getDefaultSettings()
    {
        return ImmutableMap.builder().put(Integer.valueOf(2), "1440").build();
    }

    private static EntityId getEntityId(int i)
    {
        com.google.wallet.proto.NanoWalletEntities.EntityIdentifier entityidentifier = new com.google.wallet.proto.NanoWalletEntities.EntityIdentifier();
        entityidentifier.localId = (String)SETTING_NAMES.get(Integer.valueOf(i));
        entityidentifier.originatorId = "WALLET_CLIENT_SETTINGS";
        return new EntityId(entityidentifier);
    }

    private com.google.wallet.proto.NanoWalletEntities.Setting getSetting(int i)
    {
        EntityId entityid = getEntityId(i);
        com.google.wallet.proto.NanoWalletEntities.Setting setting = (com.google.wallet.proto.NanoWalletEntities.Setting)getEntityById(entityid);
        if (setting != null)
        {
            return setting;
        } else
        {
            com.google.wallet.proto.NanoWalletEntities.Setting setting1 = new com.google.wallet.proto.NanoWalletEntities.Setting();
            setting1.id = entityid.toEntityIdentifier();
            setting1.stringValue = Strings.nullToEmpty((String)getDefaultSettings().get(Integer.valueOf(i)));
            persist(setting1);
            return setting1;
        }
    }

    public final String getStringSetting(int i)
    {
        return getSetting(i).stringValue;
    }

    public final void setStringSetting(int i, String s)
    {
        com.google.wallet.proto.NanoWalletEntities.Setting setting = (com.google.wallet.proto.NanoWalletEntities.Setting)Protos.copy(getSetting(i));
        setting.stringValue = s;
        persist(setting);
    }

}
