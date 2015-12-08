// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.common.b.a:
//            t, b, ad, y, 
//            w, l

public final class x extends b
{

    public t a;
    public t b;
    public t c;
    public com.google.common.b.a.b d;
    public ad e;
    public ad f;
    public y g;
    public w h;
    public l i;
    private int j;
    private String k;
    private String l;
    private String m;
    private int n;
    private boolean o;
    private int p;

    public x()
    {
        j = 0;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        k = "";
        g = null;
        l = "";
        h = null;
        m = "";
        n = 0;
        o = false;
        p = 0;
        i = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(6, f);
        }
        i1 = j1;
        if ((j & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(7, k);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(8, g);
        }
        i1 = j1;
        if ((j & 2) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, l);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(10, h);
        }
        i1 = j1;
        if ((j & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(11, m);
        }
        j1 = i1;
        if ((j & 8) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(12, n);
        }
        i1 = j1;
        if ((j & 0x10) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(13) + 1);
        }
        j1 = i1;
        if ((j & 0x20) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(14, p);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(15, i);
        }
        return i1;
    }

    public final g mergeFrom(a a1)
    {
_L18:
        int i1 = a1.a();
        i1;
        JVM INSTR lookupswitch 16: default 144
    //                   0: 153
    //                   10: 155
    //                   18: 184
    //                   26: 213
    //                   34: 242
    //                   42: 271
    //                   50: 300
    //                   58: 329
    //                   66: 350
    //                   74: 379
    //                   82: 400
    //                   90: 429
    //                   96: 450
    //                   104: 526
    //                   112: 548
    //                   122: 570;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L18; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new t();
        }
        a1.a(a);
          goto _L18
_L4:
        if (b == null)
        {
            b = new t();
        }
        a1.a(b);
          goto _L18
_L5:
        if (c == null)
        {
            c = new t();
        }
        a1.a(c);
          goto _L18
_L6:
        if (d == null)
        {
            d = new com.google.common.b.a.b();
        }
        a1.a(d);
          goto _L18
_L7:
        if (e == null)
        {
            e = new ad();
        }
        a1.a(e);
          goto _L18
_L8:
        if (f == null)
        {
            f = new ad();
        }
        a1.a(f);
          goto _L18
_L9:
        k = a1.c();
        j = j | 1;
          goto _L18
_L10:
        if (g == null)
        {
            g = new y();
        }
        a1.a(g);
          goto _L18
_L11:
        l = a1.c();
        j = j | 2;
          goto _L18
_L12:
        if (h == null)
        {
            h = new w();
        }
        a1.a(h);
          goto _L18
_L13:
        m = a1.c();
        j = j | 4;
          goto _L18
_L14:
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
            n = j1;
            j = j | 8;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        o = a1.b();
        j = j | 0x10;
        continue; /* Loop/switch isn't completed */
_L16:
        p = a1.e();
        j = j | 0x20;
        continue; /* Loop/switch isn't completed */
_L17:
        if (i == null)
        {
            i = new l();
        }
        a1.a(i);
        if (true) goto _L18; else goto _L19
_L19:
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
        if (f != null)
        {
            codedoutputbytebuffernano.a(6, f);
        }
        if ((j & 1) != 0)
        {
            codedoutputbytebuffernano.a(7, k);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(8, g);
        }
        if ((j & 2) != 0)
        {
            codedoutputbytebuffernano.a(9, l);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(10, h);
        }
        if ((j & 4) != 0)
        {
            codedoutputbytebuffernano.a(11, m);
        }
        if ((j & 8) != 0)
        {
            codedoutputbytebuffernano.a(12, n);
        }
        if ((j & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(13, o);
        }
        if ((j & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(14, p);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(15, i);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
