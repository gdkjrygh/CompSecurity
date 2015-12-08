// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    public String discoveryTid;
    public boolean hasCompletedPurchase;
    public long priceMicros;
    public int rankingPosition;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (priceMicros != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, priceMicros);
        }
        j = i;
        if (hasCompletedPurchase)
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
        }
        i = j;
        if (!discoveryTid.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, discoveryTid);
        }
        j = i;
        if (rankingPosition != 0)
        {
            j = i + CodedOutputByteBufferNano.computeUInt32Size(4, rankingPosition);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof rankingPosition))
            {
                return false;
            }
            obj = (rankingPosition)obj;
            if (priceMicros != ((priceMicros) (obj)).priceMicros)
            {
                return false;
            }
            if (hasCompletedPurchase != ((hasCompletedPurchase) (obj)).hasCompletedPurchase)
            {
                return false;
            }
            if (discoveryTid == null)
            {
                if (((discoveryTid) (obj)).discoveryTid != null)
                {
                    return false;
                }
            } else
            if (!discoveryTid.equals(((discoveryTid) (obj)).discoveryTid))
            {
                return false;
            }
            if (rankingPosition != ((rankingPosition) (obj)).rankingPosition)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int k = (int)(priceMicros ^ priceMicros >>> 32);
        char c;
        int i;
        if (hasCompletedPurchase)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (discoveryTid == null)
        {
            i = 0;
        } else
        {
            i = discoveryTid.hashCode();
        }
        return ((((j + 527) * 31 + k) * 31 + c) * 31 + i) * 31 + rankingPosition;
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

            case 8: // '\b'
                priceMicros = codedinputbytebuffernano.readRawVarint64();
                break;

            case 16: // '\020'
                hasCompletedPurchase = codedinputbytebuffernano.readBool();
                break;

            case 26: // '\032'
                discoveryTid = codedinputbytebuffernano.readString();
                break;

            case 32: // ' '
                rankingPosition = codedinputbytebuffernano.readRawVarint32();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (priceMicros != 0L)
        {
            codedoutputbytebuffernano.writeInt64(1, priceMicros);
        }
        if (hasCompletedPurchase)
        {
            codedoutputbytebuffernano.writeBool(2, hasCompletedPurchase);
        }
        if (!discoveryTid.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, discoveryTid);
        }
        if (rankingPosition != 0)
        {
            codedoutputbytebuffernano.writeUInt32(4, rankingPosition);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Y()
    {
        priceMicros = 0L;
        hasCompletedPurchase = false;
        discoveryTid = "";
        rankingPosition = 0;
        cachedSize = -1;
    }
}
