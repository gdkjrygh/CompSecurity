// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import java.util.EnumMap;
import java.util.EnumSet;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordListActivity

static final class  extends Enum
{

    private static final UNLOADED $VALUES[];
    public static final UNLOADED ERROR;
    public static final UNLOADED LOADED;
    public static final UNLOADED LOADING_ADDITIONAL_PAGE;
    public static final UNLOADED LOADING_FIRST_PAGE;
    public static final UNLOADED UNLOADED;
    private static final EnumMap allowedTransitions;

    static void checkTransition( ,  1)
    {
        if ( != 1 && !((EnumSet)allowedTransitions.get()).contains(1))
        {
             = String.valueOf();
            1 = String.valueOf(1);
            throw new AssertionError((new StringBuilder(String.valueOf().length() + 39 + String.valueOf(1).length())).append("State transition from ").append().append(" to ").append(1).append(" not allowed.").toString());
        } else
        {
            return;
        }
    }

    public static allowedTransitions valueOf(String s)
    {
        return (allowedTransitions)Enum.valueOf(com/google/android/apps/wallet/purchaserecord/PurchaseRecordListActivity$State, s);
    }

    public static allowedTransitions[] values()
    {
        return (allowedTransitions[])$VALUES.clone();
    }

    static 
    {
        UNLOADED = new <init>("UNLOADED", 0);
        LOADING_FIRST_PAGE = new <init>("LOADING_FIRST_PAGE", 1);
        LOADING_ADDITIONAL_PAGE = new <init>("LOADING_ADDITIONAL_PAGE", 2);
        LOADED = new <init>("LOADED", 3);
        ERROR = new <init>("ERROR", 4);
        $VALUES = (new .VALUES[] {
            UNLOADED, LOADING_FIRST_PAGE, LOADING_ADDITIONAL_PAGE, LOADED, ERROR
        });
        EnumMap enummap = new EnumMap(com/google/android/apps/wallet/purchaserecord/PurchaseRecordListActivity$State);
        allowedTransitions = enummap;
        enummap.put(UNLOADED, EnumSet.of(ERROR, LOADING_FIRST_PAGE, LOADED, UNLOADED));
        allowedTransitions.put(LOADING_ADDITIONAL_PAGE, EnumSet.of(LOADED, ERROR, UNLOADED));
        allowedTransitions.put(LOADING_FIRST_PAGE, EnumSet.of(LOADED, ERROR, UNLOADED));
        allowedTransitions.put(LOADED, EnumSet.of(LOADING_ADDITIONAL_PAGE, LOADING_FIRST_PAGE, ERROR, UNLOADED));
        allowedTransitions.put(ERROR, EnumSet.of(LOADING_FIRST_PAGE, UNLOADED));
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
