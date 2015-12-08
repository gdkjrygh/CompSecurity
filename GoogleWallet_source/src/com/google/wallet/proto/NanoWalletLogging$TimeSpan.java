// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    private static volatile eTo _emptyArray[];
    public Long elapsedTimeMillis;
    public Long endTimeMillis;
    public String label;
    public Long startTimeMillis;
    public eTo subSpan[];
    public Integer timingSource;

    private clear clear()
    {
        label = null;
        startTimeMillis = null;
        endTimeMillis = null;
        elapsedTimeMillis = null;
        timingSource = null;
        subSpan = emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private static cachedSize[] emptyArray()
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
_L9:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   16: 94
    //                   24: 108
    //                   32: 122
    //                   42: 170
    //                   48: 294;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        label = codedinputbytebuffernano.readString();
          goto _L9
_L4:
        startTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L9
_L5:
        endTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L9
_L6:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            timingSource = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
        _emptyArray a_lemptyarray[];
        int k;
        if (subSpan == null)
        {
            k = 0;
        } else
        {
            k = subSpan.length;
        }
        a_lemptyarray = new subSpan[k + l];
        l = k;
        if (k != 0)
        {
            System.arraycopy(subSpan, 0, a_lemptyarray, 0, k);
            l = k;
        }
        for (; l < a_lemptyarray.length - 1; l++)
        {
            a_lemptyarray[l] = new <init>();
            codedinputbytebuffernano.readMessage(a_lemptyarray[l]);
            codedinputbytebuffernano.readTag();
        }

        a_lemptyarray[l] = new <init>();
        codedinputbytebuffernano.readMessage(a_lemptyarray[l]);
        subSpan = a_lemptyarray;
        continue; /* Loop/switch isn't completed */
_L8:
        elapsedTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
        if (true) goto _L9; else goto _L10
_L10:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (label != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, label);
        }
        j = i;
        if (startTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, startTimeMillis.longValue());
        }
        int k = j;
        if (endTimeMillis != null)
        {
            k = j + CodedOutputByteBufferNano.computeInt64Size(3, endTimeMillis.longValue());
        }
        i = k;
        if (timingSource != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt32Size(4, timingSource.intValue());
        }
        j = i;
        if (subSpan != null)
        {
            j = i;
            if (subSpan.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= subSpan.length)
                    {
                        break;
                    }
                    eadInt64 eadint64 = subSpan[l];
                    j = i;
                    if (eadint64 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(5, eadint64);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (elapsedTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(6, elapsedTimeMillis.longValue());
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
        if (label != null)
        {
            codedoutputbytebuffernano.writeString(1, label);
        }
        if (startTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(2, startTimeMillis.longValue());
        }
        if (endTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(3, endTimeMillis.longValue());
        }
        if (timingSource != null)
        {
            codedoutputbytebuffernano.writeInt32(4, timingSource.intValue());
        }
        if (subSpan != null && subSpan.length > 0)
        {
            for (int i = 0; i < subSpan.length; i++)
            {
                mergeFrom mergefrom = subSpan[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, mergefrom);
                }
            }

        }
        if (elapsedTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(6, elapsedTimeMillis.longValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
