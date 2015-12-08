// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.i;

import a.a;
import com.kik.l.ab;
import javax.inject.Provider;

// Referenced classes of package kik.android.i:
//            i

public final class k
    implements a
{

    static final boolean a;
    private final Provider b;
    private final Provider c;

    private k(Provider provider, Provider provider1)
    {
        if (!a && provider == null)
        {
            throw new AssertionError();
        }
        b = provider;
        if (!a && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = provider1;
            return;
        }
    }

    public static a a(Provider provider, Provider provider1)
    {
        return new k(provider, provider1);
    }

    public final void a(Object obj)
    {
        obj = (i)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            obj.a = (ab)b.get();
            obj.b = (com.kik.android.a)c.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/i/k.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
