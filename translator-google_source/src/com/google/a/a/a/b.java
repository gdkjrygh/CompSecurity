// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class b extends com.google.protobuf.nano.b
{

    public int a[];
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public b()
    {
        b = 0;
        c = 1;
        d = 1;
        e = 0;
        a = j.a;
        f = 1;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int k = super.computeSerializedSize();
        int i = k;
        if ((b & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(1, c);
        }
        k = i;
        if ((b & 2) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(2, d);
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
                int l = 0;
                for (k = ((flag) ? 1 : 0); k < a.length; k++)
                {
                    l += CodedOutputByteBufferNano.a(a[k]);
                }

                k = i + l + a.length * 1;
            }
        }
        i = k;
        if ((b & 8) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(5, f);
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
_L9:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 7: default 76
    //                   0: 86
    //                   8: 88
    //                   16: 226
    //                   24: 278
    //                   32: 299
    //                   34: 500
    //                   40: 738;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(a1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        i = a1.e();
        switch (i)
        {
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
            c = i;
            b = b | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = a1.e();
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
            d = i;
            b = b | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        e = a1.e();
        b = b | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        int ai[];
        int l;
        int k1;
        k1 = j.a(a1, 32);
        ai = new int[k1];
        l = 0;
        i = 0;
_L15:
        if (l >= k1) goto _L11; else goto _L10
_L10:
        int l1;
        if (l != 0)
        {
            a1.a();
        }
        l1 = a1.e();
        l1;
        JVM INSTR tableswitch 1 7: default 384
    //                   1 393
    //                   2 393
    //                   3 384
    //                   4 393
    //                   5 393
    //                   6 393
    //                   7 393;
           goto _L12 _L13 _L13 _L12 _L13 _L13 _L13 _L13
_L12:
        l++;
        continue; /* Loop/switch isn't completed */
_L13:
        int i1 = i + 1;
        ai[i] = l1;
        i = i1;
        if (true) goto _L12; else goto _L11
_L11:
        if (i != 0)
        {
            if (a == null)
            {
                l = 0;
            } else
            {
                l = a.length;
            }
            if (l == 0 && i == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[l + i];
                if (l != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, l);
                }
                System.arraycopy(ai, 0, ai1, l, i);
                a = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L15; else goto _L14
_L14:
_L7:
        int j1;
        j1 = a1.c(a1.e());
        i = a1.j();
        l = 0;
_L21:
        if (a1.i() > 0)
        {
            switch (a1.e())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                l++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l == 0) goto _L17; else goto _L16
_L16:
        a1.e(i);
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ai = new int[l + i];
        l = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ai, 0, i);
            l = i;
        }
_L19:
        if (a1.i() > 0)
        {
            i = a1.e();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                ai[l] = i;
                l++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
_L17:
        a1.d(j1);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L19; else goto _L18
_L18:
        if (true) goto _L21; else goto _L20
_L20:
_L8:
        int k = a1.e();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            f = k;
            b = b | 8;
            break;
        }
        if (true) goto _L9; else goto _L22
_L22:
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
                codedoutputbytebuffernano.a(4, a[i]);
            }

        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
