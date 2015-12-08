// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class dff
    implements dfl, ThreadFactory
{

    private final String a;
    private final String b;
    private AtomicInteger c;

    public dff(Context context, Class class1, String s)
    {
        c = new AtomicInteger();
        b.a(context, "context", null);
        a = ((Class)b.a(class1, "owner", null)).getSimpleName();
        b = s;
    }

    public final Thread a(Runnable runnable, String s)
    {
        Locale locale = Locale.US;
        String s2 = a;
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = b;
        }
        return new Thread(runnable, String.format(locale, "%s-%s-%d", new Object[] {
            s2, s1, Integer.valueOf(c.getAndIncrement())
        }));
    }

    public Thread newThread(Runnable runnable)
    {
        return a(runnable, null);
    }

    static 
    {
        dff.getSimpleName();
    }
}
