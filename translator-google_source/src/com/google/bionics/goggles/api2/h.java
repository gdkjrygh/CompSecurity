// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class h extends b
{

    private static volatile h b[];
    public int a[];

    public h()
    {
        a = j.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static h[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new h[0];
                }
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int i = 0;
        int l = super.computeSerializedSize();
        if (a != null && a.length > 0)
        {
            int k = 0;
            for (; i < a.length; i++)
            {
                k += CodedOutputByteBufferNano.a(a[i]);
            }

            return l + k + a.length * 1;
        } else
        {
            return l;
        }
    }

    public final g mergeFrom(a a1)
    {
_L19:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   0: 54
    //                   8: 56
    //                   10: 236;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(a1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int ai[];
        int k;
        int j1;
        j1 = j.a(a1, 8);
        ai = new int[j1];
        k = 0;
        i = 0;
_L11:
        if (k >= j1) goto _L6; else goto _L5
_L5:
        int k1;
        if (k != 0)
        {
            a1.a();
        }
        k1 = a1.e();
        k1;
        JVM INSTR tableswitch 1 1: default 120
    //                   1 129;
           goto _L7 _L8
_L7:
        k++;
          goto _L9
_L8:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L7; else goto _L9
_L9:
        if (true) goto _L11; else goto _L10
_L10:
_L6:
        if (i != 0)
        {
            if (a == null)
            {
                k = 0;
            } else
            {
                k = a.length;
            }
            if (k == 0 && i == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[k + i];
                if (k != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, i);
                a = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1;
        i1 = a1.c(a1.e());
        i = a1.j();
        k = 0;
_L17:
        if (a1.i() > 0)
        {
            switch (a1.e())
            {
            case 1: // '\001'
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L13; else goto _L12
_L12:
        a1.e(i);
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ai = new int[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ai, 0, i);
            k = i;
        }
_L15:
        if (a1.i() > 0)
        {
            i = a1.e();
            switch (i)
            {
            case 1: // '\001'
                ai[k] = i;
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
          goto _L13
        if (true) goto _L15; else goto _L14
_L14:
        if (true) goto _L17; else goto _L16
_L16:
_L13:
        a1.d(i1);
        if (true) goto _L19; else goto _L18
_L18:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                codedoutputbytebuffernano.a(1, a[i]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
