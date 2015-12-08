// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.model;


class emType
{

    static final int $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[];

    static 
    {
        $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType = new int[emType.values().length];
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.AUTO_COMPLETE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.RECENT_QUERY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.BOARD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.PINNER.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.MUTUAL_FOLLOW.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.FOLLOWEE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.FACEBOOK_CONTACT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.TWITTER_CONTACT.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.YAHOO_CONTACT.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.GOOGLE_CONTACT.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.EMAIL_CONTACT.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[emType.EXTERNAL_CONTACT.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
