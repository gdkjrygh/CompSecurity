// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.callstatus;

import com.google.common.base.Preconditions;

public class CallErrorException extends Exception
{

    private final com.google.wallet.proto.NanoWalletError.CallError callError;

    public CallErrorException(com.google.wallet.proto.NanoWalletError.CallError callerror)
    {
        Preconditions.checkNotNull(callerror);
        callError = callerror;
    }

    public final com.google.wallet.proto.NanoWalletError.CallError getCallError()
    {
        return callError;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("CallError:");
        stringbuilder.append(" errorCode=");
        if (callError.errorCode != null)
        {
            stringbuilder.append(callError.errorCode);
        } else
        {
            stringbuilder.append("?");
        }
        if (callError.title != null || callError.content != null)
        {
            stringbuilder.append(" [");
            if (callError.title != null)
            {
                stringbuilder.append("(").append(callError.title).append(") ");
            }
            if (callError.content != null)
            {
                stringbuilder.append(callError.content).append(" ");
            }
            stringbuilder.setLength(stringbuilder.length() - 1);
            stringbuilder.append("]");
        }
        return stringbuilder.toString();
    }
}
