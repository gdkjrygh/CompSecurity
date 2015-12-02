// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.b;

import android.view.View;
import java.util.WeakHashMap;

// Referenced classes of package com.nineoldandroids.b:
//            d, c, e

public abstract class b
{

    private static final WeakHashMap a = new WeakHashMap(0);

    public b()
    {
    }

    public static b a(View view)
    {
        b b1 = (b)a.get(view);
        Object obj = b1;
        if (b1 == null)
        {
            int i = Integer.valueOf(android.os.Build.VERSION.SDK).intValue();
            if (i >= 14)
            {
                obj = new d(view);
            } else
            if (i >= 11)
            {
                obj = new c(view);
            } else
            {
                obj = new e(view);
            }
            a.put(view, obj);
        }
        return ((b) (obj));
    }

    public abstract b a(float f);

    public abstract b a(long l);

    public abstract b a(com.nineoldandroids.a.a.a a1);

    public abstract void a();

    public abstract b b(float f);

    public abstract b c(float f);

}
