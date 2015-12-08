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
//            NanoWalletShared

public static final class clear extends ExtendableMessageNano
{

    public Integer method;
    public String oneTimeKeyPayload;
    public String payload;
    public Integer secureDataType;
    public String sessionMaterial;

    private clear clear()
    {
        payload = null;
        sessionMaterial = null;
        method = null;
        secureDataType = null;
        oneTimeKeyPayload = null;
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
    //                   18: 86
    //                   24: 97
    //                   32: 142
    //                   42: 156;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        payload = codedinputbytebuffernano.readString();
          goto _L8
_L4:
        sessionMaterial = codedinputbytebuffernano.readString();
          goto _L8
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            method = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        secureDataType = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L7:
        oneTimeKeyPayload = codedinputbytebuffernano.readString();
        if (true) goto _L8; else goto _L9
_L9:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (payload != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, payload);
        }
        j = i;
        if (sessionMaterial != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, sessionMaterial);
        }
        i = j;
        if (method != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, method.intValue());
        }
        j = i;
        if (secureDataType != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, secureDataType.intValue());
        }
        i = j;
        if (oneTimeKeyPayload != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, oneTimeKeyPayload);
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
        if (payload != null)
        {
            codedoutputbytebuffernano.writeString(1, payload);
        }
        if (sessionMaterial != null)
        {
            codedoutputbytebuffernano.writeString(2, sessionMaterial);
        }
        if (method != null)
        {
            codedoutputbytebuffernano.writeInt32(3, method.intValue());
        }
        if (secureDataType != null)
        {
            codedoutputbytebuffernano.writeInt32(4, secureDataType.intValue());
        }
        if (oneTimeKeyPayload != null)
        {
            codedoutputbytebuffernano.writeString(5, oneTimeKeyPayload);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
