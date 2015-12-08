// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message;

import java.util.HashSet;

// Referenced classes of package com.netflix.mediaclient.service.mdx.message:
//            MdxMessage

static final class add extends HashSet
{

    ()
    {
        add("DIALOG_RESPONSE");
        add("PLAYER_PAUSE");
        add("PLAYER_PLAY");
        add("PLAYER_RESUME");
        add("PLAYER_SET_AUTO_ADVANCE");
        add("PLAYER_SET_CURRENT_TIME");
        add("PLAYER_SKIP");
        add("PLAYER_STOP");
        add("SET_AUDIO_SUBTITLES");
    }
}
