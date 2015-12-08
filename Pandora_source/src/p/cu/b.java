// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cu;

import android.util.Log;
import p.ax.a;
import p.bd.e;
import p.bd.i;
import p.bg.bv;
import p.bg.cd;
import p.bg.t;
import p.cv.c;

// Referenced classes of package p.cu:
//            d, c

public class b
{

    i a;
    d b;
    p.cv.b c;

    protected b(p.cv.b b1, d d1)
        throws a
    {
        a = null;
        b = null;
        b = d1;
        a = d1.a(b1);
        c = b1;
    }

    public void a()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        a.k();
        return;
        a a1;
        a1;
        Log.e("App Link", "There was a problem disposing of the proxy", a1);
        return;
    }

    public void a(e e1)
    {
        a(new p.cu.c(e1, null));
    }

    public void a(e e1, c c1)
    {
        a(new p.cu.c(e1, c1));
    }

    public void a(p.bf.a a1)
    {
        if (c != null)
        {
            c.b(a1);
        }
    }

    protected void a(p.cu.c c1)
    {
        c1 = c.b(c1);
        if (c1 == null || a == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        a.a(c1);
        return;
        c1;
        p.df.a.b("AppLink", "Could not send request", c1);
        return;
    }

    public boolean b()
    {
        if (a != null)
        {
            return a.e().booleanValue();
        } else
        {
            return false;
        }
    }

    public t c()
    {
        t t = null;
        if (a != null)
        {
            try
            {
                t = a.b();
            }
            catch (a a1)
            {
                Log.i("AppLink", "Can't get the display capabilities", a1);
                return null;
            }
        }
        return t;
    }

    public bv d()
    {
        bv bv = null;
        try
        {
            if (a != null)
            {
                bv = a.c();
            }
        }
        catch (a a1)
        {
            return null;
        }
        return bv;
    }

    public void e()
        throws a
    {
        if (a != null)
        {
            a.a();
        }
    }

    public cd f()
    {
        cd cd = null;
        try
        {
            if (a != null)
            {
                cd = a.d();
            }
        }
        catch (a a1)
        {
            return null;
        }
        return cd;
    }
}
