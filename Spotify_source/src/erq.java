// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class erq
{

    private final Context a;
    private final int b;
    private final int c;

    public erq(Context context, int i, int j)
    {
        a = context;
        b = i;
        c = j;
    }

    private static dfz a(Context context, SpotifyIcon spotifyicon, int i, int j)
    {
        android.content.res.ColorStateList colorstatelist = gcg.c(context, j);
        context = new dfz(context, spotifyicon);
        context.a(colorstatelist);
        context.a(i);
        context.setBounds(i, i, i, i);
        return context;
    }

    public final Drawable a()
    {
        return a(a, SpotifyIcon.ao, b, c);
    }

    public final Drawable a(View view)
    {
        dfz dfz1 = a(a, SpotifyIcon.bD, b, c);
        dfz dfz2 = a(a, SpotifyIcon.bE, b, c);
        dfz dfz3 = a(a, SpotifyIcon.bF, b, c);
        AnimationDrawable animationdrawable = new AnimationDrawable();
        animationdrawable.addFrame(dfz1, 500);
        animationdrawable.addFrame(dfz2, 500);
        animationdrawable.addFrame(dfz3, 500);
        animationdrawable.addFrame(dfz2, 500);
        animationdrawable.setOneShot(false);
        view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(view, animationdrawable) {

            private View a;
            private AnimationDrawable b;

            public final boolean onPreDraw()
            {
                a.getViewTreeObserver().removeOnPreDrawListener(this);
                b.start();
                return true;
            }

            
            {
                a = view;
                b = animationdrawable;
                super();
            }
        });
        animationdrawable.setBounds(b, b, b, b);
        view = a(a, SpotifyIcon.bB, b, c);
        view.setAlpha(128);
        return new LayerDrawable(new Drawable[] {
            animationdrawable, view
        });
    }

    public final Drawable b()
    {
        return a(a, SpotifyIcon.bB, b, c);
    }

    public final Drawable c()
    {
        return a(a, SpotifyIcon.bC, b, c);
    }
}
