// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.os.ConditionVariable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package crittercism.android:
//            z, at, ao

public final class aa
    implements z
{

    private ConditionVariable a;
    private Map b;
    private at c;

    public aa(ConditionVariable conditionvariable, at at1)
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
            ao ao1 = c.a();
            if (ao1 != null)
            {
                b.put("userUUID", ao1.a);
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
