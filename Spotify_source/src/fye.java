// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class fye
{

    public static int a(Context context)
    {
        return context.getResources().getDimensionPixelSize(0x7f0c0124);
    }

    public static Drawable a(Context context, int i)
    {
        int j = dft.b(18F, context.getResources());
        dfz dfz1 = new dfz(context, SpotifyIcon.aM, j);
        android.content.res.ColorStateList colorstatelist = gcg.c(context, i);
        dfz1.a(colorstatelist);
        return fyd.a(context, colorstatelist, dfz1, 0.75F);
    }
}
