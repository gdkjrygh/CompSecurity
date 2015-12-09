// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public String bancorpTosUrl;
    public String displayName;
    public String documentId;
    public String documentUrl;
    public Long gracePeriodExpiresTimeMillis;
    public String privacyNoticeUrl;

    private clear clear()
    {
        documentId = null;
        documentUrl = null;
        gracePeriodExpiresTimeMillis = null;
        displayName = null;
        bancorpTosUrl = null;
        privacyNoticeUrl = null;
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
                documentId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                documentUrl = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                gracePeriodExpiresTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 34: // '"'
                displayName = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                bancorpTosUrl = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                privacyNoticeUrl = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (documentId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, documentId);
        }
        j = i;
        if (documentUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, documentUrl);
        }
        i = j;
        if (gracePeriodExpiresTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, gracePeriodExpiresTimeMillis.longValue());
        }
        j = i;
        if (displayName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, displayName);
        }
        i = j;
        if (bancorpTosUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, bancorpTosUrl);
        }
        j = i;
        if (privacyNoticeUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, privacyNoticeUrl);
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
        if (documentId != null)
        {
            codedoutputbytebuffernano.writeString(1, documentId);
        }
        if (documentUrl != null)
        {
            codedoutputbytebuffernano.writeString(2, documentUrl);
        }
        if (gracePeriodExpiresTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(3, gracePeriodExpiresTimeMillis.longValue());
        }
        if (displayName != null)
        {
            codedoutputbytebuffernano.writeString(4, displayName);
        }
        if (bancorpTosUrl != null)
        {
            codedoutputbytebuffernano.writeString(5, bancorpTosUrl);
        }
        if (privacyNoticeUrl != null)
        {
            codedoutputbytebuffernano.writeString(6, privacyNoticeUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
