// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.purchaserecord.definitions;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.customer.purchaserecord.definitions:
//            NanoP2pDetails

public static final class clear extends ExtendableMessageNano
{

    public Integer dayOfMonth;
    public Integer dayOfWeek;
    public Integer intervalUnit;
    public Integer period;

    private clear clear()
    {
        intervalUnit = null;
        period = null;
        dayOfWeek = null;
        dayOfMonth = null;
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
    //                   16: 110
    //                   24: 124
    //                   32: 186;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            intervalUnit = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        period = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L5:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            dayOfWeek = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        dayOfMonth = Integer.valueOf(codedinputbytebuffernano.readInt32());
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (intervalUnit != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, intervalUnit.intValue());
        }
        j = i;
        if (period != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, period.intValue());
        }
        i = j;
        if (dayOfWeek != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, dayOfWeek.intValue());
        }
        j = i;
        if (dayOfMonth != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, dayOfMonth.intValue());
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
        if (intervalUnit != null)
        {
            codedoutputbytebuffernano.writeInt32(1, intervalUnit.intValue());
        }
        if (period != null)
        {
            codedoutputbytebuffernano.writeInt32(2, period.intValue());
        }
        if (dayOfWeek != null)
        {
            codedoutputbytebuffernano.writeInt32(3, dayOfWeek.intValue());
        }
        if (dayOfMonth != null)
        {
            codedoutputbytebuffernano.writeInt32(4, dayOfMonth.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public a()
    {
        clear();
    }
}
