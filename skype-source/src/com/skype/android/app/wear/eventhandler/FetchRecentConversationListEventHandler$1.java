// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.c;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.wear.command.LogMessageCompletionCallback;
import com.skype.android.app.wear.command.NotifyRecentConversationListUpdatedCommand;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.skype.android.app.wear.eventhandler:
//            FetchRecentConversationListEventHandler

final class val.googleApiClient
    implements AsyncCallback
{

    final FetchRecentConversationListEventHandler this$0;
    final Context val$context;
    final c val$googleApiClient;

    public final void done(AsyncResult asyncresult)
    {
        Log.i("FetchRecentConvoHandler", (new StringBuilder("done result: ")).append(String.valueOf(asyncresult.e())).toString());
        if (asyncresult.e())
        {
            asyncresult = (List)asyncresult.a();
            Collections.sort(asyncresult, Recent.TIME_COMPARATOR);
            (new NotifyRecentConversationListUpdatedCommand(asyncresult, FetchRecentConversationListEventHandler.access$000(FetchRecentConversationListEventHandler.this), FetchRecentConversationListEventHandler.access$100(FetchRecentConversationListEventHandler.this), FetchRecentConversationListEventHandler.access$200(FetchRecentConversationListEventHandler.this), FetchRecentConversationListEventHandler.access$300(FetchRecentConversationListEventHandler.this), val$context, FetchRecentConversationListEventHandler.access$400(FetchRecentConversationListEventHandler.this), FetchRecentConversationListEventHandler.access$500(FetchRecentConversationListEventHandler.this))).send(val$googleApiClient, LogMessageCompletionCallback.getDataLoggerCallback("FetchRecentConvoHandler", "Recent Conversation List Updated"));
        }
    }

    ()
    {
        this$0 = final_fetchrecentconversationlisteventhandler;
        val$context = context1;
        val$googleApiClient = c.this;
        super();
    }
}
