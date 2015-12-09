// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletFundsTransfer

public static final class clear extends ExtendableMessageNano
{
    public static final class Delay extends ExtendableMessageNano
    {

        public String description;
        public String descriptionPrefix;
        public String explanation;
        public HelpLink helpLink;

        private Delay clear()
        {
            descriptionPrefix = null;
            description = null;
            explanation = null;
            helpLink = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Delay mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    descriptionPrefix = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    description = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    explanation = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
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
            if (descriptionPrefix != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, descriptionPrefix);
            }
            j = i;
            if (description != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, description);
            }
            i = j;
            if (explanation != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, explanation);
            }
            j = i;
            if (helpLink != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, helpLink);
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
            if (descriptionPrefix != null)
            {
                codedoutputbytebuffernano.writeString(1, descriptionPrefix);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(2, description);
            }
            if (explanation != null)
            {
                codedoutputbytebuffernano.writeString(3, explanation);
            }
            if (helpLink != null)
            {
                codedoutputbytebuffernano.writeMessage(4, helpLink);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Delay()
        {
            clear();
        }
    }

    public static final class HelpLink extends ExtendableMessageNano
    {

        public String linkUri;
        public String text;

        private HelpLink clear()
        {
            text = null;
            linkUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private HelpLink mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public HelpLink()
        {
            clear();
        }
    }

    public static final class Instant extends ExtendableMessageNano
    {

        public String description;

        private Instant clear()
        {
            description = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Instant mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(1, description);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Instant()
        {
            clear();
        }
    }


    public com.google.wallet.proto.nse.delay callError;
    public Delay delay;
    public Instant instant;

    private Instant.description clear()
    {
        callError = null;
        instant = null;
        delay = null;
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
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;

            case 18: // '\022'
                if (instant == null)
                {
                    instant = new Instant();
                }
                codedinputbytebuffernano.readMessage(instant);
                break;

            case 26: // '\032'
                if (delay == null)
                {
                    delay = new Delay();
                }
                codedinputbytebuffernano.readMessage(delay);
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
        j = i;
        if (instant != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, instant);
        }
        i = j;
        if (delay != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, delay);
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
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(1, callError);
        }
        if (instant != null)
        {
            codedoutputbytebuffernano.writeMessage(2, instant);
        }
        if (delay != null)
        {
            codedoutputbytebuffernano.writeMessage(3, delay);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Instant.clear()
    {
        clear();
    }
}
