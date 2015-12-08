// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

public final class kvi extends kvu
{

    final Context a;
    String b;
    long c;
    long d;
    String e;
    String f;
    private final Map g;

    public kvi(kxu kxu1, Map map)
    {
        super(kxu1, "createCalendarEvent");
        g = map;
        a = kxu1.d();
        b = d("description");
        e = d("summary");
        c = e("start_ticks");
        d = e("end_ticks");
        f = d("location");
    }

    private String d(String s)
    {
        if (TextUtils.isEmpty((CharSequence)g.get(s)))
        {
            return "";
        } else
        {
            return (String)g.get(s);
        }
    }

    private long e(String s)
    {
        s = (String)g.get(s);
        if (s == null)
        {
            return -1L;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1L;
        }
        return l;
    }
}
