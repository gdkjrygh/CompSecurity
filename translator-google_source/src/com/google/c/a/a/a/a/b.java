// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class b extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public int c;
    public int d[];
    private int e;

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int k = super.computeSerializedSize();
        int i = k;
        if ((e & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(1, a);
        }
        k = i;
        if ((e & 2) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(2, b);
        }
        i = k;
        if ((e & 4) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(3, c);
        }
        k = i;
        if (d != null)
        {
            k = i;
            if (d.length > 0)
            {
                int l = 0;
                for (k = ((flag) ? 1 : 0); k < d.length; k++)
                {
                    l += CodedOutputByteBufferNano.a(d[k]);
                }

                k = i + l + d.length * 1;
            }
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L22:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 6: default 68
    //                   0: 78
    //                   8: 80
    //                   16: 101
    //                   24: 122
    //                   32: 143
    //                   34: 324;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(a1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        a = a1.e();
        e = e | 1;
        continue; /* Loop/switch isn't completed */
_L4:
        b = a1.e();
        e = e | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        c = a1.e();
        e = e | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        int ai[];
        int k;
        int j1;
        j1 = j.a(a1, 32);
        ai = new int[j1];
        k = 0;
        i = 0;
_L14:
        if (k >= j1) goto _L9; else goto _L8
_L8:
        int k1;
        if (k != 0)
        {
            a1.a();
        }
        k1 = a1.e();
        k1;
        JVM INSTR tableswitch 1 2: default 208
    //                   1 217
    //                   2 217;
           goto _L10 _L11 _L11
_L10:
        k++;
          goto _L12
_L11:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L10; else goto _L12
_L12:
        if (true) goto _L14; else goto _L13
_L13:
_L9:
        if (i != 0)
        {
            if (d == null)
            {
                k = 0;
            } else
            {
                k = d.length;
            }
            if (k == 0 && i == ai.length)
            {
                d = ai;
            } else
            {
                int ai1[] = new int[k + i];
                if (k != 0)
                {
                    System.arraycopy(d, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, i);
                d = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int i1;
        i1 = a1.c(a1.e());
        i = a1.j();
        k = 0;
_L20:
        if (a1.i() > 0)
        {
            switch (a1.e())
            {
            case 1: // '\001'
            case 2: // '\002'
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L16; else goto _L15
_L15:
        a1.e(i);
        if (d == null)
        {
            i = 0;
        } else
        {
            i = d.length;
        }
        ai = new int[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(d, 0, ai, 0, i);
            k = i;
        }
_L18:
        if (a1.i() > 0)
        {
            i = a1.e();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
                ai[k] = i;
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        d = ai;
          goto _L16
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
_L16:
        a1.d(i1);
        if (true) goto _L22; else goto _L21
_L21:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((e & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if ((e & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if ((e & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                codedoutputbytebuffernano.a(4, d[i]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
