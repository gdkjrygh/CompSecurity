// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MutableMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSetLite;
import java.io.IOException;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class <init> extends GeneratedMessageLite
{
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private PrimitivesProto.Path.Point endPoint_;
        private PrimitivesProto.Path.Point firstControlPoint_;
        private PrimitivesProto.Path.Point secondControlPoint_;

        private PrimitivesProto.Path.PathComponent buildPartial()
        {
            PrimitivesProto.Path.PathComponent pathcomponent = new PrimitivesProto.Path.PathComponent(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
            
// JavaClassFileOutputException: get_constant: invalid tag

        private Builder mergeEndPoint(PrimitivesProto.Path.Point point)
        {
            if ((bitField0_ & 1) == 1 && endPoint_ != null && endPoint_ != PrimitivesProto.Path.Point.getDefaultInstance())
            {
                endPoint_ = PrimitivesProto.Path.Point.newBuilder(endPoint_).mergeFrom(point).buildPartial();
            } else
            {
                endPoint_ = point;
            }
            bitField0_ = bitField0_ | 1;
            return this;
        }

        private Builder mergeFirstControlPoint(PrimitivesProto.Path.Point point)
        {
            if ((bitField0_ & 2) == 2 && firstControlPoint_ != null && firstControlPoint_ != PrimitivesProto.Path.Point.getDefaultInstance())
            {
                firstControlPoint_ = PrimitivesProto.Path.Point.newBuilder(firstControlPoint_).mergeFrom(point).buildPartial();
            } else
            {
                firstControlPoint_ = point;
            }
            bitField0_ = bitField0_ | 2;
            return this;
        }

        private Builder mergeSecondControlPoint(PrimitivesProto.Path.Point point)
        {
            if ((bitField0_ & 4) == 4 && secondControlPoint_ != null && secondControlPoint_ != PrimitivesProto.Path.Point.getDefaultInstance())
            {
                secondControlPoint_ = PrimitivesProto.Path.Point.newBuilder(secondControlPoint_).mergeFrom(point).buildPartial();
            } else
            {
                secondControlPoint_ = point;
            }
            bitField0_ = bitField0_ | 4;
            return this;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final Builder mergeFrom(PrimitivesProto.Path.PathComponent pathcomponent)
        {
            if (pathcomponent == PrimitivesProto.Path.PathComponent.getDefaultInstance())
            {
                return this;
            }
            if (pathcomponent.hasEndPoint())
            {
                mergeEndPoint(pathcomponent.getEndPoint());
            }
            if (pathcomponent.hasFirstControlPoint())
            {
                mergeFirstControlPoint(pathcomponent.getFirstControlPoint());
            }
            if (pathcomponent.hasSecondControlPoint())
            {
                mergeSecondControlPoint(pathcomponent.getSecondControlPoint());
            }
            mergeUnknownFields(
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((PrimitivesProto.Path.PathComponent)generatedmessagelite);
        }

        public final Builder setEndPoint(PrimitivesProto.Path.Point point)
        {
            if (point == null)
            {
                throw new NullPointerException();
            } else
            {
                endPoint_ = point;
                bitField0_ = bitField0_ | 1;
                return this;
            }
        }

        private Builder()
        {
            super(PrimitivesProto.Path.PathComponent.defaultInstance);
            endPoint_ = null;
            firstControlPoint_ = null;
            secondControlPoint_ = null;
        }

        Builder(PrimitivesProto._cls1 _pcls1)
        {
            this();
        }
    }


    public static final Parser PARSER;
    private static final PARSER defaultInstance;
    private static volatile MutableMessageLite mutableDefault = null;
    private int bitField0_;
    private PARSER endPoint_;
    private PARSER firstControlPoint_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private PARSER secondControlPoint_;

    public static Builder.bitField0_ getDefaultInstance()
    {
        return defaultInstance;
    }

    public static Builder newBuilder()
    {
        return defaultInstance.toBuilder();
    }

    private Builder toBuilder()
    {
        if (this == defaultInstance)
        {
            return new Builder(null);
        } else
        {
            return (new Builder(null)).mergeFrom(this);
        }
    }

    public final Builder.mergeFrom getEndPoint()
    {
        if (endPoint_ == null)
        {
            return ltInstance();
        } else
        {
            return endPoint_;
        }
    }

    public final endPoint_ getFirstControlPoint()
    {
        if (firstControlPoint_ == null)
        {
            return ltInstance();
        } else
        {
            return firstControlPoint_;
        }
    }

    public final firstControlPoint_ getSecondControlPoint()
    {
        if (secondControlPoint_ == null)
        {
            return ltInstance();
        } else
        {
            return secondControlPoint_;
        }
    }

    public final boolean hasEndPoint()
    {
        return (bitField0_ & 1) == 1;
    }

    public final boolean hasFirstControlPoint()
    {
        return (bitField0_ & 2) == 2;
    }

    public final boolean hasSecondControlPoint()
    {
        return (bitField0_ & 4) == 4;
    }

    public final boolean isInitialized()
    {
        byte byte0 = memoizedIsInitialized;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        }
        if (hasEndPoint() && !getEndPoint().lized())
        {
            memoizedIsInitialized = 0;
            return false;
        }
        if (hasFirstControlPoint() && !getFirstControlPoint().lized())
        {
            memoizedIsInitialized = 0;
            return false;
        }
        if (hasSecondControlPoint() && !getSecondControlPoint().lized())
        {
            memoizedIsInitialized = 0;
            return false;
        } else
        {
            memoizedIsInitialized = 1;
            return true;
        }
    }

    public final volatile com.google.protobuf.h.PathComponent toBuilder()
    {
        return toBuilder();
    }

    static 
    {
        PARSER = new AbstractParser() {

            private static PrimitivesProto.Path.PathComponent parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                throws InvalidProtocolBufferException
            {
                try
                {
                    codedinputstream = new PathComponent(codedinputstream, extensionregistrylite, null);
                }
                // Misplaced declaration of an exception variable
                catch (CodedInputStream codedinputstream)
                {
                    if (codedinputstream.getCause() instanceof InvalidProtocolBufferException)
                    {
                        throw (InvalidProtocolBufferException)codedinputstream.getCause();
                    } else
                    {
                        throw codedinputstream;
                    }
                }
                return codedinputstream;
            }

            public final volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                throws InvalidProtocolBufferException
            {
                return parsePartialFrom(codedinputstream, extensionregistrylite);
            }

        };
        defaultInstance = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
        GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Path$PathComponent, new r(defaultInstance, PARSER));
    }



/*
    static UnknownFieldSetLite access$3402(Builder builder, UnknownFieldSetLite unknownfieldsetlite)
    {
        builder.unknownFields = unknownfieldsetlite;
        return unknownfieldsetlite;
    }

*/


/*
    static unknownFields access$3502(unknownFields unknownfields, unknownFields unknownfields1)
    {
        unknownfields.endPoint_ = unknownfields1;
        return unknownfields1;
    }

*/


/*
    static endPoint_ access$3602(endPoint_ endpoint_, endPoint_ endpoint_1)
    {
        endpoint_.firstControlPoint_ = endpoint_1;
        return endpoint_1;
    }

*/


/*
    static firstControlPoint_ access$3702(firstControlPoint_ firstcontrolpoint_, firstControlPoint_ firstcontrolpoint_1)
    {
        firstcontrolpoint_.secondControlPoint_ = firstcontrolpoint_1;
        return firstcontrolpoint_1;
    }

*/


/*
    static int access$3802(secondControlPoint_ secondcontrolpoint_, int i)
    {
        secondcontrolpoint_.bitField0_ = i;
        return i;
    }

*/


    private _cls1(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
    {
        com.google.protobuf.h.Point point;
        boolean flag;
        memoizedIsInitialized = -1;
        memoizedSerializedSize = -1;
        point = UnknownFieldSetLite.newBuilder();
        flag = false;
_L15:
        if (flag) goto _L2; else goto _L1
_L1:
        int i = codedinputstream.readTag();
        i;
        JVM INSTR lookupswitch 4: default 361
    //                   0: 364
    //                   10: 94
    //                   18: 189
    //                   26: 282;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        if (!parseUnknownField(codedinputstream, point, extensionregistrylite, i))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        _cls1 _lcls1 = null;
        if ((bitField0_ & 1) == 1)
        {
            _lcls1 = endPoint_.r();
        }
        endPoint_ = (endPoint_)codedinputstream.readMessage(endPoint_, extensionregistrylite);
        if (_lcls1 == null) goto _L9; else goto _L8
_L8:
        _lcls1.mergeFrom(endPoint_);
        endPoint_ = _lcls1.buildPartial();
_L9:
        bitField0_ = bitField0_ | 1;
        continue; /* Loop/switch isn't completed */
        codedinputstream;
        throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
        codedinputstream;
        unknownFields = point.unknownFields();
        throw codedinputstream;
_L6:
        _lcls1 = null;
        if ((bitField0_ & 2) == 2)
        {
            _lcls1 = firstControlPoint_.r();
        }
        firstControlPoint_ = (firstControlPoint_)codedinputstream.readMessage(firstControlPoint_, extensionregistrylite);
        if (_lcls1 == null) goto _L11; else goto _L10
_L10:
        _lcls1.mergeFrom(firstControlPoint_);
        firstControlPoint_ = _lcls1.buildPartial();
_L11:
        bitField0_ = bitField0_ | 2;
        continue; /* Loop/switch isn't completed */
        codedinputstream;
        throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
        _lcls1 = null;
        if ((bitField0_ & 4) == 4)
        {
            _lcls1 = secondControlPoint_.r();
        }
        secondControlPoint_ = (secondControlPoint_)codedinputstream.readMessage(secondControlPoint_, extensionregistrylite);
        if (_lcls1 == null) goto _L13; else goto _L12
_L12:
        _lcls1.mergeFrom(secondControlPoint_);
        secondControlPoint_ = _lcls1.buildPartial();
_L13:
        bitField0_ = bitField0_ | 4;
        continue; /* Loop/switch isn't completed */
_L2:
        unknownFields = point.unknownFields();
        return;
_L4:
        flag = true;
        if (true) goto _L15; else goto _L14
_L14:
    }

    unknownFields(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, unknownFields unknownfields)
    {
        this(codedinputstream, extensionregistrylite);
    }
}
