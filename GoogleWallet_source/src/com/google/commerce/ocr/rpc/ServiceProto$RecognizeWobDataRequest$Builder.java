// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.rpc;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.commerce.ocr.rpc:
//            ServiceProto

public static final class <init> extends com.google.protobuf.Builder
{

    private int bitField0_;
    private int captureMode_;
    private com.google.commerce.ocr.definitions._cls0_ clientInfo_;
    private com.google.commerce.ocr.definitions._cls0_ debugInfo_;
    private com.google.commerce.ocr.definitions._cls0_ image_;
    private List instance_;
    private List wobType_;

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
        _mth02(<init>1, image_);
        if ((bitField0_ & 2) == 2)
        {
            wobType_ = Collections.unmodifiableList(wobType_);
            bitField0_ = bitField0_ & -3;
        }
        _mth02(<init>1, wobType_);
        int i = j;
        if ((k & 4) == 4)
        {
            i = j | 2;
        }
        _mth02(<init>1, clientInfo_);
        j = i;
        if ((k & 8) == 8)
        {
            j = i | 4;
        }
        _mth02(<init>1, debugInfo_);
        i = j;
        if ((k & 0x10) == 16)
        {
            i = j | 8;
        }
        _mth02(<init>1, captureMode_);
        if ((bitField0_ & 0x20) == 32)
        {
            instance_ = Collections.unmodifiableList(instance_);
            bitField0_ = bitField0_ & 0xffffffdf;
        }
        _mth02(<init>1, instance_);
        _mth002(<init>1, i);
        return <init>1;
    }

    private void ensureInstanceIsMutable()
    {
        if ((bitField0_ & 0x20) != 32)
        {
            instance_ = new ArrayList(instance_);
            bitField0_ = bitField0_ | 0x20;
        }
    }

    private void ensureWobTypeIsMutable()
    {
        if ((bitField0_ & 2) != 2)
        {
            wobType_ = new ArrayList(wobType_);
            bitField0_ = bitField0_ | 2;
        }
    }

    private bitField0_ mergeClientInfo(com.google.commerce.ocr.definitions._cls0_ _pcls0_)
    {
        if ((bitField0_ & 4) == 4 && clientInfo_ != null && clientInfo_ != com.google.commerce.ocr.definitions.fo_())
        {
            clientInfo_ = com.google.commerce.ocr.definitions.fo_(clientInfo_).fo_(_pcls0_).fo_();
        } else
        {
            clientInfo_ = _pcls0_;
        }
        bitField0_ = bitField0_ | 4;
        return this;
    }

    private bitField0_ mergeDebugInfo(com.google.commerce.ocr.definitions._cls0_ _pcls0_)
    {
        if ((bitField0_ & 8) == 8 && debugInfo_ != null && debugInfo_ != com.google.commerce.ocr.definitions.())
        {
            debugInfo_ = com.google.commerce.ocr.definitions.o_(debugInfo_).o_(_pcls0_).al();
        } else
        {
            debugInfo_ = _pcls0_;
        }
        bitField0_ = bitField0_ | 8;
        return this;
    }

    private bitField0_ mergeImage(com.google.commerce.ocr.definitions._cls0_ _pcls0_)
    {
        if ((bitField0_ & 1) == 1 && image_ != null && image_ != com.google.commerce.ocr.definitions._mth0_())
        {
            image_ = com.google.commerce.ocr.definitions._mth0_(image_)._mth0_(_pcls0_)._mth0_();
        } else
        {
            image_ = _pcls0_;
        }
        bitField0_ = bitField0_ | 1;
        return this;
    }

    public final bitField0_ addWobType(com.google.commerce.ocr.definitions._cls0_ _pcls0_)
    {
        if (_pcls0_ == null)
        {
            throw new NullPointerException();
        } else
        {
            ensureWobTypeIsMutable();
            wobType_.add(Integer.valueOf(_pcls0_.()));
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
        if (buildpartial.())
        {
            mergeImage(buildpartial.());
        }
        if (!_mth00(buildpartial).isEmpty())
        {
            if (wobType_.isEmpty())
            {
                wobType_ = _mth00(buildpartial);
                bitField0_ = bitField0_ & -3;
            } else
            {
                ensureWobTypeIsMutable();
                wobType_.addAll(_mth00(buildpartial));
            }
        }
        if (buildpartial.tInfo())
        {
            mergeClientInfo(buildpartial.tInfo());
        }
        if (buildpartial.Info())
        {
            mergeDebugInfo(buildpartial.Info());
        }
        if (buildpartial.reMode())
        {
            setCaptureMode(buildpartial.reMode());
        }
        if (!_mth00(buildpartial).isEmpty())
        {
            if (instance_.isEmpty())
            {
                instance_ = _mth00(buildpartial);
                bitField0_ = bitField0_ & 0xffffffdf;
            } else
            {
                ensureInstanceIsMutable();
                instance_.addAll(_mth00(buildpartial));
            }
        }
        mergeUnknownFields(_mth100(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final ode setCaptureMode(ode ode)
    {
        if (ode == null)
        {
            throw new NullPointerException();
        } else
        {
            bitField0_ = bitField0_ | 0x10;
            captureMode_ = ode.getNumber();
            return this;
        }
    }

    public final ode.getNumber setDebugInfo(com.google.commerce.ocr.definitions.umber umber)
    {
        debugInfo_ = (com.google.commerce.ocr.definitions.o_)umber.o_();
        bitField0_ = bitField0_ | 8;
        return this;
    }

    public final bitField0_ setDebugInfo(com.google.commerce.ocr.definitions._cls0_ _pcls0_)
    {
        if (_pcls0_ == null)
        {
            throw new NullPointerException();
        } else
        {
            debugInfo_ = _pcls0_;
            bitField0_ = bitField0_ | 8;
            return this;
        }
    }

    public final bitField0_ setImage(com.google.commerce.ocr.definitions._cls0_ _pcls0_)
    {
        image_ = (com.google.commerce.ocr.definitions._cls0_)_pcls0_._mth0_();
        bitField0_ = bitField0_ | 1;
        return this;
    }

    private ode()
    {
        super(_mth00());
        image_ = null;
        wobType_ = Collections.emptyList();
        clientInfo_ = null;
        debugInfo_ = null;
        captureMode_ = 0;
        instance_ = Collections.emptyList();
    }

    instance_(instance_ instance_1)
    {
        this();
    }
}
