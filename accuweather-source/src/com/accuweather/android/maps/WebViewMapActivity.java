// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.utilities.DateUtils;

// Referenced classes of package com.accuweather.android.maps:
//            AbsMapActivity, MapUrlBuilder

public class WebViewMapActivity extends AbsMapActivity
{

    private WebView mFullScreenWebView;

    public WebViewMapActivity()
    {
    }

    private String buildMapUrl(WeatherDataModel weatherdatamodel)
    {
        return (new MapUrlBuilder()).lat(weatherdatamodel.getLatitude()).lon(weatherdatamodel.getLongitude()).showZoomControl(true).overlayType(getOverlayTypeToDisplay(weatherdatamodel)).gmtOffset(DateUtils.getHourPortionOfGmtOffset(weatherdatamodel.getGmtOffset())).locale(getResources().getConfiguration().locale).buildMapUrl();
    }

    private void loadJavascript(String s)
    {
        mFullScreenWebView.loadUrl((new StringBuilder()).append("javascript:").append(s).toString());
    }

    protected void displayLayerExclusively(String s)
    {
        loadJavascript((new StringBuilder()).append("mpDisplayExclusiveLayer('").append(s).append("');").toString());
    }

    protected void init()
    {
        super.init();
        findViewById(com.accuweather.android.R.id.load_progressbar).setVisibility(0);
        ViewStub viewstub = (ViewStub)findViewById(com.accuweather.android.R.id.map_fullscreen_wv);
        if (viewstub != null)
        {
            mFullScreenWebView = (WebView)viewstub.inflate();
        }
        mFullScreenWebView.getSettings().setJavaScriptEnabled(true);
        mFullScreenWebView.getSettings().setCacheMode(2);
        mFullScreenWebView.setWebChromeClient(mWebChromeClient);
        mFullScreenWebView.loadUrl(buildMapUrl(mWeatherDataModel));
    }

    public void onMapLoadComplete()
    {
        super.onMapLoadComplete();
        findViewById(com.accuweather.android.R.id.load_progressbar).setVisibility(4);
        mFullScreenWebView.setVisibility(0);
    }

    protected void playOverlayAnimation()
    {
        loadJavascript("mpAnimate(true);");
        setPauseIcon();
    }

    protected void stopOverlayAnimation()
    {
        loadJavascript("mpAnimate(false);");
        setPlayIcon();
    }
}
