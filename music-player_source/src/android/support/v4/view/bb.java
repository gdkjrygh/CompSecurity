// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            bf, bd, bc, bg, 
//            be

public final class bb
{

    static final be a;

    public static void a(ViewGroup viewgroup)
    {
        a.a(viewgroup);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 18)
        {
            a = new bf();
        } else
        if (i >= 14)
        {
            a = new bd();
        } else
        if (i >= 11)
        {
            a = new bc();
        } else
        {
            a = new bg();
        }
    }
}
