// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.b:
//            p

public final class q extends b
{

    public p a[];
    public String b[];
    public int c[];
    public int d[];

    public q()
    {
        a = com.google.b.p.a();
        b = j.f;
        c = j.a;
        d = j.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int k2 = super.computeSerializedSize();
        int i;
        int l;
        if (b != null && b.length > 0)
        {
            i = 0;
            int k = 0;
            int i1;
            int i2;
            for (i1 = 0; i < b.length; i1 = i2)
            {
                String s = b[i];
                int j2 = k;
                i2 = i1;
                if (s != null)
                {
                    i2 = i1 + 1;
                    j2 = k + CodedOutputByteBufferNano.a(s);
                }
                i++;
                k = j2;
            }

            i = k2 + k + i1 * 1;
        } else
        {
            i = k2;
        }
        l = i;
        if (a != null)
        {
            l = i;
            if (a.length > 0)
            {
                for (l = 0; l < a.length;)
                {
                    p p1 = a[l];
                    int j1 = i;
                    if (p1 != null)
                    {
                        j1 = i + CodedOutputByteBufferNano.c(3, p1);
                    }
                    l++;
                    i = j1;
                }

                l = i;
            }
        }
        i = l;
        if (c != null)
        {
            i = l;
            if (c.length > 0)
            {
                i = 0;
                int k1 = 0;
                for (; i < c.length; i++)
                {
                    k1 += CodedOutputByteBufferNano.a(c[i]);
                }

                i = l + k1 + c.length * 1;
            }
        }
        l = i;
        if (d != null)
        {
            l = i;
            if (d.length > 0)
            {
                int l1 = 0;
                for (l = ((flag) ? 1 : 0); l < d.length; l++)
                {
                    l1 += CodedOutputByteBufferNano.a(d[l]);
                }

                l = i + l1 + d.length * 1;
            }
        }
        return l;
    }

    public final g mergeFrom(a a1)
    {
_L36:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 7: default 76
    //                   0: 86
    //                   18: 88
    //                   26: 197
    //                   32: 328
    //                   34: 520
    //                   40: 734
    //                   42: 1048;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(a1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int k = j.a(a1, 18);
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
_L4:
        int l = j.a(a1, 26);
        p ap[];
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ap = new p[l + i];
        l = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ap, 0, i);
            l = i;
        }
        for (; l < ap.length - 1; l++)
        {
            ap[l] = new p();
            a1.a(ap[l]);
            a1.a();
        }

        ap[l] = new p();
        a1.a(ap[l]);
        a = ap;
        continue; /* Loop/switch isn't completed */
_L5:
        int ai[];
        int i1;
        int l1;
        l1 = j.a(a1, 32);
        ai = new int[l1];
        i1 = 0;
        i = 0;
_L15:
        if (i1 >= l1) goto _L10; else goto _L9
_L9:
        int i2;
        if (i1 != 0)
        {
            a1.a();
        }
        i2 = a1.e();
        i2;
        JVM INSTR tableswitch 1 4: default 404
    //                   1 413
    //                   2 413
    //                   3 413
    //                   4 413;
           goto _L11 _L12 _L12 _L12 _L12
_L11:
        i1++;
          goto _L13
_L12:
        int j1 = i + 1;
        ai[i] = i2;
        i = j1;
        if (true) goto _L11; else goto _L13
_L13:
        if (true) goto _L15; else goto _L14
_L14:
_L10:
        if (i != 0)
        {
            if (c == null)
            {
                i1 = 0;
            } else
            {
                i1 = c.length;
            }
            if (i1 == 0 && i == ai.length)
            {
                c = ai;
            } else
            {
                int ai1[] = new int[i1 + i];
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, i1);
                }
                System.arraycopy(ai, 0, ai1, i1, i);
                c = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k1;
        k1 = a1.c(a1.e());
        i = a1.j();
        i1 = 0;
_L21:
        if (a1.i() > 0)
        {
            switch (a1.e())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                i1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 0) goto _L17; else goto _L16
_L16:
        a1.e(i);
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.length;
        }
        ai = new int[i1 + i];
        i1 = i;
        if (i != 0)
        {
            System.arraycopy(c, 0, ai, 0, i);
            i1 = i;
        }
_L19:
        if (a1.i() > 0)
        {
            i = a1.e();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                ai[i1] = i;
                i1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        c = ai;
          goto _L17
        if (true) goto _L19; else goto _L18
_L18:
        if (true) goto _L21; else goto _L20
_L20:
_L17:
        a1.d(k1);
        continue; /* Loop/switch isn't completed */
_L7:
        l1 = j.a(a1, 40);
        ai = new int[l1];
        i1 = 0;
        i = 0;
_L28:
        if (i1 >= l1) goto _L23; else goto _L22
_L22:
        if (i1 != 0)
        {
            a1.a();
        }
        i2 = a1.e();
        i2;
        JVM INSTR tableswitch 0 34: default 932
    //                   0 941
    //                   1 941
    //                   2 941
    //                   3 941
    //                   4 941
    //                   5 941
    //                   6 941
    //                   7 941
    //                   8 941
    //                   9 941
    //                   10 941
    //                   11 941
    //                   12 941
    //                   13 941
    //                   14 941
    //                   15 941
    //                   16 941
    //                   17 941
    //                   18 941
    //                   19 941
    //                   20 941
    //                   21 941
    //                   22 941
    //                   23 941
    //                   24 941
    //                   25 941
    //                   26 941
    //                   27 941
    //                   28 941
    //                   29 941
    //                   30 941
    //                   31 941
    //                   32 941
    //                   33 941
    //                   34 941;
           goto _L24 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25
_L24:
        i1++;
          goto _L26
_L25:
        k1 = i + 1;
        ai[i] = i2;
        i = k1;
        if (true) goto _L24; else goto _L26
_L26:
        if (true) goto _L28; else goto _L27
_L27:
_L23:
        if (i != 0)
        {
            if (d == null)
            {
                i1 = 0;
            } else
            {
                i1 = d.length;
            }
            if (i1 == 0 && i == ai.length)
            {
                d = ai;
            } else
            {
                int ai2[] = new int[i1 + i];
                if (i1 != 0)
                {
                    System.arraycopy(d, 0, ai2, 0, i1);
                }
                System.arraycopy(ai, 0, ai2, i1, i);
                d = ai2;
            }
        }
        continue; /* Loop/switch isn't completed */
_L8:
        k1 = a1.c(a1.e());
        i = a1.j();
        i1 = 0;
_L34:
        if (a1.i() > 0)
        {
            switch (a1.e())
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
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
                i1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 0) goto _L30; else goto _L29
_L29:
        a1.e(i);
        if (d == null)
        {
            i = 0;
        } else
        {
            i = d.length;
        }
        ai = new int[i1 + i];
        i1 = i;
        if (i != 0)
        {
            System.arraycopy(d, 0, ai, 0, i);
            i1 = i;
        }
_L32:
        if (a1.i() > 0)
        {
            i = a1.e();
            switch (i)
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
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
                ai[i1] = i;
                i1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        d = ai;
          goto _L30
        if (true) goto _L32; else goto _L31
_L31:
        if (true) goto _L34; else goto _L33
_L33:
_L30:
        a1.d(k1);
        if (true) goto _L36; else goto _L35
_L35:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                String s = b[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(2, s);
                }
            }

        }
        if (a != null && a.length > 0)
        {
            for (int k = 0; k < a.length; k++)
            {
                p p1 = a[k];
                if (p1 != null)
                {
                    codedoutputbytebuffernano.a(3, p1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int l = 0; l < c.length; l++)
            {
                codedoutputbytebuffernano.a(4, c[l]);
            }

        }
        if (d != null && d.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < d.length; i1++)
            {
                codedoutputbytebuffernano.a(5, d[i1]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
