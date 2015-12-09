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
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    public Integer networkState;
    public Integer networkType;
    public Integer signalLevel;
    public Integer signalStrength;

    private clear clear()
    {
        networkType = null;
        signalStrength = null;
        signalLevel = null;
        networkState = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 122
    //                   24: 136
    //                   32: 150;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            networkType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        signalStrength = Integer.valueOf(codedinputbytebuffernano.readSInt32());
        continue; /* Loop/switch isn't completed */
_L5:
        signalLevel = Integer.valueOf(codedinputbytebuffernano.readInt32());
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
        case 5: // '\005'
            networkState = Integer.valueOf(k);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (networkType != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, networkType.intValue());
        }
        j = i;
        if (signalStrength != null)
        {
            j = i + CodedOutputByteBufferNano.computeSInt32Size(2, signalStrength.intValue());
        }
        i = j;
        if (signalLevel != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, signalLevel.intValue());
        }
        j = i;
        if (networkState != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, networkState.intValue());
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (networkType != null)
        {
            codedoutputbytebuffernano.writeInt32(1, networkType.intValue());
        }
        if (signalStrength != null)
        {
            codedoutputbytebuffernano.writeSInt32(2, signalStrength.intValue());
        }
        if (signalLevel != null)
        {
            codedoutputbytebuffernano.writeInt32(3, signalLevel.intValue());
        }
        if (networkState != null)
        {
            codedoutputbytebuffernano.writeInt32(4, networkState.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
