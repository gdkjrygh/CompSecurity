// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    public Integer status;
    public String statusDetails;
    public statusHelpLink statusHelpLink;
    public String statusSummary;

    private clear clear()
    {
        statusSummary = null;
        statusDetails = null;
        status = null;
        statusHelpLink = null;
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
    //                   18: 78
    //                   24: 89
    //                   34: 166;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        statusSummary = codedinputbytebuffernano.readString();
          goto _L7
_L4:
        statusDetails = codedinputbytebuffernano.readString();
          goto _L7
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            status = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (statusHelpLink == null)
        {
            statusHelpLink = new statusHelpLink();
        }
        codedinputbytebuffernano.readMessage(statusHelpLink);
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (statusSummary != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, statusSummary);
        }
        j = i;
        if (statusDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, statusDetails);
        }
        i = j;
        if (status != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, status.intValue());
        }
        j = i;
        if (statusHelpLink != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, statusHelpLink);
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
        if (statusSummary != null)
        {
            codedoutputbytebuffernano.writeString(1, statusSummary);
        }
        if (statusDetails != null)
        {
            codedoutputbytebuffernano.writeString(2, statusDetails);
        }
        if (status != null)
        {
            codedoutputbytebuffernano.writeInt32(3, status.intValue());
        }
        if (statusHelpLink != null)
        {
            codedoutputbytebuffernano.writeMessage(4, statusHelpLink);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
