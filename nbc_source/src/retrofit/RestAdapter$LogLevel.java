// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            RestAdapter

public static final class  extends Enum
{

    private static final FULL $VALUES[];
    public static final FULL BASIC;
    public static final FULL FULL;
    public static final FULL HEADERS;
    public static final FULL HEADERS_AND_ARGS;
    public static final FULL NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(retrofit/RestAdapter$LogLevel, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public boolean log()
    {
        return this != NONE;
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        BASIC = new <init>("BASIC", 1);
        HEADERS = new <init>("HEADERS", 2);
        HEADERS_AND_ARGS = new <init>("HEADERS_AND_ARGS", 3);
        FULL = new <init>("FULL", 4);
        $VALUES = (new .VALUES[] {
            NONE, BASIC, HEADERS, HEADERS_AND_ARGS, FULL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
