// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.e;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class m extends b
{

    public int a;
    public int b;
    public String c[];
    private int d;
    private String e;

    public m()
    {
        d = 0;
        a = 0;
        b = 0;
        e = "";
        c = j.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int k = super.computeSerializedSize();
        int i = k;
        if ((d & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(1, a);
        }
        k = i;
        if ((d & 2) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(2, b);
        }
        i = k;
        if ((d & 4) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(3, e);
        }
        k = i;
        if (c != null)
        {
            k = i;
            if (c.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (k = ((flag) ? 1 : 0); k < c.length;)
                {
                    String s = c[k];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + CodedOutputByteBufferNano.a(s);
                    }
                    k++;
                    l = k1;
                    i1 = j1;
                }

                k = i + l + i1 * 1;
            }
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L7:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 125
    //                   26: 146
    //                   34: 167;
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
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = k;
            d = d | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = a1.e();
        d = d | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        e = a1.c();
        d = d | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = j.a(a1, 34);
        String as[];
        int l;
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        as = new String[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, as, 0, l);
            i1 = l;
        }
        for (; i1 < as.length - 1; i1++)
        {
            as[i1] = a1.c();
            a1.a();
        }

        as[i1] = a1.c();
        c = as;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((d & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if ((d & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if ((d & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, e);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                String s = c[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(4, s);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
