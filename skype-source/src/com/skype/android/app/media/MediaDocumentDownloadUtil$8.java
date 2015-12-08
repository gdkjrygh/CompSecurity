// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil, MediaLinkProfile

static final class 
{

    static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];
    static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

    static 
    {
        $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.alues().length];
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.EDIA_LOADED.rdinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.EDIA_BAD_CONTENT.rdinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.EDIA_NOT_AVAILABLE.rdinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.IMG_PROFILE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.THUMBNAIL_PROFILE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.GROUP_AVATAR_PROFILE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.FAVICON_PROFILE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
