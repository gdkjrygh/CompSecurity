// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.v4.f.m;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            ai, am, aj, Fragment

public class ah
{

    private final ai a;

    private ah(ai ai1)
    {
        a = ai1;
    }

    public static final ah a(ai ai1)
    {
        return new ah(ai1);
    }

    public aj a()
    {
        return a.i();
    }

    public View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        return a.d.a(view, s1, context, attributeset);
    }

    public List a(List list)
    {
        if (a.d.f == null)
        {
            return null;
        }
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList(b());
        }
        ((List) (obj)).addAll(a.d.f);
        return ((List) (obj));
    }

    public void a(Configuration configuration)
    {
        a.d.a(configuration);
    }

    public void a(Parcelable parcelable, List list)
    {
        a.d.a(parcelable, list);
    }

    public void a(Fragment fragment)
    {
        a.d.a(a, a, fragment);
    }

    public void a(m m1)
    {
        a.a(m1);
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        a.b(s1, filedescriptor, printwriter, as);
    }

    public void a(boolean flag)
    {
        a.a(flag);
    }

    public boolean a(Menu menu)
    {
        return a.d.a(menu);
    }

    public boolean a(Menu menu, MenuInflater menuinflater)
    {
        return a.d.a(menu, menuinflater);
    }

    public boolean a(MenuItem menuitem)
    {
        return a.d.a(menuitem);
    }

    public int b()
    {
        ArrayList arraylist = a.d.f;
        if (arraylist == null)
        {
            return 0;
        } else
        {
            return arraylist.size();
        }
    }

    public void b(Menu menu)
    {
        a.d.b(menu);
    }

    public boolean b(MenuItem menuitem)
    {
        return a.d.b(menuitem);
    }

    public void c()
    {
        a.d.k();
    }

    public Parcelable d()
    {
        return a.d.j();
    }

    public List e()
    {
        return a.d.i();
    }

    public void f()
    {
        a.d.l();
    }

    public void g()
    {
        a.d.m();
    }

    public void h()
    {
        a.d.n();
    }

    public void i()
    {
        a.d.o();
    }

    public void j()
    {
        a.d.p();
    }

    public void k()
    {
        a.d.q();
    }

    public void l()
    {
        a.d.r();
    }

    public void m()
    {
        a.d.t();
    }

    public void n()
    {
        a.d.u();
    }

    public boolean o()
    {
        return a.d.g();
    }

    public void p()
    {
        a.j();
    }

    public void q()
    {
        a.k();
    }

    public void r()
    {
        a.l();
    }

    public m s()
    {
        return a.m();
    }
}
