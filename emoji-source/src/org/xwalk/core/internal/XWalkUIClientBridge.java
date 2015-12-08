// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkUIClientInternal, ReflectionHelper, XWalkViewBridge, XWalkJavascriptResultHandlerBridge, 
//            XWalkJavascriptResultHandlerInternal, XWalkViewInternal, XWalkJavascriptResultInternal

public class XWalkUIClientBridge extends XWalkUIClientInternal
{

    private static final String WRAPPER_CLASS = "org.xwalk.core.Object";
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
    private Object wrapper;

    public XWalkUIClientBridge(XWalkViewBridge xwalkviewbridge, Object obj)
    {
        super(xwalkviewbridge);
        wrapper = obj;
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (XWalkViewBridge xwalkviewbridge)
        {
            ReflectionHelper.handleException(xwalkviewbridge);
        }
    }

    private Object ConvertInitiateByInternal(XWalkUIClientInternal.InitiateByInternal initiatebyinternal)
    {
        return ReflectionHelper.invokeMethod(enumInitiateByClassValueOfMethod, null, new Object[] {
            initiatebyinternal.toString()
        });
    }

    private Object ConvertJavascriptMessageTypeInternal(XWalkUIClientInternal.JavascriptMessageTypeInternal javascriptmessagetypeinternal)
    {
        return ReflectionHelper.invokeMethod(enumJavascriptMessageTypeClassValueOfMethod, null, new Object[] {
            javascriptmessagetypeinternal.toString()
        });
    }

    private Object ConvertLoadStatusInternal(XWalkUIClientInternal.LoadStatusInternal loadstatusinternal)
    {
        return ReflectionHelper.invokeMethod(enumLoadStatusClassValueOfMethod, null, new Object[] {
            loadstatusinternal.toString()
        });
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = wrapper.getClass();
        enumJavascriptMessageTypeClass = class1.getClassLoader().loadClass("org.xwalk.core.XWalkUIClient$JavascriptMessageType");
        enumJavascriptMessageTypeClassValueOfMethod = enumJavascriptMessageTypeClass.getMethod("valueOf", new Class[] {
            java/lang/String
        });
        enumInitiateByClass = class1.getClassLoader().loadClass("org.xwalk.core.XWalkUIClient$InitiateBy");
        enumInitiateByClassValueOfMethod = enumInitiateByClass.getMethod("valueOf", new Class[] {
            java/lang/String
        });
        enumLoadStatusClass = class1.getClassLoader().loadClass("org.xwalk.core.XWalkUIClient$LoadStatus");
        enumLoadStatusClassValueOfMethod = enumLoadStatusClass.getMethod("valueOf", new Class[] {
            java/lang/String
        });
        onCreateWindowRequestedXWalkViewInternalInitiateByInternalValueCallbackMethod = ReflectionHelper.loadMethod(class1, "onCreateWindowRequested", new Object[] {
            "org.xwalk.core.XWalkView", enumInitiateByClass, android/webkit/ValueCallback
        });
        onIconAvailableXWalkViewInternalStringMessageMethod = ReflectionHelper.loadMethod(class1, "onIconAvailable", new Object[] {
            "org.xwalk.core.XWalkView", java/lang/String, android/os/Message
        });
        onReceivedIconXWalkViewInternalStringBitmapMethod = ReflectionHelper.loadMethod(class1, "onReceivedIcon", new Object[] {
            "org.xwalk.core.XWalkView", java/lang/String, android/graphics/Bitmap
        });
        onRequestFocusXWalkViewInternalMethod = ReflectionHelper.loadMethod(class1, "onRequestFocus", new Object[] {
            "org.xwalk.core.XWalkView"
        });
        onJavascriptCloseWindowXWalkViewInternalMethod = ReflectionHelper.loadMethod(class1, "onJavascriptCloseWindow", new Object[] {
            "org.xwalk.core.XWalkView"
        });
        onJavascriptModalDialogXWalkViewInternalJavascriptMessageTypeInternalStringStringStringXWalkJavascriptResultInternalMethod = ReflectionHelper.loadMethod(class1, "onJavascriptModalDialog", new Object[] {
            "org.xwalk.core.XWalkView", enumJavascriptMessageTypeClass, java/lang/String, java/lang/String, java/lang/String, "org.xwalk.core.XWalkJavascriptResult"
        });
        onFullscreenToggledXWalkViewInternalbooleanMethod = ReflectionHelper.loadMethod(class1, "onFullscreenToggled", new Object[] {
            "org.xwalk.core.XWalkView", Boolean.TYPE
        });
        openFileChooserXWalkViewInternalValueCallbackStringStringMethod = ReflectionHelper.loadMethod(class1, "openFileChooser", new Object[] {
            "org.xwalk.core.XWalkView", android/webkit/ValueCallback, java/lang/String, java/lang/String
        });
        onScaleChangedXWalkViewInternalfloatfloatMethod = ReflectionHelper.loadMethod(class1, "onScaleChanged", new Object[] {
            "org.xwalk.core.XWalkView", Float.TYPE, Float.TYPE
        });
        shouldOverrideKeyEventXWalkViewInternalKeyEventMethod = ReflectionHelper.loadMethod(class1, "shouldOverrideKeyEvent", new Object[] {
            "org.xwalk.core.XWalkView", android/view/KeyEvent
        });
        onUnhandledKeyEventXWalkViewInternalKeyEventMethod = ReflectionHelper.loadMethod(class1, "onUnhandledKeyEvent", new Object[] {
            "org.xwalk.core.XWalkView", android/view/KeyEvent
        });
        onReceivedTitleXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "onReceivedTitle", new Object[] {
            "org.xwalk.core.XWalkView", java/lang/String
        });
        onPageLoadStartedXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "onPageLoadStarted", new Object[] {
            "org.xwalk.core.XWalkView", java/lang/String
        });
        onPageLoadStoppedXWalkViewInternalStringLoadStatusInternalMethod = ReflectionHelper.loadMethod(class1, "onPageLoadStopped", new Object[] {
            "org.xwalk.core.XWalkView", java/lang/String, enumLoadStatusClass
        });
    }

    public Object getWrapper()
    {
        return wrapper;
    }

    public boolean onCreateWindowRequested(XWalkViewBridge xwalkviewbridge, XWalkUIClientInternal.InitiateByInternal initiatebyinternal, final ValueCallback callbackFinal)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(onCreateWindowRequestedXWalkViewInternalInitiateByInternalValueCallbackMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), ConvertInitiateByInternal(initiatebyinternal), new ValueCallback() {

                final XWalkUIClientBridge this$0;
                final ValueCallback val$callbackFinal;

                public void onReceiveValue(Object obj)
                {
                    callbackFinal.onReceiveValue((XWalkViewBridge)ReflectionHelper.getBridgeOrWrapper(obj));
                }

            
            {
                this$0 = XWalkUIClientBridge.this;
                callbackFinal = valuecallback;
                super();
            }
            }
        })).booleanValue();
    }

    public boolean onCreateWindowRequested(XWalkViewInternal xwalkviewinternal, XWalkUIClientInternal.InitiateByInternal initiatebyinternal, ValueCallback valuecallback)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            return onCreateWindowRequested((XWalkViewBridge)xwalkviewinternal, initiatebyinternal, valuecallback);
        } else
        {
            return super.onCreateWindowRequested(xwalkviewinternal, initiatebyinternal, valuecallback);
        }
    }

    public boolean onCreateWindowRequestedSuper(XWalkViewBridge xwalkviewbridge, XWalkUIClientInternal.InitiateByInternal initiatebyinternal, ValueCallback valuecallback)
    {
        return super.onCreateWindowRequested(xwalkviewbridge, initiatebyinternal, valuecallback);
    }

    public void onFullscreenToggled(XWalkViewBridge xwalkviewbridge, boolean flag)
    {
        ReflectionHelper.invokeMethod(onFullscreenToggledXWalkViewInternalbooleanMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), Boolean.valueOf(flag)
        });
    }

    public void onFullscreenToggled(XWalkViewInternal xwalkviewinternal, boolean flag)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onFullscreenToggled((XWalkViewBridge)xwalkviewinternal, flag);
            return;
        } else
        {
            super.onFullscreenToggled(xwalkviewinternal, flag);
            return;
        }
    }

    public void onFullscreenToggledSuper(XWalkViewBridge xwalkviewbridge, boolean flag)
    {
        super.onFullscreenToggled(xwalkviewbridge, flag);
    }

    public void onIconAvailable(XWalkViewBridge xwalkviewbridge, String s, Message message)
    {
        ReflectionHelper.invokeMethod(onIconAvailableXWalkViewInternalStringMessageMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), s, message
        });
    }

    public void onIconAvailable(XWalkViewInternal xwalkviewinternal, String s, Message message)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onIconAvailable((XWalkViewBridge)xwalkviewinternal, s, message);
            return;
        } else
        {
            super.onIconAvailable(xwalkviewinternal, s, message);
            return;
        }
    }

    public void onIconAvailableSuper(XWalkViewBridge xwalkviewbridge, String s, Message message)
    {
        super.onIconAvailable(xwalkviewbridge, s, message);
    }

    public void onJavascriptCloseWindow(XWalkViewBridge xwalkviewbridge)
    {
        ReflectionHelper.invokeMethod(onJavascriptCloseWindowXWalkViewInternalMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper()
        });
    }

    public void onJavascriptCloseWindow(XWalkViewInternal xwalkviewinternal)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onJavascriptCloseWindow((XWalkViewBridge)xwalkviewinternal);
            return;
        } else
        {
            super.onJavascriptCloseWindow(xwalkviewinternal);
            return;
        }
    }

    public void onJavascriptCloseWindowSuper(XWalkViewBridge xwalkviewbridge)
    {
        super.onJavascriptCloseWindow(xwalkviewbridge);
    }

    public boolean onJavascriptModalDialog(XWalkViewBridge xwalkviewbridge, XWalkUIClientInternal.JavascriptMessageTypeInternal javascriptmessagetypeinternal, String s, String s1, String s2, XWalkJavascriptResultHandlerBridge xwalkjavascriptresulthandlerbridge)
    {
        Method method = onJavascriptModalDialogXWalkViewInternalJavascriptMessageTypeInternalStringStringStringXWalkJavascriptResultInternalMethod;
        Object obj = wrapper;
        xwalkviewbridge = ((XWalkViewBridge) (xwalkviewbridge.getWrapper()));
        javascriptmessagetypeinternal = ((XWalkUIClientInternal.JavascriptMessageTypeInternal) (ConvertJavascriptMessageTypeInternal(javascriptmessagetypeinternal)));
        if (!(xwalkjavascriptresulthandlerbridge instanceof XWalkJavascriptResultHandlerBridge))
        {
            xwalkjavascriptresulthandlerbridge = new XWalkJavascriptResultHandlerBridge(xwalkjavascriptresulthandlerbridge);
        }
        return ((Boolean)ReflectionHelper.invokeMethod(method, obj, new Object[] {
            xwalkviewbridge, javascriptmessagetypeinternal, s, s1, s2, xwalkjavascriptresulthandlerbridge.getWrapper()
        })).booleanValue();
    }

    public boolean onJavascriptModalDialog(XWalkViewInternal xwalkviewinternal, XWalkUIClientInternal.JavascriptMessageTypeInternal javascriptmessagetypeinternal, String s, String s1, String s2, XWalkJavascriptResultInternal xwalkjavascriptresultinternal)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            XWalkViewBridge xwalkviewbridge = (XWalkViewBridge)xwalkviewinternal;
            if (xwalkjavascriptresultinternal instanceof XWalkJavascriptResultHandlerBridge)
            {
                xwalkviewinternal = (XWalkJavascriptResultHandlerBridge)xwalkjavascriptresultinternal;
            } else
            {
                xwalkviewinternal = new XWalkJavascriptResultHandlerBridge((XWalkJavascriptResultHandlerInternal)xwalkjavascriptresultinternal);
            }
            return onJavascriptModalDialog(xwalkviewbridge, javascriptmessagetypeinternal, s, s1, s2, ((XWalkJavascriptResultHandlerBridge) (xwalkviewinternal)));
        } else
        {
            return super.onJavascriptModalDialog(xwalkviewinternal, javascriptmessagetypeinternal, s, s1, s2, xwalkjavascriptresultinternal);
        }
    }

    public boolean onJavascriptModalDialogSuper(XWalkViewBridge xwalkviewbridge, XWalkUIClientInternal.JavascriptMessageTypeInternal javascriptmessagetypeinternal, String s, String s1, String s2, XWalkJavascriptResultHandlerBridge xwalkjavascriptresulthandlerbridge)
    {
        return super.onJavascriptModalDialog(xwalkviewbridge, javascriptmessagetypeinternal, s, s1, s2, xwalkjavascriptresulthandlerbridge);
    }

    public void onPageLoadStarted(XWalkViewBridge xwalkviewbridge, String s)
    {
        ReflectionHelper.invokeMethod(onPageLoadStartedXWalkViewInternalStringMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), s
        });
    }

    public void onPageLoadStarted(XWalkViewInternal xwalkviewinternal, String s)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onPageLoadStarted((XWalkViewBridge)xwalkviewinternal, s);
            return;
        } else
        {
            super.onPageLoadStarted(xwalkviewinternal, s);
            return;
        }
    }

    public void onPageLoadStartedSuper(XWalkViewBridge xwalkviewbridge, String s)
    {
        super.onPageLoadStarted(xwalkviewbridge, s);
    }

    public void onPageLoadStopped(XWalkViewBridge xwalkviewbridge, String s, XWalkUIClientInternal.LoadStatusInternal loadstatusinternal)
    {
        ReflectionHelper.invokeMethod(onPageLoadStoppedXWalkViewInternalStringLoadStatusInternalMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), s, ConvertLoadStatusInternal(loadstatusinternal)
        });
    }

    public void onPageLoadStopped(XWalkViewInternal xwalkviewinternal, String s, XWalkUIClientInternal.LoadStatusInternal loadstatusinternal)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onPageLoadStopped((XWalkViewBridge)xwalkviewinternal, s, loadstatusinternal);
            return;
        } else
        {
            super.onPageLoadStopped(xwalkviewinternal, s, loadstatusinternal);
            return;
        }
    }

    public void onPageLoadStoppedSuper(XWalkViewBridge xwalkviewbridge, String s, XWalkUIClientInternal.LoadStatusInternal loadstatusinternal)
    {
        super.onPageLoadStopped(xwalkviewbridge, s, loadstatusinternal);
    }

    public void onReceivedIcon(XWalkViewBridge xwalkviewbridge, String s, Bitmap bitmap)
    {
        ReflectionHelper.invokeMethod(onReceivedIconXWalkViewInternalStringBitmapMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), s, bitmap
        });
    }

    public void onReceivedIcon(XWalkViewInternal xwalkviewinternal, String s, Bitmap bitmap)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onReceivedIcon((XWalkViewBridge)xwalkviewinternal, s, bitmap);
            return;
        } else
        {
            super.onReceivedIcon(xwalkviewinternal, s, bitmap);
            return;
        }
    }

    public void onReceivedIconSuper(XWalkViewBridge xwalkviewbridge, String s, Bitmap bitmap)
    {
        super.onReceivedIcon(xwalkviewbridge, s, bitmap);
    }

    public void onReceivedTitle(XWalkViewBridge xwalkviewbridge, String s)
    {
        ReflectionHelper.invokeMethod(onReceivedTitleXWalkViewInternalStringMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), s
        });
    }

    public void onReceivedTitle(XWalkViewInternal xwalkviewinternal, String s)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onReceivedTitle((XWalkViewBridge)xwalkviewinternal, s);
            return;
        } else
        {
            super.onReceivedTitle(xwalkviewinternal, s);
            return;
        }
    }

    public void onReceivedTitleSuper(XWalkViewBridge xwalkviewbridge, String s)
    {
        super.onReceivedTitle(xwalkviewbridge, s);
    }

    public void onRequestFocus(XWalkViewBridge xwalkviewbridge)
    {
        ReflectionHelper.invokeMethod(onRequestFocusXWalkViewInternalMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper()
        });
    }

    public void onRequestFocus(XWalkViewInternal xwalkviewinternal)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onRequestFocus((XWalkViewBridge)xwalkviewinternal);
            return;
        } else
        {
            super.onRequestFocus(xwalkviewinternal);
            return;
        }
    }

    public void onRequestFocusSuper(XWalkViewBridge xwalkviewbridge)
    {
        super.onRequestFocus(xwalkviewbridge);
    }

    public void onScaleChanged(XWalkViewBridge xwalkviewbridge, float f, float f1)
    {
        ReflectionHelper.invokeMethod(onScaleChangedXWalkViewInternalfloatfloatMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), Float.valueOf(f), Float.valueOf(f1)
        });
    }

    public void onScaleChanged(XWalkViewInternal xwalkviewinternal, float f, float f1)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onScaleChanged((XWalkViewBridge)xwalkviewinternal, f, f1);
            return;
        } else
        {
            super.onScaleChanged(xwalkviewinternal, f, f1);
            return;
        }
    }

    public void onScaleChangedSuper(XWalkViewBridge xwalkviewbridge, float f, float f1)
    {
        super.onScaleChanged(xwalkviewbridge, f, f1);
    }

    public void onUnhandledKeyEvent(XWalkViewBridge xwalkviewbridge, KeyEvent keyevent)
    {
        ReflectionHelper.invokeMethod(onUnhandledKeyEventXWalkViewInternalKeyEventMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), keyevent
        });
    }

    public void onUnhandledKeyEvent(XWalkViewInternal xwalkviewinternal, KeyEvent keyevent)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onUnhandledKeyEvent((XWalkViewBridge)xwalkviewinternal, keyevent);
            return;
        } else
        {
            super.onUnhandledKeyEvent(xwalkviewinternal, keyevent);
            return;
        }
    }

    public void onUnhandledKeyEventSuper(XWalkViewBridge xwalkviewbridge, KeyEvent keyevent)
    {
        super.onUnhandledKeyEvent(xwalkviewbridge, keyevent);
    }

    public void openFileChooser(XWalkViewBridge xwalkviewbridge, ValueCallback valuecallback, String s, String s1)
    {
        ReflectionHelper.invokeMethod(openFileChooserXWalkViewInternalValueCallbackStringStringMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), valuecallback, s, s1
        });
    }

    public void openFileChooser(XWalkViewInternal xwalkviewinternal, ValueCallback valuecallback, String s, String s1)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            openFileChooser((XWalkViewBridge)xwalkviewinternal, valuecallback, s, s1);
            return;
        } else
        {
            super.openFileChooser(xwalkviewinternal, valuecallback, s, s1);
            return;
        }
    }

    public void openFileChooserSuper(XWalkViewBridge xwalkviewbridge, ValueCallback valuecallback, String s, String s1)
    {
        super.openFileChooser(xwalkviewbridge, valuecallback, s, s1);
    }

    public boolean shouldOverrideKeyEvent(XWalkViewBridge xwalkviewbridge, KeyEvent keyevent)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(shouldOverrideKeyEventXWalkViewInternalKeyEventMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), keyevent
        })).booleanValue();
    }

    public boolean shouldOverrideKeyEvent(XWalkViewInternal xwalkviewinternal, KeyEvent keyevent)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            return shouldOverrideKeyEvent((XWalkViewBridge)xwalkviewinternal, keyevent);
        } else
        {
            return super.shouldOverrideKeyEvent(xwalkviewinternal, keyevent);
        }
    }

    public boolean shouldOverrideKeyEventSuper(XWalkViewBridge xwalkviewbridge, KeyEvent keyevent)
    {
        return super.shouldOverrideKeyEvent(xwalkviewbridge, keyevent);
    }
}
