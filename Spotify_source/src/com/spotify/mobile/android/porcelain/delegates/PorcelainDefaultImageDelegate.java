// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import android.widget.ImageView;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.ui.stuff.BadgesFactory;
import com.squareup.picasso.Picasso;
import ctz;
import dfo;
import dfq;
import dmz;
import dqb;
import dqc;
import dqh;
import dto;
import gae;
import gft;
import gwb;

public final class PorcelainDefaultImageDelegate
    implements PorcelainRenderDelegate.PorcelainImageDelegate
{

    public final Context a;
    private final dqc b;
    private final dqc c;
    private final dqc d;
    private final LoadPolicy e;

    public PorcelainDefaultImageDelegate(Context context, LoadPolicy loadpolicy)
    {
        a = (Context)ctz.a(context);
        e = (LoadPolicy)ctz.a(loadpolicy);
        d = new dqc(this, PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.a);
        c = new dqc(this, PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.b);
        b = new dqc(this, PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.c);
    }

    private static Uri a(String s, LoadPolicy loadpolicy)
    {
        do
        {
            if (s == null)
            {
                return null;
            }
            public final class _cls1
            {

                static final int a[];
                static final int b[];
                public static final int c[];
                public static final int d[];
                static final int e[];

                static 
                {
                    e = new int[PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.values().length];
                    try
                    {
                        e[PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror18) { }
                    try
                    {
                        e[PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror17) { }
                    try
                    {
                        e[PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror16) { }
                    d = new int[PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.values().length];
                    try
                    {
                        d[PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror15) { }
                    try
                    {
                        d[PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror14) { }
                    try
                    {
                        d[PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.b.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror13) { }
                    try
                    {
                        d[PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    c = new int[PorcelainIcon.values().length];
                    try
                    {
                        c[PorcelainIcon.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        c[PorcelainIcon.e.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        c[PorcelainIcon.f.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        c[PorcelainIcon.m.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        c[PorcelainIcon.n.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        c[PorcelainIcon.q.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    b = new int[com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape.values().length];
                    try
                    {
                        b[com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        b[com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        b[com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    a = new int[LoadPolicy.values().length];
                    try
                    {
                        a[LoadPolicy.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[LoadPolicy.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[LoadPolicy.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1.a[loadpolicy.ordinal()])
            {
            default:
                throw new AssertionError("LoadPolicy is broken");

            case 1: // '\001'
                return Uri.parse(s);

            case 2: // '\002'
                return dto.a(s);

            case 3: // '\003'
                break;
            }
            if (s.startsWith("spotify:image") || s.startsWith("spotify:mosaic"))
            {
                loadpolicy = LoadPolicy.b;
            } else
            {
                loadpolicy = LoadPolicy.a;
            }
        } while (true);
    }

    public static dqb a(Context context)
    {
        return new dqb(context, (byte)0);
    }

    public final void a(ImageView imageview)
    {
        ((gft)dmz.a(gft)).a().a(imageview);
    }

    public final void a(ImageView imageview, PorcelainIcon porcelainicon)
    {
        if (porcelainicon != imageview.getTag(0x7f1100e7))
        {
            imageview.setImageDrawable(gae.b(a, porcelainicon.mIcon));
            imageview.setTag(0x7f1100e7, porcelainicon);
        }
    }

    public final void a(ImageView imageview, PorcelainImage porcelainimage, PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize imagesize, PorcelainRenderDelegate.PorcelainImageDelegate.IconSize iconsize)
    {
        a(imageview, porcelainimage, dqh.a, imagesize, iconsize);
    }

    public final void a(ImageView imageview, PorcelainImage porcelainimage, dqh dqh1, PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize imagesize, PorcelainRenderDelegate.PorcelainImageDelegate.IconSize iconsize)
    {
        Object obj;
        if (imagesize == PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.a)
        {
            obj = d;
        } else
        if (imagesize == PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.c)
        {
            obj = b;
        } else
        {
            obj = c;
        }
        obj = (Drawable)((dqc) (obj)).get(Pair.create(porcelainimage.getPlaceHolder(), Pair.create(iconsize, porcelainimage.getShape())));
        iconsize = porcelainimage.getShape();
        _cls1.b[iconsize.ordinal()];
        JVM INSTR tableswitch 1 3: default 88
    //                   1 139
    //                   2 225
    //                   3 241;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new AssertionError((new StringBuilder("Unrecognised shape ")).append(iconsize).toString());
_L2:
        iconsize = null;
_L12:
        if (porcelainimage.getBadge() != com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Badge.b) goto _L6; else goto _L5
_L5:
        Context context;
        dmz.a(com/spotify/mobile/android/ui/stuff/BadgesFactory);
        context = a;
        _cls1.e[imagesize.ordinal()];
        JVM INSTR tableswitch 1 3: default 200
    //                   1 249
    //                   2 318
    //                   3 326;
           goto _L7 _L8 _L9 _L10
_L7:
        throw new AssertionError((new StringBuilder("unrecognized size ")).append(imagesize).toString());
_L3:
        if (imagesize != PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.c) goto _L4; else goto _L11
_L11:
        iconsize = dfq.a();
          goto _L12
_L4:
        iconsize = dfo.a();
          goto _L12
_L8:
        imagesize = com.spotify.mobile.android.ui.stuff.BadgesFactory.BadgeSize.a;
_L16:
        imagesize = new com.spotify.mobile.android.ui.stuff.BadgesFactory._cls1(iconsize, context, imagesize);
          goto _L13
_L9:
        imagesize = com.spotify.mobile.android.ui.stuff.BadgesFactory.BadgeSize.b;
        continue; /* Loop/switch isn't completed */
_L10:
        imagesize = com.spotify.mobile.android.ui.stuff.BadgesFactory.BadgeSize.c;
        continue; /* Loop/switch isn't completed */
_L13:
        porcelainimage = dqh1.a(((gft)dmz.a(gft)).a().a(a(porcelainimage.getUrl(), e)).b(((Drawable) (obj))).a(((Drawable) (obj))));
        if (porcelainimage == null)
        {
            return;
        }
        if (imagesize != null)
        {
            porcelainimage.a(gft.a(imageview, imagesize));
            return;
        } else
        {
            porcelainimage.a(imageview, null);
            return;
        }
_L6:
        imagesize = iconsize;
        if (true) goto _L13; else goto _L14
_L14:
        if (true) goto _L16; else goto _L15
_L15:
    }

    private class LoadPolicy extends Enum
    {

        public static final LoadPolicy a;
        public static final LoadPolicy b;
        public static final LoadPolicy c;
        private static final LoadPolicy d[];

        public static LoadPolicy valueOf(String s)
        {
            return (LoadPolicy)Enum.valueOf(com/spotify/mobile/android/porcelain/delegates/PorcelainDefaultImageDelegate$LoadPolicy, s);
        }

        public static LoadPolicy[] values()
        {
            return (LoadPolicy[])d.clone();
        }

        static 
        {
            a = new LoadPolicy("PICASSO_DEFAULT", 0);
            b = new LoadPolicy("PICASSO_ORBIT", 1);
            c = new LoadPolicy("PICASSO_ORBIT_ONLY_SPOTIFY_URIS", 2);
            d = (new LoadPolicy[] {
                a, b, c
            });
        }

        private LoadPolicy(String s, int i)
        {
            super(s, i);
        }
    }

}
