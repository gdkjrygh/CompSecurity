// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;


class ateState
{

    static final int $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[];

    static 
    {
        $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState = new int[ateState.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[ateState.IDLE_RECORD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[ateState.RECORD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[ateState.IDLE_PLAYBACK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[ateState.PLAYBACK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[ateState.EDIT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
