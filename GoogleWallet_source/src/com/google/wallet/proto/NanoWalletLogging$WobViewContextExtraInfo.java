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
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    public String tappedUri;
    public byte wobInstanceServerData[];

    private clear clear()
    {
        wobInstanceServerData = null;
        tappedUri = null;
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
                wobInstanceServerData = codedinputbytebuffernano.readBytes();
                break;

            case 18: // '\022'
                tappedUri = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (wobInstanceServerData != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(1, wobInstanceServerData);
        }
        j = i;
        if (tappedUri != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, tappedUri);
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
        if (wobInstanceServerData != null)
        {
            codedoutputbytebuffernano.writeBytes(1, wobInstanceServerData);
        }
        if (tappedUri != null)
        {
            codedoutputbytebuffernano.writeString(2, tappedUri);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
