// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.app.Activity;
import b.a.a.a.d;
import java.util.Collections;

// Referenced classes of package com.a.a.a:
//            e

public final class z
{

    public final e a;

    public z(e e1)
    {
        a = e1;
    }

    public final void a(Activity activity, B.b b)
    {
        d.a();
        (new StringBuilder("Logged lifecycle event: ")).append(b.name());
        e e1 = a;
        activity = Collections.singletonMap("activity", activity.getClass().getName());
        b = new B.a(b);
        b.c = activity;
        e1.a(b, false, false);
    }
}
