// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.webview.action.WebActionType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class fyl extends Fragment
{

    private ProgressBar Y;
    private TextView Z;
    private WebView a;
    private TextView aa;
    private AlertDialog ab;
    private WebView ac;
    private final Handler ad = new Handler();
    private Runnable ae;
    private Runnable af;
    private int ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private gjq ak;
    private View b;

    public fyl()
    {
        ag = 0;
    }

    static void a(fyl fyl1)
    {
        fyl1.a.reload();
    }

    static void a(fyl fyl1, int k)
    {
        fyl1.c(k);
    }

    static void a(fyl fyl1, String s, JsResult jsresult)
    {
        fyl1.ab = (new android.app.AlertDialog.Builder(fyl1.k())).setMessage(s).setPositiveButton(0x104000a, fyl1. new android.content.DialogInterface.OnClickListener(jsresult) {

            private JsResult a;
            private fyl b;

            public final void onClick(DialogInterface dialoginterface, int k)
            {
                a.confirm();
                fyl.j(b);
            }

            
            {
                b = fyl.this;
                a = jsresult;
                super();
            }
        }).setNegativeButton(0x1040000, fyl1. new android.content.DialogInterface.OnClickListener(jsresult) {

            private JsResult a;
            private fyl b;

            public final void onClick(DialogInterface dialoginterface, int k)
            {
                a.cancel();
                fyl.j(b);
            }

            
            {
                b = fyl.this;
                a = jsresult;
                super();
            }
        }).setOnCancelListener(fyl1. new android.content.DialogInterface.OnCancelListener(jsresult) {

            private JsResult a;
            private fyl b;

            public final void onCancel(DialogInterface dialoginterface)
            {
                a.cancel();
                fyl.j(b);
            }

            
            {
                b = fyl.this;
                a = jsresult;
                super();
            }
        }).show();
    }

    static boolean a(fyl fyl1, boolean flag)
    {
        fyl1.ai = flag;
        return flag;
    }

    static int b(fyl fyl1)
    {
        return fyl1.ag;
    }

    static boolean b(fyl fyl1, boolean flag)
    {
        fyl1.ah = flag;
        return flag;
    }

    private void c(int k)
    {
        byte byte0;
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = false;
        Logger.a("Changing state %d -> %d", new Object[] {
            Integer.valueOf(ag), Integer.valueOf(k)
        });
        ag = k;
        byte0 = flag;
        k;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 75
    //                   1 176
    //                   2 75
    //                   3 181;
           goto _L1 _L2 _L3 _L2 _L4
_L4:
        break MISSING_BLOCK_LABEL_181;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte0 = flag;
_L5:
        int l;
        if (a != null)
        {
            Object obj = a;
            if (byte0 != 0)
            {
                l = 0;
            } else
            {
                l = 8;
            }
            ((WebView) (obj)).setVisibility(l);
        }
        if (Z != null)
        {
            obj = Z;
            if (byte0 != 0)
            {
                l = 8;
            } else
            {
                l = 0;
            }
            ((TextView) (obj)).setVisibility(l);
        }
        if (aa != null)
        {
            obj = aa;
            if (byte0 != 0)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            ((TextView) (obj)).setVisibility(byte0);
        }
        if (b != null)
        {
            obj = b;
            if (k == 3)
            {
                k = ((flag1) ? 1 : 0);
            } else
            {
                k = 8;
            }
            ((View) (obj)).setVisibility(k);
        }
        return;
_L3:
        byte0 = 0;
          goto _L5
        byte0 = 0;
          goto _L5
    }

    static void c(fyl fyl1, boolean flag)
    {
        fyl1.d(flag);
    }

    static boolean c(fyl fyl1)
    {
        return fyl1.ah;
    }

    static gjq d(fyl fyl1)
    {
        return fyl1.ak;
    }

    private void d(boolean flag)
    {
        aj = flag;
        if (flag)
        {
            Y.setVisibility(0);
            ad.removeCallbacks(ae);
            ae = null;
        } else
        if (ae == null)
        {
            ae = new Runnable() {

                private fyl a;

                public final void run()
                {
                    fyl.f(a).setVisibility(4);
                    fyl.h(a).removeCallbacks(fyl.g(a));
                    fyl.i(a);
                }

            
            {
                a = fyl.this;
                super();
            }
            };
            ad.postDelayed(ae, 100L);
            return;
        }
    }

    static boolean e(fyl fyl1)
    {
        return fyl1.ai;
    }

    static ProgressBar f(fyl fyl1)
    {
        return fyl1.Y;
    }

    static Runnable g(fyl fyl1)
    {
        return fyl1.ae;
    }

    static Handler h(fyl fyl1)
    {
        return fyl1.ad;
    }

    static Runnable i(fyl fyl1)
    {
        fyl1.ae = null;
        return null;
    }

    static AlertDialog j(fyl fyl1)
    {
        fyl1.ab = null;
        return null;
    }

    public void B()
    {
        super.B();
        if (a != null)
        {
            a.setWebChromeClient(null);
            a.setWebViewClient(null);
            a = null;
        }
        if (af != null)
        {
            ad.removeCallbacks(af);
            af = null;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (ac == null)
        {
            bundle = "";
        } else
        {
            bundle = " (using retained webview)";
        }
        Logger.a("onCreateView()%s", new Object[] {
            bundle
        });
        bundle = k();
        layoutinflater = layoutinflater.inflate(0x7f03009c, viewgroup, false);
        b = layoutinflater.findViewById(0x7f1103ca);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private fyl a;

            public final void onClick(View view)
            {
                fyl.a(a);
            }

            
            {
                a = fyl.this;
                super();
            }
        });
        if (ac != null)
        {
            a = ac;
            ac = null;
        } else
        {
            a = new WebView(bundle);
            ((giq)dmz.a(giq)).a(k());
            if (gcl.i)
            {
                WebView.setWebContentsDebuggingEnabled(false);
            }
            viewgroup = a.getSettings();
            viewgroup.setJavaScriptEnabled(true);
            viewgroup.setDomStorageEnabled(true);
            a.setWebChromeClient(new WebChromeClient() {

                private fyl a;

                public final void onCloseWindow(WebView webview)
                {
                    a.k().finish();
                }

                public final boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
                {
                    fyl.a(a, s1, jsresult);
                    return true;
                }

                public final void onProgressChanged(WebView webview, int k)
                {
                    if (fyl.b(a) == 3 && !fyl.c(a) && k > 50)
                    {
                        fyl.a(a, 2);
                    }
                }

            
            {
                a = fyl.this;
                super();
            }
            });
            viewgroup = fyw.a(this);
            ak = new gjq(k(), viewgroup);
            viewgroup = new gjs(k()) {

                private fyl c;

                public final void a()
                {
                    c.k().finish();
                }

            
            {
                c = fyl.this;
                super(context);
            }
            };
            bundle = ak;
            WebActionType webactiontype = WebActionType.a;
            ((gjq) (bundle)).a.c.put(webactiontype, viewgroup);
            a.setWebViewClient(new WebViewClient() {

                private fyl a;

                public final void onLoadResource(WebView webview, String s)
                {
                    if (webview.getUrl() != null && s != null)
                    {
                        webview = Uri.parse(webview.getUrl());
                        Uri uri = Uri.parse(s);
                        if (!gjp.c(webview))
                        {
                            s = fyl.d(a);
                            if (!gjp.b(webview) || !gjp.a(uri).booleanValue())
                            {
                                Logger.b("Invalid domain and/or source for %s", new Object[] {
                                    uri
                                });
                                webview = gjq.b;
                            } else
                            {
                                boolean flag;
                                if (WebActionType.a(uri) != WebActionType.e)
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                if (!flag)
                                {
                                    Logger.b("Invalid action %s", new Object[] {
                                        uri
                                    });
                                    webview = gjq.b;
                                } else
                                {
                                    gjt gjt1 = ((gjq) (s)).a;
                                    WebActionType webactiontype1 = WebActionType.a(uri);
                                    if (webactiontype1 == WebActionType.e)
                                    {
                                        Assertion.a("Action not supported.", uri.toString());
                                        webview = gjr.a;
                                    } else
                                    {
                                        Context context = gjt1.a;
                                        s = (gjs)gjt1.c.get(webactiontype1);
                                        webview = s;
                                        if (s == null)
                                        {
                                            webview = gjr.a(context, webactiontype1, gjt1.b);
                                            gjt1.c.put(webactiontype1, webview);
                                        }
                                        s = new HashMap();
                                        String s1;
                                        for (Iterator iterator = uri.getQueryParameterNames().iterator(); iterator.hasNext(); s.put(s1, uri.getQueryParameter(s1)))
                                        {
                                            s1 = (String)iterator.next();
                                        }

                                        webview.b = s;
                                    }
                                }
                            }
                            webview.a();
                            return;
                        }
                    }
                }

                public final void onPageFinished(WebView webview, String s)
                {
                    Logger.a("Page finished loading: %s", new Object[] {
                        s
                    });
                    fyl.c(a, false);
                    a.a(s);
                }

                public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
                {
                    if (fyl.e(a))
                    {
                        webview = " (error)";
                    } else
                    {
                        webview = "";
                    }
                    Logger.a("Page started loading: %s%s", new Object[] {
                        s, webview
                    });
                    fyl.b(a, fyl.e(a));
                    fyl.a(a, false);
                    if (!fyl.c(a) && fyl.b(a) != 3)
                    {
                        fyl.a(a, 2);
                    }
                    fyl.c(a, true);
                }

                public final void onReceivedError(WebView webview, int k, String s, String s1)
                {
                    Logger.b("Error %d %s when loading: %s", new Object[] {
                        Integer.valueOf(k), s, s1
                    });
                    fyl.a(a, 3);
                    fyl.a(a, true);
                }

                public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
                {
                    Logger.b("SSL error: %s", new Object[] {
                        sslerror
                    });
                    fyl.a(a, 3);
                    fyl.a(a, true);
                    sslerrorhandler.cancel();
                }

                public final boolean shouldOverrideUrlLoading(WebView webview, String s)
                {
                    if (!a.a(Uri.parse(s)))
                    {
                        webview.loadUrl(s);
                    }
                    return true;
                }

            
            {
                a = fyl.this;
                super();
            }
            });
        }
        ((ViewGroup)layoutinflater.findViewById(0x7f1103c7)).addView(a, -1, -1);
        Z = (TextView)layoutinflater.findViewById(0x7f1103c8);
        aa = (TextView)layoutinflater.findViewById(0x7f1103c9);
        Y = (ProgressBar)layoutinflater.findViewById(0x7f110341);
        d(aj);
        c(ag);
        if (ag == 0 || ag == 1)
        {
            af = new Runnable() {

                private fyl a;

                public final void run()
                {
                    if (fyl.b(a) == 0)
                    {
                        fyl.a(a, 1);
                    }
                }

            
            {
                a = fyl.this;
                super();
            }
            };
            ad.postDelayed(af, 1000L);
            a();
        }
        return layoutinflater;
    }

    public abstract void a();

    public void a(String s)
    {
    }

    public boolean a(Uri uri)
    {
        return false;
    }

    public final void c(String s)
    {
        ad.removeCallbacks(af);
        if (ag == 0 || ag == 1)
        {
            c(2);
            if (a != null)
            {
                a.loadUrl(s);
            }
        }
    }

    public final void e()
    {
        Logger.a("onDestroyView()", new Object[0]);
        super.e();
        b = null;
        Z = null;
        aa = null;
        if (a != null)
        {
            if (t())
            {
                android.view.ViewParent viewparent = a.getParent();
                if (viewparent != null)
                {
                    ((ViewGroup)viewparent).removeView(a);
                    ac = a;
                }
            }
            a = null;
        }
        if (ab != null)
        {
            ab.cancel();
            ab = null;
        }
    }

    public WebView x_()
    {
        return a;
    }

    public boolean y_()
    {
        while (a == null || !a.canGoBack()) 
        {
            return false;
        }
        a.goBack();
        return true;
    }

    static 
    {
        gip.a("webview_debug_custom_spotify_host");
        gip.a("webview_debug_ignore_ssl_errors");
    }
}
