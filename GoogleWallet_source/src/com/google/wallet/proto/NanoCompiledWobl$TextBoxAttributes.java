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
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{

    public numLines lineHeight;
    public Integer maxLines;
    public Integer numLines;
    public Integer overflow;

    private clear clear()
    {
        lineHeight = null;
        overflow = null;
        maxLines = null;
        numLines = null;
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
    //                   10: 67
    //                   16: 96
    //                   24: 138
    //                   32: 152;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (lineHeight == null)
        {
            lineHeight = new lineHeight();
        }
        codedinputbytebuffernano.readMessage(lineHeight);
          goto _L7
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            overflow = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        maxLines = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L6:
        numLines = Integer.valueOf(codedinputbytebuffernano.readInt32());
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (lineHeight != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, lineHeight);
        }
        j = i;
        if (overflow != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, overflow.intValue());
        }
        i = j;
        if (maxLines != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, maxLines.intValue());
        }
        j = i;
        if (numLines != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, numLines.intValue());
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
        if (lineHeight != null)
        {
            codedoutputbytebuffernano.writeMessage(1, lineHeight);
        }
        if (overflow != null)
        {
            codedoutputbytebuffernano.writeInt32(2, overflow.intValue());
        }
        if (maxLines != null)
        {
            codedoutputbytebuffernano.writeInt32(3, maxLines.intValue());
        }
        if (numLines != null)
        {
            codedoutputbytebuffernano.writeInt32(4, numLines.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
