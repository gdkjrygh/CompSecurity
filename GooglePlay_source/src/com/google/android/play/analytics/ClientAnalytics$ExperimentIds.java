// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.play.analytics:
//            ClientAnalytics

public static final class cachedSize extends MessageNano
{

    public byte clearBlob[];
    public byte encryptedBlob[][];
    public boolean usersMatch;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!Arrays.equals(clearBlob, WireFormatNano.EMPTY_BYTES))
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(1, clearBlob);
        }
        j = i;
        if (encryptedBlob != null)
        {
            j = i;
            if (encryptedBlob.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < encryptedBlob.length;)
                {
                    byte abyte0[] = encryptedBlob[j];
                    int j1 = i1;
                    int l = k;
                    if (abyte0 != null)
                    {
                        j1 = i1 + 1;
                        l = k + CodedOutputByteBufferNano.computeBytesSizeNoTag(abyte0);
                    }
                    j++;
                    i1 = j1;
                    k = l;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (usersMatch)
        {
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
                clearBlob = codedinputbytebuffernano.readBytes();
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                byte abyte0[][];
                int j;
                if (encryptedBlob == null)
                {
                    j = 0;
                } else
                {
                    j = encryptedBlob.length;
                }
                abyte0 = new byte[k + j][];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(encryptedBlob, 0, abyte0, 0, j);
                    k = j;
                }
                for (; k < abyte0.length - 1; k++)
                {
                    abyte0[k] = codedinputbytebuffernano.readBytes();
                    codedinputbytebuffernano.readTag();
                }

                abyte0[k] = codedinputbytebuffernano.readBytes();
                encryptedBlob = abyte0;
                break;

            case 24: // '\030'
                usersMatch = codedinputbytebuffernano.readBool();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!Arrays.equals(clearBlob, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(1, clearBlob);
        }
        if (encryptedBlob != null && encryptedBlob.length > 0)
        {
            for (int i = 0; i < encryptedBlob.length; i++)
            {
                byte abyte0[] = encryptedBlob[i];
                if (abyte0 != null)
                {
                    codedoutputbytebuffernano.writeBytes(2, abyte0);
                }
            }

        }
        if (usersMatch)
        {
            codedoutputbytebuffernano.writeBool(3, usersMatch);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clearBlob = WireFormatNano.EMPTY_BYTES;
        encryptedBlob = WireFormatNano.EMPTY_BYTES_ARRAY;
        usersMatch = false;
        cachedSize = -1;
    }
}
