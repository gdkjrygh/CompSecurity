// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.os.ConditionVariable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package crittercism.android:
//            z, at, an

public final class y
    implements z
{

    private ConditionVariable a;
    private Map b;
    private at c;

    public y(ConditionVariable conditionvariable, at at1)
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
            an an1 = c.b();
            if (an1 != null)
            {
                b.put("didCrashOnLastAppLoad", Boolean.valueOf(an1.a));
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
