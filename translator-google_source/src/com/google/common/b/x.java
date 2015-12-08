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
//            y, w

public final class x extends b
{

    public y a[];
    public w b[];
    private int c;
    private int d;

    public x()
    {
        c = 0;
        d = 0;
        a = com.google.common.b.y.a();
        b = com.google.common.b.w.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int k = i;
        if ((c & 1) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(1, d);
        }
        i = k;
        if (a != null)
        {
            i = k;
            if (a.length > 0)
            {
                i = k;
                for (int l = 0; l < a.length;)
                {
                    y y1 = a[l];
                    int j1 = i;
                    if (y1 != null)
                    {
                        j1 = i + CodedOutputByteBufferNano.c(2, y1);
                    }
                    l++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (b != null)
        {
            k1 = i;
            if (b.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (i1 >= b.length)
                    {
                        break;
                    }
                    w w1 = b[i1];
                    k1 = i;
                    if (w1 != null)
                    {
                        k1 = i + CodedOutputByteBufferNano.c(3, w1);
                    }
                    i1++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public final g mergeFrom(a a1)
    {
_L6:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 133
    //                   26: 257;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(a1, i)) goto _L6; else goto _L2
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
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            d = k;
            c = c | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = j.a(a1, 18);
        y ay[];
        int l;
        if (a == null)
        {
            l = 0;
        } else
        {
            l = a.length;
        }
        ay = new y[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(a, 0, ay, 0, l);
            j1 = l;
        }
        for (; j1 < ay.length - 1; j1++)
        {
            ay[j1] = new y();
            a1.a(ay[j1]);
            a1.a();
        }

        ay[j1] = new y();
        a1.a(ay[j1]);
        a = ay;
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = j.a(a1, 26);
        w aw[];
        int i1;
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.length;
        }
        aw = new w[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(b, 0, aw, 0, i1);
            k1 = i1;
        }
        for (; k1 < aw.length - 1; k1++)
        {
            aw[k1] = new w();
            a1.a(aw[k1]);
            a1.a();
        }

        aw[k1] = new w();
        a1.a(aw[k1]);
        b = aw;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, d);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                y y1 = a[i];
                if (y1 != null)
                {
                    codedoutputbytebuffernano.a(2, y1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < b.length; k++)
            {
                w w1 = b[k];
                if (w1 != null)
                {
                    codedoutputbytebuffernano.a(3, w1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
