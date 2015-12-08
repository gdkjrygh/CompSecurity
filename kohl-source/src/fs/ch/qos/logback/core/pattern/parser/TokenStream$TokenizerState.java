// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;


// Referenced classes of package fs.ch.qos.logback.core.pattern.parser:
//            TokenStream

static final class  extends Enum
{

    private static final RIGHT_PARENTHESIS_STATE $VALUES[];
    public static final RIGHT_PARENTHESIS_STATE FORMAT_MODIFIER_STATE;
    public static final RIGHT_PARENTHESIS_STATE KEYWORD_STATE;
    public static final RIGHT_PARENTHESIS_STATE LITERAL_STATE;
    public static final RIGHT_PARENTHESIS_STATE OPTION_STATE;
    public static final RIGHT_PARENTHESIS_STATE RIGHT_PARENTHESIS_STATE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(fs/ch/qos/logback/core/pattern/parser/TokenStream$TokenizerState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LITERAL_STATE = new <init>("LITERAL_STATE", 0);
        FORMAT_MODIFIER_STATE = new <init>("FORMAT_MODIFIER_STATE", 1);
        KEYWORD_STATE = new <init>("KEYWORD_STATE", 2);
        OPTION_STATE = new <init>("OPTION_STATE", 3);
        RIGHT_PARENTHESIS_STATE = new <init>("RIGHT_PARENTHESIS_STATE", 4);
        $VALUES = (new .VALUES[] {
            LITERAL_STATE, FORMAT_MODIFIER_STATE, KEYWORD_STATE, OPTION_STATE, RIGHT_PARENTHESIS_STATE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
