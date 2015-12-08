// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;


// Referenced classes of package butterknife:
//            OnItemSelected

public static final class  extends Enum
{

    private static final NOTHING_SELECTED $VALUES[];
    public static final NOTHING_SELECTED ITEM_SELECTED;
    public static final NOTHING_SELECTED NOTHING_SELECTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(butterknife/OnItemSelected$Callback, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ITEM_SELECTED = new <init>("ITEM_SELECTED", 0);
        NOTHING_SELECTED = new <init>("NOTHING_SELECTED", 1);
        $VALUES = (new .VALUES[] {
            ITEM_SELECTED, NOTHING_SELECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
