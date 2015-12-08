// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.o;
import com.skype.android.app.wear.ProtocolCommonCommands;

// Referenced classes of package com.skype.android.app.wear.command:
//            CompletionWearCommand

public class DisplayEmoticonPickerCommand extends CompletionWearCommand
{

    private final int conversationId;
    private final String emoticonDataUri;
    private final long messageTimestamp;

    public DisplayEmoticonPickerCommand(int i, String s, long l)
    {
        conversationId = i;
        emoticonDataUri = s;
        messageTimestamp = l;
    }

    private PutDataRequest createDataRequest()
    {
        n n1 = n.a(com.skype.android.app.wear.RemoteDeviceCapabilities.RemoteCommands.DISPLAY_EMOTICON_PICKER_COMMAND.getCommandPath(new Object[] {
            Integer.valueOf(conversationId)
        }));
        com.google.android.gms.wearable.h h = n1.a();
        ProtocolCommonCommands.putTimestamp(h, System.currentTimeMillis());
        ProtocolCommonCommands.putMessageTimestamp(h, messageTimestamp);
        ProtocolCommonCommands.putConversationId(h, conversationId);
        ProtocolCommonCommands.putEmoticonDataUri(h, emoticonDataUri);
        return n1.b();
    }

    public void send(com.google.android.gms.common.api.c c1, h h)
    {
        PutDataRequest putdatarequest = createDataRequest();
        o.a.a(c1, putdatarequest).a(h);
    }
}
