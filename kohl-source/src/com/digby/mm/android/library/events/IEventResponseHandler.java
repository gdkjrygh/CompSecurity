// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events;

import com.digby.mm.android.library.exception.DigbyException;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.digby.mm.android.library.events:
//            IEvent, IEventResponse

public interface IEventResponseHandler
{

    public abstract void handleBrandDisabled();

    public abstract void handleEventResponse(JSONObject jsonobject, IEvent ievent);

    public abstract void handleGeoFenceChanges(JSONObject jsonobject);

    public abstract void handleGeoFenceDisabled();

    public abstract void handleMessages(JSONArray jsonarray);

    public abstract void onError(DigbyException digbyexception);

    public abstract void onResponse(IEventResponse ieventresponse);
}
