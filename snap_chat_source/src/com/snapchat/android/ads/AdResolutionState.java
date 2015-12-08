// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ads;


public final class AdResolutionState extends Enum
{

    private static final AdResolutionState $VALUES[];
    public static final AdResolutionState AD_CONSUMED;
    public static final AdResolutionState ERROR;
    public static final AdResolutionState NOT_NEEDED;
    public static final AdResolutionState NO_FILL;
    public static final AdResolutionState RESOLVING;
    public static final AdResolutionState SUCCESS;
    public static final AdResolutionState TIMEOUT;
    public static final AdResolutionState UNRESOLVED;
    private final boolean mIsError;

    private AdResolutionState(String s, int i, boolean flag)
    {
        super(s, i);
        mIsError = flag;
    }

    public static AdResolutionState valueOf(String s)
    {
        return (AdResolutionState)Enum.valueOf(com/snapchat/android/ads/AdResolutionState, s);
    }

    public static AdResolutionState[] values()
    {
        return (AdResolutionState[])$VALUES.clone();
    }

    public final boolean isError()
    {
        return mIsError;
    }

    static 
    {
        UNRESOLVED = new AdResolutionState("UNRESOLVED", 0, false);
        AD_CONSUMED = new AdResolutionState("AD_CONSUMED", 1, false);
        RESOLVING = new AdResolutionState("RESOLVING", 2, false);
        NO_FILL = new AdResolutionState("NO_FILL", 3, true);
        TIMEOUT = new AdResolutionState("TIMEOUT", 4, true);
        ERROR = new AdResolutionState("ERROR", 5, true);
        SUCCESS = new AdResolutionState("SUCCESS", 6, false);
        NOT_NEEDED = new AdResolutionState("NOT_NEEDED", 7, false);
        $VALUES = (new AdResolutionState[] {
            UNRESOLVED, AD_CONSUMED, RESOLVING, NO_FILL, TIMEOUT, ERROR, SUCCESS, NOT_NEEDED
        });
    }
}
