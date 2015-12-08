// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{

    public age child[];
    public age columnWidth[];
    public age widgetAttributes;

    private clear clear()
    {
        widgetAttributes = null;
        columnWidth = columnWidth();
        child = child();
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
                if (widgetAttributes == null)
                {
                    widgetAttributes = new nit>();
                }
                codedinputbytebuffernano.readMessage(widgetAttributes);
                break;

            case 18: // '\022'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                cachedSize acachedsize[];
                int j;
                if (columnWidth == null)
                {
                    j = 0;
                } else
                {
                    j = columnWidth.length;
                }
                acachedsize = new columnWidth[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(columnWidth, 0, acachedsize, 0, j);
                    l = j;
                }
                for (; l < acachedsize.length - 1; l++)
                {
                    acachedsize[l] = new columnWidth();
                    codedinputbytebuffernano.readMessage(acachedsize[l]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[l] = new e();
                codedinputbytebuffernano.readMessage(acachedsize[l]);
                columnWidth = acachedsize;
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                cachedSize acachedsize1[];
                int k;
                if (child == null)
                {
                    k = 0;
                } else
                {
                    k = child.length;
                }
                acachedsize1 = new child[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(child, 0, acachedsize1, 0, k);
                    i1 = k;
                }
                for (; i1 < acachedsize1.length - 1; i1++)
                {
                    acachedsize1[i1] = new child();
                    codedinputbytebuffernano.readMessage(acachedsize1[i1]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize1[i1] = new e();
                codedinputbytebuffernano.readMessage(acachedsize1[i1]);
                child = acachedsize1;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (widgetAttributes != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
        }
        i = j;
        if (columnWidth != null)
        {
            i = j;
            if (columnWidth.length > 0)
            {
                int l = 0;
                do
                {
                    i = j;
                    if (l >= columnWidth.length)
                    {
                        break;
                    }
                    child child1 = columnWidth[l];
                    i = j;
                    if (child1 != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(2, child1);
                    }
                    l++;
                    j = i;
                } while (true);
            }
        }
        int i1 = i;
        if (child != null)
        {
            i1 = i;
            if (child.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= child.length)
                    {
                        break;
                    }
                    child child2 = child[k];
                    i1 = i;
                    if (child2 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(3, child2);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (widgetAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
        }
        if (columnWidth != null && columnWidth.length > 0)
        {
            for (int i = 0; i < columnWidth.length; i++)
            {
                mergeFrom mergefrom = columnWidth[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, mergefrom);
                }
            }

        }
        if (child != null && child.length > 0)
        {
            for (int j = 0; j < child.length; j++)
            {
                mergeFrom mergefrom1 = child[j];
                if (mergefrom1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, mergefrom1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        clear();
    }
}
