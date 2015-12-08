// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.sender;

import com.facebook.acra.CrashReportData;

public interface ReportSender
{

    public abstract void send(CrashReportData crashreportdata);
}
