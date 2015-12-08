// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.platform;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.addlive.Constants;
import com.addlive.impl.ADLNativeWrapper;
import com.addlive.impl.ADLNativeWrapperImpl;
import com.addlive.impl.ADLServiceImpl;
import com.addlive.impl.DeviceCompatibilityTest;
import com.addlive.impl.Log;
import com.addlive.service.AddLiveService;
import com.addlive.service.Responder;
import com.addlive.service.ResponderAdapter;

// Referenced classes of package com.addlive.platform:
//            InitState, PlatformInitOptions, InitStateChangedEvent, PlatformInitListener, 
//            DeviceSupportLevel

public class ADL
{

    private static final String CONNECTIVITY_TYPE_KEY = "global.service.connectivityType";
    private static final String DEVICE_NAME_KEY = "global.service.userDevice";
    private static final String ENDPOINT_RESOLVER_KEY = "global.service.streamer.endpointResolver";
    private static volatile InitState INIT_STATE;
    private static volatile ADL INSTANCE;
    private static Handler taskHandler;
    private static HandlerThread taskThread;
    private Context context;
    private PlatformInitListener initListener;
    private PlatformInitOptions initOptions;
    private ADLNativeWrapper nativePlatform;
    private Responder nullResponder;
    private volatile AddLiveService service;

    private ADL()
    {
        nullResponder = new ResponderAdapter();
    }

    public static DeviceSupportLevel assesDeviceCompatibility()
    {
        return DeviceCompatibilityTest.assessCompatibility();
    }

    private void cleanupAfterInitError()
    {
        INIT_STATE = InitState.ERROR;
        if (nativePlatform != null)
        {
            nativePlatform.releasePlatform();
        }
        releaseADLResources();
    }

    private void cleanupAfterInitSuccess()
    {
        initOptions = null;
        initListener = null;
    }

    public static InitState getInitState()
    {
        return INIT_STATE;
    }

    public static AddLiveService getService()
    {
        if (INSTANCE == null)
        {
            throw new IllegalStateException("ADL not initialized. Initialize the platform first");
        } else
        {
            return INSTANCE.service;
        }
    }

    public static void init(PlatformInitListener platforminitlistener, PlatformInitOptions platforminitoptions, Context context1)
    {
        com/addlive/platform/ADL;
        JVM INSTR monitorenter ;
        if (INSTANCE == null)
        {
            INSTANCE = new ADL();
            HandlerThread handlerthread = new HandlerThread("TaskHandler");
            taskThread = handlerthread;
            handlerthread.start();
            taskHandler = new Handler(taskThread.getLooper());
        }
        INSTANCE.initPlatform(platforminitlistener, platforminitoptions, context1);
        com/addlive/platform/ADL;
        JVM INSTR monitorexit ;
        return;
        platforminitlistener;
        throw platforminitlistener;
    }

    private void initCam()
    {
        nativePlatform.initCamOnNative();
    }

    private void initPlatform(final PlatformInitListener listener, final PlatformInitOptions options, final Context context)
    {
        taskHandler.post(new Runnable() {

            final ADL this$0;
            final Context val$context;
            final PlatformInitListener val$listener;
            final PlatformInitOptions val$options;

            public void run()
            {
                Log.i("AddLive_SDK", "[App ----- SDK] Init");
                if (nativePlatform != null)
                {
                    listener.onInitStateChanged(new InitStateChangedEvent(1006, "Platform already initialized", InitState.ERROR));
                    return;
                }
                if (context == null)
                {
                    listener.onInitStateChanged(new InitStateChangedEvent(1002, "Context parameter was null, platform not initialized", InitState.ERROR));
                    return;
                }
                ADL.INIT_STATE = InitState.INITIALIZING;
                Log.setEnabled(options.isConsoleLoggingEnabled());
                int i;
                try
                {
                    ADL.this.context = context;
                    initOptions = options;
                    initListener = listener;
                    nativePlatform = new ADLNativeWrapperImpl(context, options, ADL.taskHandler);
                    i = nativePlatform.initPlatform();
                }
                catch (UnsatisfiedLinkError unsatisfiedlinkerror)
                {
                    initListener.onInitStateChanged(new InitStateChangedEvent(1009, "Failed to load the AddLive native components ", InitState.ERROR));
                    cleanupAfterInitError();
                    return;
                }
                catch (Exception exception)
                {
                    Log.e("AddLive_SDK", "Got an unhandled exception setting up AddLive", exception);
                    initListener.onInitStateChanged(new InitStateChangedEvent(1006, (new StringBuilder("Failed to initialize AddLive due to an internal error: ")).append(exception.getMessage()).toString(), InitState.ERROR));
                    cleanupAfterInitError();
                    return;
                }
                if (i != 0)
                {
                    break MISSING_BLOCK_LABEL_248;
                }
                service = new ADLServiceImpl(nativePlatform, context, options.useExternalVideoInput());
                validateVersion();
                return;
                listener.onInitStateChanged(new InitStateChangedEvent(i, "", InitState.ERROR));
                cleanupAfterInitError();
                return;
            }

            
            {
                this$0 = ADL.this;
                listener = platforminitlistener;
                context = context1;
                options = platforminitoptions;
                super();
            }
        });
    }

    public static Responder r()
    {
        if (INSTANCE == null)
        {
            throw new IllegalStateException("ADL not initialized. Initialize the platform first");
        } else
        {
            return INSTANCE.nullResponder;
        }
    }

    public static void release()
    {
        com/addlive/platform/ADL;
        JVM INSTR monitorenter ;
        ADL adl = INSTANCE;
        if (adl != null) goto _L2; else goto _L1
_L1:
        com/addlive/platform/ADL;
        JVM INSTR monitorexit ;
        return;
_L2:
        INSTANCE.releasePlatform();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void releaseADLResources()
    {
        nativePlatform = null;
        service = null;
        initOptions = null;
        initListener = null;
        context = null;
    }

    private void releasePlatform()
    {
        taskHandler.post(new Runnable() {

            final ADL this$0;

            public void run()
            {
                Log.i("AddLive_SDK", "[App ----- SDK] Release");
                if (ADL.INIT_STATE == InitState.NOT_INITIALIZED || ADL.INIT_STATE == InitState.ERROR)
                {
                    Log.w("AddLive_SDK", "Trying to release already released platform");
                    return;
                } else
                {
                    ADL.INIT_STATE = InitState.RELEASING;
                    ((ADLServiceImpl)service).release();
                    nativePlatform.releasePlatform();
                    releaseADLResources();
                    ADL.INIT_STATE = InitState.NOT_INITIALIZED;
                    return;
                }
            }

            
            {
                this$0 = ADL.this;
                super();
            }
        });
    }

    private void setApplicationIdMaybe()
    {
        initCam();
        if (initOptions.getApplicationId() == null)
        {
            initListener.onInitStateChanged(new InitStateChangedEvent(1002, "Application id property not given", InitState.ERROR));
            cleanupAfterInitError();
            return;
        } else
        {
            Responder responder = new Responder() {

                final ADL this$0;

                public void errHandler(int i, String s)
                {
                    initListener.onInitStateChanged(new InitStateChangedEvent(i, (new StringBuilder("Failed to set application id due to: ")).append(s).toString(), InitState.ERROR));
                    cleanupAfterInitError();
                }

                public volatile void resultHandler(Object obj)
                {
                    resultHandler((Void)obj);
                }

                public void resultHandler(Void void1)
                {
                    setStreamerEndpointResolvers();
                }

            
            {
                this$0 = ADL.this;
                super();
            }
            };
            ((ADLServiceImpl)service).setApplicationId(responder, initOptions.getApplicationId());
            return;
        }
    }

    private void setStreamerEndpointResolvers()
    {
        Responder responder = new Responder() {

            final ADL this$0;

            public void errHandler(int i, String s1)
            {
                initListener.onInitStateChanged(new InitStateChangedEvent(i, (new StringBuilder("Failed to set application id due to: ")).append(s1).toString(), InitState.ERROR));
                cleanupAfterInitError();
            }

            public volatile void resultHandler(Object obj)
            {
                resultHandler((Void)obj);
            }

            public void resultHandler(Void void1)
            {
                ADL.INIT_STATE = InitState.INITIALIZED;
                initListener.onInitStateChanged(new InitStateChangedEvent(0, "", InitState.INITIALIZED));
                cleanupAfterInitSuccess();
            }

            
            {
                this$0 = ADL.this;
                super();
            }
        };
        service.setProperty(r(), "global.service.userDevice", (new StringBuilder()).append(Build.MODEL).append("|").append(android.os.Build.VERSION.RELEASE).toString());
        String s = initOptions.getStreamerEndpointResolver();
        if (s == null)
        {
            responder.resultHandler(null);
            return;
        } else
        {
            service.setProperty(responder, "global.service.streamer.endpointResolver", s);
            return;
        }
    }

    private void updateNetworkConnectivity(Context context1)
    {
        if (context1.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0)
        {
            Log.i("AddLive_SDK", "We don't have permission to check network state. Type of network used will remain unknown");
            return;
        }
        context1 = ((ConnectivityManager)context1.getSystemService("connectivity")).getActiveNetworkInfo();
        Object obj;
        AddLiveService addliveservice;
        Responder responder;
        if (context1 != null)
        {
            obj = context1.getTypeName();
            context1 = context1.getSubtypeName();
        } else
        {
            context1 = "Unknown";
            obj = "Not-Connected";
        }
        Log.i("AddLive_SDK", (new StringBuilder("Updating connectivity info: ")).append(((String) (obj))).append(" / ").append(context1).toString());
        addliveservice = service;
        responder = r();
        if (!"WIFI".equals(obj))
        {
            obj = context1;
        }
        addliveservice.setProperty(responder, "global.service.connectivityType", ((String) (obj)));
    }

    private void validateVersion()
    {
        service.getVersion(new Responder() {

            final ADL this$0;

            public void errHandler(int i, String s)
            {
                initListener.onInitStateChanged(new InitStateChangedEvent(1006, "Failed to validate version of the native component due to an internal error.", InitState.ERROR));
                initListener = null;
            }

            public volatile void resultHandler(Object obj)
            {
                resultHandler((String)obj);
            }

            public void resultHandler(String s)
            {
                if (s.equals(Constants.SDK_VERSION()))
                {
                    setApplicationIdMaybe();
                    return;
                } else
                {
                    initListener.onInitStateChanged(new InitStateChangedEvent(1006, (new StringBuilder("The version of the native component mismatch the Java bindings and thus the platform cannot be used. Please verify your libraries. This error should never reach the production environments. Java bindings version: ")).append(Constants.SDK_VERSION()).append(" native component version: ").append(s).toString(), InitState.ERROR));
                    initListener = null;
                    return;
                }
            }

            
            {
                this$0 = ADL.this;
                super();
            }
        });
    }

    static 
    {
        INIT_STATE = InitState.NOT_INITIALIZED;
    }



/*
    static ADLNativeWrapper access$002(ADL adl, ADLNativeWrapper adlnativewrapper)
    {
        adl.nativePlatform = adlnativewrapper;
        return adlnativewrapper;
    }

*/




/*
    static InitState access$102(InitState initstate)
    {
        INIT_STATE = initstate;
        return initstate;
    }

*/




/*
    static Context access$202(ADL adl, Context context1)
    {
        adl.context = context1;
        return context1;
    }

*/


/*
    static PlatformInitOptions access$302(ADL adl, PlatformInitOptions platforminitoptions)
    {
        adl.initOptions = platforminitoptions;
        return platforminitoptions;
    }

*/



/*
    static PlatformInitListener access$402(ADL adl, PlatformInitListener platforminitlistener)
    {
        adl.initListener = platforminitlistener;
        return platforminitlistener;
    }

*/




/*
    static AddLiveService access$602(ADL adl, AddLiveService addliveservice)
    {
        adl.service = addliveservice;
        return addliveservice;
    }

*/



}
