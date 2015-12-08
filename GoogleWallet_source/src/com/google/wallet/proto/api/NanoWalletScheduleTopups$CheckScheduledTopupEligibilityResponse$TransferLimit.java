// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletScheduleTopups

public static final class clear extends ExtendableMessageNano
{

    private static volatile maximumTopupAmount _emptyArray[];
    public com.google.wallet.proto.mit maximumTopupAmount;
    public com.google.wallet.proto.mit minimumTopupAmount;
    public Integer recurrence;

    private clear clear()
    {
        recurrence = null;
        minimumTopupAmount = null;
        maximumTopupAmount = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 110
    //                   26: 139;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
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
            recurrence = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (minimumTopupAmount == null)
        {
            minimumTopupAmount = new com.google.wallet.proto.mit.minimumTopupAmount();
        }
        codedinputbytebuffernano.readMessage(minimumTopupAmount);
        continue; /* Loop/switch isn't completed */
_L5:
        if (maximumTopupAmount == null)
        {
            maximumTopupAmount = new com.google.wallet.proto.mit.maximumTopupAmount();
        }
        codedinputbytebuffernano.readMessage(maximumTopupAmount);
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (recurrence != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, recurrence.intValue());
        }
        j = i;
        if (minimumTopupAmount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, minimumTopupAmount);
        }
        i = j;
        if (maximumTopupAmount != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, maximumTopupAmount);
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
        if (recurrence != null)
        {
            codedoutputbytebuffernano.writeInt32(1, recurrence.intValue());
        }
        if (minimumTopupAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(2, minimumTopupAmount);
        }
        if (maximumTopupAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(3, maximumTopupAmount);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
