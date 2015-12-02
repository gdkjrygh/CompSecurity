// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ai, ah, ag, af, 
//            ae, aj, a

public class ad
{

    static final aj a;

    public ad()
    {
    }

    public static int a(View view)
    {
        return a.a(view);
    }

    public static void a(View view, a a1)
    {
        a.a(view, a1);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static boolean a(View view, int i)
    {
        return a.a(view, i);
    }

    public static void b(View view)
    {
        a.b(view);
    }

    public static void b(View view, int i)
    {
        a.b(view, i);
    }

    public static int c(View view)
    {
        return a.c(view);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 16 || android.os.Build.VERSION.CODENAME.equals("JellyBean"))
        {
            a = new ai();
        } else
        if (i >= 14)
        {
            a = new ah();
        } else
        if (i >= 11)
        {
            a = new ag();
        } else
        if (i >= 9)
        {
            a = new af();
        } else
        {
            a = new ae();
        }
    }
}
