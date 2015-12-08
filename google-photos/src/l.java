// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public class l
{

    private static n a;

    public static w a()
    {
        return a.a();
    }

    public static void a(View view)
    {
        a.a(view);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            a = new s();
        } else
        {
            a = new p();
        }
    }
}
