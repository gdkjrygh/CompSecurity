// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.subst;


// Referenced classes of package fs.ch.qos.logback.core.subst:
//            Token

public static final class  extends Enum
{

    private static final DEFAULT $VALUES[];
    public static final DEFAULT CURLY_LEFT;
    public static final DEFAULT CURLY_RIGHT;
    public static final DEFAULT DEFAULT;
    public static final DEFAULT LITERAL;
    public static final DEFAULT START;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(fs/ch/qos/logback/core/subst/Token$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LITERAL = new <init>("LITERAL", 0);
        START = new <init>("START", 1);
        CURLY_LEFT = new <init>("CURLY_LEFT", 2);
        CURLY_RIGHT = new <init>("CURLY_RIGHT", 3);
        DEFAULT = new <init>("DEFAULT", 4);
        $VALUES = (new .VALUES[] {
            LITERAL, START, CURLY_LEFT, CURLY_RIGHT, DEFAULT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
