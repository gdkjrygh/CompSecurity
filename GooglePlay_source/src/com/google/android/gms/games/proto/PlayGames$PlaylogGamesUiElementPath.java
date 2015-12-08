// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    private static volatile e _emptyArray[];
    public e e[];

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
        int i = super.computeSerializedSize();
        int k = i;
        if (e != null)
        {
            k = i;
            if (e.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= e.length)
                    {
                        break;
                    }
                    _emptyArray _lemptyarray = e[j];
                    k = i;
                    if (_lemptyarray != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, _lemptyarray);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof e))
            {
                return false;
            }
            obj = (e)obj;
            if (!InternalNano.equals(e, ((e) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (getClass().getName().hashCode() + 527) * 31 + InternalNano.hashCode(e);
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
                e ae[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                ae = new e[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, ae, 0, j);
                    k = j;
                }
                for (; k < ae.length - 1; k++)
                {
                    ae[k] = new t>();
                    codedinputbytebuffernano.readMessage(ae[k]);
                    codedinputbytebuffernano.readTag();
                }

                ae[k] = new t>();
                codedinputbytebuffernano.readMessage(ae[k]);
                e = ae;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                e e1 = e[i];
                if (e1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, e1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        e = yArray();
        cachedSize = -1;
    }
}
