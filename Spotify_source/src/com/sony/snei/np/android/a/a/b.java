// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.a.a;

import android.content.Context;

// Referenced classes of package com.sony.snei.np.android.a.a:
//            c

public class b
{

    private static c a = null;

    public static c a(Context context)
    {
        int i = 0;
        if (a != null)
        {
            return a;
        }
        f.a a1 = new f.a();
        e.a a2 = new e.a();
        d.a a3 = new d.a();
        for (; i < 3; i++)
        {
            c.a a4 = (new c.a[] {
                a1, a2, a3
            })[i];
            if (a4.a(context))
            {
                context = a4.b(context);
                a = context;
                return context;
            }
        }

        return null;
    }

}
