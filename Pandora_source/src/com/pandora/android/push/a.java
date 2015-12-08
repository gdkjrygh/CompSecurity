// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.push;

import com.pandora.android.provider.b;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.n;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.List;
import p.cw.c;
import p.dd.an;

// Referenced classes of package com.pandora.android.push:
//            b

public class com.pandora.android.push.a
{
    private static class a
    {

        public static com.pandora.android.push.a a = new com.pandora.android.push.a();

    }


    private p.cx.e.a a;

    com.pandora.android.push.a()
    {
        a = p.cx.e.a.a;
    }

    public static com.pandora.android.push.a a()
    {
        return a.a;
    }

    public void a(String s, p.cx.x.a a1, p.cx.x.b b1)
    {
        if (a == p.cx.e.a.b)
        {
            (new com.pandora.android.push.b(s, null, a1, b1)).a_(new Object[0]);
            return;
        } else
        {
            b.a.b().k().a(new n(s, a1, b1, System.currentTimeMillis()));
            return;
        }
    }

    protected void b()
    {
        ag ag1 = b.a.b().k();
        if (ag1.n())
        {
            n n1;
            for (Iterator iterator = ag1.m().iterator(); iterator.hasNext(); (new com.pandora.android.push.b(n1.a(), null, n1.b(), n1.c())).a_(new Object[0]))
            {
                n1 = (n)iterator.next();
            }

            ag1.o();
        }
    }

    public void onSignInState(an an1)
    {
        a = an1.b;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 4: // '\004'
            b();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }
}
