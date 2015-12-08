// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.callstatus;

import android.content.Context;
import com.google.common.base.Preconditions;

public final class CallStatus
{

    public static final CallStatus SUCCESS = new CallStatus(true, null, 0, 0);
    private final com.google.wallet.proto.NanoWalletError.CallError callError;
    private final int errorMessageId;
    private final int errorTitleId;
    private final boolean success;

    private CallStatus(boolean flag, com.google.wallet.proto.NanoWalletError.CallError callerror, int i, int j)
    {
        success = flag;
        if (callerror == null || callerror.title == null || callerror.content == null)
        {
            callerror = null;
        }
        callError = callerror;
        errorTitleId = i;
        errorMessageId = j;
    }

    public static CallStatus failure(int i, int j)
    {
        return new CallStatus(false, null, i, j);
    }

    public static CallStatus failure(com.google.wallet.proto.NanoWalletError.CallError callerror, int i, int j)
    {
        Preconditions.checkNotNull(callerror);
        return new CallStatus(false, callerror, i, j);
    }

    public final String getDisplayableErrorMessage(Context context)
    {
        boolean flag;
        if (!isSuccess())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (callError == null)
        {
            return context.getString(errorMessageId);
        } else
        {
            return callError.content;
        }
    }

    public final String getDisplayableErrorTitle(Context context)
    {
        boolean flag;
        if (!isSuccess())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (callError == null)
        {
            return context.getString(errorTitleId);
        } else
        {
            return callError.title;
        }
    }

    public final boolean isSuccess()
    {
        return success;
    }

}
