// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import com.skype.Conversation;
import com.skype.android.skylib.ObjectIdMap;

// Referenced classes of package com.skype.android.app.wear.eventhandler:
//            CallControlCommandEventHandler

public class UnmuteCallEventHandler extends CallControlCommandEventHandler
{

    public UnmuteCallEventHandler(ObjectIdMap objectidmap)
    {
        super(objectidmap);
    }

    public void execute(Conversation conversation)
    {
        conversation.unmuteMyMicrophone();
    }
}
