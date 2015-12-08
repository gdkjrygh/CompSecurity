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
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    public essage action[];
    public essage primaryFace;
    public essage secondaryFace[];

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (action != null)
        {
            j = i;
            if (action.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= action.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = action[l];
                    j = i;
                    if (cachedsize != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, cachedsize);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (primaryFace != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, primaryFace);
        }
        int i1 = i;
        if (secondaryFace != null)
        {
            i1 = i;
            if (secondaryFace.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= secondaryFace.length)
                    {
                        break;
                    }
                    cachedSize cachedsize1 = secondaryFace[k];
                    i1 = i;
                    if (cachedsize1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(4, cachedsize1);
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
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                eMessageSize aemessagesize[];
                int j;
                if (action == null)
                {
                    j = 0;
                } else
                {
                    j = action.length;
                }
                aemessagesize = new action[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(action, 0, aemessagesize, 0, j);
                    l = j;
                }
                for (; l < aemessagesize.length - 1; l++)
                {
                    aemessagesize[l] = new <init>();
                    codedinputbytebuffernano.readMessage(aemessagesize[l]);
                    codedinputbytebuffernano.readTag();
                }

                aemessagesize[l] = new <init>();
                codedinputbytebuffernano.readMessage(aemessagesize[l]);
                action = aemessagesize;
                break;

            case 18: // '\022'
                if (primaryFace == null)
                {
                    primaryFace = new primaryFace();
                }
                codedinputbytebuffernano.readMessage(primaryFace);
                break;

            case 34: // '"'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                eMessageSize aemessagesize1[];
                int k;
                if (secondaryFace == null)
                {
                    k = 0;
                } else
                {
                    k = secondaryFace.length;
                }
                aemessagesize1 = new secondaryFace[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(secondaryFace, 0, aemessagesize1, 0, k);
                    i1 = k;
                }
                for (; i1 < aemessagesize1.length - 1; i1++)
                {
                    aemessagesize1[i1] = new secondaryFace();
                    codedinputbytebuffernano.readMessage(aemessagesize1[i1]);
                    codedinputbytebuffernano.readTag();
                }

                aemessagesize1[i1] = new ();
                codedinputbytebuffernano.readMessage(aemessagesize1[i1]);
                secondaryFace = aemessagesize1;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (action != null && action.length > 0)
        {
            for (int i = 0; i < action.length; i++)
            {
                secondaryFace secondaryface = action[i];
                if (secondaryface != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, secondaryface);
                }
            }

        }
        if (primaryFace != null)
        {
            codedoutputbytebuffernano.writeMessage(2, primaryFace);
        }
        if (secondaryFace != null && secondaryFace.length > 0)
        {
            for (int j = 0; j < secondaryFace.length; j++)
            {
                secondaryFace secondaryface1 = secondaryFace[j];
                if (secondaryface1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, secondaryface1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        action = emptyArray();
        primaryFace = null;
        secondaryFace = ray();
        cachedSize = -1;
    }
}
