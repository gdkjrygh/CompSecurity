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

public interface NanoWalletError
{
    public static final class CallError extends ExtendableMessageNano
    {

        public Action action[];
        public String content;
        public Integer errorCode;
        public String requestId;
        public String title;

        private CallError clear()
        {
            title = null;
            content = null;
            errorCode = null;
            action = Action.emptyArray();
            requestId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CallError mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    title = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    content = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    errorCode = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    Action aaction[];
                    int j;
                    if (action == null)
                    {
                        j = 0;
                    } else
                    {
                        j = action.length;
                    }
                    aaction = new Action[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(action, 0, aaction, 0, j);
                        k = j;
                    }
                    for (; k < aaction.length - 1; k++)
                    {
                        aaction[k] = new Action();
                        codedinputbytebuffernano.readMessage(aaction[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aaction[k] = new Action();
                    codedinputbytebuffernano.readMessage(aaction[k]);
                    action = aaction;
                    break;

                case 42: // '*'
                    requestId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (title != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
            }
            j = i;
            if (content != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, content);
            }
            i = j;
            if (errorCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, errorCode.intValue());
            }
            j = i;
            if (action != null)
            {
                j = i;
                if (action.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= action.length)
                        {
                            break;
                        }
                        Action action1 = action[k];
                        j = i;
                        if (action1 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(4, action1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (requestId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, requestId);
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
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(1, title);
            }
            if (content != null)
            {
                codedoutputbytebuffernano.writeString(2, content);
            }
            if (errorCode != null)
            {
                codedoutputbytebuffernano.writeInt32(3, errorCode.intValue());
            }
            if (action != null && action.length > 0)
            {
                for (int i = 0; i < action.length; i++)
                {
                    Action action1 = action[i];
                    if (action1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, action1);
                    }
                }

            }
            if (requestId != null)
            {
                codedoutputbytebuffernano.writeString(5, requestId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CallError()
        {
            clear();
        }
    }

    public static final class CallError.Action extends ExtendableMessageNano
    {

        private static volatile CallError.Action _emptyArray[];
        public String linkUri;
        public String text;

        private CallError.Action clear()
        {
            text = null;
            linkUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static CallError.Action[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new CallError.Action[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private CallError.Action mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public CallError.Action()
        {
            clear();
        }
    }

}
