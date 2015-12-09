// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import com.google.common.base.Function;
import java.util.Iterator;
import java.util.List;

public class DebugRequestInfoConverter
    implements Function
{

    public DebugRequestInfoConverter()
    {
    }

    public static com.google.wallet.proto.api.NanoWalletOcr.DebugParameters apply(com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugrequestinfo)
    {
        com.google.wallet.proto.api.NanoWalletOcr.DebugParameters debugparameters = new com.google.wallet.proto.api.NanoWalletOcr.DebugParameters();
        debugrequestinfo = debugrequestinfo.getClassifierOverrideList().iterator();
        do
        {
            if (!debugrequestinfo.hasNext())
            {
                break;
            }
            com.google.commerce.ocr.definitions.WireProto.ClassifierOverride classifieroverride = (com.google.commerce.ocr.definitions.WireProto.ClassifierOverride)debugrequestinfo.next();
            if (classifieroverride.getType() == com.google.commerce.ocr.definitions.WireProto.WobType.LOYALTY)
            {
                if (classifieroverride.hasModelId())
                {
                    debugparameters.abeModelId = classifieroverride.getModelId();
                }
                if (classifieroverride.hasThreshold())
                {
                    debugparameters.thresholdOverride = Float.valueOf(classifieroverride.getThreshold());
                }
            }
        } while (true);
        return debugparameters;
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo)obj);
    }
}
