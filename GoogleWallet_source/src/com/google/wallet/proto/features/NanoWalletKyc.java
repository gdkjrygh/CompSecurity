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

public interface NanoWalletKyc
{
    public static final class DateOfBirth extends ExtendableMessageNano
    {

        public Integer day;
        public Integer month;
        public Integer year;

        private DateOfBirth clear()
        {
            year = null;
            month = null;
            day = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DateOfBirth mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    year = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 16: // '\020'
                    month = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 24: // '\030'
                    day = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (year != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, year.intValue());
            }
            j = i;
            if (month != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, month.intValue());
            }
            i = j;
            if (day != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, day.intValue());
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
            if (year != null)
            {
                codedoutputbytebuffernano.writeInt32(1, year.intValue());
            }
            if (month != null)
            {
                codedoutputbytebuffernano.writeInt32(2, month.intValue());
            }
            if (day != null)
            {
                codedoutputbytebuffernano.writeInt32(3, day.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DateOfBirth()
        {
            clear();
        }
    }

    public static final class ReferralAnswer extends ExtendableMessageNano
    {

        private static volatile ReferralAnswer _emptyArray[];
        public String answer;
        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData encryptedAnswer;
        public String questionId;

        private ReferralAnswer clear()
        {
            questionId = null;
            answer = null;
            encryptedAnswer = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ReferralAnswer[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ReferralAnswer[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ReferralAnswer mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    questionId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    answer = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (encryptedAnswer == null)
                    {
                        encryptedAnswer = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                    }
                    codedinputbytebuffernano.readMessage(encryptedAnswer);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (questionId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, questionId);
            }
            j = i;
            if (answer != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, answer);
            }
            i = j;
            if (encryptedAnswer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, encryptedAnswer);
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
            if (questionId != null)
            {
                codedoutputbytebuffernano.writeString(1, questionId);
            }
            if (answer != null)
            {
                codedoutputbytebuffernano.writeString(2, answer);
            }
            if (encryptedAnswer != null)
            {
                codedoutputbytebuffernano.writeMessage(3, encryptedAnswer);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ReferralAnswer()
        {
            clear();
        }
    }

    public static final class ReferralQuestion extends ExtendableMessageNano
    {

        private static volatile ReferralQuestion _emptyArray[];
        public String possibleAnswer[];
        public String prompt;
        public String questionId;

        private ReferralQuestion clear()
        {
            questionId = null;
            prompt = null;
            possibleAnswer = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ReferralQuestion[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ReferralQuestion[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ReferralQuestion mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    questionId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    prompt = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    String as[];
                    int j;
                    if (possibleAnswer == null)
                    {
                        j = 0;
                    } else
                    {
                        j = possibleAnswer.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(possibleAnswer, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    possibleAnswer = as;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (questionId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(1, questionId);
            }
            i = j;
            if (prompt != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, prompt);
            }
            j = i;
            if (possibleAnswer != null)
            {
                j = i;
                if (possibleAnswer.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < possibleAnswer.length;)
                    {
                        String s = possibleAnswer[j];
                        int j1 = i1;
                        int l = k;
                        if (s != null)
                        {
                            j1 = i1 + 1;
                            l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        i1 = j1;
                        k = l;
                    }

                    j = i + k + i1 * 1;
                }
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
            if (questionId != null)
            {
                codedoutputbytebuffernano.writeString(1, questionId);
            }
            if (prompt != null)
            {
                codedoutputbytebuffernano.writeString(2, prompt);
            }
            if (possibleAnswer != null && possibleAnswer.length > 0)
            {
                for (int i = 0; i < possibleAnswer.length; i++)
                {
                    String s = possibleAnswer[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(3, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ReferralQuestion()
        {
            clear();
        }
    }

}
