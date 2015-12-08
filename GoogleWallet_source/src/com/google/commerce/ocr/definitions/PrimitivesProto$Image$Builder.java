// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class <init> extends com.google.protobuf.o.Image.Builder
{

    private int bitField0_;
    private int format_;
    private ByteString image_;

    private mat setFormat(mat mat)
    {
        if (mat == null)
        {
            throw new NullPointerException();
        } else
        {
            bitField0_ = bitField0_ | 2;
            format_ = mat.getNumber();
            return this;
        }
    }

    public final mat.getNumber buildPartial()
    {
        mat.getNumber getnumber = new mat.getNumber(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth002(getnumber, unknownFields);
        int k = bitField0_;
        int i = 0;
        if ((k & 1) == 1)
        {
            i = 1;
        }
        _mth102(getnumber, image_);
        int j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        _mth202(getnumber, format_);
        _mth302(getnumber, j);
        return getnumber;
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
            setImage(buildpartial.());
        }
        if (buildpartial.t())
        {
            setFormat(buildpartial.t());
        }
        mergeUnknownFields(_mth400(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.o.Image.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final mergeFrom setImage(ByteString bytestring)
    {
        if (bytestring == null)
        {
            throw new NullPointerException();
        } else
        {
            bitField0_ = bitField0_ | 1;
            image_ = bytestring;
            return this;
        }
    }

    private mat()
    {
        super(_mth900());
        image_ = ByteString.EMPTY;
        format_ = 1;
    }

    format_(format_ format_1)
    {
        this();
    }
}
