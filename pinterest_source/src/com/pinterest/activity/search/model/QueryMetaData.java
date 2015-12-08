// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.model;

import java.util.List;

public class QueryMetaData
{

    private static final String CONTEXT_SEPARATOR = "|";
    private String _category;
    private List _filters;
    private int _position;
    private String _query;
    private ContextType _type;

    public QueryMetaData()
    {
    }

    public QueryMetaData(String s)
    {
        _query = s;
    }

    public QueryMetaData(String s, ContextType contexttype)
    {
        _query = s;
        _type = contexttype;
    }

    public List getFilters()
    {
        return _filters;
    }

    public int getPosition()
    {
        return _position;
    }

    public String getQuery()
    {
        return _query;
    }

    public ContextType getType()
    {
        return _type;
    }

    public void setCategory(String s)
    {
        _category = s;
    }

    public void setFilters(List list)
    {
        _filters = list;
    }

    public void setPosition(int i)
    {
        _position = i;
    }

    public void setQuery(String s)
    {
        _query = s;
    }

    public void setType(ContextType contexttype)
    {
        _type = contexttype;
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        String s;
        stringbuilder = new StringBuilder();
        s = _query.replace('|', ' ');
        _cls1..SwitchMap.com.pinterest.activity.search.model.QueryMetaData.ContextType[_type.ordinal()];
        JVM INSTR tableswitch 1 13: default 96
    //                   1 101
    //                   2 125
    //                   3 161
    //                   4 197
    //                   5 197
    //                   6 197
    //                   7 245
    //                   8 281
    //                   9 281
    //                   10 281
    //                   11 281
    //                   12 305
    //                   13 305;
           goto _L1 _L2 _L3 _L4 _L5 _L5 _L5 _L6 _L7 _L7 _L7 _L7 _L8 _L8
_L1:
        return stringbuilder.toString();
_L2:
        stringbuilder.append(s).append("|").append(_type.getValue());
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append(s).append("|").append(_type.getValue()).append("|").append(_position);
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(s).append("|").append(_type.getValue()).append("|").append(_position);
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuilder.append(s).append("|").append(_type.getValue()).append("|").append(_category).append("|").append(_position);
        continue; /* Loop/switch isn't completed */
_L6:
        stringbuilder.append(s).append("|").append(_type.getValue()).append("|").append(_position);
        continue; /* Loop/switch isn't completed */
_L7:
        stringbuilder.append(s).append("|").append(_type.getValue());
        continue; /* Loop/switch isn't completed */
_L8:
        stringbuilder.append(s).append("|").append(_type.getValue()).append("|").append(_position);
        if (true) goto _L1; else goto _L9
_L9:
    }

    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType = new int[ContextType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.TYPED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.RECENT_HISTORY.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.AUTO_COMPLETE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.FILTER.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.MODE.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.ACTION_FILTER.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.TRENDING.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.TYPO_SUGGESTION.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.TYPO_AUTO_ORGINAL.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.TYPO_AUTO_CORRECTED.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.HASHTAG.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.AUTO_COMPLETE_CLIENT_CACHE.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$ContextType[ContextType.AUTO_COMPLETE_APPENDED.ordinal()] = 13;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class ContextType extends Enum
    {

        private static final ContextType $VALUES[];
        public static final ContextType ACTION_FILTER;
        public static final ContextType AUTO_COMPLETE;
        public static final ContextType AUTO_COMPLETE_APPENDED;
        public static final ContextType AUTO_COMPLETE_CLIENT_CACHE;
        public static final ContextType CONTEXTUAL;
        public static final ContextType EDUCATION;
        public static final ContextType FILTER;
        public static final ContextType HASHTAG;
        public static final ContextType MODE;
        public static final ContextType RECENT_HISTORY;
        public static final ContextType REMOVE;
        public static final ContextType TRENDING;
        public static final ContextType TYPED;
        public static final ContextType TYPO_AUTO_CORRECTED;
        public static final ContextType TYPO_AUTO_ORGINAL;
        public static final ContextType TYPO_SUGGESTION;
        private final String _value;

        public static ContextType valueOf(String s)
        {
            return (ContextType)Enum.valueOf(com/pinterest/activity/search/model/QueryMetaData$ContextType, s);
        }

        public static ContextType[] values()
        {
            return (ContextType[])$VALUES.clone();
        }

        public final String getValue()
        {
            return _value;
        }

        static 
        {
            TYPED = new ContextType("TYPED", 0, "typed");
            RECENT_HISTORY = new ContextType("RECENT_HISTORY", 1, "recentsearch");
            AUTO_COMPLETE = new ContextType("AUTO_COMPLETE", 2, "autocomplete");
            AUTO_COMPLETE_CLIENT_CACHE = new ContextType("AUTO_COMPLETE_CLIENT_CACHE", 3, "cc_autocomplete");
            AUTO_COMPLETE_APPENDED = new ContextType("AUTO_COMPLETE_APPENDED", 4, "cc_autocomplete_append");
            EDUCATION = new ContextType("EDUCATION", 5, "education");
            FILTER = new ContextType("FILTER", 6, "guide");
            HASHTAG = new ContextType("HASHTAG", 7, "hashtag");
            MODE = new ContextType("MODE", 8, "mode");
            ACTION_FILTER = new ContextType("ACTION_FILTER", 9, "filter");
            TRENDING = new ContextType("TRENDING", 10, "trending");
            TYPO_SUGGESTION = new ContextType("TYPO_SUGGESTION", 11, "typo_suggestion");
            TYPO_AUTO_ORGINAL = new ContextType("TYPO_AUTO_ORGINAL", 12, "typo_auto_original");
            TYPO_AUTO_CORRECTED = new ContextType("TYPO_AUTO_CORRECTED", 13, "typo_auto_corrected");
            REMOVE = new ContextType("REMOVE", 14, "remove");
            CONTEXTUAL = new ContextType("CONTEXTUAL", 15, "contextual");
            $VALUES = (new ContextType[] {
                TYPED, RECENT_HISTORY, AUTO_COMPLETE, AUTO_COMPLETE_CLIENT_CACHE, AUTO_COMPLETE_APPENDED, EDUCATION, FILTER, HASHTAG, MODE, ACTION_FILTER, 
                TRENDING, TYPO_SUGGESTION, TYPO_AUTO_ORGINAL, TYPO_AUTO_CORRECTED, REMOVE, CONTEXTUAL
            });
        }

        private ContextType(String s, int i, String s1)
        {
            super(s, i);
            _value = s1;
        }
    }

}
