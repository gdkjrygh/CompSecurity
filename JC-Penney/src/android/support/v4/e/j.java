// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.e;

import java.util.Locale;

// Referenced classes of package android.support.v4.e:
//            h, a, i

class j
{

    private j()
    {
    }

    j(i i)
    {
        this();
    }

    private static int b(Locale locale)
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

    public int a(Locale locale)
    {
        if (locale != null && !locale.equals(h.a))
        {
            String s = android.support.v4.e.a.a(locale);
            if (s == null)
            {
                return b(locale);
            }
            if (s.equalsIgnoreCase(h.a()) || s.equalsIgnoreCase(h.b()))
            {
                return 1;
            }
        }
        return 0;
    }
}
