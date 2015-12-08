// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.c;

import android.view.View;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.d;
import com.roidapp.cloudlib.sns.i;
import com.roidapp.cloudlib.sns.login.a;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.cloudlib.sns.c:
//            c

final class e extends aa
{

    private WeakReference a;

    private e(c c1)
    {
        a = new WeakReference(c1);
    }

    e(c c1, byte byte0)
    {
        this(c1);
    }

    public final void b(int j, Exception exception)
    {
        super.b(j, exception);
        exception = (c)a.get();
        if (exception != null)
        {
            com.roidapp.cloudlib.sns.c.c.b(exception);
            com.roidapp.cloudlib.sns.c.c.f(exception);
            if (com.roidapp.cloudlib.sns.c.c.c(exception) != null)
            {
                if (com.roidapp.cloudlib.sns.c.c.c(exception).isEmpty())
                {
                    if (com.roidapp.cloudlib.sns.c.c.g(exception) != null && com.roidapp.cloudlib.sns.c.c.g(exception).getVisibility() != 0)
                    {
                        com.roidapp.cloudlib.sns.c.c.g(exception).setVisibility(0);
                        return;
                    }
                } else
                {
                    exception.v().a(exception.getString(at.t));
                    return;
                }
            }
        }
    }

    public final void b(Object obj)
    {
        obj = (d)obj;
        super.b(obj);
        if (obj != null)
        {
            c c1 = (c)a.get();
            if (c1 != null && com.roidapp.cloudlib.sns.c.c.h(c1) && com.roidapp.cloudlib.sns.c.c.c(c1) != null)
            {
                com.roidapp.cloudlib.sns.c.c.a(c1, ((d) (obj)).a);
                com.roidapp.cloudlib.sns.c.c.c(c1).a(((java.util.List) (obj)));
                com.roidapp.cloudlib.sns.c.c.d(c1);
                if (com.roidapp.cloudlib.sns.c.c.e(c1) != null)
                {
                    com.roidapp.cloudlib.sns.c.c.c(c1).notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    public final void c(Object obj)
    {
        obj = (d)obj;
        if (obj == null)
        {
            b(-1, null);
        } else
        {
            super.c(obj);
            c c1 = (c)a.get();
            if (c1 != null && com.roidapp.cloudlib.sns.c.c.a(c1))
            {
                com.roidapp.cloudlib.sns.c.c.b(c1);
                if (com.roidapp.cloudlib.sns.c.c.c(c1) != null)
                {
                    com.roidapp.cloudlib.sns.c.c.a(c1, ((d) (obj)).a);
                    com.roidapp.cloudlib.sns.c.c.c(c1).a(((java.util.List) (obj)));
                    com.roidapp.cloudlib.sns.c.c.d(c1);
                    if (com.roidapp.cloudlib.sns.c.c.e(c1) != null)
                    {
                        com.roidapp.cloudlib.sns.c.c.c(c1).notifyDataSetChanged();
                        return;
                    }
                }
            }
        }
    }
}
