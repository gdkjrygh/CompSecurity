// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class t extends b
{

    public int a;
    public boolean b;
    public boolean c;
    public int d[];
    public String e;
    private String f;
    private boolean g;
    private boolean h;

    public t()
    {
        a = 0;
        f = "";
        b = false;
        c = false;
        d = j.a;
        e = "";
        g = true;
        h = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int k = super.computeSerializedSize();
        int i = k;
        if ((a & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(1, f);
        }
        k = i;
        if ((a & 2) != 0)
        {
            k = i + (CodedOutputByteBufferNano.b(2) + 1);
        }
        i = k;
        if ((a & 4) != 0)
        {
            i = k + (CodedOutputByteBufferNano.b(3) + 1);
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
        i = k;
        if ((a & 8) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(5, e);
        }
        k = i;
        if ((a & 0x10) != 0)
        {
            k = i + (CodedOutputByteBufferNano.b(6) + 1);
        }
        i = k;
        if ((a & 0x20) != 0)
        {
            i = k + (CodedOutputByteBufferNano.b(7) + 1);
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
_L25:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 9: default 92
    //                   0: 102
    //                   10: 104
    //                   16: 125
    //                   24: 146
    //                   32: 167
    //                   34: 352
    //                   42: 558
    //                   48: 580
    //                   56: 602;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(a1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        f = a1.c();
        a = a | 1;
        continue; /* Loop/switch isn't completed */
_L4:
        b = a1.b();
        a = a | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        c = a1.b();
        a = a | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        int ai[];
        int k;
        int j1;
        j1 = j.a(a1, 32);
        ai = new int[j1];
        k = 0;
        i = 0;
_L17:
        if (k >= j1) goto _L12; else goto _L11
_L11:
        int k1;
        if (k != 0)
        {
            a1.a();
        }
        k1 = a1.e();
        k1;
        JVM INSTR tableswitch 0 2: default 236
    //                   0 245
    //                   1 245
    //                   2 245;
           goto _L13 _L14 _L14 _L14
_L13:
        k++;
          goto _L15
_L14:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L13; else goto _L15
_L15:
        if (true) goto _L17; else goto _L16
_L16:
_L12:
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
_L23:
        if (a1.i() > 0)
        {
            switch (a1.e())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L19; else goto _L18
_L18:
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
_L21:
        if (a1.i() > 0)
        {
            i = a1.e();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                ai[k] = i;
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        d = ai;
          goto _L19
        if (true) goto _L21; else goto _L20
_L20:
        if (true) goto _L23; else goto _L22
_L22:
_L19:
        a1.d(i1);
        continue; /* Loop/switch isn't completed */
_L8:
        e = a1.c();
        a = a | 8;
        continue; /* Loop/switch isn't completed */
_L9:
        g = a1.b();
        a = a | 0x10;
        continue; /* Loop/switch isn't completed */
_L10:
        h = a1.b();
        a = a | 0x20;
        if (true) goto _L25; else goto _L24
_L24:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((a & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, f);
        }
        if ((a & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if ((a & 4) != 0)
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
        if ((a & 8) != 0)
        {
            codedoutputbytebuffernano.a(5, e);
        }
        if ((a & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if ((a & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
