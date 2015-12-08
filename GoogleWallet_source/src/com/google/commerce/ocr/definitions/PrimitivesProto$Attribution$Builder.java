// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class <init> extends com.google.protobuf.ibution.Builder
{

    private int bitField0_;
    private float score_;
    private Object source_;

    private <init> buildPartial()
    {
        <init> <init>1 = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth502(<init>1, unknownFields);
        int k = bitField0_;
        int i = 0;
        if ((k & 1) == 1)
        {
            i = 1;
        }
        _mth602(<init>1, score_);
        int j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        _mth702(<init>1, source_);
        _mth802(<init>1, j);
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
            setScore(buildpartial.());
        }
        if (buildpartial.e())
        {
            bitField0_ = bitField0_ | 2;
            source_ = _mth700(buildpartial);
        }
        mergeUnknownFields(_mth900(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.ibution.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final mergeFrom setScore(float f)
    {
        bitField0_ = bitField0_ | 1;
        score_ = f;
        return this;
    }

    public final score_ setSource(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            bitField0_ = bitField0_ | 2;
            source_ = s;
            return this;
        }
    }

    private ()
    {
        super(_mth400());
        source_ = "";
    }

    source_(source_ source_1)
    {
        this();
    }
}
