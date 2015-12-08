// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.subst;


// Referenced classes of package fs.ch.qos.logback.core.subst:
//            Tokenizer

static final class  extends Enum
{

    private static final DEFAULT_VAL_STATE $VALUES[];
    public static final DEFAULT_VAL_STATE DEFAULT_VAL_STATE;
    public static final DEFAULT_VAL_STATE LITERAL_STATE;
    public static final DEFAULT_VAL_STATE START_STATE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(fs/ch/qos/logback/core/subst/Tokenizer$TokenizerState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LITERAL_STATE = new <init>("LITERAL_STATE", 0);
        START_STATE = new <init>("START_STATE", 1);
        DEFAULT_VAL_STATE = new <init>("DEFAULT_VAL_STATE", 2);
        $VALUES = (new .VALUES[] {
            LITERAL_STATE, START_STATE, DEFAULT_VAL_STATE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
