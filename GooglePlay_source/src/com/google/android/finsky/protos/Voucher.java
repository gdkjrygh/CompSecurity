// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface Voucher
{
    public static final class LibraryVoucher extends MessageNano
    {

        public Common.VoucherId voucherId;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (voucherId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, voucherId);
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
                    if (voucherId == null)
                    {
                        voucherId = new Common.VoucherId();
                    }
                    codedinputbytebuffernano.readMessage(voucherId);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (voucherId != null)
            {
                codedoutputbytebuffernano.writeMessage(1, voucherId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LibraryVoucher()
        {
            voucherId = null;
            cachedSize = -1;
        }
    }

}
