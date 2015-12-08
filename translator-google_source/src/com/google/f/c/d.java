// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.c:
//            e

public final class d extends b
{

    public e a[];
    private int b;
    private int c;
    private float d;
    private int e;

    public d()
    {
        b = 0;
        c = 0;
        d = 0.0F;
        e = 0;
        a = com.google.f.c.e.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if ((b & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(1, c);
        }
        k = i;
        if ((b & 2) != 0)
        {
            k = i + (CodedOutputByteBufferNano.b(2) + 4);
        }
        i = k;
        if ((b & 4) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(3, e);
        }
        k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                for (k = 0; k < a.length;)
                {
                    e e1 = a[k];
                    int l = i;
                    if (e1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(4, e1);
                    }
                    k++;
                    i = l;
                }

                k = i;
            }
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L7:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   21: 121
    //                   24: 145
    //                   34: 166;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(a1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int k = a1.e();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = k;
            b = b | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        d = Float.intBitsToFloat(a1.g());
        b = b | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        e = a1.e();
        b = b | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = j.a(a1, 34);
        e ae[];
        int l;
        if (a == null)
        {
            l = 0;
        } else
        {
            l = a.length;
        }
        ae = new e[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(a, 0, ae, 0, l);
            i1 = l;
        }
        for (; i1 < ae.length - 1; i1++)
        {
            ae[i1] = new e();
            a1.a(ae[i1]);
            a1.a();
        }

        ae[i1] = new e();
        a1.a(ae[i1]);
        a = ae;
        if (true) goto _L7; else goto _L8
_L8:
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
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, e);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                e e1 = a[i];
                if (e1 != null)
                {
                    codedoutputbytebuffernano.a(4, e1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
