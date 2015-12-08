// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoView

public static final class clear extends ExtendableMessageNano
{

    public nderable actionRenderable[];
    public String listAmount;
    public Integer listAmountStyle;
    public String listImageUrl;
    public String listLabel;
    public Integer listStyle;
    public String listTitle;
    public nderable row[];
    public com.google.checkout.customer.common.definitions.me transactionTime;

    private clear clear()
    {
        listTitle = null;
        listLabel = null;
        transactionTime = null;
        listAmount = null;
        listImageUrl = null;
        listAmountStyle = null;
        row = rray();
        listStyle = null;
        actionRenderable = nderable.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L12:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 118
    //                   26: 129
    //                   34: 158
    //                   42: 169
    //                   58: 293
    //                   64: 304
    //                   72: 346
    //                   82: 390;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        listTitle = codedinputbytebuffernano.readString();
          goto _L12
_L4:
        listLabel = codedinputbytebuffernano.readString();
          goto _L12
_L5:
        if (transactionTime == null)
        {
            transactionTime = new com.google.checkout.customer.common.definitions.me();
        }
        codedinputbytebuffernano.readMessage(transactionTime);
          goto _L12
_L6:
        listAmount = codedinputbytebuffernano.readString();
          goto _L12
_L7:
        int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
        cachedSize acachedsize[];
        int j;
        if (row == null)
        {
            j = 0;
        } else
        {
            j = row.length;
        }
        acachedsize = new row[j + j1];
        j1 = j;
        if (j != 0)
        {
            System.arraycopy(row, 0, acachedsize, 0, j);
            j1 = j;
        }
        for (; j1 < acachedsize.length - 1; j1++)
        {
            acachedsize[j1] = new ();
            codedinputbytebuffernano.readMessage(acachedsize[j1]);
            codedinputbytebuffernano.readTag();
        }

        acachedsize[j1] = new ();
        codedinputbytebuffernano.readMessage(acachedsize[j1]);
        row = acachedsize;
          goto _L12
_L8:
        listImageUrl = codedinputbytebuffernano.readString();
          goto _L12
_L9:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
            listAmountStyle = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        int l = codedinputbytebuffernano.readInt32();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
            listStyle = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 82);
        nderable anderable[];
        int i1;
        if (actionRenderable == null)
        {
            i1 = 0;
        } else
        {
            i1 = actionRenderable.length;
        }
        anderable = new nderable[i1 + k1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(actionRenderable, 0, anderable, 0, i1);
            k1 = i1;
        }
        for (; k1 < anderable.length - 1; k1++)
        {
            anderable[k1] = new nderable();
            codedinputbytebuffernano.readMessage(anderable[k1]);
            codedinputbytebuffernano.readTag();
        }

        anderable[k1] = new nderable();
        codedinputbytebuffernano.readMessage(anderable[k1]);
        actionRenderable = anderable;
        if (true) goto _L12; else goto _L13
_L13:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (listTitle != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, listTitle);
        }
        j = i;
        if (listLabel != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, listLabel);
        }
        int l = j;
        if (transactionTime != null)
        {
            l = j + CodedOutputByteBufferNano.computeMessageSize(3, transactionTime);
        }
        i = l;
        if (listAmount != null)
        {
            i = l + CodedOutputByteBufferNano.computeStringSize(4, listAmount);
        }
        j = i;
        if (row != null)
        {
            j = i;
            if (row.length > 0)
            {
                l = 0;
                do
                {
                    j = i;
                    if (l >= row.length)
                    {
                        break;
                    }
                    actionRenderable actionrenderable = row[l];
                    j = i;
                    if (actionrenderable != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(5, actionrenderable);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (listImageUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, listImageUrl);
        }
        j = i;
        if (listAmountStyle != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(8, listAmountStyle.intValue());
        }
        i = j;
        if (listStyle != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(9, listStyle.intValue());
        }
        l = i;
        if (actionRenderable != null)
        {
            l = i;
            if (actionRenderable.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= actionRenderable.length)
                    {
                        break;
                    }
                    nderable nderable = actionRenderable[k];
                    l = i;
                    if (nderable != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(10, nderable);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (listTitle != null)
        {
            codedoutputbytebuffernano.writeString(1, listTitle);
        }
        if (listLabel != null)
        {
            codedoutputbytebuffernano.writeString(2, listLabel);
        }
        if (transactionTime != null)
        {
            codedoutputbytebuffernano.writeMessage(3, transactionTime);
        }
        if (listAmount != null)
        {
            codedoutputbytebuffernano.writeString(4, listAmount);
        }
        if (row != null && row.length > 0)
        {
            for (int i = 0; i < row.length; i++)
            {
                mergeFrom mergefrom = row[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, mergefrom);
                }
            }

        }
        if (listImageUrl != null)
        {
            codedoutputbytebuffernano.writeString(7, listImageUrl);
        }
        if (listAmountStyle != null)
        {
            codedoutputbytebuffernano.writeInt32(8, listAmountStyle.intValue());
        }
        if (listStyle != null)
        {
            codedoutputbytebuffernano.writeInt32(9, listStyle.intValue());
        }
        if (actionRenderable != null && actionRenderable.length > 0)
        {
            for (int j = 0; j < actionRenderable.length; j++)
            {
                nderable nderable = actionRenderable[j];
                if (nderable != null)
                {
                    codedoutputbytebuffernano.writeMessage(10, nderable);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
