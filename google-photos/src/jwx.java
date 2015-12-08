// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public final class jwx
{

    private static boolean b = false;
    String a;
    private String c;
    private final boolean d;
    private boolean e;

    public jwx(String s)
    {
        this(s, false);
    }

    private jwx(String s, boolean flag)
    {
        b.a(s, "The log tag cannot be null or empty.");
        c = s;
        boolean flag1;
        if (s.length() <= 23)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        d = flag1;
        e = flag;
    }

    private boolean a()
    {
        return e || d && Log.isLoggable(c, 3);
    }

    private transient String e(String s, Object aobj[])
    {
        if (aobj.length != 0)
        {
            s = String.format(Locale.ROOT, s, aobj);
        }
        aobj = s;
        if (!TextUtils.isEmpty(a))
        {
            aobj = (new StringBuilder()).append(a).append(s).toString();
        }
        return ((String) (aobj));
    }

    public final transient void a(String s, Object aobj[])
    {
        if (a())
        {
            e(s, aobj);
        }
    }

    public final transient void a(Throwable throwable, String s, Object aobj[])
    {
        if (a())
        {
            e(s, aobj);
        }
    }

    public final transient void b(String s, Object aobj[])
    {
        e(s, aobj);
    }

    public final transient void c(String s, Object aobj[])
    {
        Log.w(c, e(s, aobj));
    }

    public final transient void d(String s, Object aobj[])
    {
        Log.e(c, e(s, aobj));
    }

}
