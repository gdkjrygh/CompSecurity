// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.chat:
//            SideBarFragment

static final class 
{

    static final int $SwitchMap$com$skype$PROPKEY[];

    static 
    {
        $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_META_PICTURE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_PICTURE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_DISPLAYNAME.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
