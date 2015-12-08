// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import com.tinder.b.d;
import com.tinder.b.f;
import com.tinder.b.l;
import com.tinder.managers.ae;
import java.util.Date;

public final class ac
{
    private static final class a
        implements Thread.UncaughtExceptionHandler
    {

        private Thread.UncaughtExceptionHandler a;

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
            ((Thread.UncaughtExceptionHandler) (obj)).uncaughtException(thread, throwable);
        }

        private a(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
        {
            a = uncaughtexceptionhandler;
        }

        public a(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, byte byte0)
        {
            this(uncaughtexceptionhandler);
        }
    }


    private static ac e = new ac();
    public boolean a;
    public boolean b;
    public boolean c;
    public Thread.UncaughtExceptionHandler d;
    private final int f = 2;
    private final int g = 10;
    private final int h = 3;

    private ac()
    {
    }

    public static ac a()
    {
        return e;
    }

    public static void b()
    {
        Looper.getMainLooper().getThread().setUncaughtExceptionHandler(null);
    }

    public static boolean c()
    {
        long l1 = System.currentTimeMillis();
        long l2 = l1 - 0x927c0L;
        new d();
        String s = String.valueOf(l2);
        String s1 = String.valueOf(l1);
        Cursor cursor = l.a().a.rawQuery("SELECT * FROM CRASHES where TS BETWEEN ? AND ?", new String[] {
            s, s1
        });
        int i = cursor.getCount();
        (new StringBuilder("count ")).append(i).append(" between ").append(s).append(" and ").append(s1);
        com.tinder.b.f.a(cursor);
        (new StringBuilder("check crashes between ")).append(new Date(l2)).append(" and ").append(new Date(l1)).append(" : ").append(i);
        return i >= 2;
    }

    public static boolean d()
    {
        return ae.a.getBoolean("HAS_RATED", false);
    }

    public static boolean e()
    {
        return ae.a.getBoolean("HAS_SENT_FEEDBACK", false);
    }

    public static boolean f()
    {
        return ae.a.getBoolean("VERSION_IS_RATEABLE", true);
    }

    public final void g()
    {
        c = false;
        b = false;
        a = false;
    }

}
