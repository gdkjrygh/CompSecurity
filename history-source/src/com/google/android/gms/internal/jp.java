// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            jx, oo

public final class jp
{

    private final String Nq;

    public jp(String s)
    {
        Nq = (String)jx.i(s);
    }

    public void a(Context context, String s, String s1, Throwable throwable)
    {
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < astacktraceelement.length && i < 2; i++)
        {
            stringbuilder.append(astacktraceelement[i].toString());
            stringbuilder.append("\n");
        }

        context = new oo(context, 10);
        context.a("GMS_WTF", null, new String[] {
            "GMS_WTF", stringbuilder.toString()
        });
        context.send();
        if (aF(7))
        {
            Log.e(s, s1, throwable);
            Log.wtf(s, s1, throwable);
        }
    }

    public void a(String s, String s1, Throwable throwable)
    {
        if (aF(4))
        {
            Log.i(s, s1, throwable);
        }
    }

    public boolean aF(int i)
    {
        return Log.isLoggable(Nq, i);
    }

    public void b(String s, String s1, Throwable throwable)
    {
        if (aF(5))
        {
            Log.w(s, s1, throwable);
        }
    }

    public void c(String s, String s1, Throwable throwable)
    {
        if (aF(6))
        {
            Log.e(s, s1, throwable);
        }
    }

    public void m(String s, String s1)
    {
        if (aF(3))
        {
            Log.d(s, s1);
        }
    }

    public void n(String s, String s1)
    {
        if (aF(2))
        {
            Log.v(s, s1);
        }
    }

    public void o(String s, String s1)
    {
        if (aF(5))
        {
            Log.w(s, s1);
        }
    }

    public void p(String s, String s1)
    {
        if (aF(6))
        {
            Log.e(s, s1);
        }
    }
}
