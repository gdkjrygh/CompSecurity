// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager.exception;

import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.s3.transfermanager.PauseStatus;

public class PauseException extends AmazonClientException
{

    private static final long serialVersionUID = 1L;
    private final PauseStatus status;

    public PauseException(PauseStatus pausestatus)
    {
        super((new StringBuilder()).append("Failed to pause operation; status=").append(pausestatus).toString());
        if (pausestatus == null || pausestatus == PauseStatus.a)
        {
            throw new IllegalArgumentException();
        } else
        {
            status = pausestatus;
            return;
        }
    }

    public PauseStatus a()
    {
        return status;
    }

    public boolean isRetryable()
    {
        return false;
    }
}
