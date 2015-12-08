// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class <init> extends com.google.protobuf.Barcode.Builder
{

    private int bitField0_;
    private int type_;
    private Object value_;

    public final <init> buildPartial()
    {
        <init> <init>1 = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth702(<init>1, unknownFields);
        int k = bitField0_;
        int i = 0;
        if ((k & 1) == 1)
        {
            i = 1;
        }
        _mth802(<init>1, value_);
        int j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        _mth902(<init>1, type_);
        _mth002(<init>1, j);
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
            value_ = _mth800(buildpartial);
        }
        if (buildpartial._mth800())
        {
            setType(buildpartial.setType());
        }
        mergeUnknownFields(_mth100(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.Barcode.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final mergeFrom setType(mergeFrom mergefrom)
    {
        if (mergefrom == null)
        {
            throw new NullPointerException();
        } else
        {
            bitField0_ = bitField0_ | 2;
            type_ = mergefrom.Number();
            return this;
        }
    }

    public final Number setValue(String s)
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

    private I()
    {
        super(_mth600());
        value_ = "";
        type_ = 1;
    }

    type_(type_ type_1)
    {
        this();
    }
}
