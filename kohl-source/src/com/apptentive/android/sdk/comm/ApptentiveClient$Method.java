// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.comm;


// Referenced classes of package com.apptentive.android.sdk.comm:
//            ApptentiveClient

private static final class  extends Enum
{

    private static final POST $VALUES[];
    public static final POST GET;
    public static final POST POST;
    public static final POST PUT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/apptentive/android/sdk/comm/ApptentiveClient$Method, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GET = new <init>("GET", 0);
        PUT = new <init>("PUT", 1);
        POST = new <init>("POST", 2);
        $VALUES = (new .VALUES[] {
            GET, PUT, POST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
