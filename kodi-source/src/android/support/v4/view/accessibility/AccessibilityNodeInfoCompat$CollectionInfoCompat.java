// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

public static class mInfo
{

    final Object mInfo;

    public static mInfo obtain(int i, int j, boolean flag, int k)
    {
        return new <init>(AccessibilityNodeInfoCompat.access$000().obtainCollectionInfo(i, j, flag, k));
    }

    private Impl(Object obj)
    {
        mInfo = obj;
    }
}
