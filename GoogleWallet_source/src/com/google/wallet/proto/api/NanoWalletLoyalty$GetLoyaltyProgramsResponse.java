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
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.callError callError;
    public callError programs[];

    private clear clear()
    {
        programs = emptyArray();
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
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                cachedSize acachedsize[];
                int j;
                if (programs == null)
                {
                    j = 0;
                } else
                {
                    j = programs.length;
                }
                acachedsize = new programs[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(programs, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new <init>();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new <init>();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                programs = acachedsize;
                break;

            case 18: // '\022'
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
        int i = super.computeSerializedSize();
        int j = i;
        if (programs != null)
        {
            j = i;
            if (programs.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= programs.length)
                    {
                        break;
                    }
                    callError callerror = programs[k];
                    j = i;
                    if (callerror != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, callerror);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, callError);
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
        if (programs != null && programs.length > 0)
        {
            for (int i = 0; i < programs.length; i++)
            {
                mergeFrom mergefrom = programs[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, mergefrom);
                }
            }

        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(2, callError);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
