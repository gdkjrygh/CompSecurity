// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;


// Referenced classes of package butterknife:
//            OnPageChange

public static final class  extends Enum
{

    private static final PAGE_SCROLL_STATE_CHANGED $VALUES[];
    public static final PAGE_SCROLL_STATE_CHANGED PAGE_SCROLLED;
    public static final PAGE_SCROLL_STATE_CHANGED PAGE_SCROLL_STATE_CHANGED;
    public static final PAGE_SCROLL_STATE_CHANGED PAGE_SELECTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(butterknife/OnPageChange$Callback, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PAGE_SELECTED = new <init>("PAGE_SELECTED", 0);
        PAGE_SCROLLED = new <init>("PAGE_SCROLLED", 1);
        PAGE_SCROLL_STATE_CHANGED = new <init>("PAGE_SCROLL_STATE_CHANGED", 2);
        $VALUES = (new .VALUES[] {
            PAGE_SELECTED, PAGE_SCROLLED, PAGE_SCROLL_STATE_CHANGED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
