// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


public final class EndReasonCodes extends Enum
{

    public static final EndReasonCodes Application_Background;
    public static final EndReasonCodes Application_Close;
    public static final EndReasonCodes Connection_Closed;
    private static final EndReasonCodes ENUM$VALUES[];
    public static final EndReasonCodes Play_End_Detected;
    public static final EndReasonCodes Title_Switched;

    private EndReasonCodes(String s, int i)
    {
        super(s, i);
    }

    public static EndReasonCodes valueOf(String s)
    {
        return (EndReasonCodes)Enum.valueOf(com/akamai/android/analytics/EndReasonCodes, s);
    }

    public static EndReasonCodes[] values()
    {
        EndReasonCodes aendreasoncodes[] = ENUM$VALUES;
        int i = aendreasoncodes.length;
        EndReasonCodes aendreasoncodes1[] = new EndReasonCodes[i];
        System.arraycopy(aendreasoncodes, 0, aendreasoncodes1, 0, i);
        return aendreasoncodes1;
    }

    static 
    {
        Play_End_Detected = new EndReasonCodes("Play_End_Detected", 0);
        Connection_Closed = new EndReasonCodes("Connection_Closed", 1);
        Application_Close = new EndReasonCodes("Application_Close", 2);
        Application_Background = new EndReasonCodes("Application_Background", 3);
        Title_Switched = new EndReasonCodes("Title_Switched", 4);
        ENUM$VALUES = (new EndReasonCodes[] {
            Play_End_Detected, Connection_Closed, Application_Close, Application_Background, Title_Switched
        });
    }
}
