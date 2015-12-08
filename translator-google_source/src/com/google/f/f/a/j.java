// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.f.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.f.f.a:
//            i

public final class j extends b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/f/f/a/j, 0xda33022L);
    private static final j f[] = new j[0];
    public int b;
    public byte c[];
    public boolean d;
    public i e;

    public j()
    {
        b = 0;
        c = com.google.protobuf.nano.j.h;
        d = false;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if ((b & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(1, c);
        }
        l = k;
        if ((b & 2) != 0)
        {
            l = k + (CodedOutputByteBufferNano.b(2) + 1);
        }
        k = l;
        if (e != null)
        {
            k = l + CodedOutputByteBufferNano.c(3, e);
        }
        return k;
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
                c = a1.d();
                b = b | 1;
                break;

            case 16: // '\020'
                d = a1.b();
                b = b | 2;
                break;

            case 26: // '\032'
                if (e == null)
                {
                    e = new i();
                }
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, c);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(3, e);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

}
