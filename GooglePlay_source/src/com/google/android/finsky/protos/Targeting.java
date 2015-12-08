// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public interface Targeting
{
    public static final class Targets extends MessageNano
    {

        public boolean hasSignature;
        public byte signature[];
        public long targetId[];

        protected final int computeSerializedSize()
        {
            int k;
label0:
            {
                int l = super.computeSerializedSize();
                int i = l;
                if (targetId != null)
                {
                    i = l;
                    if (targetId.length > 0)
                    {
                        int j = 0;
                        for (i = 0; i < targetId.length; i++)
                        {
                            j += CodedOutputByteBufferNano.computeRawVarint64Size(targetId[i]);
                        }

                        i = l + j + targetId.length * 1;
                    }
                }
                if (!hasSignature)
                {
                    k = i;
                    if (Arrays.equals(signature, WireFormatNano.EMPTY_BYTES))
                    {
                        break label0;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeBytesSize(2, signature);
            }
            return k;
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
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 8);
                    long al[];
                    int j;
                    if (targetId == null)
                    {
                        j = 0;
                    } else
                    {
                        j = targetId.length;
                    }
                    al = new long[l + j];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(targetId, 0, al, 0, j);
                        l = j;
                    }
                    for (; l < al.length - 1; l++)
                    {
                        al[l] = codedinputbytebuffernano.readRawVarint64();
                        codedinputbytebuffernano.readTag();
                    }

                    al[l] = codedinputbytebuffernano.readRawVarint64();
                    targetId = al;
                    break;

                case 10: // '\n'
                    int j1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int k = codedinputbytebuffernano.getPosition();
                    int i1;
                    for (i1 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; i1++)
                    {
                        codedinputbytebuffernano.readRawVarint64();
                    }

                    codedinputbytebuffernano.rewindToPosition(k);
                    long al1[];
                    if (targetId == null)
                    {
                        k = 0;
                    } else
                    {
                        k = targetId.length;
                    }
                    al1 = new long[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(targetId, 0, al1, 0, k);
                        i1 = k;
                    }
                    for (; i1 < al1.length; i1++)
                    {
                        al1[i1] = codedinputbytebuffernano.readRawVarint64();
                    }

                    targetId = al1;
                    codedinputbytebuffernano.popLimit(j1);
                    break;

                case 18: // '\022'
                    signature = codedinputbytebuffernano.readBytes();
                    hasSignature = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (targetId != null && targetId.length > 0)
            {
                for (int i = 0; i < targetId.length; i++)
                {
                    codedoutputbytebuffernano.writeInt64(1, targetId[i]);
                }

            }
            if (hasSignature || !Arrays.equals(signature, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(2, signature);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Targets()
        {
            targetId = WireFormatNano.EMPTY_LONG_ARRAY;
            signature = WireFormatNano.EMPTY_BYTES;
            hasSignature = false;
            cachedSize = -1;
        }
    }

}
