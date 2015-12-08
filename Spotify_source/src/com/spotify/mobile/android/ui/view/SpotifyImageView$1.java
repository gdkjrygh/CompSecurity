// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import gwi;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            SpotifyImageView

final class a
    implements gwi
{

    private SpotifyImageView a;

    public final void a(Bitmap bitmap, com.squareup.picasso.fyImageView._cls1 _pcls1)
    {
        a.setImageBitmap(bitmap);
    }

    public final void a(Drawable drawable)
    {
    }

    public final void b(Drawable drawable)
    {
        a.setImageDrawable(drawable);
    }

    (SpotifyImageView spotifyimageview)
    {
        a = spotifyimageview;
        super();
    }
}
