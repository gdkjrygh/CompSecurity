// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.worklight.androidgap.plugin.NativePage;
import com.worklight.androidgap.plugin.WLMenuItem;
import com.worklight.androidgap.plugin.WLOptionsMenu;
import com.worklight.common.WLConfig;
import com.worklight.common.WLUtils;
import com.worklight.common.security.ProvisioningDelegateImpl;
import com.worklight.common.security.WLDeviceAuthManager;
import com.worklight.utils.Base64;
import com.worklight.utils.SecurityUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.DroidGap;
import org.apache.cordova.api.PluginManager;
import org.json.JSONException;
import org.json.JSONObject;

public class WLDroidGap extends DroidGap
{
    public class PrepackagedAssetsManager
    {

        final WLDroidGap this$0;

        private void copyPrepackagedAssetsToLocalCopy()
        {
            Object obj;
            byte abyte0[];
            AssetManager assetmanager;
            boolean flag;
            long l;
            long l1;
            assetmanager = getApplicationContext().getAssets();
            boolean flag1;
            boolean flag2;
            try
            {
                WLUtils.deleteDirectory(new File(getLocalStorageWebRoot()));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                WLUtils.error(String.format("Problem deleting directory %s. This might happen if the application was installed, then the shareduserID was changed, and the application was redeployed", new Object[] {
                    getLocalStorageWebRoot()
                }));
                System.exit(0);
            }
            WLUtils.debug("Started copying files to local storage...");
            abyte0 = null;
            flag1 = false;
            flag2 = Arrays.asList(assetmanager.list("www")).contains("resources.zip");
            obj = abyte0;
            flag1 = flag2;
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            flag1 = flag2;
            obj = assetmanager.open("www/resources.zip");
            flag1 = flag2;
_L6:
            if (!flag1) goto _L2; else goto _L1
_L1:
            WLUtils.debug("Found resources.zip file. Starting decryption and unzipping process.");
            abyte0 = Base64.decode("JfnnlDI7RTiF9RgfG2JNCw==".getBytes());
            l = assetmanager.openFd("www/resources.zip").getLength();
            l1 = WLUtils.getFreeSpaceOnDevice();
            if (3L * l < l1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (l > 0L) goto _L4; else goto _L3
_L3:
            try
            {
                WLUtils.debug("Failed unzipping Resources.zip. File seems to be corruptted.");
                return;
            }
            catch (IOException ioexception)
            {
                WLUtils.debug((new StringBuilder("Error while unpacking resources.zip file.")).append(ioexception.getMessage()).toString());
                ioexception.printStackTrace();
            }
            catch (Exception exception)
            {
                WLUtils.debug((new StringBuilder("Error during decryption of resources.zip file.")).append(exception.getMessage()).toString());
            }
              goto _L5
            obj;
            WLUtils.debug((new StringBuilder("I/O failure while reading resources.zip from application package.")).append(((IOException) (obj)).getMessage()).toString());
            obj = abyte0;
              goto _L6
_L4:
            if (!flag) goto _L8; else goto _L7
_L7:
            WLUtils.unpack(SecurityUtils.decryptData(((InputStream) (obj)), abyte0), new File(getLocalStorageWebRoot()));
            WLUtils.debug("Resources.zip unzipped");
_L5:
            WLUtils.debug("Finished copying files to local storage...");
            return;
_L8:
            WLUtils.debug((new StringBuilder("Resources.zip cannot be unzipped. Not enough space available on the device. Required size: ")).append(3L * l).append(" Available size: ").append(l1).toString());
            DecimalFormat decimalformat = new DecimalFormat("#.##");
            WLUtils.showDialog(WLDroidGap.this, "Error", (new StringBuilder("The application needs ")).append(decimalformat.format((double)(3L * l) / 1048576D)).append(" MB to initialize, but only ").append(decimalformat.format((double)l1 / 1048576D)).append(" MB are available. Please free some space and try again.").toString(), "Exit", new android.content.DialogInterface.OnClickListener() {

                final PrepackagedAssetsManager this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.dismiss();
                    System.exit(0);
                }

            
            {
                this$1 = PrepackagedAssetsManager.this;
                super();
            }
            });
            fatalErrorOccurred = true;
            return;
_L2:
            copyPrepackagedAssetsToLocalCopy(assetmanager, "www", getLocalStorageRoot());
            copyPrepackagedAssetsToLocalCopy(assetmanager, "wlclient.properties", getLocalStorageWebRoot());
            if (true) goto _L5; else goto _L9
_L9:
        }

        private void copyPrepackagedAssetsToLocalCopy(AssetManager assetmanager, String s, String s1)
        {
            Object obj1;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            File file;
            obj3 = null;
            obj1 = null;
            obj6 = null;
            obj2 = null;
            obj8 = null;
            obj7 = null;
            file = new File((new StringBuilder(String.valueOf(s1))).append("/").append(s).toString());
            obj5 = obj2;
            obj4 = obj8;
            Object obj = assetmanager.open(s);
            obj6 = obj;
            obj3 = obj;
            obj5 = obj2;
            obj1 = obj;
            obj4 = obj8;
            obj2 = new FileOutputStream(file);
            WLUtils.copyFile(((InputStream) (obj)), ((OutputStream) (obj2)));
            obj6 = obj2;
            obj7 = obj;
_L2:
            String as[];
            int i;
            if (obj7 != null)
            {
                try
                {
                    ((InputStream) (obj7)).close();
                }
                // Misplaced declaration of an exception variable
                catch (AssetManager assetmanager)
                {
                    WLUtils.error((new StringBuilder("Failed close file input stream: ")).append(s).append(". ").append(assetmanager.toString()).toString());
                }
            }
            if (obj6 == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            ((OutputStream) (obj6)).close();
            return;
            obj;
            obj2 = obj7;
            obj = obj6;
_L8:
            obj3 = obj;
            obj5 = obj2;
            obj1 = obj;
            obj4 = obj2;
            file.mkdirs();
            obj3 = obj;
            obj5 = obj2;
            obj1 = obj;
            obj4 = obj2;
            as = assetmanager.list(s);
            i = 0;
_L3:
            obj7 = obj;
            obj6 = obj2;
            obj3 = obj;
            obj5 = obj2;
            obj1 = obj;
            obj4 = obj2;
            if (i >= as.length) goto _L2; else goto _L1
_L1:
            obj3 = obj;
            obj5 = obj2;
            obj1 = obj;
            obj4 = obj2;
            copyPrepackagedAssetsToLocalCopy(assetmanager, (new StringBuilder(String.valueOf(s))).append("/").append(as[i]).toString(), s1);
            i++;
              goto _L3
            assetmanager;
            obj4 = obj5;
            obj = obj3;
_L7:
            obj1 = obj;
            throw new RuntimeException((new StringBuilder("PrepackagedAssetsManager Failure. Failed copying prepackaged assets to local storage. The exception occurred when copying the following file/directory: ")).append(file.getAbsoluteFile()).toString(), assetmanager);
            assetmanager;
            obj = obj1;
_L5:
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    WLUtils.error((new StringBuilder("Failed close file input stream: ")).append(s).append(". ").append(s1.toString()).toString());
                }
            }
            if (obj4 != null)
            {
                try
                {
                    ((OutputStream) (obj4)).close();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    WLUtils.error((new StringBuilder("Failed close file output stream: ")).append(file.getAbsolutePath()).append(". ").append(s.toString()).toString());
                }
            }
            throw assetmanager;
            assetmanager;
            WLUtils.error((new StringBuilder("Failed close file output stream: ")).append(file.getAbsolutePath()).append(". ").append(assetmanager.toString()).toString());
            return;
            assetmanager;
            obj4 = obj2;
            if (true) goto _L5; else goto _L4
_L4:
            assetmanager;
            obj4 = obj2;
            if (true) goto _L7; else goto _L6
_L6:
            IOException ioexception;
            ioexception;
              goto _L8
        }

        private void copyPrepackagedAssetsToLocalCopyIfNeeded()
        {
            if (isNewPackage())
            {
                WLUtils.debug("New installation/upgrade detected, copying resources and saving new checksum");
                WLUtils.clearWLPref(getApplicationContext());
                copyPrepackagedAssetsToLocalCopy();
            }
            testResourcesChecksum();
        }

        private boolean isNewPackage()
        {
label0:
            {
                boolean flag = false;
                try
                {
                    long l = (new File(getPackageManager().getApplicationInfo(getPackageName(), 0).sourceDir)).lastModified();
                    Object obj = getPreferences(0);
                    if (l <= ((SharedPreferences) (obj)).getLong("appInstallTime", 0L))
                    {
                        break label0;
                    }
                    obj = ((SharedPreferences) (obj)).edit();
                    ((android.content.SharedPreferences.Editor) (obj)).putLong("appInstallTime", l);
                    ((android.content.SharedPreferences.Editor) (obj)).commit();
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    throw new RuntimeException("PrepackagedAssetsManager Failure. Can't retrieve ApplicationInfo - something fundumental went wrong here.", namenotfoundexception);
                }
                flag = true;
            }
            return flag;
        }


        public PrepackagedAssetsManager()
        {
            this$0 = WLDroidGap.this;
            super();
        }
    }

    class PrepackagedAssetsManager.Checksum
        implements Comparable
    {

        private String checksum;
        private Long date;
        private String machine;
        final PrepackagedAssetsManager this$1;

        public int compareTo(PrepackagedAssetsManager.Checksum checksum1)
        {
            if (checksum.compareTo(checksum1.checksum) != 0)
            {
                return date.compareTo(checksum1.date);
            } else
            {
                return 0;
            }
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((PrepackagedAssetsManager.Checksum)obj);
        }

        public String getChecksum()
        {
            return checksum;
        }

        public Long getDate()
        {
            return date;
        }

        public String getMachine()
        {
            return machine;
        }

        public PrepackagedAssetsManager.Checksum(JSONObject jsonobject)
            throws JSONException
        {
            this$1 = PrepackagedAssetsManager.this;
            super();
            checksum = jsonobject.getString("checksum");
            date = Long.valueOf(jsonobject.getLong("date"));
            machine = jsonobject.getString("machine");
        }
    }


    private static final String CLEAR_CACHE_NEXT_LOAD = "com.worklight.clearCacheNextLoad";
    private static final String ENABLE_SETTINGS_FLAG = "enableSettings";
    public static final String EXIT_ON_SKIN_LOADER = "exitOnSkinLoader";
    private static final String NATIVE_EMPTY_APP_HTML = "NativeEmptyApp.html";
    public static final String RESOURCES_CHECKSUM_PREF_KEY = "wlResourcesChecksum";
    public static final String SKIN_LOADER_HTML = "skinLoader.html";
    public static final String SKIN_NAME_PREF_KEY = "wlSkinName";
    public static final String WL_DEFAULT_SERVER_URL = "WLDefaultServerURL";
    private static boolean isForegound = false;
    private static WLConfig wlConfig;
    private boolean fatalErrorOccurred;
    private WLOptionsMenu optionsMenu;

    public WLDroidGap()
    {
        optionsMenu = null;
        fatalErrorOccurred = false;
    }

    public static WLConfig getWLConfig()
    {
        return wlConfig;
    }

    private boolean isClearCacheNextLoad()
    {
        return getPreferences(0).getBoolean("com.worklight.clearCacheNextLoad", false);
    }

    public static boolean isForeGround()
    {
        return isForegound;
    }

    private void removeSessionCookies(WebView webview)
    {
        CookieSyncManager.createInstance(webview.getContext());
        CookieManager.getInstance().removeSessionCookie();
    }

    private void setClearCacheNextLoad(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        editor.putBoolean("com.worklight.clearCacheNextLoad", flag);
        editor.commit();
    }

    private static void setForeGround(boolean flag)
    {
        isForegound = flag;
    }

    private void testResourcesChecksum()
    {
        if (!getWLConfig().getTestWebResourcesChecksumFlag().equals("true"))
        {
            WLUtils.debug("no need to check web resource integrity");
            return;
        }
        WLUtils.debug("start web resource integrity test");
        if (!WLUtils.checksumTestOnResources(getLocalStorageWebRoot(), this))
        {
            WLUtils.showDialog(this, "Error", "The application encountered an internal error. Please uninstall the application and then re-install it.", "Exit", new android.content.DialogInterface.OnClickListener() {

                final WLDroidGap this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.dismiss();
                    System.exit(0);
                }

            
            {
                this$0 = WLDroidGap.this;
                super();
            }
            });
            fatalErrorOccurred = true;
            return;
        } else
        {
            WLUtils.debug("web resource integrity test: Success");
            return;
        }
    }

    protected void bindBrowser(CordovaWebView cordovawebview)
    {
        bindBrowser(cordovawebview, true);
    }

    protected void bindBrowser(CordovaWebView cordovawebview, boolean flag)
    {
        cordovawebview.pluginManager.addService("Logger", "com.worklight.androidgap.plugin.Logger");
        cordovawebview.pluginManager.addService("Utils", "com.worklight.androidgap.plugin.Utils");
        cordovawebview.pluginManager.addService("NativePage", "com.worklight.androidgap.plugin.NativePage");
        cordovawebview.pluginManager.addService("NativeBusyIndicator", "com.worklight.androidgap.plugin.BusyIndicator");
        cordovawebview.pluginManager.addService("SecurityPlugin", "com.worklight.androidgap.plugin.SecurityPlugin");
        cordovawebview.pluginManager.addService("NetworkDetector", "com.worklight.androidgap.plugin.NetworkDetector");
        cordovawebview.pluginManager.addService("DeviceAuth", "com.worklight.androidgap.plugin.DeviceAuthPlugin");
        cordovawebview.pluginManager.addService("NetworkStatus", "com.worklight.androidgap.plugin.WLNetworkManager");
        runOnUiThread(new Runnable() {

            final WLDroidGap this$0;

            public void run()
            {
            }

            
            {
                this$0 = WLDroidGap.this;
                super();
            }
        });
        if (flag)
        {
            removeSessionCookies(cordovawebview);
        }
    }

    public String getAppWebUrl(String s)
    {
        String s1 = getWLConfig().getMainFilePath();
        if ((new File((new StringBuilder(String.valueOf(getLocalStorageWebRoot()))).append("/").append(s).append("/").append("NativeEmptyApp.html").toString())).exists())
        {
            s1 = "NativeEmptyApp.html";
        }
        return (new StringBuilder(String.valueOf(getWebUrl()))).append("/").append(s).append("/").append(s1).toString();
    }

    protected String getIntentDataInJSONFormat(Intent intent)
    {
        Object obj;
        Object obj1;
        obj1 = "";
        obj = obj1;
        if (intent == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (intent.getExtras() == null) goto _L2; else goto _L3
_L3:
        obj1 = intent.getExtras().keySet();
        obj = new HashMap();
        obj1 = ((Set) (obj1)).iterator();
_L7:
        if (((Iterator) (obj1)).hasNext()) goto _L5; else goto _L4
_L4:
        obj = (new JSONObject(((Map) (obj)))).toString();
_L2:
        return ((String) (obj));
_L5:
        String s = (String)((Iterator) (obj1)).next();
        ((Map) (obj)).put(s, intent.getExtras().get(s));
        if (true) goto _L7; else goto _L6
_L6:
    }

    public String getLocalStorageRoot()
    {
        return getApplicationContext().getFilesDir().getAbsolutePath();
    }

    public String getLocalStorageWebRoot()
    {
        return (new StringBuilder(String.valueOf(getLocalStorageRoot()))).append("/www").toString();
    }

    public String getWebMainFilePath()
    {
        String s = WLUtils.readWLPref(this, "wlSkinName");
        if (s != null)
        {
            return getAppWebUrl(s);
        } else
        {
            return (new StringBuilder(String.valueOf(getWebUrl()))).append("/").append("skinLoader.html").toString();
        }
    }

    public String getWebUrl()
    {
        return (new StringBuilder("file://")).append(getLocalStorageWebRoot()).toString();
    }

    public void init()
    {
        super.init();
    }

    public void loadUrl(String s)
    {
        loadUrl(s, true);
    }

    public void loadUrl(String s, boolean flag)
    {
        if (!fatalErrorOccurred)
        {
            if (isClearCacheNextLoad())
            {
                appView.clearCache(true);
                setClearCacheNextLoad(false);
            }
            super.loadUrl(s);
            bindBrowser(appView, flag);
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == NativePage.NATIVE_ACTIVITY_REQ_CODE)
        {
            if (j == -1)
            {
                WLUtils.debug("NativePage returned OK result code");
            } else
            {
                WLUtils.error((new StringBuilder("NativePage returned result code ")).append(j).toString());
            }
            sendJavascript((new StringBuilder("WL.NativePage.onNativePageClose(")).append(getIntentDataInJSONFormat(intent)).append(")").toString());
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        init();
        wlConfig = new WLConfig(getApplication());
        (new PrepackagedAssetsManager()).copyPrepackagedAssetsToLocalCopyIfNeeded();
        WLUtils.writeWLPref(this, "WLDefaultServerURL", getWLConfig().getDefaultRootUrl());
        WLUtils.writeWLPref(this, "exitOnSkinLoader", "false");
        WLUtils.writeWLPref(this, "enableSettings", getWLConfig().getSettingsFlag().toString());
        appView.setBackgroundColor(0xff000000);
        setForeGround(true);
        WLDeviceAuthManager.getInstance().setProvisioningDelegate(new ProvisioningDelegateImpl());
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return onPrepareOptionsMenu(menu);
    }

    public void onDestroy()
    {
        super.onDestroy();
        System.runFinalizersOnExit(true);
        System.exit(0);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag = super.onKeyDown(i, keyevent);
        if (i == 82)
        {
            flag = false;
        }
        return flag;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem = optionsMenu.getItemById(menuitem.getItemId());
        if (menuitem != null)
        {
            sendJavascript(menuitem.getCallback());
            return true;
        } else
        {
            return false;
        }
    }

    public void onPause()
    {
        try
        {
            super.onPause();
            setForeGround(false);
            return;
        }
        catch (Exception exception)
        {
            WLUtils.debug(exception.getMessage());
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (optionsMenu.isInit() && optionsMenu.hasChanged())
        {
            menu.clear();
            if (optionsMenu.isVisible())
            {
                Iterator iterator = optionsMenu.getItems().iterator();
                do
                {
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            optionsMenu.unsetChanged();
                            return true;
                        }
                        WLMenuItem wlmenuitem = (WLMenuItem)iterator.next();
                        MenuItem menuitem = menu.add(0, wlmenuitem.getId(), 0, wlmenuitem.getTitle());
                        boolean flag;
                        if (wlmenuitem.isEnabled() && optionsMenu.isEnabled())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        menuitem.setEnabled(flag);
                    } while (wlmenuitem.getImagePath() == null);
                    menuitem.setIcon(wlmenuitem.getImage(this));
                } while (true);
            }
        }
        return true;
    }

    public void onResume()
    {
        super.onResume();
        setForeGround(true);
    }

    public void setClearCacheNextLoad()
    {
        setClearCacheNextLoad(true);
    }



}
