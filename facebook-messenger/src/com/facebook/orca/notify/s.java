// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.app.Activity;
import android.view.View;
import com.facebook.base.activity.a;

// Referenced classes of package com.facebook.orca.notify:
//            j, t

public class s extends a
{

    final j a;

    public s(j j1)
    {
        a = j1;
        super();
    }

    public void b(Activity activity)
    {
        com.facebook.orca.notify.j.a(a, activity);
    }

    public void c(Activity activity)
    {
        com.facebook.orca.notify.j.a(a, null);
        if (j.d(a) != null)
        {
            activity = j.d(a);
            com.facebook.orca.notify.j.a(a, null);
            activity.postDelayed(new t(this, activity), 1000L);
        }
        j.c(a);
    }
}
