// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package b.a.a.a.a:
//            d, i

public final class e extends b
{

    public d a;
    public i b;
    private int c;
    private int d;

    public e()
    {
        c = 0;
        a = null;
        b = null;
        d = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + CodedOutputByteBufferNano.c(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + CodedOutputByteBufferNano.c(2, b);
        }
        j = k;
        if ((c & 1) != 0)
        {
            j = k + CodedOutputByteBufferNano.d(3, d);
        }
        return j;
    }

    public final g mergeFrom(a a1)
    {
_L6:
        int j = a1.a();
        j;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   18: 88
    //                   24: 117;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(a1, j)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new d();
        }
        a1.a(a);
          goto _L6
_L4:
        if (b == null)
        {
            b = new i();
        }
        a1.a(b);
          goto _L6
_L5:
        int k = a1.e();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            d = k;
            c = c | 1;
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
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
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
