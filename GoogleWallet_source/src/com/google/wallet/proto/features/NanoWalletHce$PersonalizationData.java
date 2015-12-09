// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.features;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.features:
//            NanoWalletHce

public static final class clear extends ExtendableMessageNano
{

    public byte aid[];
    public byte aip[];
    public byte applicationFileLocator[];
    public Integer applicationPriorityIndicator;
    public cvc3Crypto cvc3Crypto;
    public Integer issuerCodeTableIndex;
    public Integer magstripeVersionNumber;
    public Integer nAtcTrack1;
    public Integer nAtcTrack2;
    public byte pCvc3Track1[];
    public byte pCvc3Track2[];
    public byte pUnAtcTrack1[];
    public byte pUnAtcTrack2[];
    public byte track1Data[];
    public byte track2Data[];
    public byte udol[];

    private clear clear()
    {
        aid = null;
        applicationPriorityIndicator = null;
        issuerCodeTableIndex = null;
        aip = null;
        applicationFileLocator = null;
        magstripeVersionNumber = null;
        pCvc3Track1 = null;
        pCvc3Track2 = null;
        pUnAtcTrack1 = null;
        pUnAtcTrack2 = null;
        nAtcTrack1 = null;
        nAtcTrack2 = null;
        track1Data = null;
        track2Data = null;
        udol = null;
        cvc3Crypto = null;
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

            case 18: // '\022'
                aid = codedinputbytebuffernano.readBytes();
                break;

            case 24: // '\030'
                applicationPriorityIndicator = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 32: // ' '
                issuerCodeTableIndex = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 42: // '*'
                aip = codedinputbytebuffernano.readBytes();
                break;

            case 50: // '2'
                applicationFileLocator = codedinputbytebuffernano.readBytes();
                break;

            case 56: // '8'
                magstripeVersionNumber = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 66: // 'B'
                pCvc3Track1 = codedinputbytebuffernano.readBytes();
                break;

            case 74: // 'J'
                pCvc3Track2 = codedinputbytebuffernano.readBytes();
                break;

            case 82: // 'R'
                pUnAtcTrack1 = codedinputbytebuffernano.readBytes();
                break;

            case 90: // 'Z'
                pUnAtcTrack2 = codedinputbytebuffernano.readBytes();
                break;

            case 96: // '`'
                nAtcTrack1 = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 104: // 'h'
                nAtcTrack2 = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 114: // 'r'
                track1Data = codedinputbytebuffernano.readBytes();
                break;

            case 122: // 'z'
                track2Data = codedinputbytebuffernano.readBytes();
                break;

            case 130: 
                udol = codedinputbytebuffernano.readBytes();
                break;

            case 138: 
                if (cvc3Crypto == null)
                {
                    cvc3Crypto = new cvc3Crypto();
                }
                codedinputbytebuffernano.readMessage(cvc3Crypto);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (aid != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(2, aid);
        }
        j = i;
        if (applicationPriorityIndicator != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(3, applicationPriorityIndicator.intValue());
        }
        i = j;
        if (issuerCodeTableIndex != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(4, issuerCodeTableIndex.intValue());
        }
        j = i;
        if (aip != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(5, aip);
        }
        i = j;
        if (applicationFileLocator != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(6, applicationFileLocator);
        }
        j = i;
        if (magstripeVersionNumber != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(7, magstripeVersionNumber.intValue());
        }
        i = j;
        if (pCvc3Track1 != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(8, pCvc3Track1);
        }
        j = i;
        if (pCvc3Track2 != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(9, pCvc3Track2);
        }
        i = j;
        if (pUnAtcTrack1 != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(10, pUnAtcTrack1);
        }
        j = i;
        if (pUnAtcTrack2 != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(11, pUnAtcTrack2);
        }
        i = j;
        if (nAtcTrack1 != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(12, nAtcTrack1.intValue());
        }
        j = i;
        if (nAtcTrack2 != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(13, nAtcTrack2.intValue());
        }
        i = j;
        if (track1Data != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(14, track1Data);
        }
        j = i;
        if (track2Data != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(15, track2Data);
        }
        i = j;
        if (udol != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(16, udol);
        }
        j = i;
        if (cvc3Crypto != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(17, cvc3Crypto);
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
        if (aid != null)
        {
            codedoutputbytebuffernano.writeBytes(2, aid);
        }
        if (applicationPriorityIndicator != null)
        {
            codedoutputbytebuffernano.writeInt32(3, applicationPriorityIndicator.intValue());
        }
        if (issuerCodeTableIndex != null)
        {
            codedoutputbytebuffernano.writeInt32(4, issuerCodeTableIndex.intValue());
        }
        if (aip != null)
        {
            codedoutputbytebuffernano.writeBytes(5, aip);
        }
        if (applicationFileLocator != null)
        {
            codedoutputbytebuffernano.writeBytes(6, applicationFileLocator);
        }
        if (magstripeVersionNumber != null)
        {
            codedoutputbytebuffernano.writeInt32(7, magstripeVersionNumber.intValue());
        }
        if (pCvc3Track1 != null)
        {
            codedoutputbytebuffernano.writeBytes(8, pCvc3Track1);
        }
        if (pCvc3Track2 != null)
        {
            codedoutputbytebuffernano.writeBytes(9, pCvc3Track2);
        }
        if (pUnAtcTrack1 != null)
        {
            codedoutputbytebuffernano.writeBytes(10, pUnAtcTrack1);
        }
        if (pUnAtcTrack2 != null)
        {
            codedoutputbytebuffernano.writeBytes(11, pUnAtcTrack2);
        }
        if (nAtcTrack1 != null)
        {
            codedoutputbytebuffernano.writeInt32(12, nAtcTrack1.intValue());
        }
        if (nAtcTrack2 != null)
        {
            codedoutputbytebuffernano.writeInt32(13, nAtcTrack2.intValue());
        }
        if (track1Data != null)
        {
            codedoutputbytebuffernano.writeBytes(14, track1Data);
        }
        if (track2Data != null)
        {
            codedoutputbytebuffernano.writeBytes(15, track2Data);
        }
        if (udol != null)
        {
            codedoutputbytebuffernano.writeBytes(16, udol);
        }
        if (cvc3Crypto != null)
        {
            codedoutputbytebuffernano.writeMessage(17, cvc3Crypto);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
