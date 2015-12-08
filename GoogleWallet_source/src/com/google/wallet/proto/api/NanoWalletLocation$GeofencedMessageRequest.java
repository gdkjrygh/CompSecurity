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

    public com.google.wallet.proto.est.richNotificationsSupported currentPosition;
    public Boolean dwellingSupported;
    public Boolean exitZoneTripped;
    public Boolean exitZonesSupported;
    public Boolean richNotificationsSupported;
    public Double speedMetersPerSecond;

    private clear clear()
    {
        currentPosition = null;
        dwellingSupported = null;
        speedMetersPerSecond = null;
        exitZonesSupported = null;
        exitZoneTripped = null;
        richNotificationsSupported = null;
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
                    currentPosition = new com.google.wallet.proto.est.currentPosition();
                }
                codedinputbytebuffernano.readMessage(currentPosition);
                break;

            case 16: // '\020'
                dwellingSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 25: // '\031'
                speedMetersPerSecond = Double.valueOf(codedinputbytebuffernano.readDouble());
                break;

            case 32: // ' '
                exitZonesSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 40: // '('
                exitZoneTripped = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 48: // '0'
                richNotificationsSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
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
        if (dwellingSupported != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(2, dwellingSupported.booleanValue());
        }
        i = j;
        if (speedMetersPerSecond != null)
        {
            i = j + CodedOutputByteBufferNano.computeDoubleSize(3, speedMetersPerSecond.doubleValue());
        }
        j = i;
        if (exitZonesSupported != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, exitZonesSupported.booleanValue());
        }
        i = j;
        if (exitZoneTripped != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(5, exitZoneTripped.booleanValue());
        }
        j = i;
        if (richNotificationsSupported != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(6, richNotificationsSupported.booleanValue());
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
        if (dwellingSupported != null)
        {
            codedoutputbytebuffernano.writeBool(2, dwellingSupported.booleanValue());
        }
        if (speedMetersPerSecond != null)
        {
            codedoutputbytebuffernano.writeDouble(3, speedMetersPerSecond.doubleValue());
        }
        if (exitZonesSupported != null)
        {
            codedoutputbytebuffernano.writeBool(4, exitZonesSupported.booleanValue());
        }
        if (exitZoneTripped != null)
        {
            codedoutputbytebuffernano.writeBool(5, exitZoneTripped.booleanValue());
        }
        if (richNotificationsSupported != null)
        {
            codedoutputbytebuffernano.writeBool(6, richNotificationsSupported.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
