// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.accessibility.AccessibilityEvent;

public final class ot
{

    private static final ow a;

    public static pw a(AccessibilityEvent accessibilityevent)
    {
        return new pw(accessibilityevent);
    }

    public static void a(AccessibilityEvent accessibilityevent, int i)
    {
        a.a(accessibilityevent, i);
    }

    public static int b(AccessibilityEvent accessibilityevent)
    {
        return a.a(accessibilityevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new ov();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new ou();
        } else
        {
            a = new ow();
        }
    }
}
