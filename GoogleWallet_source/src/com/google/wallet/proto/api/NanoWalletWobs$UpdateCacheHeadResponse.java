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
//            NanoWalletWobs

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.callError callError;
    public com.google.wallet.proto.nse.callError changedWob[];
    public Boolean isIncremental;
    public String removedWobId[];
    public callError state;

    private clear clear()
    {
        state = null;
        changedWob = com.google.wallet.proto.y();
        removedWobId = WireFormatNano.EMPTY_STRING_ARRAY;
        isIncremental = null;
        callError = null;
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
                if (state == null)
                {
                    state = new state();
                }
                codedinputbytebuffernano.readMessage(state);
                break;

            case 18: // '\022'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                com.google.wallet.proto.nse anse[];
                int j;
                if (changedWob == null)
                {
                    j = 0;
                } else
                {
                    j = changedWob.length;
                }
                anse = new com.google.wallet.proto.nse.changedWob[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(changedWob, 0, anse, 0, j);
                    l = j;
                }
                for (; l < anse.length - 1; l++)
                {
                    anse[l] = new com.google.wallet.proto.nse.changedWob();
                    codedinputbytebuffernano.readMessage(anse[l]);
                    codedinputbytebuffernano.readTag();
                }

                anse[l] = new com.google.wallet.proto.nse.changedWob();
                codedinputbytebuffernano.readMessage(anse[l]);
                changedWob = anse;
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                String as[];
                int k;
                if (removedWobId == null)
                {
                    k = 0;
                } else
                {
                    k = removedWobId.length;
                }
                as = new String[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(removedWobId, 0, as, 0, k);
                    i1 = k;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[i1] = codedinputbytebuffernano.readString();
                removedWobId = as;
                break;

            case 32: // ' '
                isIncremental = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 42: // '*'
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (state != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, state);
        }
        j = i;
        if (changedWob != null)
        {
            j = i;
            if (changedWob.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= changedWob.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.nse nse = changedWob[k];
                    j = i;
                    if (nse != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, nse);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (removedWobId != null)
        {
            i = j;
            if (removedWobId.length > 0)
            {
                int j1 = 0;
                int l = 0;
                for (i = 0; i < removedWobId.length;)
                {
                    String s = removedWobId[i];
                    int k1 = j1;
                    int i1 = l;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        i1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    i++;
                    j1 = k1;
                    l = i1;
                }

                i = j + l + j1 * 1;
            }
        }
        j = i;
        if (isIncremental != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, isIncremental.booleanValue());
        }
        i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, callError);
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
        if (state != null)
        {
            codedoutputbytebuffernano.writeMessage(1, state);
        }
        if (changedWob != null && changedWob.length > 0)
        {
            for (int i = 0; i < changedWob.length; i++)
            {
                com.google.wallet.proto.nse nse = changedWob[i];
                if (nse != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, nse);
                }
            }

        }
        if (removedWobId != null && removedWobId.length > 0)
        {
            for (int j = 0; j < removedWobId.length; j++)
            {
                String s = removedWobId[j];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(3, s);
                }
            }

        }
        if (isIncremental != null)
        {
            codedoutputbytebuffernano.writeBool(4, isIncremental.booleanValue());
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(5, callError);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
