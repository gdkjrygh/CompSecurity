// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.service;

import com.google.android.gms.common.api.Status;

public final class OperationException extends Exception
{

    private final Status mStatus;

    public final String toString()
    {
        return (new StringBuilder("OperationException[")).append(mStatus.toString()).append("]").toString();
    }
}
