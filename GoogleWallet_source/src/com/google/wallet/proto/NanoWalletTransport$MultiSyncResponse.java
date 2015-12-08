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

    public se giftCardSyncResponse;
    public Response globalResourceSyncResponse;
    public onse instrumentSyncResponse;
    public ponse loyaltyCardSyncResponse;
    public ponse nfcTapEventSyncResponse;
    public ponse offerSyncResponse;
    public ncResponse provisioningInfoSyncResponse;
    public nse proxyCardSyncResponse;

    private clear clear()
    {
        offerSyncResponse = null;
        nfcTapEventSyncResponse = null;
        globalResourceSyncResponse = null;
        instrumentSyncResponse = null;
        giftCardSyncResponse = null;
        loyaltyCardSyncResponse = null;
        provisioningInfoSyncResponse = null;
        proxyCardSyncResponse = null;
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
                if (offerSyncResponse == null)
                {
                    offerSyncResponse = new <init>();
                }
                codedinputbytebuffernano.readMessage(offerSyncResponse);
                break;

            case 18: // '\022'
                if (nfcTapEventSyncResponse == null)
                {
                    nfcTapEventSyncResponse = new ponse();
                }
                codedinputbytebuffernano.readMessage(nfcTapEventSyncResponse);
                break;

            case 26: // '\032'
                if (globalResourceSyncResponse == null)
                {
                    globalResourceSyncResponse = new Response();
                }
                codedinputbytebuffernano.readMessage(globalResourceSyncResponse);
                break;

            case 34: // '"'
                if (instrumentSyncResponse == null)
                {
                    instrumentSyncResponse = new onse();
                }
                codedinputbytebuffernano.readMessage(instrumentSyncResponse);
                break;

            case 42: // '*'
                if (giftCardSyncResponse == null)
                {
                    giftCardSyncResponse = new se();
                }
                codedinputbytebuffernano.readMessage(giftCardSyncResponse);
                break;

            case 50: // '2'
                if (loyaltyCardSyncResponse == null)
                {
                    loyaltyCardSyncResponse = new ponse();
                }
                codedinputbytebuffernano.readMessage(loyaltyCardSyncResponse);
                break;

            case 66: // 'B'
                if (provisioningInfoSyncResponse == null)
                {
                    provisioningInfoSyncResponse = new ncResponse();
                }
                codedinputbytebuffernano.readMessage(provisioningInfoSyncResponse);
                break;

            case 74: // 'J'
                if (proxyCardSyncResponse == null)
                {
                    proxyCardSyncResponse = new nse();
                }
                codedinputbytebuffernano.readMessage(proxyCardSyncResponse);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (offerSyncResponse != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, offerSyncResponse);
        }
        j = i;
        if (nfcTapEventSyncResponse != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, nfcTapEventSyncResponse);
        }
        i = j;
        if (globalResourceSyncResponse != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, globalResourceSyncResponse);
        }
        j = i;
        if (instrumentSyncResponse != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, instrumentSyncResponse);
        }
        i = j;
        if (giftCardSyncResponse != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, giftCardSyncResponse);
        }
        j = i;
        if (loyaltyCardSyncResponse != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, loyaltyCardSyncResponse);
        }
        i = j;
        if (provisioningInfoSyncResponse != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(8, provisioningInfoSyncResponse);
        }
        j = i;
        if (proxyCardSyncResponse != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(9, proxyCardSyncResponse);
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
        if (offerSyncResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(1, offerSyncResponse);
        }
        if (nfcTapEventSyncResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(2, nfcTapEventSyncResponse);
        }
        if (globalResourceSyncResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(3, globalResourceSyncResponse);
        }
        if (instrumentSyncResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(4, instrumentSyncResponse);
        }
        if (giftCardSyncResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(5, giftCardSyncResponse);
        }
        if (loyaltyCardSyncResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(6, loyaltyCardSyncResponse);
        }
        if (provisioningInfoSyncResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(8, provisioningInfoSyncResponse);
        }
        if (proxyCardSyncResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(9, proxyCardSyncResponse);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public nse()
    {
        clear();
    }
}
