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
//            NanoWalletGiftCards

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.forms callError;
    public String continuationToken;
    public forms forms[];

    private clear clear()
    {
        continuationToken = null;
        forms = forms();
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

            case 18: // '\022'
                continuationToken = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;

            case 34: // '"'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                cachedSize acachedsize[];
                int j;
                if (forms == null)
                {
                    j = 0;
                } else
                {
                    j = forms.length;
                }
                acachedsize = new forms[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(forms, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new forms();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new forms();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                forms = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (continuationToken != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, continuationToken);
        }
        i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, callError);
        }
        int l = i;
        if (forms != null)
        {
            l = i;
            if (forms.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= forms.length)
                    {
                        break;
                    }
                    forms forms1 = forms[k];
                    l = i;
                    if (forms1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(4, forms1);
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
        if (continuationToken != null)
        {
            codedoutputbytebuffernano.writeString(2, continuationToken);
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(3, callError);
        }
        if (forms != null && forms.length > 0)
        {
            for (int i = 0; i < forms.length; i++)
            {
                mergeFrom mergefrom = forms[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, mergefrom);
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
