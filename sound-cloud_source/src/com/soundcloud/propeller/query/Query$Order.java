// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;


// Referenced classes of package com.soundcloud.propeller.query:
//            Query

public static final class  extends Enum
{

    private static final DESC $VALUES[];
    public static final DESC ASC;
    public static final DESC DESC;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/propeller/query/Query$Order, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ASC = new <init>("ASC", 0);
        DESC = new <init>("DESC", 1);
        $VALUES = (new .VALUES[] {
            ASC, DESC
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
