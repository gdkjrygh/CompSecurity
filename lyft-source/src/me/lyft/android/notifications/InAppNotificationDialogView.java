// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.notifications;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.events.GeneralErrorDialogResultEvent;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.utils.WebBrowser;

public class InAppNotificationDialogView extends DialogContainerView
{

    ImageView cancelButton;
    IConstantsProvider constantsProvider;
    DeepLinkManager deepLinkManager;
    DialogFlow dialogFlow;
    InAppNotificationService inAppNotificationService;
    private final String targetUrl;
    WebView webView;

    public InAppNotificationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        targetUrl = ((me.lyft.android.ui.Dialogs.InAppNotificationDialog)context.a()).getTargetUrl();
    }

    private boolean isWhiteListed(String s)
    {
        for (Iterator iterator = constantsProvider.getConstants().getWhitelistedUrls().iterator(); iterator.hasNext();)
        {
            if (s.startsWith((String)iterator.next()))
            {
                return true;
            }
        }

        return false;
    }

    private void showErrorDialog()
    {
        Object obj = getResources().getString(0x7f070392);
        String s = getResources().getString(0x7f070391);
        obj = (new me.lyft.android.ui.Dialogs.AlertDialog("generic_error_dialog")).setDialogEventClass(me/lyft/android/events/GeneralErrorDialogResultEvent).setTitle(((String) (obj))).addPositiveButton(getResources().getString(0x7f070212)).setMessage(s);
        dialogFlow.show(((com.lyft.scoop.Screen) (obj)));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        final AsyncActionAnalytics analytics = new AsyncActionAnalytics(ActionName.SHOW_IN_APP_NOTIFICATION, Category.NOTIFICATION);
        analytics.trackRequest();
        if (!isWhiteListed(targetUrl))
        {
            analytics.trackResponseFailure(String.format("white listed: %s", new Object[] {
                targetUrl
            }));
            dialogFlow.dismiss();
            return;
        }
        if (!dialogFlow.hasActiveDialog())
        {
            analytics.trackResponseFailure("has_active_dialog");
            dialogFlow.dismiss();
        }
        WebSettings websettings = webView.getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setCacheMode(1);
        websettings.setDefaultTextEncodingName("utf-8");
        webView.setBackgroundColor(getResources().getColor(0x7f0c00a5));
        webView.setWebViewClient(new WebViewClient() {

            final InAppNotificationDialogView this$0;
            final AsyncActionAnalytics val$analytics;

            public void onPageFinished(WebView webview, String s)
            {
                webview = webView.getLayoutParams();
                webview.height = -2;
                webView.setLayoutParams(webview);
                webView.requestLayout();
                analytics.trackResponseSuccess(targetUrl);
            }

            public void onReceivedError(WebView webview, int i, String s, String s1)
            {
                super.onReceivedError(webview, i, s, s1);
                showErrorDialog();
                analytics.trackResponseFailure(s1);
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                dialogFlow.dismiss();
                if (s.startsWith("tel:"))
                {
                    webview = new Intent("android.intent.action.DIAL", Uri.parse(s));
                    getContext().startActivity(webview);
                    return true;
                }
                if (s.startsWith("mailto:"))
                {
                    webview = new Intent("android.intent.action.SENDTO", Uri.parse(s));
                    getContext().startActivity(webview);
                    return true;
                }
                if (s.startsWith("lyft:"))
                {
                    deepLinkManager.route(s);
                    return true;
                } else
                {
                    WebBrowser.open(getContext(), s);
                    return true;
                }
            }

            
            {
                this$0 = InAppNotificationDialogView.this;
                analytics = asyncactionanalytics;
                super();
            }
        });
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final InAppNotificationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
                inAppNotificationService.markNotificationAsShown(targetUrl);
            }

            
            {
                this$0 = InAppNotificationDialogView.this;
                super();
            }
        });
        webView.loadUrl(targetUrl);
    }

    public boolean onBack()
    {
        inAppNotificationService.markNotificationAsShown(targetUrl);
        return super.onBack();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        webView.setWebViewClient(null);
        webView.loadUrl("about:blank");
        webView.destroy();
        webView = null;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }


}
