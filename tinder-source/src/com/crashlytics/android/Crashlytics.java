// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsExecutorServiceWrapper;
import com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class Crashlytics extends h
    implements i
{
    public static class Builder
    {

        public Answers a;
        public Beta b;
        public CrashlyticsCore c;
        public com.crashlytics.android.core.CrashlyticsCore.Builder d;

        public Builder()
        {
        }
    }


    public final Answers a;
    public final Beta b;
    public final CrashlyticsCore c;
    public final Collection d;

    public Crashlytics()
    {
        this(new Answers(), new Beta(), new CrashlyticsCore());
    }

    public Crashlytics(Answers answers, Beta beta, CrashlyticsCore crashlyticscore)
    {
        a = answers;
        b = beta;
        c = crashlyticscore;
        d = Collections.unmodifiableCollection(Arrays.asList(new h[] {
            answers, beta, crashlyticscore
        }));
    }

    public static void a(String s)
    {
        f();
        d().c.a("CrashlyticsCore", s);
    }

    public static void a(String s, String s1)
    {
        f();
        d().c.a(s, s1);
        io.fabric.sdk.android.c.a().a(3, s, s1, true);
    }

    public static void a(Throwable throwable)
    {
        Object obj;
label0:
        {
            f();
            obj = d().c;
            if (!((CrashlyticsCore) (obj)).j && CrashlyticsCore.c("prior to logging exceptions."))
            {
                if (throwable != null)
                {
                    break label0;
                }
                io.fabric.sdk.android.c.a().a(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
            }
            return;
        }
        obj = ((CrashlyticsCore) (obj)).b;
        Thread thread = Thread.currentThread();
        Date date = new Date();
        ((CrashlyticsUncaughtExceptionHandler) (obj)).f.a(new com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler._cls9(((CrashlyticsUncaughtExceptionHandler) (obj)), date, thread, throwable));
    }

    public static void b(String s)
    {
        f();
        CrashlyticsCore crashlyticscore = d().c;
        if (!crashlyticscore.j)
        {
            crashlyticscore.c = CrashlyticsCore.d(s);
            crashlyticscore.b.a(crashlyticscore.c, crashlyticscore.e, crashlyticscore.d);
        }
    }

    public static void c(String s)
    {
        f();
        CrashlyticsCore crashlyticscore = d().c;
        if (!crashlyticscore.j)
        {
            crashlyticscore.e = CrashlyticsCore.d(s);
            crashlyticscore.b.a(crashlyticscore.c, crashlyticscore.e, crashlyticscore.d);
        }
    }

    public static Crashlytics d()
    {
        return (Crashlytics)io.fabric.sdk.android.c.a(com/crashlytics/android/Crashlytics);
    }

    private static void f()
    {
        if (d() == null)
        {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        } else
        {
            return;
        }
    }

    public final String a()
    {
        return "2.5.2.79";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public final Collection c()
    {
        return d;
    }

    protected final volatile Object e()
    {
        return null;
    }
}
