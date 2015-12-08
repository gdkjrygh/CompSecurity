// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import android.app.Application;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package a.a.a.a:
//            c, d

final class b
{

    private final Set a = new HashSet();
    private final Application b;

    b(Application application)
    {
        b = application;
    }

    static void a(b b1)
    {
        android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks;
        for (Iterator iterator = b1.a.iterator(); iterator.hasNext(); b1.b.unregisterActivityLifecycleCallbacks(activitylifecyclecallbacks))
        {
            activitylifecyclecallbacks = (android.app.Application.ActivityLifecycleCallbacks)iterator.next();
        }

    }

    static boolean a(b b1, d d)
    {
        if (b1.b != null)
        {
            d = new c(b1, d);
            b1.b.registerActivityLifecycleCallbacks(d);
            b1.a.add(d);
            return true;
        } else
        {
            return false;
        }
    }
}
