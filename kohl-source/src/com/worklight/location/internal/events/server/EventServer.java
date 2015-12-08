// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.server;

import com.worklight.location.internal.events.storage.Chunk;
import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLRequestOptions;
import java.util.Map;
import org.json.JSONArray;

// Referenced classes of package com.worklight.location.internal.events.server:
//            EmptyRequestListener, IWLRequestFactory

public class EventServer
{

    private static final WLRequestListener EMPTY_LISTENER = new EmptyRequestListener();
    private final IWLRequestFactory factory;

    public EventServer(IWLRequestFactory iwlrequestfactory)
    {
        if (iwlrequestfactory == null)
        {
            throw new IllegalArgumentException("factory is null");
        } else
        {
            factory = iwlrequestfactory;
            return;
        }
    }

    public void send(Chunk chunk)
    {
        send(chunk, EMPTY_LISTENER);
    }

    public void send(Chunk chunk, WLRequestListener wlrequestlistener)
    {
        WLRequestOptions wlrequestoptions = new WLRequestOptions();
        JSONArray jsonarray = new JSONArray();
        for (int i = 0; i < chunk.numberOfEvents(); i++)
        {
            jsonarray.put(chunk.get(i));
        }

        wlrequestoptions.getParameters().put("events", jsonarray.toString());
        factory.createWLRequest(wlrequestlistener, wlrequestoptions).makeRequest("events");
    }

}
