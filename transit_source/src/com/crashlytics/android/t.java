// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.Context;

// Referenced classes of package com.crashlytics.android:
//            D, Crashlytics, au

final class t
    implements D
{

    private Context a;
    private Crashlytics b;

    t(Crashlytics crashlytics, Context context)
    {
        b = crashlytics;
        a = context;
        super();
    }

    public final Object a(au au1)
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if (a instanceof Activity)
        {
            flag = flag1;
            if (b.m())
            {
                flag = Crashlytics.a(b, (Activity)a, au1.d());
            }
        }
        return Boolean.valueOf(flag);
    }
}
