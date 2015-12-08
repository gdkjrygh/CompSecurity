// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    public byte apnsDeviceToken[];

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!Arrays.equals(apnsDeviceToken, WireFormatNano.EMPTY_BYTES))
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(1, apnsDeviceToken);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof apnsDeviceToken))
            {
                return false;
            }
            obj = (apnsDeviceToken)obj;
            if (!Arrays.equals(apnsDeviceToken, ((apnsDeviceToken) (obj)).apnsDeviceToken))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (getClass().getName().hashCode() + 527) * 31 + Arrays.hashCode(apnsDeviceToken);
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                apnsDeviceToken = codedinputbytebuffernano.readBytes();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!Arrays.equals(apnsDeviceToken, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(1, apnsDeviceToken);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        apnsDeviceToken = WireFormatNano.EMPTY_BYTES;
        cachedSize = -1;
    }
}
