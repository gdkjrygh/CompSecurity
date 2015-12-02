// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push;

import android.app.AlarmManager;
import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.push:
//            PushInitializer, f, a, b

class c extends d
{

    final a a;

    private c(a a1)
    {
        a = a1;
        super();
    }

    c(a a1, b b1)
    {
        this(a1);
    }

    public PushInitializer a()
    {
        return new PushInitializer((Context)e().a(android/content/Context), (AlarmManager)e().a(android/app/AlarmManager), c(com/facebook/push/f));
    }

    public Object b()
    {
        return a();
    }
}
