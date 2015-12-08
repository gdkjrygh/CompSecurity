// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class fyd
{

    public static Drawable a(Context context)
    {
        return a(context, SpotifyIcon.R, dft.b(24F, context.getResources()));
    }

    public static Drawable a(Context context, int i, int j)
    {
        return a(context, i, j, SpotifyIcon.C);
    }

    private static Drawable a(Context context, int i, int j, SpotifyIcon spotifyicon)
    {
        ColorStateList colorstatelist = gcg.c(context, 0x7f0f015d);
        spotifyicon = new dfz(context, spotifyicon, dft.b(i, context.getResources()));
        spotifyicon.a(colorstatelist);
        return a(context, j, gcg.c(context, 0x7f0f015d), ((Drawable) (spotifyicon)), 0.6F);
    }

    public static Drawable a(Context context, SpotifyIcon spotifyicon, int i)
    {
        return a(context, spotifyicon, i, gcg.c(context, 0x7f0f015d));
    }

    public static Drawable a(Context context, SpotifyIcon spotifyicon, int i, int j)
    {
        spotifyicon = new dfz(context, spotifyicon, i);
        spotifyicon.a(gcg.b(context, j));
        return spotifyicon;
    }

    public static Drawable a(Context context, SpotifyIcon spotifyicon, int i, int j, int k)
    {
        spotifyicon = new dfz(context, spotifyicon, i);
        int ai[] = {
            0x10100a7
        };
        i = gcg.b(context, k);
        j = gcg.b(context, j);
        spotifyicon.a(new ColorStateList(new int[][] {
            ai, new int[0]
        }, new int[] {
            i, j
        }));
        return spotifyicon;
    }

    public static Drawable a(Context context, SpotifyIcon spotifyicon, int i, ColorStateList colorstatelist)
    {
        context = new dfz(context, spotifyicon, i);
        context.a(colorstatelist);
        return context;
    }

    private static dfp a(Context context, int i, ColorStateList colorstatelist, Drawable drawable, float f)
    {
        drawable = new dfp(drawable, f);
        drawable.a(dft.b(i, context.getResources()));
        drawable.a(colorstatelist);
        drawable.a(gcg.b(context, 0x7f0f010f));
        return drawable;
    }

    public static dfp a(Context context, ColorStateList colorstatelist, Drawable drawable, float f)
    {
        return a(context, 1, colorstatelist, drawable, f);
    }

    public static Drawable b(Context context)
    {
        return b(context, SpotifyIcon.R, dft.b(24F, context.getResources()));
    }

    public static Drawable b(Context context, int i, int j)
    {
        return a(context, i, j, SpotifyIcon.A);
    }

    private static Drawable b(Context context, SpotifyIcon spotifyicon, int i)
    {
        return a(context, spotifyicon, i, gcg.c(context, 0x7f0f015c));
    }

    public static Drawable c(Context context)
    {
        return a(context, SpotifyIcon.T, dft.b(24F, context.getResources()));
    }

    public static Drawable d(Context context)
    {
        return b(context, SpotifyIcon.T, dft.b(24F, context.getResources()));
    }

    public static Drawable e(Context context)
    {
        return a(context, SpotifyIcon.ai, dft.b(24F, context.getResources()), 0x7f0f00b9);
    }
}
