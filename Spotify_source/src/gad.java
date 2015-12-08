// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIcon;
import java.util.Locale;

public final class gad
{

    public static Button a(Context context, ViewGroup viewgroup)
    {
        return a(context, viewgroup, SpotifyIcon.au, 0x7f08030b);
    }

    public static Button a(Context context, ViewGroup viewgroup, SpotifyIcon spotifyicon, int i)
    {
        return a(context, viewgroup, spotifyicon, context.getString(i));
    }

    public static Button a(Context context, ViewGroup viewgroup, SpotifyIcon spotifyicon, String s)
    {
        viewgroup = dgp.c(context, viewgroup);
        int i = dft.a(48F, context.getResources());
        viewgroup.setPadding(i, 0, i, 0);
        viewgroup.setCompoundDrawablePadding(dft.a(8F, context.getResources()));
        a(context, ((Button) (viewgroup)), spotifyicon, s);
        return viewgroup;
    }

    public static void a(Context context, Button button, SpotifyIcon spotifyicon, int i)
    {
        a(context, button, spotifyicon, context.getString(i));
    }

    private static void a(Context context, Button button, SpotifyIcon spotifyicon, String s)
    {
        button.setText(s.toUpperCase(Locale.getDefault()));
        spotifyicon = new dfz(context, spotifyicon);
        spotifyicon.a(button.getTextColors());
        spotifyicon.a(dft.b(18F, context.getResources()));
        button.setCompoundDrawablesWithIntrinsicBounds(spotifyicon, null, null, null);
    }
}
