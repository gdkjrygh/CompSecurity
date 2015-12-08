// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.a:
//            c, b, d, ad, 
//            e

public final class a
{

    private static final e a;

    public static ad a(AccessibilityEvent accessibilityevent)
    {
        return new ad(accessibilityevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new b();
        } else
        {
            a = new d();
        }
    }
}
