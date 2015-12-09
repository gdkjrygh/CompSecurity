// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            GiftCardProto

public static final class <init> extends com.google.protobuf.ardData.Builder
{

    private int bitField0_;
    private a classData_;
    private Data instanceData_;

    private a mergeClassData(a a)
    {
        if ((bitField0_ & 1) == 1 && classData_ != null && classData_ != com.google.commerce.ocr.definitions.a.getDefaultInstance())
        {
            classData_ = com.google.commerce.ocr.definitions.a.newBuilder(classData_).mergeFrom(a).buildPartial();
        } else
        {
            classData_ = a;
        }
        bitField0_ = bitField0_ | 1;
        return this;
    }

    private Data mergeInstanceData(Data data)
    {
        if ((bitField0_ & 2) == 2 && instanceData_ != null && instanceData_ != Data.getDefaultInstance())
        {
            instanceData_ = Data.newBuilder(instanceData_).mergeFrom(data).buildPartial();
        } else
        {
            instanceData_ = data;
        }
        bitField0_ = bitField0_ | 2;
        return this;
    }

    public final bitField0_ buildPartial()
    {
        Data data = new Data(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth402(data, unknownFields);
        int k = bitField0_;
        int i = 0;
        if ((k & 1) == 1)
        {
            i = 1;
        }
        _mth502(data, classData_);
        int j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        _mth602(data, instanceData_);
        _mth702(data, j);
        return data;
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
        if (buildpartial.Data())
        {
            mergeClassData(buildpartial.Data());
        }
        if (buildpartial.nceData())
        {
            mergeInstanceData(buildpartial.nceData());
        }
        mergeUnknownFields(_mth800(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.ardData.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final a.Builder setClassData(a.Builder builder)
    {
        classData_ = (a)builder.build();
        bitField0_ = bitField0_ | 1;
        return this;
    }

    public final Data.Builder setInstanceData(Data.Builder builder)
    {
        instanceData_ = (Data)builder.build();
        bitField0_ = bitField0_ | 2;
        return this;
    }

    private Data.Builder()
    {
        super(_mth300());
        classData_ = null;
        instanceData_ = null;
    }

    instanceData_(instanceData_ instancedata_)
    {
        this();
    }
}
