// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.NrdProxyFactory;
import com.netflix.mediaclient.javabridge.invoke.android.SetLanguage;
import com.netflix.mediaclient.javabridge.invoke.android.SetNetworkInterfaces;
import com.netflix.mediaclient.javabridge.invoke.mdx.InterfaceChanged;
import com.netflix.mediaclient.javabridge.ui.Device;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.javabridge.ui.android.NrdpWrapper;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.net.IpConnectivityPolicy;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.repository.UserLocale;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.util.AppStoreHelper;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.FileUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.io.File;
import java.util.Locale;

// Referenced classes of package com.netflix.mediaclient.service:
//            ServiceAgent

public class NrdController extends ServiceAgent
{
    private class NrdBridge
        implements Bridge
    {

        final NrdController this$0;

        public int getBitrateCap()
        {
            return getConfigurationAgent().getBitrateCap();
        }

        public int getConfigVideoBufferSize()
        {
            return getConfigurationAgent().getVideoBufferSize();
        }

        public PlayerType getCurrentPlayerType()
        {
            return getConfigurationAgent().getCurrentPlayerType();
        }

        public DeviceCategory getDeviceCategory()
        {
            return getConfigurationAgent().getDeviceCategory();
        }

        public Locale getDeviceLocale()
        {
            return UserLocale.getDeviceLocale(getContext());
        }

        public Display getDisplaySize()
        {
            WindowManager windowmanager = (WindowManager)getContext().getSystemService("window");
            if (windowmanager != null)
            {
                return windowmanager.getDefaultDisplay();
            } else
            {
                return null;
            }
        }

        public EsnProvider getEsnProvider()
        {
            return getConfigurationAgent().getEsnProvider();
        }

        public String getFileSystemRoot()
        {
            return getContext().getFilesDir().getAbsolutePath();
        }

        public String getInstallationSource()
        {
            return AppStoreHelper.getInstallationSource(getContext());
        }

        public IpConnectivityPolicy getIpConnectivityPolicy()
        {
            return getConfigurationAgent().getIpConnectivityPolicy();
        }

        public NrdProxy getNrdProxy()
        {
            return nrd;
        }

        public Nrdp getNrdp()
        {
            return nrdp;
        }

        public String getSoftwareVersion()
        {
            return getConfigurationAgent().getSoftwareVersion();
        }

        public boolean isDeviceLowMem()
        {
            return getConfigurationAgent().isDeviceLowMem();
        }

        private NrdBridge()
        {
            this$0 = NrdController.this;
            super();
        }

    }

    private class NrdJSCmdReceiver extends BroadcastReceiver
    {

        public static final String JS_BRIDGE_INTENT = "com.netflix.mediaclient.intent.action.JS_BRIDGE_CMD";
        final NrdController this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (Log.isLoggable("nf_nrdcontroller", 3))
            {
                Log.d("nf_nrdcontroller", (new StringBuilder()).append("Received an action: ").append(intent.getAction()).toString());
            }
            if (!"com.netflix.mediaclient.intent.action.JS_BRIDGE_CMD".equals(intent.getAction()))
            {
                break MISSING_BLOCK_LABEL_158;
            }
            Object obj;
            try
            {
                obj = intent.getExtras();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("nf_nrdcontroller", "Unintented Exception thrown ", context);
                return;
            }
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_158;
            }
            context = ((Bundle) (obj)).getString("object");
            intent = ((Bundle) (obj)).getString("method");
            obj = ((Bundle) (obj)).getString("params");
            if (context == null || intent == null || obj == null)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            nrd.invokeMethod(context, intent, ((String) (obj)));
            if (Log.isLoggable("nf_nrdcontroller", 3))
            {
                Log.d("nf_nrdcontroller", (new StringBuilder()).append("JS CMD: object: ").append(context).append(" method:  ").append(intent).append(" param: ").append(((String) (obj))).toString());
            }
        }

        private NrdJSCmdReceiver()
        {
            this$0 = NrdController.this;
            super();
        }
    }


    private static final String CA_FILENAME = "ca.pem";
    private static final String TAG = "nf_nrdcontroller";
    private NrdJSCmdReceiver mNrdJsCmdReceiver;
    private NrdProxy nrd;
    private Nrdp nrdp;

    public NrdController()
    {
    }

    private void initializeNrdLib()
        throws Exception
    {
        Log.d("nf_nrdcontroller", "Initialize NRD bridge first");
        if (nrd != null)
        {
            throw new IllegalStateException("nrd is already created.  This should not happen!");
        } else
        {
            nrd = NrdProxyFactory.createInstance(new NrdBridge());
            nrd.init(null);
            Log.d("nf_nrdcontroller", "NRD bridge initialization done");
            Log.d("nf_nrdcontroller", "Start listening for updates from NRDLIb");
            nrdp = new NrdpWrapper(nrd);
            nrdp.addEventListener("init", new EventListener() {

                final NrdController this$0;

                public void received(UIEvent uievent)
                {
                    (new BackgroundTask()).execute(new Runnable() {

                        final _cls1 this$1;
                        final EventListener val$el;

                        public void run()
                        {
                            Log.d("nf_nrdcontroller", "Bridge is initialized");
                            nrdp.removeEventListener("init", el);
                            nrdp.getDevice().setUIVersion(getConfigurationAgent().getSoftwareVersion());
                            initCompleted(0);
                        }

            
            {
                this$1 = final__pcls1;
                el = EventListener.this;
                super();
            }
                    });
                }

            
            {
                this$0 = NrdController.this;
                super();
            }
            });
            nrd.connect();
            return;
        }
    }

    private boolean loadNrdLib()
    {
        FileUtils.copyFileFromAssetToFS(getContext(), "ca.pem", "ca.pem", false);
        if (SecurityRepository.isLoaded())
        {
            break MISSING_BLOCK_LABEL_29;
        }
        Log.e("nf_nrdcontroller", "Native libraries failed to load. Probably not enough space left on device.");
        return false;
        try
        {
            Log.d("nf_nrdcontroller", "Initializing NrdLib");
            initializeNrdLib();
        }
        catch (Exception exception)
        {
            Log.e("nf_nrdcontroller", "Failed to initiate NRDLib", exception);
            return false;
        }
        return true;
    }

    private void postNrdInit()
    {
        setDeviceLocale(UserLocale.getDeviceLocale(getContext()));
        Log.d("nf_nrdcontroller", "Sets IP address and interface");
        nrd.invokeMethod(new InterfaceChanged(getContext()));
    }

    private void setUIVersion()
    {
    }

    public void destroy()
    {
        if (mNrdJsCmdReceiver != null)
        {
            getContext().unregisterReceiver(mNrdJsCmdReceiver);
        }
        if (nrd != null)
        {
            nrd.disconnect();
            nrd.destroy();
            nrd = null;
        }
        nrdp = null;
        super.destroy();
    }

    protected void doInit()
    {
        Log.d("nf_nrdcontroller", "NrdController starting doInit");
        if (!loadNrdLib())
        {
            initCompleted(-4);
        }
    }

    public Nrdp getNrdp()
    {
        return nrdp;
    }

    public void setActivationToken(String s, String s1)
    {
    }

    public void setDeviceLocale(Locale locale)
    {
        if (locale != null)
        {
            if (StringUtils.isNotEmpty(locale = UserLocale.toUserLocale(locale)))
            {
                Log.d("nf_nrdcontroller", (new StringBuilder()).append("Sets device language to JNI to ").append(locale).toString());
                if (nrd != null)
                {
                    nrd.invokeMethod(new SetLanguage(locale));
                    return;
                }
            }
        }
    }

    public void setNetworkInterfaces()
    {
        if (nrd != null)
        {
            nrd.invokeMethod(new SetNetworkInterfaces(getContext()));
        }
    }

    public void setPreferredLanguages(String as[])
    {
        StringUtils.joinArray(as);
    }


}
