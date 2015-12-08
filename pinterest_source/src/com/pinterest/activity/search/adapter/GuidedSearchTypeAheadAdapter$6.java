// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;


class e
{

    static final int $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[];
    static final int $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[];

    static 
    {
        $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType = new int[com.pinterest.activity.search.model.ype.values().length];
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.ype.RECENT_HISTORY_PIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.ype.RECENT_HISTORY_BOARD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.ype.RECENT_HISTORY_PINNER.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.ype.RECENT_HISTORY_MY_PIN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType = new int[com.pinterest.activity.search.event.lues().length];
        try
        {
            $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.N.dinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.NNER.dinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.ARD.dinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
