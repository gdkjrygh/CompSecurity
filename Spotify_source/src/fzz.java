// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class fzz
{

    private static final int a[] = {
        0x10100a2
    };
    private static final int b[] = new int[0];

    public static ImageButton a(Context context)
    {
        Object obj = SpotifyIcon.A;
        Object obj1 = SpotifyIcon.K;
        int i = dft.b(32F, context.getResources());
        obj = new dfz(context, ((SpotifyIcon) (obj)));
        dfz dfz1 = new dfz(context, ((SpotifyIcon) (obj1)));
        obj1 = new StateListDrawable();
        ((StateListDrawable) (obj1)).addState(a, a(context, ((Drawable) (obj))));
        ((StateListDrawable) (obj1)).addState(b, a(context, ((Drawable) (dfz1))));
        context = new ImageButton(context);
        context.setBackgroundResource(0);
        context.setFocusable(false);
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i, i));
        context.setImageDrawable(((Drawable) (obj1)));
        context.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        context.setPadding(0, 0, 0, 0);
        context.setDuplicateParentStateEnabled(true);
        return context;
    }

    private static dfp a(Context context, Drawable drawable)
    {
        drawable = new dfp(drawable, 0.6F);
        drawable.a(dgo.b(context, 0x7f0101c9));
        drawable.b(dgo.b(context, 0x7f0101d1));
        drawable.a(dft.b(2.0F, context.getResources()));
        return drawable;
    }

}
