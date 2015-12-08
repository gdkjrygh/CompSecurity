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
//            AppDocDetails

public static final class cachedSize extends MessageNano
{

    private static volatile  _emptyArray[];
    public String certificateHash[];

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
        int j1 = super.computeSerializedSize();
        int i = j1;
        if (certificateHash != null)
        {
            i = j1;
            if (certificateHash.length > 0)
            {
                int l = 0;
                int j = 0;
                for (i = 0; i < certificateHash.length;)
                {
                    String s = certificateHash[i];
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
                if (certificateHash == null)
                {
                    j = 0;
                } else
                {
                    j = certificateHash.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(certificateHash, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                certificateHash = as;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (certificateHash != null && certificateHash.length > 0)
        {
            for (int i = 0; i < certificateHash.length; i++)
            {
                String s = certificateHash[i];
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
        certificateHash = WireFormatNano.EMPTY_STRING_ARRAY;
        cachedSize = -1;
    }
}
