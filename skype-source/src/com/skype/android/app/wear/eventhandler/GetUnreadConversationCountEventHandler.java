// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import android.content.Context;
import com.google.android.gms.common.api.c;
import com.skype.SkyLib;
import com.skype.android.app.wear.RemoteNodeWearModule;

public class GetUnreadConversationCountEventHandler extends com.skype.android.app.wear.EventHandler.EventHandlerAdapter
{

    private SkyLib lib;
    private RemoteNodeWearModule remoteWearModule;

    public GetUnreadConversationCountEventHandler(SkyLib skylib, RemoteNodeWearModule remotenodewearmodule)
    {
        lib = skylib;
        remoteWearModule = remotenodewearmodule;
    }

    public void handle(Context context, c c, String s)
    {
        int i = lib.getUnconsumedConversationsCount(com.skype.Conversation.LIST_TYPE.INBOX_CONVERSATIONS);
        remoteWearModule.updateUnreadConversationCount(i);
    }
}
