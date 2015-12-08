// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.activity;

import com.pinterest.activity.task.model.Location;

class _cls9
{

    static final int $SwitchMap$com$pinterest$activity$task$model$Location[];

    static 
    {
        $SwitchMap$com$pinterest$activity$task$model$Location = new int[Location.values().length];
        try
        {
            $SwitchMap$com$pinterest$activity$task$model$Location[Location.BROWSER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$activity$task$model$Location[Location.AUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
