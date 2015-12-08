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
        private int type_;
        private Object value_;

        public final PrimitivesProto.Barcode buildPartial()
        {
            PrimitivesProto.Barcode barcode = new PrimitivesProto.Barcode(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
            
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final Builder mergeFrom(PrimitivesProto.Barcode barcode)
        {
            if (barcode == PrimitivesProto.Barcode.getDefaultInstance())
            {
                return this;
            }
            if (barcode.hasValue())
            {
                bitField0_ = bitField0_ | 1;
                value_ = barcode.value_;
            }
            if (barcode.hasType())
            {
                setType(barcode.getType());
            }
            mergeUnknownFields(
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((PrimitivesProto.Barcode)generatedmessagelite);
        }

        public final Builder setType(Type type)
        {
            if (type == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 2;
                type_ = type.getNumber();
                return this;
            }
        }

        public final Builder setValue(String s)
        {
            if (s == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 1;
                value_ = s;
                return this;
            }
        }

        private Builder()
        {
            super(PrimitivesProto.Barcode.defaultInstance);
            value_ = "";
            type_ = 1;
        }

        Builder(PrimitivesProto._cls1 _pcls1)
        {
            this();
        }
    }

    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type AZTEC;
        public static final Type CODABAR;
        public static final Type CODE_128;
        public static final Type CODE_39;
        public static final Type CODE_93;
        public static final Type DATA_MATRIX;
        public static final Type EAN_13;
        public static final Type EAN_8;
        public static final Type ITF_14;
        public static final Type PDF_417;
        public static final Type QR_CODE;
        public static final Type UNKNOWN_FORMAT;
        public static final Type UPC_A;
        public static final Type UPC_E;
        public static final Type UPC_EAN_EXTENSION;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static Type valueOf(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 1: // '\001'
                return UNKNOWN_FORMAT;

            case 2: // '\002'
                return AZTEC;

            case 3: // '\003'
                return CODE_39;

            case 4: // '\004'
                return CODE_93;

            case 5: // '\005'
                return CODE_128;

            case 6: // '\006'
                return CODABAR;

            case 7: // '\007'
                return DATA_MATRIX;

            case 8: // '\b'
                return EAN_8;

            case 9: // '\t'
                return EAN_13;

            case 10: // '\n'
                return ITF_14;

            case 11: // '\013'
                return PDF_417;

            case 12: // '\f'
                return QR_CODE;

            case 13: // '\r'
                return UPC_A;

            case 14: // '\016'
                return UPC_E;

            case 15: // '\017'
                return UPC_EAN_EXTENSION;
            }
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$Barcode$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            UNKNOWN_FORMAT = new Type("UNKNOWN_FORMAT", 0, 0, 1);
            AZTEC = new Type("AZTEC", 1, 1, 2);
            CODE_39 = new Type("CODE_39", 2, 2, 3);
            CODE_93 = new Type("CODE_93", 3, 3, 4);
            CODE_128 = new Type("CODE_128", 4, 4, 5);
            CODABAR = new Type("CODABAR", 5, 5, 6);
            DATA_MATRIX = new Type("DATA_MATRIX", 6, 6, 7);
            EAN_8 = new Type("EAN_8", 7, 7, 8);
            EAN_13 = new Type("EAN_13", 8, 8, 9);
            ITF_14 = new Type("ITF_14", 9, 9, 10);
            PDF_417 = new Type("PDF_417", 10, 10, 11);
            QR_CODE = new Type("QR_CODE", 11, 11, 12);
            UPC_A = new Type("UPC_A", 12, 12, 13);
            UPC_E = new Type("UPC_E", 13, 13, 14);
            UPC_EAN_EXTENSION = new Type("UPC_EAN_EXTENSION", 14, 14, 15);
            $VALUES = (new Type[] {
                UNKNOWN_FORMAT, AZTEC, CODE_39, CODE_93, CODE_128, CODABAR, DATA_MATRIX, EAN_8, EAN_13, ITF_14, 
                PDF_417, QR_CODE, UPC_A, UPC_E, UPC_EAN_EXTENSION
            });
        }

        private Type(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public static final Parser PARSER;
    private static final PARSER defaultInstance;
    private static volatile MutableMessageLite mutableDefault = null;
    private int bitField0_;
    private int memoizedSerializedSize;
    private int type_;
    private Object value_;

    public static Type getDefaultInstance()
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

    public final Type getType()
    {
        Type type1 = Type.valueOf(type_);
        Type type = type1;
        if (type1 == null)
        {
            type = Type.UNKNOWN_FORMAT;
        }
        return type;
    }

    public final String getValue()
    {
        Object obj = value_;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (ByteString)obj;
        String s = ((ByteString) (obj)).toStringUtf8();
        if (((ByteString) (obj)).isValidUtf8())
        {
            value_ = s;
        }
        return s;
    }

    public final boolean hasType()
    {
        return (bitField0_ & 2) == 2;
    }

    public final boolean hasValue()
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

    public final volatile com.google.protobuf.esProto.Barcode toBuilder()
    {
        return toBuilder();
    }

    static 
    {
        PARSER = new AbstractParser() {

            private static PrimitivesProto.Barcode parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                throws InvalidProtocolBufferException
            {
                try
                {
                    codedinputstream = new Barcode(codedinputstream, extensionregistrylite, null);
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
        GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Barcode, new totypeHolder(defaultInstance, PARSER));
    }



/*
    static UnknownFieldSetLite access$7702(Builder builder, UnknownFieldSetLite unknownfieldsetlite)
    {
        builder.unknownFields = unknownfieldsetlite;
        return unknownfieldsetlite;
    }

*/



/*
    static Object access$7802(unknownFields unknownfields, Object obj)
    {
        unknownfields.value_ = obj;
        return obj;
    }

*/


/*
    static int access$7902(value_ value_1, int i)
    {
        value_1.type_ = i;
        return i;
    }

*/


/*
    static int access$8002(type_ type_1, int i)
    {
        type_1.bitField0_ = i;
        return i;
    }

*/


    private _cls1(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
    {
        com.google.protobuf.der der;
        boolean flag;
        memoizedSerializedSize = -1;
        value_ = "";
        type_ = 1;
        der = UnknownFieldSetLite.newBuilder();
        flag = false;
_L9:
        if (flag) goto _L2; else goto _L1
_L1:
        int i = codedinputstream.readTag();
        i;
        JVM INSTR lookupswitch 3: default 220
    //                   0: 223
    //                   10: 93
    //                   16: 143;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!parseUnknownField(codedinputstream, der, extensionregistrylite, i))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        String s = codedinputstream.readString();
        bitField0_ = bitField0_ | 1;
        value_ = s;
        continue; /* Loop/switch isn't completed */
        codedinputstream;
        throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
        codedinputstream;
        unknownFields = der.build();
        throw codedinputstream;
_L6:
        i = codedinputstream.readEnum();
        if (Type.valueOf(i) == null)
        {
            der.mergeVarintField(2, i);
            continue; /* Loop/switch isn't completed */
        }
          goto _L7
        codedinputstream;
        throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
        bitField0_ = bitField0_ | 2;
        type_ = i;
        continue; /* Loop/switch isn't completed */
_L2:
        unknownFields = der.build();
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
