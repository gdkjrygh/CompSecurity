// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            MojiMediaMessageViewAdapter

static final class 
{

    static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];
    static final int $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[];

    static 
    {
        $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.ues().length];
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.IA_LOADED.inal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.IA_LOADING.inal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.IA_BAD_CONTENT.inal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.IA_NOT_AVAILABLE.inal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState = new int[values().length];
        try
        {
            $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[LOADING_MOJI.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[UNAVAILABLE_MOJI.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[READY_FOR_PLAY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[PLAYED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[PLAYING.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$MojiMediaMessageViewAdapter$ViewState[UNAVAILABLE_PREVIEW.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
