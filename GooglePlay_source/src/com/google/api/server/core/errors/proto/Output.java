// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.server.core.errors.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface Output
{
    public static final class ErrorBody extends MessageNano
    {

        public ErrorProto error;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (error != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, error);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    if (error == null)
                    {
                        error = new ErrorProto();
                    }
                    codedinputbytebuffernano.readMessage(error);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (error != null)
            {
                codedoutputbytebuffernano.writeMessage(1, error);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ErrorBody()
        {
            error = null;
            cachedSize = -1;
        }
    }

    public static final class ErrorProto extends MessageNano
    {

        public Integer code;
        public IndividualError errors[];
        public String message;

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (code != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(1, code.intValue());
            }
            i = j;
            if (message != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, message);
            }
            int l = i;
            if (errors != null)
            {
                l = i;
                if (errors.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= errors.length)
                        {
                            break;
                        }
                        IndividualError individualerror = errors[k];
                        l = i;
                        if (individualerror != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, individualerror);
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
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    code = Integer.valueOf(codedinputbytebuffernano.readRawVarint32());
                    break;

                case 18: // '\022'
                    message = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    IndividualError aindividualerror[];
                    int j;
                    if (errors == null)
                    {
                        j = 0;
                    } else
                    {
                        j = errors.length;
                    }
                    aindividualerror = new IndividualError[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(errors, 0, aindividualerror, 0, j);
                        k = j;
                    }
                    for (; k < aindividualerror.length - 1; k++)
                    {
                        aindividualerror[k] = new IndividualError();
                        codedinputbytebuffernano.readMessage(aindividualerror[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aindividualerror[k] = new IndividualError();
                    codedinputbytebuffernano.readMessage(aindividualerror[k]);
                    errors = aindividualerror;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (code != null)
            {
                codedoutputbytebuffernano.writeInt32(1, code.intValue());
            }
            if (message != null)
            {
                codedoutputbytebuffernano.writeString(2, message);
            }
            if (errors != null && errors.length > 0)
            {
                for (int i = 0; i < errors.length; i++)
                {
                    IndividualError individualerror = errors[i];
                    if (individualerror != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, individualerror);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ErrorProto()
        {
            code = null;
            message = null;
            errors = IndividualError.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class IndividualError extends MessageNano
    {

        private static volatile IndividualError _emptyArray[];
        public String debugInfo;
        public String domain;
        public String extendedHelp;
        public String location;
        public Integer locationType;
        public String message;
        public String reason;

        public static IndividualError[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new IndividualError[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (message != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, message);
            }
            j = i;
            if (domain != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, domain);
            }
            i = j;
            if (reason != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, reason);
            }
            j = i;
            if (extendedHelp != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, extendedHelp);
            }
            i = j;
            if (locationType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, locationType.intValue());
            }
            j = i;
            if (location != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, location);
            }
            i = j;
            if (debugInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, debugInfo);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L10:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 8: default 80
        //                       0: 88
        //                       10: 90
        //                       18: 101
        //                       26: 112
        //                       34: 123
        //                       40: 134
        //                       50: 186
        //                       58: 197;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
            return this;
_L3:
            message = codedinputbytebuffernano.readString();
              goto _L10
_L4:
            domain = codedinputbytebuffernano.readString();
              goto _L10
_L5:
            reason = codedinputbytebuffernano.readString();
              goto _L10
_L6:
            extendedHelp = codedinputbytebuffernano.readString();
              goto _L10
_L7:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                locationType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L8:
            location = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L9:
            debugInfo = codedinputbytebuffernano.readString();
            if (true) goto _L10; else goto _L11
_L11:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (message != null)
            {
                codedoutputbytebuffernano.writeString(1, message);
            }
            if (domain != null)
            {
                codedoutputbytebuffernano.writeString(2, domain);
            }
            if (reason != null)
            {
                codedoutputbytebuffernano.writeString(3, reason);
            }
            if (extendedHelp != null)
            {
                codedoutputbytebuffernano.writeString(4, extendedHelp);
            }
            if (locationType != null)
            {
                codedoutputbytebuffernano.writeInt32(5, locationType.intValue());
            }
            if (location != null)
            {
                codedoutputbytebuffernano.writeString(6, location);
            }
            if (debugInfo != null)
            {
                codedoutputbytebuffernano.writeString(7, debugInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public IndividualError()
        {
            message = null;
            domain = null;
            reason = null;
            extendedHelp = null;
            locationType = null;
            location = null;
            debugInfo = null;
            cachedSize = -1;
        }
    }

}
