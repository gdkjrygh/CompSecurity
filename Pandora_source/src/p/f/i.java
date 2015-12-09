// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.f;

import android.view.accessibility.AccessibilityRecord;

class i
{

    public static Object a()
    {
        return AccessibilityRecord.obtain();
    }

    public static void a(Object obj, int j)
    {
        ((AccessibilityRecord)obj).setFromIndex(j);
    }

    public static void a(Object obj, boolean flag)
    {
        ((AccessibilityRecord)obj).setScrollable(flag);
    }

    public static void b(Object obj, int j)
    {
        ((AccessibilityRecord)obj).setItemCount(j);
    }

    public static void c(Object obj, int j)
    {
        ((AccessibilityRecord)obj).setToIndex(j);
    }
}
