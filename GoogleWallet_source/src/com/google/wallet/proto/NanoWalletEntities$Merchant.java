// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    private static volatile To _emptyArray[];
    public String displayName;
    public ntifier id;
    public String logoUrl;
    public String matchingPatterns[];
    public String website;

    private clear clear()
    {
        id = null;
        displayName = null;
        matchingPatterns = WireFormatNano.EMPTY_STRING_ARRAY;
        website = null;
        logoUrl = null;
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
                if (id == null)
                {
                    id = new ntifier();
                }
                codedinputbytebuffernano.readMessage(id);
                break;

            case 18: // '\022'
                displayName = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                String as[];
                int j;
                if (matchingPatterns == null)
                {
                    j = 0;
                } else
                {
                    j = matchingPatterns.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(matchingPatterns, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                matchingPatterns = as;
                break;

            case 34: // '"'
                website = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                logoUrl = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (id != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, id);
        }
        i = j;
        if (displayName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, displayName);
        }
        j = i;
        if (matchingPatterns != null)
        {
            j = i;
            if (matchingPatterns.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < matchingPatterns.length;)
                {
                    String s = matchingPatterns[j];
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
        if (website != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(4, website);
        }
        j = i;
        if (logoUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(5, logoUrl);
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (id != null)
        {
            codedoutputbytebuffernano.writeMessage(1, id);
        }
        if (displayName != null)
        {
            codedoutputbytebuffernano.writeString(2, displayName);
        }
        if (matchingPatterns != null && matchingPatterns.length > 0)
        {
            for (int i = 0; i < matchingPatterns.length; i++)
            {
                String s = matchingPatterns[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(3, s);
                }
            }

        }
        if (website != null)
        {
            codedoutputbytebuffernano.writeString(4, website);
        }
        if (logoUrl != null)
        {
            codedoutputbytebuffernano.writeString(5, logoUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ntifier()
    {
        clear();
    }
}
