// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.support.v4.content.k;
import com.facebook.internal.aw;
import com.facebook.internal.bc;
import java.util.Date;

// Referenced classes of package com.facebook:
//            q, b, AccessToken, g, 
//            e

final class d
{

    private static volatile d a;
    private final k b;
    private final b c;
    private AccessToken d;
    private e e;
    private Date f;

    private d(k k1, b b1)
    {
        f = new Date(0L);
        bc.a(k1, "localBroadcastManager");
        bc.a(b1, "accessTokenCache");
        b = k1;
        c = b1;
    }

    static d a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/facebook/d;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new d(k.a(q.f()), new b());
        }
        com/facebook/d;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/facebook/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static e a(d d1)
    {
        return d1.e;
    }

    static Date a(d d1, Date date)
    {
        d1.f = date;
        return date;
    }

    private void a(AccessToken accesstoken, boolean flag)
    {
        AccessToken accesstoken1 = d;
        d = accesstoken;
        e = null;
        f = new Date(0L);
        if (flag)
        {
            if (accesstoken != null)
            {
                c.a(accesstoken);
            } else
            {
                c.b();
            }
        }
        if (!aw.a(accesstoken1, accesstoken))
        {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accesstoken1);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accesstoken);
            b.a(intent);
        }
    }

    static e b(d d1)
    {
        d1.e = null;
        return null;
    }

    final void a(AccessToken accesstoken)
    {
        a(accesstoken, true);
    }

    final AccessToken b()
    {
        return d;
    }

    final boolean c()
    {
        boolean flag = false;
        AccessToken accesstoken = c.a();
        if (accesstoken != null)
        {
            a(accesstoken, false);
            flag = true;
        }
        return flag;
    }

    final void d()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (d != null)
        {
            if (e != null)
            {
                flag = flag1;
            } else
            {
                Long long1 = Long.valueOf((new Date()).getTime());
                flag = flag1;
                if (d.d().a())
                {
                    flag = flag1;
                    if (long1.longValue() - f.getTime() > 0x36ee80L)
                    {
                        flag = flag1;
                        if (long1.longValue() - d.e().getTime() > 0x5265c00L)
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        if (!flag)
        {
            return;
        } else
        {
            e = new e(this, d);
            e.a();
            return;
        }
    }
}
