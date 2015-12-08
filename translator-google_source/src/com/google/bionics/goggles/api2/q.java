// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.bionics.goggles.api2:
//            f

public final class q extends b
{

    public f a;
    private int b;
    private String c;
    private String d;
    private String e;

    public q()
    {
        b = 0;
        c = "";
        a = null;
        d = "en-US";
        e = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((b & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (a != null)
        {
            j = i + CodedOutputByteBufferNano.c(3, a);
        }
        i = j;
        if ((b & 2) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(5, d);
        }
        j = i;
        if ((b & 4) != 0)
        {
            j = i + CodedOutputByteBufferNano.b(6, e);
        }
        return j;
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

            case 18: // '\022'
                c = a1.c();
                b = b | 1;
                break;

            case 26: // '\032'
                if (a == null)
                {
                    a = new f();
                }
                a1.a(a);
                break;

            case 42: // '*'
                d = a1.c();
                b = b | 2;
                break;

            case 50: // '2'
                e = a1.c();
                b = b | 4;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(3, a);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(5, d);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(6, e);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
