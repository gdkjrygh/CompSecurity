// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra;


public final class ReportingInteractionMode extends Enum
{

    private static final ReportingInteractionMode $VALUES[];
    public static final ReportingInteractionMode NOTIFICATION;
    public static final ReportingInteractionMode SILENT;
    public static final ReportingInteractionMode TOAST;

    private ReportingInteractionMode(String s, int i)
    {
        super(s, i);
    }

    public static ReportingInteractionMode valueOf(String s)
    {
        return (ReportingInteractionMode)Enum.valueOf(org/acra/ReportingInteractionMode, s);
    }

    public static ReportingInteractionMode[] values()
    {
        return (ReportingInteractionMode[])$VALUES.clone();
    }

    static 
    {
        SILENT = new ReportingInteractionMode("SILENT", 0);
        NOTIFICATION = new ReportingInteractionMode("NOTIFICATION", 1);
        TOAST = new ReportingInteractionMode("TOAST", 2);
        $VALUES = (new ReportingInteractionMode[] {
            SILENT, NOTIFICATION, TOAST
        });
    }
}
