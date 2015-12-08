// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.i;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.android.slyce.i:
//            s

class k
{

    private boolean a;
    private int b;
    private List c;
    private s d;
    private s e;
    private s f;
    private int g;
    private int h;

    protected k(boolean flag, int i)
    {
        d = new s();
        e = new s();
        a = flag;
        b = i;
    }

    private s a(boolean flag, s s1)
    {
        float f1;
        Iterator iterator;
        if (flag)
        {
            f1 = (float)s1.b / (float)s1.a;
        } else
        {
            f1 = (float)s1.a / (float)s1.b;
        }
        s1 = new s();
        iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            s s2 = (s)iterator.next();
            int i = s2.a;
            int l = s2.b;
            if (i <= 1280 && l <= 1280)
            {
                float f2 = (float)i / (float)l;
                if ((double)(((f2 - f1) * (f2 - f1)) / (f1 * f1)) < 0.01D && i > s1.a)
                {
                    s1 = s2;
                }
            }
        } while (true);
        s s3 = s1;
        if (!s1.a())
        {
            Iterator iterator1 = c.iterator();
            do
            {
                s3 = s1;
                if (!iterator1.hasNext())
                {
                    break;
                }
                s3 = (s)iterator1.next();
                int j = s3.a;
                int i1 = s3.b;
                if (j <= 1280 && i1 <= 1280 && j > s1.a)
                {
                    s1 = s3;
                }
            } while (true);
        }
        return s3;
    }

    protected int a()
    {
        return h;
    }

    protected void a(s s1, boolean flag, int i)
    {
        int j;
        boolean flag1 = false;
        if (flag)
        {
            if (!e.a())
            {
                e = a(flag, s1);
            }
            f = e;
        } else
        {
            if (!d.a())
            {
                d = a(flag, s1);
            }
            f = d;
        }
        j = ((flag1) ? 1 : 0);
        i;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 76
    //                   1 154
    //                   2 161
    //                   3 169;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_169;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        j = ((flag1) ? 1 : 0);
_L6:
        if (a)
        {
            h = (j + b) % 360;
            g = h;
            h = (360 - h) % 360;
            return;
        } else
        {
            h = ((b - j) + 360) % 360;
            g = h;
            return;
        }
_L3:
        j = 90;
          goto _L6
_L4:
        j = 180;
          goto _L6
        j = 270;
          goto _L6
    }

    protected void a(List list)
    {
        c = list;
    }

    protected int b()
    {
        return g;
    }

    protected s c()
    {
        return f;
    }
}
