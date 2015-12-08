// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.net.http.SslError;
import android.webkit.ConsoleMessage;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.devicecollector.DataCollection;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.http.HttpException;

// Referenced classes of package com.devicecollector.collectors:
//            AbstractAsyncCollectorTask, CollectorEnum, SoftErrorCode, CollectorStatusListener

public final class WebCollectorTask extends AbstractAsyncCollectorTask
{

    private boolean h;
    private WebView i;

    public WebCollectorTask(Activity activity, CollectorStatusListener collectorstatuslistener, DataCollection datacollection, long l)
    {
        super(activity, collectorstatuslistener, datacollection, CollectorEnum.b, l);
    }

    static WebView a(WebCollectorTask webcollectortask)
    {
        return webcollectortask.i;
    }

    static WebView a(WebCollectorTask webcollectortask, WebView webview)
    {
        webcollectortask.i = webview;
        return webview;
    }

    private void a(WebView webview, int j, String s, String s1)
    {
        a("onReceivedError(code:%d, desc:%s, url:%s)", new Object[] {
            Integer.valueOf(j), s, s1
        });
        a(SoftErrorCode.d, ((Exception) (null)));
    }

    private void a(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        a("onReceivedSslError(%s)", new Object[] {
            sslerror
        });
        int j = sslerror.getPrimaryError();
        if (3 == j || 2 == j)
        {
            a("Ignoring trust chain validation error.", new Object[0]);
            sslerrorhandler.proceed();
            return;
        } else
        {
            a("Halting due to SSL error.", new Object[0]);
            a(SoftErrorCode.d, ((Exception) (new HttpException((new StringBuilder()).append("SSL ERROR:").append(sslerror.getPrimaryError()).toString()))));
            sslerrorhandler.cancel();
            return;
        }
    }

    private void a(WebView webview, String s)
    {
        a("onLoadResource(%s)", new Object[] {
            s
        });
        try
        {
            webview = new URL(s);
            if (webview.getPath().endsWith("logo.htm") || webview.getPath().endsWith("logo.php"))
            {
                h = true;
                b.a((new StringBuilder()).append("https://").append(webview.getHost()).toString());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            a("Unexpected URL problem [%s]", new Object[] {
                webview.getMessage()
            });
        }
    }

    static void a(WebCollectorTask webcollectortask, WebView webview, int j, String s, String s1)
    {
        webcollectortask.a(webview, j, s, s1);
    }

    static void a(WebCollectorTask webcollectortask, WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        webcollectortask.a(webview, sslerrorhandler, sslerror);
    }

    static void a(WebCollectorTask webcollectortask, WebView webview, String s)
    {
        webcollectortask.a(webview, s);
    }

    private boolean a(ConsoleMessage consolemessage)
    {
label0:
        {
            a("onConsoleMessage(%s)", new Object[] {
                consolemessage.message()
            });
            if (consolemessage.message().startsWith("\u25CF\uFF5E*"))
            {
                if (!consolemessage.message().substring("\u25CF\uFF5E*".length()).equals("<head></head><body></body>"))
                {
                    break label0;
                }
                a(SoftErrorCode.d, ((Exception) (new IllegalStateException("Error response received from Device Collector."))));
            }
            return true;
        }
        if (!h)
        {
            a(SoftErrorCode.d, ((Exception) (new IllegalStateException("Never loaded logo.htm."))));
            return true;
        } else
        {
            a(((SoftErrorCode) (null)), ((Exception) (null)));
            return true;
        }
    }

    static boolean a(WebCollectorTask webcollectortask, ConsoleMessage consolemessage)
    {
        return webcollectortask.a(consolemessage);
    }

    private void b(WebView webview, String s)
    {
        a("onPageFinished(%s)", new Object[] {
            s
        });
        CookieSyncManager.getInstance().sync();
        webview.loadUrl((new StringBuilder()).append("javascript:console.log(").append("'").append("\u25CF\uFF5E*").append("'").append("+").append("document.getElementsByTagName('html')[0].innerHTML").append(");").toString());
    }

    static void b(WebCollectorTask webcollectortask, WebView webview, String s)
    {
        webcollectortask.b(webview, s);
    }

    private boolean c(WebView webview, String s)
    {
        a("shouldOverrideUrlLoading(%s)", new Object[] {
            s
        });
        return false;
    }

    static boolean c(WebCollectorTask webcollectortask, WebView webview, String s)
    {
        return webcollectortask.c(webview, s);
    }

    protected void a()
    {
        String s = (new StringBuilder()).append(b.d()).append("?m=").append(b.a()).append("&s=").append(b.b()).toString();
        a("Calling URL: %s", new Object[] {
            s
        });
        a.runOnUiThread(new Runnable(s) {

            final String a;
            final WebCollectorTask b;

            public void run()
            {
                WebCollectorTask webcollectortask = b;
                WebCollectorTask.a(webcollectortask, new WebView(b.a.getApplicationContext()));
                WebSettings websettings = WebCollectorTask.a(webcollectortask).getSettings();
                websettings.setJavaScriptEnabled(true);
                websettings.setDomStorageEnabled(true);
                websettings.setPluginState(android.webkit.WebSettings.PluginState.ON);
                WebCollectorTask.a(webcollectortask).setWebViewClient(new WebViewClient(this) {

                    WebCollectorTask a;
                    final _cls1 b;

                    public void onLoadResource(WebView webview, String s)
                    {
                        WebCollectorTask.a(a, webview, s);
                    }

                    public void onPageFinished(WebView webview, String s)
                    {
                        WebCollectorTask.b(a, webview, s);
                    }

                    public void onReceivedError(WebView webview, int j, String s, String s1)
                    {
                        WebCollectorTask.a(a, webview, j, s, s1);
                    }

                    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
                    {
                        WebCollectorTask.a(a, webview, sslerrorhandler, sslerror);
                    }

                    public boolean shouldOverrideUrlLoading(WebView webview, String s)
                    {
                        return WebCollectorTask.c(a, webview, s);
                    }

            
            {
                b = _pcls1;
                super();
                a = b.b;
            }
                });
                WebCollectorTask.a(webcollectortask).setWebChromeClient(new WebChromeClient(this) {

                    final _cls1 a;

                    public boolean onConsoleMessage(ConsoleMessage consolemessage)
                    {
                        return WebCollectorTask.a(a.b, consolemessage);
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                WebCollectorTask.a(webcollectortask).loadUrl(a);
            }

            
            {
                b = WebCollectorTask.this;
                a = s;
                super();
            }
        });
        this;
        JVM INSTR monitorenter ;
        a("Waiting on Collector for %d ms", new Object[] {
            Long.valueOf(f())
        });
        wait(f());
        a("Wait finished", new Object[0]);
        if (c()) goto _L2; else goto _L1
_L1:
        e();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a("Current Host: %s", new Object[] {
            b.c()
        });
        a(((SoftErrorCode) (null)), ((Exception) (null)));
          goto _L3
        Object obj;
        obj;
        a(SoftErrorCode.d, ((Exception) (obj)));
          goto _L3
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
