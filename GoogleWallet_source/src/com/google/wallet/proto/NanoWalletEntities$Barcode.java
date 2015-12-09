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
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public String text;
    public Integer type;
    public String value;

    private clear clear()
    {
        type = null;
        value = null;
        text = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 158
    //                   26: 169;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
            type = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        value = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        text = codedinputbytebuffernano.readString();
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (type != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, type.intValue());
        }
        j = i;
        if (value != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, value);
        }
        i = j;
        if (text != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, text);
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
        if (type != null)
        {
            codedoutputbytebuffernano.writeInt32(1, type.intValue());
        }
        if (value != null)
        {
            codedoutputbytebuffernano.writeString(2, value);
        }
        if (text != null)
        {
            codedoutputbytebuffernano.writeString(3, text);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
