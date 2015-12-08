// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.accuweather.android.models.FragmentPayload;
import com.accuweather.android.models.news.NewsModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Utilities;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.accuweather.android.fragments:
//            WeatherFragment

public class NewsDetailsFragment extends WeatherFragment
{
    private class NewsWebViewClient extends WebViewClient
    {

        final NewsDetailsFragment this$0;

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            try
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                startActivity(webview);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview) { }
            return true;
        }

        private NewsWebViewClient()
        {
            this$0 = NewsDetailsFragment.this;
            super();
        }

    }


    private static final String CONTENT = "content";
    private static final String ENCODING_UTF8 = "utf-8";
    private static final String HTML_MIME_TYPE = "text/html";
    private static final Pattern youTubeVideoPattern = Pattern.compile("www.youtube.com/embed/[a-zA-Z0-9]*");
    private NewsModel mNews;

    public NewsDetailsFragment()
    {
    }

    private String getNewsReplacementHtmlForYouTube(String s)
    {
        Object obj = youTubeVideoPattern.matcher(s);
        String s1 = s;
        if (((Matcher) (obj)).find())
        {
            obj = ((Matcher) (obj)).group().replace("www.youtube.com/embed/", "");
            s1 = (new StringBuilder()).append("http://www.youtube.com/embed/").append(((String) (obj))).toString();
            obj = (new StringBuilder()).append("http://img.youtube.com/vi/").append(((String) (obj))).append("/0.jpg").toString();
            s1 = s.replaceFirst("<iframe.*</iframe>", (new StringBuilder()).append("<a href=\"").append(s1).append("\">").append("<img width=\"").append(500).append("\" height=\"").append(400).append("\" src=\"").append("file:///android_res/drawable/play_overlay_news.png").append("\" border=\"0\" ").append("style=\"background: URL(").append(((String) (obj))).append(") center center no-repeat black;\" />").append("</a>").append("<br /><br />").toString());
        }
        return s1;
    }

    public static NewsDetailsFragment newInstance(NewsModel newsmodel)
    {
        NewsDetailsFragment newsdetailsfragment = new NewsDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", newsmodel);
        newsdetailsfragment.setArguments(bundle);
        return newsdetailsfragment;
    }

    private void updateWebViewSettings(WebView webview)
    {
        webview = webview.getSettings();
        webview.setDefaultTextEncodingName("utf-8");
        webview.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
    }

    public void init()
    {
        if (mNews == null)
        {
            return;
        } else
        {
            updateView();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        init();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getArguments() != null)
        {
            bundle = (NewsModel)getArguments().getSerializable("content");
        } else
        {
            bundle = null;
        }
        mNews = bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.accuweather.android.R.layout.news_details, null);
    }

    public void onReceive(Intent intent)
    {
        if (intent.getAction().equals("accuwx.intent.action.UPDATE_FRAGMENT"))
        {
            intent = ((Intent) (intent.getExtras().get("fragment_payload")));
            if (intent instanceof FragmentPayload)
            {
                intent = ((FragmentPayload)intent).getLocationKey();
                if (intent != null)
                {
                    intent = getData().getWeatherDataModelFromCode(intent);
                    if (intent != null)
                    {
                        mWeatherDataModel = intent;
                        updateView();
                    }
                }
            }
        }
    }

    public void updateView()
    {
        if (!isInitialized())
        {
            return;
        } else
        {
            Utilities.setTextColor(getView(), -1);
            Utilities.setTypeFace(getView(), Data.getDefaultTypeface());
            WebView webview = (WebView)getView().findViewById(com.accuweather.android.R.id.news_webview);
            updateWebViewSettings(webview);
            webview.setWebViewClient(new NewsWebViewClient());
            webview.loadDataWithBaseURL("file:///android_res/drawable/", getNewsReplacementHtmlForYouTube(mNews.getDescription()), "text/html", "utf-8", null);
            return;
        }
    }

}
