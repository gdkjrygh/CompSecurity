// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.os.ConditionVariable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package crittercism.android:
//            z, at, ap

public final class ab
    implements z
{

    private ConditionVariable a;
    private Map b;
    private at c;

    public ab(ConditionVariable conditionvariable, at at1)
    {
        a = conditionvariable;
        b = new HashMap();
        c = at1;
    }

    public final void a()
    {
        a.block();
        ap ap1 = c.c();
        if (ap1 != null)
        {
            b.put("optOutStatus", Boolean.valueOf(ap1.a()));
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
