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

// Referenced classes of package com.google.commerce.ocr.definitions:
//            GiftCardProto

public static final class <init> extends GeneratedMessageLite
{
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private ClassData classData_;
        private InstanceData instanceData_;

        private Builder mergeClassData(ClassData classdata)
        {
            if ((bitField0_ & 1) == 1 && classData_ != null && classData_ != ClassData.getDefaultInstance())
            {
                classData_ = ClassData.newBuilder(classData_).mergeFrom(classdata).buildPartial();
            } else
            {
                classData_ = classdata;
            }
            bitField0_ = bitField0_ | 1;
            return this;
        }

        private Builder mergeInstanceData(InstanceData instancedata)
        {
            if ((bitField0_ & 2) == 2 && instanceData_ != null && instanceData_ != InstanceData.getDefaultInstance())
            {
                instanceData_ = InstanceData.newBuilder(instanceData_).mergeFrom(instancedata).buildPartial();
            } else
            {
                instanceData_ = instancedata;
            }
            bitField0_ = bitField0_ | 2;
            return this;
        }

        public final GiftCardProto.GiftCardData buildPartial()
        {
            GiftCardProto.GiftCardData giftcarddata = new GiftCardProto.GiftCardData(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
            
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final Builder mergeFrom(GiftCardProto.GiftCardData giftcarddata)
        {
            if (giftcarddata == GiftCardProto.GiftCardData.getDefaultInstance())
            {
                return this;
            }
            if (giftcarddata.hasClassData())
            {
                mergeClassData(giftcarddata.getClassData());
            }
            if (giftcarddata.hasInstanceData())
            {
                mergeInstanceData(giftcarddata.getInstanceData());
            }
            mergeUnknownFields(
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((GiftCardProto.GiftCardData)generatedmessagelite);
        }

        public final Builder setClassData(ClassData.Builder builder)
        {
            classData_ = (ClassData)builder.build();
            bitField0_ = bitField0_ | 1;
            return this;
        }

        public final Builder setInstanceData(InstanceData.Builder builder)
        {
            instanceData_ = (InstanceData)builder.build();
            bitField0_ = bitField0_ | 2;
            return this;
        }

        private Builder()
        {
            super(GiftCardProto.GiftCardData.defaultInstance);
            classData_ = null;
            instanceData_ = null;
        }

        Builder(GiftCardProto._cls1 _pcls1)
        {
            this();
        }
    }

    public static final class ClassData extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final ClassData defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private List attribution_;
        private int bitField0_;
        private Object discoverableId_;
        private int memoizedSerializedSize;
        private Object merchantName_;
        private Object ocrSystemId_;
        private float score_;

        public static ClassData getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(ClassData classdata)
        {
            return defaultInstance.toBuilder().mergeFrom(classdata);
        }

        public final List getAttributionList()
        {
            return attribution_;
        }

        public final String getDiscoverableId()
        {
            Object obj = discoverableId_;
            if (obj instanceof String)
            {
                return (String)obj;
            }
            obj = (ByteString)obj;
            String s = ((ByteString) (obj)).toStringUtf8();
            if (((ByteString) (obj)).isValidUtf8())
            {
                discoverableId_ = s;
            }
            return s;
        }

        public final String getMerchantName()
        {
            Object obj = merchantName_;
            if (obj instanceof String)
            {
                return (String)obj;
            }
            obj = (ByteString)obj;
            String s = ((ByteString) (obj)).toStringUtf8();
            if (((ByteString) (obj)).isValidUtf8())
            {
                merchantName_ = s;
            }
            return s;
        }

        public final float getScore()
        {
            return score_;
        }

        public final boolean hasDiscoverableId()
        {
            return (bitField0_ & 8) == 8;
        }

        public final boolean hasMerchantName()
        {
            return (bitField0_ & 1) == 1;
        }

        public final boolean hasOcrSystemId()
        {
            return (bitField0_ & 2) == 2;
        }

        public final boolean hasScore()
        {
            return (bitField0_ & 4) == 4;
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

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static ClassData parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new ClassData(codedinputstream, extensionregistrylite, null);
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
            defaultInstance = new ClassData(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/GiftCardProto$GiftCardData$ClassData, new PrototypeHolder(defaultInstance, PARSER));
        }


/*
        static int access$1002(ClassData classdata, int i)
        {
            classdata.bitField0_ = i;
            return i;
        }

*/




/*
        static UnknownFieldSetLite access$402(ClassData classdata, UnknownFieldSetLite unknownfieldsetlite)
        {
            classdata.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/



/*
        static Object access$502(ClassData classdata, Object obj)
        {
            classdata.merchantName_ = obj;
            return obj;
        }

*/



/*
        static Object access$602(ClassData classdata, Object obj)
        {
            classdata.ocrSystemId_ = obj;
            return obj;
        }

*/


/*
        static float access$702(ClassData classdata, float f)
        {
            classdata.score_ = f;
            return f;
        }

*/



/*
        static List access$802(ClassData classdata, List list)
        {
            classdata.attribution_ = list;
            return list;
        }

*/



/*
        static Object access$902(ClassData classdata, Object obj)
        {
            classdata.discoverableId_ = obj;
            return obj;
        }

*/

        private ClassData(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            int i;
            boolean flag;
            memoizedSerializedSize = -1;
            merchantName_ = "";
            ocrSystemId_ = "";
            score_ = 0.0F;
            attribution_ = Collections.emptyList();
            discoverableId_ = "";
            i = 0;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L13:
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
            JVM INSTR lookupswitch 6: default 579
        //                       0: 582
        //                       10: 161
        //                       18: 272
        //                       29: 361
        //                       34: 406
        //                       42: 487;
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
            String s = codedinputstream.readString();
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 1;
            l = i;
            k = i;
            i1 = i;
            merchantName_ = s;
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
            s = codedinputstream.readString();
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 2;
            l = i;
            k = i;
            i1 = i;
            ocrSystemId_ = s;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            k = i1;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 4;
            l = i;
            k = i;
            i1 = i;
            score_ = codedinputstream.readFloat();
            continue; /* Loop/switch isn't completed */
_L8:
            j = i;
            if ((i & 8) == 8) goto _L11; else goto _L10
_L10:
            l = i;
            k = i;
            i1 = i;
            attribution_ = new ArrayList();
            j = i | 8;
_L11:
            l = j;
            k = j;
            i1 = j;
            attribution_.add(codedinputstream.readMessage(PrimitivesProto.Attribution.PARSER, extensionregistrylite));
            i = j;
            continue; /* Loop/switch isn't completed */
_L9:
            l = i;
            k = i;
            i1 = i;
            s = codedinputstream.readString();
            l = i;
            k = i;
            i1 = i;
            bitField0_ = bitField0_ | 8;
            l = i;
            k = i;
            i1 = i;
            discoverableId_ = s;
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
            if (true) goto _L13; else goto _L12
_L12:
        }

        ClassData(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, GiftCardProto._cls1 _pcls1)
        {
            this(codedinputstream, extensionregistrylite);
        }
    }

    public static final class ClassData.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private List attribution_;
        private int bitField0_;
        private Object discoverableId_;
        private Object merchantName_;
        private Object ocrSystemId_;
        private float score_;

        private void ensureAttributionIsMutable()
        {
            if ((bitField0_ & 8) != 8)
            {
                attribution_ = new ArrayList(attribution_);
                bitField0_ = bitField0_ | 8;
            }
        }

        private ClassData.Builder setScore(float f)
        {
            bitField0_ = bitField0_ | 4;
            score_ = f;
            return this;
        }

        public final ClassData.Builder addAllAttribution(Iterable iterable)
        {
            ensureAttributionIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, attribution_);
            return this;
        }

        public final ClassData buildPartial()
        {
            ClassData classdata = new ClassData(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
            
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final ClassData.Builder mergeFrom(ClassData classdata)
        {
            if (classdata == ClassData.getDefaultInstance())
            {
                return this;
            }
            if (classdata.hasMerchantName())
            {
                bitField0_ = bitField0_ | 1;
                merchantName_ = classdata.merchantName_;
            }
            if (classdata.hasOcrSystemId())
            {
                bitField0_ = bitField0_ | 2;
                ocrSystemId_ = classdata.ocrSystemId_;
            }
            if (classdata.hasScore())
            {
                setScore(classdata.getScore());
            }
            if (!classdata.attribution_.isEmpty())
            {
                if (attribution_.isEmpty())
                {
                    attribution_ = classdata.attribution_;
                    bitField0_ = bitField0_ & -9;
                } else
                {
                    ensureAttributionIsMutable();
                    attribution_.addAll(classdata.attribution_);
                }
            }
            if (classdata.hasDiscoverableId())
            {
                bitField0_ = bitField0_ | 0x10;
                discoverableId_ = classdata.discoverableId_;
            }
            mergeUnknownFields(
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((ClassData)generatedmessagelite);
        }

        public final ClassData.Builder setDiscoverableId(String s)
        {
            if (s == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 0x10;
                discoverableId_ = s;
                return this;
            }
        }

        public final ClassData.Builder setMerchantName(String s)
        {
            if (s == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 1;
                merchantName_ = s;
                return this;
            }
        }

        private ClassData.Builder()
        {
            super(ClassData.defaultInstance);
            merchantName_ = "";
            ocrSystemId_ = "";
            attribution_ = Collections.emptyList();
            discoverableId_ = "";
        }

        ClassData.Builder(GiftCardProto._cls1 _pcls1)
        {
            this();
        }
    }

    public static final class InstanceData extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final InstanceData defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private List barcode_;
        private int bitField0_;
        private PrimitivesProto.RecognizedText cardNumber_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private PrimitivesProto.RecognizedText pin_;
        private List textField_;

        private PrimitivesProto.RecognizedBarcode getBarcode(int i)
        {
            return (PrimitivesProto.RecognizedBarcode)barcode_.get(i);
        }

        private int getBarcodeCount()
        {
            return barcode_.size();
        }

        public static InstanceData getDefaultInstance()
        {
            return defaultInstance;
        }

        private PrimitivesProto.RecognizedText getTextField(int i)
        {
            return (PrimitivesProto.RecognizedText)textField_.get(i);
        }

        private int getTextFieldCount()
        {
            return textField_.size();
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(InstanceData instancedata)
        {
            return defaultInstance.toBuilder().mergeFrom(instancedata);
        }

        public final PrimitivesProto.RecognizedText getCardNumber()
        {
            if (cardNumber_ == null)
            {
                return PrimitivesProto.RecognizedText.getDefaultInstance();
            } else
            {
                return cardNumber_;
            }
        }

        public final PrimitivesProto.RecognizedText getPin()
        {
            if (pin_ == null)
            {
                return PrimitivesProto.RecognizedText.getDefaultInstance();
            } else
            {
                return pin_;
            }
        }

        public final boolean hasCardNumber()
        {
            return (bitField0_ & 1) == 1;
        }

        public final boolean hasPin()
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
            if (hasCardNumber() && !getCardNumber().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            if (hasPin() && !getPin().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getBarcodeCount(); i++)
            {
                if (!getBarcode(i).isInitialized())
                {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }

            for (int j = 0; j < getTextFieldCount(); j++)
            {
                if (!getTextField(j).isInitialized())
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
                return new Builder(null);
            } else
            {
                return (new Builder(null)).mergeFrom(this);
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static InstanceData parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new InstanceData(codedinputstream, extensionregistrylite, null);
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
            defaultInstance = new InstanceData(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/GiftCardProto$GiftCardData$InstanceData, new PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$1502(InstanceData instancedata, UnknownFieldSetLite unknownfieldsetlite)
        {
            instancedata.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static PrimitivesProto.RecognizedText access$1602(InstanceData instancedata, PrimitivesProto.RecognizedText recognizedtext)
        {
            instancedata.cardNumber_ = recognizedtext;
            return recognizedtext;
        }

*/


/*
        static PrimitivesProto.RecognizedText access$1702(InstanceData instancedata, PrimitivesProto.RecognizedText recognizedtext)
        {
            instancedata.pin_ = recognizedtext;
            return recognizedtext;
        }

*/



/*
        static List access$1802(InstanceData instancedata, List list)
        {
            instancedata.barcode_ = list;
            return list;
        }

*/



/*
        static List access$1902(InstanceData instancedata, List list)
        {
            instancedata.textField_ = list;
            return list;
        }

*/


/*
        static int access$2002(InstanceData instancedata, int i)
        {
            instancedata.bitField0_ = i;
            return i;
        }

*/


        private InstanceData(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder1;
            int i;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            barcode_ = Collections.emptyList();
            textField_ = Collections.emptyList();
            i = 0;
            builder1 = UnknownFieldSetLite.newBuilder();
            flag = false;
_L22:
            if (flag) goto _L2; else goto _L1
_L1:
            int j;
            int l;
            int i1;
            l = i;
            j = i;
            i1 = i;
            int k = codedinputstream.readTag();
            k;
            JVM INSTR lookupswitch 5: default 735
        //                       0: 738
        //                       10: 146
        //                       18: 357
        //                       26: 526
        //                       34: 604;
               goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
            l = i;
            j = i;
            i1 = i;
            if (!parseUnknownField(codedinputstream, builder1, extensionregistrylite, k))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            PrimitivesProto.RecognizedText.Builder builder;
            builder = null;
            l = i;
            j = i;
            i1 = i;
            if ((bitField0_ & 1) != 1) goto _L10; else goto _L9
_L9:
            l = i;
            j = i;
            i1 = i;
            builder = cardNumber_.toBuilder();
_L10:
            l = i;
            j = i;
            i1 = i;
            cardNumber_ = (PrimitivesProto.RecognizedText)codedinputstream.readMessage(PrimitivesProto.RecognizedText.PARSER, extensionregistrylite);
            if (builder == null) goto _L12; else goto _L11
_L11:
            l = i;
            j = i;
            i1 = i;
            builder.mergeFrom(cardNumber_);
            l = i;
            j = i;
            i1 = i;
            cardNumber_ = builder.buildPartial();
_L12:
            l = i;
            j = i;
            i1 = i;
            bitField0_ = bitField0_ | 1;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            j = l;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            if ((j & 4) == 4)
            {
                barcode_ = Collections.unmodifiableList(barcode_);
            }
            if ((j & 8) == 8)
            {
                textField_ = Collections.unmodifiableList(textField_);
            }
            unknownFields = builder1.build();
            throw codedinputstream;
_L6:
            builder = null;
            l = i;
            j = i;
            i1 = i;
            if ((bitField0_ & 2) != 2) goto _L14; else goto _L13
_L13:
            l = i;
            j = i;
            i1 = i;
            builder = pin_.toBuilder();
_L14:
            l = i;
            j = i;
            i1 = i;
            pin_ = (PrimitivesProto.RecognizedText)codedinputstream.readMessage(PrimitivesProto.RecognizedText.PARSER, extensionregistrylite);
            if (builder == null) goto _L16; else goto _L15
_L15:
            l = i;
            j = i;
            i1 = i;
            builder.mergeFrom(pin_);
            l = i;
            j = i;
            i1 = i;
            pin_ = builder.buildPartial();
_L16:
            l = i;
            j = i;
            i1 = i;
            bitField0_ = bitField0_ | 2;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            j = i1;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
            k = i;
            if ((i & 4) == 4) goto _L18; else goto _L17
_L17:
            l = i;
            j = i;
            i1 = i;
            barcode_ = new ArrayList();
            k = i | 4;
_L18:
            l = k;
            j = k;
            i1 = k;
            barcode_.add(codedinputstream.readMessage(PrimitivesProto.RecognizedBarcode.PARSER, extensionregistrylite));
            i = k;
            continue; /* Loop/switch isn't completed */
_L8:
            k = i;
            if ((i & 8) == 8) goto _L20; else goto _L19
_L19:
            l = i;
            j = i;
            i1 = i;
            textField_ = new ArrayList();
            k = i | 8;
_L20:
            l = k;
            j = k;
            i1 = k;
            textField_.add(codedinputstream.readMessage(PrimitivesProto.RecognizedText.PARSER, extensionregistrylite));
            i = k;
            continue; /* Loop/switch isn't completed */
_L2:
            if ((i & 4) == 4)
            {
                barcode_ = Collections.unmodifiableList(barcode_);
            }
            if ((i & 8) == 8)
            {
                textField_ = Collections.unmodifiableList(textField_);
            }
            unknownFields = builder1.build();
            return;
_L4:
            flag = true;
            if (true) goto _L22; else goto _L21
_L21:
        }

        InstanceData(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, GiftCardProto._cls1 _pcls1)
        {
            this(codedinputstream, extensionregistrylite);
        }
    }

    public static final class InstanceData.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private List barcode_;
        private int bitField0_;
        private PrimitivesProto.RecognizedText cardNumber_;
        private PrimitivesProto.RecognizedText pin_;
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

        private InstanceData.Builder mergeCardNumber(PrimitivesProto.RecognizedText recognizedtext)
        {
            if ((bitField0_ & 1) == 1 && cardNumber_ != null && cardNumber_ != PrimitivesProto.RecognizedText.getDefaultInstance())
            {
                cardNumber_ = PrimitivesProto.RecognizedText.newBuilder(cardNumber_).mergeFrom(recognizedtext).buildPartial();
            } else
            {
                cardNumber_ = recognizedtext;
            }
            bitField0_ = bitField0_ | 1;
            return this;
        }

        private InstanceData.Builder mergePin(PrimitivesProto.RecognizedText recognizedtext)
        {
            if ((bitField0_ & 2) == 2 && pin_ != null && pin_ != PrimitivesProto.RecognizedText.getDefaultInstance())
            {
                pin_ = PrimitivesProto.RecognizedText.newBuilder(pin_).mergeFrom(recognizedtext).buildPartial();
            } else
            {
                pin_ = recognizedtext;
            }
            bitField0_ = bitField0_ | 2;
            return this;
        }

        public final InstanceData.Builder addAllBarcode(Iterable iterable)
        {
            ensureBarcodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, barcode_);
            return this;
        }

        public final InstanceData buildPartial()
        {
            InstanceData instancedata = new InstanceData(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
            instancedata.unknownFields.hasPin = <no variable>;
            int k = bitField0_;
            int i = 0;
            if ((k & 1) == 1)
            {
                i = 1;
            }
            instancedata.cardNumber_ = cardNumber_;
            int j = i;
            if ((k & 2) == 2)
            {
                j = i | 2;
            }
            instancedata.pin_ = pin_;
            if ((bitField0_ & 4) == 4)
            {
                barcode_ = Collections.unmodifiableList(barcode_);
                bitField0_ = bitField0_ & -5;
            }
            instancedata.barcode_ = barcode_;
            if ((bitField0_ & 8) == 8)
            {
                textField_ = Collections.unmodifiableList(textField_);
                bitField0_ = bitField0_ & -9;
            }
            instancedata.textField_ = textField_;
            instancedata.bitField0_ = j;
            return instancedata;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final InstanceData.Builder mergeFrom(InstanceData instancedata)
        {
            if (instancedata == InstanceData.getDefaultInstance())
            {
                return this;
            }
            if (instancedata.hasCardNumber())
            {
                mergeCardNumber(instancedata.getCardNumber());
            }
            if (instancedata.hasPin())
            {
                mergePin(instancedata.getPin());
            }
            if (!instancedata.barcode_.isEmpty())
            {
                if (barcode_.isEmpty())
                {
                    barcode_ = instancedata.barcode_;
                    bitField0_ = bitField0_ & -5;
                } else
                {
                    ensureBarcodeIsMutable();
                    barcode_.addAll(instancedata.barcode_);
                }
            }
            if (!instancedata.textField_.isEmpty())
            {
                if (textField_.isEmpty())
                {
                    textField_ = instancedata.textField_;
                    bitField0_ = bitField0_ & -9;
                } else
                {
                    ensureTextFieldIsMutable();
                    textField_.addAll(instancedata.textField_);
                }
            }
            mergeUnknownFields(((hasPin) (instancedata)).hasPin);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((InstanceData)generatedmessagelite);
        }

        public final InstanceData.Builder setCardNumber(PrimitivesProto.RecognizedText recognizedtext)
        {
            if (recognizedtext == null)
            {
                throw new NullPointerException();
            } else
            {
                cardNumber_ = recognizedtext;
                bitField0_ = bitField0_ | 1;
                return this;
            }
        }

        public final InstanceData.Builder setPin(PrimitivesProto.RecognizedText recognizedtext)
        {
            if (recognizedtext == null)
            {
                throw new NullPointerException();
            } else
            {
                pin_ = recognizedtext;
                bitField0_ = bitField0_ | 2;
                return this;
            }
        }

        private InstanceData.Builder()
        {
            super(InstanceData.defaultInstance);
            cardNumber_ = null;
            pin_ = null;
            barcode_ = Collections.emptyList();
            textField_ = Collections.emptyList();
        }

        InstanceData.Builder(GiftCardProto._cls1 _pcls1)
        {
            this();
        }
    }


    public static final Parser PARSER;
    private static final PARSER defaultInstance;
    private static volatile MutableMessageLite mutableDefault = null;
    private int bitField0_;
    private ClassData classData_;
    private InstanceData instanceData_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;

    public static ext getDefaultInstance()
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

    public final ClassData getClassData()
    {
        if (classData_ == null)
        {
            return ClassData.getDefaultInstance();
        } else
        {
            return classData_;
        }
    }

    public final InstanceData getInstanceData()
    {
        if (instanceData_ == null)
        {
            return InstanceData.getDefaultInstance();
        } else
        {
            return instanceData_;
        }
    }

    public final boolean hasClassData()
    {
        return (bitField0_ & 1) == 1;
    }

    public final boolean hasInstanceData()
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
        if (hasInstanceData() && !getInstanceData().isInitialized())
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
            return new Builder(null);
        } else
        {
            return (new Builder(null)).mergeFrom(this);
        }
    }

    public final volatile com.google.protobuf.to.GiftCardData toBuilder()
    {
        return toBuilder();
    }

    static 
    {
        PARSER = new AbstractParser() {

            private static GiftCardProto.GiftCardData parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                throws InvalidProtocolBufferException
            {
                try
                {
                    codedinputstream = new GiftCardProto.GiftCardData(codedinputstream, extensionregistrylite, null);
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
        GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/GiftCardProto$GiftCardData, new com.google.protobuf.ypeHolder(defaultInstance, PARSER));
    }



/*
    static UnknownFieldSetLite access$2402(Builder builder, UnknownFieldSetLite unknownfieldsetlite)
    {
        builder.unknownFields = unknownfieldsetlite;
        return unknownfieldsetlite;
    }

*/


/*
    static ClassData access$2502(ClassData classdata, ClassData classdata1)
    {
        classdata.classData_ = classdata1;
        return classdata1;
    }

*/


/*
    static InstanceData access$2602(InstanceData instancedata, InstanceData instancedata1)
    {
        instancedata.instanceData_ = instancedata1;
        return instancedata1;
    }

*/


/*
    static int access$2702(instanceData_ instancedata_, int i)
    {
        instancedata_.bitField0_ = i;
        return i;
    }

*/


    private InstanceData(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
    {
        com.google.protobuf. ;
        boolean flag;
        memoizedIsInitialized = -1;
        memoizedSerializedSize = -1;
         = UnknownFieldSetLite.newBuilder();
        flag = false;
_L12:
        if (flag) goto _L2; else goto _L1
_L1:
        int i = codedinputstream.readTag();
        i;
        JVM INSTR lookupswitch 3: default 284
    //                   0: 287
    //                   10: 86
    //                   18: 181;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!parseUnknownField(codedinputstream, , extensionregistrylite, i))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        Object obj = null;
        if ((bitField0_ & 1) == 1)
        {
            obj = classData_.toBuilder();
        }
        classData_ = (ClassData)codedinputstream.readMessage(ClassData.PARSER, extensionregistrylite);
        if (obj == null) goto _L8; else goto _L7
_L7:
        ((ClassData.Builder) (obj)).mergeFrom(classData_);
        classData_ = ((ClassData.Builder) (obj)).buildPartial();
_L8:
        bitField0_ = bitField0_ | 1;
        continue; /* Loop/switch isn't completed */
        codedinputstream;
        throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
        codedinputstream;
        unknownFields = .build();
        throw codedinputstream;
_L6:
        obj = null;
        if ((bitField0_ & 2) == 2)
        {
            obj = instanceData_.toBuilder();
        }
        instanceData_ = (InstanceData)codedinputstream.readMessage(InstanceData.PARSER, extensionregistrylite);
        if (obj == null) goto _L10; else goto _L9
_L9:
        ((InstanceData.Builder) (obj)).mergeFrom(instanceData_);
        instanceData_ = ((InstanceData.Builder) (obj)).buildPartial();
_L10:
        bitField0_ = bitField0_ | 2;
        continue; /* Loop/switch isn't completed */
        codedinputstream;
        throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L2:
        unknownFields = .build();
        return;
_L4:
        flag = true;
        if (true) goto _L12; else goto _L11
_L11:
    }

    unknownFields(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, unknownFields unknownfields)
    {
        this(codedinputstream, extensionregistrylite);
    }
}
