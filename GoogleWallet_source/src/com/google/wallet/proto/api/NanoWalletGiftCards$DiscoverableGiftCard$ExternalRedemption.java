// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletGiftCards

public static final class clear extends ExtendableMessageNano
{

    public String abortText;
    public String messageContent;
    public String messageTitle;
    public String redeemText;
    public String redemptionUri;
    public String redemptionUriCardKnown;

    private clear clear()
    {
        messageTitle = null;
        messageContent = null;
        abortText = null;
        redeemText = null;
        redemptionUri = null;
        redemptionUriCardKnown = null;
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
                messageTitle = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                messageContent = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                abortText = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                redeemText = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                redemptionUri = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                redemptionUriCardKnown = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (messageTitle != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, messageTitle);
        }
        j = i;
        if (messageContent != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, messageContent);
        }
        i = j;
        if (abortText != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, abortText);
        }
        j = i;
        if (redeemText != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, redeemText);
        }
        i = j;
        if (redemptionUri != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, redemptionUri);
        }
        j = i;
        if (redemptionUriCardKnown != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, redemptionUriCardKnown);
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
        if (messageTitle != null)
        {
            codedoutputbytebuffernano.writeString(1, messageTitle);
        }
        if (messageContent != null)
        {
            codedoutputbytebuffernano.writeString(2, messageContent);
        }
        if (abortText != null)
        {
            codedoutputbytebuffernano.writeString(3, abortText);
        }
        if (redeemText != null)
        {
            codedoutputbytebuffernano.writeString(4, redeemText);
        }
        if (redemptionUri != null)
        {
            codedoutputbytebuffernano.writeString(5, redemptionUri);
        }
        if (redemptionUriCardKnown != null)
        {
            codedoutputbytebuffernano.writeString(6, redemptionUriCardKnown);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
