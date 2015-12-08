// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package b.a.a.a:
//            b

public final class b.a.a.a.a
{
    private static final class a
    {

        private final Set a = new HashSet();
        private final Application b;

        static boolean a(a a1, b b1)
        {
            if (a1.b != null)
            {
                b1 = new b.a.a.a.b(a1, b1);
                a1.b.registerActivityLifecycleCallbacks(b1);
                a1.a.add(b1);
                return true;
            } else
            {
                return false;
            }
        }

        a(Application application)
        {
            b = application;
        }
    }

    public static abstract class b
    {

        public void a(Activity activity)
        {
        }

        public void b(Activity activity)
        {
        }

        public void c(Activity activity)
        {
        }

        public b()
        {
        }
    }


    private final Application a;
    private a b;

    public b.a.a.a.a(Context context)
    {
        a = (Application)context.getApplicationContext();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new a(a);
        }
    }

    public final boolean a(b b1)
    {
        return b != null && a.a(b, b1);
    }
}
