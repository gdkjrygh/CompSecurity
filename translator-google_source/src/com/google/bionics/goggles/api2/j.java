// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.bionics.goggles.api2:
//            q, l, n

public final class j extends b
{

    public int a;
    public int b;
    public q c;
    public l d;
    public n e;
    public boolean f;
    private String g;

    public j()
    {
        a = 0;
        b = 0;
        c = null;
        d = null;
        e = null;
        g = "";
        f = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if ((a & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(1, b);
        }
        k = i;
        if (c != null)
        {
            k = i + CodedOutputByteBufferNano.c(2, c);
        }
        i = k;
        if (d != null)
        {
            i = k + CodedOutputByteBufferNano.c(3, d);
        }
        k = i;
        if (e != null)
        {
            k = i + CodedOutputByteBufferNano.c(4, e);
        }
        i = k;
        if ((a & 2) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(16, g);
        }
        k = i;
        if ((a & 4) != 0)
        {
            k = i + (CodedOutputByteBufferNano.b(17) + 1);
        }
        return k;
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

            case 8: // '\b'
                b = a1.e();
                a = a | 1;
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new q();
                }
                a1.a(c);
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new l();
                }
                a1.a(d);
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new n();
                }
                a1.a(e);
                break;

            case 130: 
                g = a1.c();
                a = a | 2;
                break;

            case 136: 
                f = a1.b();
                a = a | 4;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((a & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if ((a & 2) != 0)
        {
            codedoutputbytebuffernano.a(16, g);
        }
        if ((a & 4) != 0)
        {
            codedoutputbytebuffernano.a(17, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
