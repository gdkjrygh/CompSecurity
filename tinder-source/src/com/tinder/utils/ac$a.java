// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.ContentValues;
import com.tinder.b.d;
import com.tinder.b.l;

// Referenced classes of package com.tinder.utils:
//            ac

private static final class dler
    implements d.UncaughtExceptionHandler
{

    private d.UncaughtExceptionHandler a;

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        new d();
        long l1 = System.currentTimeMillis();
        Object obj = new ContentValues();
        ((ContentValues) (obj)).put("TS", new Long(l1));
        l.a().a("CRASHES", ((ContentValues) (obj)));
        if (a != null)
        {
            obj = a;
        } else
        {
            obj = thread.getUncaughtExceptionHandler();
        }
        ((d.UncaughtExceptionHandler) (obj)).uncaughtException(thread, throwable);
    }

    private dler(d.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        a = uncaughtexceptionhandler;
    }

    public dler(d.UncaughtExceptionHandler uncaughtexceptionhandler, byte byte0)
    {
        this(uncaughtexceptionhandler);
    }
}
