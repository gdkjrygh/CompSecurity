// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class gae
{

    private static final android.view.View.OnClickListener a = new gaf((byte)0);

    public static View a(Context context, fuj fuj, Object obj)
    {
        ImageButton imagebutton = a(context, SpotifyIcon.aM);
        imagebutton.setContentDescription(context.getString(0x7f080205));
        imagebutton.setOnClickListener(new android.view.View.OnClickListener(context, fuj, obj) {

            private Context a;
            private fuj b;
            private Object c;

            public final void onClick(View view)
            {
                fud.a(a, b, c);
            }

            
            {
                a = context;
                b = fuj;
                c = obj;
                super();
            }
        });
        return imagebutton;
    }

    public static ImageButton a(Context context)
    {
        ImageButton imagebutton = new ImageButton(context, null, 0x7f010201);
        imagebutton.setFocusable(false);
        imagebutton.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        imagebutton.setPadding(context.getResources().getDimensionPixelSize(0x7f0c0131), 0, 0, 0);
        imagebutton.setMinimumWidth(0);
        context = new android.widget.LinearLayout.LayoutParams(-2, -1);
        context.setMargins(0, 0, 0, 0);
        imagebutton.setLayoutParams(context);
        return imagebutton;
    }

    public static ImageButton a(Context context, SpotifyIcon spotifyicon)
    {
        return a(context, spotifyicon, dgo.c(context, 0x7f0101c7));
    }

    public static ImageButton a(Context context, SpotifyIcon spotifyicon, ColorStateList colorstatelist)
    {
        ImageButton imagebutton = a(context);
        imagebutton.setImageDrawable(b(context, spotifyicon, colorstatelist));
        return imagebutton;
    }

    public static dfp a(Context context, Drawable drawable)
    {
        drawable = new dfp(drawable, 0.6F);
        drawable.a(gcg.c(context, 0x7f0f0164));
        drawable.a(dft.b(2.0F, context.getResources()));
        return drawable;
    }

    public static void a(Context context, View view, fuj fuj, Object obj)
    {
        view.setOnLongClickListener(new android.view.View.OnLongClickListener(context, fuj, obj) {

            private Context a;
            private fuj b;
            private Object c;

            public final boolean onLongClick(View view1)
            {
                fud.a(a, b, c);
                return true;
            }

            
            {
                a = context;
                b = fuj;
                c = obj;
                super();
            }
        });
    }

    public static Drawable b(Context context, SpotifyIcon spotifyicon)
    {
        return b(context, spotifyicon, dgo.c(context, 0x7f0101c7));
    }

    private static Drawable b(Context context, SpotifyIcon spotifyicon, ColorStateList colorstatelist)
    {
        spotifyicon = new dfz(context, spotifyicon);
        spotifyicon.a(colorstatelist);
        spotifyicon.a(dft.b(24F, context.getResources()));
        return spotifyicon;
    }

    public static View b(Context context)
    {
        ImageButton imagebutton = a(context, SpotifyIcon.aM);
        imagebutton.setContentDescription(context.getString(0x7f080205));
        imagebutton.setOnClickListener(a);
        return imagebutton;
    }

}
