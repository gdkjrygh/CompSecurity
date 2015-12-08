// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

public class <init>
{

    public static final int SELECTION_MODE_MULTIPLE = 2;
    public static final int SELECTION_MODE_NONE = 0;
    public static final int SELECTION_MODE_SINGLE = 1;
    final Object mInfo;

    public static <init> obtain(int i, int j, boolean flag, int k)
    {
        return new <init>(AccessibilityNodeInfoCompat.access$000().obtainCollectionInfo(i, j, flag, k));
    }

    public int getColumnCount()
    {
        return AccessibilityNodeInfoCompat.access$000().getCollectionInfoColumnCount(mInfo);
    }

    public int getRowCount()
    {
        return AccessibilityNodeInfoCompat.access$000().getCollectionInfoRowCount(mInfo);
    }

    public boolean isHierarchical()
    {
        return AccessibilityNodeInfoCompat.access$000().isCollectionInfoHierarchical(mInfo);
    }

    private Impl(Object obj)
    {
        mInfo = obj;
    }

    mInfo(Object obj, mInfo minfo)
    {
        this(obj);
    }
}
