// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.e.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class c extends b
{

    private static volatile c c[];
    public int a[];
    public int b[];
    private int d;
    private int e;
    private boolean f;
    private int g;

    public c()
    {
        d = 0;
        e = 0;
        f = false;
        a = j.a;
        b = j.a;
        g = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static c[] a()
    {
        if (c == null)
        {
            synchronized (f.a)
            {
                if (c == null)
                {
                    c = new c[0];
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
        int k = super.computeSerializedSize();
        int i = k;
        if ((d & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(1, e);
        }
        k = i;
        if ((d & 2) != 0)
        {
            k = i + (CodedOutputByteBufferNano.b(2) + 1);
        }
        i = k;
        if (a != null)
        {
            i = k;
            if (a.length > 0)
            {
                i = k + a.length * 4 + a.length * 1;
            }
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                k = i + b.length * 4 + b.length * 1;
            }
        }
        i = k;
        if ((d & 4) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(5, g);
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
    //                   8: 91
    //                   16: 193
    //                   26: 315
    //                   29: 214
    //                   34: 517
    //                   37: 416
    //                   40: 618;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(a1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        int k = a1.e();
        switch (k)
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
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            e = k;
            d = d | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        f = a1.b();
        d = d | 2;
        continue; /* Loop/switch isn't completed */
_L6:
        int l1 = j.a(a1, 29);
        int ai[];
        int l;
        if (a == null)
        {
            l = 0;
        } else
        {
            l = a.length;
        }
        ai = new int[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(a, 0, ai, 0, l);
            l1 = l;
        }
        for (; l1 < ai.length - 1; l1++)
        {
            ai[l1] = a1.g();
            a1.a();
        }

        ai[l1] = a1.g();
        a = ai;
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = a1.e();
        int l2 = a1.c(i1);
        int i2 = i1 / 4;
        int ai1[];
        if (a == null)
        {
            i1 = 0;
        } else
        {
            i1 = a.length;
        }
        ai1 = new int[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(a, 0, ai1, 0, i1);
            i2 = i1;
        }
        for (; i2 < ai1.length; i2++)
        {
            ai1[i2] = a1.g();
        }

        a = ai1;
        a1.d(l2);
        continue; /* Loop/switch isn't completed */
_L8:
        int j2 = j.a(a1, 37);
        int ai2[];
        int j1;
        if (b == null)
        {
            j1 = 0;
        } else
        {
            j1 = b.length;
        }
        ai2 = new int[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(b, 0, ai2, 0, j1);
            j2 = j1;
        }
        for (; j2 < ai2.length - 1; j2++)
        {
            ai2[j2] = a1.g();
            a1.a();
        }

        ai2[j2] = a1.g();
        b = ai2;
        continue; /* Loop/switch isn't completed */
_L7:
        int k1 = a1.e();
        int i3 = a1.c(k1);
        int k2 = k1 / 4;
        int ai3[];
        if (b == null)
        {
            k1 = 0;
        } else
        {
            k1 = b.length;
        }
        ai3 = new int[k2 + k1];
        k2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(b, 0, ai3, 0, k1);
            k2 = k1;
        }
        for (; k2 < ai3.length; k2++)
        {
            ai3[k2] = a1.g();
        }

        b = ai3;
        a1.d(i3);
        continue; /* Loop/switch isn't completed */
_L9:
        g = a1.e();
        d = d | 4;
        if (true) goto _L10; else goto _L11
_L11:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((d & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, e);
        }
        if ((d & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, f);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                codedoutputbytebuffernano.b(3, a[i]);
            }

        }
        if (b != null && b.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < b.length; k++)
            {
                codedoutputbytebuffernano.b(4, b[k]);
            }

        }
        if ((d & 4) != 0)
        {
            codedoutputbytebuffernano.a(5, g);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
