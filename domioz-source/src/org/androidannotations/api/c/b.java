// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.content.SharedPreferences;

// Referenced classes of package org.androidannotations.api.c:
//            m

public abstract class b
{

    protected final Object a;
    protected final SharedPreferences b;
    protected final String c;

    public b(SharedPreferences sharedpreferences, String s, Object obj)
    {
        b = sharedpreferences;
        c = s;
        a = obj;
    }

    public abstract Object a(Object obj);

    public final boolean a()
    {
        return b.contains(c);
    }

    public final String b()
    {
        return c;
    }

    public final void b(Object obj)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = a;
        }
        c(obj1);
    }

    public final Object c()
    {
        return a(a);
    }

    protected abstract void c(Object obj);

    public final void d()
    {
        m.a(e().remove(c));
    }

    protected final android.content.SharedPreferences.Editor e()
    {
        return b.edit();
    }
}
