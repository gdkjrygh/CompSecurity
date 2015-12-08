// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.t;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.app:
//            m, Fragment, q

public abstract class o extends t
{

    private final m a;
    private q b;
    private Fragment c;

    public o(m m1)
    {
        b = null;
        c = null;
        a = m1;
    }

    private static String a(int i, long l)
    {
        return (new StringBuilder("android:switcher:")).append(i).append(":").append(l).toString();
    }

    public abstract Fragment a(int i);

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        if (b == null)
        {
            b = a.a();
        }
        b.b((Fragment)obj);
    }

    public void finishUpdate(ViewGroup viewgroup)
    {
        if (b != null)
        {
            b.d();
            b = null;
            a.b();
        }
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        if (b == null)
        {
            b = a.a();
        }
        long l = i;
        Object obj = a(viewgroup.getId(), l);
        obj = a.a(((String) (obj)));
        if (obj != null)
        {
            b.c(((Fragment) (obj)));
            viewgroup = ((ViewGroup) (obj));
        } else
        {
            Fragment fragment = a(i);
            b.a(viewgroup.getId(), fragment, a(viewgroup.getId(), l));
            viewgroup = fragment;
        }
        if (viewgroup != c)
        {
            viewgroup.setMenuVisibility(false);
            viewgroup.setUserVisibleHint(false);
        }
        return viewgroup;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return ((Fragment)obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }

    public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (Fragment)obj;
        if (viewgroup != c)
        {
            if (c != null)
            {
                c.setMenuVisibility(false);
                c.setUserVisibleHint(false);
            }
            if (viewgroup != null)
            {
                viewgroup.setMenuVisibility(true);
                viewgroup.setUserVisibleHint(true);
            }
            c = viewgroup;
        }
    }

    public void startUpdate(ViewGroup viewgroup)
    {
    }
}
