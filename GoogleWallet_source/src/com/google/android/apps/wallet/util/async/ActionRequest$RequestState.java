// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;


// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ActionRequest

public static final class  extends Enum
{

    private static final COMPLETED $VALUES[];
    public static final COMPLETED CANCELLED;
    public static final COMPLETED COMPLETED;
    public static final COMPLETED PENDING;
    public static final COMPLETED RUNNING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/util/async/ActionRequest$RequestState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    final boolean isFinished()
    {
        return this == CANCELLED || this == COMPLETED;
    }

    static 
    {
        PENDING = new <init>("PENDING", 0);
        CANCELLED = new <init>("CANCELLED", 1);
        RUNNING = new <init>("RUNNING", 2);
        COMPLETED = new <init>("COMPLETED", 3);
        $VALUES = (new .VALUES[] {
            PENDING, CANCELLED, RUNNING, COMPLETED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
