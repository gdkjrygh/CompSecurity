// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import com.worklight.location.api.WLDeviceContext;
import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.internal.AbstractAcquisitionError;
import com.worklight.location.internal.AcquisitionFailureCallback;
import com.worklight.location.internal.ICallbackExecutor;
import com.worklight.location.internal.wifi.WifiInternalCallback;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiInternalLocation;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExecutor
    implements ICallbackExecutor
{

    private final ExecutorService es = Executors.newFixedThreadPool(1);

    public CallbackExecutor()
    {
    }

    public void executeFailureCallback(final AcquisitionFailureCallback callback, final AbstractAcquisitionError error)
    {
        es.submit(new Runnable() {

            final CallbackExecutor this$0;
            final AcquisitionFailureCallback val$callback;
            final AbstractAcquisitionError val$error;

            public void run()
            {
                callback.execute(error);
            }

            
            {
                this$0 = CallbackExecutor.this;
                callback = acquisitionfailurecallback;
                error = abstractacquisitionerror;
                super();
            }
        });
    }

    public void executeGeoAcquisitionCallback(final WLGeoCallback callback, final WLGeoPosition pos)
    {
        es.submit(new Runnable() {

            final CallbackExecutor this$0;
            final WLGeoCallback val$callback;
            final WLGeoPosition val$pos;

            public void run()
            {
                callback.execute(pos);
            }

            
            {
                this$0 = CallbackExecutor.this;
                callback = wlgeocallback;
                pos = wlgeoposition;
                super();
            }
        });
    }

    public void executeTriggerCallback(final WLTriggerCallback callback, final WLDeviceContext dc)
    {
        es.submit(new Runnable() {

            final CallbackExecutor this$0;
            final WLTriggerCallback val$callback;
            final WLDeviceContext val$dc;

            public void run()
            {
                callback.execute(dc);
            }

            
            {
                this$0 = CallbackExecutor.this;
                callback = wltriggercallback;
                dc = wldevicecontext;
                super();
            }
        });
    }

    public void executeWifiAcquisitionCallback(final WifiInternalCallback callback, final WifiInternalLocation pos)
    {
        es.submit(new Runnable() {

            final CallbackExecutor this$0;
            final WifiInternalCallback val$callback;
            final WifiInternalLocation val$pos;

            public void run()
            {
                callback.execute(pos);
            }

            
            {
                this$0 = CallbackExecutor.this;
                callback = wifiinternalcallback;
                pos = wifiinternallocation;
                super();
            }
        });
    }
}
