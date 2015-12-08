// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.widget.TextView;
import java.util.HashMap;

public final class cb
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        public static final int f;
        private static final int g[];

        public static int[] a()
        {
            return (int[])g.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = 5;
            f = 6;
            g = (new int[] {
                a, b, c, d, e, f
            });
        }
    }


    private static HashMap a = new HashMap();

    public static void a(TextView textview, int i, int j)
    {
        if (textview != null && !textview.isInEditMode()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.a().length];
                try
                {
                    a[a.b - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.c - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.d - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.e - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.f - 1] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        String s;
        Typeface typeface;
        Typeface typeface1;
        switch (_cls1.a[i - 1])
        {
        default:
            if (j == 3)
            {
                s = "fonts/Roboto-BoldItalic.ttf";
            } else
            if (j == 1)
            {
                s = "fonts/Roboto-Bold.ttf";
            } else
            if (j == 2)
            {
                s = "fonts/Roboto-Italic.ttf";
            } else
            {
                s = "fonts/Roboto-Regular.ttf";
            }
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_134;

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_173;

        case 4: // '\004'
            break MISSING_BLOCK_LABEL_191;

        case 5: // '\005'
            break MISSING_BLOCK_LABEL_209;
        }
        typeface1 = (Typeface)a.get(s);
        typeface = typeface1;
        if (typeface1 == null)
        {
            typeface = Typeface.createFromAsset(textview.getResources().getAssets(), s);
            a.put(s, typeface);
        }
        if (typeface != null)
        {
            textview.setTypeface(typeface);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if ((j & 2) != 0)
        {
            s = "fonts/Roboto-BlackItalic.ttf";
        } else
        {
            s = "fonts/Roboto-Black.ttf";
        }
        break MISSING_BLOCK_LABEL_60;
        if (3 == j)
        {
            s = "fonts/Roboto-BoldCondensedItalic.ttf";
        } else
        if (1 == j)
        {
            s = "fonts/Roboto-BoldCondensed.ttf";
        } else
        if (2 == j)
        {
            s = "fonts/Roboto-CondensedItalic.ttf";
        } else
        {
            s = "fonts/Roboto-Condensed.ttf";
        }
        break MISSING_BLOCK_LABEL_60;
        if ((j & 2) != 0)
        {
            s = "fonts/Roboto-LightItalic.ttf";
        } else
        {
            s = "fonts/Roboto-Light.ttf";
        }
        break MISSING_BLOCK_LABEL_60;
        if ((j & 2) != 0)
        {
            s = "fonts/Roboto-MediumItalic.ttf";
        } else
        {
            s = "fonts/Roboto-Medium.ttf";
        }
        break MISSING_BLOCK_LABEL_60;
        if ((j & 2) != 0)
        {
            s = "fonts/Roboto-ThinItalic.ttf";
        } else
        {
            s = "fonts/Roboto-Thin.ttf";
        }
        break MISSING_BLOCK_LABEL_60;
    }

}
