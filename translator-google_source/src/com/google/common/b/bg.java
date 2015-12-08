// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class bg extends b
{

    private static volatile bg c[];
    public int a;
    public int b[];
    private int d;
    private int e;
    private int f;
    private int g;

    public bg()
    {
        d = 0;
        e = -1;
        a = 0;
        b = j.a;
        f = 0;
        g = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static bg[] a()
    {
        if (c == null)
        {
            synchronized (f.a)
            {
                if (c == null)
                {
                    c = new bg[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int k = 0;
        int l = super.computeSerializedSize();
        int i = l;
        if ((d & 1) != 0)
        {
            i = l + CodedOutputByteBufferNano.d(1, e);
        }
        l = CodedOutputByteBufferNano.e(2, a) + i;
        if (b != null && b.length > 0)
        {
            for (i = 0; i < b.length; i++)
            {
                k += CodedOutputByteBufferNano.d(b[i]);
            }

            k = l + k + b.length * 1;
        } else
        {
            k = l;
        }
        i = k;
        if ((d & 2) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(4, f);
        }
        k = i;
        if ((d & 4) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(5, g);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L9:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   16: 104
    //                   24: 115
    //                   26: 216
    //                   32: 344
    //                   40: 365;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(a1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        e = a1.e();
        d = d | 1;
          goto _L9
_L4:
        a = a1.e();
          goto _L9
_L5:
        int j1 = j.a(a1, 24);
        int ai[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        ai = new int[j1 + k];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, ai, 0, k);
            j1 = k;
        }
        for (; j1 < ai.length - 1; j1++)
        {
            ai[j1] = a1.e();
            a1.a();
        }

        ai[j1] = a1.e();
        b = ai;
          goto _L9
_L6:
        int l1 = a1.c(a1.e());
        int l = a1.j();
        int k1;
        for (k1 = 0; a1.i() > 0; k1++)
        {
            a1.e();
        }

        a1.e(l);
        int ai1[];
        if (b == null)
        {
            l = 0;
        } else
        {
            l = b.length;
        }
        ai1 = new int[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(b, 0, ai1, 0, l);
            k1 = l;
        }
        for (; k1 < ai1.length; k1++)
        {
            ai1[k1] = a1.e();
        }

        b = ai1;
        a1.d(l1);
          goto _L9
_L7:
        f = a1.e();
        d = d | 2;
          goto _L9
_L8:
        int i1 = a1.e();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            g = i1;
            d = d | 4;
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((d & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, e);
        }
        codedoutputbytebuffernano.c(2, a);
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                codedoutputbytebuffernano.c(3, b[i]);
            }

        }
        if ((d & 2) != 0)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        if ((d & 4) != 0)
        {
            codedoutputbytebuffernano.a(5, g);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
