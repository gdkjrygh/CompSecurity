// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import a.a;
import javax.inject.Provider;
import kik.a.e.w;

// Referenced classes of package kik.android.widget.preferences:
//            HelpPreference

public final class g
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;

    private g(a a1, Provider provider)
    {
        if (!a && a1 == null)
        {
            throw new AssertionError();
        }
        b = a1;
        if (!a && provider == null)
        {
            throw new AssertionError();
        } else
        {
            c = provider;
            return;
        }
    }

    public static a a(a a1, Provider provider)
    {
        return new g(a1, provider);
    }

    public final void a(Object obj)
    {
        obj = (HelpPreference)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.a = (w)c.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/widget/preferences/g.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
