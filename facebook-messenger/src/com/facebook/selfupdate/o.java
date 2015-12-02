// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.text.TextUtils;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.e.h;

// Referenced classes of package com.facebook.selfupdate:
//            p

public class o
{

    private final av a;
    private final h b;

    public o(av av1, h h1)
    {
        a = av1;
        b = h1;
    }

    private cb a()
    {
        cb cb1 = new cb("self_update");
        cb1.e("self_update");
        return cb1;
    }

    private void b(Object obj, p p1, String s)
    {
        if (obj != null && p1 != null)
        {
            p1 = new StringBuilder(p1.toString());
            if (!TextUtils.isEmpty(s))
            {
                p1.append('=').append(s);
            }
            s = a();
            s.b(obj.getClass().getSimpleName(), p1.toString());
            a.b(s);
        }
    }

    public void a(Object obj, p p1)
    {
        b(obj, p1, null);
    }

    public void a(Object obj, p p1, String s)
    {
        b(obj, p1, s);
    }

    public void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            b.a("SelfUpdateService", s);
        }
    }

    public void a(String s, Exception exception)
    {
label0:
        {
            if (!TextUtils.isEmpty(s))
            {
                if (exception != null)
                {
                    break label0;
                }
                b.a("SelfUpdateService", s);
            }
            return;
        }
        b.a("SelfUpdateService", s, exception);
    }

    public void b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            b.b("SelfUpdateService", s);
        }
    }
}
