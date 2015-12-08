// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Formatter

private static final class  extends Enum
{

    private static final END $VALUES[];
    public static final END COMMENT;
    public static final END END;
    public static final END START;
    public static final END TEXT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(fs/org/simpleframework/xml/stream/Formatter$Tag, s);
    }

    public static final [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        COMMENT = new <init>("COMMENT", 0);
        START = new <init>("START", 1);
        TEXT = new <init>("TEXT", 2);
        END = new <init>("END", 3);
        $VALUES = (new .VALUES[] {
            COMMENT, START, TEXT, END
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
