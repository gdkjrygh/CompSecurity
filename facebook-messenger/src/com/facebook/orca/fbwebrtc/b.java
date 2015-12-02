// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.common.l.h;
import com.facebook.config.a.d;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import javax.inject.a;

public class b
    implements a
{

    public static final ae a = n.a("messenger_voip_android");
    public static final ae b = n.a("fb4a_voip_android");
    private final com.facebook.prefs.shared.d c;
    private final com.facebook.config.a.a d;
    private final boolean e;

    public b(h h1, com.facebook.prefs.shared.d d1, com.facebook.config.a.a a1)
    {
        c = d1;
        d = a1;
        e = "true".equals(h1.a("com.facebook.vi"));
    }

    public Boolean a()
    {
        boolean flag1 = false;
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            return Boolean.valueOf(false);
        }
        if (d.i() == d.MESSENGER)
        {
            return Boolean.valueOf(c.a(a, false));
        }
        if (d.i() == d.FB4A)
        {
            boolean flag = flag1;
            if (e)
            {
                flag = flag1;
                if (c.a(b, false))
                {
                    flag = true;
                }
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public Object b()
    {
        return a();
    }

}
