// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import a.a;
import javax.inject.Provider;
import kik.a.e.f;

// Referenced classes of package kik.android.chat.activity:
//            KikIqActivityBase

public final class aj
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;

    private aj(a a1, Provider provider)
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
        return new aj(a1, provider);
    }

    public final void a(Object obj)
    {
        obj = (KikIqActivityBase)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.j = (f)c.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/activity/aj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
