// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import android.os.SystemClock;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.o;
import com.skype.Conversation;
import com.skype.android.app.wear.ProtocolCommonCommands;

// Referenced classes of package com.skype.android.app.wear.command:
//            CompletionWearCommand

public class DisplayLiveConversationNotificationCommand extends CompletionWearCommand
{

    private final Asset avatar;
    private final Conversation conversation;

    public DisplayLiveConversationNotificationCommand(Conversation conversation1, Asset asset)
    {
        conversation = conversation1;
        avatar = asset;
    }

    private PutDataRequest createDataRequest()
    {
        n n1 = n.a(com.skype.android.app.wear.RemoteDeviceCapabilities.RemoteCommands.UPDATE_LIVE_CONVERSATION_INFO_COMMAND.getCommandPath(new Object[] {
            Integer.valueOf(conversation.getObjectID())
        }));
        com.google.android.gms.wearable.h h = n1.a();
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY || conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE || flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = conversation.getLiveIsMutedProp();
        ProtocolCommonCommands.putConversationId(h, conversation.getObjectID());
        ProtocolCommonCommands.putLiveStartTimestamp(h, (long)conversation.getLiveStartTimestampProp() * 1000L);
        ProtocolCommonCommands.putDisplayName(h, conversation.getDisplaynameProp());
        ProtocolCommonCommands.putAvatarAsset(h, avatar);
        ProtocolCommonCommands.putTimestamp(h, SystemClock.uptimeMillis());
        ProtocolCommonCommands.putIsLive(h, flag1);
        ProtocolCommonCommands.putIsOnHold(h, flag);
        ProtocolCommonCommands.putIsMute(h, flag2);
        return n1.b();
    }

    public void send(com.google.android.gms.common.api.c c1, h h)
    {
        PutDataRequest putdatarequest = createDataRequest();
        o.a.a(c1, putdatarequest).a(h);
    }
}
