// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern.widget;


// Referenced classes of package group.pals.android.lib.ui.lockpattern.widget:
//            LockPatternView

public static final class  extends Enum
{

    private static final Wrong $VALUES[];
    public static final Wrong Animate;
    public static final Wrong Correct;
    public static final Wrong Wrong;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(group/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Correct = new <init>("Correct", 0);
        Animate = new <init>("Animate", 1);
        Wrong = new <init>("Wrong", 2);
        $VALUES = (new .VALUES[] {
            Correct, Animate, Wrong
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
