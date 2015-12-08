// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;

public final class geh
{

    public static CharSequence a(CharSequence charsequence, String s)
    {
        ctz.a(charsequence);
        boolean flag;
        if (charsequence.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, s);
        return charsequence;
    }

    public static Iterable a(Iterable iterable, String s)
    {
        ctz.a(iterable);
        boolean flag;
        if (!cuv.e(iterable))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, s);
        return iterable;
    }

    public static void a()
    {
        a("Called from main loop");
    }

    public static void a(String s)
    {
        if (Looper.getMainLooper() != Looper.myLooper())
        {
            return;
        } else
        {
            throw new IllegalStateException(s);
        }
    }

    public static void b()
    {
        b("Not called from main loop");
    }

    public static void b(String s)
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            return;
        } else
        {
            throw new IllegalStateException(s);
        }
    }
}
