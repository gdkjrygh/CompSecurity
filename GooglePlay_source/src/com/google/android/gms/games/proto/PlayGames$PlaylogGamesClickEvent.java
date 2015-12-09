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

public static final class clear extends MessageNano
{

    public path elementPath[];
    public th path;

    public final clear clear()
    {
        elementPath = mptyArray();
        path = null;
        cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (elementPath != null)
        {
            j = i;
            if (elementPath.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= elementPath.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = elementPath[k];
                    j = i;
                    if (cachedsize != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, cachedsize);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (path != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, path);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof path))
        {
            return false;
        }
        obj = (path)obj;
        if (!InternalNano.equals(elementPath, ((elementPath) (obj)).elementPath))
        {
            return false;
        }
        if (path != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((path) (obj)).path == null) goto _L1; else goto _L3
_L3:
        return false;
        if (path.equals(((th.equals) (obj)).path)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int k = InternalNano.hashCode(elementPath);
        int i;
        if (path == null)
        {
            i = 0;
        } else
        {
            i = path.hashCode();
        }
        return i + ((j + 527) * 31 + k) * 31;
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
                th.hashCode ahashcode[];
                int j;
                if (elementPath == null)
                {
                    j = 0;
                } else
                {
                    j = elementPath.length;
                }
                ahashcode = new elementPath[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(elementPath, 0, ahashcode, 0, j);
                    k = j;
                }
                for (; k < ahashcode.length - 1; k++)
                {
                    ahashcode[k] = new init>();
                    codedinputbytebuffernano.readMessage(ahashcode[k]);
                    codedinputbytebuffernano.readTag();
                }

                ahashcode[k] = new init>();
                codedinputbytebuffernano.readMessage(ahashcode[k]);
                elementPath = ahashcode;
                break;

            case 18: // '\022'
                if (path == null)
                {
                    path = new th();
                }
                codedinputbytebuffernano.readMessage(path);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (elementPath != null && elementPath.length > 0)
        {
            for (int i = 0; i < elementPath.length; i++)
            {
                path path1 = elementPath[i];
                if (path1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, path1);
                }
            }

        }
        if (path != null)
        {
            codedoutputbytebuffernano.writeMessage(2, path);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public th()
    {
        clear();
    }
}
