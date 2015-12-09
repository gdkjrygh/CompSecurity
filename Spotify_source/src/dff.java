// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.logging.Logger;

public final class dff
{

    private static float a(float f1, float f2)
    {
        if (Float.isNaN(f1))
        {
            return f2;
        } else
        {
            return f1;
        }
    }

    public static Drawable a(Context context)
    {
        return c(context, SpotifyIcon.d);
    }

    private static Drawable a(Context context, Drawable drawable, SpotifyIcon spotifyicon, float f1, boolean flag, boolean flag1)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[SpotifyIcon.values().length];
                try
                {
                    a[SpotifyIcon.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror48) { }
                try
                {
                    a[SpotifyIcon.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror47) { }
                try
                {
                    a[SpotifyIcon.ag.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror46) { }
                try
                {
                    a[SpotifyIcon.af.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror45) { }
                try
                {
                    a[SpotifyIcon.ab.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror44) { }
                try
                {
                    a[SpotifyIcon.ac.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror43) { }
                try
                {
                    a[SpotifyIcon.U.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror42) { }
                try
                {
                    a[SpotifyIcon.V.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror41) { }
                try
                {
                    a[SpotifyIcon.D.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror40) { }
                try
                {
                    a[SpotifyIcon.E.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror39) { }
                try
                {
                    a[SpotifyIcon.F.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror38) { }
                try
                {
                    a[SpotifyIcon.G.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror37) { }
                try
                {
                    a[SpotifyIcon.br.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror36) { }
                try
                {
                    a[SpotifyIcon.bs.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror35) { }
                try
                {
                    a[SpotifyIcon.r.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror34) { }
                try
                {
                    a[SpotifyIcon.s.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror33) { }
                try
                {
                    a[SpotifyIcon.ad.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror32) { }
                try
                {
                    a[SpotifyIcon.ae.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    a[SpotifyIcon.a.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    a[SpotifyIcon.b.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    a[SpotifyIcon.J.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    a[SpotifyIcon.at.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    a[SpotifyIcon.K.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    a[SpotifyIcon.f.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    a[SpotifyIcon.g.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    a[SpotifyIcon.bl.ordinal()] = 26;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    a[SpotifyIcon.bm.ordinal()] = 27;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    a[SpotifyIcon.aW.ordinal()] = 28;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    a[SpotifyIcon.aX.ordinal()] = 29;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    a[SpotifyIcon.bj.ordinal()] = 30;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[SpotifyIcon.bk.ordinal()] = 31;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[SpotifyIcon.aB.ordinal()] = 32;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[SpotifyIcon.aC.ordinal()] = 33;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[SpotifyIcon.ak.ordinal()] = 34;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[SpotifyIcon.al.ordinal()] = 35;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[SpotifyIcon.W.ordinal()] = 36;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[SpotifyIcon.X.ordinal()] = 37;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[SpotifyIcon.M.ordinal()] = 38;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[SpotifyIcon.N.ordinal()] = 39;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[SpotifyIcon.Z.ordinal()] = 40;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[SpotifyIcon.aa.ordinal()] = 41;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[SpotifyIcon.aN.ordinal()] = 42;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[SpotifyIcon.aO.ordinal()] = 43;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[SpotifyIcon.aH.ordinal()] = 44;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[SpotifyIcon.aI.ordinal()] = 45;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[SpotifyIcon.v.ordinal()] = 46;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SpotifyIcon.w.ordinal()] = 47;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SpotifyIcon.O.ordinal()] = 48;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SpotifyIcon.P.ordinal()] = 49;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = dgo.b(context, 0x7f0101cc);
        }
        switch (_cls1.a[spotifyicon.ordinal()])
        {
        default:
            if (Float.isNaN(f1))
            {
                return drawable;
            } else
            {
                return new dfy(drawable, f1, i1);
            }

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            if (flag1)
            {
                return new dfy(drawable, a(f1, 0.66F), i1);
            } else
            {
                context = new dfp(drawable, a(f1, 0.6F));
                context.a(i1);
                return context;
            }

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            return new dfy(drawable, a(f1, 0.66F), i1);

        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
            return new dfy(drawable, a(f1, 0.75F), i1);

        case 30: // '\036'
        case 31: // '\037'
            return new dfy(drawable, a(f1, 0.33F), i1);
        }
    }

    public static Drawable a(Context context, SpotifyIcon spotifyicon)
    {
        return a(context, ((Drawable) (d(context, spotifyicon))), spotifyicon, (0.0F / 0.0F), true, false);
    }

    public static Drawable a(Context context, SpotifyIcon spotifyicon, float f1, boolean flag)
    {
        return a(context, ((Drawable) (d(context, spotifyicon))), spotifyicon, f1, true, flag);
    }

    public static Drawable a(Context context, SpotifyIcon spotifyicon, float f1, boolean flag, boolean flag1)
    {
        _cls1.a[spotifyicon.ordinal()];
        JVM INSTR tableswitch 1 49: default 220
    //                   1 322
    //                   2 322
    //                   3 385
    //                   4 385
    //                   5 378
    //                   6 378
    //                   7 364
    //                   8 364
    //                   9 357
    //                   10 357
    //                   11 220
    //                   12 220
    //                   13 392
    //                   14 392
    //                   15 406
    //                   16 406
    //                   17 220
    //                   18 220
    //                   19 329
    //                   20 329
    //                   21 220
    //                   22 220
    //                   23 220
    //                   24 427
    //                   25 427
    //                   26 220
    //                   27 220
    //                   28 434
    //                   29 434
    //                   30 220
    //                   31 220
    //                   32 315
    //                   33 315
    //                   34 336
    //                   35 336
    //                   36 343
    //                   37 343
    //                   38 350
    //                   39 350
    //                   40 371
    //                   41 371
    //                   42 399
    //                   43 399
    //                   44 413
    //                   45 413
    //                   46 420
    //                   47 420
    //                   48 441
    //                   49 441;
           goto _L1 _L2 _L2 _L3 _L3 _L4 _L4 _L5 _L5 _L6 _L6 _L1 _L1 _L7 _L7 _L8 _L8 _L1 _L1 _L9 _L9 _L1 _L1 _L1 _L10 _L10 _L1 _L1 _L11 _L11 _L1 _L1 _L12 _L12 _L13 _L13 _L14 _L14 _L15 _L15 _L16 _L16 _L17 _L17 _L18 _L18 _L19 _L19 _L20 _L20
_L20:
        break MISSING_BLOCK_LABEL_441;
_L1:
        int i1 = 0;
_L21:
        Object obj;
        dfz dfz1;
        if (i1 == 0)
        {
            obj = null;
        } else
        {
            obj = gcg.a(context, i1);
        }
        dfz1 = ((dfz) (obj));
        if (obj == null)
        {
            Logger.b("No placeholder was pre-rendered for icon %s! Using createSpotifyIconDrawable.", new Object[] {
                spotifyicon
            });
            dfz1 = d(context, spotifyicon);
            obj = (dfz)dfz1;
            if (!((dfz) (obj)).a)
            {
                obj.c = new Path();
            }
            obj.a = true;
            ((dfz) (obj)).a();
            ((dfz) (obj)).invalidateSelf();
        }
        return a(context, ((Drawable) (dfz1)), spotifyicon, f1, flag, flag1);
_L12:
        i1 = 0x7f0200f2;
          goto _L21
_L2:
        i1 = 0x7f0200f4;
          goto _L21
_L9:
        i1 = 0x7f0200f3;
          goto _L21
_L13:
        i1 = 0x7f0200f6;
          goto _L21
_L14:
        i1 = 0x7f0200f8;
          goto _L21
_L15:
        i1 = 0x7f0200fe;
          goto _L21
_L6:
        i1 = 0x7f0200fb;
          goto _L21
_L5:
        i1 = 0x7f020100;
          goto _L21
_L16:
        i1 = 0x7f020101;
          goto _L21
_L4:
        i1 = 0x7f020102;
          goto _L21
_L3:
        i1 = 0x7f020103;
          goto _L21
_L7:
        i1 = 0x7f0200fd;
          goto _L21
_L17:
        i1 = 0x7f0200fa;
          goto _L21
_L8:
        i1 = 0x7f0200f7;
          goto _L21
_L18:
        i1 = 0x7f020104;
          goto _L21
_L19:
        i1 = 0x7f0200f9;
          goto _L21
_L10:
        i1 = 0x7f0200f5;
          goto _L21
_L11:
        i1 = 0x7f0200fc;
          goto _L21
        i1 = 0x7f0200ff;
          goto _L21
    }

    private static Drawable a(Context context, SpotifyIcon spotifyicon, boolean flag)
    {
        return a(context, ((Drawable) (d(context, spotifyicon))), spotifyicon, (0.0F / 0.0F), false, flag);
    }

    public static Drawable b(Context context)
    {
        return a(context, SpotifyIcon.b, (0.0F / 0.0F), true, false);
    }

    public static Drawable b(Context context, SpotifyIcon spotifyicon)
    {
        return a(context, d(context, spotifyicon), spotifyicon, (0.0F / 0.0F), true, true);
    }

    public static Drawable b(Context context, SpotifyIcon spotifyicon, float f1, boolean flag)
    {
        return a(context, spotifyicon, f1, false, flag);
    }

    public static Drawable c(Context context)
    {
        return c(context, SpotifyIcon.aX);
    }

    public static Drawable c(Context context, SpotifyIcon spotifyicon)
    {
        return b(context, spotifyicon, (0.0F / 0.0F), false);
    }

    public static Drawable d(Context context)
    {
        return c(context, SpotifyIcon.ac);
    }

    private static dfz d(Context context, SpotifyIcon spotifyicon)
    {
        spotifyicon = new dfz(context, spotifyicon);
        spotifyicon.a(dgo.b(context, 0x7f0101ca));
        return spotifyicon;
    }

    public static Drawable e(Context context)
    {
        return c(context, SpotifyIcon.E);
    }

    public static Drawable f(Context context)
    {
        return a(context, SpotifyIcon.ag, (0.0F / 0.0F), false, false);
    }

    public static Drawable g(Context context)
    {
        return a(context, SpotifyIcon.d);
    }

    public static Drawable h(Context context)
    {
        return a(context, SpotifyIcon.b);
    }

    public static Drawable i(Context context)
    {
        return a(context, SpotifyIcon.E);
    }

    public static Drawable j(Context context)
    {
        return a(context, SpotifyIcon.ag, false);
    }

    public static Drawable k(Context context)
    {
        return a(context, SpotifyIcon.aO, (0.0F / 0.0F), true, true);
    }

    public static Drawable l(Context context)
    {
        return a(context, SpotifyIcon.K, (0.0F / 0.0F), true, true);
    }

    public static Drawable m(Context context)
    {
        return a(context, SpotifyIcon.bk, true);
    }
}
