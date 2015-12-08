// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            LoyaltyProto

public static final class <init> extends com.google.protobuf.ogramId.Builder
{

    private int bitField0_;
    private Object value_;

    public final <init> buildPartial()
    {
        <init> <init>1 = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth502(<init>1, unknownFields);
        int j = bitField0_;
        int i = 0;
        if ((j & 1) == 1)
        {
            i = 1;
        }
        _mth602(<init>1, value_);
        _mth702(<init>1, i);
        return <init>1;
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
        if (buildpartial.())
        {
            bitField0_ = bitField0_ | 1;
            value_ = _mth600(buildpartial);
        }
        mergeUnknownFields(_mth800(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.ogramId.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final mergeFrom setValue(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            bitField0_ = bitField0_ | 1;
            value_ = s;
            return this;
        }
    }

    private ()
    {
        super(_mth400());
        value_ = "";
    }

    value_(value_ value_1)
    {
        this();
    }
}
