// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;


// Referenced classes of package com.snapchat.android.model.chat:
//            ChatVideoItemProxy

static final class deoState
{

    static final int $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[];

    static 
    {
        $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState = new int[deoState.values().length];
        try
        {
            $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[deoState.ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[deoState.PAUSED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[deoState.STOPPED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[deoState.LOADING.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[deoState.PLAYING.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
