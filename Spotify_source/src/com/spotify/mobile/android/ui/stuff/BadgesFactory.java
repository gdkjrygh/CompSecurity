// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.BadgedDrawable;
import com.spotify.android.paste.graphics.SpotifyIcon;
import dfm;
import dfp;
import dfv;
import dfz;
import dmx;
import gcg;

public final class BadgesFactory
    implements dmx
{

    public BadgesFactory()
    {
    }

    public static Drawable a(Context context, Drawable drawable, int i, int j)
    {
        Object obj = SpotifyIcon.h;
        com.spotify.android.paste.graphics.BadgedDrawable.BadgePosition badgeposition = com.spotify.android.paste.graphics.BadgedDrawable.BadgePosition.d;
        int k = gcg.b(context, 0x7f0f0010);
        int l = gcg.b(context, 0x7f0f000f);
        context = new dfz(context, ((SpotifyIcon) (obj)), (float)i * 0.6F);
        context.a(k);
        context = new dfp(context, 0.6F);
        context.a(l);
        obj = BadgedDrawable.a();
        obj.a = badgeposition;
        obj.d = j;
        obj.e = j;
        obj.f = true;
        return new BadgedDrawable(drawable, context, ((dfm) (obj)));
    }

    // Unreferenced inner class com/spotify/mobile/android/ui/stuff/BadgesFactory$1

/* anonymous class */
    public final class _cls1
        implements dfv
    {

        private dfv a;
        private Context b;
        private BadgeSize c;

        public final Drawable a(Bitmap bitmap)
        {
            Context context;
            BadgeSize badgesize;
            if (a != null)
            {
                bitmap = a.a(bitmap);
            } else
            {
                bitmap = new BitmapDrawable(b.getResources(), bitmap);
            }
            context = b;
            badgesize = c;
            return BadgesFactory.a(context, bitmap, context.getResources().getDimensionPixelSize(badgesize.sizeRes), context.getResources().getDimensionPixelSize(badgesize.marginRes));
        }

            public 
            {
                a = dfv1;
                b = context;
                c = badgesize;
                super();
            }

        private class BadgeSize extends Enum
        {

            public static final BadgeSize a;
            public static final BadgeSize b;
            public static final BadgeSize c;
            private static final BadgeSize d[];
            public final int marginRes;
            public final int sizeRes;

            public static BadgeSize valueOf(String s)
            {
                return (BadgeSize)Enum.valueOf(com/spotify/mobile/android/ui/stuff/BadgesFactory$BadgeSize, s);
            }

            public static BadgeSize[] values()
            {
                return (BadgeSize[])d.clone();
            }

            static 
            {
                a = new BadgeSize("SMALL", 0, 0x7f0c008a, 0x7f0c0089);
                b = new BadgeSize("MEDIUM", 1, 0x7f0c0088, 0x7f0c0087);
                c = new BadgeSize("LARGE", 2, 0x7f0c0086, 0x7f0c0085);
                d = (new BadgeSize[] {
                    a, b, c
                });
            }

            private BadgeSize(String s, int i, int j, int k)
            {
                super(s, i);
                marginRes = k;
                sizeRes = j;
            }
        }

    }

}
