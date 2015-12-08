// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    private static volatile id _emptyArray[];
    public String digitalFulfillmentUrl;
    public String id;
    public Integer lineItemState;
    public String longDescription;
    public String name;
    public com.google.checkout.customer.common.definitions.m netCost;
    public String quantity;
    public String recurrenceId;
    public id shipment[];
    public com.google.checkout.customer.common.definitions.t unitPrice;

    private clear clear()
    {
        name = null;
        id = null;
        quantity = null;
        unitPrice = null;
        netCost = null;
        shipment = emptyArray();
        digitalFulfillmentUrl = null;
        longDescription = null;
        recurrenceId = null;
        lineItemState = null;
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
_L13:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   26: 126
    //                   34: 155
    //                   50: 184
    //                   58: 308
    //                   66: 319
    //                   74: 330
    //                   82: 341
    //                   88: 352
    //                   98: 402;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        name = codedinputbytebuffernano.readString();
          goto _L13
_L4:
        if (unitPrice == null)
        {
            unitPrice = new com.google.checkout.customer.common.definitions.m.unitPrice();
        }
        codedinputbytebuffernano.readMessage(unitPrice);
          goto _L13
_L5:
        if (netCost == null)
        {
            netCost = new com.google.checkout.customer.common.definitions.m.netCost();
        }
        codedinputbytebuffernano.readMessage(netCost);
          goto _L13
_L6:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
        _emptyArray a_lemptyarray[];
        int j;
        if (shipment == null)
        {
            j = 0;
        } else
        {
            j = shipment.length;
        }
        a_lemptyarray = new shipment[j + l];
        l = j;
        if (j != 0)
        {
            System.arraycopy(shipment, 0, a_lemptyarray, 0, j);
            l = j;
        }
        for (; l < a_lemptyarray.length - 1; l++)
        {
            a_lemptyarray[l] = new <init>();
            codedinputbytebuffernano.readMessage(a_lemptyarray[l]);
            codedinputbytebuffernano.readTag();
        }

        a_lemptyarray[l] = new <init>();
        codedinputbytebuffernano.readMessage(a_lemptyarray[l]);
        shipment = a_lemptyarray;
          goto _L13
_L7:
        digitalFulfillmentUrl = codedinputbytebuffernano.readString();
          goto _L13
_L8:
        longDescription = codedinputbytebuffernano.readString();
          goto _L13
_L9:
        recurrenceId = codedinputbytebuffernano.readString();
          goto _L13
_L10:
        quantity = codedinputbytebuffernano.readString();
          goto _L13
_L11:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            lineItemState = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        id = codedinputbytebuffernano.readString();
        if (true) goto _L13; else goto _L14
_L14:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (name != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, name);
        }
        j = i;
        if (unitPrice != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(3, unitPrice);
        }
        i = j;
        if (netCost != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(4, netCost);
        }
        j = i;
        if (shipment != null)
        {
            j = i;
            if (shipment.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= shipment.length)
                    {
                        break;
                    }
                    id id1 = shipment[k];
                    j = i;
                    if (id1 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(6, id1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (digitalFulfillmentUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, digitalFulfillmentUrl);
        }
        j = i;
        if (longDescription != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, longDescription);
        }
        i = j;
        if (recurrenceId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(9, recurrenceId);
        }
        j = i;
        if (quantity != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(10, quantity);
        }
        i = j;
        if (lineItemState != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(11, lineItemState.intValue());
        }
        j = i;
        if (id != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(12, id);
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
        if (name != null)
        {
            codedoutputbytebuffernano.writeString(1, name);
        }
        if (unitPrice != null)
        {
            codedoutputbytebuffernano.writeMessage(3, unitPrice);
        }
        if (netCost != null)
        {
            codedoutputbytebuffernano.writeMessage(4, netCost);
        }
        if (shipment != null && shipment.length > 0)
        {
            for (int i = 0; i < shipment.length; i++)
            {
                mergeFrom mergefrom = shipment[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(6, mergefrom);
                }
            }

        }
        if (digitalFulfillmentUrl != null)
        {
            codedoutputbytebuffernano.writeString(7, digitalFulfillmentUrl);
        }
        if (longDescription != null)
        {
            codedoutputbytebuffernano.writeString(8, longDescription);
        }
        if (recurrenceId != null)
        {
            codedoutputbytebuffernano.writeString(9, recurrenceId);
        }
        if (quantity != null)
        {
            codedoutputbytebuffernano.writeString(10, quantity);
        }
        if (lineItemState != null)
        {
            codedoutputbytebuffernano.writeInt32(11, lineItemState.intValue());
        }
        if (id != null)
        {
            codedoutputbytebuffernano.writeString(12, id);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Y()
    {
        clear();
    }
}
