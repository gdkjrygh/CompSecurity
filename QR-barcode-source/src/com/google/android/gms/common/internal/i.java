// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.nf;

// Referenced classes of package com.google.android.gms.common.internal:
//            o

public final class i
{

    private final String Mf;

    public i(String s)
    {
        Mf = (String)com.google.android.gms.common.internal.o.i(s);
    }

    public void a(Context context, String s, String s1, Throwable throwable)
    {
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        StringBuilder stringbuilder = new StringBuilder();
        for (int j = 0; j < astacktraceelement.length && j < 2; j++)
        {
            stringbuilder.append(astacktraceelement[j].toString());
            stringbuilder.append("\n");
        }

        context = new nf(context, 10);
        context.a("GMS_WTF", null, new String[] {
            "GMS_WTF", stringbuilder.toString()
        });
        context.send();
        if (aC(7))
        {
            Log.e(s, s1, throwable);
            Log.wtf(s, s1, throwable);
        }
    }

    public void a(String s, String s1, Throwable throwable)
    {
        if (aC(4))
        {
            Log.i(s, s1, throwable);
        }
    }

    public boolean aC(int j)
    {
        return Log.isLoggable(Mf, j);
    }

    public void b(String s, String s1, Throwable throwable)
    {
        if (aC(5))
        {
            Log.w(s, s1, throwable);
        }
    }

    public void c(String s, String s1, Throwable throwable)
    {
        if (aC(6))
        {
            Log.e(s, s1, throwable);
        }
    }

    public void n(String s, String s1)
    {
        if (aC(3))
        {
            Log.d(s, s1);
        }
    }

    public void o(String s, String s1)
    {
        if (aC(2))
        {
            Log.v(s, s1);
        }
    }

    public void p(String s, String s1)
    {
        if (aC(5))
        {
            Log.w(s, s1);
        }
    }

    public void q(String s, String s1)
    {
        if (aC(6))
        {
            Log.e(s, s1);
        }
    }
}
