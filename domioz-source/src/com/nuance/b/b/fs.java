// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.util.Log;

// Referenced classes of package com.nuance.b.b:
//            gl, fr

final class fs
{

    fs()
    {
    }

    private static String a()
    {
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        return (new StringBuilder("[")).append(gl.b()).append("] (").append(astacktraceelement[5].getFileName()).append(":").append(astacktraceelement[5].getLineNumber()).append(") ").toString();
    }

    static void a(String s)
    {
        if (fr.a())
        {
            Log.e("MMF", (new StringBuilder()).append(a()).append(s).toString());
            return;
        } else
        {
            Log.e("MMF", s);
            return;
        }
    }

    static void a(String s, boolean flag)
    {
        if (fr.a())
        {
            Log.i("MMF", (new StringBuilder()).append(a()).append(s).toString());
        } else
        if (flag)
        {
            Log.i("MMF", s);
            return;
        }
    }

    static void a(StackTraceElement astacktraceelement[])
    {
        int j = astacktraceelement.length;
        int i = 0;
        while (i < j) 
        {
            if (fr.a())
            {
                Log.e("MMF", (new StringBuilder()).append(a()).append(astacktraceelement[i]).toString());
            } else
            {
                Log.e("MMF", astacktraceelement[i].toString());
            }
            i++;
        }
    }

    static void b(String s)
    {
        if (fr.a())
        {
            Log.w("MMF", (new StringBuilder()).append(a()).append(s).toString());
            return;
        } else
        {
            Log.w("MMF", s);
            return;
        }
    }

    static void c(String s)
    {
        if (fr.a())
        {
            Log.d("MMF", (new StringBuilder()).append(a()).append(s).toString());
        }
    }

    static void d(String s)
    {
        if (fr.a())
        {
            Log.v("MMF", (new StringBuilder()).append(a()).append(s).toString());
        }
    }
}
