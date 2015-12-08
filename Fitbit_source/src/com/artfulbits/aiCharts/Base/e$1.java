// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.drawable.Drawable;
import android.os.Handler;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            e

final class b
    implements android.graphics.drawable.able.Callback
{

    private final Handler a = new Handler();
    private e b;

    public final void invalidateDrawable(Drawable drawable)
    {
        b.b(0);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        a.postAtTime(runnable, drawable, l);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        a.removeCallbacks(runnable, drawable);
    }

    e(e e1)
    {
        b = e1;
        super();
    }
}
