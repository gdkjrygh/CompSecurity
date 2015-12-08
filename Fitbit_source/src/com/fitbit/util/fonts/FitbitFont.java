// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.fonts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import java.util.HashMap;
import java.util.Map;

public final class FitbitFont extends Enum
{

    public static final FitbitFont a;
    public static final FitbitFont b;
    public static final FitbitFont c;
    public static final FitbitFont d;
    public static final FitbitFont e;
    public static final FitbitFont f;
    public static final FitbitFont g;
    public static final FitbitFont h;
    private static Map i = new HashMap();
    private static SparseArray j;
    private static final FitbitFont k[];
    private String fontFamily;
    private String path;
    private int value;

    private FitbitFont(String s, int l, int i1, String s1, String s2)
    {
        super(s, l);
        value = i1;
        path = s1;
        fontFamily = s2;
    }

    public static FitbitFont a(TypedArray typedarray)
    {
        if (typedarray != null)
        {
            int l = typedarray.getInt(0, -1);
            return (FitbitFont)j.get(l);
        } else
        {
            return null;
        }
    }

    private String a(Typeface typeface)
    {
        if (typeface == null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[FitbitFont.values().length];
                try
                {
                    a[FitbitFont.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[FitbitFont.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[FitbitFont.f.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[FitbitFont.h.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[ordinal()])
        {
        case 1: // '\001'
            switch (typeface.getStyle())
            {
            case 1: // '\001'
                return b.path;

            case 3: // '\003'
                return d.path;

            case 2: // '\002'
                return c.path;
            }
            // fall through

        default:
            if (true)
            {
                continue; /* Loop/switch isn't completed */
            }
            // fall through

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            if (typeface.getStyle() == 1)
            {
                return g.path;
            }
            break;
        }
          goto _L3
_L2:
        return path;
_L3:
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static FitbitFont valueOf(String s)
    {
        return (FitbitFont)Enum.valueOf(com/fitbit/util/fonts/FitbitFont, s);
    }

    public static FitbitFont[] values()
    {
        return (FitbitFont[])k.clone();
    }

    public Typeface a(Context context, Typeface typeface)
    {
        String s = a(typeface);
        if (s == null)
        {
            return typeface;
        }
        if (!i.containsKey(s))
        {
            try
            {
                i.put(s, Typeface.createFromAsset(context.getAssets(), s));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (b.a.b())
                {
                    return Typeface.DEFAULT;
                } else
                {
                    throw context;
                }
            }
        }
        return (Typeface)i.get(s);
    }

    public String a()
    {
        return fontFamily;
    }

    public String b()
    {
        return path;
    }

    static 
    {
        int l = 0;
        a = new FitbitFont("ROBOTO", 0, 0, "fonts/Roboto/Roboto-Regular.ttf", "Roboto-Regular");
        b = new FitbitFont("ROBOTO_BOLD", 1, 1, "fonts/Roboto/Roboto-Bold.ttf", "Roboto-Bold");
        c = new FitbitFont("ROBOTO_ITALIC", 2, 2, "fonts/Roboto/Roboto-Italic.ttf", "Roboto-Italic");
        d = new FitbitFont("ROBOTO_BOLD_ITALIC", 3, 3, "fonts/Roboto/Roboto-BoldItalic.ttf", "Roboto-BoldItalic");
        e = new FitbitFont("PROXIMA_NOVA_LIGHT", 4, 100, "fonts/ProximaNova/ProximaNova-Light.otf", "ProximaNova-Light");
        f = new FitbitFont("PROXIMA_NOVA_THIN", 5, 101, "fonts/ProximaNova/ProximaNova-Thin.otf", "ProximaNova-Thin");
        g = new FitbitFont("PROXIMA_NOVA_SEMIBOLD", 6, 102, "fonts/ProximaNova/ProximaNova-Sbold.otf", "ProximaNova-Sbold");
        h = new FitbitFont("PROXIMA_NOVA_REGULAR", 7, 103, "fonts/ProximaNova/ProximaNova-Reg.otf", "ProximaNova-Reg");
        k = (new FitbitFont[] {
            a, b, c, d, e, f, g, h
        });
        j = new SparseArray();
        FitbitFont afitbitfont[] = values();
        for (int i1 = afitbitfont.length; l < i1; l++)
        {
            FitbitFont fitbitfont = afitbitfont[l];
            j.put(fitbitfont.value, fitbitfont);
        }

    }
}
