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
//            NanoWalletTransport

public static final class clear extends ExtendableMessageNano
{

    public st giftCardSyncRequest;
    public cRequest globalResourceSyncRequest;
    public uest instrumentSyncRequest;
    public quest loyaltyCardSyncRequest;
    public quest nfcTapEventSyncRequest;
    public quest offerSyncRequest;
    public yncRequest provisioningInfoSyncRequest;
    public est proxyCardSyncRequest;

    private clear clear()
    {
        offerSyncRequest = null;
        nfcTapEventSyncRequest = null;
        globalResourceSyncRequest = null;
        instrumentSyncRequest = null;
        giftCardSyncRequest = null;
        loyaltyCardSyncRequest = null;
        provisioningInfoSyncRequest = null;
        proxyCardSyncRequest = null;
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
                if (offerSyncRequest == null)
                {
                    offerSyncRequest = new <init>();
                }
                codedinputbytebuffernano.readMessage(offerSyncRequest);
                break;

            case 18: // '\022'
                if (nfcTapEventSyncRequest == null)
                {
                    nfcTapEventSyncRequest = new quest();
                }
                codedinputbytebuffernano.readMessage(nfcTapEventSyncRequest);
                break;

            case 26: // '\032'
                if (globalResourceSyncRequest == null)
                {
                    globalResourceSyncRequest = new cRequest();
                }
                codedinputbytebuffernano.readMessage(globalResourceSyncRequest);
                break;

            case 34: // '"'
                if (instrumentSyncRequest == null)
                {
                    instrumentSyncRequest = new uest();
                }
                codedinputbytebuffernano.readMessage(instrumentSyncRequest);
                break;

            case 42: // '*'
                if (giftCardSyncRequest == null)
                {
                    giftCardSyncRequest = new st();
                }
                codedinputbytebuffernano.readMessage(giftCardSyncRequest);
                break;

            case 50: // '2'
                if (loyaltyCardSyncRequest == null)
                {
                    loyaltyCardSyncRequest = new quest();
                }
                codedinputbytebuffernano.readMessage(loyaltyCardSyncRequest);
                break;

            case 66: // 'B'
                if (provisioningInfoSyncRequest == null)
                {
                    provisioningInfoSyncRequest = new yncRequest();
                }
                codedinputbytebuffernano.readMessage(provisioningInfoSyncRequest);
                break;

            case 74: // 'J'
                if (proxyCardSyncRequest == null)
                {
                    proxyCardSyncRequest = new est();
                }
                codedinputbytebuffernano.readMessage(proxyCardSyncRequest);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (offerSyncRequest != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, offerSyncRequest);
        }
        j = i;
        if (nfcTapEventSyncRequest != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, nfcTapEventSyncRequest);
        }
        i = j;
        if (globalResourceSyncRequest != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, globalResourceSyncRequest);
        }
        j = i;
        if (instrumentSyncRequest != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, instrumentSyncRequest);
        }
        i = j;
        if (giftCardSyncRequest != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, giftCardSyncRequest);
        }
        j = i;
        if (loyaltyCardSyncRequest != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, loyaltyCardSyncRequest);
        }
        i = j;
        if (provisioningInfoSyncRequest != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(8, provisioningInfoSyncRequest);
        }
        j = i;
        if (proxyCardSyncRequest != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(9, proxyCardSyncRequest);
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
        if (offerSyncRequest != null)
        {
            codedoutputbytebuffernano.writeMessage(1, offerSyncRequest);
        }
        if (nfcTapEventSyncRequest != null)
        {
            codedoutputbytebuffernano.writeMessage(2, nfcTapEventSyncRequest);
        }
        if (globalResourceSyncRequest != null)
        {
            codedoutputbytebuffernano.writeMessage(3, globalResourceSyncRequest);
        }
        if (instrumentSyncRequest != null)
        {
            codedoutputbytebuffernano.writeMessage(4, instrumentSyncRequest);
        }
        if (giftCardSyncRequest != null)
        {
            codedoutputbytebuffernano.writeMessage(5, giftCardSyncRequest);
        }
        if (loyaltyCardSyncRequest != null)
        {
            codedoutputbytebuffernano.writeMessage(6, loyaltyCardSyncRequest);
        }
        if (provisioningInfoSyncRequest != null)
        {
            codedoutputbytebuffernano.writeMessage(8, provisioningInfoSyncRequest);
        }
        if (proxyCardSyncRequest != null)
        {
            codedoutputbytebuffernano.writeMessage(9, proxyCardSyncRequest);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public est()
    {
        clear();
    }
}
