// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;


// Referenced classes of package com.hmobile.model:
//            ServiceHelper

public static final class  extends Enum
{

    private static final POST ENUM$VALUES[];
    public static final POST GET;
    public static final POST POST;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/hmobile/model/ServiceHelper$RequestMethod, s);
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
        GET = new <init>("GET", 0);
        POST = new <init>("POST", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            GET, POST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
