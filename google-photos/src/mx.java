// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewConfiguration;

public final class mx
{

    private static nb a;

    public static int a(ViewConfiguration viewconfiguration)
    {
        return a.a(viewconfiguration);
    }

    public static boolean b(ViewConfiguration viewconfiguration)
    {
        return a.b(viewconfiguration);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new na();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new mz();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a = new my();
        } else
        {
            a = new nb();
        }
    }
}
