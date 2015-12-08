// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//            ICUCompat

public class TextUtilsCompat
{

    private static String ARAB_SCRIPT_SUBTAG = "Arab";
    private static String HEBR_SCRIPT_SUBTAG = "Hebr";
    public static final Locale ROOT = new Locale("", "");

    private static int getLayoutDirectionFromFirstChar(Locale locale)
    {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0)))
        {
        default:
            return 0;

        case 1: // '\001'
        case 2: // '\002'
            return 1;
        }
    }

    public static int getLayoutDirectionFromLocale(Locale locale)
    {
        if (locale != null && !locale.equals(ROOT))
        {
            String s = ICUCompat.getScript(ICUCompat.addLikelySubtags(locale.toString()));
            if (s == null)
            {
                return getLayoutDirectionFromFirstChar(locale);
            }
            if (s.equalsIgnoreCase(ARAB_SCRIPT_SUBTAG) || s.equalsIgnoreCase(HEBR_SCRIPT_SUBTAG))
            {
                return 1;
            }
        }
        return 0;
    }

}
