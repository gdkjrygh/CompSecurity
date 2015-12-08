// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.common.b:
//            as

public final class ar extends b
{

    public int a[];
    public as b[];
    public String c[];
    private int d;
    private int e;

    public ar()
    {
        d = 0;
        e = 0;
        a = j.a;
        b = com.google.common.b.as.a();
        c = j.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int k = i;
        if ((d & 1) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(1, e);
        }
        i = k;
        if (a != null)
        {
            i = k;
            if (a.length > 0)
            {
                i = 0;
                int l = 0;
                for (; i < a.length; i++)
                {
                    l += CodedOutputByteBufferNano.a(a[i]);
                }

                i = k + l + a.length * 1;
            }
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                for (k = 0; k < b.length;)
                {
                    as as1 = b[k];
                    int i1 = i;
                    if (as1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.c(3, as1);
                    }
                    k++;
                    i = i1;
                }

                k = i;
            }
        }
        i = k;
        if (c != null)
        {
            i = k;
            if (c.length > 0)
            {
                int j1 = 0;
                int k1 = 0;
                for (i = ((flag) ? 1 : 0); i < c.length;)
                {
                    String s = c[i];
                    int i2 = j1;
                    int l1 = k1;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        i2 = j1 + CodedOutputByteBufferNano.a(s);
                    }
                    i++;
                    j1 = i2;
                    k1 = l1;
                }

                i = k + j1 + k1 * 1;
            }
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
_L8:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 6: default 68
    //                   0: 78
    //                   8: 80
    //                   16: 146
    //                   18: 432
    //                   26: 838
    //                   34: 969;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(a1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        i = a1.e();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            e = i;
            d = d | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int ai[];
        int i1;
        int j2;
        j2 = j.a(a1, 16);
        ai = new int[j2];
        i1 = 0;
        i = 0;
_L14:
        if (i1 >= j2) goto _L10; else goto _L9
_L9:
        int k2;
        if (i1 != 0)
        {
            a1.a();
        }
        k2 = a1.e();
        k2;
        JVM INSTR tableswitch 0 27: default 316
    //                   0 325
    //                   1 325
    //                   2 325
    //                   3 325
    //                   4 325
    //                   5 325
    //                   6 325
    //                   7 325
    //                   8 325
    //                   9 325
    //                   10 325
    //                   11 325
    //                   12 325
    //                   13 325
    //                   14 325
    //                   15 325
    //                   16 325
    //                   17 325
    //                   18 325
    //                   19 325
    //                   20 325
    //                   21 325
    //                   22 325
    //                   23 325
    //                   24 325
    //                   25 325
    //                   26 325
    //                   27 325;
           goto _L11 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12
_L11:
        i1++;
        continue; /* Loop/switch isn't completed */
_L12:
        int l1 = i + 1;
        ai[i] = k2;
        i = l1;
        if (true) goto _L11; else goto _L10
_L10:
        if (i != 0)
        {
            if (a == null)
            {
                i1 = 0;
            } else
            {
                i1 = a.length;
            }
            if (i1 == 0 && i == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[i1 + i];
                if (i1 != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, i1);
                }
                System.arraycopy(ai, 0, ai1, i1, i);
                a = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L14; else goto _L13
_L13:
_L5:
        int i2;
        i2 = a1.c(a1.e());
        i = a1.j();
        i1 = 0;
_L20:
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
                i1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 0) goto _L16; else goto _L15
_L15:
        a1.e(i);
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ai = new int[i1 + i];
        i1 = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ai, 0, i);
            i1 = i;
        }
_L18:
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
                ai[i1] = i;
                i1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
_L16:
        a1.d(i2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
_L6:
        int j1 = j.a(a1, 26);
        as aas[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aas = new as[j1 + k];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aas, 0, k);
            j1 = k;
        }
        for (; j1 < aas.length - 1; j1++)
        {
            aas[j1] = new as();
            a1.a(aas[j1]);
            a1.a();
        }

        aas[j1] = new as();
        a1.a(aas[j1]);
        b = aas;
        continue; /* Loop/switch isn't completed */
_L7:
        int k1 = j.a(a1, 34);
        String as1[];
        int l;
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        as1 = new String[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, as1, 0, l);
            k1 = l;
        }
        for (; k1 < as1.length - 1; k1++)
        {
            as1[k1] = a1.c();
            a1.a();
        }

        as1[k1] = a1.c();
        c = as1;
        if (true) goto _L8; else goto _L21
_L21:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((d & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, e);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                codedoutputbytebuffernano.a(2, a[i]);
            }

        }
        if (b != null && b.length > 0)
        {
            for (int k = 0; k < b.length; k++)
            {
                as as1 = b[k];
                if (as1 != null)
                {
                    codedoutputbytebuffernano.a(3, as1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < c.length; l++)
            {
                String s = c[l];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(4, s);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
