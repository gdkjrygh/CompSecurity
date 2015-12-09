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
//            NanoWalletWobl

public static final class clear extends ExtendableMessageNano
{

    public Integer minimumDimension;
    public Integer orientation;
    public Integer theme;
    public Integer woblVersion;

    private clear clear()
    {
        woblVersion = null;
        minimumDimension = null;
        orientation = null;
        theme = null;
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
    //                   16: 67
    //                   24: 81
    //                   32: 126
    //                   40: 140;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        minimumDimension = Integer.valueOf(codedinputbytebuffernano.readInt32());
          goto _L7
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            orientation = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        woblVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L6:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            theme = Integer.valueOf(k);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (minimumDimension != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(2, minimumDimension.intValue());
        }
        j = i;
        if (orientation != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(3, orientation.intValue());
        }
        i = j;
        if (woblVersion != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(4, woblVersion.intValue());
        }
        j = i;
        if (theme != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(5, theme.intValue());
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
        if (minimumDimension != null)
        {
            codedoutputbytebuffernano.writeInt32(2, minimumDimension.intValue());
        }
        if (orientation != null)
        {
            codedoutputbytebuffernano.writeInt32(3, orientation.intValue());
        }
        if (woblVersion != null)
        {
            codedoutputbytebuffernano.writeInt32(4, woblVersion.intValue());
        }
        if (theme != null)
        {
            codedoutputbytebuffernano.writeInt32(5, theme.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
