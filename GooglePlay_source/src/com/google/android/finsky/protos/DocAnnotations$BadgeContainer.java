// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            DocAnnotations

public static final class cachedSize extends MessageNano
{

    private static volatile  _emptyArray[];
    public  badge[];
    public boolean hasTitle;
    public  image[];
    public String title;

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int k;
label0:
        {
            int i = super.computeSerializedSize();
            if (!hasTitle)
            {
                k = i;
                if (title.equals(""))
                {
                    break label0;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(1, title);
        }
        int j = k;
        if (image != null)
        {
            j = k;
            if (image.length > 0)
            {
                int i1 = 0;
                do
                {
                    j = k;
                    if (i1 >= image.length)
                    {
                        break;
                    }
                    _emptyArray _lemptyarray = image[i1];
                    j = k;
                    if (_lemptyarray != null)
                    {
                        j = k + CodedOutputByteBufferNano.computeMessageSize(2, _lemptyarray);
                    }
                    i1++;
                    k = j;
                } while (true);
            }
        }
        int j1 = j;
        if (badge != null)
        {
            j1 = j;
            if (badge.length > 0)
            {
                int l = 0;
                do
                {
                    j1 = j;
                    if (l >= badge.length)
                    {
                        break;
                    }
                    _emptyArray _lemptyarray1 = badge[l];
                    j1 = j;
                    if (_lemptyarray1 != null)
                    {
                        j1 = j + CodedOutputByteBufferNano.computeMessageSize(3, _lemptyarray1);
                    }
                    l++;
                    j = j1;
                } while (true);
            }
        }
        return j1;
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
                title = codedinputbytebuffernano.readString();
                hasTitle = true;
                break;

            case 18: // '\022'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                geSize agesize[];
                int j;
                if (image == null)
                {
                    j = 0;
                } else
                {
                    j = image.length;
                }
                agesize = new image[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(image, 0, agesize, 0, j);
                    l = j;
                }
                for (; l < agesize.length - 1; l++)
                {
                    agesize[l] = new image();
                    codedinputbytebuffernano.readMessage(agesize[l]);
                    codedinputbytebuffernano.readTag();
                }

                agesize[l] = new image();
                codedinputbytebuffernano.readMessage(agesize[l]);
                image = agesize;
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                geSize agesize1[];
                int k;
                if (badge == null)
                {
                    k = 0;
                } else
                {
                    k = badge.length;
                }
                agesize1 = new badge[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(badge, 0, agesize1, 0, k);
                    i1 = k;
                }
                for (; i1 < agesize1.length - 1; i1++)
                {
                    agesize1[i1] = new badge();
                    codedinputbytebuffernano.readMessage(agesize1[i1]);
                    codedinputbytebuffernano.readTag();
                }

                agesize1[i1] = new badge();
                codedinputbytebuffernano.readMessage(agesize1[i1]);
                badge = agesize1;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, title);
        }
        if (image != null && image.length > 0)
        {
            for (int i = 0; i < image.length; i++)
            {
                badge badge1 = image[i];
                if (badge1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, badge1);
                }
            }

        }
        if (badge != null && badge.length > 0)
        {
            for (int j = 0; j < badge.length; j++)
            {
                badge badge2 = badge[j];
                if (badge2 != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, badge2);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        title = "";
        hasTitle = false;
        image = image();
        badge = y();
        cachedSize = -1;
    }
}
