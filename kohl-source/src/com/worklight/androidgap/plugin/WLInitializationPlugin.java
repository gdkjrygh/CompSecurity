// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.view.Menu;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import com.worklight.androidgap.api.WL;
import com.worklight.common.WLConfig;
import java.util.Iterator;
import java.util.List;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLOptionsMenu, WLMenuItem

public class WLInitializationPlugin extends CordovaPlugin
{

    private static WLOptionsMenu optionsMenu = null;

    public WLInitializationPlugin()
    {
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        WLConfig.createInstance(webView.getContext());
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        }
        WLConfig.getInstance().setHybridActivityInForeground(true);
        WLConfig.getInstance().setInitComplete(false);
        cordovainterface = webView.getSettings();
        cordovainterface.setDefaultTextEncodingName("utf-8");
        cordovawebview = cordovainterface.getUserAgentString();
        if (cordovawebview != null && !cordovawebview.contains("Worklight"))
        {
            cordovainterface.setUserAgentString((new StringBuilder()).append(cordovawebview).append("/Worklight/").append(WLConfig.getInstance().getPlatformVersion()).toString());
        }
        CookieSyncManager.createInstance(webView.getContext());
        CookieManager.getInstance().removeSessionCookie();
        if (optionsMenu == null)
        {
            optionsMenu = new WLOptionsMenu();
            webView.addJavascriptInterface(optionsMenu, "NativeOptionsMenu");
        }
        if (WLConfig.getInstance().isClearCacheNextLoad())
        {
            webView.clearCache(true);
            WLConfig.getInstance().setClearCacheNextLoadPref(false);
        }
    }

    public Object onMessage(String s, Object obj)
    {
        if (!s.equals("onPrepareOptionsMenu")) goto _L2; else goto _L1
_L1:
        Menu menu = (Menu)obj;
        if (optionsMenu != null && optionsMenu.isVisible()) goto _L4; else goto _L3
_L3:
        menu.clear();
_L6:
        return null;
_L4:
        if (!optionsMenu.isInit() || !optionsMenu.hasChanged()) goto _L6; else goto _L5
_L5:
        menu.clear();
        Iterator iterator = optionsMenu.getItems().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
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
            if (wlmenuitem.getImagePath() != null)
            {
                menuitem.setIcon(wlmenuitem.getImage(cordova.getActivity()));
            }
        } while (true);
        optionsMenu.unsetChanged();
_L8:
        return super.onMessage(s, obj);
_L2:
        if (s.equals("onOptionsItemSelected"))
        {
            Object obj1 = (MenuItem)obj;
            obj1 = optionsMenu.getItemById(((MenuItem) (obj1)).getItemId());
            if (obj1 != null)
            {
                ((CordovaActivity)cordova.getActivity()).sendJavascript(((WLMenuItem) (obj1)).getCallback());
            }
        } else
        if ("spinner".equals(s) && "stop".equals(obj))
        {
            String s1 = WLConfig.getInstance().getMainFileFromDescriptor().toLowerCase();
            if (s1.startsWith("http://") || s1.startsWith("https://"))
            {
                WL.getInstance().hideSplashScreen();
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onPause(boolean flag)
    {
        super.onPause(flag);
        WLConfig.getInstance().setHybridActivityInForeground(false);
    }

    public void onResume(boolean flag)
    {
        super.onResume(flag);
        WLConfig.getInstance().setHybridActivityInForeground(true);
    }

}
