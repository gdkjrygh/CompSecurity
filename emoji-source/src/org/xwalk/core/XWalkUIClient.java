// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core:
//            ReflectionHelper, XWalkView, XWalkJavascriptResultHandler, XWalkJavascriptResult

public class XWalkUIClient
{
    public static final class InitiateBy extends Enum
    {

        private static final InitiateBy $VALUES[];
        public static final InitiateBy BY_JAVASCRIPT;
        public static final InitiateBy BY_USER_GESTURE;

        public static InitiateBy valueOf(String s)
        {
            return (InitiateBy)Enum.valueOf(org/xwalk/core/XWalkUIClient$InitiateBy, s);
        }

        public static InitiateBy[] values()
        {
            return (InitiateBy[])$VALUES.clone();
        }

        static 
        {
            BY_USER_GESTURE = new InitiateBy("BY_USER_GESTURE", 0);
            BY_JAVASCRIPT = new InitiateBy("BY_JAVASCRIPT", 1);
            $VALUES = (new InitiateBy[] {
                BY_USER_GESTURE, BY_JAVASCRIPT
            });
        }

        private InitiateBy(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class JavascriptMessageType extends Enum
    {

        private static final JavascriptMessageType $VALUES[];
        public static final JavascriptMessageType JAVASCRIPT_ALERT;
        public static final JavascriptMessageType JAVASCRIPT_BEFOREUNLOAD;
        public static final JavascriptMessageType JAVASCRIPT_CONFIRM;
        public static final JavascriptMessageType JAVASCRIPT_PROMPT;

        public static JavascriptMessageType valueOf(String s)
        {
            return (JavascriptMessageType)Enum.valueOf(org/xwalk/core/XWalkUIClient$JavascriptMessageType, s);
        }

        public static JavascriptMessageType[] values()
        {
            return (JavascriptMessageType[])$VALUES.clone();
        }

        static 
        {
            JAVASCRIPT_ALERT = new JavascriptMessageType("JAVASCRIPT_ALERT", 0);
            JAVASCRIPT_CONFIRM = new JavascriptMessageType("JAVASCRIPT_CONFIRM", 1);
            JAVASCRIPT_PROMPT = new JavascriptMessageType("JAVASCRIPT_PROMPT", 2);
            JAVASCRIPT_BEFOREUNLOAD = new JavascriptMessageType("JAVASCRIPT_BEFOREUNLOAD", 3);
            $VALUES = (new JavascriptMessageType[] {
                JAVASCRIPT_ALERT, JAVASCRIPT_CONFIRM, JAVASCRIPT_PROMPT, JAVASCRIPT_BEFOREUNLOAD
            });
        }

        private JavascriptMessageType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LoadStatus extends Enum
    {

        private static final LoadStatus $VALUES[];
        public static final LoadStatus CANCELLED;
        public static final LoadStatus FAILED;
        public static final LoadStatus FINISHED;

        public static LoadStatus valueOf(String s)
        {
            return (LoadStatus)Enum.valueOf(org/xwalk/core/XWalkUIClient$LoadStatus, s);
        }

        public static LoadStatus[] values()
        {
            return (LoadStatus[])$VALUES.clone();
        }

        static 
        {
            FINISHED = new LoadStatus("FINISHED", 0);
            FAILED = new LoadStatus("FAILED", 1);
            CANCELLED = new LoadStatus("CANCELLED", 2);
            $VALUES = (new LoadStatus[] {
                FINISHED, FAILED, CANCELLED
            });
        }

        private LoadStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String BRIDGE_CLASS = "org.xwalk.core.internal.XWalkUIClientBridge";
    private Object bridge;
    private Class enumInitiateByClass;
    private Method enumInitiateByClassValueOfMethod;
    private Class enumJavascriptMessageTypeClass;
    private Method enumJavascriptMessageTypeClassValueOfMethod;
    private Class enumLoadStatusClass;
    private Method enumLoadStatusClassValueOfMethod;
    private Method onCreateWindowRequestedXWalkViewInternalInitiateByInternalValueCallbackMethod;
    private Method onFullscreenToggledXWalkViewInternalbooleanMethod;
    private Method onIconAvailableXWalkViewInternalStringMessageMethod;
    private Method onJavascriptCloseWindowXWalkViewInternalMethod;
    private Method onJavascriptModalDialogXWalkViewInternalJavascriptMessageTypeInternalStringStringStringXWalkJavascriptResultInternalMethod;
    private Method onPageLoadStartedXWalkViewInternalStringMethod;
    private Method onPageLoadStoppedXWalkViewInternalStringLoadStatusInternalMethod;
    private Method onReceivedIconXWalkViewInternalStringBitmapMethod;
    private Method onReceivedTitleXWalkViewInternalStringMethod;
    private Method onRequestFocusXWalkViewInternalMethod;
    private Method onScaleChangedXWalkViewInternalfloatfloatMethod;
    private Method onUnhandledKeyEventXWalkViewInternalKeyEventMethod;
    private Method openFileChooserXWalkViewInternalValueCallbackStringStringMethod;
    private Method shouldOverrideKeyEventXWalkViewInternalKeyEventMethod;

    public XWalkUIClient(XWalkView xwalkview)
    {
        bridge = ReflectionHelper.createInstance("XWalkUIClientInternalXWalkViewInternalConstructor", new Object[] {
            xwalkview.getBridge(), this
        });
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (XWalkView xwalkview)
        {
            ReflectionHelper.handleException(xwalkview);
        }
    }

    private Object ConvertInitiateBy(InitiateBy initiateby)
    {
        return ReflectionHelper.invokeMethod(enumInitiateByClassValueOfMethod, null, new Object[] {
            initiateby.toString()
        });
    }

    private Object ConvertJavascriptMessageType(JavascriptMessageType javascriptmessagetype)
    {
        return ReflectionHelper.invokeMethod(enumJavascriptMessageTypeClassValueOfMethod, null, new Object[] {
            javascriptmessagetype.toString()
        });
    }

    private Object ConvertLoadStatus(LoadStatus loadstatus)
    {
        return ReflectionHelper.invokeMethod(enumLoadStatusClassValueOfMethod, null, new Object[] {
            loadstatus.toString()
        });
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = bridge.getClass();
        enumJavascriptMessageTypeClass = class1.getClassLoader().loadClass("org.xwalk.core.internal.XWalkUIClientInternal$JavascriptMessageTypeInternal");
        enumJavascriptMessageTypeClassValueOfMethod = enumJavascriptMessageTypeClass.getMethod("valueOf", new Class[] {
            java/lang/String
        });
        enumInitiateByClass = class1.getClassLoader().loadClass("org.xwalk.core.internal.XWalkUIClientInternal$InitiateByInternal");
        enumInitiateByClassValueOfMethod = enumInitiateByClass.getMethod("valueOf", new Class[] {
            java/lang/String
        });
        enumLoadStatusClass = class1.getClassLoader().loadClass("org.xwalk.core.internal.XWalkUIClientInternal$LoadStatusInternal");
        enumLoadStatusClassValueOfMethod = enumLoadStatusClass.getMethod("valueOf", new Class[] {
            java/lang/String
        });
        onCreateWindowRequestedXWalkViewInternalInitiateByInternalValueCallbackMethod = ReflectionHelper.loadMethod(class1, "onCreateWindowRequestedSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", enumInitiateByClass, android/webkit/ValueCallback
        });
        onIconAvailableXWalkViewInternalStringMessageMethod = ReflectionHelper.loadMethod(class1, "onIconAvailableSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/String, android/os/Message
        });
        onReceivedIconXWalkViewInternalStringBitmapMethod = ReflectionHelper.loadMethod(class1, "onReceivedIconSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/String, android/graphics/Bitmap
        });
        onRequestFocusXWalkViewInternalMethod = ReflectionHelper.loadMethod(class1, "onRequestFocusSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge"
        });
        onJavascriptCloseWindowXWalkViewInternalMethod = ReflectionHelper.loadMethod(class1, "onJavascriptCloseWindowSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge"
        });
        onJavascriptModalDialogXWalkViewInternalJavascriptMessageTypeInternalStringStringStringXWalkJavascriptResultInternalMethod = ReflectionHelper.loadMethod(class1, "onJavascriptModalDialogSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", enumJavascriptMessageTypeClass, java/lang/String, java/lang/String, java/lang/String, "org.xwalk.core.internal.XWalkJavascriptResultHandlerBridge"
        });
        onFullscreenToggledXWalkViewInternalbooleanMethod = ReflectionHelper.loadMethod(class1, "onFullscreenToggledSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", Boolean.TYPE
        });
        openFileChooserXWalkViewInternalValueCallbackStringStringMethod = ReflectionHelper.loadMethod(class1, "openFileChooserSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", android/webkit/ValueCallback, java/lang/String, java/lang/String
        });
        onScaleChangedXWalkViewInternalfloatfloatMethod = ReflectionHelper.loadMethod(class1, "onScaleChangedSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", Float.TYPE, Float.TYPE
        });
        shouldOverrideKeyEventXWalkViewInternalKeyEventMethod = ReflectionHelper.loadMethod(class1, "shouldOverrideKeyEventSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", android/view/KeyEvent
        });
        onUnhandledKeyEventXWalkViewInternalKeyEventMethod = ReflectionHelper.loadMethod(class1, "onUnhandledKeyEventSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", android/view/KeyEvent
        });
        onReceivedTitleXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "onReceivedTitleSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/String
        });
        onPageLoadStartedXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "onPageLoadStartedSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/String
        });
        onPageLoadStoppedXWalkViewInternalStringLoadStatusInternalMethod = ReflectionHelper.loadMethod(class1, "onPageLoadStoppedSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/String, enumLoadStatusClass
        });
    }

    Object getBridge()
    {
        return bridge;
    }

    public boolean onCreateWindowRequested(XWalkView xwalkview, InitiateBy initiateby, ValueCallback valuecallback)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(onCreateWindowRequestedXWalkViewInternalInitiateByInternalValueCallbackMethod, bridge, new Object[] {
            xwalkview.getBridge(), ConvertInitiateBy(initiateby), valuecallback
        })).booleanValue();
    }

    public void onFullscreenToggled(XWalkView xwalkview, boolean flag)
    {
        ReflectionHelper.invokeMethod(onFullscreenToggledXWalkViewInternalbooleanMethod, bridge, new Object[] {
            xwalkview.getBridge(), Boolean.valueOf(flag)
        });
    }

    public void onIconAvailable(XWalkView xwalkview, String s, Message message)
    {
        ReflectionHelper.invokeMethod(onIconAvailableXWalkViewInternalStringMessageMethod, bridge, new Object[] {
            xwalkview.getBridge(), s, message
        });
    }

    public void onJavascriptCloseWindow(XWalkView xwalkview)
    {
        ReflectionHelper.invokeMethod(onJavascriptCloseWindowXWalkViewInternalMethod, bridge, new Object[] {
            xwalkview.getBridge()
        });
    }

    public boolean onJavascriptModalDialog(XWalkView xwalkview, JavascriptMessageType javascriptmessagetype, String s, String s1, String s2, XWalkJavascriptResult xwalkjavascriptresult)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(onJavascriptModalDialogXWalkViewInternalJavascriptMessageTypeInternalStringStringStringXWalkJavascriptResultInternalMethod, bridge, new Object[] {
            xwalkview.getBridge(), ConvertJavascriptMessageType(javascriptmessagetype), s, s1, s2, ((XWalkJavascriptResultHandler)xwalkjavascriptresult).getBridge()
        })).booleanValue();
    }

    public void onPageLoadStarted(XWalkView xwalkview, String s)
    {
        ReflectionHelper.invokeMethod(onPageLoadStartedXWalkViewInternalStringMethod, bridge, new Object[] {
            xwalkview.getBridge(), s
        });
    }

    public void onPageLoadStopped(XWalkView xwalkview, String s, LoadStatus loadstatus)
    {
        ReflectionHelper.invokeMethod(onPageLoadStoppedXWalkViewInternalStringLoadStatusInternalMethod, bridge, new Object[] {
            xwalkview.getBridge(), s, ConvertLoadStatus(loadstatus)
        });
    }

    public void onReceivedIcon(XWalkView xwalkview, String s, Bitmap bitmap)
    {
        ReflectionHelper.invokeMethod(onReceivedIconXWalkViewInternalStringBitmapMethod, bridge, new Object[] {
            xwalkview.getBridge(), s, bitmap
        });
    }

    public void onReceivedTitle(XWalkView xwalkview, String s)
    {
        ReflectionHelper.invokeMethod(onReceivedTitleXWalkViewInternalStringMethod, bridge, new Object[] {
            xwalkview.getBridge(), s
        });
    }

    public void onRequestFocus(XWalkView xwalkview)
    {
        ReflectionHelper.invokeMethod(onRequestFocusXWalkViewInternalMethod, bridge, new Object[] {
            xwalkview.getBridge()
        });
    }

    public void onScaleChanged(XWalkView xwalkview, float f, float f1)
    {
        ReflectionHelper.invokeMethod(onScaleChangedXWalkViewInternalfloatfloatMethod, bridge, new Object[] {
            xwalkview.getBridge(), Float.valueOf(f), Float.valueOf(f1)
        });
    }

    public void onUnhandledKeyEvent(XWalkView xwalkview, KeyEvent keyevent)
    {
        ReflectionHelper.invokeMethod(onUnhandledKeyEventXWalkViewInternalKeyEventMethod, bridge, new Object[] {
            xwalkview.getBridge(), keyevent
        });
    }

    public void openFileChooser(XWalkView xwalkview, ValueCallback valuecallback, String s, String s1)
    {
        ReflectionHelper.invokeMethod(openFileChooserXWalkViewInternalValueCallbackStringStringMethod, bridge, new Object[] {
            xwalkview.getBridge(), valuecallback, s, s1
        });
    }

    public boolean shouldOverrideKeyEvent(XWalkView xwalkview, KeyEvent keyevent)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(shouldOverrideKeyEventXWalkViewInternalKeyEventMethod, bridge, new Object[] {
            xwalkview.getBridge(), keyevent
        })).booleanValue();
    }

    static 
    {
        ReflectionHelper.registerConstructor("XWalkUIClientInternalXWalkViewInternalConstructor", "org.xwalk.core.internal.XWalkUIClientBridge", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/Object
        });
    }
}
