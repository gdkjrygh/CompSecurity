// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.content.Context;
import com.google.inject.a;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.facebook.inject:
//            au, o, p, ContextScoped

public class n
    implements au
{

    private final ThreadLocal a = new o(this);
    private final Context b;

    public n(Context context)
    {
        b = context;
    }

    public javax.inject.a a(a a1, javax.inject.a a2)
    {
        return new p(this, a2);
    }

    public void a()
    {
        a(b);
    }

    public void a(Context context)
    {
        ((List)a.get()).add(context);
    }

    public Class annotationType()
    {
        return com/facebook/inject/ContextScoped;
    }

    public void b()
    {
        List list = (List)a.get();
        if (list.isEmpty())
        {
            throw new NoSuchElementException();
        } else
        {
            list.remove(list.size() - 1);
            return;
        }
    }

    public Context getContext()
    {
        List list = (List)a.get();
        if (list.isEmpty())
        {
            return b;
        } else
        {
            return (Context)list.get(list.size() - 1);
        }
    }
}
