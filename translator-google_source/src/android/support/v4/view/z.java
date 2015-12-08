// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            ad, ac, ab, aa, 
//            ai

public final class z
{

    static final aa a;

    public static void a(LayoutInflater layoutinflater, ai ai)
    {
        a.a(layoutinflater, ai);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new ad();
        } else
        if (i >= 11)
        {
            a = new ac();
        } else
        {
            a = new ab();
        }
    }
}
