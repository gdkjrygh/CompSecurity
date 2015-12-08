// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            ag, af, ae, ad, 
//            am

public class ac
{

    static final ad a;

    public static void a(LayoutInflater layoutinflater, am am)
    {
        a.a(layoutinflater, am);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new ag();
        } else
        if (i >= 11)
        {
            a = new af();
        } else
        {
            a = new ae();
        }
    }
}
