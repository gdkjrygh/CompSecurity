// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletOcr

public static final class clear extends ExtendableMessageNano
{
    public static final class GiftCardClass extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletShared.OcrAttribution classAttribution[];
        public String discoverableProgramId;
        public String merchantName;

        private GiftCardClass clear()
        {
            merchantName = null;
            discoverableProgramId = null;
            classAttribution = com.google.wallet.proto.NanoWalletShared.OcrAttribution.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GiftCardClass mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    merchantName = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    discoverableProgramId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    com.google.wallet.proto.NanoWalletShared.OcrAttribution aocrattribution[];
                    int j;
                    if (classAttribution == null)
                    {
                        j = 0;
                    } else
                    {
                        j = classAttribution.length;
                    }
                    aocrattribution = new com.google.wallet.proto.NanoWalletShared.OcrAttribution[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(classAttribution, 0, aocrattribution, 0, j);
                        k = j;
                    }
                    for (; k < aocrattribution.length - 1; k++)
                    {
                        aocrattribution[k] = new com.google.wallet.proto.NanoWalletShared.OcrAttribution();
                        codedinputbytebuffernano.readMessage(aocrattribution[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aocrattribution[k] = new com.google.wallet.proto.NanoWalletShared.OcrAttribution();
                    codedinputbytebuffernano.readMessage(aocrattribution[k]);
                    classAttribution = aocrattribution;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (merchantName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(1, merchantName);
            }
            i = j;
            if (discoverableProgramId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, discoverableProgramId);
            }
            int l = i;
            if (classAttribution != null)
            {
                l = i;
                if (classAttribution.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= classAttribution.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletShared.OcrAttribution ocrattribution = classAttribution[k];
                        l = i;
                        if (ocrattribution != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, ocrattribution);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (merchantName != null)
            {
                codedoutputbytebuffernano.writeString(1, merchantName);
            }
            if (discoverableProgramId != null)
            {
                codedoutputbytebuffernano.writeString(2, discoverableProgramId);
            }
            if (classAttribution != null && classAttribution.length > 0)
            {
                for (int i = 0; i < classAttribution.length; i++)
                {
                    com.google.wallet.proto.NanoWalletShared.OcrAttribution ocrattribution = classAttribution[i];
                    if (ocrattribution != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, ocrattribution);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GiftCardClass()
        {
            clear();
        }
    }

    public static final class GiftCardInstance extends ExtendableMessageNano
    {

        public NanoWalletOcr.RecognizedBarcode barcode[];
        public NanoWalletOcr.RecognizedImageText cardNumber;
        public NanoWalletOcr.RecognizedImageText pin;

        private GiftCardInstance clear()
        {
            cardNumber = null;
            pin = null;
            barcode = NanoWalletOcr.RecognizedBarcode.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GiftCardInstance mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (cardNumber == null)
                    {
                        cardNumber = new NanoWalletOcr.RecognizedImageText();
                    }
                    codedinputbytebuffernano.readMessage(cardNumber);
                    break;

                case 18: // '\022'
                    if (pin == null)
                    {
                        pin = new NanoWalletOcr.RecognizedImageText();
                    }
                    codedinputbytebuffernano.readMessage(pin);
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    NanoWalletOcr.RecognizedBarcode arecognizedbarcode[];
                    int j;
                    if (barcode == null)
                    {
                        j = 0;
                    } else
                    {
                        j = barcode.length;
                    }
                    arecognizedbarcode = new NanoWalletOcr.RecognizedBarcode[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(barcode, 0, arecognizedbarcode, 0, j);
                        k = j;
                    }
                    for (; k < arecognizedbarcode.length - 1; k++)
                    {
                        arecognizedbarcode[k] = new NanoWalletOcr.RecognizedBarcode();
                        codedinputbytebuffernano.readMessage(arecognizedbarcode[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    arecognizedbarcode[k] = new NanoWalletOcr.RecognizedBarcode();
                    codedinputbytebuffernano.readMessage(arecognizedbarcode[k]);
                    barcode = arecognizedbarcode;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (cardNumber != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, cardNumber);
            }
            i = j;
            if (pin != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, pin);
            }
            int l = i;
            if (barcode != null)
            {
                l = i;
                if (barcode.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= barcode.length)
                        {
                            break;
                        }
                        NanoWalletOcr.RecognizedBarcode recognizedbarcode = barcode[k];
                        l = i;
                        if (recognizedbarcode != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, recognizedbarcode);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (cardNumber != null)
            {
                codedoutputbytebuffernano.writeMessage(1, cardNumber);
            }
            if (pin != null)
            {
                codedoutputbytebuffernano.writeMessage(2, pin);
            }
            if (barcode != null && barcode.length > 0)
            {
                for (int i = 0; i < barcode.length; i++)
                {
                    NanoWalletOcr.RecognizedBarcode recognizedbarcode = barcode[i];
                    if (recognizedbarcode != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, recognizedbarcode);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GiftCardInstance()
        {
            clear();
        }
    }


    public GiftCardClass cardClass;
    public GiftCardInstance instance;

    private GiftCardInstance.barcode clear()
    {
        cardClass = null;
        instance = null;
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
                if (cardClass == null)
                {
                    cardClass = new GiftCardClass();
                }
                codedinputbytebuffernano.readMessage(cardClass);
                break;

            case 18: // '\022'
                if (instance == null)
                {
                    instance = new GiftCardInstance();
                }
                codedinputbytebuffernano.readMessage(instance);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (cardClass != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, cardClass);
        }
        j = i;
        if (instance != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, instance);
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
        if (cardClass != null)
        {
            codedoutputbytebuffernano.writeMessage(1, cardClass);
        }
        if (instance != null)
        {
            codedoutputbytebuffernano.writeMessage(2, instance);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public GiftCardInstance.clear()
    {
        clear();
    }
}
