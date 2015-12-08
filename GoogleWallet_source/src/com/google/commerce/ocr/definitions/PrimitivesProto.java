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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PrimitivesProto
{
    public static final class Attribution extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final Attribution defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private int memoizedSerializedSize;
        private float score_;
        private Object source_;

        public static Attribution getDefaultInstance()
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
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final float getScore()
        {
            return score_;
        }

        public final String getSource()
        {
            Object obj = source_;
            if (obj instanceof String)
            {
                return (String)obj;
            }
            obj = (ByteString)obj;
            String s = ((ByteString) (obj)).toStringUtf8();
            if (((ByteString) (obj)).isValidUtf8())
            {
                source_ = s;
            }
            return s;
        }

        public final boolean hasScore()
        {
            return (bitField0_ & 1) == 1;
        }

        public final boolean hasSource()
        {
            return (bitField0_ & 2) == 2;
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static Attribution parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new Attribution(codedinputstream, extensionregistrylite);
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
            defaultInstance = new Attribution(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Attribution, new com.google.protobuf.GeneratedMessageLite.PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$2502(Attribution attribution, UnknownFieldSetLite unknownfieldsetlite)
        {
            attribution.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static float access$2602(Attribution attribution, float f)
        {
            attribution.score_ = f;
            return f;
        }

*/



/*
        static Object access$2702(Attribution attribution, Object obj)
        {
            attribution.source_ = obj;
            return obj;
        }

*/


/*
        static int access$2802(Attribution attribution, int i)
        {
            attribution.bitField0_ = i;
            return i;
        }

*/


        private Attribution(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            memoizedSerializedSize = -1;
            score_ = 0.0F;
            source_ = "";
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L8:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 3: default 197
        //                       0: 200
        //                       13: 93
        //                       18: 139;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            bitField0_ = bitField0_ | 1;
            score_ = codedinputstream.readFloat();
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            String s = codedinputstream.readString();
            bitField0_ = bitField0_ | 2;
            source_ = s;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L2:
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L8; else goto _L7
_L7:
        }

    }

    public static final class Attribution.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private float score_;
        private Object source_;

        private Attribution buildPartial()
        {
            Attribution attribution = new Attribution(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            attribution.unknownFields.NullPointerException = <no variable>;
            int k = bitField0_;
            int i = 0;
            if ((k & 1) == 1)
            {
                i = 1;
            }
            attribution.score_ = score_;
            int j = i;
            if ((k & 2) == 2)
            {
                j = i | 2;
            }
            attribution.source_ = source_;
            attribution.bitField0_ = j;
            return attribution;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final Attribution.Builder mergeFrom(Attribution attribution)
        {
            if (attribution == Attribution.getDefaultInstance())
            {
                return this;
            }
            if (attribution.hasScore())
            {
                setScore(attribution.getScore());
            }
            if (attribution.hasSource())
            {
                bitField0_ = bitField0_ | 2;
                source_ = attribution.source_;
            }
            mergeUnknownFields(((NullPointerException) (attribution)).NullPointerException);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((Attribution)generatedmessagelite);
        }

        public final Attribution.Builder setScore(float f)
        {
            bitField0_ = bitField0_ | 1;
            score_ = f;
            return this;
        }

        public final Attribution.Builder setSource(String s)
        {
            if (s == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 2;
                source_ = s;
                return this;
            }
        }

        private Attribution.Builder()
        {
            super(Attribution.defaultInstance);
            source_ = "";
        }

    }

    public static final class Barcode extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final Barcode defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private int memoizedSerializedSize;
        private int type_;
        private Object value_;

        public static Barcode getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(Barcode barcode)
        {
            return defaultInstance.toBuilder().mergeFrom(barcode);
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
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static Barcode parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new Barcode(codedinputstream, extensionregistrylite);
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
            defaultInstance = new Barcode(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Barcode, new com.google.protobuf.GeneratedMessageLite.PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$7702(Barcode barcode, UnknownFieldSetLite unknownfieldsetlite)
        {
            barcode.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/



/*
        static Object access$7802(Barcode barcode, Object obj)
        {
            barcode.value_ = obj;
            return obj;
        }

*/


/*
        static int access$7902(Barcode barcode, int i)
        {
            barcode.type_ = i;
            return i;
        }

*/


/*
        static int access$8002(Barcode barcode, int i)
        {
            barcode.bitField0_ = i;
            return i;
        }

*/


        private Barcode(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            memoizedSerializedSize = -1;
            value_ = "";
            type_ = 1;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L9:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 3: default 220
        //                       0: 223
        //                       10: 93
        //                       16: 143;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
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
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            i = codedinputstream.readEnum();
            if (Type.valueOf(i) == null)
            {
                builder.mergeVarintField(2, i);
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
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L9; else goto _L8
_L8:
        }

    }

    public static final class Barcode.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private int type_;
        private Object value_;

        public final Barcode buildPartial()
        {
            Barcode barcode = new Barcode(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final Barcode.Builder mergeFrom(Barcode barcode)
        {
            if (barcode == Barcode.getDefaultInstance())
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
            return mergeFrom((Barcode)generatedmessagelite);
        }

        public final Barcode.Builder setType(Barcode.Type type)
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

        public final Barcode.Builder setValue(String s)
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

        private Barcode.Builder()
        {
            super(Barcode.defaultInstance);
            value_ = "";
            type_ = 1;
        }

    }

    public static final class Barcode.Type extends Enum
    {

        private static final Barcode.Type $VALUES[];
        public static final Barcode.Type AZTEC;
        public static final Barcode.Type CODABAR;
        public static final Barcode.Type CODE_128;
        public static final Barcode.Type CODE_39;
        public static final Barcode.Type CODE_93;
        public static final Barcode.Type DATA_MATRIX;
        public static final Barcode.Type EAN_13;
        public static final Barcode.Type EAN_8;
        public static final Barcode.Type ITF_14;
        public static final Barcode.Type PDF_417;
        public static final Barcode.Type QR_CODE;
        public static final Barcode.Type UNKNOWN_FORMAT;
        public static final Barcode.Type UPC_A;
        public static final Barcode.Type UPC_E;
        public static final Barcode.Type UPC_EAN_EXTENSION;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static Barcode.Type valueOf(int i)
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

        public static Barcode.Type valueOf(String s)
        {
            return (Barcode.Type)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$Barcode$Type, s);
        }

        public static Barcode.Type[] values()
        {
            return (Barcode.Type[])$VALUES.clone();
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
            $VALUES = (new Barcode.Type[] {
                UNKNOWN_FORMAT, AZTEC, CODE_39, CODE_93, CODE_128, CODABAR, DATA_MATRIX, EAN_8, EAN_13, ITF_14, 
                PDF_417, QR_CODE, UPC_A, UPC_E, UPC_EAN_EXTENSION
            });
        }

        private Barcode.Type(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class FieldType extends Enum
    {

        private static final FieldType $VALUES[];
        public static final FieldType DEFAULT_FIELD_TYPE;
        public static final FieldType GIFT_CARD_EVENT_NUMBER;
        public static final FieldType GIFT_CARD_MERCHANT_NAME;
        public static final FieldType GIFT_CARD_NUMBER;
        public static final FieldType GIFT_CARD_PIN;
        public static final FieldType LOYALTY_ACCOUNT_ID;
        public static final FieldType LOYALTY_MERCHANT_NAME;
        public static final FieldType LOYALTY_PROGRAM_NAME;
        public static final FieldType US_LICENSE_ADDRESS_CITY;
        public static final FieldType US_LICENSE_ADDRESS_LINE_0;
        public static final FieldType US_LICENSE_ADDRESS_LINE_1;
        public static final FieldType US_LICENSE_ADDRESS_STATE;
        public static final FieldType US_LICENSE_ADDRESS_ZIP;
        public static final FieldType US_LICENSE_DOB;
        public static final FieldType US_LICENSE_EXPIRATION_DATE;
        public static final FieldType US_LICENSE_FAMILY_NAME;
        public static final FieldType US_LICENSE_GIVEN_NAME;
        public static final FieldType US_LICENSE_ID;
        public static final FieldType US_LICENSE_ISSUE_DATE;
        public static final FieldType US_LICENSE_NAME;
        public static final FieldType US_LICENSE_NAME_SUFFIX;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static FieldType valueOf(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 0: // '\0'
                return DEFAULT_FIELD_TYPE;

            case 100: // 'd'
                return LOYALTY_ACCOUNT_ID;

            case 101: // 'e'
                return LOYALTY_MERCHANT_NAME;

            case 102: // 'f'
                return LOYALTY_PROGRAM_NAME;

            case 200: 
                return GIFT_CARD_NUMBER;

            case 201: 
                return GIFT_CARD_PIN;

            case 202: 
                return GIFT_CARD_EVENT_NUMBER;

            case 203: 
                return GIFT_CARD_MERCHANT_NAME;

            case 402: 
                return US_LICENSE_EXPIRATION_DATE;

            case 403: 
                return US_LICENSE_ID;

            case 404: 
                return US_LICENSE_DOB;

            case 406: 
                return US_LICENSE_ISSUE_DATE;

            case 408: 
                return US_LICENSE_ADDRESS_CITY;

            case 409: 
                return US_LICENSE_ADDRESS_LINE_0;

            case 410: 
                return US_LICENSE_ADDRESS_LINE_1;

            case 411: 
                return US_LICENSE_ADDRESS_STATE;

            case 412: 
                return US_LICENSE_ADDRESS_ZIP;

            case 413: 
                return US_LICENSE_FAMILY_NAME;

            case 414: 
                return US_LICENSE_GIVEN_NAME;

            case 415: 
                return US_LICENSE_NAME_SUFFIX;

            case 416: 
                return US_LICENSE_NAME;
            }
        }

        public static FieldType valueOf(String s)
        {
            return (FieldType)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$FieldType, s);
        }

        public static FieldType[] values()
        {
            return (FieldType[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            DEFAULT_FIELD_TYPE = new FieldType("DEFAULT_FIELD_TYPE", 0, 0, 0);
            LOYALTY_ACCOUNT_ID = new FieldType("LOYALTY_ACCOUNT_ID", 1, 1, 100);
            LOYALTY_MERCHANT_NAME = new FieldType("LOYALTY_MERCHANT_NAME", 2, 2, 101);
            LOYALTY_PROGRAM_NAME = new FieldType("LOYALTY_PROGRAM_NAME", 3, 3, 102);
            GIFT_CARD_NUMBER = new FieldType("GIFT_CARD_NUMBER", 4, 4, 200);
            GIFT_CARD_PIN = new FieldType("GIFT_CARD_PIN", 5, 5, 201);
            GIFT_CARD_EVENT_NUMBER = new FieldType("GIFT_CARD_EVENT_NUMBER", 6, 6, 202);
            GIFT_CARD_MERCHANT_NAME = new FieldType("GIFT_CARD_MERCHANT_NAME", 7, 7, 203);
            US_LICENSE_EXPIRATION_DATE = new FieldType("US_LICENSE_EXPIRATION_DATE", 8, 8, 402);
            US_LICENSE_ID = new FieldType("US_LICENSE_ID", 9, 9, 403);
            US_LICENSE_DOB = new FieldType("US_LICENSE_DOB", 10, 10, 404);
            US_LICENSE_ISSUE_DATE = new FieldType("US_LICENSE_ISSUE_DATE", 11, 11, 406);
            US_LICENSE_ADDRESS_CITY = new FieldType("US_LICENSE_ADDRESS_CITY", 12, 12, 408);
            US_LICENSE_ADDRESS_LINE_0 = new FieldType("US_LICENSE_ADDRESS_LINE_0", 13, 13, 409);
            US_LICENSE_ADDRESS_LINE_1 = new FieldType("US_LICENSE_ADDRESS_LINE_1", 14, 14, 410);
            US_LICENSE_ADDRESS_STATE = new FieldType("US_LICENSE_ADDRESS_STATE", 15, 15, 411);
            US_LICENSE_ADDRESS_ZIP = new FieldType("US_LICENSE_ADDRESS_ZIP", 16, 16, 412);
            US_LICENSE_FAMILY_NAME = new FieldType("US_LICENSE_FAMILY_NAME", 17, 17, 413);
            US_LICENSE_GIVEN_NAME = new FieldType("US_LICENSE_GIVEN_NAME", 18, 18, 414);
            US_LICENSE_NAME_SUFFIX = new FieldType("US_LICENSE_NAME_SUFFIX", 19, 19, 415);
            US_LICENSE_NAME = new FieldType("US_LICENSE_NAME", 20, 20, 416);
            $VALUES = (new FieldType[] {
                DEFAULT_FIELD_TYPE, LOYALTY_ACCOUNT_ID, LOYALTY_MERCHANT_NAME, LOYALTY_PROGRAM_NAME, GIFT_CARD_NUMBER, GIFT_CARD_PIN, GIFT_CARD_EVENT_NUMBER, GIFT_CARD_MERCHANT_NAME, US_LICENSE_EXPIRATION_DATE, US_LICENSE_ID, 
                US_LICENSE_DOB, US_LICENSE_ISSUE_DATE, US_LICENSE_ADDRESS_CITY, US_LICENSE_ADDRESS_LINE_0, US_LICENSE_ADDRESS_LINE_1, US_LICENSE_ADDRESS_STATE, US_LICENSE_ADDRESS_ZIP, US_LICENSE_FAMILY_NAME, US_LICENSE_GIVEN_NAME, US_LICENSE_NAME_SUFFIX, 
                US_LICENSE_NAME
            });
        }

        private FieldType(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class Image extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final Image defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private int format_;
        private ByteString image_;
        private int memoizedSerializedSize;

        public static Image getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(Image image)
        {
            return defaultInstance.toBuilder().mergeFrom(image);
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
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static Image parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new Image(codedinputstream, extensionregistrylite);
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
            defaultInstance = new Image(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Image, new PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$6002(Image image, UnknownFieldSetLite unknownfieldsetlite)
        {
            image.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static ByteString access$6102(Image image, ByteString bytestring)
        {
            image.image_ = bytestring;
            return bytestring;
        }

*/


/*
        static int access$6202(Image image, int i)
        {
            image.format_ = i;
            return i;
        }

*/


/*
        static int access$6302(Image image, int i)
        {
            image.bitField0_ = i;
            return i;
        }

*/


        private Image(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            memoizedSerializedSize = -1;
            image_ = ByteString.EMPTY;
            format_ = 1;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L9:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 3: default 216
        //                       0: 219
        //                       10: 93
        //                       16: 139;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
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
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            i = codedinputstream.readEnum();
            if (ImageFormat.valueOf(i) == null)
            {
                builder.mergeVarintField(2, i);
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
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L9; else goto _L8
_L8:
        }

    }

    public static final class Image.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private int format_;
        private ByteString image_;

        private Image.Builder setFormat(Image.ImageFormat imageformat)
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

        public final Image buildPartial()
        {
            Image image = new Image(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final Image.Builder mergeFrom(Image image)
        {
            if (image == Image.getDefaultInstance())
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
            return mergeFrom((Image)generatedmessagelite);
        }

        public final Image.Builder setImage(ByteString bytestring)
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

        private Image.Builder()
        {
            super(Image.defaultInstance);
            image_ = ByteString.EMPTY;
            format_ = 1;
        }

    }

    public static final class Image.ImageFormat extends Enum
    {

        private static final Image.ImageFormat $VALUES[];
        public static final Image.ImageFormat JPEG;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static Image.ImageFormat valueOf(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 1: // '\001'
                return JPEG;
            }
        }

        public static Image.ImageFormat valueOf(String s)
        {
            return (Image.ImageFormat)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$Image$ImageFormat, s);
        }

        public static Image.ImageFormat[] values()
        {
            return (Image.ImageFormat[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            JPEG = new ImageFormat("JPEG", 0, 0, 1);
            $VALUES = (new Image.ImageFormat[] {
                JPEG
            });
        }

        private Image.ImageFormat(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class Path extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final com.google.protobuf.Internal.ListAdapter.Converter constraint_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter() {

            private static Path.Constraint convert(Integer integer)
            {
                Path.Constraint constraint = Path.Constraint.valueOf(integer.intValue());
                integer = constraint;
                if (constraint == null)
                {
                    integer = Path.Constraint.CONSTRAINT_BOX;
                }
                return integer;
            }

            public final volatile Object convert(Object obj)
            {
                return convert((Integer)obj);
            }

        };
        private static final Path defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private List constraint_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List pathComponent_;
        private Point startPoint_;

        public static Path getDefaultInstance()
        {
            return defaultInstance;
        }

        private PathComponent getPathComponent(int i)
        {
            return (PathComponent)pathComponent_.get(i);
        }

        private int getPathComponentCount()
        {
            return pathComponent_.size();
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(Path path)
        {
            return defaultInstance.toBuilder().mergeFrom(path);
        }

        public final Point getStartPoint()
        {
            if (startPoint_ == null)
            {
                return Point.getDefaultInstance();
            } else
            {
                return startPoint_;
            }
        }

        public final boolean hasStartPoint()
        {
            return (bitField0_ & 1) == 1;
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
            if (hasStartPoint() && !getStartPoint().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getPathComponentCount(); i++)
            {
                if (!getPathComponent(i).isInitialized())
                {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }

            memoizedIsInitialized = 1;
            return true;
        }

        public final Builder toBuilder()
        {
            if (this == defaultInstance)
            {
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static Path parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new Path(codedinputstream, extensionregistrylite);
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
            defaultInstance = new Path(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Path, new PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$5002(Path path, UnknownFieldSetLite unknownfieldsetlite)
        {
            path.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static Point access$5102(Path path, Point point)
        {
            path.startPoint_ = point;
            return point;
        }

*/



/*
        static List access$5202(Path path, List list)
        {
            path.pathComponent_ = list;
            return list;
        }

*/



/*
        static List access$5302(Path path, List list)
        {
            path.constraint_ = list;
            return list;
        }

*/


/*
        static int access$5402(Path path, int i)
        {
            path.bitField0_ = i;
            return i;
        }

*/


        private Path(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder1;
            int i;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            pathComponent_ = Collections.emptyList();
            constraint_ = Collections.emptyList();
            i = 0;
            builder1 = UnknownFieldSetLite.newBuilder();
            flag = false;
_L26:
            if (flag) goto _L2; else goto _L1
_L1:
            int j;
            int k;
            int l;
            k = i;
            j = i;
            l = i;
            int i1 = codedinputstream.readTag();
            i1;
            JVM INSTR lookupswitch 5: default 845
        //                       0: 848
        //                       10: 146
        //                       18: 355
        //                       24: 461
        //                       26: 598;
               goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
            k = i;
            j = i;
            l = i;
            if (!parseUnknownField(codedinputstream, builder1, extensionregistrylite, i1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            Point.Builder builder;
            builder = null;
            k = i;
            j = i;
            l = i;
            if ((bitField0_ & 1) != 1) goto _L10; else goto _L9
_L9:
            k = i;
            j = i;
            l = i;
            builder = startPoint_.toBuilder();
_L10:
            k = i;
            j = i;
            l = i;
            startPoint_ = (Point)codedinputstream.readMessage(Point.PARSER, extensionregistrylite);
            if (builder == null) goto _L12; else goto _L11
_L11:
            k = i;
            j = i;
            l = i;
            builder.mergeFrom(startPoint_);
            k = i;
            j = i;
            l = i;
            startPoint_ = builder.buildPartial();
_L12:
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 1;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            j = k;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            if ((j & 2) == 2)
            {
                pathComponent_ = Collections.unmodifiableList(pathComponent_);
            }
            if ((j & 4) == 4)
            {
                constraint_ = Collections.unmodifiableList(constraint_);
            }
            unknownFields = builder1.build();
            throw codedinputstream;
_L6:
            i1 = i;
            if ((i & 2) == 2) goto _L14; else goto _L13
_L13:
            k = i;
            j = i;
            l = i;
            pathComponent_ = new ArrayList();
            i1 = i | 2;
_L14:
            k = i1;
            j = i1;
            l = i1;
            pathComponent_.add(codedinputstream.readMessage(PathComponent.PARSER, extensionregistrylite));
            i = i1;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            j = l;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
            k = i;
            j = i;
            l = i;
            int j1 = codedinputstream.readEnum();
            k = i;
            j = i;
            l = i;
            if (Constraint.valueOf(j1) != null) goto _L16; else goto _L15
_L15:
            k = i;
            j = i;
            l = i;
            builder1.mergeVarintField(3, j1);
            continue; /* Loop/switch isn't completed */
_L16:
            i1 = i;
            if ((i & 4) == 4) goto _L18; else goto _L17
_L17:
            k = i;
            j = i;
            l = i;
            constraint_ = new ArrayList();
            i1 = i | 4;
_L18:
            k = i1;
            j = i1;
            l = i1;
            constraint_.add(Integer.valueOf(j1));
            i = i1;
            continue; /* Loop/switch isn't completed */
_L8:
            k = i;
            j = i;
            l = i;
            j1 = codedinputstream.pushLimit(codedinputstream.readRawVarint32());
_L24:
            k = i;
            j = i;
            l = i;
            if (codedinputstream.getBytesUntilLimit() <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            k = i;
            j = i;
            l = i;
            int k1 = codedinputstream.readEnum();
            k = i;
            j = i;
            l = i;
            if (Constraint.valueOf(k1) != null) goto _L20; else goto _L19
_L19:
            k = i;
            j = i;
            l = i;
            builder1.mergeVarintField(3, k1);
            continue; /* Loop/switch isn't completed */
_L20:
            i1 = i;
            if ((i & 4) == 4) goto _L22; else goto _L21
_L21:
            k = i;
            j = i;
            l = i;
            constraint_ = new ArrayList();
            i1 = i | 4;
_L22:
            k = i1;
            j = i1;
            l = i1;
            constraint_.add(Integer.valueOf(k1));
            i = i1;
            if (true) goto _L24; else goto _L23
_L23:
            k = i;
            j = i;
            l = i;
            codedinputstream.popLimit(j1);
            continue; /* Loop/switch isn't completed */
_L2:
            if ((i & 2) == 2)
            {
                pathComponent_ = Collections.unmodifiableList(pathComponent_);
            }
            if ((i & 4) == 4)
            {
                constraint_ = Collections.unmodifiableList(constraint_);
            }
            unknownFields = builder1.build();
            return;
_L4:
            flag = true;
            if (true) goto _L26; else goto _L25
_L25:
        }

    }

    public static final class Path.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private List constraint_;
        private List pathComponent_;
        private Path.Point startPoint_;

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

        private Path.Builder mergeStartPoint(Path.Point point)
        {
            if ((bitField0_ & 1) == 1 && startPoint_ != null && startPoint_ != Path.Point.getDefaultInstance())
            {
                startPoint_ = Path.Point.newBuilder(startPoint_).mergeFrom(point).buildPartial();
            } else
            {
                startPoint_ = point;
            }
            bitField0_ = bitField0_ | 1;
            return this;
        }

        public final Path.Builder addConstraint(Path.Constraint constraint)
        {
            if (constraint == null)
            {
                throw new NullPointerException();
            } else
            {
                ensureConstraintIsMutable();
                constraint_.add(Integer.valueOf(constraint.getNumber()));
                return this;
            }
        }

        public final Path.Builder addPathComponent(Path.PathComponent pathcomponent)
        {
            if (pathcomponent == null)
            {
                throw new NullPointerException();
            } else
            {
                ensurePathComponentIsMutable();
                pathComponent_.add(pathcomponent);
                return this;
            }
        }

        public final Path buildPartial()
        {
            Path path = new Path(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            path.unknownFields._fld5500 = <no variable>;
            int j = bitField0_;
            int i = 0;
            if ((j & 1) == 1)
            {
                i = 1;
            }
            path.startPoint_ = startPoint_;
            if ((bitField0_ & 2) == 2)
            {
                pathComponent_ = Collections.unmodifiableList(pathComponent_);
                bitField0_ = bitField0_ & -3;
            }
            path.pathComponent_ = pathComponent_;
            if ((bitField0_ & 4) == 4)
            {
                constraint_ = Collections.unmodifiableList(constraint_);
                bitField0_ = bitField0_ & -5;
            }
            path.constraint_ = constraint_;
            path.bitField0_ = i;
            return path;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final Path.Builder mergeFrom(Path path)
        {
            if (path == Path.getDefaultInstance())
            {
                return this;
            }
            if (path.hasStartPoint())
            {
                mergeStartPoint(path.getStartPoint());
            }
            if (!path.pathComponent_.isEmpty())
            {
                if (pathComponent_.isEmpty())
                {
                    pathComponent_ = path.pathComponent_;
                    bitField0_ = bitField0_ & -3;
                } else
                {
                    ensurePathComponentIsMutable();
                    pathComponent_.addAll(path.pathComponent_);
                }
            }
            if (!path.constraint_.isEmpty())
            {
                if (constraint_.isEmpty())
                {
                    constraint_ = path.constraint_;
                    bitField0_ = bitField0_ & -5;
                } else
                {
                    ensureConstraintIsMutable();
                    constraint_.addAll(path.constraint_);
                }
            }
            mergeUnknownFields(path._fld5500);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((Path)generatedmessagelite);
        }

        public final Path.Builder setStartPoint(Path.Point point)
        {
            if (point == null)
            {
                throw new NullPointerException();
            } else
            {
                startPoint_ = point;
                bitField0_ = bitField0_ | 1;
                return this;
            }
        }

        private Path.Builder()
        {
            super(Path.defaultInstance);
            startPoint_ = null;
            pathComponent_ = Collections.emptyList();
            constraint_ = Collections.emptyList();
        }

    }

    public static final class Path.Constraint extends Enum
    {

        private static final Path.Constraint $VALUES[];
        public static final Path.Constraint CONSTRAINT_BOX;
        public static final Path.Constraint CONSTRAINT_LINEAR;
        public static final Path.Constraint CONSTRAINT_QUADRATIC;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static Path.Constraint valueOf(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 1: // '\001'
                return CONSTRAINT_BOX;

            case 2: // '\002'
                return CONSTRAINT_LINEAR;

            case 3: // '\003'
                return CONSTRAINT_QUADRATIC;
            }
        }

        public static Path.Constraint valueOf(String s)
        {
            return (Path.Constraint)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$Path$Constraint, s);
        }

        public static Path.Constraint[] values()
        {
            return (Path.Constraint[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            CONSTRAINT_BOX = new Path.Constraint("CONSTRAINT_BOX", 0, 0, 1);
            CONSTRAINT_LINEAR = new Path.Constraint("CONSTRAINT_LINEAR", 1, 1, 2);
            CONSTRAINT_QUADRATIC = new Path.Constraint("CONSTRAINT_QUADRATIC", 2, 2, 3);
            $VALUES = (new Path.Constraint[] {
                CONSTRAINT_BOX, CONSTRAINT_LINEAR, CONSTRAINT_QUADRATIC
            });
        }

        private Path.Constraint(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class Path.PathComponent extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final Path.PathComponent defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private Path.Point endPoint_;
        private Path.Point firstControlPoint_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Path.Point secondControlPoint_;

        public static Path.PathComponent getDefaultInstance()
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
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final Path.Point getEndPoint()
        {
            if (endPoint_ == null)
            {
                return Path.Point.getDefaultInstance();
            } else
            {
                return endPoint_;
            }
        }

        public final Path.Point getFirstControlPoint()
        {
            if (firstControlPoint_ == null)
            {
                return Path.Point.getDefaultInstance();
            } else
            {
                return firstControlPoint_;
            }
        }

        public final Path.Point getSecondControlPoint()
        {
            if (secondControlPoint_ == null)
            {
                return Path.Point.getDefaultInstance();
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
            if (hasEndPoint() && !getEndPoint().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            if (hasFirstControlPoint() && !getFirstControlPoint().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            if (hasSecondControlPoint() && !getSecondControlPoint().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            } else
            {
                memoizedIsInitialized = 1;
                return true;
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static Path.PathComponent parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new Path.PathComponent(codedinputstream, extensionregistrylite);
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
            defaultInstance = new Path.PathComponent(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Path$PathComponent, new com.google.protobuf.GeneratedMessageLite.PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$3402(Path.PathComponent pathcomponent, UnknownFieldSetLite unknownfieldsetlite)
        {
            pathcomponent.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static Path.Point access$3502(Path.PathComponent pathcomponent, Path.Point point)
        {
            pathcomponent.endPoint_ = point;
            return point;
        }

*/


/*
        static Path.Point access$3602(Path.PathComponent pathcomponent, Path.Point point)
        {
            pathcomponent.firstControlPoint_ = point;
            return point;
        }

*/


/*
        static Path.Point access$3702(Path.PathComponent pathcomponent, Path.Point point)
        {
            pathcomponent.secondControlPoint_ = point;
            return point;
        }

*/


/*
        static int access$3802(Path.PathComponent pathcomponent, int i)
        {
            pathcomponent.bitField0_ = i;
            return i;
        }

*/


        private Path.PathComponent(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder1;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            builder1 = UnknownFieldSetLite.newBuilder();
            flag = false;
_L15:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 4: default 361
        //                       0: 364
        //                       10: 94
        //                       18: 189
        //                       26: 282;
               goto _L3 _L4 _L5 _L6 _L7
_L3:
            if (!parseUnknownField(codedinputstream, builder1, extensionregistrylite, i))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            Path.Point.Builder builder = null;
            if ((bitField0_ & 1) == 1)
            {
                builder = endPoint_.toBuilder();
            }
            endPoint_ = (Path.Point)codedinputstream.readMessage(Path.Point.PARSER, extensionregistrylite);
            if (builder == null) goto _L9; else goto _L8
_L8:
            builder.mergeFrom(endPoint_);
            endPoint_ = builder.buildPartial();
_L9:
            bitField0_ = bitField0_ | 1;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            unknownFields = builder1.build();
            throw codedinputstream;
_L6:
            builder = null;
            if ((bitField0_ & 2) == 2)
            {
                builder = firstControlPoint_.toBuilder();
            }
            firstControlPoint_ = (Path.Point)codedinputstream.readMessage(Path.Point.PARSER, extensionregistrylite);
            if (builder == null) goto _L11; else goto _L10
_L10:
            builder.mergeFrom(firstControlPoint_);
            firstControlPoint_ = builder.buildPartial();
_L11:
            bitField0_ = bitField0_ | 2;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
            builder = null;
            if ((bitField0_ & 4) == 4)
            {
                builder = secondControlPoint_.toBuilder();
            }
            secondControlPoint_ = (Path.Point)codedinputstream.readMessage(Path.Point.PARSER, extensionregistrylite);
            if (builder == null) goto _L13; else goto _L12
_L12:
            builder.mergeFrom(secondControlPoint_);
            secondControlPoint_ = builder.buildPartial();
_L13:
            bitField0_ = bitField0_ | 4;
            continue; /* Loop/switch isn't completed */
_L2:
            unknownFields = builder1.build();
            return;
_L4:
            flag = true;
            if (true) goto _L15; else goto _L14
_L14:
        }

    }

    public static final class Path.PathComponent.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private Path.Point endPoint_;
        private Path.Point firstControlPoint_;
        private Path.Point secondControlPoint_;

        private Path.PathComponent buildPartial()
        {
            Path.PathComponent pathcomponent = new Path.PathComponent(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            
// JavaClassFileOutputException: get_constant: invalid tag

        private Path.PathComponent.Builder mergeEndPoint(Path.Point point)
        {
            if ((bitField0_ & 1) == 1 && endPoint_ != null && endPoint_ != Path.Point.getDefaultInstance())
            {
                endPoint_ = Path.Point.newBuilder(endPoint_).mergeFrom(point).buildPartial();
            } else
            {
                endPoint_ = point;
            }
            bitField0_ = bitField0_ | 1;
            return this;
        }

        private Path.PathComponent.Builder mergeFirstControlPoint(Path.Point point)
        {
            if ((bitField0_ & 2) == 2 && firstControlPoint_ != null && firstControlPoint_ != Path.Point.getDefaultInstance())
            {
                firstControlPoint_ = Path.Point.newBuilder(firstControlPoint_).mergeFrom(point).buildPartial();
            } else
            {
                firstControlPoint_ = point;
            }
            bitField0_ = bitField0_ | 2;
            return this;
        }

        private Path.PathComponent.Builder mergeSecondControlPoint(Path.Point point)
        {
            if ((bitField0_ & 4) == 4 && secondControlPoint_ != null && secondControlPoint_ != Path.Point.getDefaultInstance())
            {
                secondControlPoint_ = Path.Point.newBuilder(secondControlPoint_).mergeFrom(point).buildPartial();
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

        public final Path.PathComponent.Builder mergeFrom(Path.PathComponent pathcomponent)
        {
            if (pathcomponent == Path.PathComponent.getDefaultInstance())
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
            return mergeFrom((Path.PathComponent)generatedmessagelite);
        }

        public final Path.PathComponent.Builder setEndPoint(Path.Point point)
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

        private Path.PathComponent.Builder()
        {
            super(Path.PathComponent.defaultInstance);
            endPoint_ = null;
            firstControlPoint_ = null;
            secondControlPoint_ = null;
        }

    }

    public static final class Path.Point extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final Path.Point defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int x_;
        private int y_;

        public static Path.Point getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(Path.Point point)
        {
            return defaultInstance.toBuilder().mergeFrom(point);
        }

        public final int getX()
        {
            return x_;
        }

        public final int getY()
        {
            return y_;
        }

        public final boolean hasX()
        {
            return (bitField0_ & 1) == 1;
        }

        public final boolean hasY()
        {
            return (bitField0_ & 2) == 2;
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
            if (!hasX())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasY())
            {
                memoizedIsInitialized = 0;
                return false;
            } else
            {
                memoizedIsInitialized = 1;
                return true;
            }
        }

        public final Builder toBuilder()
        {
            if (this == defaultInstance)
            {
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static Path.Point parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new Point(codedinputstream, extensionregistrylite);
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
            defaultInstance = new Point(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Path$Point, new PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$4302(Path.Point point, UnknownFieldSetLite unknownfieldsetlite)
        {
            point.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static int access$4402(Path.Point point, int i)
        {
            point.x_ = i;
            return i;
        }

*/


/*
        static int access$4502(Path.Point point, int i)
        {
            point.y_ = i;
            return i;
        }

*/


/*
        static int access$4602(Path.Point point, int i)
        {
            point.bitField0_ = i;
            return i;
        }

*/


        private Path.Point(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            x_ = 0;
            y_ = 0;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L8:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 3: default 197
        //                       0: 200
        //                       8: 97
        //                       16: 143;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            bitField0_ = bitField0_ | 1;
            x_ = codedinputstream.readInt32();
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            bitField0_ = bitField0_ | 2;
            y_ = codedinputstream.readInt32();
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L2:
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L8; else goto _L7
_L7:
        }

    }

    public static final class RecognizedBarcode extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final RecognizedBarcode defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private List attribution_;
        private RecognizedText barcodeText_;
        private int bitField0_;
        private Path bounds_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private float score_;
        private Barcode value_;

        public static RecognizedBarcode getDefaultInstance()
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
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final RecognizedText getBarcodeText()
        {
            if (barcodeText_ == null)
            {
                return RecognizedText.getDefaultInstance();
            } else
            {
                return barcodeText_;
            }
        }

        public final Path getBounds()
        {
            if (bounds_ == null)
            {
                return Path.getDefaultInstance();
            } else
            {
                return bounds_;
            }
        }

        public final float getScore()
        {
            return score_;
        }

        public final Barcode getValue()
        {
            if (value_ == null)
            {
                return Barcode.getDefaultInstance();
            } else
            {
                return value_;
            }
        }

        public final boolean hasBarcodeText()
        {
            return (bitField0_ & 2) == 2;
        }

        public final boolean hasBounds()
        {
            return (bitField0_ & 8) == 8;
        }

        public final boolean hasScore()
        {
            return (bitField0_ & 4) == 4;
        }

        public final boolean hasValue()
        {
            return (bitField0_ & 1) == 1;
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
            if (hasBarcodeText() && !getBarcodeText().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            if (hasBounds() && !getBounds().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            } else
            {
                memoizedIsInitialized = 1;
                return true;
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static RecognizedBarcode parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new RecognizedBarcode(codedinputstream, extensionregistrylite);
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
            defaultInstance = new RecognizedBarcode(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$RecognizedBarcode, new PrototypeHolder(defaultInstance, PARSER));
        }




/*
        static UnknownFieldSetLite access$302(RecognizedBarcode recognizedbarcode, UnknownFieldSetLite unknownfieldsetlite)
        {
            recognizedbarcode.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static Barcode access$402(RecognizedBarcode recognizedbarcode, Barcode barcode)
        {
            recognizedbarcode.value_ = barcode;
            return barcode;
        }

*/


/*
        static RecognizedText access$502(RecognizedBarcode recognizedbarcode, RecognizedText recognizedtext)
        {
            recognizedbarcode.barcodeText_ = recognizedtext;
            return recognizedtext;
        }

*/


/*
        static float access$602(RecognizedBarcode recognizedbarcode, float f)
        {
            recognizedbarcode.score_ = f;
            return f;
        }

*/



/*
        static List access$702(RecognizedBarcode recognizedbarcode, List list)
        {
            recognizedbarcode.attribution_ = list;
            return list;
        }

*/


/*
        static Path access$802(RecognizedBarcode recognizedbarcode, Path path)
        {
            recognizedbarcode.bounds_ = path;
            return path;
        }

*/


/*
        static int access$902(RecognizedBarcode recognizedbarcode, int i)
        {
            recognizedbarcode.bitField0_ = i;
            return i;
        }

*/

        private RecognizedBarcode(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            int i;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            score_ = 0.0F;
            attribution_ = Collections.emptyList();
            i = 0;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L25:
            if (flag) goto _L2; else goto _L1
_L1:
            int k;
            int l;
            int i1;
            l = i;
            k = i;
            i1 = i;
            int j = codedinputstream.readTag();
            j;
            JVM INSTR lookupswitch 6: default 812
        //                       0: 815
        //                       10: 150
        //                       29: 342
        //                       34: 415
        //                       42: 556
        //                       50: 637;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
            l = i;
            k = i;
            i1 = i;
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, j))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            Object obj;
            obj = null;
            l = i;
            k = i;
            i1 = i;
            if ((bitField0_ & 1) != 1) goto _L11; else goto _L10
_L10:
            l = i;
            k = i;
            i1 = i;
            obj = value_.toBuilder();
_L11:
            l = i;
            k = i;
            i1 = i;
            value_ = (Barcode)codedinputstream.readMessage(Barcode.PARSER, extensionregistrylite);
            if (obj == null) goto _L13; else goto _L12
_L12:
            l = i;
            k = i;
            i1 = i;
            ((Barcode.Builder) (obj)).mergeFrom(value_);
            l = i;
            k = i;
            i1 = i;
            value_ = ((Barcode.Builder) (obj)).buildPartial();
_L13:
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 1;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            k = l;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            if ((k & 8) == 8)
            {
                attribution_ = Collections.unmodifiableList(attribution_);
            }
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 4;
            l = i;
            k = i;
            i1 = i;
            score_ = codedinputstream.readFloat();
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            k = i1;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
            obj = null;
            l = i;
            k = i;
            i1 = i;
            if ((bitField0_ & 2) != 2) goto _L15; else goto _L14
_L14:
            l = i;
            k = i;
            i1 = i;
            obj = barcodeText_.toBuilder();
_L15:
            l = i;
            k = i;
            i1 = i;
            barcodeText_ = (RecognizedText)codedinputstream.readMessage(RecognizedText.PARSER, extensionregistrylite);
            if (obj == null) goto _L17; else goto _L16
_L16:
            l = i;
            k = i;
            i1 = i;
            ((RecognizedText.Builder) (obj)).mergeFrom(barcodeText_);
            l = i;
            k = i;
            i1 = i;
            barcodeText_ = ((RecognizedText.Builder) (obj)).buildPartial();
_L17:
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 2;
            continue; /* Loop/switch isn't completed */
_L8:
            j = i;
            if ((i & 8) == 8) goto _L19; else goto _L18
_L18:
            l = i;
            k = i;
            i1 = i;
            attribution_ = new ArrayList();
            j = i | 8;
_L19:
            l = j;
            k = j;
            i1 = j;
            attribution_.add(codedinputstream.readMessage(Attribution.PARSER, extensionregistrylite));
            i = j;
            continue; /* Loop/switch isn't completed */
_L9:
            obj = null;
            l = i;
            k = i;
            i1 = i;
            if ((bitField0_ & 8) != 8) goto _L21; else goto _L20
_L20:
            l = i;
            k = i;
            i1 = i;
            obj = bounds_.toBuilder();
_L21:
            l = i;
            k = i;
            i1 = i;
            bounds_ = (Path)codedinputstream.readMessage(Path.PARSER, extensionregistrylite);
            if (obj == null) goto _L23; else goto _L22
_L22:
            l = i;
            k = i;
            i1 = i;
            ((Path.Builder) (obj)).mergeFrom(bounds_);
            l = i;
            k = i;
            i1 = i;
            bounds_ = ((Path.Builder) (obj)).buildPartial();
_L23:
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 8;
            continue; /* Loop/switch isn't completed */
_L2:
            if ((i & 8) == 8)
            {
                attribution_ = Collections.unmodifiableList(attribution_);
            }
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L25; else goto _L24
_L24:
        }

    }

    public static final class RecognizedBarcode.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private List attribution_;
        private RecognizedText barcodeText_;
        private int bitField0_;
        private Path bounds_;
        private float score_;
        private Barcode value_;

        private RecognizedBarcode buildPartial()
        {
            RecognizedBarcode recognizedbarcode = new RecognizedBarcode(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            recognizedbarcode.unknownFields.getDefaultInstance = <no variable>;
            int k = bitField0_;
            int j = 0;
            if ((k & 1) == 1)
            {
                j = 1;
            }
            recognizedbarcode.value_ = value_;
            int i = j;
            if ((k & 2) == 2)
            {
                i = j | 2;
            }
            recognizedbarcode.barcodeText_ = barcodeText_;
            j = i;
            if ((k & 4) == 4)
            {
                j = i | 4;
            }
            recognizedbarcode.score_ = score_;
            if ((bitField0_ & 8) == 8)
            {
                attribution_ = Collections.unmodifiableList(attribution_);
                bitField0_ = bitField0_ & -9;
            }
            recognizedbarcode.attribution_ = attribution_;
            i = j;
            if ((k & 0x10) == 16)
            {
                i = j | 8;
            }
            recognizedbarcode.bounds_ = bounds_;
            recognizedbarcode.bitField0_ = i;
            return recognizedbarcode;
        }

        private void ensureAttributionIsMutable()
        {
            if ((bitField0_ & 8) != 8)
            {
                attribution_ = new ArrayList(attribution_);
                bitField0_ = bitField0_ | 8;
            }
        }

        private RecognizedBarcode.Builder mergeBarcodeText(RecognizedText recognizedtext)
        {
            if ((bitField0_ & 2) == 2 && barcodeText_ != null && barcodeText_ != RecognizedText.getDefaultInstance())
            {
                barcodeText_ = RecognizedText.newBuilder(barcodeText_).mergeFrom(recognizedtext).buildPartial();
            } else
            {
                barcodeText_ = recognizedtext;
            }
            bitField0_ = bitField0_ | 2;
            return this;
        }

        private RecognizedBarcode.Builder mergeBounds(Path path)
        {
            if ((bitField0_ & 0x10) == 16 && bounds_ != null && bounds_ != Path.getDefaultInstance())
            {
                bounds_ = Path.newBuilder(bounds_).mergeFrom(path).buildPartial();
            } else
            {
                bounds_ = path;
            }
            bitField0_ = bitField0_ | 0x10;
            return this;
        }

        private RecognizedBarcode.Builder mergeValue(Barcode barcode)
        {
            if ((bitField0_ & 1) == 1 && value_ != null && value_ != Barcode.getDefaultInstance())
            {
                value_ = Barcode.newBuilder(value_).mergeFrom(barcode).buildPartial();
            } else
            {
                value_ = barcode;
            }
            bitField0_ = bitField0_ | 1;
            return this;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final RecognizedBarcode.Builder mergeFrom(RecognizedBarcode recognizedbarcode)
        {
            if (recognizedbarcode == RecognizedBarcode.getDefaultInstance())
            {
                return this;
            }
            if (recognizedbarcode.hasValue())
            {
                mergeValue(recognizedbarcode.getValue());
            }
            if (recognizedbarcode.hasBarcodeText())
            {
                mergeBarcodeText(recognizedbarcode.getBarcodeText());
            }
            if (recognizedbarcode.hasScore())
            {
                setScore(recognizedbarcode.getScore());
            }
            if (!recognizedbarcode.attribution_.isEmpty())
            {
                if (attribution_.isEmpty())
                {
                    attribution_ = recognizedbarcode.attribution_;
                    bitField0_ = bitField0_ & -9;
                } else
                {
                    ensureAttributionIsMutable();
                    attribution_.addAll(recognizedbarcode.attribution_);
                }
            }
            if (recognizedbarcode.hasBounds())
            {
                mergeBounds(recognizedbarcode.getBounds());
            }
            mergeUnknownFields(((Barcode) (recognizedbarcode)).getDefaultInstance);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((RecognizedBarcode)generatedmessagelite);
        }

        public final RecognizedBarcode.Builder setBounds(Path.Builder builder)
        {
            bounds_ = (Path)builder.build();
            bitField0_ = bitField0_ | 0x10;
            return this;
        }

        public final RecognizedBarcode.Builder setScore(float f)
        {
            bitField0_ = bitField0_ | 4;
            score_ = f;
            return this;
        }

        public final RecognizedBarcode.Builder setValue(Barcode.Builder builder)
        {
            value_ = (Barcode)builder.build();
            bitField0_ = bitField0_ | 1;
            return this;
        }

        private RecognizedBarcode.Builder()
        {
            super(RecognizedBarcode.defaultInstance);
            value_ = null;
            barcodeText_ = null;
            attribution_ = Collections.emptyList();
            bounds_ = null;
        }

    }

    public static final class RecognizedText extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final RecognizedText defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private List attribution_;
        private int bitField0_;
        private Path bounds_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private float score_;
        private int type_;
        private Object value_;

        public static RecognizedText getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(RecognizedText recognizedtext)
        {
            return defaultInstance.toBuilder().mergeFrom(recognizedtext);
        }

        public final List getAttributionList()
        {
            return attribution_;
        }

        public final Path getBounds()
        {
            if (bounds_ == null)
            {
                return Path.getDefaultInstance();
            } else
            {
                return bounds_;
            }
        }

        public final float getScore()
        {
            return score_;
        }

        public final FieldType getType()
        {
            FieldType fieldtype1 = FieldType.valueOf(type_);
            FieldType fieldtype = fieldtype1;
            if (fieldtype1 == null)
            {
                fieldtype = FieldType.DEFAULT_FIELD_TYPE;
            }
            return fieldtype;
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

        public final boolean hasBounds()
        {
            return (bitField0_ & 8) == 8;
        }

        public final boolean hasScore()
        {
            return (bitField0_ & 2) == 2;
        }

        public final boolean hasType()
        {
            return (bitField0_ & 4) == 4;
        }

        public final boolean hasValue()
        {
            return (bitField0_ & 1) == 1;
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
            if (hasBounds() && !getBounds().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            } else
            {
                memoizedIsInitialized = 1;
                return true;
            }
        }

        public final Builder toBuilder()
        {
            if (this == defaultInstance)
            {
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static RecognizedText parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new RecognizedText(codedinputstream, extensionregistrylite);
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
            defaultInstance = new RecognizedText(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$RecognizedText, new com.google.protobuf.GeneratedMessageLite.PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$1402(RecognizedText recognizedtext, UnknownFieldSetLite unknownfieldsetlite)
        {
            recognizedtext.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/



/*
        static Object access$1502(RecognizedText recognizedtext, Object obj)
        {
            recognizedtext.value_ = obj;
            return obj;
        }

*/


/*
        static float access$1602(RecognizedText recognizedtext, float f)
        {
            recognizedtext.score_ = f;
            return f;
        }

*/



/*
        static List access$1702(RecognizedText recognizedtext, List list)
        {
            recognizedtext.attribution_ = list;
            return list;
        }

*/


/*
        static int access$1802(RecognizedText recognizedtext, int i)
        {
            recognizedtext.type_ = i;
            return i;
        }

*/


/*
        static Path access$1902(RecognizedText recognizedtext, Path path)
        {
            recognizedtext.bounds_ = path;
            return path;
        }

*/


/*
        static int access$2002(RecognizedText recognizedtext, int i)
        {
            recognizedtext.bitField0_ = i;
            return i;
        }

*/


        private RecognizedText(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            int i;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            value_ = "";
            score_ = 0.0F;
            attribution_ = Collections.emptyList();
            type_ = 0;
            i = 0;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L19:
            if (flag) goto _L2; else goto _L1
_L1:
            int k;
            int l;
            int i1;
            l = i;
            k = i;
            i1 = i;
            int j = codedinputstream.readTag();
            j;
            JVM INSTR lookupswitch 6: default 699
        //                       0: 702
        //                       10: 162
        //                       29: 270
        //                       34: 343
        //                       40: 421
        //                       50: 526;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
            l = i;
            k = i;
            i1 = i;
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, j))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            l = i;
            k = i;
            i1 = i;
            Object obj = codedinputstream.readString();
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 1;
            l = i;
            k = i;
            i1 = i;
            value_ = obj;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            k = l;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            if ((k & 4) == 4)
            {
                attribution_ = Collections.unmodifiableList(attribution_);
            }
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 2;
            l = i;
            k = i;
            i1 = i;
            score_ = codedinputstream.readFloat();
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            k = i1;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
            j = i;
            if ((i & 4) == 4) goto _L11; else goto _L10
_L10:
            l = i;
            k = i;
            i1 = i;
            attribution_ = new ArrayList();
            j = i | 4;
_L11:
            l = j;
            k = j;
            i1 = j;
            attribution_.add(codedinputstream.readMessage(Attribution.PARSER, extensionregistrylite));
            i = j;
            continue; /* Loop/switch isn't completed */
_L8:
            l = i;
            k = i;
            i1 = i;
            j = codedinputstream.readEnum();
            l = i;
            k = i;
            i1 = i;
            if (FieldType.valueOf(j) != null) goto _L13; else goto _L12
_L12:
            l = i;
            k = i;
            i1 = i;
            builder.mergeVarintField(5, j);
            continue; /* Loop/switch isn't completed */
_L13:
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 4;
            l = i;
            k = i;
            i1 = i;
            type_ = j;
            continue; /* Loop/switch isn't completed */
_L9:
            obj = null;
            l = i;
            k = i;
            i1 = i;
            if ((bitField0_ & 8) != 8) goto _L15; else goto _L14
_L14:
            l = i;
            k = i;
            i1 = i;
            obj = bounds_.toBuilder();
_L15:
            l = i;
            k = i;
            i1 = i;
            bounds_ = (Path)codedinputstream.readMessage(Path.PARSER, extensionregistrylite);
            if (obj == null) goto _L17; else goto _L16
_L16:
            l = i;
            k = i;
            i1 = i;
            ((Path.Builder) (obj)).mergeFrom(bounds_);
            l = i;
            k = i;
            i1 = i;
            bounds_ = ((Path.Builder) (obj)).buildPartial();
_L17:
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 8;
            continue; /* Loop/switch isn't completed */
_L2:
            if ((i & 4) == 4)
            {
                attribution_ = Collections.unmodifiableList(attribution_);
            }
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L19; else goto _L18
_L18:
        }

    }

    public static final class RecognizedText.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private List attribution_;
        private int bitField0_;
        private Path bounds_;
        private float score_;
        private int type_;
        private Object value_;

        private void ensureAttributionIsMutable()
        {
            if ((bitField0_ & 4) != 4)
            {
                attribution_ = new ArrayList(attribution_);
                bitField0_ = bitField0_ | 4;
            }
        }

        private RecognizedText.Builder mergeBounds(Path path)
        {
            if ((bitField0_ & 0x10) == 16 && bounds_ != null && bounds_ != Path.getDefaultInstance())
            {
                bounds_ = Path.newBuilder(bounds_).mergeFrom(path).buildPartial();
            } else
            {
                bounds_ = path;
            }
            bitField0_ = bitField0_ | 0x10;
            return this;
        }

        private RecognizedText.Builder setType(FieldType fieldtype)
        {
            if (fieldtype == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 8;
                type_ = fieldtype.getNumber();
                return this;
            }
        }

        public final RecognizedText.Builder addAllAttribution(Iterable iterable)
        {
            ensureAttributionIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, attribution_);
            return this;
        }

        public final RecognizedText buildPartial()
        {
            RecognizedText recognizedtext = new RecognizedText(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final RecognizedText.Builder mergeFrom(RecognizedText recognizedtext)
        {
            if (recognizedtext == RecognizedText.getDefaultInstance())
            {
                return this;
            }
            if (recognizedtext.hasValue())
            {
                bitField0_ = bitField0_ | 1;
                value_ = recognizedtext.value_;
            }
            if (recognizedtext.hasScore())
            {
                setScore(recognizedtext.getScore());
            }
            if (!recognizedtext.attribution_.isEmpty())
            {
                if (attribution_.isEmpty())
                {
                    attribution_ = recognizedtext.attribution_;
                    bitField0_ = bitField0_ & -5;
                } else
                {
                    ensureAttributionIsMutable();
                    attribution_.addAll(recognizedtext.attribution_);
                }
            }
            if (recognizedtext.hasType())
            {
                setType(recognizedtext.getType());
            }
            if (recognizedtext.hasBounds())
            {
                mergeBounds(recognizedtext.getBounds());
            }
            mergeUnknownFields(
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((RecognizedText)generatedmessagelite);
        }

        public final RecognizedText.Builder setScore(float f)
        {
            bitField0_ = bitField0_ | 2;
            score_ = f;
            return this;
        }

        public final RecognizedText.Builder setValue(String s)
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

        private RecognizedText.Builder()
        {
            super(RecognizedText.defaultInstance);
            value_ = "";
            attribution_ = Collections.emptyList();
            type_ = 0;
            bounds_ = null;
        }

    }

    public static final class ValidationResult extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final ValidationResult defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private int fieldType_;
        private int memoizedSerializedSize;
        private int outcome_;
        private int type_;

        public static ValidationResult getDefaultInstance()
        {
            return defaultInstance;
        }

        private Builder toBuilder()
        {
            if (this == defaultInstance)
            {
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final FieldType getFieldType()
        {
            FieldType fieldtype1 = FieldType.valueOf(fieldType_);
            FieldType fieldtype = fieldtype1;
            if (fieldtype1 == null)
            {
                fieldtype = FieldType.DEFAULT_FIELD_TYPE;
            }
            return fieldtype;
        }

        public final ValidationOutcome getOutcome()
        {
            ValidationOutcome validationoutcome1 = ValidationOutcome.valueOf(outcome_);
            ValidationOutcome validationoutcome = validationoutcome1;
            if (validationoutcome1 == null)
            {
                validationoutcome = ValidationOutcome.VALIDATION_OUTCOME_UNKNOWN;
            }
            return validationoutcome;
        }

        public final ValidationType getType()
        {
            ValidationType validationtype1 = ValidationType.valueOf(type_);
            ValidationType validationtype = validationtype1;
            if (validationtype1 == null)
            {
                validationtype = ValidationType.VALIDATION_TYPE_UNKNOWN;
            }
            return validationtype;
        }

        public final boolean hasFieldType()
        {
            return (bitField0_ & 4) == 4;
        }

        public final boolean hasOutcome()
        {
            return (bitField0_ & 2) == 2;
        }

        public final boolean hasType()
        {
            return (bitField0_ & 1) == 1;
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static ValidationResult parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new ValidationResult(codedinputstream, extensionregistrylite);
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
            defaultInstance = new ValidationResult(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$ValidationResult, new PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$6802(ValidationResult validationresult, UnknownFieldSetLite unknownfieldsetlite)
        {
            validationresult.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static int access$6902(ValidationResult validationresult, int i)
        {
            validationresult.type_ = i;
            return i;
        }

*/


/*
        static int access$7002(ValidationResult validationresult, int i)
        {
            validationresult.outcome_ = i;
            return i;
        }

*/


/*
        static int access$7102(ValidationResult validationresult, int i)
        {
            validationresult.fieldType_ = i;
            return i;
        }

*/


/*
        static int access$7202(ValidationResult validationresult, int i)
        {
            validationresult.bitField0_ = i;
            return i;
        }

*/


        private ValidationResult(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            memoizedSerializedSize = -1;
            type_ = 0;
            outcome_ = 0;
            fieldType_ = 0;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L10:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 4: default 295
        //                       0: 298
        //                       8: 105
        //                       16: 198
        //                       24: 242;
               goto _L3 _L4 _L5 _L6 _L7
_L3:
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            i = codedinputstream.readEnum();
            if (ValidationType.valueOf(i) == null)
            {
                builder.mergeVarintField(1, i);
                continue; /* Loop/switch isn't completed */
            }
              goto _L8
            codedinputstream;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            unknownFields = builder.build();
            throw codedinputstream;
_L8:
            bitField0_ = bitField0_ | 1;
            type_ = i;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L6:
            i = codedinputstream.readEnum();
            if (ValidationOutcome.valueOf(i) == null)
            {
                builder.mergeVarintField(2, i);
                continue; /* Loop/switch isn't completed */
            }
            bitField0_ = bitField0_ | 2;
            outcome_ = i;
            continue; /* Loop/switch isn't completed */
_L7:
            i = codedinputstream.readEnum();
            if (FieldType.valueOf(i) == null)
            {
                builder.mergeVarintField(3, i);
                continue; /* Loop/switch isn't completed */
            }
            bitField0_ = bitField0_ | 4;
            fieldType_ = i;
            continue; /* Loop/switch isn't completed */
_L2:
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L10; else goto _L9
_L9:
        }

    }

    public static final class ValidationResult.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private int fieldType_;
        private int outcome_;
        private int type_;

        private ValidationResult buildPartial()
        {
            ValidationResult validationresult = new ValidationResult(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            validationresult.unknownFields.setFieldType = <no variable>;
            int k = bitField0_;
            int j = 0;
            if ((k & 1) == 1)
            {
                j = 1;
            }
            validationresult.type_ = type_;
            int i = j;
            if ((k & 2) == 2)
            {
                i = j | 2;
            }
            validationresult.outcome_ = outcome_;
            j = i;
            if ((k & 4) == 4)
            {
                j = i | 4;
            }
            validationresult.fieldType_ = fieldType_;
            validationresult.bitField0_ = j;
            return validationresult;
        }

        private ValidationResult.Builder setFieldType(FieldType fieldtype)
        {
            if (fieldtype == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 4;
                fieldType_ = fieldtype.getNumber();
                return this;
            }
        }

        private ValidationResult.Builder setOutcome(ValidationResult.ValidationOutcome validationoutcome)
        {
            if (validationoutcome == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 2;
                outcome_ = validationoutcome.getNumber();
                return this;
            }
        }

        private ValidationResult.Builder setType(ValidationResult.ValidationType validationtype)
        {
            if (validationtype == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 1;
                type_ = validationtype.getNumber();
                return this;
            }
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final ValidationResult.Builder mergeFrom(ValidationResult validationresult)
        {
            if (validationresult == ValidationResult.getDefaultInstance())
            {
                return this;
            }
            if (validationresult.hasType())
            {
                setType(validationresult.getType());
            }
            if (validationresult.hasOutcome())
            {
                setOutcome(validationresult.getOutcome());
            }
            if (validationresult.hasFieldType())
            {
                setFieldType(validationresult.getFieldType());
            }
            mergeUnknownFields(((ValidationResult.Builder) (validationresult)).setFieldType);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((ValidationResult)generatedmessagelite);
        }

        private ValidationResult.Builder()
        {
            super(ValidationResult.defaultInstance);
            type_ = 0;
            outcome_ = 0;
            fieldType_ = 0;
        }

    }

    public static final class ValidationResult.ValidationOutcome extends Enum
    {

        private static final ValidationResult.ValidationOutcome $VALUES[];
        public static final ValidationResult.ValidationOutcome VALIDATION_OUTCOME_FAIL;
        public static final ValidationResult.ValidationOutcome VALIDATION_OUTCOME_INCONCLUSIVE;
        public static final ValidationResult.ValidationOutcome VALIDATION_OUTCOME_PASS;
        public static final ValidationResult.ValidationOutcome VALIDATION_OUTCOME_UNKNOWN;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static ValidationResult.ValidationOutcome valueOf(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 0: // '\0'
                return VALIDATION_OUTCOME_UNKNOWN;

            case 1: // '\001'
                return VALIDATION_OUTCOME_PASS;

            case 2: // '\002'
                return VALIDATION_OUTCOME_FAIL;

            case 3: // '\003'
                return VALIDATION_OUTCOME_INCONCLUSIVE;
            }
        }

        public static ValidationResult.ValidationOutcome valueOf(String s)
        {
            return (ValidationResult.ValidationOutcome)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$ValidationResult$ValidationOutcome, s);
        }

        public static ValidationResult.ValidationOutcome[] values()
        {
            return (ValidationResult.ValidationOutcome[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            VALIDATION_OUTCOME_UNKNOWN = new ValidationResult.ValidationOutcome("VALIDATION_OUTCOME_UNKNOWN", 0, 0, 0);
            VALIDATION_OUTCOME_PASS = new ValidationResult.ValidationOutcome("VALIDATION_OUTCOME_PASS", 1, 1, 1);
            VALIDATION_OUTCOME_FAIL = new ValidationResult.ValidationOutcome("VALIDATION_OUTCOME_FAIL", 2, 2, 2);
            VALIDATION_OUTCOME_INCONCLUSIVE = new ValidationResult.ValidationOutcome("VALIDATION_OUTCOME_INCONCLUSIVE", 3, 3, 3);
            $VALUES = (new ValidationResult.ValidationOutcome[] {
                VALIDATION_OUTCOME_UNKNOWN, VALIDATION_OUTCOME_PASS, VALIDATION_OUTCOME_FAIL, VALIDATION_OUTCOME_INCONCLUSIVE
            });
        }

        private ValidationResult.ValidationOutcome(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class ValidationResult.ValidationType extends Enum
    {

        private static final ValidationResult.ValidationType $VALUES[];
        public static final ValidationResult.ValidationType VALIDATION_TYPE_BARCODE_MATCHES_TEXT;
        public static final ValidationResult.ValidationType VALIDATION_TYPE_UNKNOWN;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static ValidationResult.ValidationType valueOf(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 0: // '\0'
                return VALIDATION_TYPE_UNKNOWN;

            case 1: // '\001'
                return VALIDATION_TYPE_BARCODE_MATCHES_TEXT;
            }
        }

        public static ValidationResult.ValidationType valueOf(String s)
        {
            return (ValidationResult.ValidationType)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$ValidationResult$ValidationType, s);
        }

        public static ValidationResult.ValidationType[] values()
        {
            return (ValidationResult.ValidationType[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            VALIDATION_TYPE_UNKNOWN = new ValidationResult.ValidationType("VALIDATION_TYPE_UNKNOWN", 0, 0, 0);
            VALIDATION_TYPE_BARCODE_MATCHES_TEXT = new ValidationResult.ValidationType("VALIDATION_TYPE_BARCODE_MATCHES_TEXT", 1, 1, 1);
            $VALUES = (new ValidationResult.ValidationType[] {
                VALIDATION_TYPE_UNKNOWN, VALIDATION_TYPE_BARCODE_MATCHES_TEXT
            });
        }

        private ValidationResult.ValidationType(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }

}
