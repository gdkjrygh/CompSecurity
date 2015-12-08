// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.f;
import android.support.v4.app.h;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.o;
import com.pandora.radio.util.NetworkUtil;
import java.io.File;
import p.cp.d;
import p.cw.c;

public class bg extends f
    implements android.content.DialogInterface.OnShowListener, android.view.View.OnTouchListener
{

    private WebView a;
    private boolean b;
    private android.content.DialogInterface.OnShowListener c;
    private android.content.DialogInterface.OnCancelListener d;
    private android.content.DialogInterface.OnDismissListener e;
    private Handler f;
    private Runnable g;

    public bg()
    {
        a = null;
        f = new Handler();
        g = new Runnable() {

            final bg a;

            public void run()
            {
                a.getView().findViewById(0x7f100300).setVisibility(0);
            }

            
            {
                a = bg.this;
                super();
            }
        };
    }

    static Runnable a(bg bg1)
    {
        return bg1.g;
    }

    static bg a(Uri uri, boolean flag, String s1, boolean flag1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_URL", uri);
        bundle.putBoolean("ARG_WHITE_THEME", flag);
        bundle.putBoolean("ARG_DISMISS_ON_OUTSIDE_WEBVIEW_TOUCH", flag1);
        if (!s.a(s1))
        {
            bundle.putString("intent_extra_key", s1);
        }
        uri = new bg();
        uri.setArguments(bundle);
        return uri;
    }

    public static bg a(FragmentActivity fragmentactivity, Uri uri)
    {
        return a(fragmentactivity, uri, false, ((String) (null)));
    }

    public static bg a(FragmentActivity fragmentactivity, Uri uri, android.content.DialogInterface.OnShowListener onshowlistener, android.content.DialogInterface.OnCancelListener oncancellistener, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        uri = a(uri, false, ((String) (null)), false);
        uri.a(onshowlistener);
        uri.a(oncancellistener);
        uri.a(ondismisslistener);
        a(fragmentactivity, ((bg) (uri)));
        return uri;
    }

    public static bg a(FragmentActivity fragmentactivity, Uri uri, boolean flag, String s1)
    {
        uri = a(uri, flag, s1, false);
        a(fragmentactivity, ((bg) (uri)));
        return uri;
    }

    public static bg a(FragmentActivity fragmentactivity, Uri uri, boolean flag, boolean flag1)
    {
        uri = a(uri, flag, ((String) (null)), flag1);
        a(fragmentactivity, ((bg) (uri)));
        return uri;
    }

    private static void a(FragmentActivity fragmentactivity, bg bg1)
    {
        if (!(fragmentactivity.f().a("WebViewDialogFragment") instanceof bg))
        {
            bg1.show(fragmentactivity.f(), "WebViewDialogFragment");
        }
    }

    static Handler b(bg bg1)
    {
        return bg1.f;
    }

    protected String a(String s1)
    {
        return b(s1);
    }

    public void a(android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        d = oncancellistener;
    }

    public void a(android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        e = ondismisslistener;
    }

    public void a(android.content.DialogInterface.OnShowListener onshowlistener)
    {
        c = onshowlistener;
    }

    protected String b(String s1)
    {
        String s3 = s.b(b.a.h(), 0x7f070006);
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "#";
        }
        s1 = s3;
        if (s3.indexOf("$__reload_url__$") != -1)
        {
            s1 = s3.replace("$__reload_url__$", s2);
        }
        return s1;
    }

    public void dismiss()
    {
        super.dismiss();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        if (d != null)
        {
            d.onCancel(dialoginterface);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        boolean flag = getArguments().getBoolean("ARG_WHITE_THEME", false);
        b = getArguments().getBoolean("ARG_DISMISS_ON_OUTSIDE_WEBVIEW_TOUCH", false);
        int i;
        if (flag)
        {
            i = 0x7f0d0091;
        } else
        {
            i = 0x7f0d0090;
        }
        setStyle(2, i);
        if (getArguments().getParcelable("ARG_URL") == null)
        {
            throw new IllegalArgumentException("URL is required");
        } else
        {
            setRetainInstance(true);
            return;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.setOnShowListener(this);
        android.view.WindowManager.LayoutParams layoutparams = bundle.getWindow().getAttributes();
        layoutparams.width = -1;
        layoutparams.height = -1;
        layoutparams.gravity = 17;
        bundle.getWindow().setAttributes(layoutparams);
        return bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400bf, viewgroup, false);
        layoutinflater.setOnTouchListener(this);
        a = (WebView)layoutinflater.findViewById(0x7f1001a2);
        a.getSettings().setAppCacheMaxSize(0x500000L);
        a.getSettings().setAppCachePath(getActivity().getApplicationContext().getCacheDir().getAbsolutePath());
        a.getSettings().setAllowFileAccess(true);
        a.getSettings().setAppCacheEnabled(true);
        a.getSettings().setCacheMode(-1);
        s.a(a, false);
        if (!b.a.b().u().b())
        {
            a.getSettings().setCacheMode(1);
        }
        int i = layoutinflater.getContext().getResources().getColor(0x106000d);
        a.setBackgroundColor(i);
        a.getSettings().setUseWideViewPort(true);
        viewgroup = new d(getActivity(), a, i) {

            final int a;
            final bg b;

            protected void b()
            {
                b.dismiss();
            }

            protected void c()
            {
                b.dismiss();
            }

            public void onPageFinished(WebView webview, String s1)
            {
                super.onPageFinished(webview, s1);
                p.ca.bg.b(b).removeCallbacks(bg.a(b));
                if (b.getView() != null)
                {
                    webview.setBackgroundColor(a);
                    b.getView().findViewById(0x7f100300).setVisibility(8);
                }
            }

            public void onReceivedError(WebView webview, int j, String s1, String s2)
            {
                super.onReceivedError(webview, j, s1, s2);
                webview.loadDataWithBaseURL(null, b.a(s2), "text/html", "utf-8", null);
            }

            
            {
                b = bg.this;
                a = i;
                super(activity, webview);
            }
        };
        viewgroup.b(false);
        a.setWebViewClient(viewgroup);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        if (getArguments() != null && "auto_share_confirm_dialog_shown".equals(getArguments().getString("intent_extra_key")))
        {
            b.a.b().j().b(true);
        }
        if (getDialog() != null && getRetainInstance())
        {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
        f.removeCallbacks(g);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (e != null)
        {
            e.onDismiss(dialoginterface);
        }
    }

    public void onShow(DialogInterface dialoginterface)
    {
        if (c != null)
        {
            c.onShow(dialoginterface);
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        view = new Rect();
        a.getHitRect(view);
        int i = Math.round(motionevent.getX());
        int j = Math.round(motionevent.getY());
        boolean flag;
        if (a != null && view.contains(i, j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !b)
        {
            dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = p.cp.b.g(getArguments().getParcelable("ARG_URL").toString());
        ((WebView)view.findViewById(0x7f1001a2)).loadUrl(bundle);
        f.postDelayed(g, 1000L);
    }
}
