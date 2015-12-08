// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class eor
{

    public static View a(Context context, SpotifyIcon spotifyicon, int i)
    {
        TypedArray typedarray = context.obtainStyledAttributes(new int[] {
            0x7f010108
        });
        android.graphics.drawable.Drawable drawable = typedarray.getDrawable(0);
        dhu dhu1 = dhv.c(context, null);
        dhx dhx1 = (dhx)dhu1.u();
        ImageView imageview = dhx1.d();
        if (spotifyicon != null)
        {
            imageview.setImageDrawable(dff.b(context, spotifyicon));
            imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        } else
        {
            imageview.setVisibility(8);
        }
        dhx1.a(context.getString(i));
        dgo.a(dhu1.v(), drawable);
        dhu1.e(true);
        dhu1.b(true);
        typedarray.recycle();
        return dhu1.v();
    }
}
