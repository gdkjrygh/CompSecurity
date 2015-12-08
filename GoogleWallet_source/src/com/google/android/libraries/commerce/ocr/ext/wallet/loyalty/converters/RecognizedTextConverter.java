// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.util.Arrays;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters:
//            AttributionConverter

public class RecognizedTextConverter
    implements Function
{

    private final AttributionConverter attributionConverter;

    RecognizedTextConverter(AttributionConverter attributionconverter)
    {
        attributionConverter = attributionconverter;
    }

    public final com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedText apply(com.google.wallet.proto.api.NanoWalletOcr.RecognizedImageText recognizedimagetext)
    {
        com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedText.Builder builder = com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedText.newBuilder();
        float f;
        Object obj;
        if (recognizedimagetext.value != null)
        {
            obj = recognizedimagetext.value;
        } else
        {
            obj = "";
        }
        obj = builder.setValue(((String) (obj)));
        if (recognizedimagetext.score != null)
        {
            f = recognizedimagetext.score.floatValue();
        } else
        {
            f = 0.0F;
        }
        return (com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedText)((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedText.Builder) (obj)).setScore(f).addAllAttribution(Lists.transform(Arrays.asList(recognizedimagetext.attribution), attributionConverter)).build();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.wallet.proto.api.NanoWalletOcr.RecognizedImageText)obj);
    }
}
