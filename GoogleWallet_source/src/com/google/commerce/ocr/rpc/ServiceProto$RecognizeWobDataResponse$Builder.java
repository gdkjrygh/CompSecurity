// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.rpc;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.commerce.ocr.rpc:
//            ServiceProto

public static final class <init> extends com.google.protobuf.Builder
{

    private int bitField0_;
    private com.google.commerce.ocr.definitions._cls0_ debugInfo_;
    private List recognizedInstance_;

    private <init> buildPartial()
    {
        <init> <init>1 = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth602(<init>1, unknownFields);
        int j = bitField0_;
        int i = 0;
        if ((bitField0_ & 1) == 1)
        {
            recognizedInstance_ = Collections.unmodifiableList(recognizedInstance_);
            bitField0_ = bitField0_ & -2;
        }
        _mth702(<init>1, recognizedInstance_);
        if ((j & 2) == 2)
        {
            i = 1;
        }
        _mth802(<init>1, debugInfo_);
        _mth902(<init>1, i);
        return <init>1;
    }

    private void ensureRecognizedInstanceIsMutable()
    {
        if ((bitField0_ & 1) != 1)
        {
            recognizedInstance_ = new ArrayList(recognizedInstance_);
            bitField0_ = bitField0_ | 1;
        }
    }

    private bitField0_ mergeDebugInfo(com.google.commerce.ocr.definitions._cls0_ _pcls0_)
    {
        if ((bitField0_ & 2) == 2 && debugInfo_ != null && debugInfo_ != com.google.commerce.ocr.definitions.())
        {
            debugInfo_ = com.google.commerce.ocr.definitions.o_(debugInfo_).o_(_pcls0_).al();
        } else
        {
            debugInfo_ = _pcls0_;
        }
        bitField0_ = bitField0_ | 2;
        return this;
    }

    public final bitField0_ addAllRecognizedInstance(Iterable iterable)
    {
        ensureRecognizedInstanceIsMutable();
        com.google.protobuf.Builder.ensureRecognizedInstanceIsMutable(iterable, recognizedInstance_);
        return this;
    }

    public final volatile GeneratedMessageLite buildPartial()
    {
        return buildPartial();
    }

    public final buildPartial mergeFrom(buildPartial buildpartial)
    {
        if (buildpartial == ltInstance())
        {
            return this;
        }
        if (!_mth700(buildpartial).isEmpty())
        {
            if (recognizedInstance_.isEmpty())
            {
                recognizedInstance_ = _mth700(buildpartial);
                bitField0_ = bitField0_ & -2;
            } else
            {
                ensureRecognizedInstanceIsMutable();
                recognizedInstance_.addAll(_mth700(buildpartial));
            }
        }
        if (buildpartial.Info())
        {
            mergeDebugInfo(buildpartial.Info());
        }
        mergeUnknownFields(_mth000(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final mergeFrom setDebugInfo(com.google.commerce.ocr.definitions.m m)
    {
        debugInfo_ = (com.google.commerce.ocr.definitions.o_)m.o_();
        bitField0_ = bitField0_ | 2;
        return this;
    }

    private ()
    {
        super(_mth500());
        recognizedInstance_ = Collections.emptyList();
        debugInfo_ = null;
    }

    debugInfo_(debugInfo_ debuginfo_)
    {
        this();
    }
}
