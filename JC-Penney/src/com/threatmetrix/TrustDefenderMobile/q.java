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
//            aq, y, r, ap, 
//            al

class q extends aq
{

    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;
    private static final String i = com/threatmetrix/TrustDefenderMobile/q.getName();
    private static final TreeMap m;
    private WebView a;
    private boolean b;
    private r c;
    private boolean j;
    private WebSettings k;
    private final boolean l;

    public q(Context context, r r1, boolean flag)
    {
label0:
        {
            super();
            a = null;
            b = false;
            c = null;
            j = false;
            j = b();
            String s = i;
            StringBuilder stringbuilder = (new StringBuilder("JSExecutor() Build: ")).append(android.os.Build.VERSION.RELEASE);
            if (j)
            {
                s = " busted js interface ";
            } else
            {
                s = " normal js interface ";
            }
            stringbuilder = stringbuilder.append(s);
            if (a())
            {
                s = " has async interface ";
            } else
            {
                s = " has no async interface ";
            }
            stringbuilder.append(s);
            c = r1;
            l = flag;
            if (flag)
            {
                flag = y.a();
                b = false;
                a = y.a(context);
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
        context = i;
        r1 = new StringBuilder("Webview ");
        if (b)
        {
            context = "init'd";
        } else
        {
            context = "un-init'd";
        }
        r1.append(context);
        if (c == null)
        {
            c = new r(null);
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
            context = i;
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
        context = i;
        a.setWebChromeClient(new ap(c));
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
        String s = i;
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
        return (new StringBuilder("Mozilla/5.0 (Linux; U; Android ")).append(android.os.Build.VERSION.RELEASE).append("; ").append(s1.toLowerCase(Locale.US)).append("; ").append(Build.MODEL).append(" Build/").append(Build.DISPLAY).append(") AppleWebKit/").append(s).append(" (KHTML, like Gecko) Version/4.0 Mobile Safari/").append(s).append(" ").append(al.a).toString();
    }

    public final String a(Context context)
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

    public final String a(String s)
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
        String s1;
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
            s = (new StringBuilder("javascript:(function(){try{return ")).append(s).append(" + \"\";}catch(js_eval_err){return '';}})();").toString();
        } else
        if (!j)
        {
            s = (new StringBuilder("javascript:window.androidJSInterface.getString((function(){try{return ")).append(s).append(" + \"\";}catch(js_eval_err){return '';}})());").toString();
        } else
        {
            s = (new StringBuilder("javascript:alert((function(){try{return ")).append(s).append(" + \"\";}catch(js_eval_err){return '';}})());").toString();
        }
        s1 = i;
        (new StringBuilder("getJSResult() attempting to execute: ")).append(s);
        c.b = null;
        if (!a())
        {
            break MISSING_BLOCK_LABEL_453;
        }
        d.invoke(a, new Object[] {
            s, c
        });
        flag = false;
_L3:
        if (flag && c.a != null)
        {
            s = i;
            (new StringBuilder("getJSResult countdown for latch: ")).append(c.a.hashCode()).append(" with count: ").append(c.a.getCount());
            c.a.countDown();
        }
_L4:
        if (!j && !a())
        {
            if (countdownlatch != null)
            {
                s = i;
                (new StringBuilder("getJSResult waiting for latch: ")).append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount());
                if (!countdownlatch.await(5L, TimeUnit.SECONDS))
                {
                    s = i;
                    (new StringBuilder("getJSResult timeout waiting for latch: ")).append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount());
                }
            } else
            {
                Log.e(i, "latch == null");
            }
            if (c.b == null)
            {
                s = i;
            } else
            {
                s = i;
                (new StringBuilder("getJSResult() After latch: got ")).append(c.b);
            }
            return c.b;
        }
          goto _L1
        s;
        Log.e(i, "getJSResult() invoke failed: ", s);
        flag = true;
          goto _L3
        s;
        Log.e(i, "getJSResult() invoke failed: ", s);
        flag = true;
          goto _L3
        s;
        Log.e(i, "getJSResult() invoke failed: ", s);
        flag = true;
          goto _L3
        a.loadUrl(s);
          goto _L4
    }

    public final boolean a(boolean flag)
    {
        return flag != l || !b;
    }

    public final void d()
    {
        String s = i;
        (new StringBuilder("init() - init'd = ")).append(b);
        if (!b)
        {
            if (a == null)
            {
                String s1 = i;
                b = true;
            } else
            {
                Object obj = i;
                String s4;
                if (!j && !a())
                {
                    obj = new CountDownLatch(1);
                    s4 = i;
                    (new StringBuilder("Creating latch: ")).append(obj.hashCode()).append(" with count: ").append(((CountDownLatch) (obj)).getCount());
                    s4 = "<html><head></head><body onLoad='javascript:window.androidJSInterface.getString(1)'></body></html>";
                    c.a(((CountDownLatch) (obj)));
                    c.b = null;
                } else
                {
                    s4 = "<html><head></head><body></body></html>";
                    obj = null;
                }
                if (!Thread.currentThread().isInterrupted())
                {
                    a.loadData(s4, "text/html", null);
                    if (!j && obj != null && !a())
                    {
                        s4 = i;
                        (new StringBuilder("waiting for latch: ")).append(obj.hashCode()).append(" with count: ").append(((CountDownLatch) (obj)).getCount());
                        if (!((CountDownLatch) (obj)).await(5L, TimeUnit.SECONDS))
                        {
                            Log.e(i, "timed out waiting for javascript");
                            return;
                        }
                        b = true;
                        s4 = i;
                        (new StringBuilder("in init() count = ")).append(((CountDownLatch) (obj)).getCount());
                        if (c.b == null)
                        {
                            String s2 = i;
                            return;
                        } else
                        {
                            String s3 = i;
                            (new StringBuilder("init() After latch: got ")).append(c.b);
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
        Object obj = a(android/webkit/WebView, "evaluateJavascript", new Class[] {
            java/lang/String, android/webkit/ValueCallback
        });
        d = ((Method) (obj));
        if (obj == null && android.os.Build.VERSION.SDK_INT >= 19)
        {
            Log.e(i, "Failed to find expected function: evaluateJavascript");
        }
        obj = a(android/webkit/WebSettings, "getDefaultUserAgent", new Class[] {
            android/content/Context
        });
        e = ((Method) (obj));
        if (obj == null && android.os.Build.VERSION.SDK_INT >= 17)
        {
            Log.e(i, "Failed to find expected function: getDefaultUserAgent");
        }
        obj = a(android/webkit/WebSettings, "setPluginState", new Class[] {
            android/webkit/WebSettings$PluginState
        });
        f = ((Method) (obj));
        if (obj == null && (android.os.Build.VERSION.SDK_INT >= 8 || android.os.Build.VERSION.SDK_INT <= 18))
        {
            Log.e(i, "Failed to find expected function: setPluginState");
        }
        obj = a(android/webkit/WebView, "removeJavascriptInterface", new Class[] {
            java/lang/String
        });
        g = ((Method) (obj));
        if (obj == null && android.os.Build.VERSION.SDK_INT >= 11)
        {
            Log.e(i, "Failed to find expected function: removeJavascriptInterface");
        }
        obj = a(android/webkit/WebView, "addJavascriptInterface", new Class[] {
            java/lang/Object, java/lang/String
        });
        h = ((Method) (obj));
        if (obj == null && android.os.Build.VERSION.SDK_INT >= 17)
        {
            Log.e(i, "Failed to find expected function: addJavascriptInterface");
        }
        obj = new TreeMap();
        m = ((TreeMap) (obj));
        ((TreeMap) (obj)).put(Integer.valueOf(9), "533.1");
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
