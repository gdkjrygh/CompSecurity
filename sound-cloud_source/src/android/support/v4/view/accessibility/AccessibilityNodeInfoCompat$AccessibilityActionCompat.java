// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

public static class <init>
{

    private final Object mAction;

    public int getId()
    {
        return AccessibilityNodeInfoCompat.access$000().getAccessibilityActionId(mAction);
    }

    public CharSequence getLabel()
    {
        return AccessibilityNodeInfoCompat.access$000().getAccessibilityActionLabel(mAction);
    }


    public a(int i, CharSequence charsequence)
    {
        this(AccessibilityNodeInfoCompat.access$000().newAccessibilityAction(i, charsequence));
    }

    private newAccessibilityAction(Object obj)
    {
        mAction = obj;
    }

    mAction(Object obj, mAction maction)
    {
        this(obj);
    }
}
