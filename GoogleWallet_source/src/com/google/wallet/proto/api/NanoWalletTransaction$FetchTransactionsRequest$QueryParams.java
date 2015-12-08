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
//            NanoWalletTransaction

public static final class clear extends ExtendableMessageNano
{

    private static volatile byIds _emptyArray[];
    public byIds byIds;
    public byIds byLookupIds;
    public te byPendingState;
    public te paginationCriteria;
    public Integer type;

    private clear clear()
    {
        paginationCriteria = null;
        type = null;
        byLookupIds = null;
        byIds = null;
        byPendingState = null;
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
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   16: 104
    //                   26: 178
    //                   34: 207
    //                   50: 236;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (paginationCriteria == null)
        {
            paginationCriteria = new paginationCriteria();
        }
        codedinputbytebuffernano.readMessage(paginationCriteria);
          goto _L8
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 9: // '\t'
        case 10: // '\n'
            type = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (byLookupIds == null)
        {
            byLookupIds = new <init>();
        }
        codedinputbytebuffernano.readMessage(byLookupIds);
        continue; /* Loop/switch isn't completed */
_L6:
        if (byPendingState == null)
        {
            byPendingState = new te();
        }
        codedinputbytebuffernano.readMessage(byPendingState);
        continue; /* Loop/switch isn't completed */
_L7:
        if (byIds == null)
        {
            byIds = new ();
        }
        codedinputbytebuffernano.readMessage(byIds);
        if (true) goto _L8; else goto _L9
_L9:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (paginationCriteria != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, paginationCriteria);
        }
        j = i;
        if (type != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, type.intValue());
        }
        i = j;
        if (byLookupIds != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, byLookupIds);
        }
        j = i;
        if (byPendingState != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, byPendingState);
        }
        i = j;
        if (byIds != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(6, byIds);
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
        if (paginationCriteria != null)
        {
            codedoutputbytebuffernano.writeMessage(1, paginationCriteria);
        }
        if (type != null)
        {
            codedoutputbytebuffernano.writeInt32(2, type.intValue());
        }
        if (byLookupIds != null)
        {
            codedoutputbytebuffernano.writeMessage(3, byLookupIds);
        }
        if (byPendingState != null)
        {
            codedoutputbytebuffernano.writeMessage(4, byPendingState);
        }
        if (byIds != null)
        {
            codedoutputbytebuffernano.writeMessage(6, byIds);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public te()
    {
        clear();
    }
}
