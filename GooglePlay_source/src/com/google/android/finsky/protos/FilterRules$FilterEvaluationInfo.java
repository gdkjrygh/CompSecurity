// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            FilterRules

public static final class cachedSize extends MessageNano
{

    public ruleEvaluation ruleEvaluation[];

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (ruleEvaluation != null)
        {
            k = i;
            if (ruleEvaluation.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= ruleEvaluation.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = ruleEvaluation[j];
                    k = i;
                    if (cachedsize != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, cachedsize);
                    }
                    j++;
                    i = k;
                } while (true);
            }
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

            case 10: // '\n'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                ize aize[];
                int j;
                if (ruleEvaluation == null)
                {
                    j = 0;
                } else
                {
                    j = ruleEvaluation.length;
                }
                aize = new ruleEvaluation[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(ruleEvaluation, 0, aize, 0, j);
                    k = j;
                }
                for (; k < aize.length - 1; k++)
                {
                    aize[k] = new ();
                    codedinputbytebuffernano.readMessage(aize[k]);
                    codedinputbytebuffernano.readTag();
                }

                aize[k] = new ();
                codedinputbytebuffernano.readMessage(aize[k]);
                ruleEvaluation = aize;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (ruleEvaluation != null && ruleEvaluation.length > 0)
        {
            for (int i = 0; i < ruleEvaluation.length; i++)
            {
                ruleEvaluation ruleevaluation = ruleEvaluation[i];
                if (ruleevaluation != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, ruleevaluation);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        ruleEvaluation = rray();
        cachedSize = -1;
    }
}
