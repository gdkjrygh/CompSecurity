// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.constraints;


// Referenced classes of package javax.validation.constraints:
//            Pattern

public static final class value extends Enum
{

    private static final CANON_EQ $VALUES[];
    private static CANON_EQ CANON_EQ;
    private static CANON_EQ CASE_INSENSITIVE;
    private static CANON_EQ COMMENTS;
    private static CANON_EQ DOTALL;
    private static CANON_EQ MULTILINE;
    private static CANON_EQ UNICODE_CASE;
    private static CANON_EQ UNIX_LINES;
    private final int value;

    private int getValue()
    {
        return value;
    }

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(javax/validation/constraints/Pattern$Flag, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        UNIX_LINES = new <init>("UNIX_LINES", 0, 1);
        CASE_INSENSITIVE = new <init>("CASE_INSENSITIVE", 1, 2);
        COMMENTS = new <init>("COMMENTS", 2, 4);
        MULTILINE = new <init>("MULTILINE", 3, 8);
        DOTALL = new <init>("DOTALL", 4, 32);
        UNICODE_CASE = new <init>("UNICODE_CASE", 5, 64);
        CANON_EQ = new <init>("CANON_EQ", 6, 128);
        $VALUES = (new .VALUES[] {
            UNIX_LINES, CASE_INSENSITIVE, COMMENTS, MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
