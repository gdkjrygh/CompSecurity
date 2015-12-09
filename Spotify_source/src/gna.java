// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Map;

final class gna
    implements Thread.UncaughtExceptionHandler
{

    private final gmy a;
    private final Thread.UncaughtExceptionHandler b;
    private final gcs c;

    gna(gmy gmy1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, gcs gcs1)
    {
        a = gmy1;
        b = uncaughtexceptionhandler;
        c = gcs1;
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj1 = throwable;
        do
        {
label0:
            {
                Object obj = throwable;
                if (obj1 != null)
                {
                    if (!(obj1 instanceof OutOfMemoryError))
                    {
                        break label0;
                    }
                    obj = new OutOfMemoryError();
                    ((OutOfMemoryError) (obj)).fillInStackTrace();
                }
                boolean flag;
                if (!(obj instanceof com.spotify.mobile.android.util.Assertion.RecoverableAssertionError))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    throwable = c;
                    obj1 = ((gcr)dmz.a(gcr)).a();
                    ((Map) (obj1)).put("runtime", "java");
                    ((Map) (obj1)).put("context", Log.getStackTraceString(((Throwable) (obj))));
                    throwable.a(((Map) (obj1)));
                    a.b();
                }
                if (b != null)
                {
                    b.uncaughtException(thread, ((Throwable) (obj)));
                }
                return;
            }
            obj1 = ((Throwable) (obj1)).getCause();
        } while (true);
    }
}
