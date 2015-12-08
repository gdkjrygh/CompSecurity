// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


// Referenced classes of package twitter4j:
//            Query

public static final class  extends Enum
{

    private static final recent $VALUES[];
    public static final recent mixed;
    public static final recent popular;
    public static final recent recent;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(twitter4j/Query$ResultType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        popular = new <init>("popular", 0);
        mixed = new <init>("mixed", 1);
        recent = new <init>("recent", 2);
        $VALUES = (new .VALUES[] {
            popular, mixed, recent
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
