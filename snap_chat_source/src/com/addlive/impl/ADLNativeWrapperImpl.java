// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.addlive.Constants;
import com.addlive.impl.cam.ADLCamera;
import com.addlive.impl.cam.ADLCameraFrameLayout;
import com.addlive.impl.cam.ADLCameraHelper;
import com.addlive.impl.cam.ADLCameraSurfaceView;
import com.addlive.impl.cam.ADLCameraTextureView;
import com.addlive.impl.cam.CaptureConfig;
import com.addlive.impl.cb.ADLInjectFrameCb;
import com.addlive.platform.PlatformInitOptions;
import com.addlive.service.DrawRequest;
import com.addlive.service.InvalidateCb;
import com.addlive.service.MediaConnection;
import com.addlive.service.MediaType;
import com.addlive.service.RenderRequest;
import com.addlive.service.Responder;
import com.addlive.service.User;
import com.addlive.service.VideoCaptureDevice;
import com.addlive.service.listener.AddLiveServiceListener;
import com.addlive.service.listener.ConnectionLostEvent;
import com.addlive.service.listener.DeviceListChangedEvent;
import com.addlive.service.listener.MediaConnTypeChangedEvent;
import com.addlive.service.listener.MediaIssueEvent;
import com.addlive.service.listener.MediaStatsEvent;
import com.addlive.service.listener.MessageEvent;
import com.addlive.service.listener.MicActivityEvent;
import com.addlive.service.listener.MicGainEvent;
import com.addlive.service.listener.SessionReconnectedEvent;
import com.addlive.service.listener.SpeechActivityEvent;
import com.addlive.service.listener.SubscribersCountChangedEvent;
import com.addlive.service.listener.UserStateChangedEvent;
import com.addlive.service.listener.VideoFrameSizeChangedEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.addlive.impl:
//            ADLNativeWrapper, BaseResultAdapter, ServiceEvent, Log, 
//            EventDescription, ServiceRequest, RuntimeConfig, VoidResultAdapter, 
//            ServiceResponse

public class ADLNativeWrapperImpl
    implements ADLNativeWrapper, ADLInjectFrameCb
{
    class EventTask
        implements Runnable
    {

        private String data;
        final ADLNativeWrapperImpl this$0;

        private void logEventMaybe(String s)
        {
            while (!initOptions.isInteractionsLoggingEnabled() || s.compareTo("onMessage") != 0 && s.compareTo("onSpeechActivity") == 0) 
            {
                return;
            }
            initOptions.getInteractionsLogTag();
        }

        public void run()
        {
            Object obj1;
            Log.v("AddLive_SDK", (new StringBuilder("Got an event: ")).append(data).toString());
            obj1 = new ServiceEvent(data);
            logEventMaybe(((ServiceEvent) (obj1)).getEvent());
            if (!((ServiceEvent) (obj1)).getEvent().equals("onUserEvent")) goto _L2; else goto _L1
_L1:
            handleUserEvent(((ServiceEvent) (obj1)));
_L5:
            Object obj = (EventDescription)eventDescriptions.get(((ServiceEvent) (obj1)).getEvent());
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
            handleMediaStreamEvent(((ServiceEvent) (obj1)));
              goto _L5
_L4:
            if (!((ServiceEvent) (obj1)).getEvent().equals("onConnectionLost")) goto _L5; else goto _L6
_L6:
            handleConnectionLostEvent(((ServiceEvent) (obj1)));
              goto _L5
            obj1 = ((EventDescription) (obj)).eventConstructor.newInstance(new Object[] {
                ((ServiceEvent) (obj1)).getParams()
            });
            for (iterator = listeners.iterator(); iterator.hasNext(); ((EventDescription) (obj)).handlerMethod.invoke(addliveservicelistener, new Object[] {
        obj1
    }))
            {
                addliveservicelistener = (AddLiveServiceListener)iterator.next();
            }

        }

        public EventTask(String s)
        {
            this$0 = ADLNativeWrapperImpl.this;
            super();
            data = s;
        }
    }

    static final class MethodName extends Enum
    {

        private static final MethodName $VALUES[];
        public static final MethodName CONNECT;
        public static final MethodName DISCONNECT;
        public static final MethodName GET_VIDEO_CAPTURE_DEVICE;
        public static final MethodName GET_VIDEO_CAPTURE_DEVICE_NAMES;
        public static final MethodName SET_PROPERTY;
        public static final MethodName SET_VIDEO_CAPTURE_DEVICE;
        public static final MethodName STOP_LOCAL_VIDEO;
        public static final MethodName UNKNOWN;
        private String apiName;

        static MethodName fromString(String s)
        {
            MethodName amethodname[] = values();
            int j = amethodname.length;
            for (int i = 0; i < j; i++)
            {
                MethodName methodname = amethodname[i];
                if (methodname.apiName.equals(s))
                {
                    return methodname;
                }
            }

            return UNKNOWN;
        }

        public static MethodName valueOf(String s)
        {
            return (MethodName)Enum.valueOf(com/addlive/impl/ADLNativeWrapperImpl$MethodName, s);
        }

        public static MethodName[] values()
        {
            return (MethodName[])$VALUES.clone();
        }

        static 
        {
            CONNECT = new MethodName("CONNECT", 0, "connect");
            DISCONNECT = new MethodName("DISCONNECT", 1, "disconnect");
            GET_VIDEO_CAPTURE_DEVICE_NAMES = new MethodName("GET_VIDEO_CAPTURE_DEVICE_NAMES", 2, "getVideoCaptureDeviceNames");
            SET_VIDEO_CAPTURE_DEVICE = new MethodName("SET_VIDEO_CAPTURE_DEVICE", 3, "setVideoCaptureDevice");
            GET_VIDEO_CAPTURE_DEVICE = new MethodName("GET_VIDEO_CAPTURE_DEVICE", 4, "getVideoCaptureDevice");
            SET_PROPERTY = new MethodName("SET_PROPERTY", 5, "setProperty");
            STOP_LOCAL_VIDEO = new MethodName("STOP_LOCAL_VIDEO", 6, "stopLocalVideo");
            UNKNOWN = new MethodName("UNKNOWN", 7, "unknown");
            $VALUES = (new MethodName[] {
                CONNECT, DISCONNECT, GET_VIDEO_CAPTURE_DEVICE_NAMES, SET_VIDEO_CAPTURE_DEVICE, GET_VIDEO_CAPTURE_DEVICE, SET_PROPERTY, STOP_LOCAL_VIDEO, UNKNOWN
            });
        }

        private MethodName(String s, int i, String s1)
        {
            super(s, i);
            apiName = s1;
        }
    }

    class ResultTask
        implements Runnable
    {

        private String data;
        final ADLNativeWrapperImpl this$0;

        public void run()
        {
            Log.v("AddLive_SDK", (new StringBuilder("Got a result: ")).append(data).toString());
            if (initOptions.isInteractionsLoggingEnabled())
            {
                initOptions.getInteractionsLogTag();
                (new StringBuilder("[App <---- SDK] Result: ")).append(data);
            }
            ServiceResponse serviceresponse;
            BaseResultAdapter baseresultadapter;
            serviceresponse = new ServiceResponse(data);
            baseresultadapter = (BaseResultAdapter)resultHandlers.get(serviceresponse.getId());
            if (baseresultadapter != null)
            {
                try
                {
                    baseresultadapter.handleResponse(serviceresponse);
                    resultHandlers.remove(serviceresponse.getId());
                    return;
                }
                catch (Throwable throwable)
                {
                    Log.e("AddLive_SDK", "Unknown error passing result: ", throwable);
                }
                break MISSING_BLOCK_LABEL_144;
            }
            Log.e("AddLive_SDK", "Cannot pass the result as there is no result handler for request with given id.");
            return;
        }

        public ResultTask(String s)
        {
            this$0 = ADLNativeWrapperImpl.this;
            super();
            data = s;
        }
    }


    private static final String MESSAGE_EVENT_TYPE = "onMessage";
    private static final String SPEECH_EVENT_TYPE = "onSpeechActivity";
    private static boolean librariesLoaded = false;
    private Map activeConnections;
    private Map activeRenderers;
    private ADLCamera camera;
    private CaptureConfig captureConfig;
    private Context context;
    private Map eventDescriptions;
    private AtomicInteger idGenerator;
    private PlatformInitOptions initOptions;
    private boolean isPublishingAudio;
    private List listeners;
    private Map nativeRendererIdToInternal;
    private AtomicInteger renderIdGenerator;
    private Map resultHandlers;
    private Handler taskHandler;
    private boolean useLoudSpeaker;

    public ADLNativeWrapperImpl()
    {
        useLoudSpeaker = true;
        isPublishingAudio = false;
        resultHandlers = new HashMap();
        idGenerator = new AtomicInteger(0);
        renderIdGenerator = new AtomicInteger(0);
        listeners = new LinkedList();
        eventDescriptions = new HashMap();
        activeRenderers = new HashMap();
        nativeRendererIdToInternal = new HashMap();
        captureConfig = new CaptureConfig();
        activeConnections = new HashMap();
        loadLibraries(new PlatformInitOptions());
    }

    public ADLNativeWrapperImpl(Context context1, PlatformInitOptions platforminitoptions, Handler handler)
    {
        useLoudSpeaker = true;
        isPublishingAudio = false;
        resultHandlers = new HashMap();
        idGenerator = new AtomicInteger(0);
        renderIdGenerator = new AtomicInteger(0);
        listeners = new LinkedList();
        eventDescriptions = new HashMap();
        activeRenderers = new HashMap();
        nativeRendererIdToInternal = new HashMap();
        captureConfig = new CaptureConfig();
        activeConnections = new HashMap();
        loadLibraries(platforminitoptions);
        context = context1;
        prepareEventDescriptors();
        initOptions = platforminitoptions;
        taskHandler = handler;
    }

    private boolean anyUsersPublishingAudio()
    {
        Iterator iterator = activeConnections.values().iterator();
        boolean flag = false;
label0:
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Iterator iterator1 = ((MediaConnection)iterator.next()).getUsersInSession().values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    continue label0;
                }
            } while (!((User)iterator1.next()).isAudioPublished());
            flag = true;
        } while (true);
        return flag;
    }

    private void getVideoCaptureDevice(BaseResultAdapter baseresultadapter)
    {
        String s;
        if (camera != null)
        {
            s = camera.getDevice();
        } else
        {
            s = ADLCameraHelper.getSelectedCam();
        }
        baseresultadapter.getResponder().resultHandler(s);
    }

    private void getVideoCaptureDeviceNames(BaseResultAdapter baseresultadapter)
    {
        if (camera == null)
        {
            camera = new ADLCameraSurfaceView(null, context, captureConfig);
            List list = camera.getCameraDevices();
            camera = null;
            baseresultadapter.getResponder().resultHandler(list);
            return;
        } else
        {
            baseresultadapter.getResponder().resultHandler(camera.getCameraDevices());
            return;
        }
    }

    private void handleConnectionLostEvent(ServiceEvent serviceevent)
    {
        try
        {
            String s = serviceevent.getParams().getString("scopeId");
            if (!serviceevent.getParams().getBoolean("willReconnect"))
            {
                activeConnections.remove(s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ServiceEvent serviceevent)
        {
            Log.e("AddLive_SDK", "Cannot process an event within handleMediaStreamEvent as there was a parse error", serviceevent);
        }
    }

    private void handleMediaStreamEvent(ServiceEvent serviceevent)
    {
        MediaType mediatype;
        MediaConnection mediaconnection;
        Object obj;
        obj = serviceevent.getParams().getString("scopeId");
        mediatype = MediaType.fromString(serviceevent.getParams().getString("mediaType"));
        mediaconnection = (MediaConnection)activeConnections.get(obj);
        if (mediaconnection == null)
        {
            try
            {
                Log.e("AddLive_SDK", (new StringBuilder("Got a media event for unknown scope id ")).append(((String) (obj))).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ServiceEvent serviceevent)
            {
                Log.e("AddLive_SDK", "Cannot process an event within handleMediaStreamEvent as there was a parse error", serviceevent);
            }
            break MISSING_BLOCK_LABEL_120;
        }
        obj = mediaconnection.getUser(Long.valueOf(serviceevent.getParams().getJSONObject("userDetails").getLong("userId")));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        Log.e("AddLive_SDK", "Got a media event for unknown user");
        return;
        return;
        static class _cls1
        {

            static final int $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[];
            static final int $SwitchMap$com$addlive$service$MediaType[];

            static 
            {
                $SwitchMap$com$addlive$service$MediaType = new int[MediaType.values().length];
                try
                {
                    $SwitchMap$com$addlive$service$MediaType[MediaType.AUDIO.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$addlive$service$MediaType[MediaType.VIDEO.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$addlive$service$MediaType[MediaType.SCREEN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName = new int[MethodName.values().length];
                try
                {
                    $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[MethodName.DISCONNECT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[MethodName.GET_VIDEO_CAPTURE_DEVICE_NAMES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[MethodName.GET_VIDEO_CAPTURE_DEVICE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[MethodName.SET_VIDEO_CAPTURE_DEVICE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[MethodName.SET_PROPERTY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[MethodName.STOP_LOCAL_VIDEO.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.addlive.service.MediaType[mediatype.ordinal()];
        JVM INSTR tableswitch 1 3: default 292
    //                   1 178
    //                   2 202
    //                   3 247;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_247;
_L1:
        Log.e("AddLive_SDK", "Got an unknown media type");
_L5:
        mediaconnection.addUser(((User) (obj)));
        updateAudioSettings();
        return;
_L2:
        ((User) (obj)).setAudioPublished(serviceevent.getParams().getJSONObject("userDetails").getBoolean("audioPublished"));
          goto _L5
_L3:
        ((User) (obj)).setVideoPublished(serviceevent.getParams().getJSONObject("userDetails").getBoolean("videoPublished"));
        ((User) (obj)).setVideoSinkId(serviceevent.getParams().getJSONObject("userDetails").getString("videoSinkId"));
          goto _L5
        ((User) (obj)).setScreenPublished(serviceevent.getParams().getJSONObject("userDetails").getBoolean("screenPublished"));
        ((User) (obj)).setScreenSinkId(serviceevent.getParams().getJSONObject("userDetails").getString("screenSinkId"));
          goto _L5
    }

    private void handleUserEvent(ServiceEvent serviceevent)
    {
        Object obj;
        try
        {
            obj = serviceevent.getParams().getString("scopeId");
            obj = (MediaConnection)activeConnections.get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (ServiceEvent serviceevent)
        {
            Log.e("AddLive_SDK", "Cannot process an event within handleUserEvent as there was a parse error", serviceevent);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (!serviceevent.getParams().getJSONObject("userDetails").getBoolean("isConnected"))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        ((MediaConnection) (obj)).addUser(new User(serviceevent.getParams().getJSONObject("userDetails")));
_L2:
        updateAudioSettings();
        return;
        ((MediaConnection) (obj)).removeUser(Long.valueOf(serviceevent.getParams().getJSONObject("userDetails").getLong("userId")));
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void invalidate(int i)
    {
        RenderRequest renderrequest = (RenderRequest)activeRenderers.get(Integer.valueOf(i));
        if (renderrequest != null)
        {
            renderrequest.getInvalidateCb().invalidate();
        }
    }

    private boolean isPublishingAudio()
    {
        for (Iterator iterator = activeConnections.values().iterator(); iterator.hasNext();)
        {
            if (((MediaConnection)iterator.next()).isLocalUserPublishingAudio())
            {
                return true;
            }
        }

        return false;
    }

    private native void jniDraw(DrawRequest drawrequest);

    private native int jniInitPlatform(Context context1, PlatformInitOptions platforminitoptions);

    private native void jniInjectCameraFrame(byte abyte0[], int i, int j, int k, int l, int i1, int j1, 
            long l1);

    private native int jniInvoke(String s);

    private native boolean jniIsCPUSupported();

    private native void jniReleasePlatform();

    private native int jniRenderSink(RenderRequest renderrequest);

    private native int jniStopRender(int i);

    private static void loadLibraries(PlatformInitOptions platforminitoptions)
    {
        if (librariesLoaded)
        {
            return;
        }
        try
        {
            System.loadLibrary("sccrypto");
            System.loadLibrary("scssl");
            platforminitoptions = platforminitoptions.getLibName();
        }
        // Misplaced declaration of an exception variable
        catch (PlatformInitOptions platforminitoptions)
        {
            Log.v("AddLive_SDK", (new StringBuilder("Cannot initialize the AddLive SDK as the native components are not available. When compiling the application, make sure that the libAddLive${VERSION} is present in the PROJECT_ROOT/libs/armeabi-v7a directory. Alternatively you may be using a different version of the native components. This Java bindings can work only with the version ")).append(Constants.SDK_VERSION()).append(" of the AddLive SDK. Error message: ").append(platforminitoptions.toString()).toString());
            throw platforminitoptions;
        }
        if (platforminitoptions == null) goto _L2; else goto _L1
_L1:
        if (platforminitoptions.isEmpty()) goto _L2; else goto _L3
_L3:
        System.loadLibrary(platforminitoptions);
_L5:
        librariesLoaded = true;
        return;
_L2:
        System.loadLibrary((new StringBuilder("AddLive")).append(Constants.SDK_VERSION()).toString());
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void onEvent(String s)
    {
        taskHandler.post(new EventTask(s));
    }

    private void onResult(String s)
    {
        taskHandler.post(new ResultTask(s));
    }

    private void prepareEventDescriptor(Class class1, String s)
    {
        Method method = com/addlive/service/listener/AddLiveServiceListener.getMethod(s, new Class[] {
            class1
        });
        class1 = class1.getConstructor(new Class[] {
            org/json/JSONObject
        });
        eventDescriptions.put(s, new EventDescription(method, class1));
    }

    private void prepareEventDescriptors()
    {
        try
        {
            prepareEventDescriptor(com/addlive/service/listener/VideoFrameSizeChangedEvent, "onVideoFrameSizeChanged");
            prepareEventDescriptor(com/addlive/service/listener/ConnectionLostEvent, "onConnectionLost");
            prepareEventDescriptor(com/addlive/service/listener/SessionReconnectedEvent, "onSessionReconnected");
            prepareEventDescriptor(com/addlive/service/listener/UserStateChangedEvent, "onUserEvent");
            prepareEventDescriptor(com/addlive/service/listener/UserStateChangedEvent, "onMediaStreamEvent");
            prepareEventDescriptor(com/addlive/service/listener/MicActivityEvent, "onMicActivity");
            prepareEventDescriptor(com/addlive/service/listener/MicGainEvent, "onMicGain");
            prepareEventDescriptor(com/addlive/service/listener/DeviceListChangedEvent, "onDeviceListChanged");
            prepareEventDescriptor(com/addlive/service/listener/MediaStatsEvent, "onMediaStats");
            prepareEventDescriptor(com/addlive/service/listener/MessageEvent, "onMessage");
            prepareEventDescriptor(com/addlive/service/listener/MediaConnTypeChangedEvent, "onMediaConnTypeChanged");
            prepareEventDescriptor(com/addlive/service/listener/MediaIssueEvent, "onMediaIssue");
            prepareEventDescriptor(com/addlive/service/listener/SpeechActivityEvent, "onSpeechActivity");
            prepareEventDescriptor(com/addlive/service/listener/SubscribersCountChangedEvent, "onSubscribersCountChanged");
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            nosuchmethodexception.printStackTrace();
        }
    }

    private boolean setProperty(BaseResultAdapter baseresultadapter, ServiceRequest servicerequest)
    {
        String s;
        try
        {
            s = servicerequest.getParams().getString(0);
            servicerequest = servicerequest.getParams().getString(1);
        }
        // Misplaced declaration of an exception variable
        catch (ServiceRequest servicerequest)
        {
            baseresultadapter.getResponder().errHandler(1002, "Invalid key or value");
            return true;
        }
        if ("global.dev.audio.androidAudioStream".equals(s))
        {
            RuntimeConfig.AUDIO_STREAM_TYPE = Integer.parseInt(servicerequest);
            baseresultadapter.getResponder().resultHandler(null);
            return true;
        }
        if (s.startsWith("global.dev.camera."))
        {
            int i = captureConfig.processProperty(s, servicerequest);
            if (i == 0)
            {
                baseresultadapter.getResponder().resultHandler(null);
                return true;
            } else
            {
                baseresultadapter.getResponder().errHandler(i, "Failed to configure property");
                return true;
            }
        } else
        {
            return false;
        }
    }

    private void setVideoCaptureDevice(BaseResultAdapter baseresultadapter, ServiceRequest servicerequest)
    {
        servicerequest = servicerequest.getParams().getString(0);
        if (camera != null)
        {
            camera.setDevice(servicerequest);
            return;
        }
        try
        {
            ADLCameraHelper.setSelectedCam(servicerequest);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ServiceRequest servicerequest)
        {
            Log.e("AddLive_SDK", "Got an error setting video capture device", servicerequest);
        }
        baseresultadapter.getResponder().errHandler(4001, (new StringBuilder("Failed to set device: ")).append(servicerequest).toString());
        return;
    }

    private boolean specialHandlingMaybe(BaseResultAdapter baseresultadapter, ServiceRequest servicerequest)
    {
        MethodName methodname = MethodName.fromString(servicerequest.getMethod());
        _cls1..SwitchMap.com.addlive.impl.ADLNativeWrapperImpl.MethodName[methodname.ordinal()];
        JVM INSTR tableswitch 1 6: default 138
    //                   1 56
    //                   2 89
    //                   3 96
    //                   4 103
    //                   5 111
    //                   6 122;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        activeConnections.remove(servicerequest.getParams().getString(0));
        return true;
_L3:
        try
        {
            getVideoCaptureDeviceNames(baseresultadapter);
        }
        // Misplaced declaration of an exception variable
        catch (BaseResultAdapter baseresultadapter)
        {
            Log.e("AddLive_SDK", "Encountered an error while trying to process API call on Java binding layer", baseresultadapter);
            return true;
        }
        return false;
_L4:
        getVideoCaptureDevice(baseresultadapter);
        return false;
_L5:
        setVideoCaptureDevice(baseresultadapter, servicerequest);
        return true;
_L6:
        if (setProperty(baseresultadapter, servicerequest))
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L7:
        if (initOptions.useExternalVideoInput())
        {
            break; /* Loop/switch isn't completed */
        }
        stopLocalVideo();
        return true;
        return true;
    }

    private void stopLocalVideo()
    {
        if (camera != null)
        {
            camera.stop();
            camera.dispose();
            camera = null;
        }
    }

    public void addServiceListener(AddLiveServiceListener addliveservicelistener)
    {
        listeners.add(addliveservicelistener);
    }

    public void draw(DrawRequest drawrequest)
    {
        jniDraw(drawrequest);
    }

    public Map getActiveConnections()
    {
        return activeConnections;
    }

    public void initCamOnNative()
    {
        ServiceRequest servicerequest = new ServiceRequest("setVideoCaptureDevice");
        servicerequest.getParams().put(VideoCaptureDevice.FRONT_CAMERA.getId());
        String s = Integer.toString(idGenerator.getAndIncrement());
        servicerequest.setId(s);
        resultHandlers.put(s, new VoidResultAdapter(null));
        try
        {
            jniInvoke(servicerequest.toJSON());
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("AddLive_SDK", "Failed to init cam on native: ", jsonexception);
        }
    }

    public int initPlatform()
    {
        return jniInitPlatform(context, initOptions);
    }

    public void injectFrame(byte abyte0[], int i, int j, int k, int l, int i1, int j1, 
            long l1)
    {
        jniInjectCameraFrame(abyte0, i, j, k, l, i1, j1, l1);
    }

    public void invoke(BaseResultAdapter baseresultadapter, ServiceRequest servicerequest)
    {
        String s;
        s = (new StringBuilder()).append(servicerequest.getMethod()).append("_").append(Integer.toString(idGenerator.getAndIncrement())).toString();
        servicerequest.setId(s);
        if (initOptions.isInteractionsLoggingEnabled())
        {
            initOptions.getInteractionsLogTag();
            (new StringBuilder("[App ----> SDK] Call: ")).append(servicerequest.toJSON());
        }
        if (!specialHandlingMaybe(baseresultadapter, servicerequest))
        {
            return;
        }
        int i;
        resultHandlers.put(s, baseresultadapter);
        if (servicerequest.toJSON() == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        i = jniInvoke(servicerequest.toJSON());
        if (i != 0)
        {
            try
            {
                servicerequest = new ServiceResponse();
                servicerequest.setStatus(false);
                servicerequest.setErrorCode(i);
                servicerequest.setErrorMessage("Invocation error. This is due to an internal platform error");
                baseresultadapter.handleResponse(servicerequest);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ServiceRequest servicerequest)
            {
                baseresultadapter.getResponder().errHandler(1006, (new StringBuilder("Failed to generate service request. This is due to an internal platform error. Please pass this error info to AddLive. ")).append(servicerequest.toString()).toString());
            }
            return;
        }
        break MISSING_BLOCK_LABEL_199;
        throw new JSONException("JSON Request is null.");
    }

    public boolean isCPUSupported()
    {
        return jniIsCPUSupported();
    }

    public void releasePlatform()
    {
        try
        {
            stopLocalVideo();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        resetAudioSettings();
        jniReleasePlatform();
    }

    public void removeServiceListener(AddLiveServiceListener addliveservicelistener)
    {
        listeners.remove(addliveservicelistener);
    }

    public int renderSink(RenderRequest renderrequest)
    {
        int i = renderIdGenerator.getAndIncrement();
        renderrequest.setRendererId(i);
        int j = jniRenderSink(renderrequest);
        nativeRendererIdToInternal.put(Integer.valueOf(j), Integer.valueOf(i));
        activeRenderers.put(Integer.valueOf(i), renderrequest);
        return j;
    }

    public void reportDisconnect(String s)
    {
        activeConnections.remove(s);
    }

    public void resetAudioSettings()
    {
        ((AudioManager)context.getSystemService("audio")).setMode(0);
    }

    public void setAudioPublishingState(boolean flag, String s)
    {
        if (activeConnections.get(s) != null)
        {
            ((MediaConnection)activeConnections.get(s)).setLocalUserIsPublishingAudio(flag);
        }
    }

    public void setLoudSpeaker(boolean flag)
    {
        useLoudSpeaker = flag;
        updateAudioSettings();
    }

    public void startLocalVideo(BaseResultAdapter baseresultadapter, SurfaceView surfaceview)
    {
        if (initOptions.useExternalVideoInput())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        try
        {
            if (camera != null)
            {
                baseresultadapter.getResponder().errHandler(1010, "Cannot start local video as it is already active. Stop previous local video session in order to change the view rendering it");
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceView surfaceview)
        {
            Log.e("AddLive_SDK", (new StringBuilder("Got exception starting local video: ")).append(surfaceview.getMessage()).toString());
            baseresultadapter.getResponder().errHandler(4001, (new StringBuilder("Failed to start camera: ")).append(surfaceview).toString());
            return;
        }
        camera = new ADLCameraSurfaceView(this, context, captureConfig);
        camera.start(surfaceview.getHolder());
        invoke(baseresultadapter, new ServiceRequest("startLocalVideo"));
        return;
    }

    public void startLocalVideo(BaseResultAdapter baseresultadapter, TextureView textureview)
    {
        if (initOptions.useExternalVideoInput())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        try
        {
            if (camera != null)
            {
                baseresultadapter.getResponder().errHandler(1010, "Cannot start local video as it is already active. Stop previous local video session in order to change the view rendering it");
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (TextureView textureview)
        {
            Log.e("AddLive_SDK", "Got exception starting local video", textureview);
            baseresultadapter.getResponder().errHandler(4001, (new StringBuilder("Failed to start camera: ")).append(textureview).toString());
            return;
        }
        camera = new ADLCameraTextureView(this, context, captureConfig);
        camera.start(textureview);
        invoke(baseresultadapter, new ServiceRequest("startLocalVideo"));
        return;
    }

    public void startLocalVideo(BaseResultAdapter baseresultadapter, FrameLayout framelayout)
    {
        if (initOptions.useExternalVideoInput())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        try
        {
            if (camera != null)
            {
                baseresultadapter.getResponder().errHandler(1010, "Cannot start local video as it is already active. Stop previous local video session in order to change the view rendering it");
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (FrameLayout framelayout)
        {
            Log.e("AddLive_SDK", "Got exception starting local video", framelayout);
            baseresultadapter.getResponder().errHandler(4001, (new StringBuilder("Failed to start camera: ")).append(framelayout).toString());
            return;
        }
        camera = new ADLCameraFrameLayout(this, context, captureConfig);
        camera.start(framelayout);
        invoke(baseresultadapter, new ServiceRequest("startLocalVideo"));
        return;
    }

    public void stopRender(int i)
    {
        jniStopRender(i);
        Integer integer = (Integer)nativeRendererIdToInternal.get(Integer.valueOf(i));
        if (integer != null)
        {
            activeRenderers.remove(integer);
        }
    }

    public void updateAudioSettings()
    {
        boolean flag1 = false;
        AudioManager audiomanager = (AudioManager)context.getSystemService("audio");
        if (anyUsersPublishingAudio() || isPublishingAudio())
        {
            audiomanager.setMode(3);
            boolean flag = flag1;
            if (useLoudSpeaker)
            {
                flag = flag1;
                if (!audiomanager.isWiredHeadsetOn())
                {
                    flag = true;
                }
            }
            audiomanager.setSpeakerphoneOn(flag);
            return;
        } else
        {
            audiomanager.setMode(0);
            return;
        }
    }








}
