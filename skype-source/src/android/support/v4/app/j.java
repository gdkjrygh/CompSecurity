// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.v4.util.i;
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
//            k, m, Fragment, l, 
//            r

public final class j
{

    private final k a;

    private j(k k1)
    {
        a = k1;
    }

    public static final j a(k k1)
    {
        return new j(k1);
    }

    public final l a()
    {
        return a.d;
    }

    public final View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        return a.d.onCreateView(view, s1, context, attributeset);
    }

    public final List a(List list)
    {
        if (a.d.f == null)
        {
            return null;
        } else
        {
            list.addAll(a.d.f);
            return list;
        }
    }

    public final void a(Configuration configuration)
    {
        a.d.a(configuration);
    }

    public final void a(Parcelable parcelable, List list)
    {
        a.d.a(parcelable, list);
    }

    public final void a(i i1)
    {
        a.a(i1);
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        a.a(s1, filedescriptor, printwriter, as);
    }

    public final void a(boolean flag)
    {
        a.a(flag);
    }

    public final boolean a(Menu menu)
    {
        return a.d.a(menu);
    }

    public final boolean a(Menu menu, MenuInflater menuinflater)
    {
        return a.d.a(menu, menuinflater);
    }

    public final boolean a(MenuItem menuitem)
    {
        return a.d.a(menuitem);
    }

    public final r b()
    {
        return a.j();
    }

    public final void b(Menu menu)
    {
        a.d.b(menu);
    }

    public final boolean b(MenuItem menuitem)
    {
        return a.d.b(menuitem);
    }

    public final int c()
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

    public final void d()
    {
        a.d.a(a, a, null);
    }

    public final void e()
    {
        a.d.s = false;
    }

    public final Parcelable f()
    {
        return a.d.k();
    }

    public final List g()
    {
        m m1 = a.d;
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        if (m1.f != null)
        {
            int i1 = 0;
            do
            {
                arraylist1 = arraylist;
                if (i1 >= m1.f.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)m1.f.get(i1);
                ArrayList arraylist2 = arraylist;
                if (fragment != null)
                {
                    arraylist2 = arraylist;
                    if (fragment.mRetainInstance)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                        fragment.mRetaining = true;
                        int j1;
                        if (fragment.mTarget != null)
                        {
                            j1 = fragment.mTarget.mIndex;
                        } else
                        {
                            j1 = -1;
                        }
                        fragment.mTargetIndex = j1;
                        arraylist2 = arraylist1;
                        if (m.a)
                        {
                            (new StringBuilder("retainNonConfig: keeping retained ")).append(fragment);
                            arraylist2 = arraylist1;
                        }
                    }
                }
                i1++;
                arraylist = arraylist2;
            } while (true);
        }
        return arraylist1;
    }

    public final void h()
    {
        a.d.l();
    }

    public final void i()
    {
        a.d.m();
    }

    public final void j()
    {
        a.d.n();
    }

    public final void k()
    {
        a.d.o();
    }

    public final void l()
    {
        a.d.c(4);
    }

    public final void m()
    {
        a.d.p();
    }

    public final void n()
    {
        a.d.c(2);
    }

    public final void o()
    {
        a.d.q();
    }

    public final void p()
    {
        a.d.r();
    }

    public final boolean q()
    {
        return a.d.i();
    }

    public final void r()
    {
        a.k();
    }

    public final void s()
    {
        a.l();
    }

    public final void t()
    {
        a.m();
    }

    public final i u()
    {
        return a.n();
    }
}
