// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.os.ConditionVariable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package crittercism.android:
//            z, at, aq

public final class ac
    implements z
{

    private ConditionVariable a;
    private Map b;
    private at c;

    public ac(ConditionVariable conditionvariable, at at1)
    {
        a = conditionvariable;
        b = new HashMap();
        c = at1;
    }

    public final void a()
    {
        a.block();
        if (!c.d())
        {
            aq aq1 = c.e();
            if (aq1 != null)
            {
                boolean flag;
                if (aq1.a && !aq1.b && aq1.c >= aq1.d && (aq1.c - aq1.d) % aq1.e == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b.put("shouldShowRateAppAlert", Boolean.valueOf(flag));
                if (flag)
                {
                    b.put("message", aq1.f);
                    b.put("title", aq1.g);
                }
            }
        }
    }

    public final void b()
    {
        a.open();
    }

    public final Map c()
    {
        return b;
    }
}
