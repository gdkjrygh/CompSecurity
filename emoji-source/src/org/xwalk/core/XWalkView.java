// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core:
//            ReflectionHelper, XWalkNavigationHistory, XWalkResourceClient, XWalkUIClient

public class XWalkView extends FrameLayout
{

    private static final String BRIDGE_CLASS = "org.xwalk.core.internal.XWalkViewBridge";
    public static final int RELOAD_IGNORE_CACHE = 1;
    public static final int RELOAD_NORMAL = 0;
    private Method addJavascriptInterfaceObjectStringMethod;
    private Object bridge;
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

    public XWalkView(Context context, Activity activity)
    {
        super(context, null);
        bridge = ReflectionHelper.createInstance("XWalkViewInternalContextActivityConstructor", new Object[] {
            context, activity, this
        });
        try
        {
            reflectionInit();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ReflectionHelper.handleException(context);
        }
        if (bridge == null)
        {
            return;
        } else
        {
            addView((FrameLayout)bridge, new android.widget.FrameLayout.LayoutParams(-1, -1));
            return;
        }
    }

    public XWalkView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        bridge = ReflectionHelper.createInstance("XWalkViewInternalContextAttributeSetConstructor", new Object[] {
            context, attributeset, this
        });
        try
        {
            reflectionInit();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ReflectionHelper.handleException(context);
        }
        if (bridge == null)
        {
            return;
        } else
        {
            addView((FrameLayout)bridge, new android.widget.FrameLayout.LayoutParams(-1, -1));
            return;
        }
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = bridge.getClass();
        loadStringStringMethod = ReflectionHelper.loadMethod(class1, "loadSuper", new Object[] {
            java/lang/String, java/lang/String
        });
        loadAppFromManifestStringStringMethod = ReflectionHelper.loadMethod(class1, "loadAppFromManifestSuper", new Object[] {
            java/lang/String, java/lang/String
        });
        reloadintMethod = ReflectionHelper.loadMethod(class1, "reloadSuper", new Object[] {
            Integer.TYPE
        });
        stopLoadingMethod = ReflectionHelper.loadMethod(class1, "stopLoadingSuper", new Object[0]);
        getUrlMethod = ReflectionHelper.loadMethod(class1, "getUrlSuper", new Object[0]);
        getTitleMethod = ReflectionHelper.loadMethod(class1, "getTitleSuper", new Object[0]);
        getOriginalUrlMethod = ReflectionHelper.loadMethod(class1, "getOriginalUrlSuper", new Object[0]);
        getNavigationHistoryMethod = ReflectionHelper.loadMethod(class1, "getNavigationHistorySuper", new Object[0]);
        addJavascriptInterfaceObjectStringMethod = ReflectionHelper.loadMethod(class1, "addJavascriptInterfaceSuper", new Object[] {
            java/lang/Object, java/lang/String
        });
        evaluateJavascriptStringValueCallbackMethod = ReflectionHelper.loadMethod(class1, "evaluateJavascriptSuper", new Object[] {
            java/lang/String, android/webkit/ValueCallback
        });
        clearCachebooleanMethod = ReflectionHelper.loadMethod(class1, "clearCacheSuper", new Object[] {
            Boolean.TYPE
        });
        hasEnteredFullscreenMethod = ReflectionHelper.loadMethod(class1, "hasEnteredFullscreenSuper", new Object[0]);
        leaveFullscreenMethod = ReflectionHelper.loadMethod(class1, "leaveFullscreenSuper", new Object[0]);
        pauseTimersMethod = ReflectionHelper.loadMethod(class1, "pauseTimersSuper", new Object[0]);
        resumeTimersMethod = ReflectionHelper.loadMethod(class1, "resumeTimersSuper", new Object[0]);
        onHideMethod = ReflectionHelper.loadMethod(class1, "onHideSuper", new Object[0]);
        onShowMethod = ReflectionHelper.loadMethod(class1, "onShowSuper", new Object[0]);
        onDestroyMethod = ReflectionHelper.loadMethod(class1, "onDestroySuper", new Object[0]);
        onActivityResultintintIntentMethod = ReflectionHelper.loadMethod(class1, "onActivityResultSuper", new Object[] {
            Integer.TYPE, Integer.TYPE, android/content/Intent
        });
        onNewIntentIntentMethod = ReflectionHelper.loadMethod(class1, "onNewIntentSuper", new Object[] {
            android/content/Intent
        });
        saveStateBundleMethod = ReflectionHelper.loadMethod(class1, "saveStateSuper", new Object[] {
            android/os/Bundle
        });
        restoreStateBundleMethod = ReflectionHelper.loadMethod(class1, "restoreStateSuper", new Object[] {
            android/os/Bundle
        });
        getAPIVersionMethod = ReflectionHelper.loadMethod(class1, "getAPIVersionSuper", new Object[0]);
        getXWalkVersionMethod = ReflectionHelper.loadMethod(class1, "getXWalkVersionSuper", new Object[0]);
        setUIClientXWalkUIClientInternalMethod = ReflectionHelper.loadMethod(class1, "setUIClientSuper", new Object[] {
            "org.xwalk.core.internal.XWalkUIClientBridge"
        });
        setResourceClientXWalkResourceClientInternalMethod = ReflectionHelper.loadMethod(class1, "setResourceClientSuper", new Object[] {
            "org.xwalk.core.internal.XWalkResourceClientBridge"
        });
        setNetworkAvailablebooleanMethod = ReflectionHelper.loadMethod(class1, "setNetworkAvailableSuper", new Object[] {
            Boolean.TYPE
        });
        getRemoteDebuggingUrlMethod = ReflectionHelper.loadMethod(class1, "getRemoteDebuggingUrlSuper", new Object[0]);
    }

    public void addJavascriptInterface(Object obj, String s)
    {
        ReflectionHelper.invokeMethod(addJavascriptInterfaceObjectStringMethod, bridge, new Object[] {
            obj, s
        });
    }

    public void clearCache(boolean flag)
    {
        ReflectionHelper.invokeMethod(clearCachebooleanMethod, bridge, new Object[] {
            Boolean.valueOf(flag)
        });
    }

    public void evaluateJavascript(String s, ValueCallback valuecallback)
    {
        ReflectionHelper.invokeMethod(evaluateJavascriptStringValueCallbackMethod, bridge, new Object[] {
            s, valuecallback
        });
    }

    public String getAPIVersion()
    {
        return (String)ReflectionHelper.invokeMethod(getAPIVersionMethod, bridge, new Object[0]);
    }

    Object getBridge()
    {
        return bridge;
    }

    public XWalkNavigationHistory getNavigationHistory()
    {
        return (XWalkNavigationHistory)ReflectionHelper.getBridgeOrWrapper(ReflectionHelper.invokeMethod(getNavigationHistoryMethod, bridge, new Object[0]));
    }

    public String getOriginalUrl()
    {
        return (String)ReflectionHelper.invokeMethod(getOriginalUrlMethod, bridge, new Object[0]);
    }

    public Uri getRemoteDebuggingUrl()
    {
        return (Uri)ReflectionHelper.invokeMethod(getRemoteDebuggingUrlMethod, bridge, new Object[0]);
    }

    public String getTitle()
    {
        return (String)ReflectionHelper.invokeMethod(getTitleMethod, bridge, new Object[0]);
    }

    public String getUrl()
    {
        return (String)ReflectionHelper.invokeMethod(getUrlMethod, bridge, new Object[0]);
    }

    public String getXWalkVersion()
    {
        return (String)ReflectionHelper.invokeMethod(getXWalkVersionMethod, bridge, new Object[0]);
    }

    public boolean hasEnteredFullscreen()
    {
        return ((Boolean)ReflectionHelper.invokeMethod(hasEnteredFullscreenMethod, bridge, new Object[0])).booleanValue();
    }

    public void leaveFullscreen()
    {
        ReflectionHelper.invokeMethod(leaveFullscreenMethod, bridge, new Object[0]);
    }

    public void load(String s, String s1)
    {
        ReflectionHelper.invokeMethod(loadStringStringMethod, bridge, new Object[] {
            s, s1
        });
    }

    public void loadAppFromManifest(String s, String s1)
    {
        ReflectionHelper.invokeMethod(loadAppFromManifestStringStringMethod, bridge, new Object[] {
            s, s1
        });
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        ReflectionHelper.invokeMethod(onActivityResultintintIntentMethod, bridge, new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), intent
        });
    }

    public void onDestroy()
    {
        ReflectionHelper.invokeMethod(onDestroyMethod, bridge, new Object[0]);
    }

    public void onHide()
    {
        ReflectionHelper.invokeMethod(onHideMethod, bridge, new Object[0]);
    }

    public boolean onNewIntent(Intent intent)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(onNewIntentIntentMethod, bridge, new Object[] {
            intent
        })).booleanValue();
    }

    public void onShow()
    {
        ReflectionHelper.invokeMethod(onShowMethod, bridge, new Object[0]);
    }

    public void pauseTimers()
    {
        ReflectionHelper.invokeMethod(pauseTimersMethod, bridge, new Object[0]);
    }

    public void reload(int i)
    {
        ReflectionHelper.invokeMethod(reloadintMethod, bridge, new Object[] {
            Integer.valueOf(i)
        });
    }

    public boolean restoreState(Bundle bundle)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(restoreStateBundleMethod, bridge, new Object[] {
            bundle
        })).booleanValue();
    }

    public void resumeTimers()
    {
        ReflectionHelper.invokeMethod(resumeTimersMethod, bridge, new Object[0]);
    }

    public boolean saveState(Bundle bundle)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(saveStateBundleMethod, bridge, new Object[] {
            bundle
        })).booleanValue();
    }

    public void setNetworkAvailable(boolean flag)
    {
        ReflectionHelper.invokeMethod(setNetworkAvailablebooleanMethod, bridge, new Object[] {
            Boolean.valueOf(flag)
        });
    }

    public void setResourceClient(XWalkResourceClient xwalkresourceclient)
    {
        ReflectionHelper.invokeMethod(setResourceClientXWalkResourceClientInternalMethod, bridge, new Object[] {
            xwalkresourceclient.getBridge()
        });
    }

    public void setUIClient(XWalkUIClient xwalkuiclient)
    {
        ReflectionHelper.invokeMethod(setUIClientXWalkUIClientInternalMethod, bridge, new Object[] {
            xwalkuiclient.getBridge()
        });
    }

    public void stopLoading()
    {
        ReflectionHelper.invokeMethod(stopLoadingMethod, bridge, new Object[0]);
    }

    static 
    {
        ReflectionHelper.registerConstructor("XWalkViewInternalContextAttributeSetConstructor", "org.xwalk.core.internal.XWalkViewBridge", new Object[] {
            android/content/Context, android/util/AttributeSet, java/lang/Object
        });
        ReflectionHelper.registerConstructor("XWalkViewInternalContextActivityConstructor", "org.xwalk.core.internal.XWalkViewBridge", new Object[] {
            android/content/Context, android/app/Activity, java/lang/Object
        });
    }
}
