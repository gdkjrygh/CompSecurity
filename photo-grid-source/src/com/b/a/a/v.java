// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.f;
import android.app.Activity;
import java.util.Collections;

// Referenced classes of package com.b.a.a:
//            z, y, b

final class v
{

    final b a;

    public v(b b1)
    {
        a = b1;
    }

    public final void a(Activity activity, z z1)
    {
        f.d();
        (new StringBuilder("Logged lifecycle event: ")).append(z1.name());
        b b1 = a;
        activity = Collections.singletonMap("activity", activity.getClass().getName());
        z1 = new y(z1);
        z1.c = activity;
        b1.a(z1);
    }
}
