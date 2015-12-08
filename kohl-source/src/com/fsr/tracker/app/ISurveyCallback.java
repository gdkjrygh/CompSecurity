// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.content.Context;

public interface ISurveyCallback
{

    public abstract Context getContext();

    public abstract void surveyAborted();

    public abstract void surveyCompleted();
}
