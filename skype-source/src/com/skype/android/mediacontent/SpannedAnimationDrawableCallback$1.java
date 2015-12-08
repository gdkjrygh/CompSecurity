// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.skype.android.mediacontent:
//            SpannedAnimationDrawableCallback

final class a
    implements Runnable
{

    final Drawable a;
    final SpannedAnimationDrawableCallback b;

    public final void run()
    {
        b.invalidateDrawable(a);
    }

    (SpannedAnimationDrawableCallback spannedanimationdrawablecallback, Drawable drawable)
    {
        b = spannedanimationdrawablecallback;
        a = drawable;
        super();
    }
}
