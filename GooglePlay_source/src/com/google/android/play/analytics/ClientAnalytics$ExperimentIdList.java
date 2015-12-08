// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.play.analytics:
//            ClientAnalytics

public static final class cachedSize extends MessageNano
{

    public String id[];

    protected final int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i = j1;
        if (id != null)
        {
            i = j1;
            if (id.length > 0)
            {
                int l = 0;
                int j = 0;
                for (i = 0; i < id.length;)
                {
                    String s = id[i];
                    int i1 = l;
                    int k = j;
                    if (s != null)
                    {
                        i1 = l + 1;
                        k = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    i++;
                    l = i1;
                    j = k;
                }

                i = j1 + j + l * 1;
            }
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
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                String as[];
                int j;
                if (id == null)
                {
                    j = 0;
                } else
                {
                    j = id.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(id, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                id = as;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (id != null && id.length > 0)
        {
            for (int i = 0; i < id.length; i++)
            {
                String s = id[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(1, s);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        id = WireFormatNano.EMPTY_STRING_ARRAY;
        cachedSize = -1;
    }
}
