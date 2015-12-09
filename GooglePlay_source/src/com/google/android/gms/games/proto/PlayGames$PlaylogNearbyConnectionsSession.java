// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    public String advertisedServiceId;
    public String discoveredServiceIds[];
    public String discoveryServiceIds[];
    public int numConnectionRequestsAccepted;
    public int numConnectionRequestsReceived;
    public int numConnectionRequestsRejected;
    public int numConnectionRequestsSent;
    public int numReliableMessagesReceived;
    public int numReliableMessagesSent;
    public int numUnreliableMessagesReceived;
    public int numUnreliableMessagesSent;
    public long sessionDurationMillis;

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (sessionDurationMillis != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(1, sessionDurationMillis);
        }
        i = j;
        if (!advertisedServiceId.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, advertisedServiceId);
        }
        j = i;
        if (discoveryServiceIds != null)
        {
            j = i;
            if (discoveryServiceIds.length > 0)
            {
                int k1 = 0;
                int k = 0;
                for (j = 0; j < discoveryServiceIds.length;)
                {
                    String s = discoveryServiceIds[j];
                    int i2 = k1;
                    int i1 = k;
                    if (s != null)
                    {
                        i2 = k1 + 1;
                        i1 = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    k1 = i2;
                    k = i1;
                }

                j = i + k + k1 * 1;
            }
        }
        i = j;
        if (discoveredServiceIds != null)
        {
            i = j;
            if (discoveredServiceIds.length > 0)
            {
                int l1 = 0;
                int l = 0;
                for (i = 0; i < discoveredServiceIds.length;)
                {
                    String s1 = discoveredServiceIds[i];
                    int j2 = l1;
                    int j1 = l;
                    if (s1 != null)
                    {
                        j2 = l1 + 1;
                        j1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s1);
                    }
                    i++;
                    l1 = j2;
                    l = j1;
                }

                i = j + l + l1 * 1;
            }
        }
        j = i;
        if (numConnectionRequestsSent != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(5, numConnectionRequestsSent);
        }
        i = j;
        if (numConnectionRequestsReceived != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(6, numConnectionRequestsReceived);
        }
        j = i;
        if (numConnectionRequestsAccepted != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(7, numConnectionRequestsAccepted);
        }
        i = j;
        if (numConnectionRequestsRejected != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(8, numConnectionRequestsRejected);
        }
        j = i;
        if (numReliableMessagesSent != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(9, numReliableMessagesSent);
        }
        i = j;
        if (numReliableMessagesReceived != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(10, numReliableMessagesReceived);
        }
        j = i;
        if (numUnreliableMessagesSent != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(11, numUnreliableMessagesSent);
        }
        i = j;
        if (numUnreliableMessagesReceived != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(12, numUnreliableMessagesReceived);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof numUnreliableMessagesReceived))
            {
                return false;
            }
            obj = (numUnreliableMessagesReceived)obj;
            if (sessionDurationMillis != ((sessionDurationMillis) (obj)).sessionDurationMillis)
            {
                return false;
            }
            if (advertisedServiceId == null)
            {
                if (((advertisedServiceId) (obj)).advertisedServiceId != null)
                {
                    return false;
                }
            } else
            if (!advertisedServiceId.equals(((advertisedServiceId) (obj)).advertisedServiceId))
            {
                return false;
            }
            if (!InternalNano.equals(discoveryServiceIds, ((discoveryServiceIds) (obj)).discoveryServiceIds))
            {
                return false;
            }
            if (!InternalNano.equals(discoveredServiceIds, ((discoveredServiceIds) (obj)).discoveredServiceIds))
            {
                return false;
            }
            if (numConnectionRequestsSent != ((numConnectionRequestsSent) (obj)).numConnectionRequestsSent)
            {
                return false;
            }
            if (numConnectionRequestsReceived != ((numConnectionRequestsReceived) (obj)).numConnectionRequestsReceived)
            {
                return false;
            }
            if (numConnectionRequestsAccepted != ((numConnectionRequestsAccepted) (obj)).numConnectionRequestsAccepted)
            {
                return false;
            }
            if (numConnectionRequestsRejected != ((numConnectionRequestsRejected) (obj)).numConnectionRequestsRejected)
            {
                return false;
            }
            if (numReliableMessagesSent != ((numReliableMessagesSent) (obj)).numReliableMessagesSent)
            {
                return false;
            }
            if (numReliableMessagesReceived != ((numReliableMessagesReceived) (obj)).numReliableMessagesReceived)
            {
                return false;
            }
            if (numUnreliableMessagesSent != ((numUnreliableMessagesSent) (obj)).numUnreliableMessagesSent)
            {
                return false;
            }
            if (numUnreliableMessagesReceived != ((numUnreliableMessagesReceived) (obj)).numUnreliableMessagesReceived)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int k = (int)(sessionDurationMillis ^ sessionDurationMillis >>> 32);
        int i;
        if (advertisedServiceId == null)
        {
            i = 0;
        } else
        {
            i = advertisedServiceId.hashCode();
        }
        return ((((((((((((j + 527) * 31 + k) * 31 + i) * 31 + InternalNano.hashCode(discoveryServiceIds)) * 31 + InternalNano.hashCode(discoveredServiceIds)) * 31 + numConnectionRequestsSent) * 31 + numConnectionRequestsReceived) * 31 + numConnectionRequestsAccepted) * 31 + numConnectionRequestsRejected) * 31 + numReliableMessagesSent) * 31 + numReliableMessagesReceived) * 31 + numUnreliableMessagesSent) * 31 + numUnreliableMessagesReceived;
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
                sessionDurationMillis = codedinputbytebuffernano.readRawVarint64();
                break;

            case 18: // '\022'
                advertisedServiceId = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                String as[];
                int j;
                if (discoveryServiceIds == null)
                {
                    j = 0;
                } else
                {
                    j = discoveryServiceIds.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(discoveryServiceIds, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[l] = codedinputbytebuffernano.readString();
                discoveryServiceIds = as;
                break;

            case 34: // '"'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                String as1[];
                int k;
                if (discoveredServiceIds == null)
                {
                    k = 0;
                } else
                {
                    k = discoveredServiceIds.length;
                }
                as1 = new String[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(discoveredServiceIds, 0, as1, 0, k);
                    i1 = k;
                }
                for (; i1 < as1.length - 1; i1++)
                {
                    as1[i1] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as1[i1] = codedinputbytebuffernano.readString();
                discoveredServiceIds = as1;
                break;

            case 40: // '('
                numConnectionRequestsSent = codedinputbytebuffernano.readRawVarint32();
                break;

            case 48: // '0'
                numConnectionRequestsReceived = codedinputbytebuffernano.readRawVarint32();
                break;

            case 56: // '8'
                numConnectionRequestsAccepted = codedinputbytebuffernano.readRawVarint32();
                break;

            case 64: // '@'
                numConnectionRequestsRejected = codedinputbytebuffernano.readRawVarint32();
                break;

            case 72: // 'H'
                numReliableMessagesSent = codedinputbytebuffernano.readRawVarint32();
                break;

            case 80: // 'P'
                numReliableMessagesReceived = codedinputbytebuffernano.readRawVarint32();
                break;

            case 88: // 'X'
                numUnreliableMessagesSent = codedinputbytebuffernano.readRawVarint32();
                break;

            case 96: // '`'
                numUnreliableMessagesReceived = codedinputbytebuffernano.readRawVarint32();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (sessionDurationMillis != 0L)
        {
            codedoutputbytebuffernano.writeInt64(1, sessionDurationMillis);
        }
        if (!advertisedServiceId.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, advertisedServiceId);
        }
        if (discoveryServiceIds != null && discoveryServiceIds.length > 0)
        {
            for (int i = 0; i < discoveryServiceIds.length; i++)
            {
                String s = discoveryServiceIds[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(3, s);
                }
            }

        }
        if (discoveredServiceIds != null && discoveredServiceIds.length > 0)
        {
            for (int j = 0; j < discoveredServiceIds.length; j++)
            {
                String s1 = discoveredServiceIds[j];
                if (s1 != null)
                {
                    codedoutputbytebuffernano.writeString(4, s1);
                }
            }

        }
        if (numConnectionRequestsSent != 0)
        {
            codedoutputbytebuffernano.writeInt32(5, numConnectionRequestsSent);
        }
        if (numConnectionRequestsReceived != 0)
        {
            codedoutputbytebuffernano.writeInt32(6, numConnectionRequestsReceived);
        }
        if (numConnectionRequestsAccepted != 0)
        {
            codedoutputbytebuffernano.writeInt32(7, numConnectionRequestsAccepted);
        }
        if (numConnectionRequestsRejected != 0)
        {
            codedoutputbytebuffernano.writeInt32(8, numConnectionRequestsRejected);
        }
        if (numReliableMessagesSent != 0)
        {
            codedoutputbytebuffernano.writeInt32(9, numReliableMessagesSent);
        }
        if (numReliableMessagesReceived != 0)
        {
            codedoutputbytebuffernano.writeInt32(10, numReliableMessagesReceived);
        }
        if (numUnreliableMessagesSent != 0)
        {
            codedoutputbytebuffernano.writeInt32(11, numUnreliableMessagesSent);
        }
        if (numUnreliableMessagesReceived != 0)
        {
            codedoutputbytebuffernano.writeInt32(12, numUnreliableMessagesReceived);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        sessionDurationMillis = 0L;
        advertisedServiceId = "";
        discoveryServiceIds = WireFormatNano.EMPTY_STRING_ARRAY;
        discoveredServiceIds = WireFormatNano.EMPTY_STRING_ARRAY;
        numConnectionRequestsSent = 0;
        numConnectionRequestsReceived = 0;
        numConnectionRequestsAccepted = 0;
        numConnectionRequestsRejected = 0;
        numReliableMessagesSent = 0;
        numReliableMessagesReceived = 0;
        numUnreliableMessagesSent = 0;
        numUnreliableMessagesReceived = 0;
        cachedSize = -1;
    }
}
