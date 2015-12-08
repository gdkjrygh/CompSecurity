// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class mue
{

    static final long a;
    public final int b;
    public final Exception c;
    public final String d;
    final long e;
    int f;
    pux g;
    private Bundle h;
    private byte i[];

    public mue(int j, Exception exception, String s)
    {
        f = muf.b;
        b = j;
        c = exception;
        d = s;
        e = System.currentTimeMillis();
    }

    mue(int j, Exception exception, String s, byte abyte0[], long l)
    {
        f = muf.b;
        b = j;
        c = exception;
        d = s;
        i = abyte0;
        e = l;
    }

    public mue(boolean flag)
    {
        char c1;
        if (flag)
        {
            c1 = '\310';
        } else
        {
            c1 = '\0';
        }
        this(c1, null, null);
    }

    public static boolean a(mue mue1)
    {
        return mue1 != null && mue1.c();
    }

    public final Bundle a()
    {
        if (i != null)
        {
            ClassLoader classloader = getClass().getClassLoader();
            h = (Bundle)b.a(i, classloader);
            h.setClassLoader(classloader);
            i = null;
        }
        if (h == null)
        {
            h = new Bundle();
        }
        return h;
    }

    final byte[] b()
    {
        d();
        return i;
    }

    public final boolean c()
    {
        return b != 200;
    }

    final void d()
    {
        if (h == null)
        {
            return;
        } else
        {
            i = b.a(h);
            h = null;
            return;
        }
    }

    public final String toString()
    {
        if (c())
        {
            return String.format(Locale.getDefault(), "TaskResult(message=%s, age=%s, errorCode=%d, exception=%s)", new Object[] {
                d, b.c(e), Integer.valueOf(b), c
            });
        }
        String s;
        if (h != null)
        {
            int j = h.size();
            s = (new StringBuilder(19)).append("Bundle(").append(j).append(")").toString();
        } else
        if (i != null)
        {
            int k = i.length;
            s = (new StringBuilder(17)).append("byte[").append(k).append("]").toString();
        } else
        {
            s = "null";
        }
        return String.format(Locale.getDefault(), "TaskResult(message=%s, age=%s, extras=%s)", new Object[] {
            d, b.c(e), s
        });
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(1L);
    }
}
