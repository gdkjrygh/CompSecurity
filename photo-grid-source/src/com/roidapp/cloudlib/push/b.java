// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.push;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.roidapp.cloudlib.push:
//            e, a

final class b
    implements Runnable
{

    final String a;
    final boolean b;
    final Context c;
    final String d;

    b(String s, boolean flag, Context context, String s1)
    {
        a = s;
        b = flag;
        c = context;
        d = s1;
        super();
    }

    public final void run()
    {
label0:
        {
            String s = a;
            int i;
            if (b)
            {
                i = 1;
            } else
            {
                i = 2;
            }
            if (e.a(s, i, e.a(c), d))
            {
                if (!b)
                {
                    break label0;
                }
                com.roidapp.cloudlib.push.a.c(c).edit().putString("snsToken", a).apply();
            }
            return;
        }
        com.roidapp.cloudlib.push.a.c(c).edit().remove("snsToken").apply();
    }
}
