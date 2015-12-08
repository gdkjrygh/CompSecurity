// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.app.Activity;
import com.pandora.android.PandoraService;

// Referenced classes of package com.pandora.android.ads:
//            h

public class com.pandora.android.ads.a
{
    public static interface a
    {

        public abstract int a();
    }


    Activity a;
    h b;
    int c;
    int d;
    com.pandora.radio.data.a e;
    private long f;
    private a g;

    public com.pandora.android.ads.a(a a1, Activity activity, h h, int i, int j)
    {
        f = System.currentTimeMillis();
        g = a1;
        a = activity;
        b = h;
        c = i;
        d = j;
    }

    private void a(String s)
    {
        p.df.a.c("AdActivityInfo", "ADMANAGER [%s] %s", new Object[] {
            Integer.valueOf(hashCode()), s
        });
    }

    private void a(String s, String s1)
    {
        a(s, s1, ((Exception) (null)));
    }

    private void a(String s, String s1, Exception exception)
    {
        p.df.a.a("AdActivityInfo", exception, "ADMANAGER [interaction=%s] - %s", new Object[] {
            s, s1
        });
    }

    public void a()
    {
        if (c == -1 || c != g.a())
        {
            a("not ready - skipping clearAdRefreshPauseTime");
            return;
        } else
        {
            f = System.currentTimeMillis();
            return;
        }
    }

    public void a(long l)
    {
        f = System.currentTimeMillis() + l;
    }

    public void a(String s, boolean flag, int i)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        i = 20;
_L4:
        a(s, String.format("will ignore new banner rotate requests for %s seconds", new Object[] {
            Integer.valueOf(i)
        }));
        long l = System.currentTimeMillis() + (long)(i * 1000);
        if (l > f)
        {
            f = l;
        }
        return;
_L2:
        if (PandoraService.b())
        {
            a("Banner Ad Test mode ON, refresh in 1 sec");
            i = 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean b()
    {
        return System.currentTimeMillis() >= f;
    }
}
