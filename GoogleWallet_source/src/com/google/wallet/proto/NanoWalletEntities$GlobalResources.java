// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public wobEncryptionKey billingKeys;
    public String blacklistedBinRanges[];
    public ion clientConfiguration;
    public ent latestLegalDocument;
    public ent merchants[];
    public ent torinoKeys;
    public ent userInfo;
    public Long version;
    public sionKeyPair wobEncryptionKey;

    private clear clear()
    {
        version = null;
        billingKeys = null;
        merchants = ray();
        clientConfiguration = null;
        userInfo = null;
        blacklistedBinRanges = WireFormatNano.EMPTY_STRING_ARRAY;
        latestLegalDocument = null;
        torinoKeys = null;
        wobEncryptionKey = null;
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
                version = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 34: // '"'
                if (billingKeys == null)
                {
                    billingKeys = new t>();
                }
                codedinputbytebuffernano.readMessage(billingKeys);
                break;

            case 42: // '*'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                cachedSize acachedsize[];
                int j;
                if (merchants == null)
                {
                    j = 0;
                } else
                {
                    j = merchants.length;
                }
                acachedsize = new merchants[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(merchants, 0, acachedsize, 0, j);
                    l = j;
                }
                for (; l < acachedsize.length - 1; l++)
                {
                    acachedsize[l] = new merchants();
                    codedinputbytebuffernano.readMessage(acachedsize[l]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[l] = new ge();
                codedinputbytebuffernano.readMessage(acachedsize[l]);
                merchants = acachedsize;
                break;

            case 50: // '2'
                if (clientConfiguration == null)
                {
                    clientConfiguration = new ion();
                }
                codedinputbytebuffernano.readMessage(clientConfiguration);
                break;

            case 58: // ':'
                if (latestLegalDocument == null)
                {
                    latestLegalDocument = new ent();
                }
                codedinputbytebuffernano.readMessage(latestLegalDocument);
                break;

            case 66: // 'B'
                if (userInfo == null)
                {
                    userInfo = new userInfo();
                }
                codedinputbytebuffernano.readMessage(userInfo);
                break;

            case 74: // 'J'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
                String as[];
                int k;
                if (blacklistedBinRanges == null)
                {
                    k = 0;
                } else
                {
                    k = blacklistedBinRanges.length;
                }
                as = new String[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(blacklistedBinRanges, 0, as, 0, k);
                    i1 = k;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[i1] = codedinputbytebuffernano.readString();
                blacklistedBinRanges = as;
                break;

            case 82: // 'R'
                if (torinoKeys == null)
                {
                    torinoKeys = new >();
                }
                codedinputbytebuffernano.readMessage(torinoKeys);
                break;

            case 98: // 'b'
                if (wobEncryptionKey == null)
                {
                    wobEncryptionKey = new sionKeyPair();
                }
                codedinputbytebuffernano.readMessage(wobEncryptionKey);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (version != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(1, version.longValue());
        }
        i = j;
        if (billingKeys != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(4, billingKeys);
        }
        j = i;
        if (merchants != null)
        {
            j = i;
            if (merchants.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= merchants.length)
                    {
                        break;
                    }
                    wobEncryptionKey wobencryptionkey = merchants[k];
                    j = i;
                    if (wobencryptionkey != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(5, wobencryptionkey);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (clientConfiguration != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(6, clientConfiguration);
        }
        j = i;
        if (latestLegalDocument != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(7, latestLegalDocument);
        }
        i = j;
        if (userInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(8, userInfo);
        }
        j = i;
        if (blacklistedBinRanges != null)
        {
            j = i;
            if (blacklistedBinRanges.length > 0)
            {
                int j1 = 0;
                int l = 0;
                for (j = 0; j < blacklistedBinRanges.length;)
                {
                    String s = blacklistedBinRanges[j];
                    int k1 = j1;
                    int i1 = l;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        i1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    j1 = k1;
                    l = i1;
                }

                j = i + l + j1 * 1;
            }
        }
        i = j;
        if (torinoKeys != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(10, torinoKeys);
        }
        j = i;
        if (wobEncryptionKey != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(12, wobEncryptionKey);
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
        if (version != null)
        {
            codedoutputbytebuffernano.writeInt64(1, version.longValue());
        }
        if (billingKeys != null)
        {
            codedoutputbytebuffernano.writeMessage(4, billingKeys);
        }
        if (merchants != null && merchants.length > 0)
        {
            for (int i = 0; i < merchants.length; i++)
            {
                mergeFrom mergefrom = merchants[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, mergefrom);
                }
            }

        }
        if (clientConfiguration != null)
        {
            codedoutputbytebuffernano.writeMessage(6, clientConfiguration);
        }
        if (latestLegalDocument != null)
        {
            codedoutputbytebuffernano.writeMessage(7, latestLegalDocument);
        }
        if (userInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(8, userInfo);
        }
        if (blacklistedBinRanges != null && blacklistedBinRanges.length > 0)
        {
            for (int j = 0; j < blacklistedBinRanges.length; j++)
            {
                String s = blacklistedBinRanges[j];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(9, s);
                }
            }

        }
        if (torinoKeys != null)
        {
            codedoutputbytebuffernano.writeMessage(10, torinoKeys);
        }
        if (wobEncryptionKey != null)
        {
            codedoutputbytebuffernano.writeMessage(12, wobEncryptionKey);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public sionKeyPair()
    {
        clear();
    }
}
