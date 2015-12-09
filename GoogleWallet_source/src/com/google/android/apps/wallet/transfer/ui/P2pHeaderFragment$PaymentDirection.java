// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.ui;

import android.content.res.TypedArray;

// Referenced classes of package com.google.android.apps.wallet.transfer.ui:
//            P2pHeaderFragment

public static final class scaleX extends Enum
{

    private static final FROM_CONTACT_TO_USER $VALUES[];
    public static final FROM_CONTACT_TO_USER FROM_CONTACT_TO_USER;
    public static final FROM_CONTACT_TO_USER FROM_USER_TO_CONTACT;
    final int scaleX;

    private static scaleX fromAttributes(TypedArray typedarray)
    {
        if (typedarray != null && typedarray.getInt(com.google.android.apps.walletnfcrel.ntDirection, 0) == 1)
        {
            return FROM_CONTACT_TO_USER;
        } else
        {
            return FROM_USER_TO_CONTACT;
        }
    }

    public static FROM_USER_TO_CONTACT valueOf(String s)
    {
        return (FROM_USER_TO_CONTACT)Enum.valueOf(com/google/android/apps/wallet/transfer/ui/P2pHeaderFragment$PaymentDirection, s);
    }

    public static FROM_USER_TO_CONTACT[] values()
    {
        return (FROM_USER_TO_CONTACT[])$VALUES.clone();
    }

    static 
    {
        FROM_USER_TO_CONTACT = new <init>("FROM_USER_TO_CONTACT", 0, 1);
        FROM_CONTACT_TO_USER = new <init>("FROM_CONTACT_TO_USER", 1, -1);
        $VALUES = (new .VALUES[] {
            FROM_USER_TO_CONTACT, FROM_CONTACT_TO_USER
        });
    }


    private (String s, int i, int j)
    {
        super(s, i);
        scaleX = j;
    }
}
