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

public interface NanoWalletStatement
{
    public static final class StoredValueStatementsRequest extends ExtendableMessageNano
    {

        private StoredValueStatementsRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private StoredValueStatementsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 33;
               goto _L1 _L2
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public StoredValueStatementsRequest()
        {
            clear();
        }
    }

    public static final class StoredValueStatementsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public StatementLink statementLink[];

        private StoredValueStatementsResponse clear()
        {
            callError = null;
            statementLink = StatementLink.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private StoredValueStatementsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    StatementLink astatementlink[];
                    int j;
                    if (statementLink == null)
                    {
                        j = 0;
                    } else
                    {
                        j = statementLink.length;
                    }
                    astatementlink = new StatementLink[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(statementLink, 0, astatementlink, 0, j);
                        k = j;
                    }
                    for (; k < astatementlink.length - 1; k++)
                    {
                        astatementlink[k] = new StatementLink();
                        codedinputbytebuffernano.readMessage(astatementlink[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    astatementlink[k] = new StatementLink();
                    codedinputbytebuffernano.readMessage(astatementlink[k]);
                    statementLink = astatementlink;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
            }
            int l = i;
            if (statementLink != null)
            {
                l = i;
                if (statementLink.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= statementLink.length)
                        {
                            break;
                        }
                        StatementLink statementlink = statementLink[k];
                        l = i;
                        if (statementlink != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(2, statementlink);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            if (statementLink != null && statementLink.length > 0)
            {
                for (int i = 0; i < statementLink.length; i++)
                {
                    StatementLink statementlink = statementLink[i];
                    if (statementlink != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, statementlink);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public StoredValueStatementsResponse()
        {
            clear();
        }
    }

    public static final class StoredValueStatementsResponse.StatementLink extends ExtendableMessageNano
    {

        private static volatile StoredValueStatementsResponse.StatementLink _emptyArray[];
        public String statementLink;
        public String statementTitle;

        private StoredValueStatementsResponse.StatementLink clear()
        {
            statementTitle = null;
            statementLink = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static StoredValueStatementsResponse.StatementLink[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new StoredValueStatementsResponse.StatementLink[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private StoredValueStatementsResponse.StatementLink mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    statementTitle = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    statementLink = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (statementTitle != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, statementTitle);
            }
            j = i;
            if (statementLink != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, statementLink);
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
            if (statementTitle != null)
            {
                codedoutputbytebuffernano.writeString(1, statementTitle);
            }
            if (statementLink != null)
            {
                codedoutputbytebuffernano.writeString(2, statementLink);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public StoredValueStatementsResponse.StatementLink()
        {
            clear();
        }
    }

}
