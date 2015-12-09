// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

public static class <init>
{

    public static final mAction ACTION_ACCESSIBILITY_FOCUS = new <init>(64, ((CharSequence) (null)));
    public static final <init> ACTION_CLEAR_ACCESSIBILITY_FOCUS = new <init>(128, ((CharSequence) (null)));
    public static final <init> ACTION_CLEAR_FOCUS = new <init>(2, ((CharSequence) (null)));
    public static final <init> ACTION_CLEAR_SELECTION = new <init>(8, ((CharSequence) (null)));
    public static final <init> ACTION_CLICK = new <init>(16, ((CharSequence) (null)));
    public static final <init> ACTION_COLLAPSE = new <init>(0x80000, ((CharSequence) (null)));
    public static final <init> ACTION_COPY = new <init>(16384, ((CharSequence) (null)));
    public static final <init> ACTION_CUT = new <init>(0x10000, ((CharSequence) (null)));
    public static final <init> ACTION_DISMISS = new <init>(0x100000, ((CharSequence) (null)));
    public static final <init> ACTION_EXPAND = new <init>(0x40000, ((CharSequence) (null)));
    public static final <init> ACTION_FOCUS = new <init>(1, ((CharSequence) (null)));
    public static final <init> ACTION_LONG_CLICK = new <init>(32, ((CharSequence) (null)));
    public static final <init> ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new <init>(256, ((CharSequence) (null)));
    public static final <init> ACTION_NEXT_HTML_ELEMENT = new <init>(1024, ((CharSequence) (null)));
    public static final <init> ACTION_PASTE = new <init>(32768, ((CharSequence) (null)));
    public static final <init> ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new <init>(512, ((CharSequence) (null)));
    public static final <init> ACTION_PREVIOUS_HTML_ELEMENT = new <init>(2048, ((CharSequence) (null)));
    public static final <init> ACTION_SCROLL_BACKWARD = new <init>(8192, ((CharSequence) (null)));
    public static final <init> ACTION_SCROLL_FORWARD = new <init>(4096, ((CharSequence) (null)));
    public static final <init> ACTION_SELECT = new <init>(4, ((CharSequence) (null)));
    public static final <init> ACTION_SET_SELECTION = new <init>(0x20000, ((CharSequence) (null)));
    public static final <init> ACTION_SET_TEXT = new <init>(0x200000, ((CharSequence) (null)));
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
