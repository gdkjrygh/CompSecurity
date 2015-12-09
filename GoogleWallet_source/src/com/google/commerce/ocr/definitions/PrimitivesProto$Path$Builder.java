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

public static final class <init> extends com.google.protobuf.to.Path.Builder
{

    private int bitField0_;
    private List constraint_;
    private List pathComponent_;
    private bitField0_ startPoint_;

    private void ensureConstraintIsMutable()
    {
        if ((bitField0_ & 4) != 4)
        {
            constraint_ = new ArrayList(constraint_);
            bitField0_ = bitField0_ | 4;
        }
    }

    private void ensurePathComponentIsMutable()
    {
        if ((bitField0_ & 2) != 2)
        {
            pathComponent_ = new ArrayList(pathComponent_);
            bitField0_ = bitField0_ | 2;
        }
    }

    private bitField0_ mergeStartPoint(bitField0_ bitfield0_)
    {
        if ((bitField0_ & 1) == 1 && startPoint_ != null && startPoint_ != tDefaultInstance())
        {
            startPoint_ = wBuilder(startPoint_).mergeFrom(bitfield0_).buildPartial();
        } else
        {
            startPoint_ = bitfield0_;
        }
        bitField0_ = bitField0_ | 1;
        return this;
    }

    public final nt addConstraint(nt nt)
    {
        if (nt == null)
        {
            throw new NullPointerException();
        } else
        {
            ensureConstraintIsMutable();
            constraint_.add(Integer.valueOf(nt.getNumber()));
            return this;
        }
    }

    public final onent addPathComponent(onent onent)
    {
        if (onent == null)
        {
            throw new NullPointerException();
        } else
        {
            ensurePathComponentIsMutable();
            pathComponent_.add(onent);
            return this;
        }
    }

    public final pathComponent_ buildPartial()
    {
        pathComponent_ pathcomponent_ = new pathComponent_(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
        _mth002(pathcomponent_, unknownFields);
        int j = bitField0_;
        int i = 0;
        if ((j & 1) == 1)
        {
            i = 1;
        }
        _mth102(pathcomponent_, startPoint_);
        if ((bitField0_ & 2) == 2)
        {
            pathComponent_ = Collections.unmodifiableList(pathComponent_);
            bitField0_ = bitField0_ & -3;
        }
        _mth202(pathcomponent_, pathComponent_);
        if ((bitField0_ & 4) == 4)
        {
            constraint_ = Collections.unmodifiableList(constraint_);
            bitField0_ = bitField0_ & -5;
        }
        _mth302(pathcomponent_, constraint_);
        _mth402(pathcomponent_, i);
        return pathcomponent_;
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
        if (buildpartial.Point())
        {
            mergeStartPoint(buildpartial.Point());
        }
        if (!_mth200(buildpartial).isEmpty())
        {
            if (pathComponent_.isEmpty())
            {
                pathComponent_ = _mth200(buildpartial);
                bitField0_ = bitField0_ & -3;
            } else
            {
                ensurePathComponentIsMutable();
                pathComponent_.addAll(_mth200(buildpartial));
            }
        }
        if (!_mth300(buildpartial).isEmpty())
        {
            if (constraint_.isEmpty())
            {
                constraint_ = _mth300(buildpartial);
                bitField0_ = bitField0_ & -5;
            } else
            {
                ensureConstraintIsMutable();
                constraint_.addAll(_mth300(buildpartial));
            }
        }
        mergeUnknownFields(_mth500(buildpartial));
        return this;
    }

    public final volatile com.google.protobuf.to.Path.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
    {
        return mergeFrom((mergeFrom)generatedmessagelite);
    }

    public final mergeFrom setStartPoint(mergeFrom mergefrom)
    {
        if (mergefrom == null)
        {
            throw new NullPointerException();
        } else
        {
            startPoint_ = mergefrom;
            bitField0_ = bitField0_ | 1;
            return this;
        }
    }

    private onent()
    {
        super(_mth900());
        startPoint_ = null;
        pathComponent_ = Collections.emptyList();
        constraint_ = Collections.emptyList();
    }

    constraint_(constraint_ constraint_1)
    {
        this();
    }
}
