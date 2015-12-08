// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.a;

import android.app.Activity;
import org.c.c;

// Referenced classes of package com.kik.cards.web.a:
//            a, c, d

public final class b
    implements a
{

    private static org.c.b a = c.a("ScreenWakeLock");
    private Activity b;

    public b(Activity activity)
    {
        b = activity;
    }

    static Activity a(b b1)
    {
        return b1.b;
    }

    public final void a()
    {
        b.runOnUiThread(new com.kik.cards.web.a.c(this));
    }

    public final void b()
    {
        b.runOnUiThread(new d(this));
    }

}
