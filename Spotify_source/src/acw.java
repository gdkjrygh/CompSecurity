// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.adjust.sdk.LogLevel;
import java.util.Arrays;
import java.util.Locale;

public final class acw
    implements act
{

    private static String b = "Error formating log message: %s, with params: %s";
    private LogLevel a;

    public acw()
    {
        a = LogLevel.a;
    }

    public final void a(LogLevel loglevel)
    {
        a = loglevel;
    }

    public final transient void a(String s, Object aobj[])
    {
        if (a.androidLogLevel > 2)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        Log.v("Adjust", String.format(Locale.US, s, aobj));
        return;
        Exception exception;
        exception;
        Log.e("Adjust", String.format(Locale.US, b, new Object[] {
            s, Arrays.toString(aobj)
        }));
        return;
    }

    public final transient void b(String s, Object aobj[])
    {
        if (a.androidLogLevel > 3)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        Log.d("Adjust", String.format(Locale.US, s, aobj));
        return;
        Exception exception;
        exception;
        Log.e("Adjust", String.format(Locale.US, b, new Object[] {
            s, Arrays.toString(aobj)
        }));
        return;
    }

    public final transient void c(String s, Object aobj[])
    {
        if (a.androidLogLevel > 4)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        Log.i("Adjust", String.format(Locale.US, s, aobj));
        return;
        Exception exception;
        exception;
        Log.e("Adjust", String.format(Locale.US, b, new Object[] {
            s, Arrays.toString(aobj)
        }));
        return;
    }

    public final transient void d(String s, Object aobj[])
    {
        if (a.androidLogLevel > 5)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        Log.w("Adjust", String.format(Locale.US, s, aobj));
        return;
        Exception exception;
        exception;
        Log.e("Adjust", String.format(Locale.US, b, new Object[] {
            s, Arrays.toString(aobj)
        }));
        return;
    }

    public final transient void e(String s, Object aobj[])
    {
        if (a.androidLogLevel > 6)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        Log.e("Adjust", String.format(Locale.US, s, aobj));
        return;
        Exception exception;
        exception;
        Log.e("Adjust", String.format(Locale.US, b, new Object[] {
            s, Arrays.toString(aobj)
        }));
        return;
    }

    public final transient void f(String s, Object aobj[])
    {
        try
        {
            Log.println(7, "Adjust", String.format(Locale.US, s, aobj));
            return;
        }
        catch (Exception exception)
        {
            Log.e("Adjust", String.format(Locale.US, b, new Object[] {
                s, Arrays.toString(aobj)
            }));
        }
    }

}
