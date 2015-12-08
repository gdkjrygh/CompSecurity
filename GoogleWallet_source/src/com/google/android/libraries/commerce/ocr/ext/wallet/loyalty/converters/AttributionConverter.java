// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import com.google.common.base.Function;

public class AttributionConverter
    implements Function
{

    AttributionConverter()
    {
    }

    private static com.google.commerce.ocr.definitions.PrimitivesProto.Attribution apply(com.google.wallet.proto.NanoWalletShared.OcrAttribution ocrattribution)
    {
        com.google.commerce.ocr.definitions.PrimitivesProto.Attribution.Builder builder = com.google.commerce.ocr.definitions.PrimitivesProto.Attribution.newBuilder();
        if (ocrattribution.source != null)
        {
            builder.setSource(ocrattribution.source);
        }
        if (ocrattribution.score != null)
        {
            builder.setScore(ocrattribution.score.floatValue());
        }
        return (com.google.commerce.ocr.definitions.PrimitivesProto.Attribution)builder.build();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.wallet.proto.NanoWalletShared.OcrAttribution)obj);
    }
}
