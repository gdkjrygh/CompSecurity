// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            WrapperHelper, StringUtils, SingletonWebView, JavaScriptInterface, 
//            WebChromeWrapper, TrustDefenderMobileCore

class JSExecutor extends WrapperHelper
{

    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;
    private static final String i = StringUtils.a(com/threatmetrix/TrustDefenderMobile/JSExecutor);
    private static final TreeMap m;
    private WebView a;
    private boolean b;
    private JavaScriptInterface c;
    private boolean j;
    private WebSettings k;
    private final boolean l;

    public JSExecutor(Context context, JavaScriptInterface javascriptinterface, boolean flag)
    {
label0:
        {
            super();
            a = null;
            b = false;
            c = null;
            j = false;
            j = b();
            String s1 = i;
            StringBuilder stringbuilder1 = (new StringBuilder()).append("JSExecutor() Build: ").append(android.os.Build.VERSION.RELEASE);
            String s;
            if (j)
            {
                s = " busted js interface ";
            } else
            {
                s = " normal js interface ";
            }
            stringbuilder1 = stringbuilder1.append(s);
            if (a())
            {
                s = " has async interface ";
            } else
            {
                s = " has no async interface ";
            }
            Log.d(s1, stringbuilder1.append(s).toString());
            c = javascriptinterface;
            l = flag;
            if (flag)
            {
                flag = SingletonWebView.a();
                b = false;
                a = SingletonWebView.a(context);
                if (a != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (flag && !b)
        {
            Log.w(i, "WebView re-used from previous instance. Using a short-lived TrustDefenderMobile object is not recommended. Better profiling performance will be achieved by re-using a long-lived TrustDefenderMobile instance");
        }
        javascriptinterface = i;
        StringBuilder stringbuilder = (new StringBuilder()).append("Webview ");
        if (b)
        {
            context = "init'd";
        } else
        {
            context = "un-init'd";
        }
        Log.d(javascriptinterface, stringbuilder.append(context).toString());
        if (c == null)
        {
            c = new JavaScriptInterface(null);
        }
        context = new WebViewClient();
        k = a.getSettings();
        k.setJavaScriptEnabled(true);
        a(k, f, new Object[] {
            android.webkit.WebSettings.PluginState.ON
        });
        a.setVisibility(4);
        if (!j)
        {
            a(a, g, new Object[] {
                "androidJSInterface"
            });
        }
        a.setWebViewClient(context);
        if (a())
        {
            if (c.a == null)
            {
                Log.e(i, "alternate JS interface but no global latch");
            }
            Log.d(i, "JSExecutor() alternate JS interface detected");
            return;
        }
        if (!j)
        {
            a(a, h, new Object[] {
                c, "androidJSInterface"
            });
            return;
        }
        if (c.a == null)
        {
            Log.e(i, "broken JS interface but no global latch");
        }
        Log.d(i, "JSExecutor() Broken JS interface detected, using workaround");
        a.setWebChromeClient(new WebChromeWrapper(c));
    }

    public static boolean a()
    {
        return d != null;
    }

    public static boolean b()
    {
        boolean flag;
        try
        {
            flag = android.os.Build.VERSION.RELEASE.startsWith("2.3");
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

    public static String c()
    {
        Log.d(i, "Generating a browser string");
        String s;
        String s1;
        String s2;
        String s3;
        if (m.containsKey(Integer.valueOf(android.os.Build.VERSION.SDK_INT)))
        {
            s = (String)m.get(Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        } else
        {
            s = (new StringBuilder()).append((String)m.lastEntry().getValue()).append("+").toString();
        }
        s2 = Locale.getDefault().getLanguage();
        s3 = Locale.getDefault().getCountry();
        s1 = s2;
        if (!s3.isEmpty())
        {
            s1 = (new StringBuilder()).append(s2).append("-").append(s3).toString();
        }
        return (new StringBuilder()).append("Mozilla/5.0 (Linux; U; Android ").append(android.os.Build.VERSION.RELEASE).append("; ").append(s1.toLowerCase(Locale.US)).append("; ").append(Build.MODEL).append(" Build/").append(Build.DISPLAY).append(") AppleWebKit/").append(s).append(" (KHTML, like Gecko) Version/4.0 Mobile Safari/").append(s).append(" ").append(TrustDefenderMobileCore.a).toString();
    }

    public String a(Context context)
    {
        Object obj = (String)a(null, e, new Object[] {
            context
        });
        if (obj == null || ((String) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        return ((String) (obj));
_L2:
        context = ((Context) (obj));
        if (l)
        {
            context = ((Context) (obj));
            if (k != null)
            {
                context = k.getUserAgentString();
            }
        }
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = context;
        if (!context.isEmpty()) goto _L1; else goto _L3
_L3:
        return c();
    }

    public String a(String s)
    {
        if (b) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (Thread.currentThread().isInterrupted())
        {
            return "";
        }
        CountDownLatch countdownlatch;
        boolean flag;
        if (!j && !a())
        {
            countdownlatch = new CountDownLatch(1);
            c.a(countdownlatch);
        } else
        {
            countdownlatch = null;
        }
        if (a())
        {
            s = (new StringBuilder()).append("javascript:(function(){try{return ").append(s).append(" + \"\";}catch(js_eval_err){return '';}})();").toString();
        } else
        if (!j)
        {
            s = (new StringBuilder()).append("javascript:window.androidJSInterface.getString((function(){try{return ").append(s).append(" + \"\";}catch(js_eval_err){return '';}})());").toString();
        } else
        {
            s = (new StringBuilder()).append("javascript:alert((function(){try{return ").append(s).append(" + \"\";}catch(js_eval_err){return '';}})());").toString();
        }
        Log.d(i, (new StringBuilder()).append("getJSResult() attempting to execute: ").append(s).toString());
        c.b = null;
        if (!a())
        {
            break; /* Loop/switch isn't completed */
        }
        d.invoke(a, new Object[] {
            s, c
        });
        flag = false;
_L4:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (c.a != null)
        {
            Log.d(i, (new StringBuilder()).append("getJSResult countdown for latch: ").append(c.a.hashCode()).append(" with count: ").append(c.a.getCount()).toString());
            c.a.countDown();
            return null;
        }
        if (true) goto _L1; else goto _L3
        s;
        Log.e(i, "getJSResult() invoke failed: ", s);
        flag = true;
          goto _L4
        s;
        Log.e(i, "getJSResult() invoke failed: ", s);
        flag = true;
          goto _L4
        s;
        Log.e(i, "getJSResult() invoke failed: ", s);
        flag = true;
          goto _L4
        s;
        Log.e(i, "getJSResult() invoke failed: ", s);
        flag = true;
          goto _L4
_L3:
        a.loadUrl(s);
        flag = false;
          goto _L4
        s;
        Log.e(i, "getJSResult() invoke failed: ", s);
        flag = true;
          goto _L4
        if (j || a()) goto _L1; else goto _L5
_L5:
        if (countdownlatch != null)
        {
            Log.d(i, (new StringBuilder()).append("getJSResult waiting for latch: ").append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount()).toString());
            if (!countdownlatch.await(5L, TimeUnit.SECONDS))
            {
                Log.d(i, (new StringBuilder()).append("getJSResult timeout waiting for latch: ").append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount()).toString());
            }
        } else
        {
            Log.e(i, "latch == null");
        }
        if (c.b == null)
        {
            Log.d(i, "getJSResult() After latch: got null");
        } else
        {
            Log.d(i, (new StringBuilder()).append("getJSResult() After latch: got ").append(c.b).toString());
        }
        return c.b;
    }

    public boolean a(boolean flag)
    {
        return flag != l || !b;
    }

    public void d()
    {
        Log.d(i, (new StringBuilder()).append("init() - init'd = ").append(b).toString());
        if (!b)
        {
            if (a == null)
            {
                Log.d(i, "init() - No web view, nothing needs to be done");
                b = true;
            } else
            {
                Log.d(i, "init() loading bogus page");
                String s;
                CountDownLatch countdownlatch;
                if (!j && !a())
                {
                    countdownlatch = new CountDownLatch(1);
                    Log.d(i, (new StringBuilder()).append("Creating latch: ").append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount()).toString());
                    s = "<html><head></head><body onLoad='javascript:window.androidJSInterface.getString(1)'></body></html>";
                    c.a(countdownlatch);
                    c.b = null;
                } else
                {
                    s = "<html><head></head><body></body></html>";
                    countdownlatch = null;
                }
                if (!Thread.currentThread().isInterrupted())
                {
                    a.loadData(s, "text/html", null);
                    if (!j && countdownlatch != null && !a())
                    {
                        Log.d(i, (new StringBuilder()).append("waiting for latch: ").append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount()).toString());
                        if (!countdownlatch.await(5L, TimeUnit.SECONDS))
                        {
                            Log.e(i, "timed out waiting for javascript");
                            return;
                        }
                        b = true;
                        Log.d(i, (new StringBuilder()).append("in init() count = ").append(countdownlatch.getCount()).toString());
                        if (c.b == null)
                        {
                            Log.d(i, "init() After latch: got null");
                            return;
                        } else
                        {
                            Log.d(i, (new StringBuilder()).append("init() After latch: got ").append(c.b).toString());
                            return;
                        }
                    } else
                    {
                        b = true;
                        return;
                    }
                }
            }
        }
    }

    static 
    {
        d = a(android/webkit/WebView, "evaluateJavascript", new Class[] {
            java/lang/String, android/webkit/ValueCallback
        });
        if (d == null && android.os.Build.VERSION.SDK_INT >= 19)
        {
            Log.e(i, "Failed to find expected function: evaluateJavascript");
        }
        e = a(android/webkit/WebSettings, "getDefaultUserAgent", new Class[] {
            android/content/Context
        });
        if (e == null && android.os.Build.VERSION.SDK_INT >= 17)
        {
            Log.e(i, "Failed to find expected function: getDefaultUserAgent");
        }
        f = a(android/webkit/WebSettings, "setPluginState", new Class[] {
            android/webkit/WebSettings$PluginState
        });
        if (f == null && (android.os.Build.VERSION.SDK_INT >= 8 || android.os.Build.VERSION.SDK_INT <= 18))
        {
            Log.e(i, "Failed to find expected function: setPluginState");
        }
        g = a(android/webkit/WebView, "removeJavascriptInterface", new Class[] {
            java/lang/String
        });
        if (g == null && android.os.Build.VERSION.SDK_INT >= 11)
        {
            Log.e(i, "Failed to find expected function: removeJavascriptInterface");
        }
        h = a(android/webkit/WebView, "addJavascriptInterface", new Class[] {
            java/lang/Object, java/lang/String
        });
        if (h == null && android.os.Build.VERSION.SDK_INT >= 17)
        {
            Log.e(i, "Failed to find expected function: addJavascriptInterface");
        }
        m = new TreeMap();
        m.put(Integer.valueOf(9), "533.1");
        m.put(Integer.valueOf(10), "533.1");
        m.put(Integer.valueOf(11), "533.1");
        m.put(Integer.valueOf(12), "533.1");
        m.put(Integer.valueOf(13), "534.13");
        m.put(Integer.valueOf(14), "534.30");
        m.put(Integer.valueOf(15), "534.30");
        m.put(Integer.valueOf(16), "534.30");
        m.put(Integer.valueOf(17), "534.30");
        m.put(Integer.valueOf(18), "534.30");
    }
}
