// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.calling:
//            b

static final class SSION_EVENT
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.skype.ersation.LIVE_SESSION_EVENT.values().length];
        try
        {
            b[com.skype.ersation.LIVE_SESSION_EVENT.DOWNGRADED_TO_AUDIO_BECAUSE_OF_VIDEO_PARTICIPANTS_LIMIT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[com.skype.ersation.LIVE_SESSION_EVENT.USER_REJECTED_BECAUSE_OF_CONF_PARTICIPANTS_LIMIT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        a = new int[PROPKEY.values().length];
        try
        {
            a[PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[PROPKEY.PARTICIPANT_SOUND_LEVEL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[PROPKEY.PARTICIPANT_VOICE_STATUS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[PROPKEY.VIDEO_STATUS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[PROPKEY.VIDEO_ERROR.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
