// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.viewercontext;

import android.app.Application;
import android.content.Context;
import com.facebook.auth.b.a;
import com.google.common.base.Preconditions;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.facebook.auth.viewercontext:
//            e, g, ViewerContext

public class f
    implements e
{

    private final a a;
    private final Context b;
    private ViewerContext c;
    private ThreadLocal d;
    private ViewerContext e;

    public f(a a1, Context context)
    {
        d = new g(this);
        a = a1;
        b = context;
    }

    private ViewerContext e()
    {
        List list = (List)d.get();
        if (!list.isEmpty())
        {
            return (ViewerContext)list.get(list.size() - 1);
        }
        if (e != null)
        {
            return e;
        } else
        {
            return a.a();
        }
    }

    public ViewerContext a()
    {
        return e;
    }

    public void a(ViewerContext viewercontext)
    {
        boolean flag;
        if (!(b instanceof Application))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannot override viewer context on the application context");
        e = viewercontext;
    }

    public ViewerContext b()
    {
        return c;
    }

    public void b(ViewerContext viewercontext)
    {
        ((List)d.get()).add(viewercontext);
    }

    public ViewerContext c()
    {
        ViewerContext viewercontext = e();
        if (c == null)
        {
            c = viewercontext;
        }
        return viewercontext;
    }

    public void d()
    {
        List list = (List)d.get();
        if (list.isEmpty())
        {
            throw new NoSuchElementException();
        } else
        {
            list.remove(list.size() - 1);
            return;
        }
    }
}
