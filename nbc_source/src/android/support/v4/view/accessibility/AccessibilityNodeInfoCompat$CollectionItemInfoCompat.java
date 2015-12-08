// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

public static class mInfo
{

    private final Object mInfo;

    public static mInfo obtain(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return new <init>(AccessibilityNodeInfoCompat.access$000().obtainCollectionItemInfo(i, j, k, l, flag, flag1));
    }


    private (Object obj)
    {
        mInfo = obj;
    }
}
