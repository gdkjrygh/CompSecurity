// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.squareup.picasso.x;
import com.tinder.views.RoundImageView;

// Referenced classes of package com.tinder.adapters:
//            c

static final class e.Drawable
    implements x
{

    RoundImageView a;
    TextView b;
    TextView c;

    public final void onBitmapFailed(Drawable drawable)
    {
    }

    public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.sso.LoadedFrom loadedfrom)
    {
        a.onBitmapLoaded(bitmap, loadedfrom);
        a.setBackgroundResource(0x7f0d0107);
    }

    public final void onPrepareLoad(Drawable drawable)
    {
    }

    e.Drawable()
    {
    }
}
