// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            MediaMessageAgent, MediaLinkProfile

static final class 
{

    static final int $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE[];
    static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];
    static final int $SwitchMap$com$skype$Message$SENDING_STATUS[];
    static final int $SwitchMap$com$skype$Message$TYPE[];
    static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

    static 
    {
        $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE = new int[com.skype.NT_TYPE.values().length];
        try
        {
            $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE[com.skype.NT_TYPE.MEDIA_PHOTO.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE[com.skype.NT_TYPE.MEDIA_FLIK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.STATUS.values().length];
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.STATUS.MEDIA_BAD_CONTENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.STATUS.MEDIA_NOT_AVAILABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.STATUS.MEDIA_LOADED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        $SwitchMap$com$skype$Message$TYPE = new int[com.skype.YPE().length];
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.MEDIA_MESSAGE.()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.FLIK_MESSAGE.()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        $SwitchMap$com$skype$Message$SENDING_STATUS = new int[com.skype.US.values().length];
        try
        {
            $SwitchMap$com$skype$Message$SENDING_STATUS[com.skype.US.SENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$skype$Message$SENDING_STATUS[com.skype.US.FAILED_TO_SEND.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.DEFAULT_PROFILE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.IMG_PROFILE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.FAVICON_PROFILE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.THUMBNAIL_PROFILE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.PREVIEW_PROFILE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.VIDEO_PROFILE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.SAVE_PROFILE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.GROUP_AVATAR_PROFILE.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.ORIGINAL.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
