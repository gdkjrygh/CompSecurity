// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.analytics.CsiConfig;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.wobl.WalletWoblRenderer;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import com.google.commerce.wobs.common.Entrypoint;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.wallet.wobl.exception.WoblException;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.exception.WoblParserException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.WoblParser;
import com.google.wallet.wobl.renderer.android.ActionController;
import com.google.wallet.wobl.renderer.android.AndroidRenderUtils;
import com.google.wallet.wobl.renderer.android.OnActionHandler;
import com.google.wallet.wobl.renderer.android.RendererClient;
import com.google.wallet.wobl.renderer.common.ActionProgressBar;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WoblAnalyticsLogger, ViewWoblActivity, WobsApi

public class WoblHolderImpl
    implements WoblHolder
{

    static final Pattern MUTATE_WOBL_ACTION_NAME_PATTERN = Pattern.compile("(?:.*cgw|comgooglewallet://)?/.+/remote_action\\?(?:.+&)?name=(.+)");
    static final Pattern MUTATE_WOBL_URI_PATTERN = Pattern.compile("(?:.*cgw|comgooglewallet://)?/.+/remote_action\\?(?:.+&)?name=.+");
    static final Pattern NATIVE_URI = Pattern.compile("comgooglewallet:///nativeURI\\?.+");
    private static final String TAG = com/google/android/apps/wallet/wobs/WoblHolderImpl.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final AnalyticsUtil analyticsUtil;
    private final Activity context;
    private boolean failedToRender;
    private boolean invalidCache;
    private IntermediateRepresentation parsedIr;
    private View renderedView;
    private final RendererClient rendererClient;
    protected String source;
    FullScreenProgressSpinnerManager spinnerManager;
    private final WoblAnalyticsLogger woblAnalyticsLogger;
    private final WoblParser woblParser;
    private final WalletWoblRenderer woblRenderer;
    private WobsManager wobsManager;

    public WoblHolderImpl(Activity activity, WalletWoblRenderer walletwoblrenderer, FullScreenProgressSpinnerManager fullscreenprogressspinnermanager, WoblParser woblparser, RendererClient rendererclient, ActionExecutor actionexecutor, AnalyticsUtil analyticsutil, 
            WobsManager wobsmanager)
    {
        failedToRender = false;
        context = activity;
        rendererClient = rendererclient;
        woblParser = woblparser;
        woblRenderer = walletwoblrenderer;
        spinnerManager = fullscreenprogressspinnermanager;
        actionExecutor = actionexecutor;
        woblRenderer.setRendererClient(rendererclient);
        analyticsUtil = analyticsutil;
        wobsManager = wobsmanager;
        woblAnalyticsLogger = new WoblAnalyticsLogger(analyticsutil);
        invalidCache = true;
    }

    private void hideActionProgressSpinner(View view)
    {
        if (view instanceof ActionProgressBar)
        {
            ((ActionProgressBar)view).setActionCompleted();
        } else
        if (spinnerManager != null)
        {
            spinnerManager.hide();
            return;
        }
    }

    private static IntermediateRepresentation parseIR(String s, WoblParser woblparser, AnalyticsUtil analyticsutil)
        throws WoblParserException, WoblMalformedDocException
    {
        analyticsutil.startTiming(null, "wobl_parse");
        s = woblparser.parseWobl(new StringReader(s));
        analyticsutil.endTiming(null, "wobl_parse");
        return s;
    }

    private View renderIR()
    {
        Preconditions.checkNotNull(parsedIr);
        analyticsUtil.startTiming(null, "wob_create_views");
        View view = (View)woblRenderer.render(parsedIr);
        analyticsUtil.endTiming(null, "wob_create_views");
        return view;
    }

    private void setSource(String s, URI uri, IntermediateRepresentation intermediaterepresentation)
    {
        rendererClient.setAbsoluteUri(uri);
        rendererClient.addConditionalComponentName(new Predicate() {

            final WoblHolderImpl this$0;

            private static boolean apply(Uri uri1)
            {
                return uri1 != null && Objects.equal(Entrypoint.HERE_AND_NOW.toString(), WobsApi.parseEntrypointNameFromViewWoblUri(uri1.toString()));
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((Uri)obj);
            }

            
            {
                this$0 = WoblHolderImpl.this;
                super();
            }
        }, new ComponentName(context, com/google/android/apps/wallet/wobs/ViewWoblActivity));
        rendererClient.addConditionalPackageName(new Predicate() {

            final WoblHolderImpl this$0;

            private static boolean apply(Uri uri1)
            {
                return uri1 != null && "comgooglewallet".equals(uri1.getScheme());
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((Uri)obj);
            }

            
            {
                this$0 = WoblHolderImpl.this;
                super();
            }
        }, context.getPackageName());
        source = s;
        invalidCache = true;
        failedToRender = false;
        parsedIr = intermediaterepresentation;
    }

    private void showActionProgressSpinner(View view)
    {
        if (view instanceof ActionProgressBar)
        {
            ((ActionProgressBar)view).setActionStarted();
        } else
        if (spinnerManager != null)
        {
            spinnerManager.show();
            return;
        }
    }

    public final void cancel()
    {
        actionExecutor.cancelAll();
        if (spinnerManager != null)
        {
            spinnerManager.hide();
        }
    }

    public final View getView()
        throws WoblException
    {
        if (failedToRender)
        {
            throw new WoblException("WOBL previously failed to render");
        }
        rendererClient.setAnalyticsLogger(woblAnalyticsLogger);
        analyticsUtil.startTiming(null, "wob_create_views");
        rendererClient.addActionController(new ActionController(MUTATE_WOBL_URI_PATTERN, new OnActionHandler() {

            final WoblHolderImpl this$0;

            private void onAction(URI uri, final View view)
            {
                showActionProgressSpinner(view);
                Object obj = WoblHolderImpl.MUTATE_WOBL_ACTION_NAME_PATTERN.matcher(uri.toString());
                if (((Matcher) (obj)).find())
                {
                    obj = ((Matcher) (obj)).group(0);
                } else
                {
                    obj = null;
                }
                if (!Strings.isNullOrEmpty(((String) (obj))) && CsiConfig.WOBL_REMOTE_ACTION_MAP.containsKey(obj))
                {
                    analyticsUtil.startTiming(null, (String)CsiConfig.WOBL_REMOTE_ACTION_MAP.get(obj));
                }
                actionExecutor.executeAction(uri. new Callable() {

                    final _cls3 this$1;
                    final URI val$uri;

                    private com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse call()
                        throws Exception
                    {
                        return wobsManager.performWobsAction(uri.toString());
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$1 = final__pcls3;
                uri = URI.this;
                super();
            }
                }, ((_cls2) (obj)). new AsyncCallback() {

                    final _cls3 this$1;
                    final String val$actionName;
                    final View val$view;

                    private void onSuccess(com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse performwobsactionresponse)
                    {
                        hideActionProgressSpinner(view);
                        if (!Strings.isNullOrEmpty(actionName) && CsiConfig.WOBL_REMOTE_ACTION_MAP.containsKey(actionName))
                        {
                            analyticsUtil.endTiming(null, (String)CsiConfig.WOBL_REMOTE_ACTION_MAP.get(actionName));
                        }
                        if (performwobsactionresponse.callError == null) goto _L2; else goto _L1
_L1:
                        CallErrorDialogs.createBuilderWithGenericTitle(performwobsactionresponse.callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(((FragmentActivity)context).getSupportFragmentManager());
_L4:
                        return;
_L2:
                        String s = performwobsactionresponse.toastMessage;
                        if (!Strings.isNullOrEmpty(s))
                        {
                            Toasts.show(context, s);
                        }
                        if (Strings.isNullOrEmpty(performwobsactionresponse.redirectUri)) goto _L4; else goto _L3
_L3:
                        Intent intent;
                        ResolveInfo resolveinfo;
                        try
                        {
                            intent = rendererClient.createIntentFromUri(new URI(performwobsactionresponse.redirectUri));
                            intent.setFlags(0x20000000);
                            resolveinfo = context.getPackageManager().resolveActivity(intent, 0x10000);
                        }
                        catch (URISyntaxException urisyntaxexception)
                        {
                            WLog.efmt(WoblHolderImpl.TAG, "Invalid redirect uri: %s", new Object[] {
                                performwobsactionresponse.redirectUri
                            });
                            return;
                        }
                        if (resolveinfo == null)
                        {
                            break MISSING_BLOCK_LABEL_244;
                        }
                        if (resolveinfo.activityInfo != null)
                        {
                            context.startActivity(intent);
                            return;
                        }
                        WLog.efmt(WoblHolderImpl.TAG, "Unable to find redirect activity for uri: %s", new Object[] {
                            performwobsactionresponse.redirectUri
                        });
                        return;
                    }

                    public final void onFailure(Exception exception)
                    {
                        hideActionProgressSpinner(view);
                        AlertDialogFragment.newBuilder().setMessage(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_okay).build().show(((FragmentActivity)context).getSupportFragmentManager());
                    }

                    public final volatile void onSuccess(Object obj)
                    {
                        onSuccess((com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse)obj);
                    }

            
            {
                this$1 = final__pcls3;
                view = view1;
                actionName = String.this;
                super();
            }
                });
            }

            public final volatile void onAction(Object obj, View view)
            {
                onAction((URI)obj, view);
            }

            
            {
                this$0 = WoblHolderImpl.this;
                super();
            }
        }));
        rendererClient.addActionController(new ActionController(NATIVE_URI, new OnActionHandler() {

            final WoblHolderImpl this$0;

            private void onAction(URI uri, View view)
            {
                uri = Uri.parse(uri.toString()).getQueryParameter("uri");
                try
                {
                    AndroidRenderUtils.intentToUri(view.getContext(), rendererClient, new URI(uri));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    WLog.efmt(WoblHolderImpl.TAG, view, "Invalid native uri: %s", new Object[] {
                        uri
                    });
                }
            }

            public final volatile void onAction(Object obj, View view)
            {
                onAction((URI)obj, view);
            }

            
            {
                this$0 = WoblHolderImpl.this;
                super();
            }
        }));
        try
        {
            if (renderedView == null || invalidCache)
            {
                if (parsedIr == null)
                {
                    parsedIr = parseIR(source, woblParser, analyticsUtil);
                }
                renderedView = renderIR();
                invalidCache = false;
            }
            analyticsUtil.endTiming(null, "wob_create_views");
        }
        catch (WoblException woblexception)
        {
            failedToRender = true;
            throw woblexception;
        }
        return renderedView;
    }

    public final void setSource(com.google.wallet.proto.NanoWalletWobl.Layout layout, URI uri)
    {
        setSource(layout.wobl, uri, null);
    }









}
