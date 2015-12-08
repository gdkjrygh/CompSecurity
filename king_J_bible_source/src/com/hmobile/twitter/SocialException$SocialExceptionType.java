// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;


// Referenced classes of package com.hmobile.twitter:
//            SocialException

public static final class  extends Enum
{

    public static final ConsumerDataNotSet APP_IdNotSet;
    public static final ConsumerDataNotSet ConsumerDataNotSet;
    public static final ConsumerDataNotSet ContextNotSet;
    private static final ConsumerDataNotSet ENUM$VALUES[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/hmobile/twitter/SocialException$SocialExceptionType, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        ContextNotSet = new <init>("ContextNotSet", 0);
        APP_IdNotSet = new <init>("APP_IdNotSet", 1);
        ConsumerDataNotSet = new <init>("ConsumerDataNotSet", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            ContextNotSet, APP_IdNotSet, ConsumerDataNotSet
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
