// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.fragments.chat.ChatFragment;
import javax.inject.Provider;

public final class xl
    implements afq
{

    private static boolean e;
    private final afq a;
    private final Provider b;
    private final Provider c;
    private final Provider d;

    private xl(afq afq1, Provider provider, Provider provider1, Provider provider2)
    {
        if (!e && afq1 == null)
        {
            throw new AssertionError();
        }
        a = afq1;
        if (!e && provider == null)
        {
            throw new AssertionError();
        }
        b = provider;
        if (!e && provider1 == null)
        {
            throw new AssertionError();
        }
        c = provider1;
        if (!e && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = provider2;
            return;
        }
    }

    public static afq a(afq afq1, Provider provider, Provider provider1, Provider provider2)
    {
        return new xl(afq1, provider, provider1, provider2);
    }

    public final void a(Object obj)
    {
        obj = (ChatFragment)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            a.a(obj);
            obj.h = (sf)b.get();
            obj.i = (sl)c.get();
            obj.j = (si)d.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!xl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }
}
