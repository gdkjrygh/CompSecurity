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
//            LoyaltyProto

public static final class <init> extends com.google.protobuf.ardData.Builder
{

    private List accountId_;
    private List barcodeId_;
    private int bitField0_;
    private bitField0_ discoverableProgramId_;
    private bitField0_ merchantName_;
    private Object ocrSystemId_;
    private bitField0_ programName_;

    private void ensureAccountIdIsMutable()
    {
        if ((bitField0_ & 4) != 4)
        {
            accountId_ = new ArrayList(accountId_);
            bitField0_ = bitField0_ | 4;
        }
    }

    private void ensureBarcodeIdIsMutable()
    {
        if ((bitField0_ & 8) != 8)
        {
            barcodeId_ = new ArrayList(barcodeId_);
            bitField0_ = bitField0_ | 8;
        }
    }

    private bitField0_ mergeDiscoverableProgramId(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 0x10) == 16 && discoverableProgramId_ != null && discoverableProgramId_ != tDefaultInstance())
        {
            discoverableProgramId_ = wBuilder(discoverableProgramId_).mergeFrom(bitfield0_).buildPartial();
        } else
        {
            discoverableProgramId_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 0x10;
        return this;
    }

    private bitField0_ mergeMerchantName(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 1) == 1 && merchantName_ != null && merchantName_ != aultInstance())
        {
            merchantName_ = lder(merchantName_).mergeFrom(bitfield0_).buildPartial();
        } else
        {
            merchantName_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 1;
        return this;
    }

    private bitField0_ mergeProgramName(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 2) == 2 && programName_ != null && programName_ != aultInstance())
        {
            programName_ = lder(programName_).mergeFrom(bitfield0_).buildPartial();
        } else
        {
            programName_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 2;
        return this;
    }

    public final bitField0_ addAllAccountId(Iterable iterable)
    {
        ensureAccountIdIsMutable();
        com.google.protobuf.ardData.Builder.ensureAccountIdIsMutable(iterable, accountId_);
        return this;
    }

    public final accountId_ addAllBarcodeId(Iterable iterable)
    {
        ensureBarcodeIdIsMutable();
        com.google.protobuf.ardData.Builder.ensureBarcodeIdIsMutable(iterable, barcodeId_);
        return this;
    }

    public final barcodeId_ buildPartial()
    {
        barcodeId_ barcodeid_ = new barcodeId_(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth02(barcodeid_, unknownFields);
        int k = bitField0_;
        int j = 0;
        if ((k & 1) == 1)
        {
            j = 1;
        }
        _mth02(barcodeid_, merchantName_);
        int i = j;
        if ((k & 2) == 2)
        {
            i = j | 2;
        }
        _mth02(barcodeid_, programName_);
        if ((bitField0_ & 4) == 4)
        {
            accountId_ = Collections.unmodifiableList(accountId_);
            bitField0_ = bitField0_ & -5;
        }
        _mth02(barcodeid_, accountId_);
        if ((bitField0_ & 8) == 8)
        {
            barcodeId_ = Collections.unmodifiableList(barcodeId_);
            bitField0_ = bitField0_ & -9;
        }
        _mth02(barcodeid_, barcodeId_);
        j = i;
        if ((k & 0x10) == 16)
        {
            j = i | 4;
        }
        _mth02(barcodeid_, discoverableProgramId_);
        i = j;
        if ((k & 0x20) == 32)
        {
            i = j | 8;
        }
        _mth02(barcodeid_, ocrSystemId_);
        _mth002(barcodeid_, i);
        return barcodeid_;
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
        if (buildpartial.antName())
        {
            mergeMerchantName(buildpartial.antName());
        }
        if (buildpartial.amName())
        {
            mergeProgramName(buildpartial.amName());
        }
        if (!_mth00(buildpartial).isEmpty())
        {
            if (accountId_.isEmpty())
            {
                accountId_ = _mth00(buildpartial);
                bitField0_ = bitField0_ & -5;
            } else
            {
                ensureAccountIdIsMutable();
                accountId_.addAll(_mth00(buildpartial));
            }
        }
        if (!_mth00(buildpartial).isEmpty())
        {
            if (barcodeId_.isEmpty())
            {
                barcodeId_ = _mth00(buildpartial);
                bitField0_ = bitField0_ & -9;
            } else
            {
                ensureBarcodeIdIsMutable();
                barcodeId_.addAll(_mth00(buildpartial));
            }
        }
        if (buildpartial.verableProgramId())
        {
            mergeDiscoverableProgramId(buildpartial.verableProgramId());
        }
        if (buildpartial.stemId())
        {
            bitField0_ = bitField0_ | 0x20;
            ocrSystemId_ = _mth00(buildpartial);
        }
        mergeUnknownFields(_mth100(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.ardData.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final ilder setDiscoverableProgramId(ilder ilder)
    {
        discoverableProgramId_ = (discoverableProgramId_)ilder.build();
        bitField0_ = bitField0_ | 0x10;
        return this;
    }

    public final bitField0_ setMerchantName(bitField0_ bitfield0_)
    {
        if (bitfield0_ == null)
        {
            throw new NullPointerException();
        } else
        {
            merchantName_ = bitfield0_;
            bitField0_ = bitField0_ | 1;
            return this;
        }
    }

    public final bitField0_ setProgramName(bitField0_ bitfield0_)
    {
        if (bitfield0_ == null)
        {
            throw new NullPointerException();
        } else
        {
            programName_ = bitfield0_;
            bitField0_ = bitField0_ | 2;
            return this;
        }
    }

    private ilder()
    {
        super(_mth00());
        merchantName_ = null;
        programName_ = null;
        accountId_ = Collections.emptyList();
        barcodeId_ = Collections.emptyList();
        discoverableProgramId_ = null;
        ocrSystemId_ = "";
    }

    ocrSystemId_(ocrSystemId_ ocrsystemid_)
    {
        this();
    }
}
