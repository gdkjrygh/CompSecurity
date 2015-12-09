// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.transport;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.Surface;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.error.CrashReport;
import com.netflix.mediaclient.error.Signal;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.invoke.Invoke;
import com.netflix.mediaclient.javabridge.invoke.android.InitVisualOn;
import com.netflix.mediaclient.javabridge.invoke.android.SetVideoSurface;
import com.netflix.mediaclient.javabridge.invoke.media.Play;
import com.netflix.mediaclient.media.MediaPlayerHelperFactory;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.net.IpConnectivityPolicy;
import com.netflix.mediaclient.service.configuration.PlayerTypeFactory;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.StringUtils;
import java.lang.ref.WeakReference;

// Referenced classes of package com.netflix.mediaclient.javabridge.transport:
//            Transport

public class NativeTransport
    implements Transport
{
    private class TransportEventHandler extends Handler
    {

        final NativeTransport this$0;

        public void handleMessage(Message message)
        {
            if (message == null)
            {
                Log.e("nf-NativeTransport", "Received null message!");
                return;
            }
            if (!(message.obj instanceof String))
            {
                Log.e("nf-NativeTransport", "Received obj is NOT string in message!");
                return;
            }
            message = (String)message.obj;
            if (Log.isLoggable("nf-NativeTransport", 3))
            {
                Log.d("nf-NativeTransport", (new StringBuilder()).append("Received message: ").append(message).toString());
            }
            if (proxy != null)
            {
                proxy.processUpdate(message);
                return;
            } else
            {
                Log.e("nf-NativeTransport", "Unable to publish event, na not available");
                return;
            }
        }

        public TransportEventHandler(Looper looper)
        {
            this$0 = NativeTransport.this;
            super(looper);
        }
    }


    private static final String TAG = "nf-NativeTransport";
    private static final String TAG1 = "nf_net";
    private static boolean drmPlayPresent = native_init(AndroidUtils.getAndroidVersion());
    private static boolean hdCapable = native_is_hd_capable();
    private static boolean isPropertyStreamingVideoDrs = native_isPropertyStreamingVideoDrs();
    private static boolean mpCapable = native_is_mp_capable();
    private Bridge bridge;
    private boolean destroyed;
    private int mBitrateCap;
    private String mDeviceId;
    private boolean mDeviceLowMem;
    private String mDeviceModel;
    private String mEsn;
    private final TransportEventHandler mEventHandler;
    private String mFesn;
    private int mIpConnectivityPolicy;
    private String mRootFileSystem;
    private Surface mSurface;
    private int mVideoBufferSize;
    private final Object mWeakThis = new WeakReference(this);
    private PlayerType playerType;
    private final NrdProxy proxy;

    public NativeTransport(Bridge bridge1, NrdProxy nrdproxy)
    {
        mVideoBufferSize = 0;
        mBitrateCap = -1;
        mIpConnectivityPolicy = IpConnectivityPolicy.IP_V6_V4.getValue();
        Log.d("nf-NativeTransport", "NativeTransport constructor start");
        bridge = bridge1;
        proxy = nrdproxy;
        bridge1 = new HandlerThread("NativeTransport", 10);
        bridge1.start();
        mEventHandler = new TransportEventHandler(bridge1.getLooper());
        Log.d("nf-NativeTransport", "NativeTransport constructor done");
    }

    private void connect(String s, int i, DeviceCategory devicecategory, int j)
    {
        DeviceCategory devicecategory1 = devicecategory;
        if (devicecategory == null)
        {
            Log.e("nf-NativeTransport", "Device class is uknown! It should not happen");
            devicecategory1 = DeviceCategory.UNKNOWN;
        }
        native_connect(s, i, devicecategory1.getValue(), j);
    }

    public static void enableCrashHandler()
    {
        native_enable_crash_handler();
    }

    public static String[] getSupportedVideoProfiles()
    {
        return native_getSupportedProfiles();
    }

    private boolean handleAndroid(Invoke invoke)
    {
        if (invoke instanceof SetVideoSurface)
        {
            return handleSetVideoSurface((SetVideoSurface)invoke);
        }
        if (invoke instanceof InitVisualOn)
        {
            return handleInitVisualOn((InitVisualOn)invoke);
        } else
        {
            return false;
        }
    }

    private boolean handleInitVisualOn(InitVisualOn initvisualon)
    {
        native_setVOapi(initvisualon.getPtr(), initvisualon.getCtxt());
        return true;
    }

    private boolean handleSetVideoSurface(SetVideoSurface setvideosurface)
    {
        mSurface = setvideosurface.getSurface();
        native_setVideoSurface();
        return true;
    }

    public static final boolean isDrmPlayPresent()
    {
        return drmPlayPresent;
    }

    public static boolean isHdCapable()
    {
        return hdCapable;
    }

    public static boolean isOMXALmpCapable()
    {
        return mpCapable;
    }

    public static boolean isPropertyStreamingVideoDrs()
    {
        return isPropertyStreamingVideoDrs;
    }

    private synchronized native void native_connect(String s, int i, String s1, int j);

    private static final synchronized native void native_enable_crash_handler();

    private static final synchronized native String[] native_getSupportedProfiles();

    private static final synchronized native boolean native_init(int i);

    private final synchronized native void native_invokeMethod(String s, String s1, String s2);

    private static final synchronized native boolean native_isPropertyStreamingVideoDrs();

    private static final synchronized native boolean native_is_hd_capable();

    private static final synchronized native boolean native_is_mp_capable();

    private synchronized native void native_release();

    private final synchronized native void native_setProperty(String s, String s1, String s2);

    private synchronized native void native_setVOapi(long l, long l1);

    private synchronized native void native_setVideoSurface();

    private final synchronized native void native_uiLoaded();

    private final synchronized native void native_uiUnloaded();

    private final synchronized native void native_updateBitrateCap();

    private void onCrashFromNative(int i, long l, long l1, long l2)
    {
        Log.e("nf-NativeTransport", (new StringBuilder()).append("Got crash from native: ").append(i).append(", signo: ").append(l).append(", errno: ").append(l1).append(", code: ").append(l2).toString());
        Object obj = Signal.toSignal(i);
        if (obj != null)
        {
            Log.e("nf-NativeTransport", (new StringBuilder()).append("Got crash from native: ").append(((Signal) (obj)).getDescription()).toString());
        } else
        {
            Log.e("nf-NativeTransport", "Got crash from native and it is not know. This should never happen!");
        }
        obj = new CrashReport(((Signal) (obj)), l, l1, l2, Process.myPid());
        proxy.postCrashReport(((CrashReport) (obj)));
    }

    private static void postEventFromNative(Object obj, String s)
    {
        if (Log.isLoggable("nf-NativeTransport", 3))
        {
            Log.d("nf-NativeTransport", (new StringBuilder()).append("Got event from native: ").append(s).toString());
        }
        obj = (NativeTransport)((WeakReference)obj).get();
        if (obj == null)
        {
            Log.e("nf-NativeTransport", "Native transport is NULL. This should NOT happen, event can not be handled!");
            return;
        }
        if (((NativeTransport) (obj)).mEventHandler != null)
        {
            s = ((NativeTransport) (obj)).mEventHandler.obtainMessage(0, s);
            ((NativeTransport) (obj)).mEventHandler.sendMessage(s);
            return;
        } else
        {
            Log.e("nf-NativeTransport", "Event handler is NULL. Unable to post handler!");
            return;
        }
    }

    public void close()
    {
        Log.d("nf-NativeTransport", "close:: noop");
    }

    public void connect()
    {
        Log.d("nf-NativeTransport", "connect started");
        if (bridge == null)
        {
            Log.e("nf-NativeTransport", "App is null? This SHOULD NOT happen!");
        }
        String s = bridge.getFileSystemRoot();
        EsnProvider esnprovider = bridge.getEsnProvider();
        IpConnectivityPolicy ipconnectivitypolicy = bridge.getIpConnectivityPolicy();
        mRootFileSystem = StringUtils.notNull("rootFileSystemn", s);
        mEsn = StringUtils.notNull("esn", esnprovider.getEsn());
        mFesn = StringUtils.notNull("esn", esnprovider.getFesn());
        mDeviceId = StringUtils.notNull("deviceId", esnprovider.getDeviceId());
        mDeviceModel = StringUtils.notNull("modelId", esnprovider.getDeviceModel());
        mDeviceLowMem = bridge.isDeviceLowMem();
        mVideoBufferSize = bridge.getConfigVideoBufferSize();
        if (ipconnectivitypolicy != null)
        {
            mIpConnectivityPolicy = ipconnectivitypolicy.getValue();
        }
        if (Log.isLoggable("nf-NativeTransport", 3))
        {
            Log.d("nf-NativeTransport", (new StringBuilder()).append("rootFileSystem: ").append(mRootFileSystem).toString());
            Log.d("nf-NativeTransport", (new StringBuilder()).append("esn: ").append(mEsn).toString());
            Log.d("nf-NativeTransport", (new StringBuilder()).append("deviceId: ").append(mDeviceId).toString());
            Log.d("nf-NativeTransport", (new StringBuilder()).append("deviceModel: ").append(mDeviceModel).toString());
            Log.d("nf-NativeTransport", (new StringBuilder()).append("LowMemDevice: ").append(mDeviceLowMem).toString());
            Log.d("nf-NativeTransport", (new StringBuilder()).append("VideoBufferSize: ").append(mVideoBufferSize).toString());
            Log.d("nf-NativeTransport", (new StringBuilder()).append("IP connectivity policy: ").append(mIpConnectivityPolicy).toString());
        }
        playerType = bridge.getCurrentPlayerType();
        if (playerType != null) goto _L2; else goto _L1
_L1:
        Log.e("nf-NativeTransport", "This should not happen, player type was null at this point! Use default.");
        playerType = PlayerTypeFactory.findDefaultPlayerType();
_L4:
        mBitrateCap = bridge.getBitrateCap();
        if (Log.isLoggable("nf-NativeTransport", 3))
        {
            Log.d("nf-NativeTransport", (new StringBuilder()).append("bitrate cap is ").append(mBitrateCap).toString());
        }
        if (playerType == PlayerType.device12 || playerType == PlayerType.device10 || playerType == PlayerType.device11)
        {
            MediaPlayerHelperFactory.getInstance(playerType);
            Log.d("nf-NativeTransport", (new StringBuilder()).append(playerType.getDescription()).append("helper initialized").toString());
        }
        connect(bridge.getInstallationSource(), playerType.getValue(), bridge.getDeviceCategory(), bridge.getEsnProvider().getCryptoFactoryType());
        Log.d("nf-NativeTransport", "connect done");
        return;
_L2:
        if (Log.isLoggable("nf-NativeTransport", 3))
        {
            Log.d("nf-NativeTransport", (new StringBuilder()).append("Player type is ").append(playerType.getDescription()).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void disconnect()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("nf-NativeTransport", "disconnect started");
        if (bridge != null)
        {
            bridge = null;
        }
        if (!destroyed)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        Log.w("nf-NativeTransport", "Trying to destroy already destroyed transport. This should not happen!");
_L1:
        Log.d("nf-NativeTransport", "disconnect done");
        this;
        JVM INSTR monitorexit ;
        return;
        native_release();
        destroyed = true;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void invokeMethod(Invoke invoke)
    {
        if (invoke == null)
        {
            throw new IllegalArgumentException("Command can not be null!");
        }
        if (invoke instanceof Play)
        {
            Log.d("nf-NativeTransport", "Play command, update bitrate cap");
            mBitrateCap = bridge.getBitrateCap();
            try
            {
                native_updateBitrateCap();
            }
            catch (Throwable throwable)
            {
                Log.w("nf-NativeTransport", "Failure in JNI. It may happend than NRDApp is null!", throwable);
            }
        }
        if (handleAndroid(invoke))
        {
            Log.d("nf-NativeTransport", "Handled directly by JNI");
            return;
        }
        Log.d("nf-NativeTransport", "Handled by bridge");
        try
        {
            native_invokeMethod(invoke.getObject(), invoke.getMethod(), invoke.getArguments());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Invoke invoke)
        {
            Log.w("nf-NativeTransport", "Failure in JNI. It may happend than NRDApp is null!", invoke);
        }
    }

    public void invokeMethod(String s, String s1, String s2)
    {
        if (Log.isLoggable("nf-NativeTransport", 3))
        {
            Log.d("nf-NativeTransport", (new StringBuilder()).append(" invokeMethod subobject = ").append(s).append(" method = ").append(s1).append(" jsonString = ").append(s2).toString());
        }
        String s3;
        if (s == null)
        {
            s = "nrdp";
        } else
        if (s.startsWith("nrdp"))
        {
            Log.d("nf-NativeTransport", "setProperty:: Already starts nrdp");
        } else
        {
            s = (new StringBuilder()).append("nrdp.").append(s).toString();
        }
        s3 = s2;
        if (s2 == null)
        {
            s3 = "";
        }
        if ("play".equals(s1))
        {
            Log.d("nf-NativeTransport", "Play command, update bitrate cap");
            mBitrateCap = bridge.getBitrateCap();
            native_updateBitrateCap();
        }
        try
        {
            native_invokeMethod(s, s1, s3);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("nf-NativeTransport", "Failure in JNI. It may happend than NRDApp is null!", s);
        }
    }

    public void setProperty(String s, String s1, String s2)
    {
        if (Log.isLoggable("nf-NativeTransport", 3))
        {
            Log.d("nf-NativeTransport", (new StringBuilder()).append(" setProperty subobject = ").append(s).append(" property = ").append(s1).append(" jsonString = ").append(s2).toString());
        }
        if (s == null)
        {
            s = "nrdp";
        } else
        if (s.startsWith("nrdp"))
        {
            Log.d("nf-NativeTransport", "setProperty:: Already starts nrdp");
        } else
        {
            s = (new StringBuilder()).append("nrdp.").append(s).toString();
        }
        try
        {
            native_setProperty(s, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("nf-NativeTransport", "Failure in JNI. It may happend than NRDApp is null!", s);
        }
    }

    public void uiLoaded()
    {
        native_uiLoaded();
    }

    public void uiUnloaded()
    {
        native_uiUnloaded();
    }


}
