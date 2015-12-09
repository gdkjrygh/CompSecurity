// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class <init> extends com.google.protobuf.h.Point.Builder
{

    private int bitField0_;
    private int x_;
    private int y_;

    public final <init> buildPartial()
    {
        <init> <init>1 = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth302(<init>1, unknownFields);
        int k = bitField0_;
        int i = 0;
        if ((k & 1) == 1)
        {
            i = 1;
        }
        _mth402(<init>1, x_);
        int j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        _mth502(<init>1, y_);
        _mth602(<init>1, j);
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
        if (buildpartial.ltInstance())
        {
            setX(buildpartial.setX());
        }
        if (buildpartial.setX())
        {
            setY(buildpartial.setY());
        }
        mergeUnknownFields(_mth700(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.h.Point.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final mergeFrom setX(int i)
    {
        bitField0_ = bitField0_ | 1;
        x_ = i;
        return this;
    }

    public final x_ setY(int i)
    {
        bitField0_ = bitField0_ | 2;
        y_ = i;
        return this;
    }

    private ()
    {
        super(_mth200());
    }

    _cls200(_cls200 _pcls200)
    {
        this();
    }
}
