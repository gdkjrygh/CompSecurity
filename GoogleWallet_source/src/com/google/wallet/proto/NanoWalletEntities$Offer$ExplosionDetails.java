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

    public Boolean active;
    public Long activeDurationBeforeExplosion;
    public String explosionRedemptionCode;
    public Long explosionTimeMillis;

    private clear clear()
    {
        active = null;
        explosionTimeMillis = null;
        activeDurationBeforeExplosion = null;
        explosionRedemptionCode = null;
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
                active = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 16: // '\020'
                explosionTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 24: // '\030'
                activeDurationBeforeExplosion = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 34: // '"'
                explosionRedemptionCode = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (active != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(1, active.booleanValue());
        }
        j = i;
        if (explosionTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, explosionTimeMillis.longValue());
        }
        i = j;
        if (activeDurationBeforeExplosion != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, activeDurationBeforeExplosion.longValue());
        }
        j = i;
        if (explosionRedemptionCode != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, explosionRedemptionCode);
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
        if (active != null)
        {
            codedoutputbytebuffernano.writeBool(1, active.booleanValue());
        }
        if (explosionTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(2, explosionTimeMillis.longValue());
        }
        if (activeDurationBeforeExplosion != null)
        {
            codedoutputbytebuffernano.writeInt64(3, activeDurationBeforeExplosion.longValue());
        }
        if (explosionRedemptionCode != null)
        {
            codedoutputbytebuffernano.writeString(4, explosionRedemptionCode);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
