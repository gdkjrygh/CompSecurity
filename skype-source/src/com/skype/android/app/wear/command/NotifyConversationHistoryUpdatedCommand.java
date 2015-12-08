// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import android.graphics.Bitmap;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.o;
import com.skype.android.app.common.WearConversationHistory;
import com.skype.android.app.wear.ProtocolCommonCommands;
import com.skype.android.app.wear.util.WearDataLayerUtil;

// Referenced classes of package com.skype.android.app.wear.command:
//            CompletionWearCommand

public class NotifyConversationHistoryUpdatedCommand extends CompletionWearCommand
{

    private final Bitmap avatar;
    private final WearConversationHistory conversationHistory;
    private final int conversationId;

    public NotifyConversationHistoryUpdatedCommand(int i, Bitmap bitmap, WearConversationHistory wearconversationhistory)
    {
        conversationId = i;
        avatar = bitmap;
        conversationHistory = wearconversationhistory;
    }

    private PutDataRequest createDataRequest()
    {
        n n1 = n.a(com.skype.android.app.wear.RemoteDeviceCapabilities.RemoteCommands.NOTIFY_CONTENT_CONVERSATIONS_HISTORY_UPDATED.getCommandPath(new Object[] {
            Integer.valueOf(conversationId)
        }));
        com.google.android.gms.wearable.h h = n1.a();
        com.google.android.gms.wearable.Asset asset = conversationHistory.serializeAsAsset();
        ProtocolCommonCommands.putTimestamp(h, System.currentTimeMillis());
        ProtocolCommonCommands.putConversationHistory(h, asset);
        asset = WearDataLayerUtil.createAssetFromBitmap(avatar);
        if (asset != null)
        {
            ProtocolCommonCommands.putAvatarAsset(h, asset);
        }
        return n1.b();
    }

    public void send(com.google.android.gms.common.api.c c1, h h)
    {
        PutDataRequest putdatarequest = createDataRequest();
        o.a.a(c1, putdatarequest).a(h);
    }
}
