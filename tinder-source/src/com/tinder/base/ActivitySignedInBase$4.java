// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.x;
import com.tinder.c.ak;

// Referenced classes of package com.tinder.base:
//            ActivitySignedInBase

final class a
    implements x
{

    final ActivitySignedInBase a;

    public final void onBitmapFailed(Drawable drawable)
    {
        if (ActivitySignedInBase.b(a) != null && !a.isFinishing())
        {
            ActivitySignedInBase.b(a).show();
        }
    }

    public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.hing hing)
    {
        if (ActivitySignedInBase.b(a) != null && !a.isFinishing())
        {
            ActivitySignedInBase.b(a).show();
        }
    }

    public final void onPrepareLoad(Drawable drawable)
    {
    }

    (ActivitySignedInBase activitysignedinbase)
    {
        a = activitysignedinbase;
        super();
    }
}
