// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.view.accessibility.AccessibilityRecord;

// Referenced classes of package android.support.v4.view.a:
//            ae

class af extends ae
{

    af()
    {
    }

    public final void f(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setMaxScrollX(i);
    }

    public final void g(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setMaxScrollY(i);
    }
}
