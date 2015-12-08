// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class <init> extends com.google.protobuf.nResult.Builder
{

    private int bitField0_;
    private int fieldType_;
    private int outcome_;
    private int type_;

    private <init> buildPartial()
    {
        <init> <init>1 = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth802(<init>1, unknownFields);
        int k = bitField0_;
        int j = 0;
        if ((k & 1) == 1)
        {
            j = 1;
        }
        _mth902(<init>1, type_);
        int i = j;
        if ((k & 2) == 2)
        {
            i = j | 2;
        }
        _mth002(<init>1, outcome_);
        j = i;
        if ((k & 4) == 4)
        {
            j = i | 4;
        }
        _mth102(<init>1, fieldType_);
        _mth202(<init>1, j);
        return <init>1;
    }

    private _cls202 setFieldType(_cls202 _pcls202)
    {
        if (_pcls202 == null)
        {
            throw new NullPointerException();
        } else
        {
            bitField0_ = bitField0_ | 4;
            fieldType_ = _pcls202.fieldType_();
            return this;
        }
    }

    private onOutcome setOutcome(onOutcome onoutcome)
    {
        if (onoutcome == null)
        {
            throw new NullPointerException();
        } else
        {
            bitField0_ = bitField0_ | 2;
            outcome_ = onoutcome.getNumber();
            return this;
        }
    }

    private onType setType(onType ontype)
    {
        if (ontype == null)
        {
            throw new NullPointerException();
        } else
        {
            bitField0_ = bitField0_ | 1;
            type_ = ontype.getNumber();
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
            setType(buildpartial.onType());
        }
        if (buildpartial.me())
        {
            setOutcome(buildpartial.me());
        }
        if (buildpartial.Type())
        {
            setFieldType(buildpartial.Type());
        }
        mergeUnknownFields(_mth300(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.nResult.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    private onType()
    {
        super(_mth700());
        type_ = 0;
        outcome_ = 0;
        fieldType_ = 0;
    }

    fieldType_(fieldType_ fieldtype_)
    {
        this();
    }
}
