// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.e;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class l extends b
{

    public int a;
    public boolean b;
    private String c;
    private boolean d;
    private boolean e;

    public l()
    {
        a = 0;
        c = "";
        d = true;
        e = false;
        b = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public final l a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            c = s;
            a = a | 1;
            return this;
        }
    }

    public final l a(boolean flag)
    {
        d = flag;
        a = a | 2;
        return this;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((a & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(1, c);
        }
        j = i;
        if ((a & 2) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(2) + 1);
        }
        i = j;
        if ((a & 8) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(3) + 1);
        }
        j = i;
        if ((a & 4) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(4) + 1);
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

            case 10: // '\n'
                c = a1.c();
                a = a | 1;
                break;

            case 16: // '\020'
                d = a1.b();
                a = a | 2;
                break;

            case 24: // '\030'
                b = a1.b();
                a = a | 8;
                break;

            case 32: // ' '
                e = a1.b();
                a = a | 4;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((a & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, c);
        }
        if ((a & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, d);
        }
        if ((a & 8) != 0)
        {
            codedoutputbytebuffernano.a(3, b);
        }
        if ((a & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
