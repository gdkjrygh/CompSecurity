// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.y;

// Referenced classes of package com.roidapp.photogrid.release:
//            oi, ml, hx, hw

final class oj extends Handler
{

    final oi a;

    oj(oi oi1)
    {
        a = oi1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 508
    //                   1: 65
    //                   8: 159
    //                   700: 97
    //                   701: 128
    //                   702: 73;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L3:
        a.a();
        return;
_L7:
        a.d.sendEmptyMessage(15);
        y.a(a.b);
        return;
_L5:
        a.d.sendEmptyMessage(15);
        y.a(a.b, (String)message.obj);
        return;
_L6:
        a.d.sendEmptyMessage(15);
        y.b(a.b, (String)message.obj);
        return;
_L4:
        int i2;
        boolean flag1;
        flag1 = ((Boolean)message.obj).booleanValue();
        i2 = message.arg1;
        if (message.arg2 != 1) goto _L9; else goto _L8
_L8:
        a.j.a(a.b, i2, a.k);
_L11:
        if (a.j.b)
        {
            a.f();
            return;
        }
        break; /* Loop/switch isn't completed */
_L9:
        message = a.b;
        int i1 = a.k;
        boolean flag;
        int k;
        if (az.q == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            k = hw.bc(message);
        } else
        {
            k = hw.ba(message);
        }
        i1 = hx.a(i2, i1);
        if (i1 < k)
        {
            if (flag)
            {
                hw.e(message, i1);
            } else
            {
                hw.c(message, i1);
            }
        }
        if (true) goto _L11; else goto _L10
_L10:
        int j1 = a.k;
        int l;
        if (flag1)
        {
            int i = a.k;
            boolean flag2 = true;
            l = 0;
            do
            {
                if (i < 0)
                {
                    break;
                }
                int k1 = a.j.a(a.b, i2, i, flag2);
                j1 = i;
                l = k1;
                if (k1 != 0)
                {
                    break;
                }
                flag2 = false;
                j1 = i;
                i--;
                l = k1;
            } while (true);
        } else
        {
            int j = a.k;
            boolean flag3 = true;
            l = 0;
            do
            {
                if (j > 5)
                {
                    break;
                }
                int l1 = a.j.a(a.b, i2, j, flag3);
                j1 = j;
                l = l1;
                if (l1 != 0)
                {
                    break;
                }
                flag3 = false;
                j1 = j;
                j++;
                l = l1;
            } while (true);
        }
        Log.e("test width", String.valueOf(l));
        a.k = j1;
        if (l != 0)
        {
            a.a(l);
            return;
        } else
        {
            a.f();
            return;
        }
_L2:
        if (a.j != null)
        {
            a.j.a(message.arg1, a.o, a.k);
            return;
        }
        if (true) goto _L1; else goto _L12
_L12:
    }
}
