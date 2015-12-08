// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import org.chromium.base.ApplicationStatusManager;
import org.chromium.base.CommandLine;
import org.chromium.base.PathUtils;
import org.chromium.base.ResourceExtractor;
import org.chromium.base.ThreadUtils;
import org.chromium.base.library_loader.LibraryLoader;
import org.chromium.base.library_loader.ProcessInitException;
import org.chromium.content.browser.BrowserStartupController;
import org.chromium.content.browser.DeviceUtils;
import org.chromium.net.NetworkChangeNotifier;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal, XWalkPreferencesInternal

class XWalkViewDelegate
{

    private static final String COMMAND_LINE_FILE = "xwalk-command-line";
    private static final String MANDATORY_LIBRARIES[];
    private static final String MANDATORY_PAKS[];
    private static final String PRIVATE_DATA_DIRECTORY_SUFFIX = "xwalkcore";
    private static final String TAG = "XWalkViewDelegate";
    private static final String XWALK_RESOURCES_LIST_RES_NAME = "xwalk_resources_list";
    private static boolean sInitialized;
    private static boolean sLibraryLoaded;
    private static boolean sRunningOnIA;

    XWalkViewDelegate()
    {
    }

    public static void init(XWalkViewInternal xwalkviewinternal)
        throws UnsatisfiedLinkError
    {
        if (sInitialized)
        {
            return;
        }
        loadXWalkLibrary(xwalkviewinternal.getContext());
        ApplicationStatusManager.init(xwalkviewinternal.getActivity().getApplication());
        NetworkChangeNotifier.init(xwalkviewinternal.getActivity());
        NetworkChangeNotifier.setAutoDetectConnectivityState(true);
        ApplicationStatusManager.informActivityStarted(xwalkviewinternal.getActivity());
        xwalkviewinternal = xwalkviewinternal.getViewContext();
        if (!CommandLine.isInitialized())
        {
            CommandLine.init(readCommandLine(xwalkviewinternal.getApplicationContext()));
        }
        ResourceExtractor.setMandatoryPaksToExtract(MANDATORY_PAKS);
        int i = xwalkviewinternal.getResources().getIdentifier("xwalk_resources_list", "array", xwalkviewinternal.getPackageName());
        AssetManager assetmanager = xwalkviewinternal.getAssets();
        if (!xwalkviewinternal.getPackageName().equals(xwalkviewinternal.getApplicationContext().getPackageName()) || i != 0)
        {
            ResourceExtractor.setResourceIntercepter(new org.chromium.base.ResourceExtractor.ResourceIntercepter(xwalkviewinternal, assetmanager, i) {

                final AssetManager val$assets;
                final Context val$context;
                final int val$resourcesListResId;

                public Set getInterceptableResourceList()
                {
                    HashSet hashset = new HashSet();
                    if (context.getPackageName().equals(context.getApplicationContext().getPackageName())) goto _L2; else goto _L1
_L1:
                    String as[];
                    int j;
                    int l;
                    try
                    {
                        as = assets.list("");
                        l = as.length;
                    }
                    catch (IOException ioexception)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    j = 0;
_L3:
                    if (j >= l)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    hashset.add(as[j]);
                    j++;
                    continue; /* Loop/switch isn't completed */
                    if (true) goto _L3; else goto _L2
_L2:
                    if (resourcesListResId == 0) goto _L5; else goto _L4
_L4:
                    String as1[];
                    int i1;
                    as1 = context.getResources().getStringArray(resourcesListResId);
                    i1 = as1.length;
                    int k = 0;
_L6:
                    if (k >= i1)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    hashset.add(as1[k]);
                    k++;
                    if (true) goto _L6; else goto _L5
                    android.content.res.Resources.NotFoundException notfoundexception;
                    notfoundexception;
                    Log.w("XWalkViewDelegate", "R.array.xwalk_resources_list can't be found.");
_L5:
                    return hashset;
                }

                public InputStream interceptLoadingForResource(String s)
                {
                    if (context.getPackageName().equals(context.getApplicationContext().getPackageName()))
                    {
                        break MISSING_BLOCK_LABEL_67;
                    }
                    InputStream inputstream = context.getAssets().open(s);
                    if (inputstream != null)
                    {
                        return inputstream;
                    }
                    break MISSING_BLOCK_LABEL_67;
                    Object obj;
                    obj;
                    Log.w("XWalkViewDelegate", (new StringBuilder()).append(s).append(" can't be found in assets.").toString());
                    int j;
                    if (resourcesListResId == 0)
                    {
                        break MISSING_BLOCK_LABEL_153;
                    }
                    s = s.split("\\.")[0];
                    j = context.getResources().getIdentifier(s, "raw", context.getPackageName());
                    if (j == 0)
                    {
                        break MISSING_BLOCK_LABEL_153;
                    }
                    obj = context.getResources().openRawResource(j);
                    return ((InputStream) (obj));
                    obj;
                    Log.w("XWalkViewDelegate", (new StringBuilder()).append("R.raw.").append(s).append(" can't be found.").toString());
                    return null;
                }

            
            {
                context = context1;
                assets = assetmanager;
                resourcesListResId = i;
                super();
            }
            });
        }
        ResourceExtractor.setExtractImplicitLocaleForTesting(false);
        ResourceExtractor.get(xwalkviewinternal);
        startBrowserProcess(xwalkviewinternal);
        sInitialized = true;
    }

    public static boolean isRunningOnIA()
    {
        return sRunningOnIA;
    }

    private static void loadLibrary(Context context)
    {
        PathUtils.setPrivateDataDirectorySuffix("xwalkcore");
        try
        {
            LibraryLoader.loadNow(context, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("Cannot load Crosswalk Core", context);
        }
    }

    public static void loadXWalkLibrary(Context context)
        throws UnsatisfiedLinkError
    {
        if (sLibraryLoaded)
        {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 17 && context != null && !context.getApplicationContext().getPackageName().equals(context.getPackageName()))
        {
            String as[] = MANDATORY_LIBRARIES;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                System.load((new StringBuilder()).append("/data/data/").append(context.getPackageName()).append("/lib/").append(s).toString());
            }

        }
        loadLibrary(context);
        if (sRunningOnIA && !nativeIsLibraryBuiltForIA())
        {
            throw new UnsatisfiedLinkError();
        } else
        {
            sLibraryLoaded = true;
            return;
        }
    }

    private static native boolean nativeIsLibraryBuiltForIA();

    private static String[] readCommandLine(Context context)
    {
        Object obj;
        Exception exception;
        obj = null;
        exception = null;
        char ac[];
        StringBuilder stringbuilder;
        context = context.getAssets().open("xwalk-command-line", 3);
        ac = new char[1024];
        stringbuilder = new StringBuilder();
        context = new InputStreamReader(context, "UTF-8");
_L3:
        int i = context.read(ac, 0, 1024);
        if (i == -1) goto _L2; else goto _L1
_L1:
        stringbuilder.append(ac, 0, i);
          goto _L3
        obj;
_L7:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("XWalkViewDelegate", "Unable to close file reader.", context);
                return null;
            }
        }
        return null;
_L2:
        obj = CommandLine.tokenizeQuotedAruments(stringbuilder.toString().toCharArray());
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("XWalkViewDelegate", "Unable to close file reader.", context);
            }
        }
        return ((String []) (obj));
        context;
_L5:
        if (obj != null)
        {
            try
            {
                ((InputStreamReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("XWalkViewDelegate", "Unable to close file reader.", ((Throwable) (obj)));
            }
        }
        throw context;
        exception;
        obj = context;
        context = exception;
        if (true) goto _L5; else goto _L4
_L4:
        context;
        context = exception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static void startBrowserProcess(Context context)
    {
        ThreadUtils.runOnUiThreadBlocking(new Runnable(context) {

            final Context val$context;

            public void run()
            {
                try
                {
                    LibraryLoader.ensureInitialized();
                }
                catch (ProcessInitException processinitexception)
                {
                    throw new RuntimeException("Cannot initialize Crosswalk Core", processinitexception);
                }
                DeviceUtils.addDeviceSpecificUserAgentSwitch(context);
                CommandLine.getInstance().appendSwitchWithValue("profile-name", XWalkPreferencesInternal.getStringValue("profile-name"));
                try
                {
                    BrowserStartupController.get(context).startBrowserProcessesSync(true);
                    return;
                }
                catch (ProcessInitException processinitexception1)
                {
                    throw new RuntimeException("Cannot initialize Crosswalk Core", processinitexception1);
                }
            }

            
            {
                context = context1;
                super();
            }
        });
    }

    static 
    {
        sInitialized = false;
        sLibraryLoaded = false;
        sRunningOnIA = true;
        MANDATORY_PAKS = (new String[] {
            "xwalk.pak", "en-US.pak", "icudtl.dat"
        });
        MANDATORY_LIBRARIES = (new String[] {
            "libxwalkcore.so"
        });
        sRunningOnIA = Build.CPU_ABI.equalsIgnoreCase("x86");
        if (sRunningOnIA)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        InputStreamReader inputstreamreader = new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream());
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        sRunningOnIA = bufferedreader.readLine().contains("x86");
        bufferedreader.close();
        inputstreamreader.close();
        return;
        IOException ioexception;
        ioexception;
        Log.w("XWalkViewDelegate", Log.getStackTraceString(ioexception));
    }
}
