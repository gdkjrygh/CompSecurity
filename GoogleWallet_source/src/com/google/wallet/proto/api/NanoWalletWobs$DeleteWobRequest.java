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
//            NanoWalletWobs

public static final class clear extends ExtendableMessageNano
{

    public Long holderVersion;
    public String instanceId;
    public Long instanceVersion;

    private clear clear()
    {
        instanceId = null;
        instanceVersion = null;
        holderVersion = null;
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
                instanceId = codedinputbytebuffernano.readString();
                break;

            case 16: // '\020'
                instanceVersion = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 24: // '\030'
                holderVersion = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (instanceId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, instanceId);
        }
        j = i;
        if (instanceVersion != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, instanceVersion.longValue());
        }
        i = j;
        if (holderVersion != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, holderVersion.longValue());
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
        if (instanceId != null)
        {
            codedoutputbytebuffernano.writeString(1, instanceId);
        }
        if (instanceVersion != null)
        {
            codedoutputbytebuffernano.writeInt64(2, instanceVersion.longValue());
        }
        if (holderVersion != null)
        {
            codedoutputbytebuffernano.writeInt64(3, holderVersion.longValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        clear();
    }
}
