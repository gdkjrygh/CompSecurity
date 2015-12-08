// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hcd
    implements iwe
{

    iwt a;
    hzg b;
    hzh c;
    hcb d;
    int e;
    boolean f;
    Set g;
    ekp h;
    boolean i;

    public hcd(iwt iwt1, hzg hzg1, hzh hzh1, int j)
    {
        g = new HashSet();
        a = iwt1;
        b = hzg1;
        c = hzh1;
        e = j;
    }

    Boolean a(float f1, float f2, int ai[], int j, int k)
    {
        if (f2 < (float)ai[1])
        {
            return Boolean.valueOf(true);
        }
        if (f2 < (float)(ai[1] + k) && e == 0 && f1 < (float)ai[0])
        {
            return Boolean.valueOf(true);
        }
        if (f2 < (float)(ai[1] + k) && e == 1 && f1 > (float)(ai[0] + j))
        {
            return Boolean.valueOf(true);
        }
        if (f2 > (float)(ai[1] + k))
        {
            return Boolean.valueOf(false);
        }
        if (f2 > (float)ai[1] && e == 0 && f1 > (float)(ai[0] + j))
        {
            return Boolean.valueOf(false);
        }
        if (f2 > (float)ai[1] && e == 1 && f1 < (float)ai[0])
        {
            return Boolean.valueOf(false);
        } else
        {
            return null;
        }
    }

    public void a(PointF pointf)
    {
        b(pointf);
    }

    public void a(ekp ekp1)
    {
        f = true;
        h = ekp1;
        g.clear();
        d.a();
    }

    public void a(hcb hcb1)
    {
        d = hcb1;
    }

    public boolean a(MotionEvent motionevent)
    {
        if (d != null)
        {
            d.a(motionevent);
        }
        if (!f) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 6: default 68
    //                   0 68
    //                   1 73
    //                   2 88
    //                   3 68
    //                   4 68
    //                   5 73
    //                   6 68;
           goto _L2 _L2 _L3 _L4 _L2 _L2 _L3 _L2
_L2:
        return f;
_L3:
        f = false;
        d.b();
        continue; /* Loop/switch isn't completed */
_L4:
        if (motionevent.getPointerCount() > 1)
        {
            f = false;
            d.b();
        } else
        {
            b(new PointF(motionevent.getX(), motionevent.getY()));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    void b(PointF pointf)
    {
        int ai[] = new int[2];
        float f1 = pointf.x;
        float f2 = pointf.y;
        pointf = a.a();
        int i1 = -1;
        int l = -1;
        int j = -1;
        int k = 0;
        while (k < pointf.size()) 
        {
            Object obj = (iws)pointf.get(k);
            ekp ekp2 = ((iws) (obj)).b;
            obj = ((iws) (obj)).a;
            ((View) (obj)).getLocationOnScreen(ai);
            int j1 = ((View) (obj)).getWidth();
            int i2 = ((View) (obj)).getHeight();
            if (ekp2.equals(h))
            {
                Boolean boolean1 = a(f1, f2, ai, j1, i2);
                boolean flag;
                if (boolean1 != null)
                {
                    flag = boolean1.booleanValue();
                } else
                {
                    flag = i;
                }
                i = flag;
                i1 = k;
            }
            ekp ekp1;
            if (f1 >= (float)ai[0] && f1 <= (float)(ai[0] + j1) && f2 >= (float)ai[1] && f2 <= (float)(ai[1] + i2))
            {
                j = l;
                l = k;
            } else
            if (!b(f1, f2, ai, j1, i2))
            {
                l = k;
                int k1 = j;
                j = l;
                l = k1;
            } else
            {
                int l1 = j;
                j = l;
                l = l1;
            }
            k++;
            j1 = l;
            l = j;
            j = j1;
        }
        if (!i)
        {
            k = l + 1;
        } else
        {
            k = l;
        }
        l = i1;
        if (i1 == -1)
        {
            if (i)
            {
                l = -1;
            } else
            {
                l = pointf.size();
            }
        }
        if (j == -1)
        {
            j = k;
        }
        if (j != -1)
        {
            k = 0;
            while (k < pointf.size()) 
            {
                ekp1 = ((iws)pointf.get(k)).b;
                if (k >= j && k <= l || k >= l && k <= j)
                {
                    if (!c.a(ekp1))
                    {
                        b.b(ekp1);
                    }
                    g.add(ekp1);
                } else
                if (g.contains(ekp1) && c.a(ekp1))
                {
                    b.a(ekp1);
                }
                k++;
            }
        }
    }

    boolean b(float f1, float f2, int ai[], int j, int k)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (f2 <= (float)(ai[1] + k))
            {
                flag = flag1;
                if (f2 <= (float)ai[1])
                {
                    break label0;
                }
                if (e != 0 || f1 <= (float)(ai[0] + j))
                {
                    flag = flag1;
                    if (e != 1)
                    {
                        break label0;
                    }
                    flag = flag1;
                    if (f1 >= (float)ai[0])
                    {
                        break label0;
                    }
                }
            }
            flag = true;
        }
        return flag;
    }
}
