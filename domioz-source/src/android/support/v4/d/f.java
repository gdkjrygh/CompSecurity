// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.d;

import java.util.Locale;

// Referenced classes of package android.support.v4.d:
//            a

public final class f
{

    public static final Locale a = new Locale("", "");
    private static String b = "Arab";
    private static String c = "Hebr";

    public static int a(Locale locale)
    {
        boolean flag = true;
        if (locale == null || locale.equals(a)) goto _L2; else goto _L1
_L1:
        String s = android.support.v4.d.a.a(android.support.v4.d.a.b(locale.toString()));
        if (s != null) goto _L4; else goto _L3
_L3:
        int i;
        i = ((flag) ? 1 : 0);
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0)))
        {
        default:
            i = 0;
            break;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
_L6:
        return i;
_L4:
        i = ((flag) ? 1 : 0);
        if (s.equalsIgnoreCase(b)) goto _L6; else goto _L5
_L5:
        i = ((flag) ? 1 : 0);
        if (s.equalsIgnoreCase(c)) goto _L6; else goto _L2
_L2:
        return 0;
    }

}
