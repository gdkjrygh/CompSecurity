// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package crittercism.android:
//            di, au, dw, dq, 
//            az, dt

public final class dl extends di
{

    public Map a;
    private dw b;
    private au c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    public dl(au au1)
    {
        a = new HashMap();
        d = false;
        e = false;
        f = false;
        g = false;
        c = au1;
        b = au1.l();
    }

    private void a(String s, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        a.put(s, obj);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void a()
    {
        boolean flag2 = false;
        boolean flag = b.b();
        if (d)
        {
            a("optOutStatus", Boolean.valueOf(flag));
        }
        if (!flag)
        {
            if (e)
            {
                a("crashedOnLastLoad", Boolean.valueOf(dq.a));
            }
            if (f)
            {
                a("userUUID", c.c());
            }
            if (g)
            {
                dt dt1 = az.A().B;
                if (dt1 != null)
                {
                    boolean flag1 = flag2;
                    if (dt1.a.getBoolean("rateMyAppEnabled", false))
                    {
                        flag1 = flag2;
                        if (!dt1.a.getBoolean("hasRatedApp", false))
                        {
                            int i = dt1.a();
                            int j = dt1.a.getInt("rateAfterNumLoads", 5);
                            flag1 = flag2;
                            if (i >= j)
                            {
                                flag1 = flag2;
                                if ((i - j) % dt1.a.getInt("remindAfterNumLoads", 5) == 0)
                                {
                                    flag1 = true;
                                }
                            }
                        }
                    }
                    a("shouldShowRateAppAlert", Boolean.valueOf(flag1));
                    a("message", dt1.b());
                    a("title", dt1.c());
                }
            }
        }
    }

    public final void b()
    {
        d = true;
    }

    public final void c()
    {
        e = true;
    }

    public final void d()
    {
        f = true;
    }

    public final void e()
    {
        g = true;
    }
}
