// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            MediaSaveToGalleryAgent, MediaLinkProfile

static final class 
{

    static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

    static 
    {
        $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.VIDEO_PROFILE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.SAVE_PROFILE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
