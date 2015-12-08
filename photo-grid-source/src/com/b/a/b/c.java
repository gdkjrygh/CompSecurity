// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import a.a.a.a.d;
import android.app.Activity;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.b.a.b:
//            b, d

final class c extends d
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void b(Activity activity)
    {
        if (a.a())
        {
            com.b.a.b.b.a(a).submit(new com.b.a.b.d(this));
        }
    }
}
