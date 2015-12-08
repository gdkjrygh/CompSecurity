// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.j;

public final class g extends b
{

    public int a[];
    private int b;
    private int c;
    private int d;

    public g()
    {
        b = 0;
        c = 0;
        d = 0;
        a = j.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int k = i;
        if ((b & 1) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(1, c);
        }
        i = k;
        if ((b & 2) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(2, d);
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
        return k;
    }

    public final com.google.protobuf.nano.g mergeFrom(a a1)
    {
_L7:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 113
    //                   24: 189
    //                   26: 290;
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
            c = k;
            b = b | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = a1.e();
        switch (l)
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
            d = l;
            b = b | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = j.a(a1, 24);
        int ai[];
        int i1;
        if (a == null)
        {
            i1 = 0;
        } else
        {
            i1 = a.length;
        }
        ai = new int[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(a, 0, ai, 0, i1);
            k1 = i1;
        }
        for (; k1 < ai.length - 1; k1++)
        {
            ai[k1] = a1.e();
            a1.a();
        }

        ai[k1] = a1.e();
        a = ai;
        continue; /* Loop/switch isn't completed */
_L6:
        int i2 = a1.c(a1.e());
        int j1 = a1.j();
        int l1;
        for (l1 = 0; a1.i() > 0; l1++)
        {
            a1.e();
        }

        a1.e(j1);
        int ai1[];
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        ai1 = new int[l1 + j1];
        l1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, ai1, 0, j1);
            l1 = j1;
        }
        for (; l1 < ai1.length; l1++)
        {
            ai1[l1] = a1.e();
        }

        a = ai1;
        a1.d(i2);
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
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                codedoutputbytebuffernano.a(3, a[i]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
