// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


public final class MediaIssueCode extends Enum
{

    private static final MediaIssueCode $VALUES[];
    public static final MediaIssueCode CONNECTION_FROZEN;
    public static final MediaIssueCode CPU_LOAD_HIGH;
    public static final MediaIssueCode EXTERNAL_CPU_LOAD_HIGH;
    public static final MediaIssueCode NETWORK_PROBLEM;
    public static final MediaIssueCode UNKNOWN;

    private MediaIssueCode(String s, int i)
    {
        super(s, i);
    }

    public static MediaIssueCode _fromInt(int i)
    {
        switch (i)
        {
        default:
            return UNKNOWN;

        case 1: // '\001'
            return CONNECTION_FROZEN;

        case 2: // '\002'
            return CPU_LOAD_HIGH;

        case 3: // '\003'
            return EXTERNAL_CPU_LOAD_HIGH;

        case 4: // '\004'
            return NETWORK_PROBLEM;
        }
    }

    public static MediaIssueCode valueOf(String s)
    {
        return (MediaIssueCode)Enum.valueOf(com/addlive/service/MediaIssueCode, s);
    }

    public static MediaIssueCode[] values()
    {
        return (MediaIssueCode[])$VALUES.clone();
    }

    static 
    {
        CONNECTION_FROZEN = new MediaIssueCode("CONNECTION_FROZEN", 0);
        CPU_LOAD_HIGH = new MediaIssueCode("CPU_LOAD_HIGH", 1);
        EXTERNAL_CPU_LOAD_HIGH = new MediaIssueCode("EXTERNAL_CPU_LOAD_HIGH", 2);
        NETWORK_PROBLEM = new MediaIssueCode("NETWORK_PROBLEM", 3);
        UNKNOWN = new MediaIssueCode("UNKNOWN", 4);
        $VALUES = (new MediaIssueCode[] {
            CONNECTION_FROZEN, CPU_LOAD_HIGH, EXTERNAL_CPU_LOAD_HIGH, NETWORK_PROBLEM, UNKNOWN
        });
    }
}
