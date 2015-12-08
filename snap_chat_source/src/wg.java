// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.discover.model.DSnapPanel;
import com.snapchat.android.discover.ui.DSnapView;
import com.squareup.otto.Bus;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class wg extends wd
{
    public static final class a
        implements wE.a
    {

        private final DSnapPage a;
        private final Bus b;
        private final Context c;
        private final DSnapView d;

        public final boolean a(String s)
        {
            Timber.c("WebViewBridgeHandler", "Play remote video: %s", new Object[] {
                s
            });
            b.a(new Nr(s, a.a));
            return true;
        }

        public final boolean b(String s)
        {
            Timber.c("WebViewBridgeHandler", "Launch app store: %s", new Object[] {
                s
            });
            Uri uri = Uri.parse(String.format("market://details?id=%s", new Object[] {
                s
            }));
            Object obj = d;
            String s1 = uri.toString();
            if (((DSnapView) (obj)).h == null)
            {
                Timber.e("DSnapView", "onAppStoreLink called when DSnap is null", new Object[0]);
            } else
            {
                DiscoverUsageAnalytics discoverusageanalytics = ((DSnapView) (obj)).r;
                String s2 = ((DSnapView) (obj)).h.j;
                String s3 = ((DSnapView) (obj)).h.i;
                String s4 = ((DSnapView) (obj)).h.d;
                com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = ((DSnapView) (obj)).b.b();
                int i = ((DSnapView) (obj)).h.h.intValue();
                int j = ((DSnapView) (obj)).p.d(((DSnapView) (obj)).h.i);
                int k = ((DSnapView) (obj)).h.g;
                int l = ((DSnapView) (obj)).p.e(((DSnapView) (obj)).h.i);
                obj = ((DSnapView) (obj)).g.c.getSourceType();
                gC gc = new gC();
                gc.userAdId = DiscoverUsageAnalytics.a(info);
                gc.publisherId = s2;
                gc.editionId = s3;
                gc.adsnapId = s4;
                gc.source = ((jQ) (obj));
                gc.adProductId = s;
                gc.destinationUrl = s1;
                boolean flag;
                if (j < 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    gc.snapIndexCount = Long.valueOf(j);
                    gc.snapIndexPos = Long.valueOf(i + 1);
                    gc.adIndexPos = Long.valueOf(k);
                    gc.adIndexCount = Long.valueOf(l);
                }
                discoverusageanalytics.a.a(gc);
            }
            s = new Intent("android.intent.action.VIEW");
            s.setData(uri);
            c.startActivity(s);
            return true;
        }

        public a(Context context, Bus bus, DSnapPage dsnappage, DSnapView dsnapview)
        {
            c = context;
            b = bus;
            a = dsnappage;
            d = dsnapview;
        }
    }


    private final Context a;
    private final wl b;
    private final Bus c;

    public wg(Context context)
    {
        wl wl1 = new wl(context);
        new wH();
        this(context, wl1, Mf.a());
    }

    private wg(Context context, wl wl1, Bus bus)
    {
        a = context;
        b = wl1;
        c = bus;
    }

    public final AA a(View view, vv vv, List list)
    {
        list = null;
        if (view != null)
        {
            view = JC.a(view, null);
            list = new Be.a();
            list.mShouldHideSystemUi = true;
            list = list.a();
            wH.a(vv, 0, 0, view.getWidth(), view.getHeight());
            Bc.a a1 = (Bc.a)(new Bc.a()).a(com.snapchat.android.model.Mediabryo.SnapType.DISCOVER);
            a1.mShouldEnableVisualFilters = false;
            a1 = (Bc.a)a1;
            a1.mShouldEnableVideoSpeedFilters = false;
            a1 = (Bc.a)a1;
            a1.mRawImageBitmap = view;
            a1 = (Bc.a)a1;
            a1.mWidth = view.getWidth();
            a1 = (Bc.a)a1;
            a1.mHeight = view.getHeight();
            view = (Bc.a)a1;
            view.mPreviewConfiguration = list;
            view = (Bc.a)view;
            view.mMediaExtras = vv;
            list = ((Bc.a)view).c();
        }
        return list;
    }

    public final View a()
    {
        return b.a;
    }

    public final com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus a(long l)
    {
        return com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus.COMPLETED;
    }

    public final void a(DSnapPage dsnappage, DSnapPanel dsnappanel)
    {
    }

    public final boolean a(DSnapView dsnapview, DSnapPage dsnappage, DSnapPanel dsnappanel)
    {
        wl wl1 = b;
        String s1 = dsnappage.a;
        String s = dsnappage.c;
        dsnappanel = dsnappanel.a;
        Object obj = wl1.a.getSettings();
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        ((WebSettings) (obj)).setBlockNetworkLoads(true);
        ((WebSettings) (obj)).setSaveFormData(false);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            ((WebSettings) (obj)).setAllowFileAccessFromFileURLs(false);
            ((WebSettings) (obj)).setAllowUniversalAccessFromFileURLs(false);
        }
        s1 = String.format("http://%s.com/%s/", new Object[] {
            UUID.randomUUID().toString(), s1
        });
        obj = wl1.b;
        obj.c = (wF.a)dv.a(wl1.d);
        obj.a = Uri.parse((String)dv.a(s1));
        obj.b = Uri.parse((String)dv.a(s));
        dv.a(IP.c(((wF) (obj)).b.getScheme(), "file"));
        dv.a(IP.c(((wF) (obj)).a.getScheme(), "http"));
        dsnappanel = (new StringBuilder()).append(s1).append(dsnappanel).toString();
        Timber.c("DiscoverWebView", (new StringBuilder("Loading: ")).append(dsnappanel).toString(), new Object[0]);
        wl1.a.loadUrl(dsnappanel);
        dsnappanel = b;
        dsnapview = new a(a, c, dsnappage, dsnapview);
        ((wl) (dsnappanel)).c.a.add(dsnapview);
        b.a.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            public final boolean onLongClick(View view)
            {
                return true;
            }

        });
        return true;
    }

    public final void d()
    {
        b.c.a.clear();
    }

    public final com.snapchat.android.discover.model.DSnapPanel.MediaType h()
    {
        return com.snapchat.android.discover.model.DSnapPanel.MediaType.LOCAL_WEBPAGE;
    }
}
