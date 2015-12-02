// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.g;

import com.facebook.analytics.am;
import com.facebook.debug.log.b;
import java.util.Random;

// Referenced classes of package com.facebook.analytics.g:
//            e

public class f
    implements e
{

    private Random a;

    public f()
    {
        a = new Random();
    }

    public boolean a(am am1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (am1.a("throttle_sample"))
        {
            double d;
            try
            {
                d = Double.parseDouble(am1.b("throttle_sample"));
            }
            // Misplaced declaration of an exception variable
            catch (am am1)
            {
                b.a("Invalid throttle duration tag.", am1);
                return false;
            }
            flag = flag1;
            if (a.nextDouble() <= d)
            {
                flag = true;
            }
        }
        return flag;
    }
}
