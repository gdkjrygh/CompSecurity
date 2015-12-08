// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            x, ad

public final class p
{

    public boolean a;
    private final View b;
    private ViewParent c;
    private int d[];

    public p(View view)
    {
        b = view;
    }

    public final void a(boolean flag)
    {
        if (a)
        {
            x.D(b);
        }
        a = flag;
    }

    public final boolean a()
    {
        return c != null;
    }

    public final boolean a(float f, float f1)
    {
        if (a && c != null)
        {
            return ad.a(c, b, f, f1);
        } else
        {
            return false;
        }
    }

    public final boolean a(float f, float f1, boolean flag)
    {
        if (a && c != null)
        {
            return ad.a(c, b, f, f1, flag);
        } else
        {
            return false;
        }
    }

    public final boolean a(int i)
    {
        if (a())
        {
            return true;
        }
        if (a)
        {
            ViewParent viewparent = b.getParent();
            View view = b;
            for (; viewparent != null; viewparent = viewparent.getParent())
            {
                if (ad.a(viewparent, view, b, i))
                {
                    c = viewparent;
                    ad.b(viewparent, view, b, i);
                    return true;
                }
                if (viewparent instanceof View)
                {
                    view = (View)viewparent;
                }
            }

        }
        return false;
    }

    public final boolean a(int i, int j, int k, int l, int ai[])
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a)
        {
            flag = flag1;
            if (c != null)
            {
                if (i != 0 || j != 0 || k != 0 || l != 0)
                {
                    int i1;
                    int j1;
                    if (ai != null)
                    {
                        b.getLocationInWindow(ai);
                        j1 = ai[0];
                        i1 = ai[1];
                    } else
                    {
                        i1 = 0;
                        j1 = 0;
                    }
                    ad.a(c, b, i, j, k, l);
                    if (ai != null)
                    {
                        b.getLocationInWindow(ai);
                        ai[0] = ai[0] - j1;
                        ai[1] = ai[1] - i1;
                    }
                    flag = true;
                } else
                {
                    flag = flag1;
                    if (ai != null)
                    {
                        ai[0] = 0;
                        ai[1] = 0;
                        return false;
                    }
                }
            }
        }
        return flag;
    }

    public final boolean a(int i, int j, int ai[], int ai1[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!a) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (c == null) goto _L2; else goto _L3
_L3:
        if (i == 0 && j == 0) goto _L5; else goto _L4
_L4:
        int ai2[];
        int k;
        int l;
        if (ai1 != null)
        {
            b.getLocationInWindow(ai1);
            l = ai1[0];
            k = ai1[1];
        } else
        {
            k = 0;
            l = 0;
        }
        ai2 = ai;
        if (ai == null)
        {
            if (d == null)
            {
                d = new int[2];
            }
            ai2 = d;
        }
        ai2[0] = 0;
        ai2[1] = 0;
        ad.a(c, b, i, j, ai2);
        if (ai1 != null)
        {
            b.getLocationInWindow(ai1);
            ai1[0] = ai1[0] - l;
            ai1[1] = ai1[1] - k;
        }
        if (ai2[0] != 0) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (ai2[1] == 0) goto _L2; else goto _L7
_L7:
        flag = true;
_L2:
        return flag;
_L5:
        flag = flag1;
        if (ai1 != null)
        {
            ai1[0] = 0;
            ai1[1] = 0;
            return false;
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public final void b()
    {
        if (c != null)
        {
            ad.a(c, b);
            c = null;
        }
    }
}
