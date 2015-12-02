// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.l;

import android.content.Context;
import com.google.common.base.Preconditions;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.common.l:
//            h, a

public class b
{

    private static final Pattern d = Pattern.compile("^[0-9]+L$");
    private final Context a;
    private final String b;
    private final h c;

    public b(Context context, h h1)
    {
        a = context;
        c = (h)Preconditions.checkNotNull(h1);
        b = a.getPackageName();
    }

    static String a(long l)
    {
        DateFormat dateformat = DateFormat.getDateTimeInstance(1, 0, Locale.US);
        dateformat.setTimeZone(TimeZone.getTimeZone("PST8PDT"));
        return dateformat.format(new Date(l));
    }

    private String a(String s, String s1)
    {
        s1 = c.a(s, s1);
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return s;
    }

    static boolean b(String s)
    {
        return s != null && d.matcher(s).matches();
    }

    private static long c(String s)
    {
        return Long.valueOf(s.substring(0, s.length() - 1)).longValue();
    }

    public a a()
    {
        return a(b);
    }

    public a a(String s)
    {
        String s1 = a("com.facebook.versioncontrol.revision", s);
        String s2 = a("com.facebook.versioncontrol.branch", s);
        String s3 = a("com.facebook.build_time", s);
        long l = 0L;
        s = "";
        if (b(s3))
        {
            l = c(s3);
            s = a(l);
        }
        return new a(s1, s2, l, s);
    }

}
