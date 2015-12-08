// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class <init> extends com.google.protobuf.mponent.Builder
{

    private int bitField0_;
    private bitField0_ endPoint_;
    private bitField0_ firstControlPoint_;
    private bitField0_ secondControlPoint_;

    private <init> buildPartial()
    {
        <init> <init>1 = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth402(<init>1, unknownFields);
        int k = bitField0_;
        int j = 0;
        if ((k & 1) == 1)
        {
            j = 1;
        }
        _mth502(<init>1, endPoint_);
        int i = j;
        if ((k & 2) == 2)
        {
            i = j | 2;
        }
        _mth602(<init>1, firstControlPoint_);
        j = i;
        if ((k & 4) == 4)
        {
            j = i | 4;
        }
        _mth702(<init>1, secondControlPoint_);
        _mth802(<init>1, j);
        return <init>1;
    }

    private _cls802 mergeEndPoint(_cls802 _pcls802)
    {
        if ((bitField0_ & 1) == 1 && endPoint_ != null && endPoint_ != ce())
        {
            endPoint_ = endPoint_(endPoint_).m(_pcls802).tial();
        } else
        {
            endPoint_ = _pcls802;
        }
        bitField0_ = bitField0_ | 1;
        return this;
    }

    private bitField0_ mergeFirstControlPoint(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 2) == 2 && firstControlPoint_ != null && firstControlPoint_ != ce())
        {
            firstControlPoint_ = firstControlPoint_(firstControlPoint_).m(bitfield0_).tial();
        } else
        {
            firstControlPoint_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 2;
        return this;
    }

    private bitField0_ mergeSecondControlPoint(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 4) == 4 && secondControlPoint_ != null && secondControlPoint_ != ce())
        {
            secondControlPoint_ = secondControlPoint_(secondControlPoint_).m(bitfield0_).tial();
        } else
        {
            secondControlPoint_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 4;
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
        if (buildpartial._mthint())
        {
            mergeEndPoint(buildpartial._mthint());
        }
        if (buildpartial.ControlPoint())
        {
            mergeFirstControlPoint(buildpartial.ControlPoint());
        }
        if (buildpartial.dControlPoint())
        {
            mergeSecondControlPoint(buildpartial.dControlPoint());
        }
        mergeUnknownFields(_mth900(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.mponent.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final mergeFrom setEndPoint(mergeFrom mergefrom)
    {
        if (mergefrom == null)
        {
            throw new NullPointerException();
        } else
        {
            endPoint_ = mergefrom;
            bitField0_ = bitField0_ | 1;
            return this;
        }
    }

    private ()
    {
        super(_mth300());
        endPoint_ = null;
        firstControlPoint_ = null;
        secondControlPoint_ = null;
    }

    secondControlPoint_(secondControlPoint_ secondcontrolpoint_)
    {
        this();
    }
}
