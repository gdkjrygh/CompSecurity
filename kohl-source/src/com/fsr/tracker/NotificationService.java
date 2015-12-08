// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import com.fsr.tracker.domain.MeasureConfiguration;

public interface NotificationService
{

    public abstract void notifyInApp(String s, String s1, MeasureConfiguration measureconfiguration, String s2, String s3);

    public abstract void notifyInBrowser(String s, String s1, String s2, String s3, String s4);
}
