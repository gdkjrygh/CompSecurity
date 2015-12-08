// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.f.a.a:
//            l, j, o, i, 
//            f, m, d

public final class c extends b
{

    private static volatile c h[];
    public l a;
    public j b;
    public o c;
    public i d;
    public com.google.f.a.a.f e;
    public m f;
    public d g;
    private int i;
    private int j;
    private String k;
    private float l;
    private String m;
    private boolean n;

    public c()
    {
        i = 0;
        j = 0;
        k = "";
        l = 0.0F;
        m = "";
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        n = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static c[] a()
    {
        if (h == null)
        {
            synchronized (f.a)
            {
                if (h == null)
                {
                    h = new c[0];
                }
            }
        }
        return h;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((i & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(1, j);
        }
        j1 = i1;
        if ((i & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, k);
        }
        i1 = j1;
        if ((i & 4) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(3) + 4);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(4, a);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(5, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(6, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(7, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(8, e);
        }
        i1 = j1;
        if ((i & 8) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, m);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(10, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(11, g);
        }
        j1 = i1;
        if ((i & 0x10) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(12) + 1);
        }
        return j1;
    }

    public final g mergeFrom(a a1)
    {
_L15:
        int i1 = a1.a();
        i1;
        JVM INSTR lookupswitch 13: default 120
    //                   0: 129
    //                   8: 131
    //                   18: 205
    //                   29: 226
    //                   34: 250
    //                   42: 279
    //                   50: 308
    //                   58: 337
    //                   66: 366
    //                   74: 395
    //                   82: 417
    //                   90: 446
    //                   96: 475;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        int j1 = a1.e();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            j = j1;
            i = i | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        k = a1.c();
        i = i | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        l = Float.intBitsToFloat(a1.g());
        i = i | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        if (a == null)
        {
            a = new l();
        }
        a1.a(a);
        continue; /* Loop/switch isn't completed */
_L7:
        if (b == null)
        {
            b = new j();
        }
        a1.a(b);
        continue; /* Loop/switch isn't completed */
_L8:
        if (c == null)
        {
            c = new o();
        }
        a1.a(c);
        continue; /* Loop/switch isn't completed */
_L9:
        if (d == null)
        {
            d = new i();
        }
        a1.a(d);
        continue; /* Loop/switch isn't completed */
_L10:
        if (e == null)
        {
            e = new com.google.f.a.a.f();
        }
        a1.a(e);
        continue; /* Loop/switch isn't completed */
_L11:
        m = a1.c();
        i = i | 8;
        continue; /* Loop/switch isn't completed */
_L12:
        if (f == null)
        {
            f = new m();
        }
        a1.a(f);
        continue; /* Loop/switch isn't completed */
_L13:
        if (g == null)
        {
            g = new d();
        }
        a1.a(g);
        continue; /* Loop/switch isn't completed */
_L14:
        n = a1.b();
        i = i | 0x10;
        if (true) goto _L15; else goto _L16
_L16:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((i & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, j);
        }
        if ((i & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, k);
        }
        if ((i & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, l);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(4, a);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(5, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(6, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(7, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(8, e);
        }
        if ((i & 8) != 0)
        {
            codedoutputbytebuffernano.a(9, m);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(10, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(11, g);
        }
        if ((i & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(12, n);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
