// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;


// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            TokenRequest

public static final class  extends Enum
{

    private static final REJECTED $VALUES[];
    public static final REJECTED GRANTED;
    public static final REJECTED REJECTED;
    public static final REJECTED UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/auth/firstparty/dataservice/TokenRequest$Consent, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        GRANTED = new <init>("GRANTED", 1);
        REJECTED = new <init>("REJECTED", 2);
        $VALUES = (new .VALUES[] {
            UNKNOWN, GRANTED, REJECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
