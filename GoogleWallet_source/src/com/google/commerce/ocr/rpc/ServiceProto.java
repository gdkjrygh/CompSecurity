// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.rpc;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ServiceProto
{
    public static final class RecognizeWobDataRequest extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final RecognizeWobDataRequest defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private static final com.google.protobuf.Internal.ListAdapter.Converter wobType_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter() {

            private static com.google.commerce.ocr.definitions.WireProto.WobType convert(Integer integer)
            {
                com.google.commerce.ocr.definitions.WireProto.WobType wobtype = com.google.commerce.ocr.definitions.WireProto.WobType.valueOf(integer.intValue());
                integer = wobtype;
                if (wobtype == null)
                {
                    integer = com.google.commerce.ocr.definitions.WireProto.WobType.UNKNOWN;
                }
                return integer;
            }

            public final volatile Object convert(Object obj)
            {
                return convert((Integer)obj);
            }

        };
        private int bitField0_;
        private int captureMode_;
        private com.google.commerce.ocr.definitions.WireProto.ClientInfo clientInfo_;
        private com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugInfo_;
        private com.google.commerce.ocr.definitions.PrimitivesProto.Image image_;
        private List instance_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List wobType_;

        public static RecognizeWobDataRequest getDefaultInstance()
        {
            return defaultInstance;
        }

        private com.google.commerce.ocr.definitions.WireProto.RecognizedInstance getInstance(int i)
        {
            return (com.google.commerce.ocr.definitions.WireProto.RecognizedInstance)instance_.get(i);
        }

        private int getInstanceCount()
        {
            return instance_.size();
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

        public final CaptureMode getCaptureMode()
        {
            CaptureMode capturemode1 = CaptureMode.valueOf(captureMode_);
            CaptureMode capturemode = capturemode1;
            if (capturemode1 == null)
            {
                capturemode = CaptureMode.UNKNOWN_CAPTURE_MODE;
            }
            return capturemode;
        }

        public final com.google.commerce.ocr.definitions.WireProto.ClientInfo getClientInfo()
        {
            if (clientInfo_ == null)
            {
                return com.google.commerce.ocr.definitions.WireProto.ClientInfo.getDefaultInstance();
            } else
            {
                return clientInfo_;
            }
        }

        public final com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo getDebugInfo()
        {
            if (debugInfo_ == null)
            {
                return com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo.getDefaultInstance();
            } else
            {
                return debugInfo_;
            }
        }

        public final com.google.commerce.ocr.definitions.PrimitivesProto.Image getImage()
        {
            if (image_ == null)
            {
                return com.google.commerce.ocr.definitions.PrimitivesProto.Image.getDefaultInstance();
            } else
            {
                return image_;
            }
        }

        public final List getWobTypeList()
        {
            return new com.google.protobuf.Internal.ListAdapter(wobType_, wobType_converter_);
        }

        public final boolean hasCaptureMode()
        {
            return (bitField0_ & 8) == 8;
        }

        public final boolean hasClientInfo()
        {
            return (bitField0_ & 2) == 2;
        }

        public final boolean hasDebugInfo()
        {
            return (bitField0_ & 4) == 4;
        }

        public final boolean hasImage()
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
            for (int i = 0; i < getInstanceCount(); i++)
            {
                if (!getInstance(i).isInitialized())
                {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }

            memoizedIsInitialized = 1;
            return true;
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static RecognizeWobDataRequest parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new RecognizeWobDataRequest(codedinputstream, extensionregistrylite);
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
            defaultInstance = new RecognizeWobDataRequest(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/rpc/ServiceProto$RecognizeWobDataRequest, new com.google.protobuf.GeneratedMessageLite.PrototypeHolder(defaultInstance, PARSER));
        }


/*
        static int access$1002(RecognizeWobDataRequest recognizewobdatarequest, int i)
        {
            recognizewobdatarequest.bitField0_ = i;
            return i;
        }

*/




/*
        static UnknownFieldSetLite access$302(RecognizeWobDataRequest recognizewobdatarequest, UnknownFieldSetLite unknownfieldsetlite)
        {
            recognizewobdatarequest.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static com.google.commerce.ocr.definitions.PrimitivesProto.Image access$402(RecognizeWobDataRequest recognizewobdatarequest, com.google.commerce.ocr.definitions.PrimitivesProto.Image image)
        {
            recognizewobdatarequest.image_ = image;
            return image;
        }

*/



/*
        static List access$502(RecognizeWobDataRequest recognizewobdatarequest, List list)
        {
            recognizewobdatarequest.wobType_ = list;
            return list;
        }

*/


/*
        static com.google.commerce.ocr.definitions.WireProto.ClientInfo access$602(RecognizeWobDataRequest recognizewobdatarequest, com.google.commerce.ocr.definitions.WireProto.ClientInfo clientinfo)
        {
            recognizewobdatarequest.clientInfo_ = clientinfo;
            return clientinfo;
        }

*/


/*
        static com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo access$702(RecognizeWobDataRequest recognizewobdatarequest, com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugrequestinfo)
        {
            recognizewobdatarequest.debugInfo_ = debugrequestinfo;
            return debugrequestinfo;
        }

*/


/*
        static int access$802(RecognizeWobDataRequest recognizewobdatarequest, int i)
        {
            recognizewobdatarequest.captureMode_ = i;
            return i;
        }

*/



/*
        static List access$902(RecognizeWobDataRequest recognizewobdatarequest, List list)
        {
            recognizewobdatarequest.instance_ = list;
            return list;
        }

*/

        private RecognizeWobDataRequest(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            int i;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            wobType_ = Collections.emptyList();
            captureMode_ = 0;
            instance_ = Collections.emptyList();
            i = 0;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L39:
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
            JVM INSTR lookupswitch 8: default 1268
        //                       0: 1271
        //                       10: 174
        //                       16: 385
        //                       18: 550
        //                       26: 749
        //                       34: 890
        //                       40: 1031
        //                       50: 1137;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
            k = i;
            j = i;
            l = i;
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            Object obj;
            obj = null;
            k = i;
            j = i;
            l = i;
            if ((bitField0_ & 1) != 1) goto _L13; else goto _L12
_L12:
            k = i;
            j = i;
            l = i;
            obj = image_.toBuilder();
_L13:
            k = i;
            j = i;
            l = i;
            image_ = (com.google.commerce.ocr.definitions.PrimitivesProto.Image)codedinputstream.readMessage(com.google.commerce.ocr.definitions.PrimitivesProto.Image.PARSER, extensionregistrylite);
            if (obj == null) goto _L15; else goto _L14
_L14:
            k = i;
            j = i;
            l = i;
            ((com.google.commerce.ocr.definitions.PrimitivesProto.Image.Builder) (obj)).mergeFrom(image_);
            k = i;
            j = i;
            l = i;
            image_ = ((com.google.commerce.ocr.definitions.PrimitivesProto.Image.Builder) (obj)).buildPartial();
_L15:
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
                wobType_ = Collections.unmodifiableList(wobType_);
            }
            if ((j & 0x20) == 32)
            {
                instance_ = Collections.unmodifiableList(instance_);
            }
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            k = i;
            j = i;
            l = i;
            int j1 = codedinputstream.readEnum();
            k = i;
            j = i;
            l = i;
            if (com.google.commerce.ocr.definitions.WireProto.WobType.valueOf(j1) != null) goto _L17; else goto _L16
_L16:
            k = i;
            j = i;
            l = i;
            builder.mergeVarintField(2, j1);
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            j = l;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L17:
            i1 = i;
            if ((i & 2) == 2) goto _L19; else goto _L18
_L18:
            k = i;
            j = i;
            l = i;
            wobType_ = new ArrayList();
            i1 = i | 2;
_L19:
            k = i1;
            j = i1;
            l = i1;
            wobType_.add(Integer.valueOf(j1));
            i = i1;
            continue; /* Loop/switch isn't completed */
_L7:
            k = i;
            j = i;
            l = i;
            j1 = codedinputstream.pushLimit(codedinputstream.readRawVarint32());
_L25:
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
            if (com.google.commerce.ocr.definitions.WireProto.WobType.valueOf(k1) != null) goto _L21; else goto _L20
_L20:
            k = i;
            j = i;
            l = i;
            builder.mergeVarintField(2, k1);
            continue; /* Loop/switch isn't completed */
_L21:
            i1 = i;
            if ((i & 2) == 2) goto _L23; else goto _L22
_L22:
            k = i;
            j = i;
            l = i;
            wobType_ = new ArrayList();
            i1 = i | 2;
_L23:
            k = i1;
            j = i1;
            l = i1;
            wobType_.add(Integer.valueOf(k1));
            i = i1;
            if (true) goto _L25; else goto _L24
_L24:
            k = i;
            j = i;
            l = i;
            codedinputstream.popLimit(j1);
            continue; /* Loop/switch isn't completed */
_L8:
            obj = null;
            k = i;
            j = i;
            l = i;
            if ((bitField0_ & 2) != 2) goto _L27; else goto _L26
_L26:
            k = i;
            j = i;
            l = i;
            obj = clientInfo_.toBuilder();
_L27:
            k = i;
            j = i;
            l = i;
            clientInfo_ = (com.google.commerce.ocr.definitions.WireProto.ClientInfo)codedinputstream.readMessage(com.google.commerce.ocr.definitions.WireProto.ClientInfo.PARSER, extensionregistrylite);
            if (obj == null) goto _L29; else goto _L28
_L28:
            k = i;
            j = i;
            l = i;
            ((com.google.commerce.ocr.definitions.WireProto.ClientInfo.Builder) (obj)).mergeFrom(clientInfo_);
            k = i;
            j = i;
            l = i;
            clientInfo_ = ((com.google.commerce.ocr.definitions.WireProto.ClientInfo.Builder) (obj)).buildPartial();
_L29:
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 2;
            continue; /* Loop/switch isn't completed */
_L9:
            obj = null;
            k = i;
            j = i;
            l = i;
            if ((bitField0_ & 4) != 4) goto _L31; else goto _L30
_L30:
            k = i;
            j = i;
            l = i;
            obj = debugInfo_.toBuilder();
_L31:
            k = i;
            j = i;
            l = i;
            debugInfo_ = (com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo)codedinputstream.readMessage(com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo.PARSER, extensionregistrylite);
            if (obj == null) goto _L33; else goto _L32
_L32:
            k = i;
            j = i;
            l = i;
            ((com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo.Builder) (obj)).mergeFrom(debugInfo_);
            k = i;
            j = i;
            l = i;
            debugInfo_ = ((com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo.Builder) (obj)).buildPartial();
_L33:
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 4;
            continue; /* Loop/switch isn't completed */
_L10:
            k = i;
            j = i;
            l = i;
            i1 = codedinputstream.readEnum();
            k = i;
            j = i;
            l = i;
            if (CaptureMode.valueOf(i1) != null) goto _L35; else goto _L34
_L34:
            k = i;
            j = i;
            l = i;
            builder.mergeVarintField(5, i1);
            continue; /* Loop/switch isn't completed */
_L35:
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 8;
            k = i;
            j = i;
            l = i;
            captureMode_ = i1;
            continue; /* Loop/switch isn't completed */
_L11:
            i1 = i;
            if ((i & 0x20) == 32) goto _L37; else goto _L36
_L36:
            k = i;
            j = i;
            l = i;
            instance_ = new ArrayList();
            i1 = i | 0x20;
_L37:
            k = i1;
            j = i1;
            l = i1;
            instance_.add(codedinputstream.readMessage(com.google.commerce.ocr.definitions.WireProto.RecognizedInstance.PARSER, extensionregistrylite));
            i = i1;
            continue; /* Loop/switch isn't completed */
_L2:
            if ((i & 2) == 2)
            {
                wobType_ = Collections.unmodifiableList(wobType_);
            }
            if ((i & 0x20) == 32)
            {
                instance_ = Collections.unmodifiableList(instance_);
            }
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L39; else goto _L38
_L38:
        }

    }

    public static final class RecognizeWobDataRequest.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private int captureMode_;
        private com.google.commerce.ocr.definitions.WireProto.ClientInfo clientInfo_;
        private com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugInfo_;
        private com.google.commerce.ocr.definitions.PrimitivesProto.Image image_;
        private List instance_;
        private List wobType_;

        private RecognizeWobDataRequest buildPartial()
        {
            RecognizeWobDataRequest recognizewobdatarequest = new RecognizeWobDataRequest(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            
// JavaClassFileOutputException: get_constant: invalid tag

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

        private RecognizeWobDataRequest.Builder mergeClientInfo(com.google.commerce.ocr.definitions.WireProto.ClientInfo clientinfo)
        {
            if ((bitField0_ & 4) == 4 && clientInfo_ != null && clientInfo_ != com.google.commerce.ocr.definitions.WireProto.ClientInfo.getDefaultInstance())
            {
                clientInfo_ = com.google.commerce.ocr.definitions.WireProto.ClientInfo.newBuilder(clientInfo_).mergeFrom(clientinfo).buildPartial();
            } else
            {
                clientInfo_ = clientinfo;
            }
            bitField0_ = bitField0_ | 4;
            return this;
        }

        private RecognizeWobDataRequest.Builder mergeDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugrequestinfo)
        {
            if ((bitField0_ & 8) == 8 && debugInfo_ != null && debugInfo_ != com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo.getDefaultInstance())
            {
                debugInfo_ = com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo.newBuilder(debugInfo_).mergeFrom(debugrequestinfo).buildPartial();
            } else
            {
                debugInfo_ = debugrequestinfo;
            }
            bitField0_ = bitField0_ | 8;
            return this;
        }

        private RecognizeWobDataRequest.Builder mergeImage(com.google.commerce.ocr.definitions.PrimitivesProto.Image image)
        {
            if ((bitField0_ & 1) == 1 && image_ != null && image_ != com.google.commerce.ocr.definitions.PrimitivesProto.Image.getDefaultInstance())
            {
                image_ = com.google.commerce.ocr.definitions.PrimitivesProto.Image.newBuilder(image_).mergeFrom(image).buildPartial();
            } else
            {
                image_ = image;
            }
            bitField0_ = bitField0_ | 1;
            return this;
        }

        public final RecognizeWobDataRequest.Builder addWobType(com.google.commerce.ocr.definitions.WireProto.WobType wobtype)
        {
            if (wobtype == null)
            {
                throw new NullPointerException();
            } else
            {
                ensureWobTypeIsMutable();
                wobType_.add(Integer.valueOf(wobtype.getNumber()));
                return this;
            }
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final RecognizeWobDataRequest.Builder mergeFrom(RecognizeWobDataRequest recognizewobdatarequest)
        {
            if (recognizewobdatarequest == RecognizeWobDataRequest.getDefaultInstance())
            {
                return this;
            }
            if (recognizewobdatarequest.hasImage())
            {
                mergeImage(recognizewobdatarequest.getImage());
            }
            if (!recognizewobdatarequest.wobType_.isEmpty())
            {
                if (wobType_.isEmpty())
                {
                    wobType_ = recognizewobdatarequest.wobType_;
                    bitField0_ = bitField0_ & -3;
                } else
                {
                    ensureWobTypeIsMutable();
                    wobType_.addAll(recognizewobdatarequest.wobType_);
                }
            }
            if (recognizewobdatarequest.hasClientInfo())
            {
                mergeClientInfo(recognizewobdatarequest.getClientInfo());
            }
            if (recognizewobdatarequest.hasDebugInfo())
            {
                mergeDebugInfo(recognizewobdatarequest.getDebugInfo());
            }
            if (recognizewobdatarequest.hasCaptureMode())
            {
                setCaptureMode(recognizewobdatarequest.getCaptureMode());
            }
            if (!recognizewobdatarequest.instance_.isEmpty())
            {
                if (instance_.isEmpty())
                {
                    instance_ = recognizewobdatarequest.instance_;
                    bitField0_ = bitField0_ & 0xffffffdf;
                } else
                {
                    ensureInstanceIsMutable();
                    instance_.addAll(recognizewobdatarequest.instance_);
                }
            }
            mergeUnknownFields(
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((RecognizeWobDataRequest)generatedmessagelite);
        }

        public final RecognizeWobDataRequest.Builder setCaptureMode(RecognizeWobDataRequest.CaptureMode capturemode)
        {
            if (capturemode == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 0x10;
                captureMode_ = capturemode.getNumber();
                return this;
            }
        }

        public final RecognizeWobDataRequest.Builder setDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo.Builder builder)
        {
            debugInfo_ = (com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo)builder.build();
            bitField0_ = bitField0_ | 8;
            return this;
        }

        public final RecognizeWobDataRequest.Builder setDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugrequestinfo)
        {
            if (debugrequestinfo == null)
            {
                throw new NullPointerException();
            } else
            {
                debugInfo_ = debugrequestinfo;
                bitField0_ = bitField0_ | 8;
                return this;
            }
        }

        public final RecognizeWobDataRequest.Builder setImage(com.google.commerce.ocr.definitions.PrimitivesProto.Image.Builder builder)
        {
            image_ = (com.google.commerce.ocr.definitions.PrimitivesProto.Image)builder.build();
            bitField0_ = bitField0_ | 1;
            return this;
        }

        private RecognizeWobDataRequest.Builder()
        {
            super(RecognizeWobDataRequest.defaultInstance);
            image_ = null;
            wobType_ = Collections.emptyList();
            clientInfo_ = null;
            debugInfo_ = null;
            captureMode_ = 0;
            instance_ = Collections.emptyList();
        }

    }

    public static final class RecognizeWobDataRequest.CaptureMode extends Enum
    {

        private static final RecognizeWobDataRequest.CaptureMode $VALUES[];
        public static final RecognizeWobDataRequest.CaptureMode CONTINUOUS;
        public static final RecognizeWobDataRequest.CaptureMode DETECTED;
        public static final RecognizeWobDataRequest.CaptureMode SNAP;
        public static final RecognizeWobDataRequest.CaptureMode UNKNOWN_CAPTURE_MODE;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static RecognizeWobDataRequest.CaptureMode valueOf(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 0: // '\0'
                return UNKNOWN_CAPTURE_MODE;

            case 1: // '\001'
                return SNAP;

            case 2: // '\002'
                return DETECTED;

            case 3: // '\003'
                return CONTINUOUS;
            }
        }

        public static RecognizeWobDataRequest.CaptureMode valueOf(String s)
        {
            return (RecognizeWobDataRequest.CaptureMode)Enum.valueOf(com/google/commerce/ocr/rpc/ServiceProto$RecognizeWobDataRequest$CaptureMode, s);
        }

        public static RecognizeWobDataRequest.CaptureMode[] values()
        {
            return (RecognizeWobDataRequest.CaptureMode[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            UNKNOWN_CAPTURE_MODE = new CaptureMode("UNKNOWN_CAPTURE_MODE", 0, 0, 0);
            SNAP = new CaptureMode("SNAP", 1, 1, 1);
            DETECTED = new CaptureMode("DETECTED", 2, 2, 2);
            CONTINUOUS = new CaptureMode("CONTINUOUS", 3, 3, 3);
            $VALUES = (new RecognizeWobDataRequest.CaptureMode[] {
                UNKNOWN_CAPTURE_MODE, SNAP, DETECTED, CONTINUOUS
            });
        }

        private RecognizeWobDataRequest.CaptureMode(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class RecognizeWobDataResponse extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final RecognizeWobDataResponse defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo debugInfo_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List recognizedInstance_;

        public static RecognizeWobDataResponse getDefaultInstance()
        {
            return defaultInstance;
        }

        private com.google.commerce.ocr.definitions.WireProto.RecognizedInstance getRecognizedInstance(int i)
        {
            return (com.google.commerce.ocr.definitions.WireProto.RecognizedInstance)recognizedInstance_.get(i);
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

        public final com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo getDebugInfo()
        {
            if (debugInfo_ == null)
            {
                return com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo.getDefaultInstance();
            } else
            {
                return debugInfo_;
            }
        }

        public final int getRecognizedInstanceCount()
        {
            return recognizedInstance_.size();
        }

        public final List getRecognizedInstanceList()
        {
            return recognizedInstance_;
        }

        public final boolean hasDebugInfo()
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
            for (int i = 0; i < getRecognizedInstanceCount(); i++)
            {
                if (!getRecognizedInstance(i).isInitialized())
                {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }

            if (hasDebugInfo() && !getDebugInfo().isInitialized())
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

                private static RecognizeWobDataResponse parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new RecognizeWobDataResponse(codedinputstream, extensionregistrylite);
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
            defaultInstance = new RecognizeWobDataResponse(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/rpc/ServiceProto$RecognizeWobDataResponse, new PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$1602(RecognizeWobDataResponse recognizewobdataresponse, UnknownFieldSetLite unknownfieldsetlite)
        {
            recognizewobdataresponse.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/



/*
        static List access$1702(RecognizeWobDataResponse recognizewobdataresponse, List list)
        {
            recognizewobdataresponse.recognizedInstance_ = list;
            return list;
        }

*/


/*
        static com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo access$1802(RecognizeWobDataResponse recognizewobdataresponse, com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo debugresponseinfo)
        {
            recognizewobdataresponse.debugInfo_ = debugresponseinfo;
            return debugresponseinfo;
        }

*/


/*
        static int access$1902(RecognizeWobDataResponse recognizewobdataresponse, int i)
        {
            recognizewobdataresponse.bitField0_ = i;
            return i;
        }

*/


        private RecognizeWobDataResponse(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder1;
            boolean flag;
            boolean flag2;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            recognizedInstance_ = Collections.emptyList();
            flag = false;
            builder1 = UnknownFieldSetLite.newBuilder();
            flag2 = false;
_L14:
            if (flag2) goto _L2; else goto _L1
_L1:
            boolean flag1;
            boolean flag3;
            boolean flag4;
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 3: default 447
        //                       0: 450
        //                       10: 122
        //                       34: 249;
               goto _L3 _L4 _L5 _L6
_L3:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            if (!parseUnknownField(codedinputstream, builder1, extensionregistrylite, i))
            {
                flag2 = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            i = ((flag) ? 1 : 0);
            if ((flag & true)) goto _L8; else goto _L7
_L7:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            recognizedInstance_ = new ArrayList();
            i = flag | true;
_L8:
            flag3 = i;
            flag1 = i;
            flag4 = i;
            recognizedInstance_.add(codedinputstream.readMessage(com.google.commerce.ocr.definitions.WireProto.RecognizedInstance.PARSER, extensionregistrylite));
            flag = i;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            flag1 = flag3;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            if ((flag1 & true))
            {
                recognizedInstance_ = Collections.unmodifiableList(recognizedInstance_);
            }
            unknownFields = builder1.build();
            throw codedinputstream;
_L6:
            com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo.Builder builder;
            builder = null;
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            if ((bitField0_ & 1) != 1) goto _L10; else goto _L9
_L9:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            builder = debugInfo_.toBuilder();
_L10:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            debugInfo_ = (com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo)codedinputstream.readMessage(com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo.PARSER, extensionregistrylite);
            if (builder == null) goto _L12; else goto _L11
_L11:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            builder.mergeFrom(debugInfo_);
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            debugInfo_ = builder.buildPartial();
_L12:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            bitField0_ = bitField0_ | 1;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            flag1 = flag4;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L2:
            if ((flag & true))
            {
                recognizedInstance_ = Collections.unmodifiableList(recognizedInstance_);
            }
            unknownFields = builder1.build();
            return;
_L4:
            flag2 = true;
            if (true) goto _L14; else goto _L13
_L13:
        }

    }

    public static final class RecognizeWobDataResponse.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo debugInfo_;
        private List recognizedInstance_;

        private RecognizeWobDataResponse buildPartial()
        {
            RecognizeWobDataResponse recognizewobdataresponse = new RecognizeWobDataResponse(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            recognizewobdataresponse.unknownFields.hasDebugInfo = <no variable>;
            int j = bitField0_;
            int i = 0;
            if ((bitField0_ & 1) == 1)
            {
                recognizedInstance_ = Collections.unmodifiableList(recognizedInstance_);
                bitField0_ = bitField0_ & -2;
            }
            recognizewobdataresponse.recognizedInstance_ = recognizedInstance_;
            if ((j & 2) == 2)
            {
                i = 1;
            }
            recognizewobdataresponse.debugInfo_ = debugInfo_;
            recognizewobdataresponse.bitField0_ = i;
            return recognizewobdataresponse;
        }

        private void ensureRecognizedInstanceIsMutable()
        {
            if ((bitField0_ & 1) != 1)
            {
                recognizedInstance_ = new ArrayList(recognizedInstance_);
                bitField0_ = bitField0_ | 1;
            }
        }

        private RecognizeWobDataResponse.Builder mergeDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo debugresponseinfo)
        {
            if ((bitField0_ & 2) == 2 && debugInfo_ != null && debugInfo_ != com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo.getDefaultInstance())
            {
                debugInfo_ = com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo.newBuilder(debugInfo_).mergeFrom(debugresponseinfo).buildPartial();
            } else
            {
                debugInfo_ = debugresponseinfo;
            }
            bitField0_ = bitField0_ | 2;
            return this;
        }

        public final RecognizeWobDataResponse.Builder addAllRecognizedInstance(Iterable iterable)
        {
            ensureRecognizedInstanceIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, recognizedInstance_);
            return this;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final RecognizeWobDataResponse.Builder mergeFrom(RecognizeWobDataResponse recognizewobdataresponse)
        {
            if (recognizewobdataresponse == RecognizeWobDataResponse.getDefaultInstance())
            {
                return this;
            }
            if (!recognizewobdataresponse.recognizedInstance_.isEmpty())
            {
                if (recognizedInstance_.isEmpty())
                {
                    recognizedInstance_ = recognizewobdataresponse.recognizedInstance_;
                    bitField0_ = bitField0_ & -2;
                } else
                {
                    ensureRecognizedInstanceIsMutable();
                    recognizedInstance_.addAll(recognizewobdataresponse.recognizedInstance_);
                }
            }
            if (recognizewobdataresponse.hasDebugInfo())
            {
                mergeDebugInfo(recognizewobdataresponse.getDebugInfo());
            }
            mergeUnknownFields(((hasDebugInfo) (recognizewobdataresponse)).hasDebugInfo);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((RecognizeWobDataResponse)generatedmessagelite);
        }

        public final RecognizeWobDataResponse.Builder setDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo.Builder builder)
        {
            debugInfo_ = (com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo)builder.build();
            bitField0_ = bitField0_ | 2;
            return this;
        }

        private RecognizeWobDataResponse.Builder()
        {
            super(RecognizeWobDataResponse.defaultInstance);
            recognizedInstance_ = Collections.emptyList();
            debugInfo_ = null;
        }

    }

}
