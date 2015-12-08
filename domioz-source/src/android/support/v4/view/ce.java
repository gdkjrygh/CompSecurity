// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            ci, ch, cg, cf, 
//            cj

public final class ce
{

    static final cj a;

    public static boolean a(ViewConfiguration viewconfiguration)
    {
        return a.a(viewconfiguration);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new ci();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new ch();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a = new cg();
        } else
        {
            a = new cf();
        }
    }
}
