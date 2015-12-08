// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.bi;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.app:
//            aj, ay, Fragment

public abstract class av extends bi
{

    private final aj a;
    private ay b;
    private Fragment c;

    public av(aj aj1)
    {
        b = null;
        c = null;
        a = aj1;
    }

    private static String a(int i, long l)
    {
        return (new StringBuilder()).append("android:switcher:").append(i).append(":").append(l).toString();
    }

    public Parcelable a()
    {
        return null;
    }

    public abstract Fragment a(int i);

    public Object a(ViewGroup viewgroup, int i)
    {
        if (b == null)
        {
            b = a.a();
        }
        long l = b(i);
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
            viewgroup.e(false);
            viewgroup.f(false);
        }
        return viewgroup;
    }

    public void a(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public void a(ViewGroup viewgroup)
    {
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        if (b == null)
        {
            b = a.a();
        }
        b.b((Fragment)obj);
    }

    public boolean a(View view, Object obj)
    {
        return ((Fragment)obj).r() == view;
    }

    public long b(int i)
    {
        return (long)i;
    }

    public void b(ViewGroup viewgroup)
    {
        if (b != null)
        {
            b.b();
            b = null;
            a.b();
        }
    }

    public void b(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (Fragment)obj;
        if (viewgroup != c)
        {
            if (c != null)
            {
                c.e(false);
                c.f(false);
            }
            if (viewgroup != null)
            {
                viewgroup.e(true);
                viewgroup.f(true);
            }
            c = viewgroup;
        }
    }
}
