// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import android.net.Uri;
import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.constant.ResponseStatus;
import com.dominos.remote.util.ResponseEvent;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.g;
import com.google.android.gms.wearable.p;

// Referenced classes of package com.dominos.wear.client:
//            WearBaseOrderClient

class errorCode
{

    public long begin;
    public String dataObject;
    public ResponseErrorCode errorCode;
    public int eventId;
    public ResponseStatus status;

    public PutDataRequest toPutDataMapRequest()
    {
        p p1 = p.a(WearBaseOrderClient.access$000(eventId, begin));
        g g1 = p1.b();
        g1.a("dataUri", p1.a().toString());
        g1.a("eventId", eventId);
        g1.a("begin", begin);
        g1.a("dataObject", dataObject);
        g1.a("status", status.ordinal());
        g1.a("errorCode", errorCode.ordinal());
        return p1.c();
    }

    public (int i, long l, ResponseEvent responseevent)
    {
        eventId = i;
        begin = l;
        dataObject = responseevent.getData();
        status = responseevent.getStatus();
        errorCode = responseevent.getErrorCode();
    }
}
