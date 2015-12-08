// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

final class af
{
    private static final class a
        implements Callable
    {

        private final Context a;
        private final String b;
        private final b c;

        public final Object call()
        {
            SharedPreferences sharedpreferences = a.getSharedPreferences(b, 0);
            if (c != null)
            {
                c.a(sharedpreferences);
            }
            return sharedpreferences;
        }

        public a(Context context, String s, b b1)
        {
            a = context;
            b = s;
            c = b1;
        }
    }

    static interface b
    {

        public abstract void a(SharedPreferences sharedpreferences);
    }


    private final Executor a = Executors.newSingleThreadExecutor();

    public af()
    {
    }

    public final Future a(Context context, String s, b b1)
    {
        context = new FutureTask(new a(context, s, b1));
        a.execute(context);
        return context;
    }
}
