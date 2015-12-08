// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoWalletOcr
{
    public static final class BoundingBox extends ExtendableMessageNano
    {

        public Integer height;
        public Integer width;
        public Integer x;
        public Integer y;

        private BoundingBox clear()
        {
            x = null;
            y = null;
            width = null;
            height = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private BoundingBox mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    x = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 16: // '\020'
                    y = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 24: // '\030'
                    width = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 32: // ' '
                    height = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (x != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, x.intValue());
            }
            j = i;
            if (y != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, y.intValue());
            }
            i = j;
            if (width != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, width.intValue());
            }
            j = i;
            if (height != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, height.intValue());
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
            if (x != null)
            {
                codedoutputbytebuffernano.writeInt32(1, x.intValue());
            }
            if (y != null)
            {
                codedoutputbytebuffernano.writeInt32(2, y.intValue());
            }
            if (width != null)
            {
                codedoutputbytebuffernano.writeInt32(3, width.intValue());
            }
            if (height != null)
            {
                codedoutputbytebuffernano.writeInt32(4, height.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BoundingBox()
        {
            clear();
        }
    }

    public static final class ClassifierWeight extends ExtendableMessageNano
    {

        private static volatile ClassifierWeight _emptyArray[];
        public Integer classifierType;
        public Float weight;

        private ClassifierWeight clear()
        {
            classifierType = null;
            weight = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ClassifierWeight[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ClassifierWeight[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ClassifierWeight mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       21: 94;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                classifierType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            weight = Float.valueOf(codedinputbytebuffernano.readFloat());
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (classifierType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, classifierType.intValue());
            }
            j = i;
            if (weight != null)
            {
                j = i + CodedOutputByteBufferNano.computeFloatSize(2, weight.floatValue());
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
            if (classifierType != null)
            {
                codedoutputbytebuffernano.writeInt32(1, classifierType.intValue());
            }
            if (weight != null)
            {
                codedoutputbytebuffernano.writeFloat(2, weight.floatValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClassifierWeight()
        {
            clear();
        }
    }

    public static final class DebugParameters extends ExtendableMessageNano
    {

        public String abeModelId;
        public ClassifierWeight classifierWeight[];
        public Integer featureLevel;
        public Float thresholdOverride;

        private DebugParameters clear()
        {
            classifierWeight = ClassifierWeight.emptyArray();
            abeModelId = null;
            thresholdOverride = null;
            featureLevel = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DebugParameters mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       10: 67
        //                       18: 191
        //                       29: 202
        //                       32: 216;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            ClassifierWeight aclassifierweight[];
            int j;
            if (classifierWeight == null)
            {
                j = 0;
            } else
            {
                j = classifierWeight.length;
            }
            aclassifierweight = new ClassifierWeight[j + l];
            l = j;
            if (j != 0)
            {
                System.arraycopy(classifierWeight, 0, aclassifierweight, 0, j);
                l = j;
            }
            for (; l < aclassifierweight.length - 1; l++)
            {
                aclassifierweight[l] = new ClassifierWeight();
                codedinputbytebuffernano.readMessage(aclassifierweight[l]);
                codedinputbytebuffernano.readTag();
            }

            aclassifierweight[l] = new ClassifierWeight();
            codedinputbytebuffernano.readMessage(aclassifierweight[l]);
            classifierWeight = aclassifierweight;
              goto _L7
_L4:
            abeModelId = codedinputbytebuffernano.readString();
              goto _L7
_L5:
            thresholdOverride = Float.valueOf(codedinputbytebuffernano.readFloat());
              goto _L7
_L6:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                featureLevel = Integer.valueOf(k);
                break;
            }
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (classifierWeight != null)
            {
                j = i;
                if (classifierWeight.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= classifierWeight.length)
                        {
                            break;
                        }
                        ClassifierWeight classifierweight = classifierWeight[k];
                        j = i;
                        if (classifierweight != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, classifierweight);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (abeModelId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, abeModelId);
            }
            j = i;
            if (thresholdOverride != null)
            {
                j = i + CodedOutputByteBufferNano.computeFloatSize(3, thresholdOverride.floatValue());
            }
            i = j;
            if (featureLevel != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, featureLevel.intValue());
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (classifierWeight != null && classifierWeight.length > 0)
            {
                for (int i = 0; i < classifierWeight.length; i++)
                {
                    ClassifierWeight classifierweight = classifierWeight[i];
                    if (classifierweight != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, classifierweight);
                    }
                }

            }
            if (abeModelId != null)
            {
                codedoutputbytebuffernano.writeString(2, abeModelId);
            }
            if (thresholdOverride != null)
            {
                codedoutputbytebuffernano.writeFloat(3, thresholdOverride.floatValue());
            }
            if (featureLevel != null)
            {
                codedoutputbytebuffernano.writeInt32(4, featureLevel.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DebugParameters()
        {
            clear();
        }
    }

    public static final class DebugResponseInfo extends ExtendableMessageNano
    {

        public RecognizedInstance experimentalInstance[];

        private DebugResponseInfo clear()
        {
            experimentalInstance = RecognizedInstance.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DebugResponseInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    RecognizedInstance arecognizedinstance[];
                    int j;
                    if (experimentalInstance == null)
                    {
                        j = 0;
                    } else
                    {
                        j = experimentalInstance.length;
                    }
                    arecognizedinstance = new RecognizedInstance[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(experimentalInstance, 0, arecognizedinstance, 0, j);
                        k = j;
                    }
                    for (; k < arecognizedinstance.length - 1; k++)
                    {
                        arecognizedinstance[k] = new RecognizedInstance();
                        codedinputbytebuffernano.readMessage(arecognizedinstance[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    arecognizedinstance[k] = new RecognizedInstance();
                    codedinputbytebuffernano.readMessage(arecognizedinstance[k]);
                    experimentalInstance = arecognizedinstance;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (experimentalInstance != null)
            {
                k = i;
                if (experimentalInstance.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= experimentalInstance.length)
                        {
                            break;
                        }
                        RecognizedInstance recognizedinstance = experimentalInstance[j];
                        k = i;
                        if (recognizedinstance != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, recognizedinstance);
                        }
                        j++;
                        i = k;
                    } while (true);
                }
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (experimentalInstance != null && experimentalInstance.length > 0)
            {
                for (int i = 0; i < experimentalInstance.length; i++)
                {
                    RecognizedInstance recognizedinstance = experimentalInstance[i];
                    if (recognizedinstance != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, recognizedinstance);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DebugResponseInfo()
        {
            clear();
        }
    }

    public static final class GiftCardRecognizedInstance extends ExtendableMessageNano
    {

        public GiftCardClass cardClass;
        public GiftCardInstance instance;

        private GiftCardRecognizedInstance clear()
        {
            cardClass = null;
            instance = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GiftCardRecognizedInstance mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public GiftCardRecognizedInstance()
        {
            clear();
        }
    }

    public static final class GiftCardRecognizedInstance.GiftCardClass extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletShared.OcrAttribution classAttribution[];
        public String discoverableProgramId;
        public String merchantName;

        private GiftCardRecognizedInstance.GiftCardClass clear()
        {
            merchantName = null;
            discoverableProgramId = null;
            classAttribution = com.google.wallet.proto.NanoWalletShared.OcrAttribution.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GiftCardRecognizedInstance.GiftCardClass mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public GiftCardRecognizedInstance.GiftCardClass()
        {
            clear();
        }
    }

    public static final class GiftCardRecognizedInstance.GiftCardInstance extends ExtendableMessageNano
    {

        public RecognizedBarcode barcode[];
        public RecognizedImageText cardNumber;
        public RecognizedImageText pin;

        private GiftCardRecognizedInstance.GiftCardInstance clear()
        {
            cardNumber = null;
            pin = null;
            barcode = RecognizedBarcode.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GiftCardRecognizedInstance.GiftCardInstance mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        cardNumber = new RecognizedImageText();
                    }
                    codedinputbytebuffernano.readMessage(cardNumber);
                    break;

                case 18: // '\022'
                    if (pin == null)
                    {
                        pin = new RecognizedImageText();
                    }
                    codedinputbytebuffernano.readMessage(pin);
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    RecognizedBarcode arecognizedbarcode[];
                    int j;
                    if (barcode == null)
                    {
                        j = 0;
                    } else
                    {
                        j = barcode.length;
                    }
                    arecognizedbarcode = new RecognizedBarcode[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(barcode, 0, arecognizedbarcode, 0, j);
                        k = j;
                    }
                    for (; k < arecognizedbarcode.length - 1; k++)
                    {
                        arecognizedbarcode[k] = new RecognizedBarcode();
                        codedinputbytebuffernano.readMessage(arecognizedbarcode[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    arecognizedbarcode[k] = new RecognizedBarcode();
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
                        RecognizedBarcode recognizedbarcode = barcode[k];
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
                    RecognizedBarcode recognizedbarcode = barcode[i];
                    if (recognizedbarcode != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, recognizedbarcode);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GiftCardRecognizedInstance.GiftCardInstance()
        {
            clear();
        }
    }

    public static final class Image extends ExtendableMessageNano
    {

        private static volatile Image _emptyArray[];
        public byte image[];

        private Image clear()
        {
            image = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Image[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Image[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Image mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    image = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (image != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, image);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (image != null)
            {
                codedoutputbytebuffernano.writeBytes(1, image);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Image()
        {
            clear();
        }
    }

    public static final class LoyaltyRecognizedInstance extends ExtendableMessageNano
    {

        public RecognizedBarcode barcode[];
        public String discoverableProgramId;
        public RecognizedImageText linkingId[];
        public RecognizedImageText merchantName;
        public RecognizedImageText programName;

        private LoyaltyRecognizedInstance clear()
        {
            discoverableProgramId = null;
            programName = null;
            merchantName = null;
            linkingId = RecognizedImageText.emptyArray();
            barcode = RecognizedBarcode.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LoyaltyRecognizedInstance mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    discoverableProgramId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (programName == null)
                    {
                        programName = new RecognizedImageText();
                    }
                    codedinputbytebuffernano.readMessage(programName);
                    break;

                case 26: // '\032'
                    if (merchantName == null)
                    {
                        merchantName = new RecognizedImageText();
                    }
                    codedinputbytebuffernano.readMessage(merchantName);
                    break;

                case 34: // '"'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    RecognizedImageText arecognizedimagetext[];
                    int j;
                    if (linkingId == null)
                    {
                        j = 0;
                    } else
                    {
                        j = linkingId.length;
                    }
                    arecognizedimagetext = new RecognizedImageText[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(linkingId, 0, arecognizedimagetext, 0, j);
                        l = j;
                    }
                    for (; l < arecognizedimagetext.length - 1; l++)
                    {
                        arecognizedimagetext[l] = new RecognizedImageText();
                        codedinputbytebuffernano.readMessage(arecognizedimagetext[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    arecognizedimagetext[l] = new RecognizedImageText();
                    codedinputbytebuffernano.readMessage(arecognizedimagetext[l]);
                    linkingId = arecognizedimagetext;
                    break;

                case 42: // '*'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    RecognizedBarcode arecognizedbarcode[];
                    int k;
                    if (barcode == null)
                    {
                        k = 0;
                    } else
                    {
                        k = barcode.length;
                    }
                    arecognizedbarcode = new RecognizedBarcode[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(barcode, 0, arecognizedbarcode, 0, k);
                        i1 = k;
                    }
                    for (; i1 < arecognizedbarcode.length - 1; i1++)
                    {
                        arecognizedbarcode[i1] = new RecognizedBarcode();
                        codedinputbytebuffernano.readMessage(arecognizedbarcode[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    arecognizedbarcode[i1] = new RecognizedBarcode();
                    codedinputbytebuffernano.readMessage(arecognizedbarcode[i1]);
                    barcode = arecognizedbarcode;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (discoverableProgramId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, discoverableProgramId);
            }
            int l = i;
            if (programName != null)
            {
                l = i + CodedOutputByteBufferNano.computeMessageSize(2, programName);
            }
            j = l;
            if (merchantName != null)
            {
                j = l + CodedOutputByteBufferNano.computeMessageSize(3, merchantName);
            }
            i = j;
            if (linkingId != null)
            {
                i = j;
                if (linkingId.length > 0)
                {
                    l = 0;
                    do
                    {
                        i = j;
                        if (l >= linkingId.length)
                        {
                            break;
                        }
                        RecognizedImageText recognizedimagetext = linkingId[l];
                        i = j;
                        if (recognizedimagetext != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(4, recognizedimagetext);
                        }
                        l++;
                        j = i;
                    } while (true);
                }
            }
            l = i;
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
                        RecognizedBarcode recognizedbarcode = barcode[k];
                        l = i;
                        if (recognizedbarcode != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(5, recognizedbarcode);
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
            if (discoverableProgramId != null)
            {
                codedoutputbytebuffernano.writeString(1, discoverableProgramId);
            }
            if (programName != null)
            {
                codedoutputbytebuffernano.writeMessage(2, programName);
            }
            if (merchantName != null)
            {
                codedoutputbytebuffernano.writeMessage(3, merchantName);
            }
            if (linkingId != null && linkingId.length > 0)
            {
                for (int i = 0; i < linkingId.length; i++)
                {
                    RecognizedImageText recognizedimagetext = linkingId[i];
                    if (recognizedimagetext != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, recognizedimagetext);
                    }
                }

            }
            if (barcode != null && barcode.length > 0)
            {
                for (int j = 0; j < barcode.length; j++)
                {
                    RecognizedBarcode recognizedbarcode = barcode[j];
                    if (recognizedbarcode != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, recognizedbarcode);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LoyaltyRecognizedInstance()
        {
            clear();
        }
    }

    public static final class RecognizedBarcode extends ExtendableMessageNano
    {

        private static volatile RecognizedBarcode _emptyArray[];
        public com.google.wallet.proto.NanoWalletEntities.Barcode barcode;
        public Float score;

        private RecognizedBarcode clear()
        {
            barcode = null;
            score = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static RecognizedBarcode[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new RecognizedBarcode[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private RecognizedBarcode mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (barcode == null)
                    {
                        barcode = new com.google.wallet.proto.NanoWalletEntities.Barcode();
                    }
                    codedinputbytebuffernano.readMessage(barcode);
                    break;

                case 21: // '\025'
                    score = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (barcode != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, barcode);
            }
            j = i;
            if (score != null)
            {
                j = i + CodedOutputByteBufferNano.computeFloatSize(2, score.floatValue());
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
            if (barcode != null)
            {
                codedoutputbytebuffernano.writeMessage(1, barcode);
            }
            if (score != null)
            {
                codedoutputbytebuffernano.writeFloat(2, score.floatValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RecognizedBarcode()
        {
            clear();
        }
    }

    public static final class RecognizedImageText extends ExtendableMessageNano
    {

        private static volatile RecognizedImageText _emptyArray[];
        public com.google.wallet.proto.NanoWalletShared.OcrAttribution attribution[];
        public BoundingBox boundingBox;
        public Integer promptId;
        public Float score;
        public String value;

        private RecognizedImageText clear()
        {
            value = null;
            score = null;
            attribution = com.google.wallet.proto.NanoWalletShared.OcrAttribution.emptyArray();
            promptId = null;
            boundingBox = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static RecognizedImageText[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new RecognizedImageText[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private RecognizedImageText mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    value = codedinputbytebuffernano.readString();
                    break;

                case 21: // '\025'
                    score = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    com.google.wallet.proto.NanoWalletShared.OcrAttribution aocrattribution[];
                    int j;
                    if (attribution == null)
                    {
                        j = 0;
                    } else
                    {
                        j = attribution.length;
                    }
                    aocrattribution = new com.google.wallet.proto.NanoWalletShared.OcrAttribution[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(attribution, 0, aocrattribution, 0, j);
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
                    attribution = aocrattribution;
                    break;

                case 32: // ' '
                    promptId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 42: // '*'
                    if (boundingBox == null)
                    {
                        boundingBox = new BoundingBox();
                    }
                    codedinputbytebuffernano.readMessage(boundingBox);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (value != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(1, value);
            }
            i = j;
            if (score != null)
            {
                i = j + CodedOutputByteBufferNano.computeFloatSize(2, score.floatValue());
            }
            j = i;
            if (attribution != null)
            {
                j = i;
                if (attribution.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= attribution.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletShared.OcrAttribution ocrattribution = attribution[k];
                        j = i;
                        if (ocrattribution != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(3, ocrattribution);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (promptId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, promptId.intValue());
            }
            j = i;
            if (boundingBox != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(5, boundingBox);
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
            if (value != null)
            {
                codedoutputbytebuffernano.writeString(1, value);
            }
            if (score != null)
            {
                codedoutputbytebuffernano.writeFloat(2, score.floatValue());
            }
            if (attribution != null && attribution.length > 0)
            {
                for (int i = 0; i < attribution.length; i++)
                {
                    com.google.wallet.proto.NanoWalletShared.OcrAttribution ocrattribution = attribution[i];
                    if (ocrattribution != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, ocrattribution);
                    }
                }

            }
            if (promptId != null)
            {
                codedoutputbytebuffernano.writeInt32(4, promptId.intValue());
            }
            if (boundingBox != null)
            {
                codedoutputbytebuffernano.writeMessage(5, boundingBox);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RecognizedImageText()
        {
            clear();
        }
    }

    public static final class RecognizedInstance extends ExtendableMessageNano
    {

        private static volatile RecognizedInstance _emptyArray[];
        public RecognizedBarcode barcode[];
        public GiftCardRecognizedInstance giftCardRecognizedInstance;
        public LoyaltyRecognizedInstance loyaltyRecognizedInstance;
        public RecognizedImageText textField[];

        private RecognizedInstance clear()
        {
            textField = RecognizedImageText.emptyArray();
            barcode = RecognizedBarcode.emptyArray();
            loyaltyRecognizedInstance = null;
            giftCardRecognizedInstance = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static RecognizedInstance[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new RecognizedInstance[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private RecognizedInstance mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (loyaltyRecognizedInstance == null)
                    {
                        loyaltyRecognizedInstance = new LoyaltyRecognizedInstance();
                    }
                    codedinputbytebuffernano.readMessage(loyaltyRecognizedInstance);
                    break;

                case 18: // '\022'
                    if (giftCardRecognizedInstance == null)
                    {
                        giftCardRecognizedInstance = new GiftCardRecognizedInstance();
                    }
                    codedinputbytebuffernano.readMessage(giftCardRecognizedInstance);
                    break;

                case 26: // '\032'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    RecognizedImageText arecognizedimagetext[];
                    int j;
                    if (textField == null)
                    {
                        j = 0;
                    } else
                    {
                        j = textField.length;
                    }
                    arecognizedimagetext = new RecognizedImageText[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(textField, 0, arecognizedimagetext, 0, j);
                        l = j;
                    }
                    for (; l < arecognizedimagetext.length - 1; l++)
                    {
                        arecognizedimagetext[l] = new RecognizedImageText();
                        codedinputbytebuffernano.readMessage(arecognizedimagetext[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    arecognizedimagetext[l] = new RecognizedImageText();
                    codedinputbytebuffernano.readMessage(arecognizedimagetext[l]);
                    textField = arecognizedimagetext;
                    break;

                case 34: // '"'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    RecognizedBarcode arecognizedbarcode[];
                    int k;
                    if (barcode == null)
                    {
                        k = 0;
                    } else
                    {
                        k = barcode.length;
                    }
                    arecognizedbarcode = new RecognizedBarcode[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(barcode, 0, arecognizedbarcode, 0, k);
                        i1 = k;
                    }
                    for (; i1 < arecognizedbarcode.length - 1; i1++)
                    {
                        arecognizedbarcode[i1] = new RecognizedBarcode();
                        codedinputbytebuffernano.readMessage(arecognizedbarcode[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    arecognizedbarcode[i1] = new RecognizedBarcode();
                    codedinputbytebuffernano.readMessage(arecognizedbarcode[i1]);
                    barcode = arecognizedbarcode;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (loyaltyRecognizedInstance != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, loyaltyRecognizedInstance);
            }
            j = i;
            if (giftCardRecognizedInstance != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, giftCardRecognizedInstance);
            }
            i = j;
            if (textField != null)
            {
                i = j;
                if (textField.length > 0)
                {
                    int l = 0;
                    do
                    {
                        i = j;
                        if (l >= textField.length)
                        {
                            break;
                        }
                        RecognizedImageText recognizedimagetext = textField[l];
                        i = j;
                        if (recognizedimagetext != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(3, recognizedimagetext);
                        }
                        l++;
                        j = i;
                    } while (true);
                }
            }
            int i1 = i;
            if (barcode != null)
            {
                i1 = i;
                if (barcode.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i1 = i;
                        if (k >= barcode.length)
                        {
                            break;
                        }
                        RecognizedBarcode recognizedbarcode = barcode[k];
                        i1 = i;
                        if (recognizedbarcode != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(4, recognizedbarcode);
                        }
                        k++;
                        i = i1;
                    } while (true);
                }
            }
            return i1;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (loyaltyRecognizedInstance != null)
            {
                codedoutputbytebuffernano.writeMessage(1, loyaltyRecognizedInstance);
            }
            if (giftCardRecognizedInstance != null)
            {
                codedoutputbytebuffernano.writeMessage(2, giftCardRecognizedInstance);
            }
            if (textField != null && textField.length > 0)
            {
                for (int i = 0; i < textField.length; i++)
                {
                    RecognizedImageText recognizedimagetext = textField[i];
                    if (recognizedimagetext != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, recognizedimagetext);
                    }
                }

            }
            if (barcode != null && barcode.length > 0)
            {
                for (int j = 0; j < barcode.length; j++)
                {
                    RecognizedBarcode recognizedbarcode = barcode[j];
                    if (recognizedbarcode != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, recognizedbarcode);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RecognizedInstance()
        {
            clear();
        }
    }

    public static final class WobsOcrRequest extends ExtendableMessageNano
    {

        public Integer captureMode;
        public DebugParameters debugParameters;
        public Image image[];
        public int types[];

        private WobsOcrRequest clear()
        {
            image = Image.emptyArray();
            debugParameters = null;
            types = WireFormatNano.EMPTY_INT_ARRAY;
            captureMode = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WobsOcrRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 68
        //                       0: 78
        //                       10: 80
        //                       18: 211
        //                       24: 240
        //                       26: 436
        //                       32: 658;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            Image aimage[];
            if (image == null)
            {
                i = 0;
            } else
            {
                i = image.length;
            }
            aimage = new Image[i + k];
            k = i;
            if (i != 0)
            {
                System.arraycopy(image, 0, aimage, 0, i);
                k = i;
            }
            for (; k < aimage.length - 1; k++)
            {
                aimage[k] = new Image();
                codedinputbytebuffernano.readMessage(aimage[k]);
                codedinputbytebuffernano.readTag();
            }

            aimage[k] = new Image();
            codedinputbytebuffernano.readMessage(aimage[k]);
            image = aimage;
              goto _L8
_L4:
            if (debugParameters == null)
            {
                debugParameters = new DebugParameters();
            }
            codedinputbytebuffernano.readMessage(debugParameters);
              goto _L8
_L5:
            int ai[];
            int l;
            int k1;
            k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
            ai = new int[k1];
            l = 0;
            i = 0;
_L15:
            if (l >= k1) goto _L10; else goto _L9
_L9:
            int l1;
            if (l != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            l1 = codedinputbytebuffernano.readInt32();
            l1;
            JVM INSTR tableswitch 0 4: default 320
        //                       0 329
        //                       1 329
        //                       2 329
        //                       3 320
        //                       4 329;
               goto _L11 _L12 _L12 _L12 _L11 _L12
_L11:
            l++;
              goto _L13
_L12:
            int i1 = i + 1;
            ai[i] = l1;
            i = i1;
            if (true) goto _L11; else goto _L13
_L13:
            if (true) goto _L15; else goto _L14
_L14:
_L10:
            if (i != 0)
            {
                if (types == null)
                {
                    l = 0;
                } else
                {
                    l = types.length;
                }
                if (l == 0 && i == k1)
                {
                    types = ai;
                } else
                {
                    int ai1[] = new int[l + i];
                    if (l != 0)
                    {
                        System.arraycopy(types, 0, ai1, 0, l);
                    }
                    System.arraycopy(ai, 0, ai1, l, i);
                    types = ai1;
                }
            }
              goto _L8
_L6:
            int j1;
            j1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            l = 0;
            i = codedinputbytebuffernano.getPosition();
_L21:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                switch (codedinputbytebuffernano.readInt32())
                {
                case 0: // '\0'
                case 1: // '\001'
                case 2: // '\002'
                case 4: // '\004'
                    l++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (l == 0) goto _L17; else goto _L16
_L16:
            codedinputbytebuffernano.rewindToPosition(i);
            if (types == null)
            {
                i = 0;
            } else
            {
                i = types.length;
            }
            ai = new int[i + l];
            l = i;
            if (i != 0)
            {
                System.arraycopy(types, 0, ai, 0, i);
                l = i;
            }
_L19:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readInt32();
                switch (i)
                {
                case 0: // '\0'
                case 1: // '\001'
                case 2: // '\002'
                case 4: // '\004'
                    ai[l] = i;
                    l++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            types = ai;
              goto _L17
            if (true) goto _L19; else goto _L18
_L18:
            if (true) goto _L21; else goto _L20
_L20:
_L17:
            codedinputbytebuffernano.popLimit(j1);
              goto _L8
_L7:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                captureMode = Integer.valueOf(j);
                break;
            }
            if (true) goto _L8; else goto _L22
_L22:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (image != null)
            {
                j = i;
                if (image.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= image.length)
                        {
                            break;
                        }
                        Image image1 = image[k];
                        j = i;
                        if (image1 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, image1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (debugParameters != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, debugParameters);
            }
            j = i;
            if (types != null)
            {
                j = i;
                if (types.length > 0)
                {
                    int l = 0;
                    for (j = 0; j < types.length; j++)
                    {
                        l += CodedOutputByteBufferNano.computeInt32SizeNoTag(types[j]);
                    }

                    j = i + l + types.length * 1;
                }
            }
            i = j;
            if (captureMode != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, captureMode.intValue());
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (image != null && image.length > 0)
            {
                for (int i = 0; i < image.length; i++)
                {
                    Image image1 = image[i];
                    if (image1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, image1);
                    }
                }

            }
            if (debugParameters != null)
            {
                codedoutputbytebuffernano.writeMessage(2, debugParameters);
            }
            if (types != null && types.length > 0)
            {
                for (int j = 0; j < types.length; j++)
                {
                    codedoutputbytebuffernano.writeInt32(3, types[j]);
                }

            }
            if (captureMode != null)
            {
                codedoutputbytebuffernano.writeInt32(4, captureMode.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WobsOcrRequest()
        {
            clear();
        }
    }

    public static final class WobsOcrResponse extends ExtendableMessageNano
    {

        public DebugResponseInfo debugResponseInfo;
        public RecognizedInstance recognizedInstance[];

        private WobsOcrResponse clear()
        {
            recognizedInstance = RecognizedInstance.emptyArray();
            debugResponseInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WobsOcrResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    RecognizedInstance arecognizedinstance[];
                    int j;
                    if (recognizedInstance == null)
                    {
                        j = 0;
                    } else
                    {
                        j = recognizedInstance.length;
                    }
                    arecognizedinstance = new RecognizedInstance[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(recognizedInstance, 0, arecognizedinstance, 0, j);
                        k = j;
                    }
                    for (; k < arecognizedinstance.length - 1; k++)
                    {
                        arecognizedinstance[k] = new RecognizedInstance();
                        codedinputbytebuffernano.readMessage(arecognizedinstance[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    arecognizedinstance[k] = new RecognizedInstance();
                    codedinputbytebuffernano.readMessage(arecognizedinstance[k]);
                    recognizedInstance = arecognizedinstance;
                    break;

                case 18: // '\022'
                    if (debugResponseInfo == null)
                    {
                        debugResponseInfo = new DebugResponseInfo();
                    }
                    codedinputbytebuffernano.readMessage(debugResponseInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (recognizedInstance != null)
            {
                j = i;
                if (recognizedInstance.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= recognizedInstance.length)
                        {
                            break;
                        }
                        RecognizedInstance recognizedinstance = recognizedInstance[k];
                        j = i;
                        if (recognizedinstance != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, recognizedinstance);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (debugResponseInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, debugResponseInfo);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (recognizedInstance != null && recognizedInstance.length > 0)
            {
                for (int i = 0; i < recognizedInstance.length; i++)
                {
                    RecognizedInstance recognizedinstance = recognizedInstance[i];
                    if (recognizedinstance != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, recognizedinstance);
                    }
                }

            }
            if (debugResponseInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, debugResponseInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WobsOcrResponse()
        {
            clear();
        }
    }

}
