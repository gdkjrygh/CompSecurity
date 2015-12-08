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
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{
    public static final class LockingInfo extends ExtendableMessageNano
    {

        public Integer lockingStatus;
        public Long lockingTimestampMillis;

        private LockingInfo clear()
        {
            lockingStatus = null;
            lockingTimestampMillis = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LockingInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       16: 98;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                lockingStatus = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            lockingTimestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (lockingStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, lockingStatus.intValue());
            }
            j = i;
            if (lockingTimestampMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, lockingTimestampMillis.longValue());
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
            if (lockingStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(1, lockingStatus.intValue());
            }
            if (lockingTimestampMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, lockingTimestampMillis.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LockingInfo()
        {
            clear();
        }
    }


    private static volatile o _emptyArray[];
    public tifier backingInstrumentId[];
    public Long cancellationTimestampMillis;
    public String cardNumberLast4;
    public tifier cdpProxyId;
    public tifier id;
    public LockingInfo lockingInfo;
    public Integer network;
    public Integer status;

    private o clear()
    {
        id = null;
        backingInstrumentId = tifier.emptyArray();
        cdpProxyId = null;
        network = null;
        cardNumberLast4 = null;
        status = null;
        cancellationTimestampMillis = null;
        lockingInfo = null;
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
_L11:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   18: 128
    //                   26: 252
    //                   32: 281
    //                   42: 330
    //                   48: 341
    //                   56: 394
    //                   66: 408;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (id == null)
        {
            id = new tifier();
        }
        codedinputbytebuffernano.readMessage(id);
          goto _L11
_L4:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
        tifier atifier[];
        int j;
        if (backingInstrumentId == null)
        {
            j = 0;
        } else
        {
            j = backingInstrumentId.length;
        }
        atifier = new tifier[j + i1];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(backingInstrumentId, 0, atifier, 0, j);
            i1 = j;
        }
        for (; i1 < atifier.length - 1; i1++)
        {
            atifier[i1] = new tifier();
            codedinputbytebuffernano.readMessage(atifier[i1]);
            codedinputbytebuffernano.readTag();
        }

        atifier[i1] = new tifier();
        codedinputbytebuffernano.readMessage(atifier[i1]);
        backingInstrumentId = atifier;
          goto _L11
_L5:
        if (cdpProxyId == null)
        {
            cdpProxyId = new <init>();
        }
        codedinputbytebuffernano.readMessage(cdpProxyId);
          goto _L11
_L6:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            network = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        cardNumberLast4 = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L8:
        int l = codedinputbytebuffernano.readInt32();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            status = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        cancellationTimestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L10:
        if (lockingInfo == null)
        {
            lockingInfo = new LockingInfo();
        }
        codedinputbytebuffernano.readMessage(lockingInfo);
        if (true) goto _L11; else goto _L12
_L12:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
        }
        j = i;
        if (backingInstrumentId != null)
        {
            j = i;
            if (backingInstrumentId.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= backingInstrumentId.length)
                    {
                        break;
                    }
                    tifier tifier = backingInstrumentId[k];
                    j = i;
                    if (tifier != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, tifier);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (cdpProxyId != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, cdpProxyId);
        }
        j = i;
        if (network != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, network.intValue());
        }
        i = j;
        if (cardNumberLast4 != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, cardNumberLast4);
        }
        j = i;
        if (status != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(6, status.intValue());
        }
        i = j;
        if (cancellationTimestampMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(7, cancellationTimestampMillis.longValue());
        }
        j = i;
        if (lockingInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(8, lockingInfo);
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
        if (id != null)
        {
            codedoutputbytebuffernano.writeMessage(1, id);
        }
        if (backingInstrumentId != null && backingInstrumentId.length > 0)
        {
            for (int i = 0; i < backingInstrumentId.length; i++)
            {
                tifier tifier = backingInstrumentId[i];
                if (tifier != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, tifier);
                }
            }

        }
        if (cdpProxyId != null)
        {
            codedoutputbytebuffernano.writeMessage(3, cdpProxyId);
        }
        if (network != null)
        {
            codedoutputbytebuffernano.writeInt32(4, network.intValue());
        }
        if (cardNumberLast4 != null)
        {
            codedoutputbytebuffernano.writeString(5, cardNumberLast4);
        }
        if (status != null)
        {
            codedoutputbytebuffernano.writeInt32(6, status.intValue());
        }
        if (cancellationTimestampMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(7, cancellationTimestampMillis.longValue());
        }
        if (lockingInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(8, lockingInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public LockingInfo.clear()
    {
        clear();
    }
}
