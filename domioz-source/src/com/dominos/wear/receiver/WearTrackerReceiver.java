// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.constant.ResponseStatus;
import com.dominos.android.sdk.core.tracker.TrackerResponse;
import com.dominos.remote.receiver.TrackerReceiver;
import com.dominos.remote.util.ResponseEvent;
import com.dominos.wear.client.WearTrackerClient;
import com.google.b.k;

public class WearTrackerReceiver extends TrackerReceiver
{

    public WearTrackerReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || intent.getAction() == null || !intent.getAction().equalsIgnoreCase("com.dominos.notifications.tracker") || intent.getExtras() == null) 
        {
            return;
        }
        TrackerResponse trackerresponse = new TrackerResponse();
        String s = intent.getStringExtra("tracker-status");
        int i = intent.getIntExtra("tracker-index", 0);
        intent = intent.getExtras();
        trackerresponse.setIndex(i);
        trackerresponse.setStatus(s);
        trackerresponse.setResult(intent.getString("tracker-response"));
        (new WearTrackerClient()).onResponseReceived(new ResponseEvent(context, (new k()).a(trackerresponse), ResponseStatus.SUCCESS, ResponseErrorCode.VALID));
    }
}
