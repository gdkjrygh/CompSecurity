// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

static class _cls2Impl extends _cls2Impl
{

    public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
    {
        return android.view.accessibility.KitKatImpl(i, j, false);
    }

    public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return android.view.accessibility.KitKatImpl(i, j, k, l, flag);
    }

    public final void setCollectionInfo(Object obj, Object obj1)
    {
        ((AccessibilityNodeInfo)obj).setCollectionInfo((android.view.accessibility.KitKatImpl)obj1);
    }

    public final void setCollectionItemInfo(Object obj, Object obj1)
    {
        ((AccessibilityNodeInfo)obj).setCollectionItemInfo((android.view.accessibility.KitKatImpl)obj1);
    }

    _cls2Impl()
    {
    }
}
