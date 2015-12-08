// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.platform.PlatformInitOptions;
import com.addlive.service.listener.AddLiveServiceListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

// Referenced classes of package com.addlive.impl:
//            ADLNativeWrapperImpl, Log, ServiceEvent, EventDescription

class data
    implements Runnable
{

    private String data;
    final ADLNativeWrapperImpl this$0;

    private void logEventMaybe(String s)
    {
        while (!ADLNativeWrapperImpl.access$500(ADLNativeWrapperImpl.this).isInteractionsLoggingEnabled() || s.compareTo("onMessage") != 0 && s.compareTo("onSpeechActivity") == 0) 
        {
            return;
        }
        ADLNativeWrapperImpl.access$500(ADLNativeWrapperImpl.this).getInteractionsLogTag();
    }

    public void run()
    {
        Object obj1;
        Log.v("AddLive_SDK", (new StringBuilder("Got an event: ")).append(data).toString());
        obj1 = new ServiceEvent(data);
        logEventMaybe(((ServiceEvent) (obj1)).getEvent());
        if (!((ServiceEvent) (obj1)).getEvent().equals("onUserEvent")) goto _L2; else goto _L1
_L1:
        ADLNativeWrapperImpl.access$000(ADLNativeWrapperImpl.this, ((ServiceEvent) (obj1)));
_L5:
        Object obj = (EventDescription)ADLNativeWrapperImpl.access$300(ADLNativeWrapperImpl.this).get(((ServiceEvent) (obj1)).getEvent());
        if (obj == null)
        {
            Iterator iterator;
            AddLiveServiceListener addliveservicelistener;
            try
            {
                Log.e("AddLive_SDK", (new StringBuilder("Cannot process an event as the event type is not supported: ")).append(((ServiceEvent) (obj1)).getEvent()).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("AddLive_SDK", "Cannot process an event as there was a parse error", ((Throwable) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("AddLive_SDK", "Cannot process an event as the event type is misconfigured", ((Throwable) (obj)));
                return;
            }
            catch (InstantiationException instantiationexception)
            {
                Log.e("AddLive_SDK", "Cannot process an event as the event type is misconfigured", instantiationexception);
                return;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                Log.e("AddLive_SDK", "Cannot process an event as the event type is misconfigured", illegalaccessexception);
                return;
            }
            catch (Throwable throwable)
            {
                Log.e("AddLive_SDK", "Unknown error passing an event: ", throwable);
            }
            break MISSING_BLOCK_LABEL_288;
        }
        break MISSING_BLOCK_LABEL_183;
_L2:
        if (!((ServiceEvent) (obj1)).getEvent().equals("onMediaStreamEvent")) goto _L4; else goto _L3
_L3:
        ADLNativeWrapperImpl.access$100(ADLNativeWrapperImpl.this, ((ServiceEvent) (obj1)));
          goto _L5
_L4:
        if (!((ServiceEvent) (obj1)).getEvent().equals("onConnectionLost")) goto _L5; else goto _L6
_L6:
        ADLNativeWrapperImpl.access$200(ADLNativeWrapperImpl.this, ((ServiceEvent) (obj1)));
          goto _L5
        obj1 = ((EventDescription) (obj)).eventConstructor.newInstance(new Object[] {
            ((ServiceEvent) (obj1)).getParams()
        });
        for (iterator = ADLNativeWrapperImpl.access$400(ADLNativeWrapperImpl.this).iterator(); iterator.hasNext(); ((EventDescription) (obj)).handlerMethod.invoke(addliveservicelistener, new Object[] {
    obj1
}))
        {
            addliveservicelistener = (AddLiveServiceListener)iterator.next();
        }

    }

    public ner(String s)
    {
        this$0 = ADLNativeWrapperImpl.this;
        super();
        data = s;
    }
}
