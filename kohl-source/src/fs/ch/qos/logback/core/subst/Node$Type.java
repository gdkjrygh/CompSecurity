// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.subst;


// Referenced classes of package fs.ch.qos.logback.core.subst:
//            Node

static final class  extends Enum
{

    private static final VARIABLE $VALUES[];
    public static final VARIABLE LITERAL;
    public static final VARIABLE VARIABLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(fs/ch/qos/logback/core/subst/Node$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LITERAL = new <init>("LITERAL", 0);
        VARIABLE = new <init>("VARIABLE", 1);
        $VALUES = (new .VALUES[] {
            LITERAL, VARIABLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
