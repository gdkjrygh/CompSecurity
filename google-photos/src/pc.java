// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.accessibility.AccessibilityNodeInfo;

class pc extends pj
{

    pc()
    {
    }

    public final Object a(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, flag1);
    }

    public final Object a(int i, int j, boolean flag, int k)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag, k);
    }

    public final Object a(int i, CharSequence charsequence)
    {
        return new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i, charsequence);
    }

    public final boolean a(Object obj, Object obj1)
    {
        return ((AccessibilityNodeInfo)obj).removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj1);
    }
}
