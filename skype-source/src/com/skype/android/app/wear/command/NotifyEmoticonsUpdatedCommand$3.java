// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import android.os.SystemClock;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.o;
import com.skype.android.app.common.EmoticonPackList;
import com.skype.android.app.wear.ProtocolCommonCommands;
import com.skype.android.concurrent.FutureListener;

// Referenced classes of package com.skype.android.app.wear.command:
//            NotifyEmoticonsUpdatedCommand

final class val.resultCallback
    implements FutureListener
{

    final NotifyEmoticonsUpdatedCommand this$0;
    final com.google.android.gms.common.api.c val$googleApiClient;
    final h val$resultCallback;

    public final void onError(Throwable throwable)
    {
    }

    public final void onResult(EmoticonPackList emoticonpacklist)
    {
        emoticonpacklist = emoticonpacklist.serializeAsAsset();
        n n1 = n.a(com.skype.android.app.wear.ommands.NOTIFY_CONTENT_PACK_JSON_DEFINITION_UPDATED.getCommandPath(new Object[0]));
        com.google.android.gms.wearable.h h = n1.a();
        ProtocolCommonCommands.putTimestamp(h, SystemClock.uptimeMillis());
        ProtocolCommonCommands.putEmoticonBitmapJson(h, emoticonpacklist);
        emoticonpacklist = n1.b();
        o.a.a(val$googleApiClient, emoticonpacklist).a(new <init>(NotifyEmoticonsUpdatedCommand.access$000(NotifyEmoticonsUpdatedCommand.this), val$resultCallback));
    }

    public final volatile void onResult(Object obj)
    {
        onResult((EmoticonPackList)obj);
    }

    ()
    {
        this$0 = final_notifyemoticonsupdatedcommand;
        val$googleApiClient = c1;
        val$resultCallback = h.this;
        super();
    }
}
