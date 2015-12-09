// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.Activity;
import android.os.Bundle;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.activity.InterstitialAnnouncementActivity;
import com.pandora.android.activity.p;
import com.pandora.android.ads.g;
import com.pandora.android.data.l;
import com.pandora.radio.data.o;
import com.pandora.radio.util.b;
import java.security.InvalidParameterException;
import java.util.Map;
import p.cm.u;
import p.cw.c;
import p.dd.an;
import p.dd.ba;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            s

public class k extends b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/pandora/android/util/k$a, s1);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("FOREGROUND", 0);
            b = new a("LOGIN", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s1, int i)
        {
            super(s1, i);
        }
    }


    private static volatile k a;
    private static final boolean b;
    private boolean c;
    private p.cx.e.a d;
    private boolean e;
    private Map f;
    private boolean g;

    private k()
    {
        c = true;
        g = false;
        com.pandora.android.provider.b.a.b().b(this);
    }

    public static k a()
    {
        if (a == null)
        {
            a = new k();
        }
        return a;
    }

    private boolean a(Activity activity, a a1)
    {
        activity = com.pandora.android.provider.b.a.b().j();
        return b && d == p.cx.e.a.b && !com.pandora.android.provider.b.a.b().C() && !activity.i() && f();
    }

    private static boolean b(BaseFragmentActivity basefragmentactivity, a a1)
    {
        while (!basefragmentactivity.a(a1) || (basefragmentactivity instanceof p) || com.pandora.android.activity.b.a().b(basefragmentactivity)) 
        {
            return false;
        }
        return true;
    }

    private boolean f()
    {
        return false;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public boolean a(BaseFragmentActivity basefragmentactivity, a a1)
    {
        p.df.a.a("InterstitialManager", "interstitial opportunity");
        boolean flag1;
        if (!b(basefragmentactivity, a1))
        {
            flag1 = false;
        } else
        {
            if (com.pandora.android.provider.b.a.d() == null)
            {
                return false;
            }
            boolean flag = false;
            o o1 = com.pandora.android.provider.b.a.b().j();
            if (a(((Activity) (basefragmentactivity)), a1))
            {
                Bundle bundle = new Bundle();
                if (d())
                {
                    a1 = new l(new com.pandora.radio.data.b(), null, p.cp.b.g(), 0, com.pandora.android.data.l.a.a, null);
                } else
                {
                    a1 = new l(new com.pandora.radio.data.b(), p.cp.b.f(), null, 0, com.pandora.android.data.l.a.a, null);
                }
                bundle.putSerializable("LANDING_PAGE_DATA", a1);
                com.pandora.android.activity.c.a().a(basefragmentactivity, com/pandora/android/activity/InterstitialAnnouncementActivity, 0, bundle, 0);
                o1.j();
                flag = true;
            } else
            if (com.pandora.android.ads.c.b().n())
            {
                o1.n();
                (new u()).execute(new Object[0]);
                flag = true;
            }
            flag1 = flag;
            if (o1.g())
            {
                o1.h();
                return flag;
            }
        }
        return flag1;
    }

    public void b(boolean flag)
    {
        e = flag;
    }

    public boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (c)
        {
            flag = flag1;
            if (d == p.cx.e.a.b)
            {
                c = false;
                flag = true;
            }
        }
        return flag;
    }

    public boolean c()
    {
        return g;
    }

    public boolean d()
    {
        return e;
    }

    public Map e()
    {
        return f;
    }

    public void onSignInState(an an1)
    {
        d = an1.b;
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
                    a[p.cx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.util._cls1.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 3: // '\003'
            c = true;
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
            return;
        }
    }

    public void onThirdPartyTrackingUrls(ba ba1)
    {
        f = ba1.a;
    }

    static 
    {
        boolean flag;
        if (!com.pandora.android.util.s.u())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
