// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import com.google.protobuf.ByteString;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters:
//            DebugRequestInfoConverter

public class WobsOcrRequestConverter
    implements Function
{

    static ImmutableMap wobTypeConversionMap;
    private final DebugRequestInfoConverter debugRequestInfoConverter;

    public WobsOcrRequestConverter(DebugRequestInfoConverter debugrequestinfoconverter)
    {
        debugRequestInfoConverter = debugrequestinfoconverter;
    }

    public final com.google.wallet.proto.api.NanoWalletOcr.WobsOcrRequest apply(com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest recognizewobdatarequest)
    {
        Preconditions.checkArgument(recognizewobdatarequest.hasImage(), "image is needed for request");
        com.google.wallet.proto.api.NanoWalletOcr.WobsOcrRequest wobsocrrequest = new com.google.wallet.proto.api.NanoWalletOcr.WobsOcrRequest();
        wobsocrrequest.captureMode = Integer.valueOf(recognizewobdatarequest.getCaptureMode().getNumber());
        com.google.wallet.proto.api.NanoWalletOcr.Image image = new com.google.wallet.proto.api.NanoWalletOcr.Image();
        image.image = recognizewobdatarequest.getImage().getImage().toByteArray();
        wobsocrrequest.image = (new com.google.wallet.proto.api.NanoWalletOcr.Image[] {
            image
        });
        if (recognizewobdatarequest.hasDebugInfo())
        {
            DebugRequestInfoConverter debugrequestinfoconverter = debugRequestInfoConverter;
            wobsocrrequest.debugParameters = DebugRequestInfoConverter.apply(recognizewobdatarequest.getDebugInfo());
        }
        Preconditions.checkState(wobTypeConversionMap.keySet().containsAll(recognizewobdatarequest.getWobTypeList()), "Unhandled WobType in request - add missing type to the conversion map. Conversion map = %s, type list = %s", new Object[] {
            wobTypeConversionMap, recognizewobdatarequest.getWobTypeList()
        });
        wobsocrrequest.types = Ints.toArray(Lists.transform(recognizewobdatarequest.getWobTypeList(), Functions.forMap(wobTypeConversionMap)));
        return wobsocrrequest;
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest)obj);
    }

    static 
    {
        wobTypeConversionMap = ImmutableMap.builder().put(com.google.commerce.ocr.definitions.WireProto.WobType.UNKNOWN, Integer.valueOf(0)).put(com.google.commerce.ocr.definitions.WireProto.WobType.LOYALTY, Integer.valueOf(1)).put(com.google.commerce.ocr.definitions.WireProto.WobType.GIFTCARD, Integer.valueOf(2)).put(com.google.commerce.ocr.definitions.WireProto.WobType.US_LICENSE, Integer.valueOf(4)).build();
    }
}
