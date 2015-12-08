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
//            NanoWalletNavigation

public static final class clear extends ExtendableMessageNano
{

    public String accessibilityLabel;
    public String iconUrl;
    public String id;
    public String title;
    public String value;

    private clear clear()
    {
        id = null;
        title = null;
        iconUrl = null;
        accessibilityLabel = null;
        value = null;
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
                id = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                title = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                iconUrl = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                accessibilityLabel = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                value = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, id);
        }
        j = i;
        if (title != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, title);
        }
        i = j;
        if (iconUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, iconUrl);
        }
        j = i;
        if (accessibilityLabel != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, accessibilityLabel);
        }
        i = j;
        if (value != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, value);
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
        if (id != null)
        {
            codedoutputbytebuffernano.writeString(1, id);
        }
        if (title != null)
        {
            codedoutputbytebuffernano.writeString(2, title);
        }
        if (iconUrl != null)
        {
            codedoutputbytebuffernano.writeString(3, iconUrl);
        }
        if (accessibilityLabel != null)
        {
            codedoutputbytebuffernano.writeString(4, accessibilityLabel);
        }
        if (value != null)
        {
            codedoutputbytebuffernano.writeString(5, value);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
