// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;


class ate
{

    static final int $SwitchMap$com$pinterest$ui$grid$PinterestGridView$State[];

    static 
    {
        $SwitchMap$com$pinterest$ui$grid$PinterestGridView$State = new int[ate.values().length];
        try
        {
            $SwitchMap$com$pinterest$ui$grid$PinterestGridView$State[ate.LOADING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$pinterest$ui$grid$PinterestGridView$State[ate.LOADED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$ui$grid$PinterestGridView$State[ate.ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
