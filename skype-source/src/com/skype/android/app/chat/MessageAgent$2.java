// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.PROPKEY;
import com.skype.android.app.media.MediaLinkProfile;

// Referenced classes of package com.skype.android.app.chat:
//            MessageAgent

static final class le
{

    static final int $SwitchMap$com$skype$Message$TYPE[];
    static final int $SwitchMap$com$skype$PROPKEY[];
    static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

    static 
    {
        $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.THUMBNAIL_PROFILE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        $SwitchMap$com$skype$Message$TYPE = new int[com.skype.lues().length];
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_LOCATION.dinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_SMS.dinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_TEXT.dinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_MEDIA_MESSAGE.dinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_VIDEO.dinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_VIDEO_MESSAGE.dinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_FILE_MESSAGE.dinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_FILES.dinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_VOICE_MESSAGE.dinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_FLIK_MESSAGE.dinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.DED_LIVESESSION.dinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_CONSUMPTION_HORIZON.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_UNCONSUMED_NORMAL_MESSAGES.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LAST_MESSAGE_ID.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.MESSAGE_ANNOTATION_VERSION.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
