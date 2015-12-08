// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


public final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE CENTER;
    public static final NONE LEFT;
    public static final NONE NONE;
    public static final NONE RIGHT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(twitter4j/OEmbedRequest$Align, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LEFT = new <init>("LEFT", 0);
        CENTER = new <init>("CENTER", 1);
        RIGHT = new <init>("RIGHT", 2);
        NONE = new <init>("NONE", 3);
        $VALUES = (new .VALUES[] {
            LEFT, CENTER, RIGHT, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
