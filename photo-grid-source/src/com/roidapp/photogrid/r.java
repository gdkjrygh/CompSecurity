// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.support.v4.widget.SwipeRefreshLayout;
import com.roidapp.baselib.c.y;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.f;
import com.roidapp.cloudlib.sns.c.a;
import com.roidapp.cloudlib.sns.i;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid:
//            k, MainPage

final class r extends aa
{

    private WeakReference a;

    private r(k k1)
    {
        a = new WeakReference(k1);
    }

    r(k k1, byte byte0)
    {
        this(k1);
    }

    public final void b(int j, Exception exception)
    {
        super.b(j, exception);
        exception = (k)a.get();
        if (exception != null && !exception.isDetached())
        {
            k.m(exception);
            if (k.n(exception) != null && k.n(exception).isRefreshing())
            {
                k.n(exception).setRefreshing(false);
            }
            if ((exception.getActivity() instanceof MainPage) && ((MainPage)exception.getActivity()).a)
            {
                exception.v().a(exception.getString(0x7f07006b));
                return;
            }
        }
    }

    public final void b(Object obj)
    {
        obj = (f)obj;
        if (obj != null)
        {
            k k1 = (k)a.get();
            if (k1 != null && k.o(k1) && k.b(k1) != null)
            {
                ((a)k.b(k1).d()).a(((java.util.List) (obj)));
                if (k.c(k1) != null)
                {
                    k.b(k1).c();
                    return;
                }
            }
        }
    }

    public final void c(Object obj)
    {
        obj = (f)obj;
        if (obj == null)
        {
            b(-1, null);
        } else
        {
            k k1 = (k)a.get();
            if (k1 != null && k.l(k1))
            {
                k.m(k1);
                if (k.n(k1) != null && k.n(k1).isRefreshing())
                {
                    k.n(k1).setRefreshing(false);
                }
                if (k.b(k1) != null)
                {
                    ((a)k.b(k1).d()).a(((java.util.List) (obj)));
                    if (k.c(k1) != null)
                    {
                        k.b(k1).c();
                        return;
                    }
                }
            }
        }
    }
}
