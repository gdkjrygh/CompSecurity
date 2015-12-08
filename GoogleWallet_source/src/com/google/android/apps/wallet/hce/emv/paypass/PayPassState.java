// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv.paypass;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;

// Referenced classes of package com.google.android.apps.wallet.hce.emv.paypass:
//            PayPassCommandApduIns

final class PayPassState extends Enum
{

    private static final PayPassState $VALUES[];
    public static final PayPassState IDLE;
    public static final PayPassState INITIATED;
    public static final PayPassState SELECTED;
    private final Collection mAcceptedCommands;

    private PayPassState(String s, int i, Collection collection)
    {
        super(s, i);
        mAcceptedCommands = collection;
    }

    public static PayPassState valueOf(String s)
    {
        return (PayPassState)Enum.valueOf(com/google/android/apps/wallet/hce/emv/paypass/PayPassState, s);
    }

    public static PayPassState[] values()
    {
        return (PayPassState[])$VALUES.clone();
    }

    final boolean acceptsCommand(PayPassCommandApduIns paypasscommandapduins)
    {
        return mAcceptedCommands.contains(paypasscommandapduins);
    }

    static 
    {
        IDLE = new PayPassState("IDLE", 0, ImmutableSet.of(PayPassCommandApduIns.SELECT));
        SELECTED = new PayPassState("SELECTED", 1, ImmutableSet.of(PayPassCommandApduIns.SELECT, PayPassCommandApduIns.GPO, PayPassCommandApduIns.READ_RECORD));
        INITIATED = new PayPassState("INITIATED", 2, ImmutableSet.of(PayPassCommandApduIns.SELECT, PayPassCommandApduIns.READ_RECORD, PayPassCommandApduIns.CCC));
        $VALUES = (new PayPassState[] {
            IDLE, SELECTED, INITIATED
        });
    }
}
