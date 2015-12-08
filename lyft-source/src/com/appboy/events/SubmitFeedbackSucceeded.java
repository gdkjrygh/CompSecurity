// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.events;

import com.appboy.models.outgoing.Feedback;

public final class SubmitFeedbackSucceeded
{

    private final Feedback a;

    public SubmitFeedbackSucceeded(Feedback feedback)
    {
        a = feedback;
    }

    public final Feedback getFeedback()
    {
        return a;
    }
}
