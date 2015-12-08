// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface Experiments
{
    public static final class ExperimentsResponse extends MessageNano
    {

        public Targeting.Targets targets;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (targets != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, targets);
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
                    if (targets == null)
                    {
                        targets = new Targeting.Targets();
                    }
                    codedinputbytebuffernano.readMessage(targets);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (targets != null)
            {
                codedoutputbytebuffernano.writeMessage(1, targets);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ExperimentsResponse()
        {
            targets = null;
            cachedSize = -1;
        }
    }

}
