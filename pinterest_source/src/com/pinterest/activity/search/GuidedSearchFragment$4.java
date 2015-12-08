// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search;


class .SearchType
{

    static final int $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[];

    static 
    {
        $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType = new int[com.pinterest.activity.search.event.hType.values().length];
        try
        {
            $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.hType.PIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.hType.BOARD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.hType.PINNER.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
