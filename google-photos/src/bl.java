// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class bl extends md
{

    private final ay b;
    private bp c;
    private am d;

    public bl(ay ay1)
    {
        c = null;
        d = null;
        b = ay1;
    }

    private static String a(int i, long l)
    {
        return (new StringBuilder("android:switcher:")).append(i).append(":").append(l).toString();
    }

    public abstract am a(int i);

    public Object a(ViewGroup viewgroup, int i)
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
            c.e(((am) (obj)));
            viewgroup = ((ViewGroup) (obj));
        } else
        {
            am am1 = a(i);
            c.a(viewgroup.getId(), am1, a(viewgroup.getId(), l));
            viewgroup = am1;
        }
        if (viewgroup != d)
        {
            viewgroup.e(false);
            viewgroup.g_(false);
        }
        return viewgroup;
    }

    public final void a(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public void a(ViewGroup viewgroup)
    {
        if (c != null)
        {
            c.c();
            c = null;
            b.b();
        }
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        if (c == null)
        {
            c = b.a();
        }
        c.d((am)obj);
    }

    public final boolean a(View view, Object obj)
    {
        return ((am)obj).R == view;
    }

    public final Parcelable af_()
    {
        return null;
    }

    public final void b(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (am)obj;
        if (viewgroup != d)
        {
            if (d != null)
            {
                d.e(false);
                d.g_(false);
            }
            if (viewgroup != null)
            {
                viewgroup.e(true);
                viewgroup.g_(true);
            }
            d = viewgroup;
        }
    }
}
