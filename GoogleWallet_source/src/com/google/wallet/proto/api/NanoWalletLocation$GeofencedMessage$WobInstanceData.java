// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletLocation

public static final class clear extends ExtendableMessageNano
{

    private static volatile merchant _emptyArray[];
    public com.google.wallet.proto.ata barcode;
    public String description[];
    public String logoUrl;
    public String merchant;
    public String targetUri;
    public String title;

    private clear clear()
    {
        barcode = null;
        title = null;
        description = WireFormatNano.EMPTY_STRING_ARRAY;
        logoUrl = null;
        targetUri = null;
        merchant = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

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

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                if (barcode == null)
                {
                    barcode = new com.google.wallet.proto.ata.barcode();
                }
                codedinputbytebuffernano.readMessage(barcode);
                break;

            case 18: // '\022'
                title = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                String as[];
                int j;
                if (description == null)
                {
                    j = 0;
                } else
                {
                    j = description.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(description, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                description = as;
                break;

            case 34: // '"'
                logoUrl = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                targetUri = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                merchant = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (barcode != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, barcode);
        }
        i = j;
        if (title != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, title);
        }
        j = i;
        if (description != null)
        {
            j = i;
            if (description.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < description.length;)
                {
                    String s = description[j];
                    int j1 = i1;
                    int l = k;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    i1 = j1;
                    k = l;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (logoUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(4, logoUrl);
        }
        j = i;
        if (targetUri != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(5, targetUri);
        }
        i = j;
        if (merchant != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(6, merchant);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (barcode != null)
        {
            codedoutputbytebuffernano.writeMessage(1, barcode);
        }
        if (title != null)
        {
            codedoutputbytebuffernano.writeString(2, title);
        }
        if (description != null && description.length > 0)
        {
            for (int i = 0; i < description.length; i++)
            {
                String s = description[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(3, s);
                }
            }

        }
        if (logoUrl != null)
        {
            codedoutputbytebuffernano.writeString(4, logoUrl);
        }
        if (targetUri != null)
        {
            codedoutputbytebuffernano.writeString(5, targetUri);
        }
        if (merchant != null)
        {
            codedoutputbytebuffernano.writeString(6, merchant);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
