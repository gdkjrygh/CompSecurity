// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;


// Referenced classes of package butterknife:
//            OnTextChanged

public static final class  extends Enum
{

    private static final AFTER_TEXT_CHANGED $VALUES[];
    public static final AFTER_TEXT_CHANGED AFTER_TEXT_CHANGED;
    public static final AFTER_TEXT_CHANGED BEFORE_TEXT_CHANGED;
    public static final AFTER_TEXT_CHANGED TEXT_CHANGED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(butterknife/OnTextChanged$Callback, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TEXT_CHANGED = new <init>("TEXT_CHANGED", 0);
        BEFORE_TEXT_CHANGED = new <init>("BEFORE_TEXT_CHANGED", 1);
        AFTER_TEXT_CHANGED = new <init>("AFTER_TEXT_CHANGED", 2);
        $VALUES = (new .VALUES[] {
            TEXT_CHANGED, BEFORE_TEXT_CHANGED, AFTER_TEXT_CHANGED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
