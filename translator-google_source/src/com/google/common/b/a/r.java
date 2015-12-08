// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.common.b.a:
//            t, b

public final class r extends b
{

    public t a;
    public com.google.common.b.a.b b;
    private int c;
    private String d;
    private int e;
    private boolean f;

    public r()
    {
        c = 0;
        d = "";
        e = 0;
        a = null;
        f = false;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((c & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(1, d);
        }
        j = i;
        if ((c & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, e);
        }
        i = j;
        if (a != null)
        {
            i = j + CodedOutputByteBufferNano.c(3, a);
        }
        j = i;
        if ((c & 4) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(4) + 1);
        }
        i = j;
        if (b != null)
        {
            i = j + CodedOutputByteBufferNano.c(5, b);
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
_L8:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   16: 96
    //                   26: 169
    //                   32: 198
    //                   42: 219;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(a1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        d = a1.c();
        c = c | 1;
          goto _L8
_L4:
        int j = a1.e();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            e = j;
            c = c | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (a == null)
        {
            a = new t();
        }
        a1.a(a);
        continue; /* Loop/switch isn't completed */
_L6:
        f = a1.b();
        c = c | 4;
        continue; /* Loop/switch isn't completed */
_L7:
        if (b == null)
        {
            b = new com.google.common.b.a.b();
        }
        a1.a(b);
        if (true) goto _L8; else goto _L9
_L9:
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
        if (a != null)
        {
            codedoutputbytebuffernano.a(3, a);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(5, b);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
