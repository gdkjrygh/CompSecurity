// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


// Referenced classes of package com.skype.android.push:
//            PushEventType

static final class 
{

    static final int $SwitchMap$com$skype$android$push$PushEventType[];

    static 
    {
        $SwitchMap$com$skype$android$push$PushEventType = new int[PushEventType.values().length];
        try
        {
            $SwitchMap$com$skype$android$push$PushEventType[PushEventType.MEDIA_MESSAGE_SHARING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$android$push$PushEventType[PushEventType.VIDEO_SHARING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$android$push$PushEventType[PushEventType.AUDIO_MEDIA.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$android$push$PushEventType[PushEventType.ASYNC_VIDEO_MESSAGE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$push$PushEventType[PushEventType.ASYNC_FILE_TRANSFER.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$push$PushEventType[PushEventType.INCOMING_INSTANT_MESSAGE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$push$PushEventType[PushEventType.INCOMING_GROUP_INSTANT_MESSAGE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$push$PushEventType[PushEventType.MOJI.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
