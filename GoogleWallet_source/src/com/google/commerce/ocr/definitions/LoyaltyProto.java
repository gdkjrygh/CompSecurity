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

public final class LoyaltyProto
{
    public static final class DiscoverableProgramId extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final DiscoverableProgramId defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private int memoizedSerializedSize;
        private Object value_;

        public static DiscoverableProgramId getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(DiscoverableProgramId discoverableprogramid)
        {
            return defaultInstance.toBuilder().mergeFrom(discoverableprogramid);
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

                private static DiscoverableProgramId parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new DiscoverableProgramId(codedinputstream, extensionregistrylite);
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
            defaultInstance = new DiscoverableProgramId(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/LoyaltyProto$DiscoverableProgramId, new com.google.protobuf.GeneratedMessageLite.PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$1502(DiscoverableProgramId discoverableprogramid, UnknownFieldSetLite unknownfieldsetlite)
        {
            discoverableprogramid.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/



/*
        static Object access$1602(DiscoverableProgramId discoverableprogramid, Object obj)
        {
            discoverableprogramid.value_ = obj;
            return obj;
        }

*/


/*
        static int access$1702(DiscoverableProgramId discoverableprogramid, int i)
        {
            discoverableprogramid.bitField0_ = i;
            return i;
        }

*/


        private DiscoverableProgramId(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            memoizedSerializedSize = -1;
            value_ = "";
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L7:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 2: default 160
        //                       0: 163
        //                       10: 77;
               goto _L3 _L4 _L5
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
_L2:
            unknownFields = builder.build();
            return;
            codedinputstream;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L4:
            flag = true;
            if (true) goto _L7; else goto _L6
_L6:
        }

    }

    public static final class LoyaltyCardData extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final LoyaltyCardData defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private List accountId_;
        private List barcodeId_;
        private int bitField0_;
        private DiscoverableProgramId discoverableProgramId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private PrimitivesProto.RecognizedText merchantName_;
        private Object ocrSystemId_;
        private PrimitivesProto.RecognizedText programName_;

        private PrimitivesProto.RecognizedText getAccountId(int i)
        {
            return (PrimitivesProto.RecognizedText)accountId_.get(i);
        }

        private int getAccountIdCount()
        {
            return accountId_.size();
        }

        private PrimitivesProto.RecognizedBarcode getBarcodeId(int i)
        {
            return (PrimitivesProto.RecognizedBarcode)barcodeId_.get(i);
        }

        private int getBarcodeIdCount()
        {
            return barcodeId_.size();
        }

        public static LoyaltyCardData getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(LoyaltyCardData loyaltycarddata)
        {
            return defaultInstance.toBuilder().mergeFrom(loyaltycarddata);
        }

        public final List getAccountIdList()
        {
            return accountId_;
        }

        public final DiscoverableProgramId getDiscoverableProgramId()
        {
            if (discoverableProgramId_ == null)
            {
                return DiscoverableProgramId.getDefaultInstance();
            } else
            {
                return discoverableProgramId_;
            }
        }

        public final PrimitivesProto.RecognizedText getMerchantName()
        {
            if (merchantName_ == null)
            {
                return PrimitivesProto.RecognizedText.getDefaultInstance();
            } else
            {
                return merchantName_;
            }
        }

        public final PrimitivesProto.RecognizedText getProgramName()
        {
            if (programName_ == null)
            {
                return PrimitivesProto.RecognizedText.getDefaultInstance();
            } else
            {
                return programName_;
            }
        }

        public final boolean hasDiscoverableProgramId()
        {
            return (bitField0_ & 4) == 4;
        }

        public final boolean hasMerchantName()
        {
            return (bitField0_ & 1) == 1;
        }

        public final boolean hasOcrSystemId()
        {
            return (bitField0_ & 8) == 8;
        }

        public final boolean hasProgramName()
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
            if (hasMerchantName() && !getMerchantName().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            if (hasProgramName() && !getProgramName().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getAccountIdCount(); i++)
            {
                if (!getAccountId(i).isInitialized())
                {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }

            for (int j = 0; j < getBarcodeIdCount(); j++)
            {
                if (!getBarcodeId(j).isInitialized())
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

                private static LoyaltyCardData parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new LoyaltyCardData(codedinputstream, extensionregistrylite);
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
            defaultInstance = new LoyaltyCardData(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/LoyaltyProto$LoyaltyCardData, new PrototypeHolder(defaultInstance, PARSER));
        }


/*
        static int access$1002(LoyaltyCardData loyaltycarddata, int i)
        {
            loyaltycarddata.bitField0_ = i;
            return i;
        }

*/




/*
        static UnknownFieldSetLite access$302(LoyaltyCardData loyaltycarddata, UnknownFieldSetLite unknownfieldsetlite)
        {
            loyaltycarddata.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static PrimitivesProto.RecognizedText access$402(LoyaltyCardData loyaltycarddata, PrimitivesProto.RecognizedText recognizedtext)
        {
            loyaltycarddata.merchantName_ = recognizedtext;
            return recognizedtext;
        }

*/


/*
        static PrimitivesProto.RecognizedText access$502(LoyaltyCardData loyaltycarddata, PrimitivesProto.RecognizedText recognizedtext)
        {
            loyaltycarddata.programName_ = recognizedtext;
            return recognizedtext;
        }

*/



/*
        static List access$602(LoyaltyCardData loyaltycarddata, List list)
        {
            loyaltycarddata.accountId_ = list;
            return list;
        }

*/



/*
        static List access$702(LoyaltyCardData loyaltycarddata, List list)
        {
            loyaltycarddata.barcodeId_ = list;
            return list;
        }

*/


/*
        static DiscoverableProgramId access$802(LoyaltyCardData loyaltycarddata, DiscoverableProgramId discoverableprogramid)
        {
            loyaltycarddata.discoverableProgramId_ = discoverableprogramid;
            return discoverableprogramid;
        }

*/



/*
        static Object access$902(LoyaltyCardData loyaltycarddata, Object obj)
        {
            loyaltycarddata.ocrSystemId_ = obj;
            return obj;
        }

*/

        private LoyaltyCardData(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            int i;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            accountId_ = Collections.emptyList();
            barcodeId_ = Collections.emptyList();
            ocrSystemId_ = "";
            i = 0;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L28:
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
            JVM INSTR lookupswitch 7: default 956
        //                       0: 959
        //                       10: 166
        //                       18: 377
        //                       26: 483
        //                       34: 564
        //                       42: 705
        //                       50: 846;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L3:
            l = i;
            j = i;
            i1 = i;
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, k))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            Object obj;
            obj = null;
            l = i;
            j = i;
            i1 = i;
            if ((bitField0_ & 2) != 2) goto _L12; else goto _L11
_L11:
            l = i;
            j = i;
            i1 = i;
            obj = programName_.toBuilder();
_L12:
            l = i;
            j = i;
            i1 = i;
            programName_ = (PrimitivesProto.RecognizedText)codedinputstream.readMessage(PrimitivesProto.RecognizedText.PARSER, extensionregistrylite);
            if (obj == null) goto _L14; else goto _L13
_L13:
            l = i;
            j = i;
            i1 = i;
            ((PrimitivesProto.RecognizedText.Builder) (obj)).mergeFrom(programName_);
            l = i;
            j = i;
            i1 = i;
            programName_ = ((PrimitivesProto.RecognizedText.Builder) (obj)).buildPartial();
_L14:
            l = i;
            j = i;
            i1 = i;
            bitField0_ = bitField0_ | 2;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            j = l;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            if ((j & 4) == 4)
            {
                accountId_ = Collections.unmodifiableList(accountId_);
            }
            if ((j & 8) == 8)
            {
                barcodeId_ = Collections.unmodifiableList(barcodeId_);
            }
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            k = i;
            if ((i & 4) == 4) goto _L16; else goto _L15
_L15:
            l = i;
            j = i;
            i1 = i;
            accountId_ = new ArrayList();
            k = i | 4;
_L16:
            l = k;
            j = k;
            i1 = k;
            accountId_.add(codedinputstream.readMessage(PrimitivesProto.RecognizedText.PARSER, extensionregistrylite));
            i = k;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            j = i1;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
            k = i;
            if ((i & 8) == 8) goto _L18; else goto _L17
_L17:
            l = i;
            j = i;
            i1 = i;
            barcodeId_ = new ArrayList();
            k = i | 8;
_L18:
            l = k;
            j = k;
            i1 = k;
            barcodeId_.add(codedinputstream.readMessage(PrimitivesProto.RecognizedBarcode.PARSER, extensionregistrylite));
            i = k;
            continue; /* Loop/switch isn't completed */
_L8:
            obj = null;
            l = i;
            j = i;
            i1 = i;
            if ((bitField0_ & 1) != 1) goto _L20; else goto _L19
_L19:
            l = i;
            j = i;
            i1 = i;
            obj = merchantName_.toBuilder();
_L20:
            l = i;
            j = i;
            i1 = i;
            merchantName_ = (PrimitivesProto.RecognizedText)codedinputstream.readMessage(PrimitivesProto.RecognizedText.PARSER, extensionregistrylite);
            if (obj == null) goto _L22; else goto _L21
_L21:
            l = i;
            j = i;
            i1 = i;
            ((PrimitivesProto.RecognizedText.Builder) (obj)).mergeFrom(merchantName_);
            l = i;
            j = i;
            i1 = i;
            merchantName_ = ((PrimitivesProto.RecognizedText.Builder) (obj)).buildPartial();
_L22:
            l = i;
            j = i;
            i1 = i;
            bitField0_ = bitField0_ | 1;
            continue; /* Loop/switch isn't completed */
_L9:
            obj = null;
            l = i;
            j = i;
            i1 = i;
            if ((bitField0_ & 4) != 4) goto _L24; else goto _L23
_L23:
            l = i;
            j = i;
            i1 = i;
            obj = discoverableProgramId_.toBuilder();
_L24:
            l = i;
            j = i;
            i1 = i;
            discoverableProgramId_ = (DiscoverableProgramId)codedinputstream.readMessage(DiscoverableProgramId.PARSER, extensionregistrylite);
            if (obj == null) goto _L26; else goto _L25
_L25:
            l = i;
            j = i;
            i1 = i;
            ((DiscoverableProgramId.Builder) (obj)).mergeFrom(discoverableProgramId_);
            l = i;
            j = i;
            i1 = i;
            discoverableProgramId_ = ((DiscoverableProgramId.Builder) (obj)).buildPartial();
_L26:
            l = i;
            j = i;
            i1 = i;
            bitField0_ = bitField0_ | 4;
            continue; /* Loop/switch isn't completed */
_L10:
            l = i;
            j = i;
            i1 = i;
            obj = codedinputstream.readString();
            l = i;
            j = i;
            i1 = i;
            bitField0_ = bitField0_ | 8;
            l = i;
            j = i;
            i1 = i;
            ocrSystemId_ = obj;
            continue; /* Loop/switch isn't completed */
_L2:
            if ((i & 4) == 4)
            {
                accountId_ = Collections.unmodifiableList(accountId_);
            }
            if ((i & 8) == 8)
            {
                barcodeId_ = Collections.unmodifiableList(barcodeId_);
            }
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L28; else goto _L27
_L27:
        }

    }

    public static final class LoyaltyCardData.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private List accountId_;
        private List barcodeId_;
        private int bitField0_;
        private DiscoverableProgramId discoverableProgramId_;
        private PrimitivesProto.RecognizedText merchantName_;
        private Object ocrSystemId_;
        private PrimitivesProto.RecognizedText programName_;

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

        private LoyaltyCardData.Builder mergeDiscoverableProgramId(DiscoverableProgramId discoverableprogramid)
        {
            if ((bitField0_ & 0x10) == 16 && discoverableProgramId_ != null && discoverableProgramId_ != DiscoverableProgramId.getDefaultInstance())
            {
                discoverableProgramId_ = DiscoverableProgramId.newBuilder(discoverableProgramId_).mergeFrom(discoverableprogramid).buildPartial();
            } else
            {
                discoverableProgramId_ = discoverableprogramid;
            }
            bitField0_ = bitField0_ | 0x10;
            return this;
        }

        private LoyaltyCardData.Builder mergeMerchantName(PrimitivesProto.RecognizedText recognizedtext)
        {
            if ((bitField0_ & 1) == 1 && merchantName_ != null && merchantName_ != PrimitivesProto.RecognizedText.getDefaultInstance())
            {
                merchantName_ = PrimitivesProto.RecognizedText.newBuilder(merchantName_).mergeFrom(recognizedtext).buildPartial();
            } else
            {
                merchantName_ = recognizedtext;
            }
            bitField0_ = bitField0_ | 1;
            return this;
        }

        private LoyaltyCardData.Builder mergeProgramName(PrimitivesProto.RecognizedText recognizedtext)
        {
            if ((bitField0_ & 2) == 2 && programName_ != null && programName_ != PrimitivesProto.RecognizedText.getDefaultInstance())
            {
                programName_ = PrimitivesProto.RecognizedText.newBuilder(programName_).mergeFrom(recognizedtext).buildPartial();
            } else
            {
                programName_ = recognizedtext;
            }
            bitField0_ = bitField0_ | 2;
            return this;
        }

        public final LoyaltyCardData.Builder addAllAccountId(Iterable iterable)
        {
            ensureAccountIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, accountId_);
            return this;
        }

        public final LoyaltyCardData.Builder addAllBarcodeId(Iterable iterable)
        {
            ensureBarcodeIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, barcodeId_);
            return this;
        }

        public final LoyaltyCardData buildPartial()
        {
            LoyaltyCardData loyaltycarddata = new LoyaltyCardData(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            loyaltycarddata.unknownFields.access$702 = <no variable>;
            int k = bitField0_;
            int j = 0;
            if ((k & 1) == 1)
            {
                j = 1;
            }
            loyaltycarddata.merchantName_ = merchantName_;
            int i = j;
            if ((k & 2) == 2)
            {
                i = j | 2;
            }
            loyaltycarddata.programName_ = programName_;
            if ((bitField0_ & 4) == 4)
            {
                accountId_ = Collections.unmodifiableList(accountId_);
                bitField0_ = bitField0_ & -5;
            }
            loyaltycarddata.accountId_ = accountId_;
            if ((bitField0_ & 8) == 8)
            {
                barcodeId_ = Collections.unmodifiableList(barcodeId_);
                bitField0_ = bitField0_ & -9;
            }
            loyaltycarddata.barcodeId_ = barcodeId_;
            j = i;
            if ((k & 0x10) == 16)
            {
                j = i | 4;
            }
            loyaltycarddata.discoverableProgramId_ = discoverableProgramId_;
            i = j;
            if ((k & 0x20) == 32)
            {
                i = j | 8;
            }
            loyaltycarddata.ocrSystemId_ = ocrSystemId_;
            loyaltycarddata.bitField0_ = i;
            return loyaltycarddata;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final LoyaltyCardData.Builder mergeFrom(LoyaltyCardData loyaltycarddata)
        {
            if (loyaltycarddata == LoyaltyCardData.getDefaultInstance())
            {
                return this;
            }
            if (loyaltycarddata.hasMerchantName())
            {
                mergeMerchantName(loyaltycarddata.getMerchantName());
            }
            if (loyaltycarddata.hasProgramName())
            {
                mergeProgramName(loyaltycarddata.getProgramName());
            }
            if (!loyaltycarddata.accountId_.isEmpty())
            {
                if (accountId_.isEmpty())
                {
                    accountId_ = loyaltycarddata.accountId_;
                    bitField0_ = bitField0_ & -5;
                } else
                {
                    ensureAccountIdIsMutable();
                    accountId_.addAll(loyaltycarddata.accountId_);
                }
            }
            if (!loyaltycarddata.barcodeId_.isEmpty())
            {
                if (barcodeId_.isEmpty())
                {
                    barcodeId_ = loyaltycarddata.barcodeId_;
                    bitField0_ = bitField0_ & -9;
                } else
                {
                    ensureBarcodeIdIsMutable();
                    barcodeId_.addAll(loyaltycarddata.barcodeId_);
                }
            }
            if (loyaltycarddata.hasDiscoverableProgramId())
            {
                mergeDiscoverableProgramId(loyaltycarddata.getDiscoverableProgramId());
            }
            if (loyaltycarddata.hasOcrSystemId())
            {
                bitField0_ = bitField0_ | 0x20;
                ocrSystemId_ = loyaltycarddata.ocrSystemId_;
            }
            mergeUnknownFields(((access._cls702) (loyaltycarddata)).access$702);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((LoyaltyCardData)generatedmessagelite);
        }

        public final LoyaltyCardData.Builder setDiscoverableProgramId(DiscoverableProgramId.Builder builder)
        {
            discoverableProgramId_ = (DiscoverableProgramId)builder.build();
            bitField0_ = bitField0_ | 0x10;
            return this;
        }

        public final LoyaltyCardData.Builder setMerchantName(PrimitivesProto.RecognizedText recognizedtext)
        {
            if (recognizedtext == null)
            {
                throw new NullPointerException();
            } else
            {
                merchantName_ = recognizedtext;
                bitField0_ = bitField0_ | 1;
                return this;
            }
        }

        public final LoyaltyCardData.Builder setProgramName(PrimitivesProto.RecognizedText recognizedtext)
        {
            if (recognizedtext == null)
            {
                throw new NullPointerException();
            } else
            {
                programName_ = recognizedtext;
                bitField0_ = bitField0_ | 2;
                return this;
            }
        }

        private LoyaltyCardData.Builder()
        {
            super(LoyaltyCardData.defaultInstance);
            merchantName_ = null;
            programName_ = null;
            accountId_ = Collections.emptyList();
            barcodeId_ = Collections.emptyList();
            discoverableProgramId_ = null;
            ocrSystemId_ = "";
        }

    }

}
