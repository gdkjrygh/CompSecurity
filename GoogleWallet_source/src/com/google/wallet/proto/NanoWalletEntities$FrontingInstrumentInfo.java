// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public cashWithdrawalDetails cashWithdrawalDetails;
    public Integer consistencyState;
    public cashWithdrawalDetails fundingSources[];
    public cashWithdrawalDetails nfcFrontingInstrumentDetails;
    public  plasticFrontingInstrumentDetails[];

    private clear clear()
    {
        nfcFrontingInstrumentDetails = null;
        plasticFrontingInstrumentDetails = .emptyArray();
        fundingSources = fundingSources();
        consistencyState = null;
        cashWithdrawalDetails = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   18: 104
    //                   26: 228
    //                   32: 352
    //                   42: 394;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (nfcFrontingInstrumentDetails == null)
        {
            nfcFrontingInstrumentDetails = new it>();
        }
        codedinputbytebuffernano.readMessage(nfcFrontingInstrumentDetails);
          goto _L8
_L4:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
         a[];
        int j;
        if (plasticFrontingInstrumentDetails == null)
        {
            j = 0;
        } else
        {
            j = plasticFrontingInstrumentDetails.length;
        }
        a = new [j + i1];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(plasticFrontingInstrumentDetails, 0, a, 0, j);
            i1 = j;
        }
        for (; i1 < a.length - 1; i1++)
        {
            a[i1] = new ();
            codedinputbytebuffernano.readMessage(a[i1]);
            codedinputbytebuffernano.readTag();
        }

        a[i1] = new ();
        codedinputbytebuffernano.readMessage(a[i1]);
        plasticFrontingInstrumentDetails = a;
          goto _L8
_L5:
        int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
         a1[];
        int k;
        if (fundingSources == null)
        {
            k = 0;
        } else
        {
            k = fundingSources.length;
        }
        a1 = new fundingSources[k + j1];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(fundingSources, 0, a1, 0, k);
            j1 = k;
        }
        for (; j1 < a1.length - 1; j1++)
        {
            a1[j1] = new fundingSources();
            codedinputbytebuffernano.readMessage(a1[j1]);
            codedinputbytebuffernano.readTag();
        }

        a1[j1] = new fundingSources();
        codedinputbytebuffernano.readMessage(a1[j1]);
        fundingSources = a1;
          goto _L8
_L6:
        int l = codedinputbytebuffernano.readInt32();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
            consistencyState = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (cashWithdrawalDetails == null)
        {
            cashWithdrawalDetails = new init>();
        }
        codedinputbytebuffernano.readMessage(cashWithdrawalDetails);
        if (true) goto _L8; else goto _L9
_L9:
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (nfcFrontingInstrumentDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, nfcFrontingInstrumentDetails);
        }
        i = j;
        if (plasticFrontingInstrumentDetails != null)
        {
            i = j;
            if (plasticFrontingInstrumentDetails.length > 0)
            {
                int k = 0;
                do
                {
                    i = j;
                    if (k >= plasticFrontingInstrumentDetails.length)
                    {
                        break;
                    }
                      = plasticFrontingInstrumentDetails[k];
                    i = j;
                    if ( != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(2, );
                    }
                    k++;
                    j = i;
                } while (true);
            }
        }
        j = i;
        if (fundingSources != null)
        {
            j = i;
            if (fundingSources.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= fundingSources.length)
                    {
                        break;
                    }
                     1 = fundingSources[l];
                    j = i;
                    if (1 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(3, 1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (consistencyState != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(4, consistencyState.intValue());
        }
        j = i;
        if (cashWithdrawalDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(5, cashWithdrawalDetails);
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
        if (nfcFrontingInstrumentDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(1, nfcFrontingInstrumentDetails);
        }
        if (plasticFrontingInstrumentDetails != null && plasticFrontingInstrumentDetails.length > 0)
        {
            for (int i = 0; i < plasticFrontingInstrumentDetails.length; i++)
            {
                  = plasticFrontingInstrumentDetails[i];
                if ( != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, );
                }
            }

        }
        if (fundingSources != null && fundingSources.length > 0)
        {
            for (int j = 0; j < fundingSources.length; j++)
            {
                 1 = fundingSources[j];
                if (1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, 1);
                }
            }

        }
        if (consistencyState != null)
        {
            codedoutputbytebuffernano.writeInt32(4, consistencyState.intValue());
        }
        if (cashWithdrawalDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(5, cashWithdrawalDetails);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
