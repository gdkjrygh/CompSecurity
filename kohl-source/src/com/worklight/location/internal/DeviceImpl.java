// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import com.worklight.location.api.WLAcquisitionFailureCallbacksConfiguration;
import com.worklight.location.api.WLAcquisitionPolicy;
import com.worklight.location.api.WLDevice;
import com.worklight.location.api.WLDeviceContext;
import com.worklight.location.api.WLLocationServicesConfiguration;
import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoFailureCallback;
import com.worklight.location.api.wifi.WLWifiAcquisitionCallback;
import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;
import com.worklight.location.api.wifi.WLWifiConnectedCallback;
import com.worklight.location.api.wifi.WLWifiFailureCallback;
import com.worklight.location.internal.deviceContextPiggybacker.DeviceContextPiggybacker;
import com.worklight.location.internal.events.EventTransmitter;
import com.worklight.location.internal.events.server.EventServer;
import com.worklight.location.internal.events.server.IWLRequestFactory;
import com.worklight.location.internal.events.storage.IPersistentStorageManager;
import com.worklight.location.internal.geo.EmptyGeoPosition;
import com.worklight.location.internal.geo.GeoAcquisitor;
import com.worklight.location.internal.geo.GeoErrorLinker;
import com.worklight.location.internal.geo.RTCGeoAcquireLinker;
import com.worklight.location.internal.geo.RTCGeoLinker;
import com.worklight.location.internal.wifi.EmptyWifiPosition;
import com.worklight.location.internal.wifi.RTCWifiLinker;
import com.worklight.location.internal.wifi.WifiAcquisitionCallbackConverter;
import com.worklight.location.internal.wifi.WifiAcquisitor;
import com.worklight.location.internal.wifi.WifiConnectedCallbackConverter;
import com.worklight.location.internal.wifi.WifiErrorLinker;
import com.worklight.wlclient.WLRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.worklight.location.internal:
//            DeviceContextImpl, PiggbackRegisterer, RuntimeTriggerContainer, ICallbackExecutor

public abstract class DeviceImpl
    implements WLDevice
{

    private static final String GEO_POLICY = "geoPolicy";
    private static final String NEW_CONFIGURATION = "newConfiguration";
    private static final String ON_FAILURE = "onFailure";
    private static final String ON_SUCCESS = "onSuccess";
    private static final String WIFI_POLICY = "wifiPolicy";
    private WLLocationServicesConfiguration configuration;
    protected final DeviceContextImpl deviceContext;
    private final EventTransmitter eventTransmitter;
    private ICallbackExecutor executor;
    final GeoAcquisitor geoAcq;
    final RuntimeTriggerContainer rtc;
    private final WifiAcquisitor wifiAcq;

    public DeviceImpl(WifiAcquisitor wifiacquisitor, GeoAcquisitor geoacquisitor, RuntimeTriggerContainer runtimetriggercontainer, EventTransmitter eventtransmitter, PiggbackRegisterer piggbackregisterer, ICallbackExecutor icallbackexecutor, Object obj)
    {
        deviceContext = new DeviceContextImpl();
        executor = icallbackexecutor;
        if (wifiacquisitor == null)
        {
            throw new IllegalArgumentException("wifiAcq is null");
        }
        if (eventtransmitter == null)
        {
            throw new IllegalArgumentException("eventTransmitter is null");
        } else
        {
            eventTransmitter = eventtransmitter;
            wifiAcq = wifiacquisitor;
            rtc = runtimetriggercontainer;
            geoAcq = geoacquisitor;
            piggbackregisterer.register(new DeviceContextPiggybacker(deviceContext));
            return;
        }
    }

    public DeviceImpl(WifiAcquisitor wifiacquisitor, GeoAcquisitor geoacquisitor, IPersistentStorageManager ipersistentstoragemanager, IWLRequestFactory iwlrequestfactory, ICallbackExecutor icallbackexecutor)
    {
        deviceContext = new DeviceContextImpl();
        executor = icallbackexecutor;
        if (wifiacquisitor == null)
        {
            throw new IllegalArgumentException("wifiAcquisitor is null");
        } else
        {
            wifiAcq = wifiacquisitor;
            geoAcq = geoacquisitor;
            ipersistentstoragemanager.clearOldPersistentData();
            eventTransmitter = new EventTransmitter(new EventServer(iwlrequestfactory), deviceContext, ipersistentstoragemanager.createStorage());
            rtc = new RuntimeTriggerContainer(deviceContext, eventTransmitter, icallbackexecutor);
            WLRequest.addRequestPiggybacker(new DeviceContextPiggybacker(deviceContext));
            return;
        }
    }

    private void applyGeoPolicy(List list, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy)
    {
        if (wlgeoacquisitionpolicy == null)
        {
            stopGeo();
            return;
        }
        if (deviceContext.getGeoPosition() == null)
        {
            deviceContext.setGeoPosition(new EmptyGeoPosition());
        }
        geoAcq.startAcquisition(new RTCGeoLinker(rtc), new GeoErrorLinker(list, executor), wlgeoacquisitionpolicy);
    }

    private void applyWifiPolicy(List list, WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        if (wlwifiacquisitionpolicy == null)
        {
            stopWifi();
            return;
        }
        if (deviceContext.getWifiLocation() == null)
        {
            deviceContext.setWifiPosition(new EmptyWifiPosition());
        }
        wifiAcq.startAcquisition(new RTCWifiLinker(rtc), new WifiErrorLinker(list, executor), wlwifiacquisitionpolicy);
    }

    private void stopGeo()
    {
        geoAcq.stopAcquisition();
        deviceContext.clearGeoPosition();
    }

    private void stopWifi()
    {
        wifiAcq.stopAcquisition();
        deviceContext.clearWifiPosition();
    }

    private void valideParamNotNull(Object obj, String s)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" can't be null").toString());
        } else
        {
            return;
        }
    }

    public void acquireGeoPosition(WLGeoCallback wlgeocallback, WLGeoFailureCallback wlgeofailurecallback, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy)
    {
        valideParamNotNull(wlgeocallback, "onSuccess");
        valideParamNotNull(wlgeofailurecallback, "onFailure");
        valideParamNotNull(wlgeoacquisitionpolicy, "geoPolicy");
        geoAcq.acquirePosition(new RTCGeoAcquireLinker(this, wlgeocallback, wlgeoacquisitionpolicy, executor), new GeoErrorLinker(Collections.singletonList(wlgeofailurecallback), executor), wlgeoacquisitionpolicy);
    }

    public void acquireWifiVisibleAccessPoints(WLWifiAcquisitionCallback wlwifiacquisitioncallback, WLWifiFailureCallback wlwififailurecallback, WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        valideParamNotNull(wlwifiacquisitioncallback, "onSuccess");
        valideParamNotNull(wlwififailurecallback, "onFailure");
        valideParamNotNull(wlwifiacquisitionpolicy, "wifiPolicy");
        wifiAcq.acquireLocation(new WifiAcquisitionCallbackConverter(wlwifiacquisitioncallback), new WifiErrorLinker(Collections.singletonList(wlwififailurecallback), executor), wlwifiacquisitionpolicy);
    }

    public void getConnectedAccessPoint(WLWifiConnectedCallback wlwificonnectedcallback, WLWifiFailureCallback wlwififailurecallback)
    {
        valideParamNotNull(wlwificonnectedcallback, "onSuccess");
        valideParamNotNull(wlwififailurecallback, "onFailure");
        wifiAcq.acquireLocation(new WifiConnectedCallbackConverter(wlwificonnectedcallback), new WifiErrorLinker(Collections.singletonList(wlwififailurecallback), executor), null);
    }

    public WLDeviceContext getDeviceContext()
    {
        DeviceContextImpl devicecontextimpl1 = deviceContext.clone();
        DeviceContextImpl devicecontextimpl = devicecontextimpl1;
        if (devicecontextimpl1.isEmpty())
        {
            devicecontextimpl = null;
        }
        return devicecontextimpl;
    }

    public DeviceContextImpl getDeviceContextImpl()
    {
        return deviceContext;
    }

    public EventTransmitter getEventTransmitter()
    {
        return eventTransmitter;
    }

    public GeoAcquisitor getGeoAcquisitor()
    {
        return geoAcq;
    }

    public WLLocationServicesConfiguration getLocationServicesConfig()
    {
        this;
        JVM INSTR monitorenter ;
        WLLocationServicesConfiguration wllocationservicesconfiguration = configuration.clone();
        this;
        JVM INSTR monitorexit ;
        return wllocationservicesconfiguration;
        Exception exception;
        exception;
        throw exception;
    }

    public RuntimeTriggerContainer getRTC()
    {
        return rtc;
    }

    public void startAcquisition(WLLocationServicesConfiguration wllocationservicesconfiguration)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        ArrayList arraylist1;
        valideParamNotNull(wllocationservicesconfiguration, "newConfiguration");
        configuration = wllocationservicesconfiguration.clone();
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        wllocationservicesconfiguration = wllocationservicesconfiguration.getFailureCallbacks().iterator();
        do
        {
            if (!wllocationservicesconfiguration.hasNext())
            {
                break;
            }
            WLAcquisitionFailureCallbacksConfiguration wlacquisitionfailurecallbacksconfiguration = (WLAcquisitionFailureCallbacksConfiguration)wllocationservicesconfiguration.next();
            if (wlacquisitionfailurecallbacksconfiguration.getWifiFailureCallback() != null)
            {
                arraylist.add(wlacquisitionfailurecallbacksconfiguration.getWifiFailureCallback());
            }
            if (wlacquisitionfailurecallbacksconfiguration.getGeoFailureCallback() != null)
            {
                arraylist1.add(wlacquisitionfailurecallbacksconfiguration.getGeoFailureCallback());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_111;
        wllocationservicesconfiguration;
        throw wllocationservicesconfiguration;
        rtc.updateConfiguration(configuration);
        wllocationservicesconfiguration = configuration.getPolicy();
        if (wllocationservicesconfiguration != null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        stopGeo();
        stopWifi();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        applyWifiPolicy(arraylist, wllocationservicesconfiguration.getWifiPolicy());
        applyGeoPolicy(arraylist1, wllocationservicesconfiguration.getGeoPolicy());
          goto _L1
    }

    public void stopAcquisition()
    {
        this;
        JVM INSTR monitorenter ;
        stopWifi();
        stopGeo();
        rtc.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
