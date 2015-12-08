// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.loader;

import android.os.Handler;
import android.os.Message;
import com.auditude.ads.network.vast.model.VASTAd;
import com.auditude.ads.util.event.IEventListener;

// Referenced classes of package com.auditude.ads.network.vast.loader:
//            VASTXMLLoader, VASTDocumentProcessor

class val.that extends Handler
{

    final VASTXMLLoader this$0;
    private final IEventListener val$that;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        case 0: // '\0'
        default:
            return;

        case 2: // '\002'
            String s = (String)message.obj;
            VASTXMLLoader.access$4(VASTXMLLoader.this, new VASTDocumentProcessor(VASTXMLLoader.access$0(VASTXMLLoader.this), VASTXMLLoader.access$1(VASTXMLLoader.this), VASTXMLLoader.access$2(VASTXMLLoader.this), VASTXMLLoader.access$3(VASTXMLLoader.this)));
            VASTXMLLoader.access$5(VASTXMLLoader.this).addEventListener("processComplete", val$that);
            VASTXMLLoader.access$5(VASTXMLLoader.this).addEventListener("processFailed", val$that);
            message = null;
            if (((VASTXMLLoader)val$that).State instanceof VASTAd)
            {
                message = (VASTAd)((VASTXMLLoader)val$that).State;
            }
            VASTXMLLoader.access$5(VASTXMLLoader.this).process(s, message);
            return;

        case 1: // '\001'
            VASTXMLLoader.access$6(VASTXMLLoader.this, (Exception)message.obj);
            VASTXMLLoader.access$7(VASTXMLLoader.this);
            return;
        }
    }

    essor()
    {
        this$0 = final_vastxmlloader;
        val$that = IEventListener.this;
        super();
    }
}
