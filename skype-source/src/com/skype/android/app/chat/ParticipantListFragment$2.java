// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.chat:
//            ParticipantListFragment

static final class 
{

    static final int $SwitchMap$com$skype$PROPKEY[];

    static 
    {
        $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_META_PICTURE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_PICTURE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
