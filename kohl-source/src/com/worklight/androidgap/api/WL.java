// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.api;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import com.worklight.androidgap.PrepackagedAssetsManager;
import com.worklight.androidgap.WLInitError;
import com.worklight.androidgap.WLSplashScreen;
import com.worklight.androidgap.actionsender.WLAction;
import com.worklight.androidgap.actionsender.WLActionSender;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.common.WLTrusteer;
import com.worklight.common.security.PRNGFixes;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.HttpClientManager;
import com.worklight.wlclient.api.WLClient;
import java.io.File;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.api:
//            WLInitWebFrameworkResult, WLActionReceiver, WLInitWebFrameworkListener

public class WL
{
    private class PrepareClient extends AsyncTask
    {

        private WLInitWebFrameworkListener listener;
        final WL this$0;

        protected transient WLInitWebFrameworkResult doInBackground(Context acontext[])
        {
            return doPrepareAssetsWork(acontext[0]);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Context[])aobj);
        }

        protected void onPostExecute(WLInitWebFrameworkResult wlinitwebframeworkresult)
        {
            if (listener != null)
            {
                listener.onInitWebFrameworkComplete(wlinitwebframeworkresult);
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((WLInitWebFrameworkResult)obj);
        }

        PrepareClient(WLInitWebFrameworkListener wlinitwebframeworklistener)
        {
            this$0 = WL.this;
            super();
            listener = null;
            listener = wlinitwebframeworklistener;
        }
    }


    private static final String ENABLE_SETTINGS_FLAG = "enableSettings";
    private static String FAILURE_INTERNAL_DEFAULT_MESSAGE = "worklightInitInternalError";
    private static String FAILURE_NOT_ENOUGH_SPACE_MESSAGE = "worklightInitNotEnoughSpace";
    private static String RESOURSE_NOT_FOUND = "Message resource not found for key: ";
    private static final String SKIN_LOADER_HTML = "skinLoader.html";
    private static WL instance;
    private Logger logger;
    private boolean webFrameworkInitialized;

    private WL(Activity activity)
    {
        webFrameworkInitialized = false;
        logger = Logger.getInstance("wl");
        Logger.setContext(activity.getApplicationContext());
        WLConfig.createInstance(activity.getApplicationContext());
        logger.trace("WL Constructor");
        WLTrusteer.createInstance(activity.getApplicationContext());
        try
        {
            PRNGFixes.apply();
        }
        catch (Exception exception)
        {
            logger.error("Failed to apply Android PRNG secure random fixes.");
        }
        HttpClientManager.createInstance(activity.getApplicationContext());
    }

    private WLInitWebFrameworkResult buildInitResult(int i, Map map, Context context)
    {
        if (i == WLInitWebFrameworkResult.FAILURE_NOT_ENOUGH_SPACE) goto _L2; else goto _L1
_L1:
label0:
        {
            String s = WLUtils.getResourceString(FAILURE_INTERNAL_DEFAULT_MESSAGE, context);
            if (s != null)
            {
                context = s;
                if (!s.equals(""))
                {
                    break label0;
                }
            }
            context = (new StringBuilder()).append(RESOURSE_NOT_FOUND).append(FAILURE_INTERNAL_DEFAULT_MESSAGE).toString();
        }
_L4:
        return new WLInitWebFrameworkResult(i, context, map);
_L2:
        long l = ((Long)map.get(WLInitWebFrameworkResult.DATA_SPACE_REQUIRED)).longValue();
        Object obj = new DecimalFormat("#.##");
        obj = WLUtils.getResourceString(FAILURE_NOT_ENOUGH_SPACE_MESSAGE, ((DecimalFormat) (obj)).format((double)l / 1048576D), context);
        if (obj != null)
        {
            context = ((Context) (obj));
            if (!((String) (obj)).equals(""))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        context = (new StringBuilder()).append(RESOURSE_NOT_FOUND).append(FAILURE_NOT_ENOUGH_SPACE_MESSAGE).toString();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static WL createInstance(Activity activity)
    {
        com/worklight/androidgap/api/WL;
        JVM INSTR monitorenter ;
        instance = new WL(activity);
        activity = instance;
        com/worklight/androidgap/api/WL;
        JVM INSTR monitorexit ;
        return activity;
        activity;
        throw activity;
    }

    private WLInitWebFrameworkResult doPrepareAssetsWork(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        WLInitWebFrameworkResult wlinitwebframeworkresult = new WLInitWebFrameworkResult(WLInitWebFrameworkResult.SUCCESS, "");
        PrepackagedAssetsManager prepackagedassetsmanager = new PrepackagedAssetsManager(context);
        if (!prepackagedassetsmanager.isNewInstallOrUpgrade()) goto _L2; else goto _L1
_L1:
        prepackagedassetsmanager.copyPrepackagedAssetsToLocalStorage();
_L5:
        if (!WLConfig.getInstance().isShouldTestWebResourcesChecksum()) goto _L4; else goto _L3
_L3:
        prepackagedassetsmanager.testResourcesChecksum();
_L7:
        WLConfig.getInstance().setDefaultRootUrlPref();
        WLConfig.getInstance().setExitOnSkinLoaderPref(false);
        WLConfig.getInstance().writeWLPref("enableSettings", WLConfig.getInstance().getSettingsFlag().toString());
        webFrameworkInitialized = true;
        context = wlinitwebframeworkresult;
_L6:
        this;
        JVM INSTR monitorexit ;
        return context;
_L2:
        verifyWwwSkinFolderExists();
          goto _L5
        Object obj;
        obj;
        logger.error(((WLInitError) (obj)).getMessage());
        context = buildInitResult(((WLInitError) (obj)).getErrorStatus(), ((WLInitError) (obj)).getExtraData(), context);
          goto _L6
_L4:
        logger.debug("no need to check web resource integrity");
          goto _L7
        obj;
        logger.error(((Throwable) (obj)).getMessage());
        context = buildInitResult(WLInitWebFrameworkResult.FAILURE_INTERNAL, null, context);
          goto _L6
        context;
        throw context;
          goto _L5
    }

    public static WL getInstance()
    {
        if (instance == null)
        {
            throw new IllegalStateException("WL should be created first.");
        } else
        {
            return instance;
        }
    }

    private void verifyWwwSkinFolderExists()
    {
        WLConfig wlconfig = WLConfig.getInstance();
        if (wlconfig.isExternalWebResources())
        {
            File file = new File((new StringBuilder()).append(wlconfig.getApplicationAbsolutePathToExternalWWWFiles()).append("/").append(wlconfig.getSkinNamePref()).toString());
            if (!file.exists())
            {
                String s = wlconfig.readWLPref("wlDirectUppdateTempFolder");
                if (s != null)
                {
                    (new File(s)).renameTo(file);
                }
            }
        }
        wlconfig.writeWLPref("wlDirectUppdateTempFolder", null);
    }

    public void addActionReceiver(WLActionReceiver wlactionreceiver)
    {
        WLActionSender.getInstance().addActionReceiver(wlactionreceiver, false, null);
    }

    public String getMainHtmlFilePath()
    {
        if (!webFrameworkInitialized)
        {
            throw new IllegalStateException("Worklight web framework is not initialized. Call WL.initializeWebFramework() first.");
        }
        Object obj;
        obj = WLConfig.getInstance().getMainFileFromDescriptor();
        if (((String) (obj)).startsWith("http:") || ((String) (obj)).startsWith("https:"))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        try
        {
            obj = WLConfig.getInstance().getSkinNamePref();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException("Worklight is not initialized, call WL.createInstance() first.", ((Throwable) (obj)));
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = WLConfig.getInstance().getAppWebUrl(((String) (obj)));
        break MISSING_BLOCK_LABEL_119;
        obj = (new StringBuilder()).append(WLConfig.getInstance().getWebUrl()).append("/").append("skinLoader.html").toString();
        break MISSING_BLOCK_LABEL_119;
        return ((String) (obj));
        return ((String) (obj));
    }

    public URL getServerUrl()
    {
        return WLClient.getInstance().getServerUrl();
    }

    public void hideSplashScreen()
    {
        WLSplashScreen.getInstance().hide();
    }

    public void initializeWebFramework(Context context, WLInitWebFrameworkListener wlinitwebframeworklistener)
    {
        (new PrepareClient(wlinitwebframeworklistener)).execute(new Context[] {
            context.getApplicationContext()
        });
    }

    public void removeActionReceiver(WLActionReceiver wlactionreceiver)
    {
        WLActionSender.getInstance().removeActionReceiver(wlactionreceiver, false);
    }

    public void sendActionToJS(String s)
    {
        sendActionToJS(s, null);
    }

    public void sendActionToJS(String s, JSONObject jsonobject)
    {
        s = new WLAction(s, jsonobject, null);
        WLActionSender.getInstance().sendActionToJS(s);
    }

    public void setServerUrl(URL url)
    {
        WLClient.getInstance().setServerUrl(url);
    }

    public void showSplashScreen(Activity activity)
    {
        WLSplashScreen.getInstance().show(activity);
    }


}
