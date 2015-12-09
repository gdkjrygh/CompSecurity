// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class <init> extends com.google.protobuf.Barcode.Builder
{

    private List attribution_;
    private bitField0_ barcodeText_;
    private int bitField0_;
    private bitField0_ bounds_;
    private float score_;
    private bitField0_ value_;

    private <init> buildPartial()
    {
        <init> <init>1 = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth02(<init>1, unknownFields);
        int k = bitField0_;
        int j = 0;
        if ((k & 1) == 1)
        {
            j = 1;
        }
        _mth02(<init>1, value_);
        int i = j;
        if ((k & 2) == 2)
        {
            i = j | 2;
        }
        _mth02(<init>1, barcodeText_);
        j = i;
        if ((k & 4) == 4)
        {
            j = i | 4;
        }
        _mth02(<init>1, score_);
        if ((bitField0_ & 8) == 8)
        {
            attribution_ = Collections.unmodifiableList(attribution_);
            bitField0_ = bitField0_ & -9;
        }
        _mth02(<init>1, attribution_);
        i = j;
        if ((k & 0x10) == 16)
        {
            i = j | 8;
        }
        _mth02(<init>1, bounds_);
        _mth02(<init>1, i);
        return <init>1;
    }

    private void ensureAttributionIsMutable()
    {
        if ((bitField0_ & 8) != 8)
        {
            attribution_ = new ArrayList(attribution_);
            bitField0_ = bitField0_ | 8;
        }
    }

    private bitField0_ mergeBarcodeText(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 2) == 2 && barcodeText_ != null && barcodeText_ != nstance())
        {
            barcodeText_ = barcodeText_(barcodeText_).geFrom(bitfield0_).ldPartial();
        } else
        {
            barcodeText_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 2;
        return this;
    }

    private bitField0_ mergeBounds(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 0x10) == 16 && bounds_ != null && bounds_ != bounds_())
        {
            bounds_ = bounds_(bounds_).bounds_(bitfield0_).bounds_();
        } else
        {
            bounds_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 0x10;
        return this;
    }

    private bitField0_ mergeValue(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 1) == 1 && value_ != null && value_ != ())
        {
            value_ = value_(value_).value_(bitfield0_).al();
        } else
        {
            value_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 1;
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
        if (buildpartial.())
        {
            mergeValue(buildpartial.());
        }
        if (buildpartial.deText())
        {
            mergeBarcodeText(buildpartial.deText());
        }
        if (buildpartial.())
        {
            setScore(buildpartial.());
        }
        if (!_mth00(buildpartial).isEmpty())
        {
            if (attribution_.isEmpty())
            {
                attribution_ = _mth00(buildpartial);
                bitField0_ = bitField0_ & -9;
            } else
            {
                ensureAttributionIsMutable();
                attribution_.addAll(_mth00(buildpartial));
            }
        }
        if (buildpartial.s())
        {
            mergeBounds(buildpartial.s());
        }
        mergeUnknownFields(_mth000(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.Barcode.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final mergeFrom setBounds(mergeFrom mergefrom)
    {
        bounds_ = (bounds_)mergefrom.bounds_();
        bitField0_ = bitField0_ | 0x10;
        return this;
    }

    public final bitField0_ setScore(float f)
    {
        bitField0_ = bitField0_ | 4;
        score_ = f;
        return this;
    }

    public final score_ setValue(score_ score_1)
    {
        value_ = (value_)score_1.value_();
        bitField0_ = bitField0_ | 1;
        return this;
    }

    private ()
    {
        super(_mth00());
        value_ = null;
        barcodeText_ = null;
        attribution_ = Collections.emptyList();
        bounds_ = null;
    }

    bounds_(bounds_ bounds_1)
    {
        this();
    }
}
