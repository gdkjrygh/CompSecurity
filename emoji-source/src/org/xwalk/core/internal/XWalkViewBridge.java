// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal, ReflectionHelper, XWalkNavigationHistoryBridge, XWalkResourceClientBridge, 
//            XWalkUIClientBridge, XWalkNavigationHistoryInternal, XWalkResourceClientInternal, XWalkUIClientInternal

public class XWalkViewBridge extends XWalkViewInternal
{

    private static final String WRAPPER_CLASS = "org.xwalk.core.Object";
    private Method addJavascriptInterfaceObjectStringMethod;
    private Method clearCachebooleanMethod;
    private Method evaluateJavascriptStringValueCallbackMethod;
    private Method getAPIVersionMethod;
    private Method getNavigationHistoryMethod;
    private Method getOriginalUrlMethod;
    private Method getRemoteDebuggingUrlMethod;
    private Method getTitleMethod;
    private Method getUrlMethod;
    private Method getXWalkVersionMethod;
    private Method hasEnteredFullscreenMethod;
    private Method leaveFullscreenMethod;
    private Method loadAppFromManifestStringStringMethod;
    private Method loadStringStringMethod;
    private Method onActivityResultintintIntentMethod;
    private Method onDestroyMethod;
    private Method onHideMethod;
    private Method onNewIntentIntentMethod;
    private Method onShowMethod;
    private Method pauseTimersMethod;
    private Method reloadintMethod;
    private Method restoreStateBundleMethod;
    private Method resumeTimersMethod;
    private Method saveStateBundleMethod;
    private Method setNetworkAvailablebooleanMethod;
    private Method setResourceClientXWalkResourceClientInternalMethod;
    private Method setUIClientXWalkUIClientInternalMethod;
    private Method stopLoadingMethod;
    private Object wrapper;

    public XWalkViewBridge(Context context, Activity activity, Object obj)
    {
        super(context, activity);
        wrapper = obj;
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ReflectionHelper.handleException(context);
        }
    }

    public XWalkViewBridge(Context context, AttributeSet attributeset, Object obj)
    {
        super(context, attributeset);
        wrapper = obj;
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ReflectionHelper.handleException(context);
        }
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = wrapper.getClass();
        loadStringStringMethod = ReflectionHelper.loadMethod(class1, "load", new Object[] {
            java/lang/String, java/lang/String
        });
        loadAppFromManifestStringStringMethod = ReflectionHelper.loadMethod(class1, "loadAppFromManifest", new Object[] {
            java/lang/String, java/lang/String
        });
        reloadintMethod = ReflectionHelper.loadMethod(class1, "reload", new Object[] {
            Integer.TYPE
        });
        stopLoadingMethod = ReflectionHelper.loadMethod(class1, "stopLoading", new Object[0]);
        getUrlMethod = ReflectionHelper.loadMethod(class1, "getUrl", new Object[0]);
        getTitleMethod = ReflectionHelper.loadMethod(class1, "getTitle", new Object[0]);
        getOriginalUrlMethod = ReflectionHelper.loadMethod(class1, "getOriginalUrl", new Object[0]);
        getNavigationHistoryMethod = ReflectionHelper.loadMethod(class1, "getNavigationHistory", new Object[0]);
        addJavascriptInterfaceObjectStringMethod = ReflectionHelper.loadMethod(class1, "addJavascriptInterface", new Object[] {
            java/lang/Object, java/lang/String
        });
        evaluateJavascriptStringValueCallbackMethod = ReflectionHelper.loadMethod(class1, "evaluateJavascript", new Object[] {
            java/lang/String, android/webkit/ValueCallback
        });
        clearCachebooleanMethod = ReflectionHelper.loadMethod(class1, "clearCache", new Object[] {
            Boolean.TYPE
        });
        hasEnteredFullscreenMethod = ReflectionHelper.loadMethod(class1, "hasEnteredFullscreen", new Object[0]);
        leaveFullscreenMethod = ReflectionHelper.loadMethod(class1, "leaveFullscreen", new Object[0]);
        pauseTimersMethod = ReflectionHelper.loadMethod(class1, "pauseTimers", new Object[0]);
        resumeTimersMethod = ReflectionHelper.loadMethod(class1, "resumeTimers", new Object[0]);
        onHideMethod = ReflectionHelper.loadMethod(class1, "onHide", new Object[0]);
        onShowMethod = ReflectionHelper.loadMethod(class1, "onShow", new Object[0]);
        onDestroyMethod = ReflectionHelper.loadMethod(class1, "onDestroy", new Object[0]);
        onActivityResultintintIntentMethod = ReflectionHelper.loadMethod(class1, "onActivityResult", new Object[] {
            Integer.TYPE, Integer.TYPE, android/content/Intent
        });
        onNewIntentIntentMethod = ReflectionHelper.loadMethod(class1, "onNewIntent", new Object[] {
            android/content/Intent
        });
        saveStateBundleMethod = ReflectionHelper.loadMethod(class1, "saveState", new Object[] {
            android/os/Bundle
        });
        restoreStateBundleMethod = ReflectionHelper.loadMethod(class1, "restoreState", new Object[] {
            android/os/Bundle
        });
        getAPIVersionMethod = ReflectionHelper.loadMethod(class1, "getAPIVersion", new Object[0]);
        getXWalkVersionMethod = ReflectionHelper.loadMethod(class1, "getXWalkVersion", new Object[0]);
        setUIClientXWalkUIClientInternalMethod = ReflectionHelper.loadMethod(class1, "setUIClient", new Object[] {
            "org.xwalk.core.XWalkUIClient"
        });
        setResourceClientXWalkResourceClientInternalMethod = ReflectionHelper.loadMethod(class1, "setResourceClient", new Object[] {
            "org.xwalk.core.XWalkResourceClient"
        });
        setNetworkAvailablebooleanMethod = ReflectionHelper.loadMethod(class1, "setNetworkAvailable", new Object[] {
            Boolean.TYPE
        });
        getRemoteDebuggingUrlMethod = ReflectionHelper.loadMethod(class1, "getRemoteDebuggingUrl", new Object[0]);
    }

    public void addJavascriptInterface(Object obj, String s)
    {
        ReflectionHelper.invokeMethod(addJavascriptInterfaceObjectStringMethod, wrapper, new Object[] {
            obj, s
        });
    }

    public void addJavascriptInterfaceSuper(Object obj, String s)
    {
        super.addJavascriptInterface(obj, s);
    }

    public void clearCache(boolean flag)
    {
        ReflectionHelper.invokeMethod(clearCachebooleanMethod, wrapper, new Object[] {
            Boolean.valueOf(flag)
        });
    }

    public void clearCacheSuper(boolean flag)
    {
        super.clearCache(flag);
    }

    public void evaluateJavascript(String s, ValueCallback valuecallback)
    {
        ReflectionHelper.invokeMethod(evaluateJavascriptStringValueCallbackMethod, wrapper, new Object[] {
            s, valuecallback
        });
    }

    public void evaluateJavascriptSuper(String s, ValueCallback valuecallback)
    {
        super.evaluateJavascript(s, valuecallback);
    }

    public String getAPIVersion()
    {
        return (String)ReflectionHelper.invokeMethod(getAPIVersionMethod, wrapper, new Object[0]);
    }

    public String getAPIVersionSuper()
    {
        String s1 = super.getAPIVersion();
        String s = s1;
        if (s1 == null)
        {
            s = null;
        }
        return s;
    }

    public XWalkNavigationHistoryInternal getNavigationHistory()
    {
        return (XWalkNavigationHistoryBridge)ReflectionHelper.getBridgeOrWrapper(ReflectionHelper.invokeMethod(getNavigationHistoryMethod, wrapper, new Object[0]));
    }

    public XWalkNavigationHistoryBridge getNavigationHistorySuper()
    {
        XWalkNavigationHistoryInternal xwalknavigationhistoryinternal = super.getNavigationHistory();
        if (xwalknavigationhistoryinternal == null)
        {
            return null;
        }
        if (xwalknavigationhistoryinternal instanceof XWalkNavigationHistoryBridge)
        {
            return (XWalkNavigationHistoryBridge)xwalknavigationhistoryinternal;
        } else
        {
            return new XWalkNavigationHistoryBridge(xwalknavigationhistoryinternal);
        }
    }

    public String getOriginalUrl()
    {
        return (String)ReflectionHelper.invokeMethod(getOriginalUrlMethod, wrapper, new Object[0]);
    }

    public String getOriginalUrlSuper()
    {
        String s1 = super.getOriginalUrl();
        String s = s1;
        if (s1 == null)
        {
            s = null;
        }
        return s;
    }

    public Uri getRemoteDebuggingUrl()
    {
        return (Uri)ReflectionHelper.invokeMethod(getRemoteDebuggingUrlMethod, wrapper, new Object[0]);
    }

    public Uri getRemoteDebuggingUrlSuper()
    {
        Uri uri1 = super.getRemoteDebuggingUrl();
        Uri uri = uri1;
        if (uri1 == null)
        {
            uri = null;
        }
        return uri;
    }

    public String getTitle()
    {
        return (String)ReflectionHelper.invokeMethod(getTitleMethod, wrapper, new Object[0]);
    }

    public String getTitleSuper()
    {
        String s1 = super.getTitle();
        String s = s1;
        if (s1 == null)
        {
            s = null;
        }
        return s;
    }

    public String getUrl()
    {
        return (String)ReflectionHelper.invokeMethod(getUrlMethod, wrapper, new Object[0]);
    }

    public String getUrlSuper()
    {
        String s1 = super.getUrl();
        String s = s1;
        if (s1 == null)
        {
            s = null;
        }
        return s;
    }

    public Object getWrapper()
    {
        return wrapper;
    }

    public String getXWalkVersion()
    {
        return (String)ReflectionHelper.invokeMethod(getXWalkVersionMethod, wrapper, new Object[0]);
    }

    public String getXWalkVersionSuper()
    {
        String s1 = super.getXWalkVersion();
        String s = s1;
        if (s1 == null)
        {
            s = null;
        }
        return s;
    }

    public boolean hasEnteredFullscreen()
    {
        return ((Boolean)ReflectionHelper.invokeMethod(hasEnteredFullscreenMethod, wrapper, new Object[0])).booleanValue();
    }

    public boolean hasEnteredFullscreenSuper()
    {
        return super.hasEnteredFullscreen();
    }

    public void leaveFullscreen()
    {
        ReflectionHelper.invokeMethod(leaveFullscreenMethod, wrapper, new Object[0]);
    }

    public void leaveFullscreenSuper()
    {
        super.leaveFullscreen();
    }

    public void load(String s, String s1)
    {
        ReflectionHelper.invokeMethod(loadStringStringMethod, wrapper, new Object[] {
            s, s1
        });
    }

    public void loadAppFromManifest(String s, String s1)
    {
        ReflectionHelper.invokeMethod(loadAppFromManifestStringStringMethod, wrapper, new Object[] {
            s, s1
        });
    }

    public void loadAppFromManifestSuper(String s, String s1)
    {
        super.loadAppFromManifest(s, s1);
    }

    public void loadSuper(String s, String s1)
    {
        super.load(s, s1);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        ReflectionHelper.invokeMethod(onActivityResultintintIntentMethod, wrapper, new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), intent
        });
    }

    public void onActivityResultSuper(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
    }

    public void onDestroy()
    {
        ReflectionHelper.invokeMethod(onDestroyMethod, wrapper, new Object[0]);
    }

    public void onDestroySuper()
    {
        super.onDestroy();
    }

    public void onHide()
    {
        ReflectionHelper.invokeMethod(onHideMethod, wrapper, new Object[0]);
    }

    public void onHideSuper()
    {
        super.onHide();
    }

    public boolean onNewIntent(Intent intent)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(onNewIntentIntentMethod, wrapper, new Object[] {
            intent
        })).booleanValue();
    }

    public boolean onNewIntentSuper(Intent intent)
    {
        return super.onNewIntent(intent);
    }

    public void onShow()
    {
        ReflectionHelper.invokeMethod(onShowMethod, wrapper, new Object[0]);
    }

    public void onShowSuper()
    {
        super.onShow();
    }

    public void pauseTimers()
    {
        ReflectionHelper.invokeMethod(pauseTimersMethod, wrapper, new Object[0]);
    }

    public void pauseTimersSuper()
    {
        super.pauseTimers();
    }

    public void reload(int i)
    {
        ReflectionHelper.invokeMethod(reloadintMethod, wrapper, new Object[] {
            Integer.valueOf(i)
        });
    }

    public void reloadSuper(int i)
    {
        super.reload(i);
    }

    public boolean restoreState(Bundle bundle)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(restoreStateBundleMethod, wrapper, new Object[] {
            bundle
        })).booleanValue();
    }

    public boolean restoreStateSuper(Bundle bundle)
    {
        return super.restoreState(bundle);
    }

    public void resumeTimers()
    {
        ReflectionHelper.invokeMethod(resumeTimersMethod, wrapper, new Object[0]);
    }

    public void resumeTimersSuper()
    {
        super.resumeTimers();
    }

    public boolean saveState(Bundle bundle)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(saveStateBundleMethod, wrapper, new Object[] {
            bundle
        })).booleanValue();
    }

    public boolean saveStateSuper(Bundle bundle)
    {
        return super.saveState(bundle);
    }

    public void setNetworkAvailable(boolean flag)
    {
        ReflectionHelper.invokeMethod(setNetworkAvailablebooleanMethod, wrapper, new Object[] {
            Boolean.valueOf(flag)
        });
    }

    public void setNetworkAvailableSuper(boolean flag)
    {
        super.setNetworkAvailable(flag);
    }

    public void setResourceClient(XWalkResourceClientBridge xwalkresourceclientbridge)
    {
        ReflectionHelper.invokeMethod(setResourceClientXWalkResourceClientInternalMethod, wrapper, new Object[] {
            xwalkresourceclientbridge.getWrapper()
        });
    }

    public void setResourceClient(XWalkResourceClientInternal xwalkresourceclientinternal)
    {
        if (xwalkresourceclientinternal instanceof XWalkResourceClientBridge)
        {
            setResourceClient((XWalkResourceClientBridge)xwalkresourceclientinternal);
            return;
        } else
        {
            super.setResourceClient(xwalkresourceclientinternal);
            return;
        }
    }

    public void setResourceClientSuper(XWalkResourceClientBridge xwalkresourceclientbridge)
    {
        super.setResourceClient(xwalkresourceclientbridge);
    }

    public void setUIClient(XWalkUIClientBridge xwalkuiclientbridge)
    {
        ReflectionHelper.invokeMethod(setUIClientXWalkUIClientInternalMethod, wrapper, new Object[] {
            xwalkuiclientbridge.getWrapper()
        });
    }

    public void setUIClient(XWalkUIClientInternal xwalkuiclientinternal)
    {
        if (xwalkuiclientinternal instanceof XWalkUIClientBridge)
        {
            setUIClient((XWalkUIClientBridge)xwalkuiclientinternal);
            return;
        } else
        {
            super.setUIClient(xwalkuiclientinternal);
            return;
        }
    }

    public void setUIClientSuper(XWalkUIClientBridge xwalkuiclientbridge)
    {
        super.setUIClient(xwalkuiclientbridge);
    }

    public void stopLoading()
    {
        ReflectionHelper.invokeMethod(stopLoadingMethod, wrapper, new Object[0]);
    }

    public void stopLoadingSuper()
    {
        super.stopLoading();
    }
}
