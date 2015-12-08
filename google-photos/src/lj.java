// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lj
{

    private static lk a;

    public static int a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return a.a(marginlayoutparams);
    }

    public static int b(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return a.b(marginlayoutparams);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new lm();
        } else
        {
            a = new ll();
        }
    }
}
