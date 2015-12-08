// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    public String description;
    public com.google.checkout.customer.common.definitions.d.themeImageUrl lastReminderTime;
    public themeImageUrl requestee;
    public themeImageUrl requester;
    public String requesterMessage;
    public String themeImageUrl;

    private clear clear()
    {
        requester = null;
        requestee = null;
        requesterMessage = null;
        description = null;
        lastReminderTime = null;
        themeImageUrl = null;
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
                if (requester == null)
                {
                    requester = new requester();
                }
                codedinputbytebuffernano.readMessage(requester);
                break;

            case 18: // '\022'
                if (requestee == null)
                {
                    requestee = new requestee();
                }
                codedinputbytebuffernano.readMessage(requestee);
                break;

            case 26: // '\032'
                requesterMessage = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                description = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                if (lastReminderTime == null)
                {
                    lastReminderTime = new com.google.checkout.customer.common.definitions.d.lastReminderTime();
                }
                codedinputbytebuffernano.readMessage(lastReminderTime);
                break;

            case 50: // '2'
                themeImageUrl = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requester != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, requester);
        }
        j = i;
        if (requestee != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, requestee);
        }
        i = j;
        if (requesterMessage != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, requesterMessage);
        }
        j = i;
        if (description != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, description);
        }
        i = j;
        if (lastReminderTime != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, lastReminderTime);
        }
        j = i;
        if (themeImageUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, themeImageUrl);
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
        if (requester != null)
        {
            codedoutputbytebuffernano.writeMessage(1, requester);
        }
        if (requestee != null)
        {
            codedoutputbytebuffernano.writeMessage(2, requestee);
        }
        if (requesterMessage != null)
        {
            codedoutputbytebuffernano.writeString(3, requesterMessage);
        }
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(4, description);
        }
        if (lastReminderTime != null)
        {
            codedoutputbytebuffernano.writeMessage(5, lastReminderTime);
        }
        if (themeImageUrl != null)
        {
            codedoutputbytebuffernano.writeString(6, themeImageUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
