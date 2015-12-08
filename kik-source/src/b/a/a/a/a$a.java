// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.app.Application;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package b.a.a.a:
//            a, b

private static final class b
{

    private final Set a = new HashSet();
    private final Application b;

    static boolean a(ject ject, ject ject1)
    {
        if (ject.b != null)
        {
            ject1 = new b(ject, ject1);
            ject.b.registerActivityLifecycleCallbacks(ject1);
            ject.a.add(ject1);
            return true;
        } else
        {
            return false;
        }
    }

    Application(Application application)
    {
        b = application;
    }
}
