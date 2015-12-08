// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import com.pandora.android.activity.d;
import com.pandora.android.activity.i;

// Referenced classes of package p.ca:
//            x

public class y
{

    private i a;
    private d b;

    public y()
    {
        a = null;
        b = null;
    }

    private void a(x x, boolean flag)
    {
        if (a != null)
        {
            a.a(x, flag);
        }
    }

    private boolean g()
    {
        if (a != null)
        {
            return a.ad();
        } else
        {
            return false;
        }
    }

    public int a(x x)
    {
        if (b != null)
        {
            return b.a(x);
        } else
        {
            a(x, false);
            return -1;
        }
    }

    public void a()
    {
        a = null;
        b = null;
    }

    public void a(int j)
    {
        if (a != null)
        {
            a.e(j);
        }
    }

    public void a(Activity activity)
    {
        if (activity instanceof d)
        {
            b = (d)activity;
        } else
        if (activity instanceof i)
        {
            a = (i)activity;
            return;
        }
    }

    public void b()
    {
        if (b != null)
        {
            b.r();
            return;
        } else
        {
            g();
            return;
        }
    }

    public void b(int j)
    {
        if (a != null)
        {
            a.f(j);
        }
    }

    public void c()
    {
        if (b != null)
        {
            b.ae();
        } else
        if (a != null)
        {
            a.ae();
            return;
        }
    }

    public void d()
    {
        if (b != null)
        {
            b.ag();
        } else
        if (a != null)
        {
            a.af();
            return;
        }
    }

    public x e()
    {
        if (a != null)
        {
            return a.ag();
        } else
        {
            return null;
        }
    }

    public void f()
    {
        if (a != null)
        {
            a.v();
        }
    }
}
