// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface PlayPlusProfile
{
    public static final class PlayPlusProfileResponse extends MessageNano
    {

        public boolean hasIsGplusUser;
        public boolean isGplusUser;
        public Document.PlayDocument userProfile;

        protected final int computeSerializedSize()
        {
            int j;
label0:
            {
                j = super.computeSerializedSize();
                int i = j;
                if (userProfile != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(1, userProfile);
                }
                if (!hasIsGplusUser)
                {
                    j = i;
                    if (!isGplusUser)
                    {
                        break label0;
                    }
                }
                j = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
            }
            return j;
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
                    if (userProfile == null)
                    {
                        userProfile = new Document.PlayDocument();
                    }
                    codedinputbytebuffernano.readMessage(userProfile);
                    break;

                case 16: // '\020'
                    isGplusUser = codedinputbytebuffernano.readBool();
                    hasIsGplusUser = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (userProfile != null)
            {
                codedoutputbytebuffernano.writeMessage(1, userProfile);
            }
            if (hasIsGplusUser || isGplusUser)
            {
                codedoutputbytebuffernano.writeBool(2, isGplusUser);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlayPlusProfileResponse()
        {
            userProfile = null;
            isGplusUser = false;
            hasIsGplusUser = false;
            cachedSize = -1;
        }
    }

}
