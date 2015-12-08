// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;


// Referenced classes of package com.google.android.apps.wallet.wobs:
//            NewWobListFragment

static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR COMPLETE;
    public static final ERROR ERROR;
    public static final ERROR LOADING_TAIL;
    public static final ERROR PARTIALLY_LOADED;
    public static final ERROR UNINITIALIZED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/wobs/NewWobListFragment$ListLoadStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNINITIALIZED = new <init>("UNINITIALIZED", 0);
        PARTIALLY_LOADED = new <init>("PARTIALLY_LOADED", 1);
        LOADING_TAIL = new <init>("LOADING_TAIL", 2);
        COMPLETE = new <init>("COMPLETE", 3);
        ERROR = new <init>("ERROR", 4);
        $VALUES = (new .VALUES[] {
            UNINITIALIZED, PARTIALLY_LOADED, LOADING_TAIL, COMPLETE, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
