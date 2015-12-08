// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class d extends b
{

    public String a[];
    private int b;
    private int c;

    public d()
    {
        b = 0;
        c = 0;
        a = j.f;
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
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (k = ((flag) ? 1 : 0); k < a.length;)
                {
                    String s = a[k];
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
_L5:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   18: 101;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(a1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int k = a1.e();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            c = k;
            b = b | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = j.a(a1, 18);
        String as[];
        int l;
        if (a == null)
        {
            l = 0;
        } else
        {
            l = a.length;
        }
        as = new String[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(a, 0, as, 0, l);
            i1 = l;
        }
        for (; i1 < as.length - 1; i1++)
        {
            as[i1] = a1.c();
            a1.a();
        }

        as[i1] = a1.c();
        a = as;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, c);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(2, s);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
