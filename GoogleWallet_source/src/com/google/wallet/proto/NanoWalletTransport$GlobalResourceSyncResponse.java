// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletTransport

public static final class clear extends ExtendableMessageNano
{

    public syncStatusDetails globalResources;
    public Long globalResourcesFingerprint;
    public Integer syncStatus;
    public String syncStatusDetails;
    public Integer transportVersion;

    private clear clear()
    {
        globalResources = null;
        globalResourcesFingerprint = null;
        transportVersion = null;
        syncStatus = null;
        syncStatusDetails = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   16: 104
    //                   24: 174
    //                   32: 188
    //                   42: 242;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (globalResources == null)
        {
            globalResources = new globalResources();
        }
        codedinputbytebuffernano.readMessage(globalResources);
          goto _L8
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 101: // 'e'
            transportVersion = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        globalResourcesFingerprint = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L6:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            syncStatus = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        syncStatusDetails = codedinputbytebuffernano.readString();
        if (true) goto _L8; else goto _L9
_L9:
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
        if (transportVersion != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, transportVersion.intValue());
        }
        i = j;
        if (globalResourcesFingerprint != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, globalResourcesFingerprint.longValue());
        }
        j = i;
        if (syncStatus != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, syncStatus.intValue());
        }
        i = j;
        if (syncStatusDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, syncStatusDetails);
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
        if (transportVersion != null)
        {
            codedoutputbytebuffernano.writeInt32(2, transportVersion.intValue());
        }
        if (globalResourcesFingerprint != null)
        {
            codedoutputbytebuffernano.writeInt64(3, globalResourcesFingerprint.longValue());
        }
        if (syncStatus != null)
        {
            codedoutputbytebuffernano.writeInt32(4, syncStatus.intValue());
        }
        if (syncStatusDetails != null)
        {
            codedoutputbytebuffernano.writeString(5, syncStatusDetails);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
