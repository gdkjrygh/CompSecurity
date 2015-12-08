// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.wordlens;


public final class qvValue extends Enum
{

    public static final CLOUDHANCE CLOUDHANCE;
    public static final CLOUDHANCE IDLE;
    public static final CLOUDHANCE SNAPSHOT;
    public static final CLOUDHANCE VIDEO;
    private static final CLOUDHANCE a[];
    public int qvValue;

    public static qvValue byQVVal(int i)
    {
        switch (i)
        {
        default:
            return IDLE;

        case 3: // '\003'
            return CLOUDHANCE;

        case 2: // '\002'
            return SNAPSHOT;

        case 1: // '\001'
            return VIDEO;
        }
    }

    public static VIDEO valueOf(String s)
    {
        return (VIDEO)Enum.valueOf(com/google/android/apps/translate/wordlens/GTRNativeUI$GTRUIMode, s);
    }

    public static VIDEO[] values()
    {
        return (VIDEO[])a.clone();
    }

    static 
    {
        IDLE = new <init>("IDLE", 0, 0);
        VIDEO = new <init>("VIDEO", 1, 1);
        SNAPSHOT = new <init>("SNAPSHOT", 2, 2);
        CLOUDHANCE = new <init>("CLOUDHANCE", 3, 3);
        a = (new a[] {
            IDLE, VIDEO, SNAPSHOT, CLOUDHANCE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        qvValue = j;
    }
}
