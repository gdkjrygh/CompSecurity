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
//            NanoWalletNotification

public static final class clear extends ExtendableMessageNano
{

    public String displayedNotificationId[];
    public String notificationId;

    private clear clear()
    {
        notificationId = null;
        displayedNotificationId = WireFormatNano.EMPTY_STRING_ARRAY;
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
                notificationId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                String as[];
                int j;
                if (displayedNotificationId == null)
                {
                    j = 0;
                } else
                {
                    j = displayedNotificationId.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(displayedNotificationId, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                displayedNotificationId = as;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (notificationId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, notificationId);
        }
        j = i;
        if (displayedNotificationId != null)
        {
            j = i;
            if (displayedNotificationId.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < displayedNotificationId.length;)
                {
                    String s = displayedNotificationId[j];
                    int j1 = i1;
                    int l = k;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    i1 = j1;
                    k = l;
                }

                j = i + k + i1 * 1;
            }
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
        if (notificationId != null)
        {
            codedoutputbytebuffernano.writeString(1, notificationId);
        }
        if (displayedNotificationId != null && displayedNotificationId.length > 0)
        {
            for (int i = 0; i < displayedNotificationId.length; i++)
            {
                String s = displayedNotificationId[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(2, s);
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
