// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import android.content.Context;
import com.worklight.common.WLConfig;
import com.worklight.location.internal.DeviceImpl;
import com.worklight.location.internal.PiggbackRegisterer;
import com.worklight.location.internal.RuntimeTriggerContainer;
import com.worklight.location.internal.events.EventTransmitter;
import com.worklight.location.internal.events.nativeImpl.FilePersistentStorageManager;
import com.worklight.location.internal.events.server.IWLRequestFactory;
import com.worklight.location.internal.geo.GeoAcquisitor;
import com.worklight.location.internal.geo.nativeImpl.AndroidLocationListenerFactory;
import com.worklight.location.internal.wifi.WifiAcquisitor;
import com.worklight.location.internal.wifi.nativeImpl.AndroidWifiScanner;
import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLRequestOptions;
import java.io.File;

// Referenced classes of package com.worklight.location.internal.nativeImpl:
//            CallbackExecutor

public class AndroidWLDevice extends DeviceImpl
{

    private static final String EVENTS_DIR_NAME = "__WL_EVENTS";

    public AndroidWLDevice(Context context)
    {
        super(new WifiAcquisitor(new AndroidWifiScanner(context)), new GeoAcquisitor(new AndroidLocationListenerFactory(context)), new FilePersistentStorageManager(getEventsStorageFolder(context), 0x7fffffffffffffffL), buildFactory(context), new CallbackExecutor());
    }

    AndroidWLDevice(WifiAcquisitor wifiacquisitor, GeoAcquisitor geoacquisitor, RuntimeTriggerContainer runtimetriggercontainer, EventTransmitter eventtransmitter, PiggbackRegisterer piggbackregisterer)
    {
        super(wifiacquisitor, geoacquisitor, runtimetriggercontainer, eventtransmitter, piggbackregisterer, new CallbackExecutor(), null);
    }

    private static IWLRequestFactory buildFactory(Context context)
    {
        return new IWLRequestFactory(context) {

            final Context val$context;

            public WLRequest createWLRequest(WLRequestListener wlrequestlistener, WLRequestOptions wlrequestoptions)
            {
                if (wlrequestlistener == null)
                {
                    throw new IllegalArgumentException("listener is null");
                }
                if (wlrequestoptions == null)
                {
                    throw new IllegalArgumentException("options is null");
                } else
                {
                    return new WLRequest(wlrequestlistener, wlrequestoptions, WLConfig.getInstance(), context);
                }
            }

            
            {
                context = context1;
                super();
            }
        };
    }

    private static File getEventsStorageFolder(Context context)
    {
        return context.getDir("__WL_EVENTS", 0);
    }
}
