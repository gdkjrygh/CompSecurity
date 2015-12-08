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

    public  deprecatedGeofencingOfferNotificationExtraInfo;
    public  giftCardExtraInfo;
    public o imageUploadExtraInfo;
    public fo mobileOffersLibraryOfferDetails;
    public fo ocrExtraInfo;
    public fo payByFaceExtraInfo;
    public Info purchaseRecordExtraInfo;
    public Info wobViewExtraInfo;

    private clear clear()
    {
        mobileOffersLibraryOfferDetails = null;
        purchaseRecordExtraInfo = null;
        deprecatedGeofencingOfferNotificationExtraInfo = null;
        ocrExtraInfo = null;
        wobViewExtraInfo = null;
        giftCardExtraInfo = null;
        payByFaceExtraInfo = null;
        imageUploadExtraInfo = null;
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
                if (mobileOffersLibraryOfferDetails == null)
                {
                    mobileOffersLibraryOfferDetails = new fo();
                }
                codedinputbytebuffernano.readMessage(mobileOffersLibraryOfferDetails);
                break;

            case 18: // '\022'
                if (purchaseRecordExtraInfo == null)
                {
                    purchaseRecordExtraInfo = new Info();
                }
                codedinputbytebuffernano.readMessage(purchaseRecordExtraInfo);
                break;

            case 26: // '\032'
                if (deprecatedGeofencingOfferNotificationExtraInfo == null)
                {
                    deprecatedGeofencingOfferNotificationExtraInfo = new ();
                }
                codedinputbytebuffernano.readMessage(deprecatedGeofencingOfferNotificationExtraInfo);
                break;

            case 34: // '"'
                if (ocrExtraInfo == null)
                {
                    ocrExtraInfo = new ();
                }
                codedinputbytebuffernano.readMessage(ocrExtraInfo);
                break;

            case 42: // '*'
                if (wobViewExtraInfo == null)
                {
                    wobViewExtraInfo = new nit>();
                }
                codedinputbytebuffernano.readMessage(wobViewExtraInfo);
                break;

            case 50: // '2'
                if (giftCardExtraInfo == null)
                {
                    giftCardExtraInfo = new init>();
                }
                codedinputbytebuffernano.readMessage(giftCardExtraInfo);
                break;

            case 58: // ':'
                if (payByFaceExtraInfo == null)
                {
                    payByFaceExtraInfo = new <init>();
                }
                codedinputbytebuffernano.readMessage(payByFaceExtraInfo);
                break;

            case 66: // 'B'
                if (imageUploadExtraInfo == null)
                {
                    imageUploadExtraInfo = new o();
                }
                codedinputbytebuffernano.readMessage(imageUploadExtraInfo);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (mobileOffersLibraryOfferDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, mobileOffersLibraryOfferDetails);
        }
        j = i;
        if (purchaseRecordExtraInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, purchaseRecordExtraInfo);
        }
        i = j;
        if (deprecatedGeofencingOfferNotificationExtraInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, deprecatedGeofencingOfferNotificationExtraInfo);
        }
        j = i;
        if (ocrExtraInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, ocrExtraInfo);
        }
        i = j;
        if (wobViewExtraInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, wobViewExtraInfo);
        }
        j = i;
        if (giftCardExtraInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, giftCardExtraInfo);
        }
        i = j;
        if (payByFaceExtraInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, payByFaceExtraInfo);
        }
        j = i;
        if (imageUploadExtraInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(8, imageUploadExtraInfo);
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
        if (mobileOffersLibraryOfferDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(1, mobileOffersLibraryOfferDetails);
        }
        if (purchaseRecordExtraInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(2, purchaseRecordExtraInfo);
        }
        if (deprecatedGeofencingOfferNotificationExtraInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(3, deprecatedGeofencingOfferNotificationExtraInfo);
        }
        if (ocrExtraInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(4, ocrExtraInfo);
        }
        if (wobViewExtraInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(5, wobViewExtraInfo);
        }
        if (giftCardExtraInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(6, giftCardExtraInfo);
        }
        if (payByFaceExtraInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(7, payByFaceExtraInfo);
        }
        if (imageUploadExtraInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(8, imageUploadExtraInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Info()
    {
        clear();
    }
}
