// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            ai, ah, ag, af, 
//            an

public final class ae
{

    static final af a;

    public static void a(LayoutInflater layoutinflater, an an)
    {
        a.a(layoutinflater, an);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new ai();
        } else
        if (i >= 11)
        {
            a = new ah();
        } else
        {
            a = new ag();
        }
    }
}
