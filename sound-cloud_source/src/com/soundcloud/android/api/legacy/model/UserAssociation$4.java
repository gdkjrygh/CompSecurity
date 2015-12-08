// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;


class calState
{

    static final int $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[];

    static 
    {
        $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState = new int[calState.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[calState.PENDING_ADDITION.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[calState.PENDING_REMOVAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[calState.NONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
