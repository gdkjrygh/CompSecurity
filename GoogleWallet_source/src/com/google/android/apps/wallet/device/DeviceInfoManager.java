// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.device;

import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.android.apps.wallet.datastore.Table;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Stopwatch;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.UUID;

public class DeviceInfoManager
{

    public static final Table DEVICE_INFO_TABLE;
    private static final String TAG = com/google/android/apps/wallet/device/DeviceInfoManager.getSimpleName();
    private com.google.wallet.proto.NanoWalletClient.DeviceInfo deviceInfo;
    private boolean invalidated;
    private final KeyValueStore keyValueStore;

    public DeviceInfoManager(KeyValueStore keyvaluestore)
    {
        invalidated = false;
        keyValueStore = keyvaluestore;
    }

    private void blockingPersist(com.google.wallet.proto.NanoWalletClient.DeviceInfo deviceinfo)
    {
        if (invalidated)
        {
            WLog.w(TAG, "DeviceInfoManager Invalidated!! Not persisting.");
            return;
        } else
        {
            deviceInfo = deviceinfo;
            keyValueStore.store("deviceInfo", MessageNano.toByteArray(deviceinfo));
            return;
        }
    }

    private com.google.wallet.proto.NanoWalletClient.DeviceInfo getDeviceInfo()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.wallet.proto.NanoWalletClient.DeviceInfo deviceinfo;
        if (deviceInfo == null)
        {
            loadDeviceInfo();
        }
        deviceinfo = deviceInfo;
        this;
        JVM INSTR monitorexit ;
        return deviceinfo;
        Exception exception;
        exception;
        throw exception;
    }

    private long getNextLocalId()
    {
        this;
        JVM INSTR monitorenter ;
        Stopwatch stopwatch;
        com.google.wallet.proto.NanoWalletClient.DeviceInfo deviceinfo;
        long l;
        stopwatch = Stopwatch.createStarted();
        deviceinfo = getDeviceInfo();
        l = deviceinfo.nextLocalId.longValue();
        deviceinfo = (com.google.wallet.proto.NanoWalletClient.DeviceInfo)Protos.copy(deviceinfo);
        l++;
        deviceinfo.nextLocalId = Long.valueOf(l);
        blockingPersist(deviceinfo);
        stopwatch.stop();
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    private void loadDeviceInfo()
    {
        com.google.wallet.proto.NanoWalletClient.DeviceInfo deviceinfo1 = loadDeviceInfoIfExists();
        com.google.wallet.proto.NanoWalletClient.DeviceInfo deviceinfo = deviceinfo1;
        if (deviceinfo1 == null)
        {
            deviceinfo = newDeviceInfo();
            blockingPersist(deviceinfo);
        }
        deviceInfo = deviceinfo;
    }

    private com.google.wallet.proto.NanoWalletClient.DeviceInfo loadDeviceInfoIfExists()
    {
        com.google.wallet.proto.NanoWalletClient.DeviceInfo deviceinfo = null;
        byte abyte0[] = keyValueStore.load("deviceInfo");
        if (abyte0 != null)
        {
            try
            {
                deviceinfo = (com.google.wallet.proto.NanoWalletClient.DeviceInfo)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletClient.DeviceInfo(), abyte0);
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                throw new RuntimeException("DeviceInfo proto did not parse. Database corrupted");
            }
        }
        return deviceinfo;
    }

    private static com.google.wallet.proto.NanoWalletClient.DeviceInfo newDeviceInfo()
    {
        com.google.wallet.proto.NanoWalletClient.DeviceInfo deviceinfo = new com.google.wallet.proto.NanoWalletClient.DeviceInfo();
        deviceinfo.nextLocalId = Long.valueOf(0L);
        deviceinfo.walletUuid = UUID.randomUUID().toString();
        deviceinfo.pinInfo = new com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo();
        deviceinfo.pinInfo.badPinAttempts = Integer.valueOf(0);
        return deviceinfo;
    }

    public final EntityId getNextEntityId()
    {
        com.google.wallet.proto.NanoWalletEntities.EntityIdentifier entityidentifier = new com.google.wallet.proto.NanoWalletEntities.EntityIdentifier();
        entityidentifier.localId = String.valueOf(getNextLocalId());
        entityidentifier.originatorId = getUuid();
        return new EntityId(entityidentifier);
    }

    public final com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo getPinInfo()
    {
        return getDeviceInfo().pinInfo;
    }

    public final String getUuid()
    {
        return getDeviceInfo().walletUuid;
    }

    public final void persistPinInfo(com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo pininfo)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.wallet.proto.NanoWalletClient.DeviceInfo deviceinfo = (com.google.wallet.proto.NanoWalletClient.DeviceInfo)Protos.copy(getDeviceInfo());
        deviceinfo.pinInfo = pininfo;
        blockingPersist(deviceinfo);
        this;
        JVM INSTR monitorexit ;
        return;
        pininfo;
        throw pininfo;
    }

    static 
    {
        DEVICE_INFO_TABLE = Table.METADATA;
    }
}
