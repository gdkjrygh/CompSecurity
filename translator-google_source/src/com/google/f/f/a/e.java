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
//            f, g, b, c

public final class e extends b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/f/f/a/e, 0x23f322L);
    private static final e o[] = new e[0];
    private boolean A;
    private boolean B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    public int b;
    public com.google.f.a.a.b c;
    public int d;
    public com.google.f.a.c e;
    public boolean f;
    public boolean g;
    public int h;
    public f i;
    public boolean j;
    public boolean k;
    public com.google.f.f.a.g l;
    public com.google.f.f.a.b m;
    public com.google.f.f.a.c n;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private float t;
    private String u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public e()
    {
        b = 0;
        c = null;
        d = 1;
        e = null;
        f = false;
        g = false;
        p = false;
        q = false;
        r = false;
        s = false;
        h = 2;
        t = 0.0F;
        i = null;
        u = "";
        v = false;
        w = false;
        j = false;
        x = false;
        y = false;
        z = false;
        A = false;
        B = false;
        C = 0;
        k = false;
        D = false;
        E = false;
        l = null;
        m = null;
        n = null;
        F = true;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(1, c);
        }
        j1 = i1;
        if ((b & 1) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(3, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(4, e);
        }
        j1 = i1;
        if ((b & 2) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(5) + 1);
        }
        i1 = j1;
        if ((b & 0x40) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(6) + 1);
        }
        j1 = i1;
        if ((b & 0x80) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(7, h);
        }
        i1 = j1;
        if ((b & 0x100) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(8) + 4);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(9, i);
        }
        i1 = j1;
        if ((b & 0x200) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, u);
        }
        j1 = i1;
        if ((b & 0x400) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(11) + 1);
        }
        i1 = j1;
        if ((b & 0x800) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(12) + 1);
        }
        j1 = i1;
        if ((b & 0x1000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(13) + 1);
        }
        i1 = j1;
        if ((b & 0x2000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(14) + 1);
        }
        j1 = i1;
        if ((b & 0x4000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(15) + 1);
        }
        i1 = j1;
        if ((b & 0x8000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(16) + 1);
        }
        j1 = i1;
        if ((b & 0x10000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(17) + 1);
        }
        i1 = j1;
        if ((b & 0x20000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(18) + 1);
        }
        j1 = i1;
        if ((b & 0x40000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(19, C);
        }
        i1 = j1;
        if ((b & 0x80000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(20) + 1);
        }
        j1 = i1;
        if ((b & 4) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(21) + 1);
        }
        i1 = j1;
        if ((b & 0x10) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(22) + 1);
        }
        j1 = i1;
        if ((b & 8) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(23) + 1);
        }
        i1 = j1;
        if ((b & 0x200000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(24) + 1);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(25, l);
        }
        i1 = j1;
        if ((b & 0x400000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(26) + 1);
        }
        j1 = i1;
        if ((b & 0x100000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(27) + 1);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(28, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(29, n);
        }
        i1 = j1;
        if ((b & 0x20) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(30) + 1);
        }
        return i1;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int i1 = a1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(a1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (c == null)
                {
                    c = new com.google.f.a.a.b();
                }
                a1.a(c);
                break;

            case 24: // '\030'
                d = a1.e();
                b = b | 1;
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new com.google.f.a.c();
                }
                a1.a(e);
                break;

            case 40: // '('
                f = a1.b();
                b = b | 2;
                break;

            case 48: // '0'
                s = a1.b();
                b = b | 0x40;
                break;

            case 56: // '8'
                h = a1.e();
                b = b | 0x80;
                break;

            case 69: // 'E'
                t = Float.intBitsToFloat(a1.g());
                b = b | 0x100;
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new f();
                }
                a1.a(i);
                break;

            case 82: // 'R'
                u = a1.c();
                b = b | 0x200;
                break;

            case 88: // 'X'
                v = a1.b();
                b = b | 0x400;
                break;

            case 96: // '`'
                w = a1.b();
                b = b | 0x800;
                break;

            case 104: // 'h'
                j = a1.b();
                b = b | 0x1000;
                break;

            case 112: // 'p'
                x = a1.b();
                b = b | 0x2000;
                break;

            case 120: // 'x'
                y = a1.b();
                b = b | 0x4000;
                break;

            case 128: 
                z = a1.b();
                b = b | 0x8000;
                break;

            case 136: 
                A = a1.b();
                b = b | 0x10000;
                break;

            case 144: 
                B = a1.b();
                b = b | 0x20000;
                break;

            case 152: 
                C = a1.e();
                b = b | 0x40000;
                break;

            case 160: 
                k = a1.b();
                b = b | 0x80000;
                break;

            case 168: 
                g = a1.b();
                b = b | 4;
                break;

            case 176: 
                q = a1.b();
                b = b | 0x10;
                break;

            case 184: 
                p = a1.b();
                b = b | 8;
                break;

            case 192: 
                E = a1.b();
                b = b | 0x200000;
                break;

            case 202: 
                if (l == null)
                {
                    l = new com.google.f.f.a.g();
                }
                a1.a(l);
                break;

            case 208: 
                F = a1.b();
                b = b | 0x400000;
                break;

            case 216: 
                D = a1.b();
                b = b | 0x100000;
                break;

            case 226: 
                if (m == null)
                {
                    m = new com.google.f.f.a.b();
                }
                a1.a(m);
                break;

            case 234: 
                if (n == null)
                {
                    n = new com.google.f.f.a.c();
                }
                a1.a(n);
                break;

            case 240: 
                r = a1.b();
                b = b | 0x20;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (c != null)
        {
            codedoutputbytebuffernano.a(1, c);
        }
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(6, s);
        }
        if ((b & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if ((b & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(8, t);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(9, i);
        }
        if ((b & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(10, u);
        }
        if ((b & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(11, v);
        }
        if ((b & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(12, w);
        }
        if ((b & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(13, j);
        }
        if ((b & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(14, x);
        }
        if ((b & 0x4000) != 0)
        {
            codedoutputbytebuffernano.a(15, y);
        }
        if ((b & 0x8000) != 0)
        {
            codedoutputbytebuffernano.a(16, z);
        }
        if ((b & 0x10000) != 0)
        {
            codedoutputbytebuffernano.a(17, A);
        }
        if ((b & 0x20000) != 0)
        {
            codedoutputbytebuffernano.a(18, B);
        }
        if ((b & 0x40000) != 0)
        {
            codedoutputbytebuffernano.a(19, C);
        }
        if ((b & 0x80000) != 0)
        {
            codedoutputbytebuffernano.a(20, k);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(21, g);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(22, q);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(23, p);
        }
        if ((b & 0x200000) != 0)
        {
            codedoutputbytebuffernano.a(24, E);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(25, l);
        }
        if ((b & 0x400000) != 0)
        {
            codedoutputbytebuffernano.a(26, F);
        }
        if ((b & 0x100000) != 0)
        {
            codedoutputbytebuffernano.a(27, D);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(28, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(29, n);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(30, r);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

}
