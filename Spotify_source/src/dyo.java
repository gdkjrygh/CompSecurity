// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

public final class dyo
{

    final dme a;

    public dyo(String s, String s1, Calendar calendar, dyp dyp, dme dme1)
    {
        ctz.a(dyp);
        a = (dme)ctz.a(dme1);
        dme1 = new HashMap();
        dme1.put("email", s);
        dme1.put("suggest", "1");
        dme1.put("validate", "1");
        if (s1 != null)
        {
            dme1.put("username", s1);
        }
        if (calendar != null)
        {
            dme1.put("birthday", gcy.a(calendar));
        }
        dme1.put("country", Locale.getDefault().getCountry().toLowerCase(Locale.US));
        a.b("", dme1, new dyq(dyp));
    }
}
