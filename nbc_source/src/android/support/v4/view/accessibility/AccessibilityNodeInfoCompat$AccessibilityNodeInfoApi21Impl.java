// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatApi21

static class  extends 
{

    public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
    {
        return AccessibilityNodeInfoCompatApi21.obtainCollectionInfo(i, j, flag, k);
    }

    public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return AccessibilityNodeInfoCompatApi21.obtainCollectionItemInfo(i, j, k, l, flag, flag1);
    }

    public void setError(Object obj, CharSequence charsequence)
    {
        AccessibilityNodeInfoCompatApi21.setError(obj, charsequence);
    }

    public void setLabelFor(Object obj, View view)
    {
        AccessibilityNodeInfoCompatApi21.setLabelFor(obj, view);
    }

    ()
    {
    }
}
