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

// Referenced classes of package com.skype.android.app.wear.command:
//            CompletionWearCommand

public class StopRingingCommand extends CompletionWearCommand
{

    private final int conversationId;

    public StopRingingCommand(int i)
    {
        conversationId = i;
    }

    private PutDataRequest createDataRequest()
    {
        return n.a(com.skype.android.app.wear.RemoteDeviceCapabilities.RemoteCommands.CALL_RINGING_STATUS_COMMAND.getCommandPath(new Object[] {
            Integer.valueOf(conversationId)
        })).b();
    }

    public void send(com.google.android.gms.common.api.c c1, h h)
    {
        PutDataRequest putdatarequest = createDataRequest();
        o.a.b(c1, putdatarequest.a()).a(h);
    }
}
