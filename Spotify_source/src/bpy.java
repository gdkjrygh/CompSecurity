// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public final class bpy
{

    public String a;
    String b;
    private final boolean c;

    private bpy(String s)
    {
        btl.a(s, "The log tag cannot be null or empty.");
        a = s;
        boolean flag;
        if (s.length() <= 23)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    public bpy(String s, byte byte0)
    {
        this(s);
    }

    private boolean a()
    {
        return c && Log.isLoggable(a, 3);
    }

    public final transient void a(String s, Object aobj[])
    {
        if (a())
        {
            Log.d(a, c(s, aobj));
        }
    }

    public final transient void a(Throwable throwable, String s, Object aobj[])
    {
        if (a())
        {
            Log.d(a, c(s, aobj), throwable);
        }
    }

    public final transient void b(String s, Object aobj[])
    {
        Log.w(a, c(s, aobj));
    }

    public final transient String c(String s, Object aobj[])
    {
        if (aobj.length != 0)
        {
            s = String.format(Locale.ROOT, s, aobj);
        }
        aobj = s;
        if (!TextUtils.isEmpty(b))
        {
            aobj = (new StringBuilder()).append(b).append(s).toString();
        }
        return ((String) (aobj));
    }
}
