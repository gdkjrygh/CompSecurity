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
//            NanoWalletLocation

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.est.exitZonesSupported currentPosition;
    public Boolean dwellingSupported;
    public Boolean exitZonesSupported;
    public Integer maxNumResultsRequested;

    private clear clear()
    {
        currentPosition = null;
        maxNumResultsRequested = null;
        dwellingSupported = null;
        exitZonesSupported = null;
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
                if (currentPosition == null)
                {
                    currentPosition = new com.google.wallet.proto.>();
                }
                codedinputbytebuffernano.readMessage(currentPosition);
                break;

            case 16: // '\020'
                maxNumResultsRequested = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 24: // '\030'
                dwellingSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 32: // ' '
                exitZonesSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (currentPosition != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, currentPosition);
        }
        j = i;
        if (maxNumResultsRequested != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, maxNumResultsRequested.intValue());
        }
        i = j;
        if (dwellingSupported != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, dwellingSupported.booleanValue());
        }
        j = i;
        if (exitZonesSupported != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, exitZonesSupported.booleanValue());
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
        if (currentPosition != null)
        {
            codedoutputbytebuffernano.writeMessage(1, currentPosition);
        }
        if (maxNumResultsRequested != null)
        {
            codedoutputbytebuffernano.writeInt32(2, maxNumResultsRequested.intValue());
        }
        if (dwellingSupported != null)
        {
            codedoutputbytebuffernano.writeBool(3, dwellingSupported.booleanValue());
        }
        if (exitZonesSupported != null)
        {
            codedoutputbytebuffernano.writeBool(4, exitZonesSupported.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
