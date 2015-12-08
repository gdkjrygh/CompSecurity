// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            cn, cm, cl, ck, 
//            co

public final class cj
{

    static final co a;

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
            a = new cn();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new cm();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a = new cl();
        } else
        {
            a = new ck();
        }
    }
}
