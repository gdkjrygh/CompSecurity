// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface PlusProfile
{
    public static final class PlusProfileResponse extends MessageNano
    {

        public boolean hasIsGplusUser;
        public boolean isGplusUser;
        public DocumentV2.DocV2 partialUserProfile;
        public PlusData.OBSOLETE_PlusProfile plusProfile;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                i = j;
                if (plusProfile != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(1, plusProfile);
                }
                j = i;
                if (partialUserProfile != null)
                {
                    j = i + CodedOutputByteBufferNano.computeMessageSize(2, partialUserProfile);
                }
                if (!hasIsGplusUser)
                {
                    i = j;
                    if (isGplusUser)
                    {
                        break label0;
                    }
                }
                i = j + (CodedOutputByteBufferNano.computeTagSize(3) + 1);
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
                    if (plusProfile == null)
                    {
                        plusProfile = new PlusData.OBSOLETE_PlusProfile();
                    }
                    codedinputbytebuffernano.readMessage(plusProfile);
                    break;

                case 18: // '\022'
                    if (partialUserProfile == null)
                    {
                        partialUserProfile = new DocumentV2.DocV2();
                    }
                    codedinputbytebuffernano.readMessage(partialUserProfile);
                    break;

                case 24: // '\030'
                    isGplusUser = codedinputbytebuffernano.readBool();
                    hasIsGplusUser = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (plusProfile != null)
            {
                codedoutputbytebuffernano.writeMessage(1, plusProfile);
            }
            if (partialUserProfile != null)
            {
                codedoutputbytebuffernano.writeMessage(2, partialUserProfile);
            }
            if (hasIsGplusUser || !isGplusUser)
            {
                codedoutputbytebuffernano.writeBool(3, isGplusUser);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlusProfileResponse()
        {
            partialUserProfile = null;
            isGplusUser = true;
            hasIsGplusUser = false;
            plusProfile = null;
            cachedSize = -1;
        }
    }

}
