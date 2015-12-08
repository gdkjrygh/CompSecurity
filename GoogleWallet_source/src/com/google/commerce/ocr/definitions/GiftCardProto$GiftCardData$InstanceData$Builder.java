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
//            GiftCardProto

public static final class <init> extends com.google.protobuf.nceData.Builder
{

    private List barcode_;
    private int bitField0_;
    private bitField0_ cardNumber_;
    private bitField0_ pin_;
    private List textField_;

    private void ensureBarcodeIsMutable()
    {
        if ((bitField0_ & 4) != 4)
        {
            barcode_ = new ArrayList(barcode_);
            bitField0_ = bitField0_ | 4;
        }
    }

    private void ensureTextFieldIsMutable()
    {
        if ((bitField0_ & 8) != 8)
        {
            textField_ = new ArrayList(textField_);
            bitField0_ = bitField0_ | 8;
        }
    }

    private bitField0_ mergeCardNumber(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 1) == 1 && cardNumber_ != null && cardNumber_ != e())
        {
            cardNumber_ = cardNumber_(cardNumber_).(bitfield0_).ial();
        } else
        {
            cardNumber_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 1;
        return this;
    }

    private bitField0_ mergePin(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 2) == 2 && pin_ != null && pin_ != e())
        {
            pin_ = pin_(pin_).(bitfield0_).ial();
        } else
        {
            pin_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 2;
        return this;
    }

    public final bitField0_ addAllBarcode(Iterable iterable)
    {
        ensureBarcodeIsMutable();
        com.google.protobuf.nceData.Builder.ensureBarcodeIsMutable(iterable, barcode_);
        return this;
    }

    public final barcode_ buildPartial()
    {
        barcode_ barcode_1 = new barcode_(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth502(barcode_1, unknownFields);
        int k = bitField0_;
        int i = 0;
        if ((k & 1) == 1)
        {
            i = 1;
        }
        _mth602(barcode_1, cardNumber_);
        int j = i;
        if ((k & 2) == 2)
        {
            j = i | 2;
        }
        _mth702(barcode_1, pin_);
        if ((bitField0_ & 4) == 4)
        {
            barcode_ = Collections.unmodifiableList(barcode_);
            bitField0_ = bitField0_ & -5;
        }
        _mth802(barcode_1, barcode_);
        if ((bitField0_ & 8) == 8)
        {
            textField_ = Collections.unmodifiableList(textField_);
            bitField0_ = bitField0_ & -9;
        }
        _mth902(barcode_1, textField_);
        _mth002(barcode_1, j);
        return barcode_1;
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
        if (buildpartial.umber())
        {
            mergeCardNumber(buildpartial.umber());
        }
        if (buildpartial.umber())
        {
            mergePin(buildpartial.mergePin());
        }
        if (!_mth800(buildpartial).isEmpty())
        {
            if (barcode_.isEmpty())
            {
                barcode_ = _mth800(buildpartial);
                bitField0_ = bitField0_ & -5;
            } else
            {
                ensureBarcodeIsMutable();
                barcode_.addAll(_mth800(buildpartial));
            }
        }
        if (!_mth900(buildpartial).isEmpty())
        {
            if (textField_.isEmpty())
            {
                textField_ = _mth900(buildpartial);
                bitField0_ = bitField0_ & -9;
            } else
            {
                ensureTextFieldIsMutable();
                textField_.addAll(_mth900(buildpartial));
            }
        }
        mergeUnknownFields(_mth100(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.nceData.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final mergeFrom setCardNumber(mergeFrom mergefrom)
    {
        if (mergefrom == null)
        {
            throw new NullPointerException();
        } else
        {
            cardNumber_ = mergefrom;
            bitField0_ = bitField0_ | 1;
            return this;
        }
    }

    public final bitField0_ setPin(bitField0_ bitfield0_)
    {
        if (bitfield0_ == null)
        {
            throw new NullPointerException();
        } else
        {
            pin_ = bitfield0_;
            bitField0_ = bitField0_ | 2;
            return this;
        }
    }

    private Y()
    {
        super(_mth400());
        cardNumber_ = null;
        pin_ = null;
        barcode_ = Collections.emptyList();
        textField_ = Collections.emptyList();
    }

    textField_(textField_ textfield_)
    {
        this();
    }
}
