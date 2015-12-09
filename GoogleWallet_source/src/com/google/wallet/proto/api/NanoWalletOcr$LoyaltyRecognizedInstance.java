// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletOcr

public static final class clear extends ExtendableMessageNano
{

    public barcode barcode[];
    public String discoverableProgramId;
    public barcode linkingId[];
    public barcode merchantName;
    public barcode programName;

    private clear clear()
    {
        discoverableProgramId = null;
        programName = null;
        merchantName = null;
        linkingId = rray();
        barcode = ay();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                discoverableProgramId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                if (programName == null)
                {
                    programName = new ();
                }
                codedinputbytebuffernano.readMessage(programName);
                break;

            case 26: // '\032'
                if (merchantName == null)
                {
                    merchantName = new ();
                }
                codedinputbytebuffernano.readMessage(merchantName);
                break;

            case 34: // '"'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                cachedSize acachedsize[];
                int j;
                if (linkingId == null)
                {
                    j = 0;
                } else
                {
                    j = linkingId.length;
                }
                acachedsize = new linkingId[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(linkingId, 0, acachedsize, 0, j);
                    l = j;
                }
                for (; l < acachedsize.length - 1; l++)
                {
                    acachedsize[l] = new ();
                    codedinputbytebuffernano.readMessage(acachedsize[l]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[l] = new ();
                codedinputbytebuffernano.readMessage(acachedsize[l]);
                linkingId = acachedsize;
                break;

            case 42: // '*'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                cachedSize acachedsize1[];
                int k;
                if (barcode == null)
                {
                    k = 0;
                } else
                {
                    k = barcode.length;
                }
                acachedsize1 = new barcode[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(barcode, 0, acachedsize1, 0, k);
                    i1 = k;
                }
                for (; i1 < acachedsize1.length - 1; i1++)
                {
                    acachedsize1[i1] = new barcode();
                    codedinputbytebuffernano.readMessage(acachedsize1[i1]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize1[i1] = new barcode();
                codedinputbytebuffernano.readMessage(acachedsize1[i1]);
                barcode = acachedsize1;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (discoverableProgramId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, discoverableProgramId);
        }
        int l = i;
        if (programName != null)
        {
            l = i + CodedOutputByteBufferNano.computeMessageSize(2, programName);
        }
        j = l;
        if (merchantName != null)
        {
            j = l + CodedOutputByteBufferNano.computeMessageSize(3, merchantName);
        }
        i = j;
        if (linkingId != null)
        {
            i = j;
            if (linkingId.length > 0)
            {
                l = 0;
                do
                {
                    i = j;
                    if (l >= linkingId.length)
                    {
                        break;
                    }
                    barcode barcode1 = linkingId[l];
                    i = j;
                    if (barcode1 != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(4, barcode1);
                    }
                    l++;
                    j = i;
                } while (true);
            }
        }
        l = i;
        if (barcode != null)
        {
            l = i;
            if (barcode.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= barcode.length)
                    {
                        break;
                    }
                    barcode barcode2 = barcode[k];
                    l = i;
                    if (barcode2 != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(5, barcode2);
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
        if (discoverableProgramId != null)
        {
            codedoutputbytebuffernano.writeString(1, discoverableProgramId);
        }
        if (programName != null)
        {
            codedoutputbytebuffernano.writeMessage(2, programName);
        }
        if (merchantName != null)
        {
            codedoutputbytebuffernano.writeMessage(3, merchantName);
        }
        if (linkingId != null && linkingId.length > 0)
        {
            for (int i = 0; i < linkingId.length; i++)
            {
                mergeFrom mergefrom = linkingId[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, mergefrom);
                }
            }

        }
        if (barcode != null && barcode.length > 0)
        {
            for (int j = 0; j < barcode.length; j++)
            {
                mergeFrom mergefrom1 = barcode[j];
                if (mergefrom1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, mergefrom1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public I()
    {
        clear();
    }
}
