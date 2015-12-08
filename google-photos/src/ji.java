// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

class ji
{

    private ji()
    {
    }

    ji(byte byte0)
    {
        this();
    }

    public int a(Locale locale)
    {
        boolean flag = true;
        if (locale == null || locale.equals(jh.a)) goto _L2; else goto _L1
_L1:
        String s = ja.a(locale);
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
        if (s.equalsIgnoreCase(jh.a())) goto _L6; else goto _L5
_L5:
        i = ((flag) ? 1 : 0);
        if (s.equalsIgnoreCase(jh.b())) goto _L6; else goto _L2
_L2:
        return 0;
    }
}
