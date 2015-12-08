// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.content.SharedPreferences;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.a.a;
import com.cardinalblue.android.b.k;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            b, c

class a
    implements i
{

    final b a;

    public Object then(j j1)
        throws Exception
    {
        android.app.Activity activity = ((c)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/c)).a();
        j1 = (a)j1.e();
        if (activity != null && com.cardinalblue.android.piccollage.lib.b.a(a, j1) && !b.b(a, j1))
        {
            com.cardinalblue.android.piccollage.lib.b.a(a, activity, j1);
            k.j().edit().putString("announcer_last_message", j1.b()).commit();
        }
        return null;
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
