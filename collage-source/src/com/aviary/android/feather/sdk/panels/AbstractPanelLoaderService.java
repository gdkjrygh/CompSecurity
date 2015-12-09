// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import com.aviary.android.feather.library.a.a;
import com.aviary.android.feather.library.services.BaseContextService;
import com.aviary.android.feather.library.services.IAviaryController;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            d, n, l, k, 
//            f, h, i, e, 
//            j, q, r, m, 
//            g, TiltShiftPanel, c

public class AbstractPanelLoaderService extends BaseContextService
{

    static final a d[];

    public AbstractPanelLoaderService(IAviaryController iaviarycontroller)
    {
        super(iaviarycontroller);
    }

    public static a[] a()
    {
        return d;
    }

    public a a(com.aviary.android.feather.library.filters.a.a a1)
    {
        a aa[] = d;
        int j1 = aa.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            a a2 = aa[i1];
            if (a2.c.equals(a1))
            {
                return a2;
            }
        }

        return null;
    }

    public c a(a a1)
    {
        IAviaryController iaviarycontroller = d();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.aviary.android.feather.library.filters.a.a.values().length];
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.n.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.p.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.o.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.e.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.q.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.g.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.f.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.h.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.t.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.l.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.i.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.j.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.k.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.m.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.r.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.aviary.android.feather.library.filters.a.a.s.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.aviary.android.feather.sdk.panels._cls1.a[a1.c.ordinal()])
        {
        default:
            com.aviary.android.feather.common.a.a.a("EffectLoaderService", com.aviary.android.feather.common.a.a.d.a).d((new StringBuilder()).append("Effect with ").append(a1.c).append(" could not be found").toString());
            return null;

        case 1: // '\001'
            return new d(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.n);

        case 2: // '\002'
            return new n(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.b, "brightness");

        case 3: // '\003'
            return new n(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.d, "saturation");

        case 4: // '\004'
            return new n(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.c, "contrast");

        case 5: // '\005'
            return new n(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.a, "sharpen");

        case 6: // '\006'
            return new n(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.p, "temperature");

        case 7: // '\007'
            return new l(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.o);

        case 8: // '\b'
            return new k(iaviarycontroller, a1);

        case 9: // '\t'
            return new f(iaviarycontroller, a1);

        case 10: // '\n'
            return new h(iaviarycontroller, a1);

        case 11: // '\013'
            return new i(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.f);

        case 12: // '\f'
            return new i(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.h);

        case 13: // '\r'
            return new i(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.t);

        case 14: // '\016'
            return new e(iaviarycontroller, a1, com.aviary.android.feather.library.filters.a.a.l);

        case 15: // '\017'
            return new j(iaviarycontroller, a1);

        case 16: // '\020'
            return new q(iaviarycontroller, a1);

        case 17: // '\021'
            return new r(iaviarycontroller, a1);

        case 18: // '\022'
            return new m(iaviarycontroller, a1);

        case 19: // '\023'
            return new g(iaviarycontroller, a1);

        case 20: // '\024'
            return new TiltShiftPanel(iaviarycontroller, a1);
        }
    }

    public void b()
    {
    }

    static 
    {
        d = (new a[] {
            new a(com.aviary.android.feather.library.filters.a.a.o, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_enhance, com.aviary.android.feather.sdk.R.string.feather_enhance), new a(com.aviary.android.feather.library.filters.a.a.s, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_focus, com.aviary.android.feather.sdk.R.string.feather_tool_tiltshift), new a(com.aviary.android.feather.library.filters.a.a.e, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_effects, com.aviary.android.feather.sdk.R.string.feather_effects), new a(com.aviary.android.feather.library.filters.a.a.q, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_frames, com.aviary.android.feather.sdk.R.string.feather_borders), new a(com.aviary.android.feather.library.filters.a.a.j, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_stickers, com.aviary.android.feather.sdk.R.string.feather_stickers), new a(com.aviary.android.feather.library.filters.a.a.g, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_crop, com.aviary.android.feather.sdk.R.string.feather_crop), new a(com.aviary.android.feather.library.filters.a.a.n, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_orientation, com.aviary.android.feather.sdk.R.string.feather_adjust), new a(com.aviary.android.feather.library.filters.a.a.b, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_brightness, com.aviary.android.feather.sdk.R.string.feather_brightness), new a(com.aviary.android.feather.library.filters.a.a.c, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_contrast, com.aviary.android.feather.sdk.R.string.feather_contrast), new a(com.aviary.android.feather.library.filters.a.a.d, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_saturation, com.aviary.android.feather.sdk.R.string.feather_saturation), 
            new a(com.aviary.android.feather.library.filters.a.a.p, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_warmth, com.aviary.android.feather.sdk.R.string.feather_tool_temperature), new a(com.aviary.android.feather.library.filters.a.a.a, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_sharpen, com.aviary.android.feather.sdk.R.string.feather_sharpen), new a(com.aviary.android.feather.library.filters.a.a.r, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_colorsplash, com.aviary.android.feather.sdk.R.string.feather_tool_colorsplash), new a(com.aviary.android.feather.library.filters.a.a.i, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_draw, com.aviary.android.feather.sdk.R.string.feather_draw), new a(com.aviary.android.feather.library.filters.a.a.k, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_text, com.aviary.android.feather.sdk.R.string.feather_text), new a(com.aviary.android.feather.library.filters.a.a.f, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_redeye, com.aviary.android.feather.sdk.R.string.feather_red_eye), new a(com.aviary.android.feather.library.filters.a.a.h, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_whiten, com.aviary.android.feather.sdk.R.string.feather_whiten), new a(com.aviary.android.feather.library.filters.a.a.l, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_blemish, com.aviary.android.feather.sdk.R.string.feather_blemish), new a(com.aviary.android.feather.library.filters.a.a.m, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_meme, com.aviary.android.feather.sdk.R.string.feather_meme), new a(com.aviary.android.feather.library.filters.a.a.t, com.aviary.android.feather.sdk.R.drawable.aviary_tool_ic_blur, com.aviary.android.feather.sdk.R.string.feather_blur)
        });
    }
}
