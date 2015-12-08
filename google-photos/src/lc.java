// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;

public final class lc
{

    private static ld a;

    public static void a(LayoutInflater layoutinflater, li li)
    {
        a.a(layoutinflater, li);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new lf();
        } else
        if (i >= 11)
        {
            a = new le();
        } else
        {
            a = new ld();
        }
    }
}
