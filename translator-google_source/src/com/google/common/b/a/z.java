// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.common.b.a:
//            s, d, ae, h

public final class z extends b
{

    public s a;
    public s b;
    public d c;
    public ae d;
    public h e;

    public z()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + CodedOutputByteBufferNano.c(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + CodedOutputByteBufferNano.c(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.c(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.c(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.c(5, e);
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int i = a1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new s();
                }
                a1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new s();
                }
                a1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new d();
                }
                a1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new ae();
                }
                a1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new h();
                }
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (a != null)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(3, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(4, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(5, e);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
