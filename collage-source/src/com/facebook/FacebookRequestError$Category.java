// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            FacebookRequestError

public static final class  extends Enum
{

    private static final TRANSIENT $VALUES[];
    public static final TRANSIENT LOGIN_RECOVERABLE;
    public static final TRANSIENT OTHER;
    public static final TRANSIENT TRANSIENT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/FacebookRequestError$Category, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOGIN_RECOVERABLE = new <init>("LOGIN_RECOVERABLE", 0);
        OTHER = new <init>("OTHER", 1);
        TRANSIENT = new <init>("TRANSIENT", 2);
        $VALUES = (new .VALUES[] {
            LOGIN_RECOVERABLE, OTHER, TRANSIENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
