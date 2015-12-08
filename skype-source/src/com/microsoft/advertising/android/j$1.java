// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Handler;

// Referenced classes of package com.microsoft.advertising.android:
//            j, b, ab, bx

final class a
    implements Runnable
{

    final j a;

    public final void run()
    {
        if (j.a(a) != null)
        {
            j.a(a).j();
        }
        j.b(a).postDelayed(this, ab.a().a("DEFAULT_VIEWABLE_CHANGE_TIMER_MS"));
    }

    (j j1)
    {
        a = j1;
        super();
    }
}
