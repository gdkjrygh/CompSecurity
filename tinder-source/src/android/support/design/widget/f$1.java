// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.x;
import android.support.v4.widget.u;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            f

final class t> extends android.support.v4.widget.f._cls1
{

    final f a;
    private int b;

    public final int a(View view, int i)
    {
        int j;
        int k;
        if (x.h(view) == 1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (a.d == 0)
        {
            if (j != 0)
            {
                j = b - view.getWidth();
                k = b;
            } else
            {
                j = b;
                k = b + view.getWidth();
            }
        } else
        if (a.d == 1)
        {
            if (j != 0)
            {
                j = b;
                k = b + view.getWidth();
            } else
            {
                j = b - view.getWidth();
                k = b;
            }
        } else
        {
            j = b - view.getWidth();
            k = b + view.getWidth();
        }
        return Math.min(Math.max(j, i), k);
    }

    public final void a(int i)
    {
        if (a.c != null)
        {
            a.c.a(i);
        }
    }

    public final void a(View view, float f1)
    {
        boolean flag = true;
        int j = view.getWidth();
        int i;
        if (f1 != 0.0F)
        {
            if (x.h(view) == 1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            int k;
            int l;
            if (a.d == 2)
            {
                i = 1;
            } else
            if (a.d == 0)
            {
                if (i != 0)
                {
                    if (f1 < 0.0F)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                } else
                if (f1 > 0.0F)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
            } else
            if (a.d == 1)
            {
                if (i != 0)
                {
                    if (f1 > 0.0F)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                } else
                if (f1 < 0.0F)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
            } else
            {
                i = 0;
            }
        } else
        {
            i = view.getLeft();
            k = b;
            l = Math.round((float)view.getWidth() * a.e);
            if (Math.abs(i - k) >= l)
            {
                i = 1;
            } else
            {
                i = 0;
            }
        }
        if (i != 0)
        {
            if (view.getLeft() < b)
            {
                i = b - j;
            } else
            {
                i = b + j;
            }
        } else
        {
            i = b;
            flag = false;
        }
        if (a.b.a(i, view.getTop()))
        {
            x.a(view, new <init>(a, view, flag));
        } else
        if (flag && a.c != null)
        {
            a.c.a();
            return;
        }
    }

    public final boolean a(View view)
    {
        b = view.getLeft();
        return true;
    }

    public final int b(View view)
    {
        return view.getWidth();
    }

    public final void b(View view, int i)
    {
        float f1 = (float)view.getWidth() * a.f;
        float f2 = (float)view.getWidth() * a.g;
        if ((float)i <= f1)
        {
            x.c(view, 1.0F);
            return;
        }
        if ((float)i >= f2)
        {
            x.c(view, 0.0F);
            return;
        } else
        {
            x.c(view, f.a(1.0F - ((float)i - f1) / (f2 - f1)));
            return;
        }
    }

    public final int c(View view)
    {
        return view.getTop();
    }

    (f f1)
    {
        a = f1;
        super();
    }
}
