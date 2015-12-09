// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.CheckableImageButton;

public final class esn
{

    public static View a(Context context)
    {
        int i = dft.b(26F, context.getResources());
        Object obj = new dfz(context, SpotifyIcon.aC);
        ((dfz) (obj)).a(dgo.b(context, 0x7f0101c7));
        Object obj1 = new dfz(context, SpotifyIcon.i);
        ((dfz) (obj1)).a(gcg.b(context, 0x7f0f014a));
        obj = gae.a(context, ((android.graphics.drawable.Drawable) (obj)));
        dfp dfp = gae.a(context, ((android.graphics.drawable.Drawable) (obj1)));
        obj1 = new StateListDrawable();
        ((StateListDrawable) (obj1)).addState(new int[] {
            0xfefeff60
        }, ((android.graphics.drawable.Drawable) (obj)));
        ((StateListDrawable) (obj1)).addState(new int[] {
            0x10100a0
        }, dfp);
        context = new CheckableImageButton(context);
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i, i));
        context.setImageDrawable(((android.graphics.drawable.Drawable) (obj1)));
        context.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        context.setBackgroundResource(0);
        context.setPadding(0, 0, 0, 0);
        context.setFocusable(false);
        context.setId(0x7f11004f);
        return context;
    }
}
