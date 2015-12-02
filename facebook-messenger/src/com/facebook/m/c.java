// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.m;

import android.hardware.SensorEvent;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.facebook.m:
//            d, e, b

class c
{

    final long a = 0x3b9aca00L;
    private final LinkedList b = new LinkedList();
    private long c;
    private long d;
    private d e;

    c()
    {
        e = d.Insignificant;
    }

    void a()
    {
        b.clear();
    }

    void a(SensorEvent sensorevent)
    {
        if (b.size() == 0)
        {
            c = sensorevent.timestamp;
            d = c + 0x3b9aca00L;
            b.addLast(new e(sensorevent));
            return;
        }
        if (sensorevent.timestamp < d)
        {
            b.addLast(new e(sensorevent));
            return;
        } else
        {
            e e1 = (e)b.removeFirst();
            e1.a(sensorevent);
            b.addLast(e1);
            return;
        }
    }

    boolean b()
    {
        Iterator iterator;
        int i;
        int j;
        iterator = b.iterator();
        j = 0;
        i = 0;
_L10:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        int k;
        boolean flag;
        e e1 = (e)iterator.next();
        if (e1.a > 14.70998F)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (e1.a < -14.70998F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a[e.ordinal()];
        JVM INSTR tableswitch 1 3: default 96
    //                   1 131
    //                   2 185
    //                   3 237;
           goto _L3 _L4 _L5 _L6
_L3:
        k = j;
        j = i;
        i = k;
_L8:
        k = j;
        j = i;
        i = k;
        continue; /* Loop/switch isn't completed */
_L4:
        if (k != 0)
        {
            e = d.AboveThreshold;
            k = i + 1;
            i = j;
            j = k;
        } else
        {
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
            e = d.BelowThreshold;
            k = j + 1;
            j = i;
            i = k;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (flag)
        {
            e = d.BelowThreshold;
            k = j + 1;
            j = i;
            i = k;
        } else
        {
            if (k != 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            e = d.Insignificant;
            k = i;
            i = j;
            j = k;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        e = d.AboveThreshold;
        k = i + 1;
        i = j;
        j = k;
        if (true) goto _L8; else goto _L7
_L7:
        if (!flag)
        {
            e = d.Insignificant;
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (i >= 2 && j >= 2)
        {
            return true;
        }
        return false;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
