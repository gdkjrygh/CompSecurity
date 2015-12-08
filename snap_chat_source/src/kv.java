// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.LandingPageActivity;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

public final class kv
    implements afq
{

    private static boolean f;
    private final afq a;
    private final Provider b;
    private final Provider c;
    private final Provider d;
    private final Provider e;

    private kv(afq afq1, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!f && afq1 == null)
        {
            throw new AssertionError();
        }
        a = afq1;
        if (!f && provider == null)
        {
            throw new AssertionError();
        }
        b = provider;
        if (!f && provider1 == null)
        {
            throw new AssertionError();
        }
        c = provider1;
        if (!f && provider2 == null)
        {
            throw new AssertionError();
        }
        d = provider2;
        if (!f && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            e = provider3;
            return;
        }
    }

    public static afq a(afq afq1, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new kv(afq1, provider, provider1, provider2, provider3);
    }

    public final void a(Object obj)
    {
        obj = (LandingPageActivity)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            a.a(obj);
            b.get();
            obj.d = (Fh)c.get();
            obj.e = (Bs)d.get();
            obj.f = (ExecutorService)e.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kv.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
