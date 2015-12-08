// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.util.Arrays;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters:
//            RecognizedTextConverter, AttributionConverter, RecognizedBarcodeConverter

public class RecognizedInstanceConverter
    implements Function
{

    private final AttributionConverter attributionConverter;
    private final RecognizedBarcodeConverter recognizedBarcodeConverter;
    private final RecognizedTextConverter recognizedTextConverter;

    public RecognizedInstanceConverter(RecognizedTextConverter recognizedtextconverter, RecognizedBarcodeConverter recognizedbarcodeconverter, AttributionConverter attributionconverter)
    {
        recognizedTextConverter = recognizedtextconverter;
        recognizedBarcodeConverter = recognizedbarcodeconverter;
        attributionConverter = attributionconverter;
    }

    private com.google.commerce.ocr.definitions.WireProto.RecognizedInstance apply(com.google.wallet.proto.api.NanoWalletOcr.RecognizedInstance recognizedinstance)
    {
        if (recognizedinstance.giftCardRecognizedInstance != null)
        {
            return convertGiftCardInstance(recognizedinstance);
        }
        if (recognizedinstance.loyaltyRecognizedInstance != null)
        {
            return convertLoyaltyInstance(recognizedinstance);
        } else
        {
            return null;
        }
    }

    private com.google.commerce.ocr.definitions.WireProto.RecognizedInstance convertGiftCardInstance(com.google.wallet.proto.api.NanoWalletOcr.RecognizedInstance recognizedinstance)
    {
        com.google.commerce.ocr.definitions.GiftCardProto.GiftCardData.Builder builder = com.google.commerce.ocr.definitions.GiftCardProto.GiftCardData.newBuilder();
        recognizedinstance = recognizedinstance.giftCardRecognizedInstance;
        if (((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).instance != null)
        {
            com.google.commerce.ocr.definitions.GiftCardProto.GiftCardData.InstanceData.Builder builder1 = com.google.commerce.ocr.definitions.GiftCardProto.GiftCardData.InstanceData.newBuilder().addAllBarcode(Lists.transform(Arrays.asList(((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).instance.barcode), recognizedBarcodeConverter));
            if (((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).instance.cardNumber != null)
            {
                builder1.setCardNumber(recognizedTextConverter.apply(((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).instance.cardNumber));
            }
            if (((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).instance.pin != null)
            {
                builder1.setPin(recognizedTextConverter.apply(((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).instance.pin));
            }
            builder.setInstanceData(builder1);
        }
        if (((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).cardClass != null)
        {
            com.google.commerce.ocr.definitions.GiftCardProto.GiftCardData.ClassData.Builder builder2 = com.google.commerce.ocr.definitions.GiftCardProto.GiftCardData.ClassData.newBuilder().addAllAttribution(Lists.transform(Arrays.asList(((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).cardClass.classAttribution), attributionConverter));
            if (((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).cardClass.merchantName != null)
            {
                builder2.setMerchantName(((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).cardClass.merchantName);
            }
            if (((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).cardClass.discoverableProgramId != null)
            {
                builder2.setDiscoverableId(((com.google.wallet.proto.api.NanoWalletOcr.GiftCardRecognizedInstance) (recognizedinstance)).cardClass.discoverableProgramId);
            }
            builder.setClassData(builder2);
        }
        return (com.google.commerce.ocr.definitions.WireProto.RecognizedInstance)com.google.commerce.ocr.definitions.WireProto.RecognizedInstance.newBuilder().setGiftCardData(builder).setWobType(com.google.commerce.ocr.definitions.WireProto.WobType.GIFTCARD).build();
    }

    private com.google.commerce.ocr.definitions.WireProto.RecognizedInstance convertLoyaltyInstance(com.google.wallet.proto.api.NanoWalletOcr.RecognizedInstance recognizedinstance)
    {
        recognizedinstance = recognizedinstance.loyaltyRecognizedInstance;
        com.google.commerce.ocr.definitions.LoyaltyProto.LoyaltyCardData.Builder builder = com.google.commerce.ocr.definitions.LoyaltyProto.LoyaltyCardData.newBuilder().addAllAccountId(Lists.transform(Arrays.asList(((com.google.wallet.proto.api.NanoWalletOcr.LoyaltyRecognizedInstance) (recognizedinstance)).linkingId), recognizedTextConverter)).addAllBarcodeId(Lists.transform(Arrays.asList(((com.google.wallet.proto.api.NanoWalletOcr.LoyaltyRecognizedInstance) (recognizedinstance)).barcode), recognizedBarcodeConverter));
        if (((com.google.wallet.proto.api.NanoWalletOcr.LoyaltyRecognizedInstance) (recognizedinstance)).discoverableProgramId != null)
        {
            builder.setDiscoverableProgramId(com.google.commerce.ocr.definitions.LoyaltyProto.DiscoverableProgramId.newBuilder().setValue(((com.google.wallet.proto.api.NanoWalletOcr.LoyaltyRecognizedInstance) (recognizedinstance)).discoverableProgramId));
        }
        if (((com.google.wallet.proto.api.NanoWalletOcr.LoyaltyRecognizedInstance) (recognizedinstance)).programName != null)
        {
            builder.setProgramName(recognizedTextConverter.apply(((com.google.wallet.proto.api.NanoWalletOcr.LoyaltyRecognizedInstance) (recognizedinstance)).programName));
        }
        if (((com.google.wallet.proto.api.NanoWalletOcr.LoyaltyRecognizedInstance) (recognizedinstance)).merchantName != null)
        {
            builder.setMerchantName(recognizedTextConverter.apply(((com.google.wallet.proto.api.NanoWalletOcr.LoyaltyRecognizedInstance) (recognizedinstance)).merchantName));
        }
        return (com.google.commerce.ocr.definitions.WireProto.RecognizedInstance)com.google.commerce.ocr.definitions.WireProto.RecognizedInstance.newBuilder().setLoyaltyCardData(builder).setWobType(com.google.commerce.ocr.definitions.WireProto.WobType.LOYALTY).build();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.wallet.proto.api.NanoWalletOcr.RecognizedInstance)obj);
    }
}
