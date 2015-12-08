// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class h extends b
{

    private static volatile h d[];
    public String a;
    public String b[];
    public int c[];
    private int e;
    private String f;
    private String g;
    private boolean h;

    public h()
    {
        e = 0;
        f = "";
        a = "";
        b = j.f;
        c = j.a;
        g = "";
        h = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static h[] a()
    {
        if (d == null)
        {
            synchronized (f.a)
            {
                if (d == null)
                {
                    d = new h[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int k = i;
        if ((e & 1) != 0)
        {
            k = i + CodedOutputByteBufferNano.b(1, f);
        }
        i = k;
        if ((e & 2) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(2, a);
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                k = 0;
                int l = 0;
                int j1;
                int k1;
                for (j1 = 0; k < b.length; j1 = k1)
                {
                    String s = b[k];
                    int l1 = l;
                    k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = l + CodedOutputByteBufferNano.a(s);
                    }
                    k++;
                    l = l1;
                }

                k = i + l + j1 * 1;
            }
        }
        i = k;
        if (c != null)
        {
            i = k;
            if (c.length > 0)
            {
                int i1 = 0;
                for (i = ((flag) ? 1 : 0); i < c.length; i++)
                {
                    i1 += CodedOutputByteBufferNano.a(c[i]);
                }

                i = k + i1 + c.length * 1;
            }
        }
        k = i;
        if ((e & 4) != 0)
        {
            k = i + CodedOutputByteBufferNano.b(6, g);
        }
        i = k;
        if ((e & 8) != 0)
        {
            i = k + (CodedOutputByteBufferNano.b(7) + 1);
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
_L24:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 8: default 84
    //                   0: 94
    //                   10: 96
    //                   18: 117
    //                   34: 138
    //                   40: 247
    //                   42: 436
    //                   50: 650
    //                   56: 671;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(a1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        f = a1.c();
        e = e | 1;
        continue; /* Loop/switch isn't completed */
_L4:
        a = a1.c();
        e = e | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        int k = j.a(a1, 34);
        String as[];
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        as = new String[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, as, 0, i);
            k = i;
        }
        for (; k < as.length - 1; k++)
        {
            as[k] = a1.c();
            a1.a();
        }

        as[k] = a1.c();
        b = as;
        continue; /* Loop/switch isn't completed */
_L6:
        int ai[];
        int l;
        int k1;
        k1 = j.a(a1, 40);
        ai = new int[k1];
        l = 0;
        i = 0;
_L16:
        if (l >= k1) goto _L11; else goto _L10
_L10:
        int l1;
        if (l != 0)
        {
            a1.a();
        }
        l1 = a1.e();
        l1;
        JVM INSTR tableswitch 1 4: default 320
    //                   1 329
    //                   2 329
    //                   3 329
    //                   4 329;
           goto _L12 _L13 _L13 _L13 _L13
_L12:
        l++;
          goto _L14
_L13:
        int i1 = i + 1;
        ai[i] = l1;
        i = i1;
        if (true) goto _L12; else goto _L14
_L14:
        if (true) goto _L16; else goto _L15
_L15:
_L11:
        if (i != 0)
        {
            if (c == null)
            {
                l = 0;
            } else
            {
                l = c.length;
            }
            if (l == 0 && i == ai.length)
            {
                c = ai;
            } else
            {
                int ai1[] = new int[l + i];
                if (l != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, l);
                }
                System.arraycopy(ai, 0, ai1, l, i);
                c = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int j1;
        j1 = a1.c(a1.e());
        i = a1.j();
        l = 0;
_L22:
        if (a1.i() > 0)
        {
            switch (a1.e())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                l++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l == 0) goto _L18; else goto _L17
_L17:
        a1.e(i);
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.length;
        }
        ai = new int[l + i];
        l = i;
        if (i != 0)
        {
            System.arraycopy(c, 0, ai, 0, i);
            l = i;
        }
_L20:
        if (a1.i() > 0)
        {
            i = a1.e();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                ai[l] = i;
                l++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        c = ai;
          goto _L18
        if (true) goto _L20; else goto _L19
_L19:
        if (true) goto _L22; else goto _L21
_L21:
_L18:
        a1.d(j1);
        continue; /* Loop/switch isn't completed */
_L8:
        g = a1.c();
        e = e | 4;
        continue; /* Loop/switch isn't completed */
_L9:
        h = a1.b();
        e = e | 8;
        if (true) goto _L24; else goto _L23
_L23:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((e & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, f);
        }
        if ((e & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                String s = b[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(4, s);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                codedoutputbytebuffernano.a(5, c[k]);
            }

        }
        if ((e & 4) != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if ((e & 8) != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
