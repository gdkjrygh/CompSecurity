// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import com.skype.Conversation;
import com.skype.android.skylib.ObjectIdMap;

// Referenced classes of package com.skype.android.app.wear.eventhandler:
//            CallControlCommandEventHandler

public class MuteCallEventHandler extends CallControlCommandEventHandler
{

    public MuteCallEventHandler(ObjectIdMap objectidmap)
    {
        super(objectidmap);
    }

    public void execute(Conversation conversation)
    {
        conversation.muteMyMicrophone();
    }
}
