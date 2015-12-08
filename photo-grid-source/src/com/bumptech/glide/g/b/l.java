// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.b;

import android.view.View;
import com.bumptech.glide.g.c;

// Referenced classes of package com.bumptech.glide.g.b:
//            a, m, h

public abstract class l extends a
{

    private static boolean b = false;
    private static Integer c = null;
    protected final View a;
    private final m d;

    public l(View view)
    {
        if (view == null)
        {
            throw new NullPointerException("View must not be null!");
        } else
        {
            a = view;
            d = new m(view);
            return;
        }
    }

    public static void f()
    {
        if (c != null || b)
        {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        } else
        {
            c = Integer.valueOf(0x7f0d0002);
            return;
        }
    }

    public final View a()
    {
        return a;
    }

    public final void a(h h)
    {
        d.a(h);
    }

    public final void a(c c1)
    {
        if (c == null)
        {
            b = true;
            a.setTag(c1);
            return;
        } else
        {
            a.setTag(c.intValue(), c1);
            return;
        }
    }

    public final c e()
    {
        Object obj;
        if (c == null)
        {
            obj = a.getTag();
        } else
        {
            obj = a.getTag(c.intValue());
        }
        if (obj != null)
        {
            if (obj instanceof c)
            {
                return (c)obj;
            } else
            {
                throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            }
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder("Target for: ")).append(a).toString();
    }

}
