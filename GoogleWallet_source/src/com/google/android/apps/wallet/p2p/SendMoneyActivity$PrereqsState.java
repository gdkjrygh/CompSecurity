// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;


// Referenced classes of package com.google.android.apps.wallet.p2p:
//            SendMoneyActivity

static final class  extends Enum
{

    private static final SATISFIED $VALUES[];
    public static final SATISFIED REQUIRED;
    public static final SATISFIED SATISFIED;
    public static final SATISFIED STARTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/p2p/SendMoneyActivity$PrereqsState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        REQUIRED = new <init>("REQUIRED", 0);
        STARTED = new <init>("STARTED", 1);
        SATISFIED = new <init>("SATISFIED", 2);
        $VALUES = (new .VALUES[] {
            REQUIRED, STARTED, SATISFIED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
