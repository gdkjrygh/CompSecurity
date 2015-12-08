// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;

// Referenced classes of package com.google.bionics.goggles.api2:
//            r, e, m

public final class g extends b
{

    private static volatile g d[];
    public r a;
    public e b;
    public m c;
    private int e;
    private long f;

    public g()
    {
        e = 0;
        f = 0L;
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static g[] a()
    {
        if (d == null)
        {
            synchronized (f.a)
            {
                if (d == null)
                {
                    d = new g[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((e & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(1, f);
        }
        j = i;
        if (a != null)
        {
            j = i + CodedOutputByteBufferNano.c(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + CodedOutputByteBufferNano.c(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + CodedOutputByteBufferNano.c(4, c);
        }
        return j;
    }

    public final com.google.protobuf.nano.g mergeFrom(a a1)
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

            case 8: // '\b'
                f = a1.f();
                e = e | 1;
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new r();
                }
                a1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new e();
                }
                a1.a(b);
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new m();
                }
                a1.a(c);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((e & 1) != 0)
        {
            codedoutputbytebuffernano.b(1, f);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(2, a);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(3, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(4, c);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
