// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            WireProto

public static final class <init> extends com.google.protobuf.verride.Builder
{

    private int bitField0_;
    private Object label_;
    private Object modelId_;
    private float threshold_;
    private int type_;

    private <init> buildPartial()
    {
        <init> <init>1 = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth602(<init>1, unknownFields);
        int k = bitField0_;
        int j = 0;
        if ((k & 1) == 1)
        {
            j = 1;
        }
        _mth702(<init>1, type_);
        int i = j;
        if ((k & 2) == 2)
        {
            i = j | 2;
        }
        _mth802(<init>1, modelId_);
        j = i;
        if ((k & 4) == 4)
        {
            j = i | 4;
        }
        _mth902(<init>1, threshold_);
        i = j;
        if ((k & 8) == 8)
        {
            i = j | 8;
        }
        _mth002(<init>1, label_);
        _mth102(<init>1, i);
        return <init>1;
    }

    private _cls102 setThreshold(float f)
    {
        bitField0_ = bitField0_ | 4;
        threshold_ = f;
        return this;
    }

    private threshold_ setType(threshold_ threshold_1)
    {
        if (threshold_1 == null)
        {
            throw new NullPointerException();
        } else
        {
            bitField0_ = bitField0_ | 1;
            type_ = threshold_1.type_();
            return this;
        }
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
        if (buildpartial.ltInstance())
        {
            setType(buildpartial.setType());
        }
        if (buildpartial.Id())
        {
            bitField0_ = bitField0_ | 2;
            modelId_ = _mth800(buildpartial);
        }
        if (buildpartial.hold())
        {
            setThreshold(buildpartial.hold());
        }
        if (buildpartial.())
        {
            bitField0_ = bitField0_ | 8;
            label_ = _mth000(buildpartial);
        }
        mergeUnknownFields(_mth200(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.verride.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    private ()
    {
        super(_mth500());
        type_ = 0;
        modelId_ = "";
        label_ = "";
    }

    label_(label_ label_1)
    {
        this();
    }
}
