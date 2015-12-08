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

    public content content[];
    public long id;
    public content tree;

    public final clear clear()
    {
        tree = null;
        id = 0L;
        content = ptyArray();
        cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (tree != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, tree);
        }
        i = j;
        if (id != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(2, id);
        }
        int l = i;
        if (content != null)
        {
            l = i;
            if (content.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= content.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = content[k];
                    l = i;
                    if (cachedsize != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, cachedsize);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof content))
            {
                return false;
            }
            obj = (content)obj;
            if (tree == null)
            {
                if (((tree) (obj)).tree != null)
                {
                    return false;
                }
            } else
            if (!tree.((() (obj)).tree))
            {
                return false;
            }
            if (id != ((id) (obj)).id)
            {
                return false;
            }
            if (!InternalNano.equals(content, ((content) (obj)).content))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int i;
        if (tree == null)
        {
            i = 0;
        } else
        {
            i = tree.de();
        }
        return (((j + 527) * 31 + i) * 31 + (int)(id ^ id >>> 32)) * 31 + InternalNano.hashCode(content);
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
                if (tree == null)
                {
                    tree = new ();
                }
                codedinputbytebuffernano.readMessage(tree);
                break;

            case 16: // '\020'
                id = codedinputbytebuffernano.readRawVarint64();
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                content acontent[];
                int j;
                if (content == null)
                {
                    j = 0;
                } else
                {
                    j = content.length;
                }
                acontent = new content[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(content, 0, acontent, 0, j);
                    k = j;
                }
                for (; k < acontent.length - 1; k++)
                {
                    acontent[k] = new nit>();
                    codedinputbytebuffernano.readMessage(acontent[k]);
                    codedinputbytebuffernano.readTag();
                }

                acontent[k] = new nit>();
                codedinputbytebuffernano.readMessage(acontent[k]);
                content = acontent;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (tree != null)
        {
            codedoutputbytebuffernano.writeMessage(1, tree);
        }
        if (id != 0L)
        {
            codedoutputbytebuffernano.writeInt64(2, id);
        }
        if (content != null && content.length > 0)
        {
            for (int i = 0; i < content.length; i++)
            {
                content content1 = content[i];
                if (content1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, content1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
