// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;


// Referenced classes of package com.google.android.apps.wallet.wobs.provider:
//            SyncWobsStatusPublisher

public static final class Y extends Enum
{

    private static final FAIL $VALUES[];
    public static final FAIL FAIL;
    public static final FAIL IN_PROGRESS;
    public static final FAIL SUCCESS;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/google/android/apps/wallet/wobs/provider/SyncWobsStatusPublisher$SyncWobsStatus, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        IN_PROGRESS = new <init>("IN_PROGRESS", 0);
        SUCCESS = new <init>("SUCCESS", 1);
        FAIL = new <init>("FAIL", 2);
        $VALUES = (new .VALUES[] {
            IN_PROGRESS, SUCCESS, FAIL
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
