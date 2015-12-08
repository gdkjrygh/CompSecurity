// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            cu, ct, cr, cq, 
//            cv, cs

public final class cp
{

    static final cs a;

    public static void a(ViewGroup viewgroup)
    {
        a.a(viewgroup);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new cu();
        } else
        if (i >= 18)
        {
            a = new ct();
        } else
        if (i >= 14)
        {
            a = new cr();
        } else
        if (i >= 11)
        {
            a = new cq();
        } else
        {
            a = new cv();
        }
    }
}
