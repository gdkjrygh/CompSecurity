// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;


// Referenced classes of package android.support.v4.view.a:
//            m

class g extends m
{

    g()
    {
    }

    public final Object a(int i, int j)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, false, 0);
    }

    public final Object a(int i, int j, int k, int l, boolean flag)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, false);
    }
}
