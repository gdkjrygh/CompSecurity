// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.accessibility.AccessibilityRecord;

static class > extends >
{

    public final Object a()
    {
        return AccessibilityRecord.obtain();
    }

    public final void a(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setFromIndex(i);
    }

    public final void a(Object obj, boolean flag)
    {
        ((AccessibilityRecord)obj).setScrollable(flag);
    }

    public final void b(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setItemCount(i);
    }

    public final void c(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setScrollX(i);
    }

    public final void d(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setScrollY(i);
    }

    public final void e(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setToIndex(i);
    }

    >()
    {
    }
}
