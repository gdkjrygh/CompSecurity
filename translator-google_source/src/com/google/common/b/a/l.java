// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.common.b.a:
//            t, e

public final class l extends b
{

    public t a;
    public e b;
    private int c;
    private boolean d;
    private boolean e;
    private String f;
    private boolean g;
    private int h;
    private boolean i;
    private boolean j;

    public l()
    {
        c = 0;
        d = false;
        e = false;
        f = "";
        g = false;
        h = 0;
        a = null;
        i = false;
        j = false;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int k = i1;
        if ((c & 1) != 0)
        {
            k = i1 + (CodedOutputByteBufferNano.b(1) + 1);
        }
        i1 = k;
        if ((c & 2) != 0)
        {
            i1 = k + (CodedOutputByteBufferNano.b(2) + 1);
        }
        k = i1;
        if ((c & 4) != 0)
        {
            k = i1 + CodedOutputByteBufferNano.b(3, f);
        }
        i1 = k;
        if ((c & 8) != 0)
        {
            i1 = k + (CodedOutputByteBufferNano.b(4) + 1);
        }
        k = i1;
        if ((c & 0x10) != 0)
        {
            k = i1 + CodedOutputByteBufferNano.d(5, h);
        }
        i1 = k;
        if (a != null)
        {
            i1 = k + CodedOutputByteBufferNano.c(6, a);
        }
        k = i1;
        if ((c & 0x20) != 0)
        {
            k = i1 + (CodedOutputByteBufferNano.b(7) + 1);
        }
        i1 = k;
        if ((c & 0x40) != 0)
        {
            i1 = k + (CodedOutputByteBufferNano.b(8) + 1);
        }
        k = i1;
        if (b != null)
        {
            k = i1 + CodedOutputByteBufferNano.c(9, b);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L12:
        int k = a1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   8: 107
    //                   16: 128
    //                   26: 149
    //                   32: 170
    //                   40: 192
    //                   50: 246
    //                   56: 275
    //                   64: 297
    //                   74: 319;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(a1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        d = a1.b();
        c = c | 1;
          goto _L12
_L4:
        e = a1.b();
        c = c | 2;
          goto _L12
_L5:
        f = a1.c();
        c = c | 4;
          goto _L12
_L6:
        g = a1.b();
        c = c | 8;
          goto _L12
_L7:
        int i1 = a1.e();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = i1;
            c = c | 0x10;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (a == null)
        {
            a = new t();
        }
        a1.a(a);
        continue; /* Loop/switch isn't completed */
_L9:
        i = a1.b();
        c = c | 0x20;
        continue; /* Loop/switch isn't completed */
_L10:
        j = a1.b();
        c = c | 0x40;
        continue; /* Loop/switch isn't completed */
_L11:
        if (b == null)
        {
            b = new e();
        }
        a1.a(b);
        if (true) goto _L12; else goto _L13
_L13:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, d);
        }
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, e);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, f);
        }
        if ((c & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, g);
        }
        if ((c & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, h);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(6, a);
        }
        if ((c & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(7, i);
        }
        if ((c & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(8, j);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(9, b);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
