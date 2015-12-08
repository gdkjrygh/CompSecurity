// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.model;


public final class _value extends Enum
{

    private static final CONTEXTUAL $VALUES[];
    public static final CONTEXTUAL ACTION_FILTER;
    public static final CONTEXTUAL AUTO_COMPLETE;
    public static final CONTEXTUAL AUTO_COMPLETE_APPENDED;
    public static final CONTEXTUAL AUTO_COMPLETE_CLIENT_CACHE;
    public static final CONTEXTUAL CONTEXTUAL;
    public static final CONTEXTUAL EDUCATION;
    public static final CONTEXTUAL FILTER;
    public static final CONTEXTUAL HASHTAG;
    public static final CONTEXTUAL MODE;
    public static final CONTEXTUAL RECENT_HISTORY;
    public static final CONTEXTUAL REMOVE;
    public static final CONTEXTUAL TRENDING;
    public static final CONTEXTUAL TYPED;
    public static final CONTEXTUAL TYPO_AUTO_CORRECTED;
    public static final CONTEXTUAL TYPO_AUTO_ORGINAL;
    public static final CONTEXTUAL TYPO_SUGGESTION;
    private final String _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/pinterest/activity/search/model/QueryMetaData$ContextType, s);
    }

    public static _value[] values()
    {
        return (_value[])$VALUES.clone();
    }

    public final String getValue()
    {
        return _value;
    }

    static 
    {
        TYPED = new <init>("TYPED", 0, "typed");
        RECENT_HISTORY = new <init>("RECENT_HISTORY", 1, "recentsearch");
        AUTO_COMPLETE = new <init>("AUTO_COMPLETE", 2, "autocomplete");
        AUTO_COMPLETE_CLIENT_CACHE = new <init>("AUTO_COMPLETE_CLIENT_CACHE", 3, "cc_autocomplete");
        AUTO_COMPLETE_APPENDED = new <init>("AUTO_COMPLETE_APPENDED", 4, "cc_autocomplete_append");
        EDUCATION = new <init>("EDUCATION", 5, "education");
        FILTER = new <init>("FILTER", 6, "guide");
        HASHTAG = new <init>("HASHTAG", 7, "hashtag");
        MODE = new <init>("MODE", 8, "mode");
        ACTION_FILTER = new <init>("ACTION_FILTER", 9, "filter");
        TRENDING = new <init>("TRENDING", 10, "trending");
        TYPO_SUGGESTION = new <init>("TYPO_SUGGESTION", 11, "typo_suggestion");
        TYPO_AUTO_ORGINAL = new <init>("TYPO_AUTO_ORGINAL", 12, "typo_auto_original");
        TYPO_AUTO_CORRECTED = new <init>("TYPO_AUTO_CORRECTED", 13, "typo_auto_corrected");
        REMOVE = new <init>("REMOVE", 14, "remove");
        CONTEXTUAL = new <init>("CONTEXTUAL", 15, "contextual");
        $VALUES = (new .VALUES[] {
            TYPED, RECENT_HISTORY, AUTO_COMPLETE, AUTO_COMPLETE_CLIENT_CACHE, AUTO_COMPLETE_APPENDED, EDUCATION, FILTER, HASHTAG, MODE, ACTION_FILTER, 
            TRENDING, TYPO_SUGGESTION, TYPO_AUTO_ORGINAL, TYPO_AUTO_CORRECTED, REMOVE, CONTEXTUAL
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }
}
