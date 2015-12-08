// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Base64;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.create.adapter.PinMarkletAdapter;
import com.pinterest.activity.create.dialog.SuspiciousSiteDialog;
import com.pinterest.activity.create.model.PinnableImage;
import com.pinterest.activity.create.model.PinnableImageFeed;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.SiteApi;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.fragment.PinterestGridFragment;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.notify.DialogTitleView;
import com.pinterest.ui.webview.PWebView;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            CreatePinFragment

public class PinMarkletFragment extends PinterestGridFragment
    implements android.widget.AdapterView.OnItemClickListener, com.pinterest.ui.grid.PinterestGridView.OnStateSetListener
{

    private static int JS_TIMEOUT_MS = 0;
    private static final String PINMARKLET_JS = "pinmarklet.js";
    DialogTitleView _headerVw;
    private Boolean _isWebPageClean;
    private boolean _pinAnother;
    private boolean _pinMarkletLoaded;
    private String _sourceUrl;
    private boolean _webPageLoaded;
    PWebView _webview;
    ApiResponseHandler checkUrlResponse;
    private WebChromeClient pinitWebChrome;
    private WebViewClient pinitWebClient;

    public PinMarkletFragment()
    {
        pinitWebClient = new _cls2();
        pinitWebChrome = new _cls3();
        checkUrlResponse = new _cls5(false);
    }

    private String getDomainName(String s)
    {
        if (s == null)
        {
            s = "";
        } else
        {
            String s1 = Uri.parse(s).getHost();
            s = s1;
            if (s1.startsWith("www."))
            {
                return s1.substring(4);
            }
        }
        return s;
    }

    private void initWebView()
    {
        _webview.getSettings().setJavaScriptEnabled(true);
        _webview.getSettings().setCacheMode(-1);
        _webview.getSettings().setDomStorageEnabled(true);
        _webview.addJavascriptInterface(new JavaScriptInterface(), "JavaScriptInterface");
        _webview.setWebViewClient(pinitWebClient);
        _webview.setWebChromeClient(pinitWebChrome);
        _webview.loadUrl(_sourceUrl);
        SiteApi.f(_sourceUrl, checkUrlResponse, getApiTag());
    }

    private void injectScriptFile(String s)
    {
        try
        {
            s = getContext().getAssets().open(s);
            byte abyte0[] = new byte[s.available()];
            s.read(abyte0);
            s.close();
            s = Base64.encodeToString(abyte0, 2);
            _webview.loadUrl((new StringBuilder("javascript:(function(w, d) {var s = d.createElement('SCRIPT');s.type = 'text/javascript';s.charset = 'UTF-8';s.innerHTML = w.atob('")).append(s).append("');d.getElementsByTagName('HEAD')[0].appendChild(s)}(window, document))").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            PLog.error("Error while injecting PinMarklet", new Object[0]);
        }
    }

    private void loadPinMarklet()
    {
        if (_webPageLoaded == Boolean.TRUE.booleanValue() && _isWebPageClean == Boolean.TRUE && _webview != null)
        {
            injectScriptFile("pinmarklet.js");
            _webview.postDelayed(new _cls4(), JS_TIMEOUT_MS);
        }
    }

    public static PinMarkletFragment newInstance(String s)
    {
        PinMarkletFragment pinmarkletfragment = new PinMarkletFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_URL", s);
        pinmarkletfragment.setArguments(bundle);
        return pinmarkletfragment;
    }

    private void onFailure(int i)
    {
        _pinMarkletLoaded = true;
        if (isAdded())
        {
            Application.showToast(i);
            getActivity().finish();
        }
    }

    private void showBlockDialog()
    {
        if (isAdded())
        {
            Events.post(new DialogEvent(new SuspiciousSiteDialog()));
        }
    }

    protected void loadData()
    {
        initWebView();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300f3;
        _menuId = -1;
        _adapter = new PinMarkletAdapter();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (PinnableImage)_adapter.getItem(i);
        if (adapterview != null && isAdded() && !adapterview.isPinned())
        {
            view = (BaseActivity)getActivity();
            CreatePinFragment createpinfragment = new CreatePinFragment();
            createpinfragment.setPinnableImage(adapterview);
            FragmentHelper.replaceFragment(view, createpinfragment, true);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.pinterest.EXTRA_URL", _sourceUrl);
    }

    public void onSet(com.pinterest.ui.grid.PinterestGridView.State state)
    {
        int i = 0;
        if (state == com.pinterest.ui.grid.PinterestGridView.State.LOADING)
        {
            _headerVw.titleTv.setText(Resources.string(0x7f070343, new Object[] {
                getDomainName(_sourceUrl)
            }));
        } else
        if (_pinAnother)
        {
            _headerVw.titleTv.setText(0x7f0706f2);
        } else
        {
            _headerVw.titleTv.setText(0x7f0701b2);
        }
        state = _headerVw.dismissBt;
        if (!_pinAnother)
        {
            i = 8;
        }
        state.setVisibility(i);
    }

    public void onSuccess(PinnableImageFeed pinnableimagefeed)
    {
        _pinMarkletLoaded = true;
        if (_gridVw != null)
        {
            _gridVw.setDataSource(pinnableimagefeed);
            onDataSourceChanged(false);
            _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADED);
        }
        if (_adapter != null)
        {
            _adapter.setLoading(false);
        }
        setEmptyContent(_adapter);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        Bundle bundle1 = getArguments();
        if (bundle1 == null || bundle1.getString("com.pinterest.EXTRA_URL") == null) goto _L2; else goto _L1
_L1:
        _sourceUrl = bundle1.getString("com.pinterest.EXTRA_URL");
_L6:
        super.onViewCreated(view, bundle);
        _gridVw.setOnItemClickListener(this);
        _gridVw.setOnStateSetListener(this);
        _headerVw.dismissBt.setOnClickListener(new _cls1());
        updateEmptyContent();
_L4:
        return;
_L2:
        if (bundle != null && bundle.getString("com.pinterest.EXTRA_URL") != null)
        {
            _sourceUrl = bundle.getString("com.pinterest.EXTRA_URL");
            continue; /* Loop/switch isn't completed */
        }
        PLog.wtf(new IllegalArgumentException(), "source url is not provided.", new Object[0]);
        view = getActivity();
        if (view == null) goto _L4; else goto _L3
_L3:
        view.finish();
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean setPinAnother()
    {
        if (_adapter != null && _adapter.getDataSource() != null && _adapter.getDataSource().getAbsCount() >= 2 && Experiments.V())
        {
            _pinAnother = true;
            return true;
        } else
        {
            return false;
        }
    }

    protected void updateEmptyContent()
    {
        _emptyCenterImage = 0x7f0201eb;
        _emptyMessage = Resources.string(0x7f07040c);
    }

    static 
    {
        JS_TIMEOUT_MS = 10000;
    }



/*
    static boolean access$102(PinMarkletFragment pinmarkletfragment, boolean flag)
    {
        pinmarkletfragment._webPageLoaded = flag;
        return flag;
    }

*/




/*
    static boolean access$302(PinMarkletFragment pinmarkletfragment, boolean flag)
    {
        pinmarkletfragment._pinMarkletLoaded = flag;
        return flag;
    }

*/




/*
    static Boolean access$602(PinMarkletFragment pinmarkletfragment, Boolean boolean1)
    {
        pinmarkletfragment._isWebPageClean = boolean1;
        return boolean1;
    }

*/


    private class _cls2 extends WebViewClient
    {

        private boolean receivedError;
        final PinMarkletFragment this$0;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            PLog.log("#onPageFinished", new Object[0]);
            if (!receivedError)
            {
                _webPageLoaded = Boolean.TRUE.booleanValue();
                loadPinMarklet();
            }
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            receivedError = true;
            onFailure(0x7f07040b);
        }

        _cls2()
        {
            this$0 = PinMarkletFragment.this;
            super();
            receivedError = false;
        }
    }



    private class _cls5 extends ApiResponseHandler
    {

        final PinMarkletFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            onSuccess(apiresponse);
            PLog.info((new StringBuilder("checkUrlResponse: ")).append(apiresponse).toString(), new Object[0]);
            if (getView() != null && getActivity() != null)
            {
                apiresponse = ((PinterestJsonObject)apiresponse.getData()).a("action", "");
                if ("ALLOW".equals(apiresponse))
                {
                    _isWebPageClean = Boolean.TRUE;
                    loadPinMarklet();
                } else
                if ("BLOCK".equals(apiresponse) || "WARN".equals(apiresponse))
                {
                    _isWebPageClean = Boolean.FALSE;
                    showBlockDialog();
                    return;
                }
            }
        }

        _cls5(boolean flag)
        {
            this$0 = PinMarkletFragment.this;
            super(flag);
        }
    }


    private class JavaScriptInterface
    {

        final PinMarkletFragment this$0;

        public void onPinsLoaded(String s)
        {
            FragmentActivity fragmentactivity;
            fragmentactivity = getActivity();
            if (fragmentactivity == null || !StringUtils.isNotEmpty(s))
            {
                break MISSING_BLOCK_LABEL_51;
            }
            class _cls1
                implements Runnable
            {

                final JavaScriptInterface this$1;
                final PinnableImageFeed val$feed;

                public void run()
                {
                    onSuccess(feed);
                }

                _cls1()
                {
                    this$1 = JavaScriptInterface.this;
                    feed = pinnableimagefeed;
                    super();
                }
            }

            fragmentactivity.runOnUiThread(new _cls1());
            return;
            s;
            CrashReporting.a(s);
            class _cls2
                implements Runnable
            {

                final JavaScriptInterface this$1;

                public void run()
                {
                    onFailure(0x7f070287);
                }

                _cls2()
                {
                    this$1 = JavaScriptInterface.this;
                    super();
                }
            }

            fragmentactivity.runOnUiThread(new _cls2());
            return;
        }

        JavaScriptInterface()
        {
            this$0 = PinMarkletFragment.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final PinMarkletFragment this$0;

        public void run()
        {
            if (!_pinMarkletLoaded)
            {
                onFailure(0x7f070287);
            }
        }

        _cls4()
        {
            this$0 = PinMarkletFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinMarkletFragment this$0;

        public void onClick(View view)
        {
            view = getActivity();
            if (view != null)
            {
                view.finish();
            }
        }

        _cls1()
        {
            this$0 = PinMarkletFragment.this;
            super();
        }
    }

}
