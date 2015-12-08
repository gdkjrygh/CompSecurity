// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.common.b.b.a:
//            c, e, d

public final class b extends com.google.protobuf.nano.b
{

    public c a;
    public e b;
    public d c;
    private int d;
    private String e;
    private int f;
    private String g;
    private String h;

    public b()
    {
        d = 0;
        e = "";
        f = 0;
        a = null;
        b = null;
        c = null;
        g = "";
        h = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((d & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(1, e);
        }
        j = i;
        if ((d & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, f);
        }
        i = j;
        if (a != null)
        {
            i = j + CodedOutputByteBufferNano.c(3, a);
        }
        j = i;
        if (b != null)
        {
            j = i + CodedOutputByteBufferNano.c(4, b);
        }
        i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.c(5, c);
        }
        j = i;
        if ((d & 4) != 0)
        {
            j = i + CodedOutputByteBufferNano.b(6, g);
        }
        i = j;
        if ((d & 8) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(7, h);
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
_L10:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   16: 112
    //                   26: 261
    //                   34: 290
    //                   42: 319
    //                   50: 348
    //                   58: 369;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(a1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        e = a1.c();
        d = d | 1;
          goto _L10
_L4:
        int j = a1.e();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        case 201: 
        case 202: 
        case 300: 
            f = j;
            d = d | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (a == null)
        {
            a = new c();
        }
        a1.a(a);
        continue; /* Loop/switch isn't completed */
_L6:
        if (b == null)
        {
            b = new e();
        }
        a1.a(b);
        continue; /* Loop/switch isn't completed */
_L7:
        if (c == null)
        {
            c = new d();
        }
        a1.a(c);
        continue; /* Loop/switch isn't completed */
_L8:
        g = a1.c();
        d = d | 4;
        continue; /* Loop/switch isn't completed */
_L9:
        h = a1.c();
        d = d | 8;
        if (true) goto _L10; else goto _L11
_L11:
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
        if (a != null)
        {
            codedoutputbytebuffernano.a(3, a);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(4, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(5, c);
        }
        if ((d & 4) != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if ((d & 8) != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
