// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.bionics.goggles.api2:
//            b

public final class o extends b
{

    private static volatile o c[];
    public GogglesCommonProtos.BoundingBox a;
    public com.google.bionics.goggles.api2.b b;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private int k;

    public o()
    {
        d = 0;
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = "";
        a = null;
        k = 0;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static o[] a()
    {
        if (c == null)
        {
            synchronized (f.a)
            {
                if (c == null)
                {
                    c = new o[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int l = i1;
        if ((d & 1) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.b(1, e);
        }
        i1 = l;
        if ((d & 2) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.b(2, f);
        }
        l = i1;
        if ((d & 4) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.b(3, g);
        }
        i1 = l;
        if ((d & 8) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.b(4, h);
        }
        l = i1;
        if ((d & 0x10) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.b(5, i);
        }
        i1 = l;
        if (a != null)
        {
            i1 = l + CodedOutputByteBufferNano.c(6, a);
        }
        l = i1;
        if ((d & 0x40) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.d(7, k);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + CodedOutputByteBufferNano.c(10, b);
        }
        l = i1;
        if ((d & 0x20) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.b(11, j);
        }
        return l;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int l = a1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(a1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                e = a1.c();
                d = d | 1;
                break;

            case 18: // '\022'
                f = a1.c();
                d = d | 2;
                break;

            case 26: // '\032'
                g = a1.c();
                d = d | 4;
                break;

            case 34: // '"'
                h = a1.c();
                d = d | 8;
                break;

            case 42: // '*'
                i = a1.c();
                d = d | 0x10;
                break;

            case 50: // '2'
                if (a == null)
                {
                    a = new GogglesCommonProtos.BoundingBox();
                }
                a1.a(a);
                break;

            case 56: // '8'
                k = a1.e();
                d = d | 0x40;
                break;

            case 82: // 'R'
                if (b == null)
                {
                    b = new com.google.bionics.goggles.api2.b();
                }
                a1.a(b);
                break;

            case 90: // 'Z'
                j = a1.c();
                d = d | 0x20;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((d & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, e);
        }
        if ((d & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, f);
        }
        if ((d & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, g);
        }
        if ((d & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, h);
        }
        if ((d & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, i);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(6, a);
        }
        if ((d & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, k);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(10, b);
        }
        if ((d & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(11, j);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
