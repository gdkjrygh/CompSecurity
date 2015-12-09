// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.IOException;
import java.io.InputStream;

public class MapWebView extends WebView
{

    private MapWebViewCallbacks activityListener;

    public MapWebView(Context context)
    {
        super(context);
        initializeMapView(context);
    }

    public MapWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        initializeMapView(context);
    }

    public MapWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        initializeMapView(context);
    }

    private void initializeMapView(Context context)
    {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setCacheMode(1);
        addJavascriptInterface(new JavaScriptInterface(), "android");
        try
        {
            loadDataWithBaseURL("file:///android_asset/", readMapHTML(context), "text/html", "utf-8", null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    private String readMapHTML(Context context)
    {
        context = context.getAssets().open("mapcontrols.html");
        byte abyte0[] = new byte[context.available()];
        context.read(abyte0);
        context.close();
        return new String(abyte0);
    }

    public void addLocationAndCenter(String s)
    {
        loadUrl((new StringBuilder("javascript:place_marker('")).append(s.replace("\n", " ")).append("')").toString());
    }

    public void addLocationAndCenterWithoutUI(String s)
    {
        loadUrl((new StringBuilder("javascript:place_marker_withoutUI('")).append(s.replace("\n", " ")).append("')").toString());
    }

    public void setMapViewListener(MapWebViewCallbacks mapwebviewcallbacks)
    {
        activityListener = mapwebviewcallbacks;
    }


    private class JavaScriptInterface
    {

        final MapWebView this$0;

        public void mapInitialized()
        {
            if (activityListener != null)
            {
                activityListener.mapFinishedLoading();
            }
        }

        public void markerSet()
        {
            if (activityListener != null)
            {
                activityListener.mapMarkerSet();
            }
        }

        public JavaScriptInterface()
        {
            this$0 = MapWebView.this;
            super();
        }

        private class MapWebViewCallbacks
        {

            public abstract void mapFinishedLoading();

            public abstract void mapMarkerSet();
        }

    }

}
