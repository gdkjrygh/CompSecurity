// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.rpc;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.cardlist.FrontingInstrumentClient;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.encryption.CryptorService;
import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import com.google.android.apps.wallet.hce.emv.HcePaymentApplet;
import com.google.android.apps.wallet.hce.emv.RotatingAtc;
import com.google.android.apps.wallet.hce.emv.paypass.PayPassMagStripe;
import com.google.android.apps.wallet.hce.emv.paypass.PayPassPersonalization;
import com.google.android.apps.wallet.hce.iso7816.Aid;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.wallet.common.hce.emv.paypass.PayPassCrypto;
import java.security.GeneralSecurityException;
import java.util.concurrent.Callable;

public class GetHceFrontingInstrumentTask
    implements Callable
{

    private static final String TAG = com/google/android/apps/wallet/hce/rpc/GetHceFrontingInstrumentTask.getSimpleName();
    private final CryptorService encryptionService;
    private final FeatureManager featureManager;
    private final FrontingInstrumentClient frontingInstrumentClient;
    private final HceLibraryDatabase hceLibraryDatabase;

    public GetHceFrontingInstrumentTask(CryptorService cryptorservice, FrontingInstrumentClient frontinginstrumentclient, HceLibraryDatabase hcelibrarydatabase, FeatureManager featuremanager)
    {
        encryptionService = cryptorservice;
        frontingInstrumentClient = frontinginstrumentclient;
        hceLibraryDatabase = hcelibrarydatabase;
        featureManager = featuremanager;
    }

    private PayPassMagStripe createPayPassMagStripe(com.google.wallet.proto.features.NanoWalletHce.Metadata metadata, byte abyte0[])
        throws InvalidProtocolBufferNanoException, GeneralSecurityException
    {
        com.google.wallet.proto.features.NanoWalletHce.PaypassBundle paypassbundle = (com.google.wallet.proto.features.NanoWalletHce.PaypassBundle)MessageNano.mergeFrom(new com.google.wallet.proto.features.NanoWalletHce.PaypassBundle(), abyte0);
        Object obj = paypassbundle.persoData;
        abyte0 = Aid.valueOf(((com.google.wallet.proto.features.NanoWalletHce.PersonalizationData) (obj)).aid);
        obj = payPassPersonalizationFromProto(((com.google.wallet.proto.features.NanoWalletHce.PersonalizationData) (obj)));
        metadata = rotatingAtcFromProto(paypassbundle.rotatingAtc, metadata.limits);
        WLog.dfmt(TAG, "AID: %s", new Object[] {
            abyte0
        });
        WLog.dfmt(TAG, "PayPassPersonalization: %s", new Object[] {
            ((PayPassPersonalization) (obj)).toStringForLogging()
        });
        WLog.dfmt(TAG, "RotatingAtc: %s", new Object[] {
            metadata
        });
        metadata = new PayPassMagStripe(abyte0, metadata, ((PayPassPersonalization) (obj)));
        hceLibraryDatabase.setSolePpms(metadata);
        return metadata;
    }

    private static com.google.android.apps.wallet.hce.emv.RotatingAtc.UsageLimits limitsFromLimitsProto(com.google.wallet.proto.features.NanoWalletHce.Limits limits)
    {
        return new com.google.android.apps.wallet.hce.emv.RotatingAtc.UsageLimits(limits.expirationTimestampMillisClientOffset.longValue(), limits.transactionCountThreshold.intValue(), limits.expirationThresholdTimestampMillisClientOffset.longValue(), limits.duration.durationMillis.longValue(), limits.duration.displayDuration);
    }

    private static PayPassPersonalization payPassPersonalizationFromProto(com.google.wallet.proto.features.NanoWalletHce.PersonalizationData personalizationdata)
        throws GeneralSecurityException
    {
        Object obj = personalizationdata.cvc3Crypto;
        obj = PayPassCrypto.makeWithIvs(((com.google.wallet.proto.features.NanoWalletHce.Cvc3Crypto) (obj)).kdcvc3, ((com.google.wallet.proto.features.NanoWalletHce.Cvc3Crypto) (obj)).ivcvc3Track1, ((com.google.wallet.proto.features.NanoWalletHce.Cvc3Crypto) (obj)).ivcvc3Track2);
        obj = PayPassPersonalization.newBuilder().setApplicationPriorityIndicator(toByte(personalizationdata.applicationPriorityIndicator.intValue())).setIssuerCodeTableIndex(toByte(personalizationdata.issuerCodeTableIndex.intValue())).setAip(personalizationdata.aip).setAfl(personalizationdata.applicationFileLocator).setAvn(toShort(personalizationdata.magstripeVersionNumber.intValue())).setPcvc3Track1(personalizationdata.pCvc3Track1).setPunatcTrack1(personalizationdata.pUnAtcTrack1).setTrack1Data(personalizationdata.track1Data).setNatcTrack1(toByte(personalizationdata.nAtcTrack1.intValue())).setPcvc3Track2(personalizationdata.pCvc3Track2).setPunatcTrack2(personalizationdata.pUnAtcTrack2).setTrack2Data(personalizationdata.track2Data).setNatcTrack2(toByte(personalizationdata.nAtcTrack2.intValue())).setPayPassCrypto(((PayPassCrypto) (obj)));
        if (personalizationdata.udol != null)
        {
            ((com.google.android.apps.wallet.hce.emv.paypass.PayPassPersonalization.Builder) (obj)).setUdol(personalizationdata.udol);
        }
        return ((com.google.android.apps.wallet.hce.emv.paypass.PayPassPersonalization.Builder) (obj)).build();
    }

    private static RotatingAtc rotatingAtcFromProto(com.google.wallet.proto.features.NanoWalletHce.RotatingAtc arotatingatc[], com.google.wallet.proto.features.NanoWalletHce.Limits limits)
    {
        int i = 0;
        int j = arotatingatc.length;
        Preconditions.checkArgument(Protos.valuesEqual(limits.transactionCountLimit, j), "limits.getTransactionCountLimit(): %s", new Object[] {
            limits.transactionCountLimit
        });
        int ai[];
        int ai1[];
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "0 ATCs from server: %s", new Object[] {
            Integer.valueOf(j)
        });
        ai = new int[j];
        ai1 = new int[j];
        j = 0;
        for (int k = arotatingatc.length; i < k; i++)
        {
            com.google.wallet.proto.features.NanoWalletHce.RotatingAtc rotatingatc = arotatingatc[i];
            ai[j] = rotatingatc.readerAtc.intValue();
            ai1[j] = rotatingatc.secretAtc.intValue();
            j++;
        }

        return new RotatingAtc(ai, ai1, limitsFromLimitsProto(limits));
    }

    private static byte toByte(int i)
    {
        return UnsignedBytes.checkedCast(i);
    }

    private static short toShort(int i)
    {
        boolean flag;
        if (i >> 16 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "out of range: %s", new Object[] {
            Integer.valueOf(i)
        });
        return (short)i;
    }

    public final HcePaymentApplet call()
        throws RpcException, InvalidProtocolBufferNanoException, GeneralSecurityException, CallErrorException
    {
        com.google.android.apps.wallet.encryption.CryptorService.CryptorSession cryptorsession = encryptionService.newSession();
        Object obj = frontingInstrumentClient.createPaymentBundle((byte[])cryptorsession.getSessionMaterial(), System.currentTimeMillis(), 2);
        if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.CreatePaymentBundleResponse) (obj)).callError != null)
        {
            obj = ((com.google.wallet.proto.api.NanoWalletFrontingInstrument.CreatePaymentBundleResponse) (obj)).callError;
            WLog.efmt(TAG, "createPaymentBundle returned CallError. error code: %s; title: %s, content: %s", new Object[] {
                ((com.google.wallet.proto.NanoWalletError.CallError) (obj)).errorCode, ((com.google.wallet.proto.NanoWalletError.CallError) (obj)).title, ((com.google.wallet.proto.NanoWalletError.CallError) (obj)).content
            });
            throw new CallErrorException(((com.google.wallet.proto.NanoWalletError.CallError) (obj)));
        }
        byte abyte0[] = (byte[])cryptorsession.decrypt(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.CreatePaymentBundleResponse) (obj)).encryptedPaymentBundle);
        obj = ((com.google.wallet.proto.api.NanoWalletFrontingInstrument.CreatePaymentBundleResponse) (obj)).metadata;
        switch (((com.google.wallet.proto.features.NanoWalletHce.Metadata) (obj)).bundleType.intValue())
        {
        default:
            obj = String.valueOf(((com.google.wallet.proto.features.NanoWalletHce.Metadata) (obj)).bundleType);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 24)).append("Unsupported bundleType: ").append(((String) (obj))).toString());

        case 2: // '\002'
            return createPayPassMagStripe(((com.google.wallet.proto.features.NanoWalletHce.Metadata) (obj)), abyte0);
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

}
