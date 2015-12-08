// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import com.google.android.gms.common.api.c;
import com.skype.android.app.wear.command.LogMessageCompletionCallback;
import com.skype.android.app.wear.command.NotifyEmoticonsUpdatedCommand;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.PackInfo;

// Referenced classes of package com.skype.android.app.wear.eventhandler:
//            FetchEmoticonStillsEventHandler

final class val.googleApiClient
    implements com.skype.android.mediacontent.Callback
{

    final FetchEmoticonStillsEventHandler this$0;
    final NotifyEmoticonsUpdatedCommand val$command;
    final c val$googleApiClient;

    public final void onAllPacksReady()
    {
        val$command.send(val$googleApiClient, LogMessageCompletionCallback.getDataLoggerCallback("EventHandler", "Notify Emoticon Updated"));
    }

    public final void onContent(PackInfo packinfo, MediaContent mediacontent)
    {
        if (mediacontent.n() == com.skype.EMOTICON)
        {
            val$command.addContent(packinfo, mediacontent);
        }
    }

    public final void onPackReady(PackInfo packinfo)
    {
    }

    public final void onPackStart(PackInfo packinfo)
    {
        val$command.addPackInfo(packinfo);
    }

    ()
    {
        this$0 = final_fetchemoticonstillseventhandler;
        val$command = notifyemoticonsupdatedcommand;
        val$googleApiClient = c.this;
        super();
    }
}
