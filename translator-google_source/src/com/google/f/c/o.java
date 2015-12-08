// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.f.c:
//            s, p, u, q, 
//            t

public final class o extends b
{

    private static volatile o f[];
    public s a;
    public p b;
    public q c;
    public t d;
    public u e;
    private int g;
    private String h;
    private String i;
    private String j;

    public o()
    {
        g = 0;
        h = "";
        i = "";
        j = "";
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static o[] a()
    {
        if (f == null)
        {
            synchronized (f.a)
            {
                if (f == null)
                {
                    f = new o[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if ((g & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(1, h);
        }
        l = k;
        if ((g & 2) != 0)
        {
            l = k + CodedOutputByteBufferNano.b(2, i);
        }
        k = l;
        if ((g & 4) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(3, j);
        }
        l = k;
        if (a != null)
        {
            l = k + CodedOutputByteBufferNano.c(4, a);
        }
        k = l;
        if (b != null)
        {
            k = l + CodedOutputByteBufferNano.c(5, b);
        }
        l = k;
        if (e != null)
        {
            l = k + CodedOutputByteBufferNano.c(6, e);
        }
        k = l;
        if (c != null)
        {
            k = l + CodedOutputByteBufferNano.c(7, c);
        }
        l = k;
        if (d != null)
        {
            l = k + CodedOutputByteBufferNano.c(8, d);
        }
        return l;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int k = a1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(a1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                h = a1.c();
                g = g | 1;
                break;

            case 18: // '\022'
                i = a1.c();
                g = g | 2;
                break;

            case 26: // '\032'
                j = a1.c();
                g = g | 4;
                break;

            case 34: // '"'
                if (a == null)
                {
                    a = new s();
                }
                a1.a(a);
                break;

            case 42: // '*'
                if (b == null)
                {
                    b = new p();
                }
                a1.a(b);
                break;

            case 50: // '2'
                if (e == null)
                {
                    e = new u();
                }
                a1.a(e);
                break;

            case 58: // ':'
                if (c == null)
                {
                    c = new q();
                }
                a1.a(c);
                break;

            case 66: // 'B'
                if (d == null)
                {
                    d = new t();
                }
                a1.a(d);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((g & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, h);
        }
        if ((g & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, i);
        }
        if ((g & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, j);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(4, a);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(5, b);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(6, e);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(7, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(8, d);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
