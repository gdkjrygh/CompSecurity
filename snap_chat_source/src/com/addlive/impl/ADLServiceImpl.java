// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import android.view.Display;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.addlive.service.AddLiveService;
import com.addlive.service.AudioOutputDevice;
import com.addlive.service.ConnectionDescriptor;
import com.addlive.service.ConnectionQuality;
import com.addlive.service.Device;
import com.addlive.service.DrawRequest;
import com.addlive.service.MediaConnection;
import com.addlive.service.MediaType;
import com.addlive.service.RenderRequest;
import com.addlive.service.Responder;
import com.addlive.service.ResponderAdapter;
import com.addlive.service.VideoStreamDescriptor;
import com.addlive.service.listener.AddLiveServiceListener;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.addlive.impl:
//            Log, ADLNativeWrapper, ServiceRequest, VoidResultAdapter, 
//            AerPublisher, ADLNativeWrapperImpl, BaseResultAdapter, ADLMediaConnectionImpl

public class ADLServiceImpl
    implements AddLiveService
{
    class ADLBroadcastHandler extends BroadcastReceiver
    {

        final ADLServiceImpl this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.intent.action.HEADSET_PLUG"))
            {
                nativePlatform.updateAudioSettings();
            }
        }

        private ADLBroadcastHandler()
        {
            this$0 = ADLServiceImpl.this;
            super();
        }

    }

    class DevicesResultAdapter extends BaseResultAdapter
    {

        final ADLServiceImpl this$0;

        void handleSuccess(Object obj)
        {
            LinkedList linkedlist;
            if (responder == null)
            {
                return;
            }
            obj = (JSONObject)obj;
            Iterator iterator = ((JSONObject) (obj)).keys();
            linkedlist = new LinkedList();
            try
            {
                String s;
                for (; iterator.hasNext(); linkedlist.add(new Device(s, ((JSONObject) (obj)).getString(s))))
                {
                    s = (String)iterator.next();
                }

            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                responder.errHandler(1006, "Failed to parse devices list");
                return;
            }
            responder.resultHandler(linkedlist);
            return;
        }

        DevicesResultAdapter(Responder responder)
        {
            this$0 = ADLServiceImpl.this;
            super(responder);
        }
    }

    class DisconnectResultAdapter extends BaseResultAdapter
    {

        private String scopeId;
        final ADLServiceImpl this$0;

        void handleSuccess(Object obj)
        {
            nativePlatform.updateAudioSettings();
            nativePlatform.reportDisconnect(scopeId);
            if (responder != null)
            {
                responder.resultHandler(null);
            }
        }

        DisconnectResultAdapter(Responder responder, String s)
        {
            this$0 = ADLServiceImpl.this;
            super(responder);
            scopeId = s;
        }
    }

    class MediaConnResultAdapter extends BaseResultAdapter
    {

        private String scopeId;
        final ADLServiceImpl this$0;

        void handleSuccess(Object obj)
        {
            if (responder != null)
            {
                obj = new ADLMediaConnectionImpl(scopeId);
                nativePlatform.getActiveConnections().put(scopeId, obj);
                responder.resultHandler(obj);
            }
        }

        MediaConnResultAdapter(Responder responder, String s)
        {
            this$0 = ADLServiceImpl.this;
            super(responder);
            scopeId = s;
        }
    }

    class NetworkTestResultAdapter extends BaseResultAdapter
    {

        final ADLServiceImpl this$0;

        void handleSuccess(Object obj)
        {
            if (responder == null)
            {
                return;
            } else
            {
                obj = (Integer)obj;
                responder.resultHandler(ConnectionQuality._fromInt(((Integer) (obj)).intValue()));
                return;
            }
        }

        NetworkTestResultAdapter(Responder responder)
        {
            this$0 = ADLServiceImpl.this;
            super(responder);
        }
    }

    class StringResultAdapter extends BaseResultAdapter
    {

        final ADLServiceImpl this$0;

        void handleSuccess(Object obj)
        {
            if (responder != null)
            {
                responder.resultHandler((String)obj);
            }
        }

        StringResultAdapter(Responder responder)
        {
            this$0 = ADLServiceImpl.this;
            super(responder);
        }
    }

    class UpdateAudioSettingsResultAdapter extends BaseResultAdapter
    {

        final ADLServiceImpl this$0;

        void handleSuccess(Object obj)
        {
            nativePlatform.updateAudioSettings();
            if (responder != null)
            {
                responder.resultHandler(null);
            }
        }

        UpdateAudioSettingsResultAdapter(Responder responder)
        {
            this$0 = ADLServiceImpl.this;
            super(responder);
        }
    }


    private Context appContext;
    private ADLBroadcastHandler broadcastHandler;
    private ADLNativeWrapper nativePlatform;
    private boolean usesExternalCamera;
    private boolean usesLoudSpeaker;

    public ADLServiceImpl(ADLNativeWrapper adlnativewrapper, Context context, boolean flag)
    {
        usesLoudSpeaker = true;
        nativePlatform = adlnativewrapper;
        appContext = context;
        usesExternalCamera = flag;
        broadcastHandler = new ADLBroadcastHandler();
        context.registerReceiver(broadcastHandler, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    public void addServiceListener(Responder responder, AddLiveServiceListener addliveservicelistener)
    {
        Log.v("AddLive_SDK", "Calling method addServiceListener()");
        nativePlatform.addServiceListener(addliveservicelistener);
        responder.resultHandler(null);
    }

    public void connect(Responder responder, ConnectionDescriptor connectiondescriptor)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method connect(")).append(connectiondescriptor).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("connect");
        String s;
        String s1;
        try
        {
            servicerequest.getParams().put(connectiondescriptor.toJSON());
            s1 = connectiondescriptor.getScopeId();
        }
        // Misplaced declaration of an exception variable
        catch (ConnectionDescriptor connectiondescriptor)
        {
            responder.errHandler(1006, (new StringBuilder("Failed to serialise the connection descriptor due to: ")).append(connectiondescriptor).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ConnectionDescriptor connectiondescriptor)
        {
            responder.errHandler(1006, (new StringBuilder("Failed to serialise the connection descriptor due to: ")).append(connectiondescriptor).toString());
            return;
        }
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        s = connectiondescriptor.getUrl().split("/")[1];
        nativePlatform.invoke(new MediaConnResultAdapter(responder, s), servicerequest);
        return;
    }

    public void disconnect(Responder responder, String s)
    {
        disconnect(responder, s, 0);
    }

    public void disconnect(Responder responder, String s, int i)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method disconnect(")).append(s).append(", ").append(i).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("disconnect");
        servicerequest.getParams().put(s);
        servicerequest.getParams().put(i);
        nativePlatform.invoke(new DisconnectResultAdapter(responder, s), servicerequest);
    }

    public void draw(DrawRequest drawrequest)
    {
        nativePlatform.draw(drawrequest);
    }

    public void flushEvents(Responder responder, String s, Long long1)
    {
        ServiceRequest servicerequest = new ServiceRequest("flushEvents");
        servicerequest.getParams().put(s);
        servicerequest.getParams().put(long1);
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void getAudioOutputDevice(Responder responder)
    {
        if (usesLoudSpeaker)
        {
            responder.resultHandler(AudioOutputDevice.LOUD_SPEAKER);
            return;
        } else
        {
            responder.resultHandler(AudioOutputDevice.PHONE_SPEAKER);
            return;
        }
    }

    public void getAudioOutputDeviceNames(Responder responder)
    {
        responder.resultHandler(Arrays.asList(AudioOutputDevice.asDeviceArray()));
    }

    public MediaConnection getConnectionByScope(String s)
    {
        return (MediaConnection)nativePlatform.getActiveConnections().get(s);
    }

    public void getEventsChecksum(Responder responder)
    {
        ServiceRequest servicerequest = new ServiceRequest("getEventsChecksum");
        nativePlatform.invoke(new StringResultAdapter(responder), servicerequest);
    }

    public void getProperty(Responder responder, String s)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method getProperty(")).append(s).append(")").toString());
        if ("global.dev.audio.androidAudioStream".equals(s))
        {
            responder.resultHandler(Integer.toString(0));
            return;
        }
        if ("global.logs".equals(s))
        {
            responder.resultHandler((new AerPublisher(appContext)).collectLogs());
            return;
        } else
        {
            ServiceRequest servicerequest = new ServiceRequest("getProperty");
            servicerequest.getParams().put(s);
            nativePlatform.invoke(new StringResultAdapter(responder), servicerequest);
            return;
        }
    }

    public void getVersion(Responder responder)
    {
        Log.v("AddLive_SDK", "Calling method getVersion()");
        ServiceRequest servicerequest = new ServiceRequest("getVersion");
        nativePlatform.invoke(new StringResultAdapter(responder), servicerequest);
    }

    public void getVideoCaptureDevice(Responder responder)
    {
        Log.v("AddLive_SDK", "Calling method getVideoCaptureDevice()");
        ServiceRequest servicerequest = new ServiceRequest("getVideoCaptureDevice");
        nativePlatform.invoke(new StringResultAdapter(responder), servicerequest);
    }

    public void getVideoCaptureDeviceNames(Responder responder)
    {
        Log.v("AddLive_SDK", "Calling method getVideoCaptureDeviceNames()");
        ServiceRequest servicerequest = new ServiceRequest("getVideoCaptureDeviceNames");
        nativePlatform.invoke(new DevicesResultAdapter(responder), servicerequest);
    }

    public void injectFrame(byte abyte0[], com.addlive.service.AddLiveService.VideoFrameMetadata videoframemetadata)
    {
        if (!usesExternalCamera)
        {
            throw new IllegalStateException("The SDK is not configured to use the external camera implementation. Enable this during the platform init");
        }
        int j = ((WindowManager)appContext.getSystemService("window")).getDefaultDisplay().getRotation();
        int i;
        if (videoframemetadata.getInfo() != null)
        {
            android.hardware.Camera.CameraInfo camerainfo = videoframemetadata.getInfo();
            if (camerainfo.facing == 1)
            {
                i = (camerainfo.orientation / 90 + j) % 4;
            } else
            {
                i = ((camerainfo.orientation / 90 - j) + 4) % 4;
            }
        } else
        {
            i = videoframemetadata.getOrientation();
        }
        ((ADLNativeWrapperImpl)nativePlatform).injectFrame(abyte0, videoframemetadata.getWidth(), videoframemetadata.getHeight(), abyte0.length, 17, i, j, System.currentTimeMillis());
    }

    public void monitorSpeechActivity(Responder responder, String s, boolean flag)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method monitorSpeechActivity(")).append(s).append(", ").append(flag).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("monitorSpeechActivity");
        servicerequest.getParams().put(s);
        servicerequest.getParams().put(flag);
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void networkTest(Responder responder, ConnectionDescriptor connectiondescriptor)
    {
        Log.v("AddLive_SDK", "Calling method networkTest()");
        ServiceRequest servicerequest = new ServiceRequest("networkTest");
        try
        {
            servicerequest.getParams().put(connectiondescriptor.toJSON());
            nativePlatform.invoke(new NetworkTestResultAdapter(responder), servicerequest);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Responder responder)
        {
            responder.printStackTrace();
        }
    }

    public void publish(Responder responder, String s, MediaType mediatype)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method publish(")).append(s).append(",").append(mediatype).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("publish");
        servicerequest.getParams().put(s);
        servicerequest.getParams().put(mediatype.getStrValue());
        if (mediatype == MediaType.AUDIO)
        {
            nativePlatform.setAudioPublishingState(true, s);
            nativePlatform.updateAudioSettings();
        }
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void reconfigureVideo(Responder responder, String s, VideoStreamDescriptor videostreamdescriptor)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method reconfigureVideo(")).append(s).append(", ").append(videostreamdescriptor).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("reconfigureVideo");
        servicerequest.getParams().put(s);
        try
        {
            servicerequest.getParams().put(videostreamdescriptor.toJSON());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            responder.errHandler(1006, (new StringBuilder("Failed to serialise the video stream descriptor due to: ")).append(s).toString());
        }
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void release()
    {
        try
        {
            appContext.unregisterReceiver(broadcastHandler);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.w("AddLive_SDK", "Got an attempt to unregister not registered broadcast receiver");
        }
    }

    public void removeServiceListener(Responder responder, AddLiveServiceListener addliveservicelistener)
    {
        Log.v("AddLive_SDK", "Calling method removeServiceListener()");
        nativePlatform.removeServiceListener(addliveservicelistener);
        responder.resultHandler(null);
    }

    public int renderSink(RenderRequest renderrequest)
    {
        Log.v("AddLive_SDK", "Calling method renderSink()");
        return nativePlatform.renderSink(renderrequest);
    }

    public void sendMessage(Responder responder, String s, String s1)
    {
        sendMessage(responder, s, s1, null);
    }

    public void sendMessage(Responder responder, String s, String s1, Long long1)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method sendMessage(")).append(s).append(", size = ").append(s1.length()).append(", ").append(long1).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("sendMessage");
        servicerequest.getParams().put(s);
        servicerequest.getParams().put(s1);
        if (long1 != null)
        {
            servicerequest.getParams().put(long1);
        }
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void sendMessage(Responder responder, String s, byte abyte0[])
    {
        sendMessage(responder, s, abyte0, null);
    }

    public void sendMessage(Responder responder, String s, byte abyte0[], Long long1)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method sendMessage(")).append(s).append(", size = ").append(abyte0.length).append(", ").append(long1).append(")").toString());
        sendMessage(responder, s, Base64.encodeToString(abyte0, 0), long1);
    }

    public void sendReportWithCredentials(Responder responder, final String credentials, final String cause)
    {
        getProperty(new ResponderAdapter() {

            final ADLServiceImpl this$0;
            final String val$cause;
            final String val$credentials;

            public volatile void resultHandler(Object obj)
            {
                resultHandler((String)obj);
            }

            public void resultHandler(String s)
            {
                Log.d("AddLive_SDK", "Sending AER");
                (new AerPublisher(appContext)).publish(credentials, cause);
            }

            
            {
                this$0 = ADLServiceImpl.this;
                credentials = s;
                cause = s1;
                super();
            }
        }, "global.service.X");
    }

    public void setAllowedSenders(Responder responder, String s, MediaType mediatype, List list)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method setAllowedSenders(")).append(s).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("setAllowedSenders");
        servicerequest.getParams().put(s);
        servicerequest.getParams().put(mediatype);
        s = new JSONArray();
        for (mediatype = list.iterator(); mediatype.hasNext(); s.put((Long)mediatype.next())) { }
        servicerequest.getParams().put(s);
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void setApplicationId(Responder responder, Long long1)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method setApplicationId(")).append(long1).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("setApplicationId");
        servicerequest.getParams().put(long1);
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void setAudioOutputDevice(Responder responder, AudioOutputDevice audiooutputdevice)
    {
        static class _cls2
        {

            static final int $SwitchMap$com$addlive$service$AudioOutputDevice[];

            static 
            {
                $SwitchMap$com$addlive$service$AudioOutputDevice = new int[AudioOutputDevice.values().length];
                try
                {
                    $SwitchMap$com$addlive$service$AudioOutputDevice[AudioOutputDevice.LOUD_SPEAKER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$addlive$service$AudioOutputDevice[AudioOutputDevice.PHONE_SPEAKER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.addlive.service.AudioOutputDevice[audiooutputdevice.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 40
    //                   2 53;
           goto _L1 _L2 _L3
_L1:
        responder.resultHandler(null);
        return;
_L2:
        nativePlatform.setLoudSpeaker(true);
        continue; /* Loop/switch isn't completed */
_L3:
        nativePlatform.setLoudSpeaker(false);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setAudioOutputDevice(Responder responder, String s)
    {
        try
        {
            setAudioOutputDevice(responder, AudioOutputDevice.fromStringId(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            responder.errHandler(1002, s.getMessage());
        }
    }

    public void setProperty(Responder responder, String s, String s1)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method setProperty(")).append(s).append(", ").append(s1).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("setProperty");
        servicerequest.getParams().put(s);
        servicerequest.getParams().put(s1);
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void setProxyServer(Responder responder, String s, String s1, int i)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method setProxyServer(")).append(s).append(", ").append(s1).append(", ").append(i).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("setProxyServer");
        servicerequest.getParams().put(s);
        servicerequest.getParams().put(s1);
        servicerequest.getParams().put(i);
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void setVideoCaptureDevice(Responder responder, String s)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method setVideoCaptureDevice(")).append(s).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("setVideoCaptureDevice");
        servicerequest.getParams().put(s);
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void setVideoCaptureDevice(Responder responder, String s, SurfaceView surfaceview)
    {
        setVideoCaptureDevice(responder, s);
    }

    public void startEventsTracking(Responder responder, String s)
    {
        s = (new File(appContext.getCacheDir(), s)).getAbsolutePath();
        ServiceRequest servicerequest = new ServiceRequest("startEventsTracking");
        servicerequest.getParams().put(s);
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void startLocalVideo(Responder responder, SurfaceView surfaceview)
    {
        Log.v("AddLive_SDK", "Calling method startLocalVideo()");
        nativePlatform.startLocalVideo(new StringResultAdapter(responder), surfaceview);
    }

    public void startLocalVideo(Responder responder, TextureView textureview)
    {
        Log.v("AddLive_SDK", "Calling method startLocalVideo()");
        nativePlatform.startLocalVideo(new StringResultAdapter(responder), textureview);
    }

    public void startLocalVideo(Responder responder, FrameLayout framelayout)
    {
        Log.v("AddLive_SDK", "Calling method startLocalVideo()");
        nativePlatform.startLocalVideo(new StringResultAdapter(responder), framelayout);
    }

    public void startMeasuringStats(Responder responder, String s, int i)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method startMeasuringStats(")).append(s).append(", ").append(i).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("startMeasuringStatistics");
        servicerequest.getParams().put(s);
        servicerequest.getParams().put(i);
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void stopLocalVideo(Responder responder)
    {
        Log.v("AddLive_SDK", "Calling method stopLocalVideo()");
        ServiceRequest servicerequest = new ServiceRequest("stopLocalVideo");
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void stopMeasuringStats(Responder responder, String s)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method stopMeasuringStats(")).append(s).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("stopMeasuringStatistics");
        servicerequest.getParams().put(s);
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }

    public void stopRender(int i)
    {
        Log.v("AddLive_SDK", "Calling method stopRender()");
        nativePlatform.stopRender(i);
    }

    public void unpublish(Responder responder, String s, MediaType mediatype)
    {
        Log.v("AddLive_SDK", (new StringBuilder("Calling method unpublish(")).append(s).append(",").append(mediatype).append(")").toString());
        ServiceRequest servicerequest = new ServiceRequest("unpublish");
        servicerequest.getParams().put(s);
        servicerequest.getParams().put(mediatype.getStrValue());
        if (mediatype == MediaType.AUDIO)
        {
            nativePlatform.setAudioPublishingState(false, s);
            nativePlatform.updateAudioSettings();
        }
        nativePlatform.invoke(new VoidResultAdapter(responder), servicerequest);
    }


}
