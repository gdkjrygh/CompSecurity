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
        private com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo debugInfo_;
        private List recognizedInstance_;

        private ServiceProto.RecognizeWobDataResponse buildPartial()
        {
            ServiceProto.RecognizeWobDataResponse recognizewobdataresponse = new ServiceProto.RecognizeWobDataResponse(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
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

        private Builder mergeDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo debugresponseinfo)
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

        public final Builder addAllRecognizedInstance(Iterable iterable)
        {
            ensureRecognizedInstanceIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, recognizedInstance_);
            return this;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final Builder mergeFrom(ServiceProto.RecognizeWobDataResponse recognizewobdataresponse)
        {
            if (recognizewobdataresponse == ServiceProto.RecognizeWobDataResponse.getDefaultInstance())
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
            return mergeFrom((ServiceProto.RecognizeWobDataResponse)generatedmessagelite);
        }

        public final Builder setDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo.Builder builder)
        {
            debugInfo_ = (com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo)builder.build();
            bitField0_ = bitField0_ | 2;
            return this;
        }

        private Builder()
        {
            super(ServiceProto.RecognizeWobDataResponse.defaultInstance);
            recognizedInstance_ = Collections.emptyList();
            debugInfo_ = null;
        }

        Builder(ServiceProto._cls1 _pcls1)
        {
            this();
        }
    }


    public static final Parser PARSER;
    private static final PARSER defaultInstance;
    private static volatile MutableMessageLite mutableDefault = null;
    private int bitField0_;
    private com.google.commerce.ocr.definitions.nstance debugInfo_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List recognizedInstance_;

    public static Builder.bitField0_ getDefaultInstance()
    {
        return defaultInstance;
    }

    private com.google.commerce.ocr.definitions.nstance getRecognizedInstance(int i)
    {
        return (com.google.commerce.ocr.definitions.nstance)recognizedInstance_.get(i);
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

    public final com.google.commerce.ocr.definitions.mergeFrom getDebugInfo()
    {
        if (debugInfo_ == null)
        {
            return com.google.commerce.ocr.definitions.Instance();
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
            if (!getRecognizedInstance(i).ized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
        }

        if (hasDebugInfo() && !getDebugInfo().zed())
        {
            memoizedIsInitialized = 0;
            return false;
        } else
        {
            memoizedIsInitialized = 1;
            return true;
        }
    }

    public final volatile com.google.protobuf.esponse toBuilder()
    {
        return toBuilder();
    }

    static 
    {
        PARSER = new AbstractParser() {

            private static ServiceProto.RecognizeWobDataResponse parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                throws InvalidProtocolBufferException
            {
                try
                {
                    codedinputstream = new ServiceProto.RecognizeWobDataResponse(codedinputstream, extensionregistrylite, null);
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
        GeneratedMessageLite.onLoad(com/google/commerce/ocr/rpc/ServiceProto$RecognizeWobDataResponse, new com.google.protobuf.init>(defaultInstance, PARSER));
    }



/*
    static UnknownFieldSetLite access$1602(Builder builder, UnknownFieldSetLite unknownfieldsetlite)
    {
        builder.unknownFields = unknownfieldsetlite;
        return unknownfieldsetlite;
    }

*/



/*
    static List access$1702(unknownFields unknownfields, List list)
    {
        unknownfields.recognizedInstance_ = list;
        return list;
    }

*/


/*
    static com.google.commerce.ocr.definitions.edInstance_ access$1802(recognizedInstance_ recognizedinstance_, com.google.commerce.ocr.definitions.edInstance_ edinstance_)
    {
        recognizedinstance_.debugInfo_ = edinstance_;
        return edinstance_;
    }

*/


/*
    static int access$1902(debugInfo_ debuginfo_, int i)
    {
        debuginfo_.bitField0_ = i;
        return i;
    }

*/


    private ilder(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
    {
        com.google.protobuf.eInfo einfo;
        boolean flag;
        boolean flag2;
        memoizedIsInitialized = -1;
        memoizedSerializedSize = -1;
        recognizedInstance_ = Collections.emptyList();
        flag = false;
        einfo = UnknownFieldSetLite.newBuilder();
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
    //                   0: 450
    //                   10: 122
    //                   34: 249;
           goto _L3 _L4 _L5 _L6
_L3:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        if (!parseUnknownField(codedinputstream, einfo, extensionregistrylite, i))
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
        recognizedInstance_.add(codedinputstream.readMessage(com.google.commerce.ocr.definitions.edInstance_, extensionregistrylite));
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
        unknownFields = einfo.unknownFields();
        throw codedinputstream;
_L6:
        com.google.commerce.ocr.definitions.<init> <init>1;
        <init>1 = null;
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        if ((bitField0_ & 1) != 1) goto _L10; else goto _L9
_L9:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        <init>1 = debugInfo_.o_();
_L10:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        debugInfo_ = (com.google.commerce.ocr.definitions.o_)codedinputstream.readMessage(com.google.commerce.ocr.definitions.o_, extensionregistrylite);
        if (<init>1 == null) goto _L12; else goto _L11
_L11:
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        <init>1.rgeFrom(debugInfo_);
        flag3 = flag;
        flag1 = flag;
        flag4 = flag;
        debugInfo_ = <init>1.ildPartial();
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
        unknownFields = einfo.unknownFields();
        return;
_L4:
        flag2 = true;
        if (true) goto _L14; else goto _L13
_L13:
    }

    unknownFields(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, unknownFields unknownfields)
    {
        this(codedinputstream, extensionregistrylite);
    }
}
