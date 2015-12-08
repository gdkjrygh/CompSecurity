// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            cx, cw, cu, ct, 
//            cy, cv

public class cs
{

    static final cv a;

    public static void a(ViewGroup viewgroup, boolean flag)
    {
        a.a(viewgroup, flag);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new cx();
        } else
        if (i >= 18)
        {
            a = new cw();
        } else
        if (i >= 14)
        {
            a = new cu();
        } else
        if (i >= 11)
        {
            a = new ct();
        } else
        {
            a = new cy();
        }
    }
}
