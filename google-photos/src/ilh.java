// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.util.Log;

public final class ilh
    implements Thread.UncaughtExceptionHandler
{

    private final Context a;
    private final Thread.UncaughtExceptionHandler b;
    private final ilg c;
    private Handler d;

    public ilh(Context context, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        a = context;
        b = uncaughtexceptionhandler;
        c = (ilg)(new olu(context, ilg)).a("enable_silent_feedback_android");
    }

    static void a(ilh ilh1, Thread thread, Throwable throwable)
    {
        ilh1.a(thread, throwable);
    }

    private void a(Thread thread, Throwable throwable)
    {
        if (b != null)
        {
            b.uncaughtException(thread, throwable);
        }
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        ilg ilg1;
        boolean flag;
        if (!b.t())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ilg1 = c;
        if (lvd.a(ilg1.a, ilg1.b, ilg1.c))
        {
            ((obl)olm.a(a, obl)).a(throwable, "com.google.android.apps.photos.SILENT_FEEDBACK");
        }
        if (flag)
        {
            if (Log.isLoggable("PhotosUEHandler", 6))
            {
                String s = String.valueOf(thread);
                Log.e("PhotosUEHandler", (new StringBuilder(String.valueOf(s).length() + 40)).append("Uncaught exception in background thread ").append(s).toString(), throwable);
            }
            boolean flag1 = eva.b();
            for (Throwable throwable1 = throwable; throwable1 != null && !flag1; throwable1 = throwable1.getCause())
            {
                flag1 = throwable1 instanceof mvr;
            }

            if (flag1)
            {
                if (Log.isLoggable("PhotosUEHandler", 6))
                {
                    Log.e("PhotosUEHandler", "An account has just been deactivated, which put background threads at a risk of failure. Letting this thread live.", throwable);
                }
                return;
            }
            if (d == null)
            {
                d = new Handler(a.getMainLooper());
            }
            d.post(new ili(this, thread, throwable));
            return;
        } else
        {
            a(thread, throwable);
            return;
        }
    }
}
