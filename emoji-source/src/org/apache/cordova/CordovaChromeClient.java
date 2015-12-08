// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.widget.EditText;
import org.xwalk.core.XWalkJavascriptResult;
import org.xwalk.core.XWalkNavigationHistory;
import org.xwalk.core.XWalkUIClient;
import org.xwalk.core.XWalkView;

// Referenced classes of package org.apache.cordova:
//            CordovaInterface, CordovaWebView, CordovaBridge, PluginManager

public class CordovaChromeClient extends XWalkUIClient
{

    static final boolean $assertionsDisabled;
    public static final int FILECHOOSER_RESULTCODE = 5173;
    protected CordovaWebView appView;
    protected CordovaInterface cordova;
    private boolean doClearHistory;
    boolean isCurrentlyLoading;
    public ValueCallback mUploadMessage;

    public CordovaChromeClient(CordovaInterface cordovainterface)
    {
        super(null);
        doClearHistory = false;
        cordova = cordovainterface;
    }

    public CordovaChromeClient(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super(cordovawebview);
        doClearHistory = false;
        cordova = cordovainterface;
        appView = cordovawebview;
    }

    private boolean onJsAlert(XWalkView xwalkview, String s, String s1, final XWalkJavascriptResult result)
    {
        xwalkview = new android.app.AlertDialog.Builder(cordova.getActivity());
        xwalkview.setMessage(s1);
        xwalkview.setTitle("Alert");
        xwalkview.setCancelable(true);
        xwalkview.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final CordovaChromeClient this$0;
            final XWalkJavascriptResult val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                result.confirm();
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = xwalkjavascriptresult;
                super();
            }
        });
        xwalkview.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final CordovaChromeClient this$0;
            final XWalkJavascriptResult val$result;

            public void onCancel(DialogInterface dialoginterface)
            {
                result.cancel();
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = xwalkjavascriptresult;
                super();
            }
        });
        xwalkview.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

            final CordovaChromeClient this$0;
            final XWalkJavascriptResult val$result;

            public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
            {
                if (i == 4)
                {
                    result.confirm();
                    return false;
                } else
                {
                    return true;
                }
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = xwalkjavascriptresult;
                super();
            }
        });
        xwalkview.show();
        return true;
    }

    private boolean onJsConfirm(XWalkView xwalkview, String s, String s1, final XWalkJavascriptResult result)
    {
        xwalkview = new android.app.AlertDialog.Builder(cordova.getActivity());
        xwalkview.setMessage(s1);
        xwalkview.setTitle("Confirm");
        xwalkview.setCancelable(true);
        xwalkview.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final CordovaChromeClient this$0;
            final XWalkJavascriptResult val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                result.confirm();
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = xwalkjavascriptresult;
                super();
            }
        });
        xwalkview.setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

            final CordovaChromeClient this$0;
            final XWalkJavascriptResult val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                result.cancel();
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = xwalkjavascriptresult;
                super();
            }
        });
        xwalkview.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final CordovaChromeClient this$0;
            final XWalkJavascriptResult val$result;

            public void onCancel(DialogInterface dialoginterface)
            {
                result.cancel();
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = xwalkjavascriptresult;
                super();
            }
        });
        xwalkview.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

            final CordovaChromeClient this$0;
            final XWalkJavascriptResult val$result;

            public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
            {
                if (i == 4)
                {
                    result.cancel();
                    return false;
                } else
                {
                    return true;
                }
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = xwalkjavascriptresult;
                super();
            }
        });
        xwalkview.show();
        return true;
    }

    private boolean onJsPrompt(XWalkView xwalkview, final String input, String s, String s1, final XWalkJavascriptResult res)
    {
        xwalkview = appView.bridge.promptOnJsPrompt(input, s, s1);
        if (xwalkview != null)
        {
            res.confirmWithResult(xwalkview);
        } else
        {
            xwalkview = new android.app.AlertDialog.Builder(cordova.getActivity());
            xwalkview.setMessage(s);
            input = new EditText(cordova.getActivity());
            if (s1 != null)
            {
                input.setText(s1);
            }
            xwalkview.setView(input);
            xwalkview.setCancelable(false);
            xwalkview.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final CordovaChromeClient this$0;
                final EditText val$input;
                final XWalkJavascriptResult val$res;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = input.getText().toString();
                    res.confirmWithResult(dialoginterface);
                }

            
            {
                this$0 = CordovaChromeClient.this;
                input = edittext;
                res = xwalkjavascriptresult;
                super();
            }
            });
            xwalkview.setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                final CordovaChromeClient this$0;
                final XWalkJavascriptResult val$res;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    res.cancel();
                }

            
            {
                this$0 = CordovaChromeClient.this;
                res = xwalkjavascriptresult;
                super();
            }
            });
            xwalkview.show();
        }
        return true;
    }

    public ValueCallback getValueCallback()
    {
        return mUploadMessage;
    }

    public boolean onJavascriptModalDialog(XWalkView xwalkview, org.xwalk.core.XWalkUIClient.JavascriptMessageType javascriptmessagetype, String s, String s1, String s2, XWalkJavascriptResult xwalkjavascriptresult)
    {
        static class _cls11
        {

            static final int $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType[];

            static 
            {
                $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType = new int[org.xwalk.core.XWalkUIClient.JavascriptMessageType.values().length];
                try
                {
                    $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType[org.xwalk.core.XWalkUIClient.JavascriptMessageType.JAVASCRIPT_ALERT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType[org.xwalk.core.XWalkUIClient.JavascriptMessageType.JAVASCRIPT_CONFIRM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType[org.xwalk.core.XWalkUIClient.JavascriptMessageType.JAVASCRIPT_PROMPT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType[org.xwalk.core.XWalkUIClient.JavascriptMessageType.JAVASCRIPT_BEFOREUNLOAD.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls11..SwitchMap.org.xwalk.core.XWalkUIClient.JavascriptMessageType[javascriptmessagetype.ordinal()])
        {
        default:
            if (!$assertionsDisabled)
            {
                throw new AssertionError();
            } else
            {
                return false;
            }

        case 1: // '\001'
            return onJsAlert(xwalkview, s, s1, xwalkjavascriptresult);

        case 2: // '\002'
            return onJsConfirm(xwalkview, s, s1, xwalkjavascriptresult);

        case 3: // '\003'
            return onJsPrompt(xwalkview, s, s1, s2, xwalkjavascriptresult);

        case 4: // '\004'
            return onJsConfirm(xwalkview, s, s1, xwalkjavascriptresult);
        }
    }

    public void onPageLoadStarted(XWalkView xwalkview, String s)
    {
        isCurrentlyLoading = true;
        appView.bridge.reset(s);
        appView.postMessage("onPageStarted", s);
        if (appView.pluginManager != null)
        {
            appView.pluginManager.onReset();
        }
    }

    public void onPageLoadStopped(XWalkView xwalkview, String s, org.xwalk.core.XWalkUIClient.LoadStatus loadstatus)
    {
        if (isCurrentlyLoading)
        {
            isCurrentlyLoading = false;
            if (doClearHistory)
            {
                xwalkview.getNavigationHistory().clear();
                doClearHistory = false;
            }
            xwalkview = appView;
            xwalkview.loadUrlTimeout = ((CordovaWebView) (xwalkview)).loadUrlTimeout + 1;
            appView.postMessage("onPageFinished", s);
            if (appView.getVisibility() == 4)
            {
                (new Thread(new Runnable() {

                    final CordovaChromeClient this$0;

                    public void run()
                    {
                        try
                        {
                            Thread.sleep(2000L);
                            cordova.getActivity().runOnUiThread(new Runnable() {

                                final _cls10 this$1;

                                public void run()
                                {
                                    appView.postMessage("spinner", "stop");
                                }

            
            {
                this$1 = _cls10.this;
                super();
            }
                            });
                            return;
                        }
                        catch (InterruptedException interruptedexception)
                        {
                            return;
                        }
                    }

            
            {
                this$0 = CordovaChromeClient.this;
                super();
            }
                })).start();
            }
            if (s.equals("about:blank"))
            {
                appView.postMessage("exit", null);
                return;
            }
        }
    }

    public void openFileChooser(XWalkView xwalkview, ValueCallback valuecallback, String s, String s1)
    {
        valuecallback.onReceiveValue(null);
    }

    public void setWebView(CordovaWebView cordovawebview)
    {
        appView = cordovawebview;
    }

    static 
    {
        boolean flag;
        if (!org/apache/cordova/CordovaChromeClient.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
