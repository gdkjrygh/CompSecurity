// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;

public abstract class af extends jz
{

    private final aa b;
    private ah c;
    private Fragment d;

    public af(aa aa1)
    {
        c = null;
        d = null;
        b = aa1;
    }

    private static String a(int i, long l)
    {
        return (new StringBuilder("android:switcher:")).append(i).append(":").append(l).toString();
    }

    public final Parcelable a()
    {
        return null;
    }

    public abstract Fragment a(int i);

    public final Object a(ViewGroup viewgroup, int i)
    {
        if (c == null)
        {
            c = b.a();
        }
        long l = i;
        Object obj = a(viewgroup.getId(), l);
        obj = b.a(((String) (obj)));
        if (obj != null)
        {
            c.c(((Fragment) (obj)));
            viewgroup = ((ViewGroup) (obj));
        } else
        {
            Fragment fragment = a(i);
            c.a(viewgroup.getId(), fragment, a(viewgroup.getId(), l));
            viewgroup = fragment;
        }
        if (viewgroup != d)
        {
            viewgroup.b(false);
            viewgroup.c_(false);
        }
        return viewgroup;
    }

    public final void a(ViewGroup viewgroup)
    {
        if (c != null)
        {
            c.d();
            c = null;
            b.b();
        }
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        if (c == null)
        {
            c = b.a();
        }
        c.b((Fragment)obj);
    }

    public final boolean a(View view, Object obj)
    {
        return ((Fragment)obj).M == view;
    }

    public final void b(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (Fragment)obj;
        if (viewgroup != d)
        {
            if (d != null)
            {
                d.b(false);
                d.c_(false);
            }
            if (viewgroup != null)
            {
                viewgroup.b(true);
                viewgroup.c_(true);
            }
            d = viewgroup;
        }
    }
}
