// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import a.a;
import com.kik.cache.ad;
import javax.inject.Provider;

// Referenced classes of package kik.android.chat.fragment:
//            MissedConversationsFragment

public final class qk
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;

    private qk(a a1, Provider provider)
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
        return new qk(a1, provider);
    }

    public final void a(Object obj)
    {
        obj = (MissedConversationsFragment)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.l = (ad)c.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/fragment/qk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
