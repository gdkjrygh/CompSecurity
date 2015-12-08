// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
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
        private int format_;
        private ByteString image_;

        private Builder setFormat(ImageFormat imageformat)
        {
            if (imageformat == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 2;
                format_ = imageformat.getNumber();
                return this;
            }
        }

        public final PrimitivesProto.Image buildPartial()
        {
            PrimitivesProto.Image image = new PrimitivesProto.Image(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
            
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final Builder mergeFrom(PrimitivesProto.Image image)
        {
            if (image == PrimitivesProto.Image.getDefaultInstance())
            {
                return this;
            }
            if (image.hasImage())
            {
                setImage(image.getImage());
            }
            if (image.hasFormat())
            {
                setFormat(image.getFormat());
            }
            mergeUnknownFields(
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((PrimitivesProto.Image)generatedmessagelite);
        }

        public final Builder setImage(ByteString bytestring)
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

        private Builder()
        {
            super(PrimitivesProto.Image.defaultInstance);
            image_ = ByteString.EMPTY;
            format_ = 1;
        }

        Builder(PrimitivesProto._cls1 _pcls1)
        {
            this();
        }
    }

    public static final class ImageFormat extends Enum
    {

        private static final ImageFormat $VALUES[];
        public static final ImageFormat JPEG;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static ImageFormat valueOf(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 1: // '\001'
                return JPEG;
            }
        }

        public static ImageFormat valueOf(String s)
        {
            return (ImageFormat)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$Image$ImageFormat, s);
        }

        public static ImageFormat[] values()
        {
            return (ImageFormat[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            JPEG = new ImageFormat("JPEG", 0, 0, 1);
            $VALUES = (new ImageFormat[] {
                JPEG
            });
        }

        private ImageFormat(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public static final Parser PARSER;
    private static final PARSER defaultInstance;
    private static volatile MutableMessageLite mutableDefault = null;
    private int bitField0_;
    private int format_;
    private ByteString image_;
    private int memoizedSerializedSize;

    public static ImageFormat getDefaultInstance()
    {
        return defaultInstance;
    }

    public static Builder newBuilder()
    {
        return defaultInstance.toBuilder();
    }

    public static Builder newBuilder(toBuilder tobuilder)
    {
        return defaultInstance.toBuilder().mergeFrom(tobuilder);
    }

    public final ImageFormat getFormat()
    {
        ImageFormat imageformat1 = ImageFormat.valueOf(format_);
        ImageFormat imageformat = imageformat1;
        if (imageformat1 == null)
        {
            imageformat = ImageFormat.JPEG;
        }
        return imageformat;
    }

    public final ByteString getImage()
    {
        return image_;
    }

    public final boolean hasFormat()
    {
        return (bitField0_ & 2) == 2;
    }

    public final boolean hasImage()
    {
        return (bitField0_ & 1) == 1;
    }

    public final Builder toBuilder()
    {
        if (this == defaultInstance)
        {
            return new Builder(null);
        } else
        {
            return (new Builder(null)).mergeFrom(this);
        }
    }

    public final volatile com.google.protobuf.ivesProto.Image toBuilder()
    {
        return toBuilder();
    }

    static 
    {
        PARSER = new AbstractParser() {

            private static PrimitivesProto.Image parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                throws InvalidProtocolBufferException
            {
                try
                {
                    codedinputstream = new Image(codedinputstream, extensionregistrylite, null);
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
        GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Image, new rototypeHolder(defaultInstance, PARSER));
    }



/*
    static UnknownFieldSetLite access$6002(Builder builder, UnknownFieldSetLite unknownfieldsetlite)
    {
        builder.unknownFields = unknownfieldsetlite;
        return unknownfieldsetlite;
    }

*/


/*
    static ByteString access$6102(unknownFields unknownfields, ByteString bytestring)
    {
        unknownfields.image_ = bytestring;
        return bytestring;
    }

*/


/*
    static int access$6202(image_ image_1, int i)
    {
        image_1.format_ = i;
        return i;
    }

*/


/*
    static int access$6302(format_ format_1, int i)
    {
        format_1.bitField0_ = i;
        return i;
    }

*/


    private _cls1(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
    {
        com.google.protobuf.ilder ilder;
        boolean flag;
        memoizedSerializedSize = -1;
        image_ = ByteString.EMPTY;
        format_ = 1;
        ilder = UnknownFieldSetLite.newBuilder();
        flag = false;
_L9:
        if (flag) goto _L2; else goto _L1
_L1:
        int i = codedinputstream.readTag();
        i;
        JVM INSTR lookupswitch 3: default 216
    //                   0: 219
    //                   10: 93
    //                   16: 139;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!parseUnknownField(codedinputstream, ilder, extensionregistrylite, i))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        bitField0_ = bitField0_ | 1;
        image_ = codedinputstream.readBytes();
        continue; /* Loop/switch isn't completed */
        codedinputstream;
        throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
        codedinputstream;
        unknownFields = ilder.build();
        throw codedinputstream;
_L6:
        i = codedinputstream.readEnum();
        if (ImageFormat.valueOf(i) == null)
        {
            ilder.mergeVarintField(2, i);
            continue; /* Loop/switch isn't completed */
        }
          goto _L7
        codedinputstream;
        throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
        bitField0_ = bitField0_ | 2;
        format_ = i;
        continue; /* Loop/switch isn't completed */
_L2:
        unknownFields = ilder.build();
        return;
_L4:
        flag = true;
        if (true) goto _L9; else goto _L8
_L8:
    }

    unknownFields(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, unknownFields unknownfields)
    {
        this(codedinputstream, extensionregistrylite);
    }
}
