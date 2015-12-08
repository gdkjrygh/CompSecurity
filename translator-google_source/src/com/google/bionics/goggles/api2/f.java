// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class f extends b
{

    public int a[];
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private String q;
    private boolean r;
    private boolean s;

    public f()
    {
        b = 0;
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        a = j.a;
        i = "";
        j = 0;
        k = false;
        l = false;
        m = -1;
        n = 0;
        o = false;
        p = false;
        q = "";
        r = true;
        s = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((b & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(1, c);
        }
        j1 = i1;
        if ((b & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, d);
        }
        i1 = j1;
        if ((b & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(3, e);
        }
        j1 = i1;
        if ((b & 8) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(4, f);
        }
        i1 = j1;
        if ((b & 0x10) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(5, g);
        }
        j1 = i1;
        if ((b & 0x20) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(6, h);
        }
        i1 = j1;
        if ((b & 0x40) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(7, i);
        }
        j1 = i1;
        if ((b & 0x80) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(8, j);
        }
        i1 = j1;
        if ((b & 0x100) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(9) + 1);
        }
        j1 = i1;
        if ((b & 0x200) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(10) + 1);
        }
        i1 = j1;
        if ((b & 0x400) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(11, m);
        }
        j1 = i1;
        if ((b & 0x1000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(13) + 1);
        }
        int k1 = j1;
        if ((b & 0x2000) != 0)
        {
            k1 = j1 + (CodedOutputByteBufferNano.b(14) + 1);
        }
        i1 = k1;
        if ((b & 0x800) != 0)
        {
            i1 = k1 + CodedOutputByteBufferNano.d(15, n);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < a.length; j1++)
                {
                    l1 += CodedOutputByteBufferNano.a(a[j1]);
                }

                j1 = i1 + l1 + a.length * 2;
            }
        }
        i1 = j1;
        if ((b & 0x4000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(17, q);
        }
        j1 = i1;
        if ((b & 0x8000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(18) + 1);
        }
        i1 = j1;
        if ((b & 0x10000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(19) + 1);
        }
        return i1;
    }

    public final g mergeFrom(a a1)
    {
_L22:
        int i1 = a1.a();
        i1;
        JVM INSTR lookupswitch 20: default 180
    //                   0: 190
    //                   10: 192
    //                   18: 213
    //                   26: 234
    //                   34: 255
    //                   42: 277
    //                   50: 299
    //                   58: 321
    //                   64: 343
    //                   72: 412
    //                   80: 435
    //                   88: 458
    //                   104: 481
    //                   112: 504
    //                   120: 527
    //                   128: 592
    //                   130: 780
    //                   138: 986
    //                   144: 1009
    //                   152: 1031;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L22; else goto _L2
_L2:
        return this;
_L3:
        c = a1.c();
        b = b | 1;
          goto _L22
_L4:
        d = a1.c();
        b = b | 2;
          goto _L22
_L5:
        e = a1.c();
        b = b | 4;
          goto _L22
_L6:
        f = a1.c();
        b = b | 8;
          goto _L22
_L7:
        g = a1.c();
        b = b | 0x10;
          goto _L22
_L8:
        h = a1.c();
        b = b | 0x20;
          goto _L22
_L9:
        i = a1.c();
        b = b | 0x40;
          goto _L22
_L10:
        i1 = a1.e();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            j = i1;
            b = b | 0x80;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        k = a1.b();
        b = b | 0x100;
        continue; /* Loop/switch isn't completed */
_L12:
        l = a1.b();
        b = b | 0x200;
        continue; /* Loop/switch isn't completed */
_L13:
        m = a1.e();
        b = b | 0x400;
        continue; /* Loop/switch isn't completed */
_L14:
        o = a1.b();
        b = b | 0x1000;
        continue; /* Loop/switch isn't completed */
_L15:
        p = a1.b();
        b = b | 0x2000;
        continue; /* Loop/switch isn't completed */
_L16:
        i1 = a1.e();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 50: // '2'
            n = i1;
            b = b | 0x800;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        int ai[];
        int j1;
        int i2;
        i2 = com.google.protobuf.nano.j.a(a1, 128);
        ai = new int[i2];
        j1 = 0;
        i1 = 0;
_L28:
        if (j1 >= i2) goto _L24; else goto _L23
_L23:
        int j2;
        if (j1 != 0)
        {
            a1.a();
        }
        j2 = a1.e();
        j2;
        JVM INSTR tableswitch 0 2: default 664
    //                   0 673
    //                   1 673
    //                   2 673;
           goto _L25 _L26 _L26 _L26
_L25:
        j1++;
        continue; /* Loop/switch isn't completed */
_L26:
        int k1 = i1 + 1;
        ai[i1] = j2;
        i1 = k1;
        if (true) goto _L25; else goto _L24
_L24:
        if (i1 != 0)
        {
            if (a == null)
            {
                j1 = 0;
            } else
            {
                j1 = a.length;
            }
            if (j1 == 0 && i1 == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[j1 + i1];
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, j1);
                }
                System.arraycopy(ai, 0, ai1, j1, i1);
                a = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L28; else goto _L27
_L27:
_L18:
        int l1;
        l1 = a1.c(a1.e());
        i1 = a1.j();
        j1 = 0;
_L34:
        if (a1.i() > 0)
        {
            switch (a1.e())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 0) goto _L30; else goto _L29
_L29:
        a1.e(i1);
        if (a == null)
        {
            i1 = 0;
        } else
        {
            i1 = a.length;
        }
        ai = new int[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(a, 0, ai, 0, i1);
            j1 = i1;
        }
_L32:
        if (a1.i() > 0)
        {
            i1 = a1.e();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                ai[j1] = i1;
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
_L30:
        a1.d(l1);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L32; else goto _L31
_L31:
        if (true) goto _L34; else goto _L33
_L33:
_L19:
        q = a1.c();
        b = b | 0x4000;
        continue; /* Loop/switch isn't completed */
_L20:
        r = a1.b();
        b = b | 0x8000;
        continue; /* Loop/switch isn't completed */
_L21:
        s = a1.b();
        b = b | 0x10000;
        if (true) goto _L22; else goto _L35
_L35:
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
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, g);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, h);
        }
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, i);
        }
        if ((b & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(8, j);
        }
        if ((b & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(9, k);
        }
        if ((b & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(10, l);
        }
        if ((b & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(11, m);
        }
        if ((b & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(13, o);
        }
        if ((b & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(14, p);
        }
        if ((b & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(15, n);
        }
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                codedoutputbytebuffernano.a(16, a[i1]);
            }

        }
        if ((b & 0x4000) != 0)
        {
            codedoutputbytebuffernano.a(17, q);
        }
        if ((b & 0x8000) != 0)
        {
            codedoutputbytebuffernano.a(18, r);
        }
        if ((b & 0x10000) != 0)
        {
            codedoutputbytebuffernano.a(19, s);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
