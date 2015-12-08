// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletSetup

public static final class clear extends ExtendableMessageNano
{

    public String acceptedTosId;
    public com.google.wallet.proto.nse.callError callError;
    public Integer errorCode;
    public com.google.wallet.proto.nse.callError globalResources;
    public Long globalResourcesFingerprint;
    public Integer numSyncedInstruments;
    public Boolean pinAuthenticationRequired;

    private clear clear()
    {
        errorCode = null;
        callError = null;
        globalResources = null;
        globalResourcesFingerprint = null;
        acceptedTosId = null;
        numSyncedInstruments = null;
        pinAuthenticationRequired = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L10:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   16: 120
    //                   26: 134
    //                   32: 145
    //                   40: 159
    //                   48: 173
    //                   58: 214;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        if (globalResources == null)
        {
            globalResources = new com.google.wallet.proto.init>();
        }
        codedinputbytebuffernano.readMessage(globalResources);
          goto _L10
_L4:
        globalResourcesFingerprint = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L10
_L5:
        acceptedTosId = codedinputbytebuffernano.readString();
          goto _L10
_L6:
        numSyncedInstruments = Integer.valueOf(codedinputbytebuffernano.readInt32());
          goto _L10
_L7:
        pinAuthenticationRequired = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L10
_L8:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            errorCode = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (callError == null)
        {
            callError = new com.google.wallet.proto.nse.callError();
        }
        codedinputbytebuffernano.readMessage(callError);
        if (true) goto _L10; else goto _L11
_L11:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (globalResources != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, globalResources);
        }
        j = i;
        if (globalResourcesFingerprint != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, globalResourcesFingerprint.longValue());
        }
        i = j;
        if (acceptedTosId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, acceptedTosId);
        }
        j = i;
        if (numSyncedInstruments != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, numSyncedInstruments.intValue());
        }
        i = j;
        if (pinAuthenticationRequired != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(5, pinAuthenticationRequired.booleanValue());
        }
        j = i;
        if (errorCode != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(6, errorCode.intValue());
        }
        i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, callError);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (globalResources != null)
        {
            codedoutputbytebuffernano.writeMessage(1, globalResources);
        }
        if (globalResourcesFingerprint != null)
        {
            codedoutputbytebuffernano.writeInt64(2, globalResourcesFingerprint.longValue());
        }
        if (acceptedTosId != null)
        {
            codedoutputbytebuffernano.writeString(3, acceptedTosId);
        }
        if (numSyncedInstruments != null)
        {
            codedoutputbytebuffernano.writeInt32(4, numSyncedInstruments.intValue());
        }
        if (pinAuthenticationRequired != null)
        {
            codedoutputbytebuffernano.writeBool(5, pinAuthenticationRequired.booleanValue());
        }
        if (errorCode != null)
        {
            codedoutputbytebuffernano.writeInt32(6, errorCode.intValue());
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(7, callError);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
