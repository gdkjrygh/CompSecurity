// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.events;

import com.appboy.models.ResponseError;
import com.appboy.models.outgoing.Feedback;

public final class SubmitFeedbackFailed
{

    private final Feedback a;
    private final ResponseError b;

    public SubmitFeedbackFailed(Feedback feedback, ResponseError responseerror)
    {
        a = feedback;
        b = responseerror;
    }

    public final ResponseError getError()
    {
        return b;
    }

    public final Feedback getFeedback()
    {
        return a;
    }
}
