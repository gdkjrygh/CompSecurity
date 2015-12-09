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

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletScheduleTopups

public static final class clear extends ExtendableMessageNano
{
    public static final class EligibilityExplanation extends ExtendableMessageNano
    {

        public String description;
        public HelpLink helpLink;

        private EligibilityExplanation clear()
        {
            description = null;
            helpLink = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private EligibilityExplanation mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    description = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (helpLink == null)
                    {
                        helpLink = new HelpLink();
                    }
                    codedinputbytebuffernano.readMessage(helpLink);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (description != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, description);
            }
            j = i;
            if (helpLink != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, helpLink);
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
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(1, description);
            }
            if (helpLink != null)
            {
                codedoutputbytebuffernano.writeMessage(2, helpLink);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EligibilityExplanation()
        {
            clear();
        }
    }

    public static final class EligibilityExplanation.HelpLink extends ExtendableMessageNano
    {

        public String linkUri;
        public String text;

        private EligibilityExplanation.HelpLink clear()
        {
            text = null;
            linkUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private EligibilityExplanation.HelpLink mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    text = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    linkUri = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (text != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, text);
            }
            j = i;
            if (linkUri != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, linkUri);
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
            if (text != null)
            {
                codedoutputbytebuffernano.writeString(1, text);
            }
            if (linkUri != null)
            {
                codedoutputbytebuffernano.writeString(2, linkUri);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EligibilityExplanation.HelpLink()
        {
            clear();
        }
    }

    public static final class TransferLimit extends ExtendableMessageNano
    {

        private static volatile TransferLimit _emptyArray[];
        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney maximumTopupAmount;
        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney minimumTopupAmount;
        public Integer recurrence;

        private TransferLimit clear()
        {
            recurrence = null;
            minimumTopupAmount = null;
            maximumTopupAmount = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static TransferLimit[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new TransferLimit[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private TransferLimit mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       18: 110
        //                       26: 139;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                recurrence = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (minimumTopupAmount == null)
            {
                minimumTopupAmount = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
            }
            codedinputbytebuffernano.readMessage(minimumTopupAmount);
            continue; /* Loop/switch isn't completed */
_L5:
            if (maximumTopupAmount == null)
            {
                maximumTopupAmount = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
            }
            codedinputbytebuffernano.readMessage(maximumTopupAmount);
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (recurrence != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, recurrence.intValue());
            }
            j = i;
            if (minimumTopupAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, minimumTopupAmount);
            }
            i = j;
            if (maximumTopupAmount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, maximumTopupAmount);
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
            if (recurrence != null)
            {
                codedoutputbytebuffernano.writeInt32(1, recurrence.intValue());
            }
            if (minimumTopupAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(2, minimumTopupAmount);
            }
            if (maximumTopupAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(3, maximumTopupAmount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TransferLimit()
        {
            clear();
        }
    }


    public com.google.wallet.proto.nse.transferLimits callError;
    public EligibilityExplanation explanation;
    public Boolean isEligible;
    public TransferLimit transferLimits[];

    private TransferLimit clear()
    {
        isEligible = null;
        callError = null;
        explanation = null;
        transferLimits = TransferLimit.emptyArray();
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
                isEligible = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 18: // '\022'
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;

            case 26: // '\032'
                if (explanation == null)
                {
                    explanation = new EligibilityExplanation();
                }
                codedinputbytebuffernano.readMessage(explanation);
                break;

            case 42: // '*'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                TransferLimit atransferlimit[];
                int j;
                if (transferLimits == null)
                {
                    j = 0;
                } else
                {
                    j = transferLimits.length;
                }
                atransferlimit = new TransferLimit[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(transferLimits, 0, atransferlimit, 0, j);
                    k = j;
                }
                for (; k < atransferlimit.length - 1; k++)
                {
                    atransferlimit[k] = new TransferLimit();
                    codedinputbytebuffernano.readMessage(atransferlimit[k]);
                    codedinputbytebuffernano.readTag();
                }

                atransferlimit[k] = new TransferLimit();
                codedinputbytebuffernano.readMessage(atransferlimit[k]);
                transferLimits = atransferlimit;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (isEligible != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(1, isEligible.booleanValue());
        }
        j = i;
        if (callError != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
        }
        i = j;
        if (explanation != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, explanation);
        }
        int l = i;
        if (transferLimits != null)
        {
            l = i;
            if (transferLimits.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= transferLimits.length)
                    {
                        break;
                    }
                    TransferLimit transferlimit = transferLimits[k];
                    l = i;
                    if (transferlimit != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(5, transferlimit);
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
        if (isEligible != null)
        {
            codedoutputbytebuffernano.writeBool(1, isEligible.booleanValue());
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(2, callError);
        }
        if (explanation != null)
        {
            codedoutputbytebuffernano.writeMessage(3, explanation);
        }
        if (transferLimits != null && transferLimits.length > 0)
        {
            for (int i = 0; i < transferLimits.length; i++)
            {
                TransferLimit transferlimit = transferLimits[i];
                if (transferlimit != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, transferlimit);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public TransferLimit.clear()
    {
        clear();
    }
}
