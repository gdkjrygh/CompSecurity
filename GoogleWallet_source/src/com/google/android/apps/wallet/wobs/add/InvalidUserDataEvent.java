// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;

public final class InvalidUserDataEvent extends CallErrorException
{

    private final ImmutableList promptIds;

    public InvalidUserDataEvent(com.google.wallet.proto.NanoWalletError.CallError callerror, int ai[])
    {
        super(callerror);
        promptIds = ImmutableList.copyOf(Ints.asList(ai));
    }

    public final ImmutableList getPromptIds()
    {
        return promptIds;
    }
}
