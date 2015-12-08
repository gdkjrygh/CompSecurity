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
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    private static volatile description _emptyArray[];
    public String description;
    public boolean hasDescription;
    public boolean hasTitle;
    public description image[];
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
        int i;
label0:
        {
            i = super.computeSerializedSize();
            int j = i;
            if (image != null)
            {
                j = i;
                if (image.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= image.length)
                        {
                            break;
                        }
                        _emptyArray _lemptyarray = image[l];
                        j = i;
                        if (_lemptyarray != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, _lemptyarray);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            if (!hasTitle)
            {
                i = j;
                if (title.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(2, title);
        }
        int k;
label1:
        {
            if (!hasDescription)
            {
                k = i;
                if (description.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(3, description);
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
                description adescription[];
                int j;
                if (image == null)
                {
                    j = 0;
                } else
                {
                    j = image.length;
                }
                adescription = new image[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(image, 0, adescription, 0, j);
                    k = j;
                }
                for (; k < adescription.length - 1; k++)
                {
                    adescription[k] = new image();
                    codedinputbytebuffernano.readMessage(adescription[k]);
                    codedinputbytebuffernano.readTag();
                }

                adescription[k] = new ();
                codedinputbytebuffernano.readMessage(adescription[k]);
                image = adescription;
                break;

            case 18: // '\022'
                title = codedinputbytebuffernano.readString();
                hasTitle = true;
                break;

            case 26: // '\032'
                description = codedinputbytebuffernano.readString();
                hasDescription = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (image != null && image.length > 0)
        {
            for (int i = 0; i < image.length; i++)
            {
                hasDescription hasdescription = image[i];
                if (hasdescription != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, hasdescription);
                }
            }

        }
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, title);
        }
        if (hasDescription || !description.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, description);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        image = image();
        title = "";
        hasTitle = false;
        description = "";
        hasDescription = false;
        cachedSize = -1;
    }
}
