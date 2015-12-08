// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    private static volatile proxyDisplayInfo _emptyArray[];
    public String amount;
    public ion bankTransaction;
    public String correlationId;
    public fier credentialIdentifier;
    public Boolean creditToAccount;
    public String description;
    public tial fundingSource;
    public fier id;
    public String issuerDescription;
    public ddress locationOfPurchase;
    public tial maskedCredential;
    public String merchantName;
    public ta metadata;
    public ta offers[];
    public String partnerId;
    public Info proxyDisplayInfo;
    public Info purchaseAddress;
    public Long purchaseTimeMillis;
    public String timeZone;
    public Long transactionResolutionTimeMillis;

    private clear clear()
    {
        id = null;
        credentialIdentifier = null;
        metadata = null;
        purchaseTimeMillis = null;
        locationOfPurchase = null;
        maskedCredential = null;
        description = null;
        offers = rray();
        bankTransaction = null;
        issuerDescription = null;
        amount = null;
        merchantName = null;
        creditToAccount = null;
        transactionResolutionTimeMillis = null;
        fundingSource = null;
        correlationId = null;
        partnerId = null;
        purchaseAddress = null;
        timeZone = null;
        proxyDisplayInfo = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                if (id == null)
                {
                    id = new fier();
                }
                codedinputbytebuffernano.readMessage(id);
                break;

            case 18: // '\022'
                if (credentialIdentifier == null)
                {
                    credentialIdentifier = new fier();
                }
                codedinputbytebuffernano.readMessage(credentialIdentifier);
                break;

            case 24: // '\030'
                purchaseTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 34: // '"'
                if (locationOfPurchase == null)
                {
                    locationOfPurchase = new ddress();
                }
                codedinputbytebuffernano.readMessage(locationOfPurchase);
                break;

            case 42: // '*'
                if (maskedCredential == null)
                {
                    maskedCredential = new tial();
                }
                codedinputbytebuffernano.readMessage(maskedCredential);
                break;

            case 50: // '2'
                description = codedinputbytebuffernano.readString();
                break;

            case 58: // ':'
                if (metadata == null)
                {
                    metadata = new ta();
                }
                codedinputbytebuffernano.readMessage(metadata);
                break;

            case 66: // 'B'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 66);
                _emptyArray a_lemptyarray[];
                int j;
                if (offers == null)
                {
                    j = 0;
                } else
                {
                    j = offers.length;
                }
                a_lemptyarray = new offers[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(offers, 0, a_lemptyarray, 0, j);
                    k = j;
                }
                for (; k < a_lemptyarray.length - 1; k++)
                {
                    a_lemptyarray[k] = new ();
                    codedinputbytebuffernano.readMessage(a_lemptyarray[k]);
                    codedinputbytebuffernano.readTag();
                }

                a_lemptyarray[k] = new ();
                codedinputbytebuffernano.readMessage(a_lemptyarray[k]);
                offers = a_lemptyarray;
                break;

            case 90: // 'Z'
                issuerDescription = codedinputbytebuffernano.readString();
                break;

            case 98: // 'b'
                amount = codedinputbytebuffernano.readString();
                break;

            case 106: // 'j'
                merchantName = codedinputbytebuffernano.readString();
                break;

            case 138: 
                if (bankTransaction == null)
                {
                    bankTransaction = new ion();
                }
                codedinputbytebuffernano.readMessage(bankTransaction);
                break;

            case 144: 
                creditToAccount = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 152: 
                transactionResolutionTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 162: 
                if (fundingSource == null)
                {
                    fundingSource = new tial();
                }
                codedinputbytebuffernano.readMessage(fundingSource);
                break;

            case 170: 
                correlationId = codedinputbytebuffernano.readString();
                break;

            case 178: 
                partnerId = codedinputbytebuffernano.readString();
                break;

            case 186: 
                if (purchaseAddress == null)
                {
                    purchaseAddress = new t>();
                }
                codedinputbytebuffernano.readMessage(purchaseAddress);
                break;

            case 194: 
                timeZone = codedinputbytebuffernano.readString();
                break;

            case 202: 
                if (proxyDisplayInfo == null)
                {
                    proxyDisplayInfo = new Info();
                }
                codedinputbytebuffernano.readMessage(proxyDisplayInfo);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
        }
        j = i;
        if (credentialIdentifier != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, credentialIdentifier);
        }
        i = j;
        if (purchaseTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, purchaseTimeMillis.longValue());
        }
        j = i;
        if (locationOfPurchase != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, locationOfPurchase);
        }
        i = j;
        if (maskedCredential != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, maskedCredential);
        }
        j = i;
        if (description != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, description);
        }
        i = j;
        if (metadata != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, metadata);
        }
        j = i;
        if (offers != null)
        {
            j = i;
            if (offers.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= offers.length)
                    {
                        break;
                    }
                    proxyDisplayInfo proxydisplayinfo = offers[k];
                    j = i;
                    if (proxydisplayinfo != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(8, proxydisplayinfo);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (issuerDescription != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(11, issuerDescription);
        }
        j = i;
        if (amount != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(12, amount);
        }
        i = j;
        if (merchantName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(13, merchantName);
        }
        j = i;
        if (bankTransaction != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(17, bankTransaction);
        }
        i = j;
        if (creditToAccount != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(18, creditToAccount.booleanValue());
        }
        j = i;
        if (transactionResolutionTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(19, transactionResolutionTimeMillis.longValue());
        }
        i = j;
        if (fundingSource != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(20, fundingSource);
        }
        j = i;
        if (correlationId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(21, correlationId);
        }
        i = j;
        if (partnerId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(22, partnerId);
        }
        j = i;
        if (purchaseAddress != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(23, purchaseAddress);
        }
        i = j;
        if (timeZone != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(24, timeZone);
        }
        j = i;
        if (proxyDisplayInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(25, proxyDisplayInfo);
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
        if (id != null)
        {
            codedoutputbytebuffernano.writeMessage(1, id);
        }
        if (credentialIdentifier != null)
        {
            codedoutputbytebuffernano.writeMessage(2, credentialIdentifier);
        }
        if (purchaseTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(3, purchaseTimeMillis.longValue());
        }
        if (locationOfPurchase != null)
        {
            codedoutputbytebuffernano.writeMessage(4, locationOfPurchase);
        }
        if (maskedCredential != null)
        {
            codedoutputbytebuffernano.writeMessage(5, maskedCredential);
        }
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(6, description);
        }
        if (metadata != null)
        {
            codedoutputbytebuffernano.writeMessage(7, metadata);
        }
        if (offers != null && offers.length > 0)
        {
            for (int i = 0; i < offers.length; i++)
            {
                mergeFrom mergefrom = offers[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(8, mergefrom);
                }
            }

        }
        if (issuerDescription != null)
        {
            codedoutputbytebuffernano.writeString(11, issuerDescription);
        }
        if (amount != null)
        {
            codedoutputbytebuffernano.writeString(12, amount);
        }
        if (merchantName != null)
        {
            codedoutputbytebuffernano.writeString(13, merchantName);
        }
        if (bankTransaction != null)
        {
            codedoutputbytebuffernano.writeMessage(17, bankTransaction);
        }
        if (creditToAccount != null)
        {
            codedoutputbytebuffernano.writeBool(18, creditToAccount.booleanValue());
        }
        if (transactionResolutionTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(19, transactionResolutionTimeMillis.longValue());
        }
        if (fundingSource != null)
        {
            codedoutputbytebuffernano.writeMessage(20, fundingSource);
        }
        if (correlationId != null)
        {
            codedoutputbytebuffernano.writeString(21, correlationId);
        }
        if (partnerId != null)
        {
            codedoutputbytebuffernano.writeString(22, partnerId);
        }
        if (purchaseAddress != null)
        {
            codedoutputbytebuffernano.writeMessage(23, purchaseAddress);
        }
        if (timeZone != null)
        {
            codedoutputbytebuffernano.writeString(24, timeZone);
        }
        if (proxyDisplayInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(25, proxyDisplayInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Info()
    {
        clear();
    }
}
