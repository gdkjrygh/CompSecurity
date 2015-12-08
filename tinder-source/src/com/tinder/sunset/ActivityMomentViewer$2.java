// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.sunset;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.squareup.picasso.x;

// Referenced classes of package com.tinder.sunset:
//            ActivityMomentViewer

final class a
    implements x
{

    final ActivityMomentViewer a;

    public final void onBitmapFailed(Drawable drawable)
    {
        Toast.makeText(a, 0x7f060120, 0).show();
    }

    public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso. )
    {
        ActivityMomentViewer.a(a, bitmap);
    }

    public final void onPrepareLoad(Drawable drawable)
    {
    }

    (ActivityMomentViewer activitymomentviewer)
    {
        a = activitymomentviewer;
        super();
    }
}
