// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public final class nc
{

    private static nf a;

    public static void a(ViewGroup viewgroup, boolean flag)
    {
        a.a(viewgroup, false);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new nh();
        } else
        if (i >= 18)
        {
            a = new ng();
        } else
        if (i >= 14)
        {
            a = new ne();
        } else
        if (i >= 11)
        {
            a = new nd();
        } else
        {
            a = new nf();
        }
    }
}
