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

// Referenced classes of package com.google.commerce.ocr.rpc:
//            ServiceProto

public static final class <init> extends GeneratedMessageLite
{
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private int captureMode_;
        private com.google.commerce.ocr.definitions.WireProto.ClientInfo clientInfo_;
        private com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugInfo_;
        private com.google.commerce.ocr.definitions.PrimitivesProto.Image image_;
        private List instance_;
        private List wobType_;

        private ServiceProto.RecognizeWobDataRequest buildPartial()
        {
            ServiceProto.RecognizeWobDataRequest recognizewobdatarequest = new ServiceProto.RecognizeWobDataRequest(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
            
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

        private Builder mergeClientInfo(com.google.commerce.ocr.definitions.WireProto.ClientInfo clientinfo)
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

        private Builder mergeDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugrequestinfo)
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

        private Builder mergeImage(com.google.commerce.ocr.definitions.PrimitivesProto.Image image)
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

        public final Builder addWobType(com.google.commerce.ocr.definitions.WireProto.WobType wobtype)
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

        public final Builder mergeFrom(ServiceProto.RecognizeWobDataRequest recognizewobdatarequest)
        {
            if (recognizewobdatarequest == ServiceProto.RecognizeWobDataRequest.getDefaultInstance())
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
            return mergeFrom((ServiceProto.RecognizeWobDataRequest)generatedmessagelite);
        }

        public final Builder setCaptureMode(CaptureMode capturemode)
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

        public final Builder setDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo.Builder builder)
        {
            debugInfo_ = (com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo)builder.build();
            bitField0_ = bitField0_ | 8;
            return this;
        }

        public final Builder setDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugrequestinfo)
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

        public final Builder setImage(com.google.commerce.ocr.definitions.PrimitivesProto.Image.Builder builder)
        {
            image_ = (com.google.commerce.ocr.definitions.PrimitivesProto.Image)builder.build();
            bitField0_ = bitField0_ | 1;
            return this;
        }

        private Builder()
        {
            super(ServiceProto.RecognizeWobDataRequest.defaultInstance);
            image_ = null;
            wobType_ = Collections.emptyList();
            clientInfo_ = null;
            debugInfo_ = null;
            captureMode_ = 0;
            instance_ = Collections.emptyList();
        }

        Builder(ServiceProto._cls1 _pcls1)
        {
            this();
        }
    }

    public static final class CaptureMode extends Enum
    {

        private static final CaptureMode $VALUES[];
        public static final CaptureMode CONTINUOUS;
        public static final CaptureMode DETECTED;
        public static final CaptureMode SNAP;
        public static final CaptureMode UNKNOWN_CAPTURE_MODE;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static CaptureMode valueOf(int i)
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

        public static CaptureMode valueOf(String s)
        {
            return (CaptureMode)Enum.valueOf(com/google/commerce/ocr/rpc/ServiceProto$RecognizeWobDataRequest$CaptureMode, s);
        }

        public static CaptureMode[] values()
        {
            return (CaptureMode[])$VALUES.clone();
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
            $VALUES = (new CaptureMode[] {
                UNKNOWN_CAPTURE_MODE, SNAP, DETECTED, CONTINUOUS
            });
        }

        private CaptureMode(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public static final Parser PARSER;
    private static final PARSER defaultInstance;
    private static volatile MutableMessageLite mutableDefault = null;
    private static final com.google.protobuf.Request wobType_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter() {

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
    private com.google.commerce.ocr.definitions.t clientInfo_;
    private com.google.commerce.ocr.definitions.t debugInfo_;
    private com.google.commerce.ocr.definitions.t image_;
    private List instance_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List wobType_;

    public static CaptureMode getDefaultInstance()
    {
        return defaultInstance;
    }

    private com.google.commerce.ocr.definitions.nstance getInstance(int i)
    {
        return (com.google.commerce.ocr.definitions.nstance)instance_.get(i);
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
            return new Builder(null);
        } else
        {
            return (new Builder(null)).mergeFrom(this);
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

    public final com.google.commerce.ocr.definitions.ode.UNKNOWN_CAPTURE_MODE getClientInfo()
    {
        if (clientInfo_ == null)
        {
            return com.google.commerce.ocr.definitions.ce();
        } else
        {
            return clientInfo_;
        }
    }

    public final com.google.commerce.ocr.definitions.fo_ getDebugInfo()
    {
        if (debugInfo_ == null)
        {
            return com.google.commerce.ocr.definitions.Instance();
        } else
        {
            return debugInfo_;
        }
    }

    public final com.google.commerce.ocr.definitions.o_ getImage()
    {
        if (image_ == null)
        {
            return com.google.commerce.ocr.definitions.nce();
        } else
        {
            return image_;
        }
    }

    public final List getWobTypeList()
    {
        return new Request(wobType_, wobType_converter_);
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
            if (!getInstance(i).lized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
        }

        memoizedIsInitialized = 1;
        return true;
    }

    public final volatile com.google.protobuf.Request toBuilder()
    {
        return toBuilder();
    }

    static 
    {
        PARSER = new AbstractParser() {

            private static ServiceProto.RecognizeWobDataRequest parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                throws InvalidProtocolBufferException
            {
                try
                {
                    codedinputstream = new RecognizeWobDataRequest(codedinputstream, extensionregistrylite, null);
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
        GeneratedMessageLite.onLoad(com/google/commerce/ocr/rpc/ServiceProto$RecognizeWobDataRequest, new <init>(defaultInstance, PARSER));
    }


/*
    static int access$1002(CaptureMode capturemode, int i)
    {
        capturemode.bitField0_ = i;
        return i;
    }

*/




/*
    static UnknownFieldSetLite access$302(bitField0_ bitfield0_, UnknownFieldSetLite unknownfieldsetlite)
    {
        bitfield0_.unknownFields = unknownfieldsetlite;
        return unknownfieldsetlite;
    }

*/


/*
    static com.google.commerce.ocr.definitions.ields access$402(unknownFields unknownfields, com.google.commerce.ocr.definitions.ields ields)
    {
        unknownfields.image_ = ields;
        return ields;
    }

*/



/*
    static List access$502(image_ image_1, List list)
    {
        image_1.wobType_ = list;
        return list;
    }

*/


/*
    static com.google.commerce.ocr.definitions. access$602(wobType_ wobtype_, com.google.commerce.ocr.definitions. )
    {
        wobtype_.clientInfo_ = ;
        return ;
    }

*/


/*
    static com.google.commerce.ocr.definitions.fo_ access$702(clientInfo_ clientinfo_, com.google.commerce.ocr.definitions.fo_ fo_)
    {
        clientinfo_.debugInfo_ = fo_;
        return fo_;
    }

*/


/*
    static int access$802(debugInfo_ debuginfo_, int i)
    {
        debuginfo_.captureMode_ = i;
        return i;
    }

*/



/*
    static List access$902(captureMode_ capturemode_, List list)
    {
        capturemode_.instance_ = list;
        return list;
    }

*/

    private ilder(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
    {
        com.google.protobuf.tInfo tinfo;
        int i;
        boolean flag;
        memoizedIsInitialized = -1;
        memoizedSerializedSize = -1;
        wobType_ = Collections.emptyList();
        captureMode_ = 0;
        instance_ = Collections.emptyList();
        i = 0;
        tinfo = UnknownFieldSetLite.newBuilder();
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
    //                   0: 1271
    //                   10: 174
    //                   16: 385
    //                   18: 550
    //                   26: 749
    //                   34: 890
    //                   40: 1031
    //                   50: 1137;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        k = i;
        j = i;
        l = i;
        if (!parseUnknownField(codedinputstream, tinfo, extensionregistrylite, i1))
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
        obj = image_._mth0_();
_L13:
        k = i;
        j = i;
        l = i;
        image_ = (com.google.commerce.ocr.definitions._cls0_)codedinputstream.readMessage(com.google.commerce.ocr.definitions._fld0_, extensionregistrylite);
        if (obj == null) goto _L15; else goto _L14
_L14:
        k = i;
        j = i;
        l = i;
        ((com.google.commerce.ocr.definitions._cls0_) (obj)).om(image_);
        k = i;
        j = i;
        l = i;
        image_ = ((com.google.commerce.ocr.definitions.om) (obj)).rtial();
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
        unknownFields = tinfo.unknownFields();
        throw codedinputstream;
_L6:
        k = i;
        j = i;
        l = i;
        int j1 = codedinputstream.readEnum();
        k = i;
        j = i;
        l = i;
        if (com.google.commerce.ocr.definitions.ields(j1) != null) goto _L17; else goto _L16
_L16:
        k = i;
        j = i;
        l = i;
        tinfo.ntField(2, j1);
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
        if (com.google.commerce.ocr.definitions.(k1) != null) goto _L21; else goto _L20
_L20:
        k = i;
        j = i;
        l = i;
        tinfo.ntField(2, k1);
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
        obj = clientInfo_.fo_();
_L27:
        k = i;
        j = i;
        l = i;
        clientInfo_ = (com.google.commerce.ocr.definitions.fo_)codedinputstream.readMessage(com.google.commerce.ocr.definitions.fo_, extensionregistrylite);
        if (obj == null) goto _L29; else goto _L28
_L28:
        k = i;
        j = i;
        l = i;
        ((com.google.commerce.ocr.definitions.fo_) (obj)).m(clientInfo_);
        k = i;
        j = i;
        l = i;
        clientInfo_ = ((com.google.commerce.ocr.definitions.fo_) (obj)).tial();
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
        obj = debugInfo_.o_();
_L31:
        k = i;
        j = i;
        l = i;
        debugInfo_ = (com.google.commerce.ocr.definitions.o_)codedinputstream.readMessage(com.google.commerce.ocr.definitions.o_, extensionregistrylite);
        if (obj == null) goto _L33; else goto _L32
_L32:
        k = i;
        j = i;
        l = i;
        ((com.google.commerce.ocr.definitions.o_) (obj)).rgeFrom(debugInfo_);
        k = i;
        j = i;
        l = i;
        debugInfo_ = ((com.google.commerce.ocr.definitions.o_) (obj)).ildPartial();
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
        tinfo.ntField(5, i1);
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
        instance_.add(codedinputstream.readMessage(com.google.commerce.ocr.definitions._, extensionregistrylite));
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
        unknownFields = tinfo.unknownFields();
        return;
_L4:
        flag = true;
        if (true) goto _L39; else goto _L38
_L38:
    }

    unknownFields(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, unknownFields unknownfields)
    {
        this(codedinputstream, extensionregistrylite);
    }
}
