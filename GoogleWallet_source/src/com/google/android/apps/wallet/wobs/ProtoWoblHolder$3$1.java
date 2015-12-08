// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
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
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.common.base.Strings;
import com.google.wallet.wobl.renderer.android.OnActionHandler;
import com.google.wallet.wobl.renderer.android.RendererClient;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            ProtoWoblHolder

final class val.uri
    implements Callable
{

    final call this$1;
    final URI val$uri;

    private com.google.wallet.proto.api.rmWobsActionResponse call()
        throws Exception
    {
        return ProtoWoblHolder.access$300(_fld0).performWobsAction(val$uri.toString());
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    l.rendererClient()
    {
        this$1 = final_rendererclient;
        val$uri = URI.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/wobs/ProtoWoblHolder$3

/* anonymous class */
    final class ProtoWoblHolder._cls3
        implements OnActionHandler
    {

        final ProtoWoblHolder this$0;
        final RendererClient val$rendererClient;

        private void onAction(URI uri1, final View view)
        {
            ProtoWoblHolder.access$000(ProtoWoblHolder.this, view);
            final String actionName = ProtoWoblHolder.access$100().matcher(uri1.toString());
            if (actionName.find())
            {
                actionName = actionName.group(0);
            } else
            {
                actionName = null;
            }
            if (!Strings.isNullOrEmpty(actionName) && CsiConfig.WOBL_REMOTE_ACTION_MAP.containsKey(actionName))
            {
                ProtoWoblHolder.access$200(ProtoWoblHolder.this).startTiming(null, (String)CsiConfig.WOBL_REMOTE_ACTION_MAP.get(actionName));
            }
            ProtoWoblHolder.access$700(ProtoWoblHolder.this).executeAction(uri1. new ProtoWoblHolder._cls3._cls1(), new ProtoWoblHolder._cls3._cls2());
        }

        public final volatile void onAction(Object obj, View view)
        {
            onAction((URI)obj, view);
        }

            
            {
                this$0 = final_protowoblholder;
                rendererClient = RendererClient.this;
                super();
            }

        // Unreferenced inner class com/google/android/apps/wallet/wobs/ProtoWoblHolder$3$2

/* anonymous class */
        final class ProtoWoblHolder._cls3._cls2
            implements AsyncCallback
        {

            final ProtoWoblHolder._cls3 this$1;
            final String val$actionName;
            final View val$view;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse performwobsactionresponse)
            {
                ProtoWoblHolder.access$400(this$0, view);
                if (!Strings.isNullOrEmpty(actionName) && CsiConfig.WOBL_REMOTE_ACTION_MAP.containsKey(actionName))
                {
                    ProtoWoblHolder.access$200(this$0).endTiming(null, (String)CsiConfig.WOBL_REMOTE_ACTION_MAP.get(actionName));
                }
                if (performwobsactionresponse.callError == null) goto _L2; else goto _L1
_L1:
                CallErrorDialogs.createBuilderWithGenericTitle(performwobsactionresponse.callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(((FragmentActivity)ProtoWoblHolder.access$500(this$0)).getSupportFragmentManager());
_L4:
                return;
_L2:
                String s = performwobsactionresponse.toastMessage;
                if (!Strings.isNullOrEmpty(s))
                {
                    Toasts.show(ProtoWoblHolder.access$500(this$0), s);
                }
                if (Strings.isNullOrEmpty(performwobsactionresponse.redirectUri)) goto _L4; else goto _L3
_L3:
                Intent intent;
                ResolveInfo resolveinfo;
                try
                {
                    intent = rendererClient.createIntentFromUri(new URI(performwobsactionresponse.redirectUri));
                    intent.setFlags(0x20000000);
                    resolveinfo = ProtoWoblHolder.access$500(this$0).getPackageManager().resolveActivity(intent, 0x10000);
                }
                catch (URISyntaxException urisyntaxexception)
                {
                    WLog.efmt(ProtoWoblHolder.access$600(), "Invalid redirect uri: %s", new Object[] {
                        performwobsactionresponse.redirectUri
                    });
                    return;
                }
                if (resolveinfo == null)
                {
                    break MISSING_BLOCK_LABEL_241;
                }
                if (resolveinfo.activityInfo != null)
                {
                    ProtoWoblHolder.access$500(this$0).startActivity(intent);
                    return;
                }
                WLog.efmt(ProtoWoblHolder.access$600(), "Unable to find redirect activity for uri: %s", new Object[] {
                    performwobsactionresponse.redirectUri
                });
                return;
            }

            public final void onFailure(Exception exception)
            {
                ProtoWoblHolder.access$400(this$0, view);
                AlertDialogFragment.newBuilder().setMessage(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_okay).build().show(((FragmentActivity)ProtoWoblHolder.access$500(this$0)).getSupportFragmentManager());
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse)obj);
            }

                    
                    {
                        this$1 = ProtoWoblHolder._cls3.this;
                        view = view1;
                        actionName = s;
                        super();
                    }
        }

    }

}
