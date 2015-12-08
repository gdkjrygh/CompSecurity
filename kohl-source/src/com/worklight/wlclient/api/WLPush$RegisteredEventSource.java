// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;


// Referenced classes of package com.worklight.wlclient.api:
//            WLPush, WLEventSourceListener

class this._cls0
{

    private String adapter;
    private String eventSource;
    private WLEventSourceListener eventSourceListener;
    final WLPush this$0;

    public String getAdapter()
    {
        return adapter;
    }

    public String getEventSource()
    {
        return eventSource;
    }

    public WLEventSourceListener getEventSourceListener()
    {
        return eventSourceListener;
    }

    public void setAdapter(String s)
    {
        adapter = s;
    }

    public void setEventSource(String s)
    {
        eventSource = s;
    }

    public void setEventSourceListener(WLEventSourceListener wleventsourcelistener)
    {
        eventSourceListener = wleventsourcelistener;
    }




    ()
    {
        this$0 = WLPush.this;
        super();
    }
}
