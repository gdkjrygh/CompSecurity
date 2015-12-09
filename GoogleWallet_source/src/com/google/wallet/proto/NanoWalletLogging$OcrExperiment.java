// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    private static volatile attribution _emptyArray[];
    public attribution attribution;
    public Integer field;
    public Integer status;
    public String subType;

    private clear clear()
    {
        subType = null;
        field = null;
        status = null;
        attribution = null;
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
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   16: 78
    //                   24: 126
    //                   34: 178;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        subType = codedinputbytebuffernano.readString();
          goto _L7
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            field = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            status = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (attribution == null)
        {
            attribution = new <init>();
        }
        codedinputbytebuffernano.readMessage(attribution);
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (subType != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, subType);
        }
        j = i;
        if (field != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, field.intValue());
        }
        i = j;
        if (status != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, status.intValue());
        }
        j = i;
        if (attribution != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, attribution);
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
        if (subType != null)
        {
            codedoutputbytebuffernano.writeString(1, subType);
        }
        if (field != null)
        {
            codedoutputbytebuffernano.writeInt32(2, field.intValue());
        }
        if (status != null)
        {
            codedoutputbytebuffernano.writeInt32(3, status.intValue());
        }
        if (attribution != null)
        {
            codedoutputbytebuffernano.writeMessage(4, attribution);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
