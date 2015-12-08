// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import com.crashlytics.android.internal.aw;
import com.crashlytics.android.internal.cm;

// Referenced classes of package com.crashlytics.android:
//            d

final class at
    implements com.crashlytics.android.internal.at
{

    private d a;

    at(d d1)
    {
        a = d1;
        super();
    }

    public final Object a(aw aw1)
    {
        boolean flag1 = true;
        Activity activity = cm.a().d();
        boolean flag = flag1;
        if (activity != null)
        {
            flag = flag1;
            if (!activity.isFinishing())
            {
                flag = flag1;
                if (a.m())
                {
                    flag = d.a(a, activity, aw1.c);
                }
            }
        }
        return Boolean.valueOf(flag);
    }
}
