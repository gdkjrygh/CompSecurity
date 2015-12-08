// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            c

final class f
    implements android.graphics.drawable.Drawable.Callback
{

    final c a;

    f(c c1)
    {
        a = c1;
        super();
    }

    public final void invalidateDrawable(Drawable drawable)
    {
        a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        a.scheduleSelf(runnable, l);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        a.unscheduleSelf(runnable);
    }
}
