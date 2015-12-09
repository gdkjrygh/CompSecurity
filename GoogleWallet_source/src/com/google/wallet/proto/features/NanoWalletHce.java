// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.features;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoWalletHce
{
    public static final class Cvc3Crypto extends ExtendableMessageNano
    {

        public byte ivcvc3Track1[];
        public byte ivcvc3Track2[];
        public byte kdcvc3[];

        private Cvc3Crypto clear()
        {
            kdcvc3 = null;
            ivcvc3Track1 = null;
            ivcvc3Track2 = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Cvc3Crypto mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    kdcvc3 = codedinputbytebuffernano.readBytes();
                    break;

                case 26: // '\032'
                    ivcvc3Track1 = codedinputbytebuffernano.readBytes();
                    break;

                case 34: // '"'
                    ivcvc3Track2 = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (kdcvc3 != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(2, kdcvc3);
            }
            j = i;
            if (ivcvc3Track1 != null)
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(3, ivcvc3Track1);
            }
            i = j;
            if (ivcvc3Track2 != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(4, ivcvc3Track2);
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
            if (kdcvc3 != null)
            {
                codedoutputbytebuffernano.writeBytes(2, kdcvc3);
            }
            if (ivcvc3Track1 != null)
            {
                codedoutputbytebuffernano.writeBytes(3, ivcvc3Track1);
            }
            if (ivcvc3Track2 != null)
            {
                codedoutputbytebuffernano.writeBytes(4, ivcvc3Track2);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Cvc3Crypto()
        {
            clear();
        }
    }

    public static final class Limits extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.DisplayableDuration duration;
        public Long expirationThresholdTimestampMillisClientOffset;
        public Long expirationTimestampMillisClientOffset;
        public Integer transactionCountLimit;
        public Integer transactionCountThreshold;

        private Limits clear()
        {
            expirationTimestampMillisClientOffset = null;
            transactionCountLimit = null;
            transactionCountThreshold = null;
            expirationThresholdTimestampMillisClientOffset = null;
            duration = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Limits mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 16: // '\020'
                    expirationTimestampMillisClientOffset = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 32: // ' '
                    transactionCountLimit = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 40: // '('
                    transactionCountThreshold = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 48: // '0'
                    expirationThresholdTimestampMillisClientOffset = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 58: // ':'
                    if (duration == null)
                    {
                        duration = new com.google.wallet.proto.NanoWalletEntities.DisplayableDuration();
                    }
                    codedinputbytebuffernano.readMessage(duration);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (expirationTimestampMillisClientOffset != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, expirationTimestampMillisClientOffset.longValue());
            }
            j = i;
            if (transactionCountLimit != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, transactionCountLimit.intValue());
            }
            i = j;
            if (transactionCountThreshold != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, transactionCountThreshold.intValue());
            }
            j = i;
            if (expirationThresholdTimestampMillisClientOffset != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(6, expirationThresholdTimestampMillisClientOffset.longValue());
            }
            i = j;
            if (duration != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, duration);
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
            if (expirationTimestampMillisClientOffset != null)
            {
                codedoutputbytebuffernano.writeInt64(2, expirationTimestampMillisClientOffset.longValue());
            }
            if (transactionCountLimit != null)
            {
                codedoutputbytebuffernano.writeInt32(4, transactionCountLimit.intValue());
            }
            if (transactionCountThreshold != null)
            {
                codedoutputbytebuffernano.writeInt32(5, transactionCountThreshold.intValue());
            }
            if (expirationThresholdTimestampMillisClientOffset != null)
            {
                codedoutputbytebuffernano.writeInt64(6, expirationThresholdTimestampMillisClientOffset.longValue());
            }
            if (duration != null)
            {
                codedoutputbytebuffernano.writeMessage(7, duration);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Limits()
        {
            clear();
        }
    }

    public static final class Metadata extends ExtendableMessageNano
    {

        public Integer bundleType;
        public Limits limits;

        private Metadata clear()
        {
            bundleType = null;
            limits = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Metadata mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       18: 98;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 2: // '\002'
            case 4: // '\004'
                bundleType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (limits == null)
            {
                limits = new Limits();
            }
            codedinputbytebuffernano.readMessage(limits);
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (bundleType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, bundleType.intValue());
            }
            j = i;
            if (limits != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, limits);
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
            if (bundleType != null)
            {
                codedoutputbytebuffernano.writeInt32(1, bundleType.intValue());
            }
            if (limits != null)
            {
                codedoutputbytebuffernano.writeMessage(2, limits);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Metadata()
        {
            clear();
        }
    }

    public static final class PaypassBundle extends ExtendableMessageNano
    {

        public PersonalizationData persoData;
        public RotatingAtc rotatingAtc[];

        private PaypassBundle clear()
        {
            persoData = null;
            rotatingAtc = RotatingAtc.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PaypassBundle mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (persoData == null)
                    {
                        persoData = new PersonalizationData();
                    }
                    codedinputbytebuffernano.readMessage(persoData);
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    RotatingAtc arotatingatc[];
                    int j;
                    if (rotatingAtc == null)
                    {
                        j = 0;
                    } else
                    {
                        j = rotatingAtc.length;
                    }
                    arotatingatc = new RotatingAtc[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(rotatingAtc, 0, arotatingatc, 0, j);
                        k = j;
                    }
                    for (; k < arotatingatc.length - 1; k++)
                    {
                        arotatingatc[k] = new RotatingAtc();
                        codedinputbytebuffernano.readMessage(arotatingatc[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    arotatingatc[k] = new RotatingAtc();
                    codedinputbytebuffernano.readMessage(arotatingatc[k]);
                    rotatingAtc = arotatingatc;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (persoData != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, persoData);
            }
            int l = i;
            if (rotatingAtc != null)
            {
                l = i;
                if (rotatingAtc.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= rotatingAtc.length)
                        {
                            break;
                        }
                        RotatingAtc rotatingatc = rotatingAtc[k];
                        l = i;
                        if (rotatingatc != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, rotatingatc);
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
            if (persoData != null)
            {
                codedoutputbytebuffernano.writeMessage(2, persoData);
            }
            if (rotatingAtc != null && rotatingAtc.length > 0)
            {
                for (int i = 0; i < rotatingAtc.length; i++)
                {
                    RotatingAtc rotatingatc = rotatingAtc[i];
                    if (rotatingatc != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, rotatingatc);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PaypassBundle()
        {
            clear();
        }
    }

    public static final class PersonalizationData extends ExtendableMessageNano
    {

        public byte aid[];
        public byte aip[];
        public byte applicationFileLocator[];
        public Integer applicationPriorityIndicator;
        public Cvc3Crypto cvc3Crypto;
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

        private PersonalizationData clear()
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

        private PersonalizationData mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        cvc3Crypto = new Cvc3Crypto();
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

        public PersonalizationData()
        {
            clear();
        }
    }

    public static final class RotatingAtc extends ExtendableMessageNano
    {

        private static volatile RotatingAtc _emptyArray[];
        public Integer readerAtc;
        public Integer secretAtc;

        private RotatingAtc clear()
        {
            secretAtc = null;
            readerAtc = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static RotatingAtc[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new RotatingAtc[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private RotatingAtc mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 16: // '\020'
                    secretAtc = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 24: // '\030'
                    readerAtc = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (secretAtc != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(2, secretAtc.intValue());
            }
            j = i;
            if (readerAtc != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, readerAtc.intValue());
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
            if (secretAtc != null)
            {
                codedoutputbytebuffernano.writeInt32(2, secretAtc.intValue());
            }
            if (readerAtc != null)
            {
                codedoutputbytebuffernano.writeInt32(3, readerAtc.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RotatingAtc()
        {
            clear();
        }
    }

}
