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

    public Integer displayNearbyUsersDelayMillis;
    public Integer returnedNearbyUserCount;

    private clear clear()
    {
        displayNearbyUsersDelayMillis = null;
        returnedNearbyUserCount = null;
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

            case 8: // '\b'
                displayNearbyUsersDelayMillis = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 16: // '\020'
                returnedNearbyUserCount = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (displayNearbyUsersDelayMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, displayNearbyUsersDelayMillis.intValue());
        }
        j = i;
        if (returnedNearbyUserCount != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, returnedNearbyUserCount.intValue());
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
        if (displayNearbyUsersDelayMillis != null)
        {
            codedoutputbytebuffernano.writeInt32(1, displayNearbyUsersDelayMillis.intValue());
        }
        if (returnedNearbyUserCount != null)
        {
            codedoutputbytebuffernano.writeInt32(2, returnedNearbyUserCount.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public I()
    {
        clear();
    }
}
