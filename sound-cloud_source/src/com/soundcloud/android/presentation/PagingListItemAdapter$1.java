// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;


class pendState
{

    static final int $SwitchMap$com$soundcloud$android$presentation$PagingListItemAdapter$AppendState[];

    static 
    {
        $SwitchMap$com$soundcloud$android$presentation$PagingListItemAdapter$AppendState = new int[pendState.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$presentation$PagingListItemAdapter$AppendState[pendState.LOADING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$presentation$PagingListItemAdapter$AppendState[pendState.ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
