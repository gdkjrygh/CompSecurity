// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.Arrays;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters:
//            RecognizedInstanceConverter

public class RecognizeWobDataResponseConverter
    implements Function
{

    private final RecognizedInstanceConverter recognizedInstanceConverter;

    public RecognizeWobDataResponseConverter(RecognizedInstanceConverter recognizedinstanceconverter)
    {
        recognizedInstanceConverter = recognizedinstanceconverter;
    }

    private static Iterable removeNulls(Iterable iterable)
    {
        return Iterables.filter(iterable, Predicates.notNull());
    }

    public final com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataResponse apply(com.google.wallet.proto.api.NanoWalletOcr.WobsOcrResponse wobsocrresponse)
    {
        com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataResponse.Builder builder = com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataResponse.newBuilder();
        builder.addAllRecognizedInstance(removeNulls(Lists.transform(Arrays.asList(wobsocrresponse.recognizedInstance), recognizedInstanceConverter)));
        if (wobsocrresponse.debugResponseInfo != null)
        {
            builder.setDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo.newBuilder().addAllExperimentalInstance(removeNulls(Lists.transform(Arrays.asList(wobsocrresponse.debugResponseInfo.experimentalInstance), recognizedInstanceConverter))));
        }
        return (com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataResponse)builder.build();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.wallet.proto.api.NanoWalletOcr.WobsOcrResponse)obj);
    }
}
